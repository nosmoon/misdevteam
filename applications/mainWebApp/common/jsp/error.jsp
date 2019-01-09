<%@page contentType="text/xml; charset=EUC-KR" isErrorPage="true"%>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="somo.framework.expt.*, somo.framework.util.* " %>

<%
	
    StringBuffer errorMessage = new StringBuffer("[ 에러 메세지 - 기본 ] \n");
    
    String errmsg = "";
    
    errorMessage.append(exception.toString());
    StackTraceElement[] ste = exception.getStackTrace();
    for(int i=0; i<ste.length; i++) {
        errorMessage.append(ste[i].toString() + "\n");
    }

     // nested exception..
    ste = exception.getStackTrace();
    errorMessage.append("\n[ 에러 메세지 - 첨부 ] \n");
    for(int i=0; i<ste.length; i++) {
        errorMessage.append(ste[i].toString() + "\n");
    }
     
    errmsg = errorMessage.toString();
    
	RwXml rx = new RwXml();         // XML 객체 생성 

	int root = RwXml.rootNodeID;
	int errData = rx.add( root , "errData" , "");
	rx.add ( errData, "errcode", "Server Internal Error" );
	rx.add ( errData, "errmsg", errmsg );

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>