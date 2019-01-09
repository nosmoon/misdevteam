<%@page contentType="text/xml; charset=EUC-KR" isErrorPage="true"%>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="somo.framework.expt.*, somo.framework.util.* " %>

<%
	
    StringBuffer errorMessage = new StringBuffer("[ ���� �޼��� - �⺻ ] \n");
    
    String errmsg = "";
    
    errorMessage.append(exception.toString());
    StackTraceElement[] ste = exception.getStackTrace();
    for(int i=0; i<ste.length; i++) {
        errorMessage.append(ste[i].toString() + "\n");
    }

     // nested exception..
    ste = exception.getStackTrace();
    errorMessage.append("\n[ ���� �޼��� - ÷�� ] \n");
    for(int i=0; i<ste.length; i++) {
        errorMessage.append(ste[i].toString() + "\n");
    }
     
    errmsg = errorMessage.toString();
    
	RwXml rx = new RwXml();         // XML ��ü ���� 

	int root = RwXml.rootNodeID;
	int errData = rx.add( root , "errData" , "");
	rx.add ( errData, "errcode", "Server Internal Error" );
	rx.add ( errData, "errmsg", errmsg );

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>