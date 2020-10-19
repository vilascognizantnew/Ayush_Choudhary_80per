package com.example.Stock.Service;


	

	import java.util.List;
	

	import com.cts.demo.model.Stock;
	

	public interface StockService {
		
		public List<Stock> getAllStock();
		public Stock getStockById(int id);
	

	}

