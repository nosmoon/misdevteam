package chosun.ciis.hd.emsy;

import java.util.*;
import java.io.*;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import chosun.ciis.hd.emsy.dm.HD_EMSY_2008_ADM;
import chosun.ciis.hd.emsy.ds.HD_EMSY_2008_ADataSet;

import somo.framework.db.DBManager;
import somo.framework.prop.PropertyManager;


public class HD_MailsSender {
	private String mailLogPath = null;

	public String getMailLogPath() {
		return mailLogPath;
	}

	public HD_MailsSender() {
	}

	public void sendmail(String sMailSubject, String sMailContent, String sFromEmail, String sToEmail, String FilePath, String FileName, String cmpy_cd, String saly_yy, String saly_no, String emp_no) throws AddressException, MessagingException, UnsupportedEncodingException {
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
			    //System.out.println(smtpHost);
			    //System.out.println(sFromEmail);
			    //System.out.println(sToEmail);
			    String from = sFromEmail;//(String) prop.getProperty("MAIL.SMTP.FROM");
			    java.util.Properties properties = System.getProperties();
			    Session session = Session.getInstance(properties, null);

			    MimeMessage message = new MimeMessage(session);
			    Multipart mp = new MimeMultipart();
			    MimeBodyPart mbp1 = new MimeBodyPart();
			    
			    message.setFrom(new InternetAddress(from));
			    
			    message.addRecipient(Message.RecipientType.TO, new InternetAddress(sToEmail));
			    message.setSubject(sMailSubject, "euc-kr");
			    mbp1.setContent(sMailContent, "text/html; charset=\"KSC5601\"");
			    //message.setContent(sMailContent, "text/html; charset=\"KSC5601\"");
			    
			    //첨부파일 임시 경로 테스트..
			    //FilePath = "/was/ciis/hd_saly_email/";
			    //FileName = "HD_MailsSender.html";
			    
			    mp.addBodyPart(mbp1);
			    //파일첨부 구현
			    try {
					if (FilePath != null && FileName != null ) { //첨부파일1개만..구현
						MimeBodyPart mbp2 = new MimeBodyPart();
						FileDataSource fds = new FileDataSource(FilePath+FileName);
						//System.out.println(FilePath+FileName);
						mbp2.setDataHandler(new DataHandler(fds));
						mbp2.setFileName((fds.getName()));
						mp.addBodyPart(mbp2);
					}
				} catch (RuntimeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    message.setContent(mp);
			    message.setSentDate(new Date());
			    
			    //서버인증 
			    Transport transport = session.getTransport("smtp");
			    transport.connect(smtpHost, "", "");
			    if(!transport.isConnected()) {
		        	System.out.println("MailSender sendmail - FAILED TO CONNECT to SMTP SERVER");
		        	return;
		        }
			    
			    Transport.send(message);
			    transport.close();
			    //전송 로그 입력....
			    System.out.println(sToEmail);
				hd_emsy_2008_A(cmpy_cd, saly_yy, saly_no, emp_no, sToEmail, "Y");

		}catch (Exception e) {
			//전송 에러로그 입력....
			hd_emsy_2008_A( cmpy_cd, saly_yy, saly_no, emp_no, e.getMessage(),"N");
			e.getMessage() ;
			e.printStackTrace();
		}
	}
	
	public void hd_emsy_2008_A(String cmpy_cd, String saly_yy, String saly_no, String emp_no, String sToEmail, String success_yn){
		DBManager manager = new DBManager("MISHDL");
		HD_EMSY_2008_ADataSet ds = null;
		HD_EMSY_2008_ADM dm = new HD_EMSY_2008_ADM();

		dm.cmpy_cd = cmpy_cd;
		dm.saly_yy = saly_yy;
		dm.saly_no = saly_no;
		dm.emp_no = emp_no;
		dm.stoemail = sToEmail;
		dm.success_yn = success_yn;

		dm.print();
		
		ds = (HD_EMSY_2008_ADataSet)manager.executeCall(dm);
	}

}
