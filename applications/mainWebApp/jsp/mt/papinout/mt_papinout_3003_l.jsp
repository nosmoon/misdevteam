<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_3003_LDataSet ds = (MT_PAPINOUT_3003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(dataSet, "clos_clsf" , ds.clos_clsf);    //���� ����
		recordSet = rx.add(dataSet, "dpcn_clsf" , ds.dpcn_clsf);    //��ü���೻�� ���� ����
		recordSet = rx.add(dataSet, "paji_clsf", ds.paji_clsf);               //������ �Է� ����
		recordSet = rx.add(dataSet, "mqnt_clos_clsf", ds.mqnt_clos_clsf);     //��ü�� �Ҹ𳻿� �Է� ���� �� ���� ����
		recordSet = rx.add(dataSet, "magam_dt" , ds.magam_dt);                //���� ����
		recordSet = rx.add(dataSet, "magam_state" , ds.magam_state);          //���� ����
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

<% /* �ۼ��ð� : Thu Jun 25 16:01:39 KST 2009 */ %>