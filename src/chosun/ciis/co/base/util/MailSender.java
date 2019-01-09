package chosun.ciis.co.base.util;

import java.io.UnsupportedEncodingException;
import java.util.*;
//import java.io.*;
//import java.util.logging.*;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;

import somo.framework.prop.PropertyManager;


public class MailSender {
	private String mailLogPath = null;

	public String getMailLogPath() {
		return mailLogPath;
	}

	public MailSender() {
	}

	public void sendmail(String sMailSubject, String sMailContent, String sFromEmail, String sToEmail) throws AddressException, MessagingException, UnsupportedEncodingException {
		class MyAuthentication extends Authenticator {
		    PasswordAuthentication pa;
		    public MyAuthentication(String id,String pw){
		        pa = new PasswordAuthentication(id, pw);
		    }

		    public PasswordAuthentication getPasswordAuthentication() {
		        return pa;
		    }
		}


		try{
				PropertyManager prop = PropertyManager.getInstance();
			    String smtpHost = (String) prop.getProperty("MAIL.SMTP.HOST");
			    String from = (String) prop.getProperty("MAIL.SMTP.FROM");
			    java.util.Properties properties = System.getProperties();
			    Session session = Session.getInstance(properties, null);

			    MimeMessage message = new MimeMessage(session);
			    message.setFrom(new InternetAddress(from));
			    message.addRecipient(Message.RecipientType.TO, new InternetAddress(sToEmail));
			    message.setSubject(sMailSubject, "euc-kr");
			    message.setContent(sMailContent, "text/html; charset=\"KSC5601\"");
			    message.setSentDate(new Date());

			    Transport transport = session.getTransport("smtp");
			    transport.connect(smtpHost, "", "");

			    if(!transport.isConnected()) {
		        	System.out.println("MailSender sendmail - FAILED TO CONNECT to SMTP SERVER");
		        	return;
		        }

			    transport.sendMessage(message, message.getAllRecipients());
			    transport.close();

		}catch (Exception e) {
			e.getMessage() ;
			e.printStackTrace();
		}
	}

}
