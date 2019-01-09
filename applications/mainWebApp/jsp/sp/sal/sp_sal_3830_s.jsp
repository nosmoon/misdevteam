<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_3830_SDataSet ds = (SP_SAL_3830_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "", "");

	try {
		int tempData   = rx.add(resData, "tempData", "");
		
		rx.add(tempData, "ern", ds.ern);
		rx.add(tempData, "dlco_nm", ds.dlco_nm);
		rx.add(tempData, "dlco_abrv_nm", ds.dlco_abrv_nm);
		rx.add(tempData, "presi_nm", ds.presi_nm);
		rx.add(tempData, "addr", ds.addr);
		rx.add(tempData, "bizcond", ds.bizcond);
		rx.add(tempData, "item", ds.item);
		rx.add(tempData, "corp_clsf", ds.corp_clsf);
		rx.add(tempData, "tax_stmt_cmpy_cd", ds.tax_stmt_cmpy_cd);
		rx.add(tempData, "email_id", ds.email_id);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
