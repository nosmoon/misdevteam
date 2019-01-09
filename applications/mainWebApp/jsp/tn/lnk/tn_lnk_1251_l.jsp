<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%	System.out.println("jsp go");
	RwXml rx = new RwXml();
	TN_LNK_1251_LDataSet ds = (TN_LNK_1251_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "tempData", "");
	int resForm = rx.add(resData, "resForm", "");
	
	try {
			rx.add(resForm,"pay_frdt",ds.start_dt);
            rx.add(resForm,"pay_todt",ds.end_dt);
            rx.add(resForm,"tot_cnt",ds.tot_cnt);
            rx.add(resForm,"tot_amt",ds.tot_amt);
            rx.add(resForm,"rcpt_rpt_idx",ds.rcpt_rpt_idx);
            rx.add(resForm,"bzno",ds.bzno);
			rx.add(resForm,"crtefilenm",ds.filenm);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jul 07 16:11:11 KST 2016 */ %>