package br.com.udemy.decorator.coffeeshop.decorator;

import br.com.udemy.decorator.coffeeshop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;

	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}
