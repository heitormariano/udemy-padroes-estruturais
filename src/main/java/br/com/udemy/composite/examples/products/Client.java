package br.com.udemy.composite.examples.products;

public class Client {

	public static void main(String[] args) {
		ProductComponent pen = new ProductLeaf("Pen", 4.56);
		ProductComponent smartphone = new ProductLeaf("Smartphone", 1_000.35);
		ProductComponent tShirt = new ProductLeaf("T-shirt", 40.90);

		ProductComponent productBox01 = new ProductComposite("product Box 01");
		productBox01.add(pen);
		productBox01.add(smartphone);
		productBox01.add(tShirt);

		System.out.println(productBox01);

		ProductComponent tablet = new ProductLeaf("Tablet", 2_000.45);
		ProductComponent kindle = new ProductLeaf("Kindle", 780);

		ProductComponent productBox02 = new ProductComposite("product Box 02");
		productBox02.add(tablet);
		productBox02.add(kindle);

		System.out.println(productBox02);

		ProductComponent productBox03 = new ProductComposite("product Box 03");
		productBox03.add(productBox01);
		productBox03.add(productBox02);
		
		System.out.println(productBox03);
	}
}
