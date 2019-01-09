<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="somo.framework.expt.*, somo.framework.util.* " %>

<%
  	AppException ae = (AppException)request.getAttribute("appException");

	String errcode  = ae.getErrorCode();
	String errmsg   = ae.getErrorMessage();
	
	String msg		= "app_error";
	
	RwXml rx = new RwXml();         // XML ��ü ���� 	
	
	int root = RwXml.rootNodeID;
	int dataSet = rx.add( root , "dataSet" , "");
	rx.add ( dataSet, "msg", msg );
	
	int errData = rx.add( root , "errData" , "");
	rx.add ( errData, "errcode", errcode );
	rx.add ( errData, "errmsg", errmsg );
	

    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
   	
   	
%>