<%@ page contentType="text/html; charset=KSC5601" %>
<%@ page import="javax.mail.*, javax.mail.internet.*, javax.activation.*"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%----------------------------------------------------------
* ���α׷���	: co_login_1100_u.jsp
* ���α׷����	: ��й�ȣ ��߱� ��û
* �ۼ�����	: 2004.07.27
* �ۼ���	: ��뼷
----------------------------------------------------------%>
<%
	String deptnm = Util.Uni2Ksc(request.getParameter("deptnm"));
	String usernm = Util.Uni2Ksc(request.getParameter("usernm"));
	String position = Util.Uni2Ksc(request.getParameter("position"));
	String userid = Util.Uni2Ksc(request.getParameter("userid"));
	String reason = Util.Uni2Ksc(request.getParameter("reason"));

	try{
		Properties p = new Properties();
		File propFile = new File("//was//salesdept//prop//default.properties");

 		FileInputStream fis = new FileInputStream(propFile);
		p.load(fis);
		fis.close();

		
		String smtpHost = (String)p.get("MAIL.SMTP.HOST");
		String from = (String)p.get("MAIL.SMTP.FROM");
		String to = (String)p.get("MAIL.SMTP.FROM");
	    String subject = "��й�ȣ ��߱� ��û";

	    StringBuffer sb = new StringBuffer("");
	    sb.append("[�Ҽ�] : ");
	    sb.append(deptnm);
	    sb.append("<br>");
	    sb.append("[��å] : ");
	    sb.append(position);
	    sb.append("<br>");
	    sb.append("[����ڸ�] : ");
	    sb.append(usernm);
	    sb.append("<br>");
	    sb.append("[���̵�] : ");
	    sb.append(userid);
	    sb.append("<br>");
	    sb.append("[�������] : ");
	    sb.append("<br>");
	    sb.append(reason);
	    String content = sb.toString();
	    
		java.util.Properties properties = System.getProperties();
		Session mailSession = Session.getInstance(properties, null);
	
		MimeMessage message = new MimeMessage(mailSession);
		message.setFrom(new InternetAddress(from));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));		
		message.setSubject(subject,"euc-kr");
		message.setContent(content,"text/html; charset=euc-kr");
		Transport transport = mailSession.getTransport("smtp");
		transport.connect(smtpHost, "", "");
	
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}catch(Exception e){
		e.printStackTrace();
		throw new SysException(e);
	}		
    
%>
<script>
	self.location.replace("/login.jsp");
</script>
