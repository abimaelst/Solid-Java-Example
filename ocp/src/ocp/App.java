package ocp;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Product fusca = new Car();
		
		fusca.setBasePrice(9000);
		
		System.out.println(fusca.calculateTaxIncludedPrice());
		
		Product milk = new Food();
		
		milk.setBasePrice(1.45);
		
		System.out.println(milk.calculateTaxIncludedPrice());
		
		Product diamond = new Gem();
		
		diamond.setBasePrice(15000);
		
		System.out.println(diamond.calculateTaxIncludedPrice());
		
		List<Product> products = new ArrayList<Product>();
		
		products.add(diamond);
		products.add(milk);
		
		ShoppingCartService totalOrder = new ShoppingCartService();
		
		System.out.println(totalOrder.calculateTotalOrder(products));
		
				
	
		
	}

}
