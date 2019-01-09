<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*, somo.framework.util.*, somo.framework.db.*; " %>
<?xml version="1.0" encoding="euc-kr" ?>

<%

	BaseDataSet ds = (BaseDataSet) request.getAttribute("ds");
	String strCode = "";
	String strMsg	= "";
	
	if (ds.getErrcode().equals("")){
		strCode = "0";
		strMsg = "Success";
	} else {
		strCode = "1";
		strMsg = "Fail";
	}
%>
<ndata>
	<status><%= strMsg %></status>
	<code><%= strCode %></code>
</ndata>