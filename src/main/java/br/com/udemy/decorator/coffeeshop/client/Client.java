package br.com.udemy.decorator.coffeeshop.client;

import br.com.udemy.decorator.coffeeshop.decorator.DoubleDrink;
import br.com.udemy.decorator.coffeeshop.decorator.Milk;
import br.com.udemy.decorator.coffeeshop.model.Drink;
import br.com.udemy.decorator.coffeeshop.model.Expresso;
import br.com.udemy.decorator.coffeeshop.model.Tea;

public class Client {

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());

		order("Lungo", new DoubleDrink(new Expresso()));
		order("Cafe Au Lait", new Milk(new Expresso()));
		order("English Tea", new Milk(new Tea()));
	}

	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println("- Total: " + drink.getPrice());
		System.out.println("*****************************");
	}
}
