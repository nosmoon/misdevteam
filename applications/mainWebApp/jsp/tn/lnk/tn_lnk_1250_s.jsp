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
	TN_LNK_1250_SDataSet ds = (TN_LNK_1250_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int resForm = rx.add(resData, "resForm", "");
	
	try {
			rx.add(resForm,"dept_clsf",ds.dept_clsf);
            rx.add(resForm,"cret_frdt",ds.cret_frdt);
            rx.add(resForm,"cret_todt",ds.cret_todt);
            rx.add(resForm,"cret_stnd",ds.cret_stnd);
            rx.add(resForm,"mngr_nm",ds.mngr_nm);
            rx.add(resForm,"mngr_phon1",ds.mngr_phon1);
            rx.add(resForm,"mngr_phon2",ds.mngr_phon2);
            rx.add(resForm,"mngr_phon3",ds.mngr_phon3);
            rx.add(resForm,"rpt_dt",ds.rpt_dt);
            rx.add(resForm,"pay_frdt",ds.pay_frdt);
            rx.add(resForm,"pay_todt",ds.pay_todt);
            rx.add(resForm,"tot_cnt",ds.tot_cnt);
            rx.add(resForm,"tot_amt",ds.tot_amt);
            rx.add(resForm,"cret_yn","");
            rx.add(resForm,"save_yn","");
            rx.add(resForm,"rcpt_rpt_idx",ds.rcpt_rpt_idx);

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jul 07 16:11:11 KST 2016 */ %>