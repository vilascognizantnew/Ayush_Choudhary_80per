package com.example.Stock.controller;


	

	

	

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
	

	import com.example.Stock.model.Stock;
	import com.example.Stock.service.StockService;
	import com.example.Stock.service.StockServiceImpl;
	

	@RestController
	public class StockController {
		@Autowired
		PermanentStockService StockService;
		
		public StockController() {
					
		}
		
		@GetMapping(value = "/StockList")
		public ResponseEntity<Object> StockList()
		{
			
			return new ResponseEntity<>(StockDao.getAllStock(),HttpStatus.OK);
		}
		
		@GetMapping(value = "/getProductById/id/{id}/name/{name}")
		public ResponseEntity<Object> StockList(@PathVariable("id") Integer id)
		{
			
				Stock Stock=StockDao.getStockById(id);
				if(Stock!=null) {
					
					return new ResponseEntity<>(Stock,HttpStatus.OK);	
				}
				else
				return new ResponseEntity<>("Resord Not Found",HttpStatus.OK);
					
		}
		
		
		@PostMapping(value = "/addStock")
		public ResponseEntity<Object> addStock(@RequestBody Stock Stock)
		{
			
			return new ResponseEntity<>(StockDao.addStock(Stock),HttpStatus.OK);	
		}
		
		@PutMapping(value = "/updateStock")
		public ResponseEntity<Object> updateStock(@RequestBody Stock Stock)
		{
			Stock StockTemp=StockDao.updateStock(Stock);
			if(StockTemp!=null) {
				
				return new ResponseEntity<>(StockTemp,HttpStatus.OK);	
			}
			else
			return new ResponseEntity<>("Resord Not Found",HttpStatus.OK);
		}
	

	}

