package cn.edu.nju.pattern.cor;

import java.util.Random;

import cn.edu.nju.pattern.handler.PriceHandler;

public class Customer {
	private PriceHandler priceHandler;
	public void requestDiscount(float discount) {
		priceHandler.processDiscount(discount);
	}
	
	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPriceHandler(PriceHandler.createPriceHandler());
		
		Random rand = new Random();
		for(int i=1; i<100; i++) {
			System.out.print(i + ":  ");
			customer.requestDiscount(rand.nextFloat());
		}
	}
}
