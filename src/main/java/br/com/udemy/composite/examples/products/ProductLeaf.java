package br.com.udemy.composite.examples.products;

public class ProductLeaf extends ProductComponent {

	public ProductLeaf(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "ProductLeaf [name=" + name + ", price=" + price + "]";
	}

}
