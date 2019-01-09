<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pl.ass.rec.*
	,	chosun.ciis.pl.ass.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pl_ass_1040_s.jsp
* ��� : 
* �ۼ����� : 2009-03-16
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_ASS_1040_SDataSet ds = (PL_ASS_1040_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resultData", "");

	try {
		rx.add(dataSet, "ser_no_basi", ds.ser_no_basi);
		rx.add(dataSet, "issu_clsf", ds.issu_clsf);
		rx.add(dataSet, "ref_ser_no_1", ds.ref_ser_no_1);
		rx.add(dataSet, "ref_ser_no_2", ds.ref_ser_no_2);
		rx.add(dataSet, "basi_bgn_ser_no", ds.basi_bgn_ser_no);
		rx.add(dataSet, "basi_end_ser_no", ds.basi_end_ser_no);
		rx.add(dataSet, "prd", ds.prd);
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

<% /* �ۼ��ð� : Mon Mar 16 11:36:32 KST 2009 */ %>