package br.com.udemy.composite.examples.products;

import br.com.udemy.composite.examples.util.OperationsUtil;

public class ProductLeaf extends ProductComponent {
	private OperationsUtil operationsUtil = new OperationsUtil();

	public ProductLeaf(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return operationsUtil.roundValue(price);
	}

	@Override
	public String toString() {
		return "ProductLeaf [name=" + getName() + ", price=" + getPrice() + "]";
	}

}
