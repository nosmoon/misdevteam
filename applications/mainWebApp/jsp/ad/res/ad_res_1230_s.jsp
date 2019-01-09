<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1230_SDataSet ds = (AD_RES_1230_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
 
		rx.add(tempData, "cm", ds.cm);
		rx.add(tempData, "dn", ds.dn); 
		rx.add(tempData, "chro_clsf", ds.chro_clsf);
		rx.add(tempData, "chro_clsf_nm", ds.chro_clsf_nm);
		rx.add(tempData, "tabl_yn", ds.tabl_yn); 
		rx.add(tempData, "issu_side", ds.issu_side);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>