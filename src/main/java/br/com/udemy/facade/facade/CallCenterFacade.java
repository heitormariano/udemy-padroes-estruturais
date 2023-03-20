package br.com.udemy.facade.facade;

import java.util.List;

import br.com.udemy.facade.model.Card;
import br.com.udemy.facade.model.Register;
import br.com.udemy.facade.service.CardService;
import br.com.udemy.facade.service.PaymentService;
import br.com.udemy.facade.service.RegisterService;
import br.com.udemy.facade.service.ReportService;
import br.com.udemy.facade.service.SecurityService;

public class CallCenterFacade {
	private CardService cardService;
	private RegisterService registerService;
	private PaymentService paymentService;
	private ReportService reportService;
	private SecurityService securityService;

	public CallCenterFacade() {
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		paymentService = new PaymentService(registerService);
		securityService = new SecurityService(cardService, registerService);
	}

	public Card getCardByuser(Long userNumber) {
		return cardService.getCardByUser(userNumber);
	}

	public void getSummary(Card card) {
		reportService.getSummary(card);
	}

	public void getPaymentInfoByCard(Card card) {
		paymentService.getPaymentInfoByCard(card);
	}

	public void cancelLastRegister(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSummary(newCard);
	}
}
