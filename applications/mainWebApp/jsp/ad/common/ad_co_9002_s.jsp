<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_CO_9002_SDataSet ds = (AD_CO_9002_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		rx.add(tempData, "dlco_nm", ds.dlco_nm);
		rx.add(tempData, "dlco_no", ds.dlco_no);
		rx.add(tempData, "chk_cnt", ds.chk_cnt);
	}
	catch (Exception e) {
	}
	finally { 
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>