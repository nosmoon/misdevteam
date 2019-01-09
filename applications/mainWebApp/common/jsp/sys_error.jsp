<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="somo.framework.expt.*, somo.framework.util.* " %>

<%

    StringBuffer errorMessage = new StringBuffer("[ ���� �޼��� - �⺻ ] \n");
    SysException se = (SysException)request.getAttribute("sysException");
    
    String errmsg = "";
    
    if(se != null) {
        errorMessage.append(se.getException().toString());
        StackTraceElement[] ste = se.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString() + "\n");
        }

        // nested exception..
        ste = se.getException().getStackTrace();
        errorMessage.append("\n[ ���� �޼��� - ÷�� ] \n");
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString() + "\n");
        }
        
        errmsg = errorMessage.toString();
    }
    
	RwXml rx = new RwXml();         // XML ��ü ���� 

	int root = RwXml.rootNodeID;
	int errData = rx.add( root , "errData" , "");
	rx.add ( errData, "errcode", "system exception" );
	rx.add ( errData, "errmsg", errmsg );

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>