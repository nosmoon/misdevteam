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
%>

<%
	RwXml rx = new RwXml();  
	CO_MNG_1020_SDataSet ds = (CO_MNG_1020_SDataSet)request.getAttribute("ds");
	
	int root = RwXml.rootNodeID;
	int resData = rx.add( root , "resData" , "");
	
	rx.add ( resData, "crud", ds.crud );
	rx.add ( resData, "pageTitle", ds.page_title );
	rx.add ( resData, "pageUrl", ds.page_url );

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
   		
%>
	