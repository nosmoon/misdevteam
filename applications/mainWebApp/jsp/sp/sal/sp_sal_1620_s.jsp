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
	SP_SAL_1620_SDataSet ds = (SP_SAL_1620_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");

	try {
		rx.add(resForm, "seq", ds.seq);
		rx.add(resForm, "proc_clsf", ds.proc_clsf);
		rx.add(resForm, "car_no", ds.car_no);
		rx.add(resForm, "car_ownr_nm", ds.car_ownr_nm);
		rx.add(resForm, "prn", ds.prn);
		rx.add(resForm, "ptph_no", ds.ptph_no);
		rx.add(resForm, "addr", ds.addr);
		rx.add(resForm, "dtls_addr", ds.dtls_addr);
		rx.add(resForm, "yy_styl", ds.yy_styl);
		rx.add(resForm, "engn_dsplt", ds.engn_dsplt);
		rx.add(resForm, "car_clsf", ds.car_clsf);
		rx.add(resForm, "insr_entr_hope_yn", ds.insr_entr_hope_yn);
		rx.add(resForm, "insr_rmtt_plan_dt", ds.insr_rmtt_plan_dt);
		rx.add(resForm, "bank_nm", ds.bank_nm);
		rx.add(resForm, "rcpm_pers_nm", ds.rcpm_pers_nm);
		rx.add(resForm, "dlco_clsf", ds.dlco_clsf);
		rx.add(resForm, "dlco_cd", ds.dlco_cd);
		rx.add(resForm, "dlco_seq", ds.dlco_seq);
		rx.add(resForm, "flag", "U");
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
