package com.hms.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.notification.models.GuestNotification;
import com.hms.notification.models.ReservationNotification;
import com.hms.notification.service.GuestMailService;
import com.hms.notification.service.ReservationMailService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RestController
@RequestMapping("/Notification")
public class NotificationController {

	private final static String ACCOUNT_SID = "AC422ae1c14a4cfa4dcf903decf5b37059";
	private final static String AUTH_ID = "a0d7737a613f8a667add90068d4ce3dd";

	static {
		Twilio.init(ACCOUNT_SID, AUTH_ID);
	}

	@Autowired
	private ReservationMailService reservationMail;

	@Autowired
	private GuestMailService guestMail;

	// Sends notification(mail & SMS) to the given phone number and mail ID when
	// reservation completes
	@PostMapping("/reservationnotification")
	public void run(@RequestBody ReservationNotification details) throws Exception {
		Message.creator(new PhoneNumber(details.getPhoneNumber()), new PhoneNumber("+17577928806"),
				"Dear " + details.getName() + " Thank you for your reservation to BABAI Hotel . Your reservation code is "
						+ details.getReservationCode())
				.create();
		reservationMail.sendmail(details);
	}

	// Sends notification(mail & SMS) to the given phone number and mailID when
	// guest sent to specific room
	@PostMapping("/guestnotification")
	public void guestRun(@RequestBody GuestNotification details) throws Exception {
		Message.creator(new PhoneNumber(details.getPhoneNumber()), new PhoneNumber("+17577928806"),
				"Dear " + details.getName() + " Your guest code is " + details.getGuestCode()).create();
		guestMail.sendmail(details);
	}

}
