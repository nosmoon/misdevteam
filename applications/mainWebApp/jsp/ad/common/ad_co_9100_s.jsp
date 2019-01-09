<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*;
	"
%>
 
<%
	RwXml rx = new RwXml();  
	AD_CO_9100_SDataSet ds = (AD_CO_9100_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try
	{
		rx.add(resData, "srch_dlco_no", ds.srch_dlco_no); 
		rx.add(resData, "srch_dlco_nm", ds.srch_dlco_nm); 
		rx.add(resData, "srch_cust_seq", ds.srch_cust_seq); 
		rx.add(resData, "srch_cust_name", ds.srch_cust_name); 
		rx.add(resData, "chk_cnt", ds.chk_cnt); 
	}
	catch (Exception e)
	{
	}
	finally
	{
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>