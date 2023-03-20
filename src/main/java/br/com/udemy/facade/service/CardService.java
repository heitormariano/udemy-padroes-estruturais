package br.com.udemy.facade.service;

import java.util.HashMap;
import java.util.Map;

import br.com.udemy.facade.model.Card;

public class CardService {
	private Map<Long, Card> memory;

	public CardService() {
		memory = new HashMap<>();
		memory.put(123456L, new Card(123456L, 11223344L));
	}

	public Card getCardByUser(Long userNumber) {
		return memory.get(userNumber);
	}

	public void removeCard(Card card) {
		memory.remove(card.getUserNumber());
	}

	public Card createNewCard(Long user, Long cardNumber) {
		Card newCard = new Card(user, cardNumber);
		memory.put(user, newCard);
		System.out.println("Creating the new card: " + newCard);
		return newCard;
	}
}
