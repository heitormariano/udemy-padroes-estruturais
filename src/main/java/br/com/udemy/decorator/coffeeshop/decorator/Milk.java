package br.com.udemy.decorator.coffeeshop.decorator;

import br.com.udemy.decorator.coffeeshop.model.Drink;

public class Milk extends DrinkDecorator {

	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		System.out.println("- Adding 40ml of Milk");
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() + 0.5;
	}

}
