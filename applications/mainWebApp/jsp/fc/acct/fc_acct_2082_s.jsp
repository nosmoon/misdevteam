<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	,	chosun.ciis.co.base.util.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2082_SDataSet ds = (FC_ACCT_2082_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
    String dlco_abrv_nm = ds.dlco_abrv_nm;
    String dlco_no = ds.dlco_no;
    String dlco_nm = ds.dlco_nm;
    String presi_nm = ds.presi_nm;
    String bizcond = ds.bizcond;
    String item = ds.item;
    String zip_1 = ds.zip_1;
    String zip_2 = ds.zip_2;
    String jujuso1 = ds.jujuso1;
    String jujuso2 = ds.jujuso2;
    String jujuso3 = ds.jujuso3;
    String jujuso4 = ds.jujuso4;
	dataSet = rx.add(root, "dataSet", "");

	try {
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
        rx.addCData(dataSet, "dlco_abrv_nm", StringUtil.replaceToXml(dlco_abrv_nm));
        rx.add(dataSet, "dlco_no", StringUtil.replaceToXml(dlco_no));
        rx.addCData(dataSet, "dlco_nm", StringUtil.replaceToXml(dlco_nm));
        rx.addCData(dataSet, "presi_nm", StringUtil.replaceToXml(presi_nm));
        rx.addCData(dataSet, "bizcond", bizcond);
        rx.addCData(dataSet, "item", item);
        rx.add(dataSet, "zip_1", zip_1);
        rx.add(dataSet, "zip_2", zip_2);
        rx.addCData(dataSet, "jujuso1", jujuso1);
        rx.addCData(dataSet, "jujuso2", jujuso2);
        rx.addCData(dataSet, "jujuso3", jujuso3);
        rx.addCData(dataSet, "jujuso4", jujuso4);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Mar 11 10:45:41 KST 2009 */ %>