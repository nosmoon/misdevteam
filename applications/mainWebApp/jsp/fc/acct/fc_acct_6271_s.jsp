<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_6271_SDataSet ds = (FC_ACCT_6271_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "erplace_cd", ds.erplace_cd);
		rx.add(dataSet, "data_cnt", ds.data_cnt);
		rx.add(dataSet, "vat_fr_yymm", ds.vat_fr_yymm);
		rx.add(dataSet, "vat_to_yymm", ds.vat_to_yymm);
		rx.add(dataSet, "v_secn_21_010", ds.v_secn_21_010);
		rx.add(dataSet, "v_secn_21_020", ds.v_secn_21_020);
		rx.add(dataSet, "v_secn_21_030", ds.v_secn_21_030);
		rx.add(dataSet, "v_secn_21_040", ds.v_secn_21_040);
		rx.add(dataSet, "v_secn_21_050", ds.v_secn_21_050);
		rx.add(dataSet, "v_secn_22_010", ds.v_secn_22_010);
		rx.add(dataSet, "v_secn_23_010", ds.v_secn_23_010);
		rx.add(dataSet, "v_secn_23_020", ds.v_secn_23_020);
		rx.add(dataSet, "v_secn_24_010", ds.v_secn_24_010);
		rx.add(dataSet, "v_secn_24_020", ds.v_secn_24_020);
		rx.add(dataSet, "v_secn_24_030", ds.v_secn_24_030);
		rx.add(dataSet, "v_secn_24_040", ds.v_secn_24_040);
		rx.add(dataSet, "v_secn_24_050", ds.v_secn_24_050);
		rx.add(dataSet, "v_secn_24_060", ds.v_secn_24_060);
		rx.add(dataSet, "v_secn_24_070", ds.v_secn_24_070);
		rx.add(dataSet, "v_secn_24_080", ds.v_secn_24_080);
		rx.add(dataSet, "v_secn_tot_amt", ds.v_secn_tot_amt);
		rx.add(dataSet, "j_secn_105_1_1", ds.j_secn_105_1_1);
		rx.add(dataSet, "j_secn_105_1_3", ds.j_secn_105_1_3);
		rx.add(dataSet, "j_secn_105_1_32", ds.j_secn_105_1_32);
		rx.add(dataSet, "j_secn_105_1_4", ds.j_secn_105_1_4);
		rx.add(dataSet, "j_secn_105_1_5", ds.j_secn_105_1_5);
		rx.add(dataSet, "j_secn_107", ds.j_secn_107);
		rx.add(dataSet, "j_secn_121_13", ds.j_secn_121_13);
		rx.add(dataSet, "j_secn_tot_amt", ds.j_secn_tot_amt);
		rx.add(dataSet, "tot_amt", ds.tot_amt);
		System.out.println("최호정 fc_acct_6271_s.jsp erplace_cd => "+ds.erplace_cd);
		System.out.println("최호정 fc_acct_6271_s.jsp v_secn_tot_amt => "+ds.v_secn_tot_amt);
		System.out.println("최호정 fc_acct_6271_s.jsp tot_amt => "+ds.j_secn_tot_amt);
		System.out.println("최호정 fc_acct_6271_s.jsp 정상 success");
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

<% /* 작성시간 : Mon Jun 09 21:17:17 KST 2014 */ %>