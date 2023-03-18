package br.com.udemy.decorator.coffeeshop.decorator;

import br.com.udemy.decorator.coffeeshop.model.Drink;

public class DoubleDrink extends DrinkDecorator {

	public DoubleDrink(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		drink.serve();
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() * 1.75;
	}

}
