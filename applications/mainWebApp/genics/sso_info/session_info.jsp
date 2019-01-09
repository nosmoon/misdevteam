<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.lang.*" %>
<%
	out.println("=====PARAMETER LIST=====<br>");
	Enumeration en = request.getParameterNames();
	String paramName = null;
	String paramValues[] = null;
	while (en.hasMoreElements()) {
		paramName = (String)en.nextElement();
        paramValues = request.getParameterValues(paramName);
        
        if(paramValues.length == 1){
        	out.println(paramName+" = ["+paramValues[0]+"]<br>");
        }else{
        	out.print(paramName+" = ");
        	for (int i=0; i < paramValues.length; i++) {
            	out.print("["+paramValues[i]+"] ");
            }
            out.println("<br>");
        }
	}
	out.println("<br>");
	out.println("=====SESSION LIST=====<br>");
		Enumeration en2 = session.getAttributeNames();
		String sessionName = null;
		String sessionValue = null;
		Object obj = null;
		while (en2.hasMoreElements()) {
			sessionName = (String)en2.nextElement();
				//obj = session.getAttribute(sessionName);
			
			//out.println(obj);
			
			//if(obj.getClass().getSimpleName().equals("String")){
			out.println(sessionName+" = "+session.getAttribute(sessionName)+"<br>");
			//}else{
			//	out.println(sessionName+" = ["+obj.getClass().getSimpleName()+" Type]<br>");
			
		}


%>