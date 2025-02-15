package com.org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.example.entity.Stock;
import com.org.example.service.stockService;

@RestController
@RequestMapping("/stock")
public class StockController {

	
	@Autowired
	private stockService stockServiceRef;
	
	@PostMapping("/create")
	public ResponseEntity<?> addStock(@RequestBody Stock stockRef)
	{
		 return stockServiceRef.addStock(stockRef);
	}
	
	@GetMapping("/read")
	public ResponseEntity<?> getStock()
	{
		return stockServiceRef.getAllStock();
	}
	
	@GetMapping("/read/{name}")
	public ResponseEntity<?> getStockByName( @PathVariable String name)
	{
		return stockServiceRef.getStockByName(name);
	}
	
	@PutMapping("/update/{id}")
	 public ResponseEntity<?> updateStock(@RequestBody Stock stockref, @PathVariable Integer id)
	 {
		 return stockServiceRef.BuyStock(stockref, id);
	 }
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStock(@PathVariable Integer id)
	{
		return stockServiceRef.SellStock(id);
	}

}
