package br.com.udemy.facade.service;

import java.util.List;

import br.com.udemy.facade.model.Card;
import br.com.udemy.facade.model.Register;

public class ReportService {
	private RegisterService registerService;

	public ReportService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getSummary(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		for (Register reg : registers) {
			System.out.println(
					String.format("%s\t%.2f\t%s", reg.getStoreName(), reg.getValue(), reg.getDate().toString()));
		}
	}
}
