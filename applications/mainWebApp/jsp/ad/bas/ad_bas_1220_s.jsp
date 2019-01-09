<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%

	String dlco_no	=	StringUtil.nvl(request.getParameter("dlco_no"));
	String cntr_seq	=	StringUtil.nvl(request.getParameter("cntr_seq"));
	  
	RwXml rx = new RwXml();
	AD_BAS_1220_SDataSet ds = (AD_BAS_1220_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int resForm = rx.add(resData, "resForm", "");
	
	rx.add(resForm, "hndl_clsf", ds.hndl_clsf);
	rx.add(resForm, "dlco_nm", ds.dlco_nm);
	rx.add(resForm, "cntr_dt", ds.cntr_dt);  
	rx.add(resForm, "colt_amt", ds.colt_amt);
	rx.add(resForm, "mm_avg_pubc_amt", ds.mm_avg_pubc_amt);
	rx.add(resForm, "colt_ratio", ds.colt_ratio);
	rx.add(resForm, "avg_due_dd", ds.avg_due_dd);
	rx.add(resForm, "remk", ds.remk);
	rx.add(resForm, "slcrg_pers", ds.slcrg_pers);
	rx.add(resForm, "slcrg_pers_nm", ds.slcrg_pers_nm);
	rx.add(resForm, "slcrg_opn", ds.slcrg_opn);
	rx.add(resForm, "mchrg_pers", ds.mchrg_pers);
	rx.add(resForm, "mchrg_pers_nm", ds.mchrg_pers_nm);
	rx.add(resForm, "mchrg_opn", ds.mchrg_opn);
	rx.add(resForm, "taem_chf_opn", ds.taem_chf_opn);

	rx.add(resForm, "dhon_note_bal", ds.dhon_note_bal);
	rx.add(resForm, "recebilll", ds.recebilll);
	rx.add(resForm, "unrcp_amt", ds.unrcp_amt);
	rx.add(resForm, "un_pay_fee", ds.un_pay_fee);
	rx.add(resForm, "precpt_amt", ds.precpt_amt);

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
   			
%>

<% /* 작성시간 : Wed Jan 21 15:27:41 KST 2009 */ %>