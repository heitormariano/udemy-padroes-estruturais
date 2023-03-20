package br.com.udemy.facade.client;

import br.com.udemy.facade.facade.CallCenterFacade;
import br.com.udemy.facade.model.Card;

public class Client {

	public static void main(String[] args) {
		CallCenterFacade callCenterFacade = new CallCenterFacade();

		Card card = callCenterFacade.getCardByuser(123456L);
		System.out.println(card);

		callCenterFacade.getSummary(card);
		callCenterFacade.getPaymentInfoByCard(card);
		callCenterFacade.cancelLastRegister(card);

		Card newCard = callCenterFacade.getCardByuser(123456L);
		System.out.println(newCard);
	}
}
