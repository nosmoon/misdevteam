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
	AD_CO_9003_SDataSet ds = (AD_CO_9003_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
 
		rx.add(tempData, "cm", DigitUtil.cutUnderPoint(ds.cm, 1));
		rx.add(tempData, "dn", DigitUtil.cutUnderPoint(ds.dn, 1)); 
		rx.add(tempData, "chro_clsf", StringUtil.nvl(ds.chro_clsf, "1"));
		rx.add(tempData, "issu_chro_clsf", StringUtil.nvl(ds.chro_clsf, "1"));
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