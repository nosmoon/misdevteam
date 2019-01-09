<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_3000_LDataSet ds = (MT_PRNPAP_3000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(dataSet, "clos_clsf", ds.clos_clsf);
		recordSet = rx.add(dataSet, "clos_clsf_nm", ds.clos_clsf_nm);
		recordSet = rx.add(dataSet, "dpcn_clsf", ds.dpcn_clsf);
		recordSet = rx.add(dataSet, "paji_clsf", ds.paji_clsf);
		recordSet = rx.add(dataSet, "stokmach_clsf", ds.stokmach_clsf);
		recordSet = rx.add(dataSet, "stokmidl_clsf", ds.stokmidl_clsf);
		recordSet = rx.add(dataSet, "stokwh_clsf", ds.stokwh_clsf);
		recordSet = rx.add(dataSet, "oth_div_clsf", ds.oth_div_clsf);

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Sat Jun 20 12:28:01 KST 2009 */ %>