package com.example.Stock.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.Stock.model.Stock;
@Repository(value="stockDao")
public class StockDaoImp implements Stockdao{

	List<Stock> stockList=new ArrayList<Stock>();
	public List<Stock> getAllStock()
	
	{
		stockList.add(new Stock(101, "Ram", 25));
		stockList.add(new Stock(102, "Joy", 30));
		stockList.add(new Stock(103, "Shyam", 28));
		stockList.add(new Stock(104, "Sita", 25));	
		return stockList;
	}
	@Override
	public Stock getStockById(int id) {
		
		for(Stock stock:stockList) {
			if(stock.getId()==id) {
				
				return stock;	
			}
		}
		
		return null;
	}
	@Override
	public Stock addStock(Stock stock) {
		stockList.add(stock);
		return stock;
	}
	@Override
	public Stock updateStock(Stock stock) {
		int index=0;
		
		for(Stock stockTemp:stockList) {
			
			if(stockTemp.getId()==stock.getId()) {
				
				
				stockList.set(index, stock);
				return stockTemp;	
			}
			index++;
		}
		
		
			
		return null;
	}

}
