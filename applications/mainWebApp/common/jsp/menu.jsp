<%@ page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.mng.rec.*
	,	chosun.ciis.co.mng.ds.*;
	"
%>
<%
	response.setHeader("Pragma","No-cache"); //HTTP 1.0 
	response.setDateHeader("Expires", 0); 
	response.setHeader("Cache-Control", "no-cache"); 
	
	String cmpycd	= (String)session.getAttribute("cmpycd") == null ? "" : (String)session.getAttribute("cmpycd");
	String menu_style = "borderstyle=1 font-family=돋움 font-size=13 font-color=#ffffff font-bold=true bgcolor=#839fc7 mecolor=#05337E";
	
        //if ("cit0000".equals(cmpycd)) {
        //    menu_style = "type=fulldown borderstyle=1 font-family=돋움 font-size=13 font-color=#ffffff font-bold=true bgcolor=#669900 mecolor=#669900";
        //}  
%>
<?xml version="1.0" encoding="EUC-KR"?>
<%
	if ("700".equals(cmpycd)) {
%>	
<Menu type="fulldown" borderstyle="1" 
font-family="돋움" font-size="13" font-color="#ffffff" font-bold="true" 
bgcolor="#336699" mecolor="#05337E">

<%	
	
	CO_MNG_1000_LDataSet ds = (CO_MNG_1000_LDataSet)request.getAttribute("ds");
	for(int i = 0; i < ds.curlist.size(); i++) {
		CO_MNG_1000_LCURLISTRecord rec = (CO_MNG_1000_LCURLISTRecord)ds.curlist.get(i);
%>
	<Main itemID="<%=rec.menu_id%>" name="<%=rec.menu_nm%>" select-bgcolor="#05337E" bgcolor="#336699"/>	
<%		
	} 
%>
</Menu>
<%
	} else {
%>	

<Menu type="fulldown" borderstyle="1" 
font-family="돋움" font-size="13" font-color="#ffffff" font-bold="true" 
bgcolor="#839fc7" mecolor="#05337E">

<%
	CO_MNG_1000_LDataSet ds = (CO_MNG_1000_LDataSet)request.getAttribute("ds");
	for(int i = 0; i < ds.curlist.size(); i++) {
		CO_MNG_1000_LCURLISTRecord rec = (CO_MNG_1000_LCURLISTRecord)ds.curlist.get(i);
%>
	<Main itemID="<%=rec.menu_id%>" name="<%=rec.menu_nm%>" select-bgcolor="#05337E" bgcolor="#839fc7"/>	
<%		
	} 
%>	
</Menu>
<%
	}
%>

