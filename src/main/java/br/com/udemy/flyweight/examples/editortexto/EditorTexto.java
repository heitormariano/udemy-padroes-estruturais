package br.com.udemy.flyweight.examples.editortexto;

public class EditorTexto {

	private static final String TEXTO = "abbcbbcaaaca";

	public static void main(String[] args) {
		for (int i = 0; i < TEXTO.length(); i++) {
			char c = TEXTO.charAt(i);
			CaractereFlyweight caractere = CaractereFlyweight.getCaractere(c);
			caractere.exibir(12);
		}
	}
}
