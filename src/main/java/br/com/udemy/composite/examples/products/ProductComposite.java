package br.com.udemy.composite.examples.products;

import java.util.ArrayList;
import java.util.List;

import br.com.udemy.composite.examples.util.OperationsUtil;

public class ProductComposite extends ProductComponent {

	private List<ProductComponent> children = new ArrayList<>();
	private OperationsUtil operationsUtil = new OperationsUtil();

	public ProductComposite() {

	}

	public ProductComposite(String name) {
		this.name = name;
	}

	@Override
	public double getPrice() {
		double soma = 0;
		for (ProductComponent prod : this.children) {
			soma += prod.getPrice();
		}
		return operationsUtil.roundValue(soma);
	}

	public void add(ProductComponent product) {
		this.children.add(product);
	}

	public boolean remove(ProductComponent product) {
		if (this.children.contains(product)) {
			this.children.remove(children.indexOf(product));
			return true;
		}
		return false;
	}

	// outra abordagem

	/*
	public boolean removeVersionTwo(ProductComponent product) {
		int indexElem = this.children.indexOf(product);
		if (indexElem != -1) {
			this.children.remove(indexElem);
			return true;
		}
		return false;
	} */

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int listSize = this.children.size();

		sb.append(this.getClass().getSimpleName() + " [ ");
		sb.append("\n");
		for (int i = 0; i < listSize - 1; i++) {
			sb.append(this.children.get(i).getClass().getSimpleName() + " ");
			sb.append("[ name = ");
			sb.append(this.children.get(i).getName()).append(", ");
			sb.append("price = " + this.children.get(i).getPrice());
			sb.append(" ]");
			sb.append("\n");
		}
		if (listSize > 0) {
			sb.append(this.children.get(listSize - 1).getClass().getSimpleName() + " ");
			sb.append("[ name = ");
			sb.append(this.children.get(listSize - 1).getName()).append(", ");
			sb.append("price = " + this.children.get(listSize - 1).getPrice());
			sb.append(" ], ");
		}
		sb.append("totalPrice = " + getPrice());
		sb.append(" ]");

		return sb.toString();
	}

}
