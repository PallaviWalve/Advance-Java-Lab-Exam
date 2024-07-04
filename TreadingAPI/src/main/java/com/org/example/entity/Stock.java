package com.org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stockdb")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int stockId;
	
	public String companyName;
	public float currentPrice;
	public int quantity;
	
	
	public Stock() {
		
	}


	public Stock(int stockId, String companyName, float currentPrice, int quantity) {
		super();
		this.stockId = stockId;
		this.companyName = companyName;
		this.currentPrice = currentPrice;
		this.quantity = quantity;
	}


	public int getStockId() {
		return stockId;
	}


	public void setStockId(int stockId) {
		this.stockId = stockId;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public float getCurrentPrice() {
		return currentPrice;
	}


	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", companyName=" + companyName + ", currentPrice=" + currentPrice
				+ ", quantity=" + quantity + "]";
	}
	
	

}
