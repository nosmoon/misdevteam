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
	AD_CO_9008_SDataSet ds = (AD_CO_9008_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {  
 
		rx.add(resData, "srch_cd", ds.srch_cd); 
		rx.addCData(resData, "srch_nm", ds.srch_nm); 
		rx.add(resData, "dlco_clsf", ds.dlco_clsf); 
		rx.add(resData, "chk_cnt", ds.chk_cnt); 
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>