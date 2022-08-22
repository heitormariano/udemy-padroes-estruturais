package br.com.udemy.composite.examples.products;

public abstract class ProductComponent {
	protected String name;
	protected double price;

	public abstract double getPrice();

	public String getName() {
		return name;
	}

	public void add(ProductComponent product) {
	}

	public boolean remove(ProductComponent product) {
		return false;
	}

}
