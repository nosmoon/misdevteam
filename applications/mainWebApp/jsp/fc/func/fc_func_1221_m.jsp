<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1221_MDataSet ds = (FC_FUNC_1221_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_acct_cd_3_010", ds.getXx_acct_cd_3_010());
		rx.add(dataSet, "xx_acct_cd_5_010", ds.getXx_acct_cd_5_010());
		rx.add(dataSet, "xx_note_clsf_cd_010", ds.getXx_note_clsf_cd_010());
		rx.add(dataSet, "xx_note_clsf_cd_020", ds.getXx_note_clsf_cd_020());
		rx.add(dataSet, "xx_note_clsf_cd_030", ds.getXx_note_clsf_cd_030());
		rx.add(dataSet, "xx_slip_clsf_cd_010", ds.getXx_slip_clsf_cd_010());
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

<% /* 작성시간 : Wed Jan 04 16:14:00 KST 2012 */ %>