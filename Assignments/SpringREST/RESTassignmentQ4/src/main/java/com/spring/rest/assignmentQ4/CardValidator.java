package com.spring.rest.assignmentQ4;

public class CardValidator {
	private String CardNo;

	public String getCardNo() {
		return CardNo;
	}

	public void setCardNo(String cardNo) {
		CardNo = cardNo;
	}

	public String isValidCard() {
		String valid = "Not valid";
		String testCard = getCardNo();
		if (testCard.matches("((?:2131|1800|35[0-9]{3})[0-9]{11,14})")) {
			valid = "JCB";
		} else if (testCard.matches("(4[0-9]{12}(?:[0-9]{3})?)"))
			valid = "Visa";
		else if (testCard.matches(
				"^(5[1-5][0-9]{14}|2(22[1-9][0-9]{12}|2[3-9][0-9]{13}|[3-6][0-9]{14}|7[0-1][0-9]{13}|720[0-9]{12}))"))
			valid = "MasterCard";
		else if (testCard.matches("(6(?:011|5[0-9]{2})[0-9]{12})"))
			valid = "Discover";
		return valid;
	}
}
