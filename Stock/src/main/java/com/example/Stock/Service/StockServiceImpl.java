	
package com.example.Stock.service;
	

	import java.util.List;
	

	import com.cts.demo.dao.StockDao;
	import com.cts.demo.dao.StockDaoImpl;
	import com.cts.demo.model.Stock;
	

	public class StockServiceImpl implements StockService{
	

		StockDao stockDao=new StockDaoImpl();
		@Override
		public List<Stock> getAllStock() {
			// TODO Auto-generated method stub
			return stockDao.getAllStock();
		}
	

		@Override
		public Stock getStockById(int id) {
			// TODO Auto-generated method stub
			return stockDao.getStockById(id);
		}
	


