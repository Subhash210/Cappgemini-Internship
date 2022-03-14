package com.spring.rest.assignmentQ4;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardRestController {

	@RequestMapping(value = "/validate/{cardNo}", method = RequestMethod.GET)

	public String validateCreditCard(@PathVariable("cardNo") String cardNo) {
		CardValidator cardValidator = new CardValidator();
		cardValidator.setCardNo(cardNo);
		String res = cardValidator.isValidCard();
		return res;
	}
}