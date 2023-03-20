package br.com.udemy.flyweight.examples.editortexto;

import java.util.HashMap;
import java.util.Map;

public class CaractereFlyweight {
	private static Map<Character, CaractereFlyweight> caracteres = new HashMap<>();
	private char caracter;

	public CaractereFlyweight(char caracter) {
		this.caracter = caracter;
	}

	public static CaractereFlyweight getCaractere(char c) {
		if (!caracteres.containsKey(c)) {
			caracteres.put(c, new CaractereFlyweight(c));
		}

		return caracteres.get(c);
	}

	public void exibir(int tamanhoFonte) {
		System.out.println(caracter + " (tamanho da fonte = " + tamanhoFonte + ")");
	}
}
