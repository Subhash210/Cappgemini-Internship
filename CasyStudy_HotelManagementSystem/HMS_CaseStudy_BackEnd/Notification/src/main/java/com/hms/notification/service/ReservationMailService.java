package com.hms.notification.service;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.hms.notification.models.ReservationNotification;

@Service
public class ReservationMailService {

	@Value("${com.mail}")
	private String emailId;

	@Value("${com.mail.password}")
	private String password;

	// sends mail to given mailID when guest sent to specific room
	public void sendmail(ReservationNotification details) throws AddressException, MessagingException, IOException {
		Properties prop = new Properties();
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emailId, password);
			}
		});
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(emailId, false));

		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(details.getEmailId()));
		msg.setSubject("ABC Hotel");
		msg.setContent("Dear " + details.getName()
				+ " Thank you for registering to ABC Hotel. Your Reservation Code is " + details.getReservationCode(),
				"text/html");
		msg.setSentDate(new Date());

//		MimeBodyPart messageBodyPart = new MimeBodyPart();
//		messageBodyPart.setContent("Sample body and content", "text/html");
//
//		Multipart multipart = new MimeMultipart();
//		multipart.addBodyPart(messageBodyPart);

//		   MimeBodyPart attachPart = new MimeBodyPart();
//		   attachPart.attachFile("C:\\Users\\navne\\Documents\\workspace-spring-tool-suite-4-4.13.1.RELEASE\\Mailer\\src\\main\\resources\\clock.png");
//		   multipart.addBodyPart(attachPart);
//		   msg.setContent(multipart);
		Transport.send(msg);
	}
}
