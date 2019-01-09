<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_1520_SDataSet ds = (IS_DEP_1520_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
		String rcpm_slip_occr_dt = "";
		String rcpm_slip_clsf_cd = "";
		String rcpm_slip_seq 	 = "";
		
		String rcmp_slip_no = ds.rcpm_slip_no;
		rcpm_slip_occr_dt 	= rcmp_slip_no.substring(0,8);
		rcpm_slip_clsf_cd 	= rcmp_slip_no.substring(8,10);
		rcpm_slip_seq 		= rcmp_slip_no.substring(10);
		
		int resForm = rx.add( root , "resForm" , "");		 
		rx.add(resForm, "drbk_clsf", ds.payo_clsf);
		rx.add(resForm, "payo_slip_occr_dt", ds.slip_occr_dt);
		rx.add(resForm, "payo_slip_clsf_cd", ds.slip_clsf_cd);
		rx.add(resForm, "payo_slip_seq", ds.slip_seq);
		rx.add(resForm, "rcpm_slip_occr_dt", rcpm_slip_occr_dt);
		rx.add(resForm, "rcpm_slip_clsf_cd", rcpm_slip_clsf_cd);
		rx.add(resForm, "rcpm_slip_seq", rcpm_slip_seq);
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "precpt_amt_bal", ""); 
		rx.add(resForm, "drbk_amt", ds.drbk_amt); 
		rx.add(resForm, "occr_amt", "");  
		rx.add(resForm, "payo_slip_no", ds.payo_slip_no); 
		rx.add(resForm, "mtry_dt", "");  
		rx.add(resForm, "proc_clsf", ""); 
		rx.add(resForm, "clos_stat", ds.clos_stat); 
		rx.add(resForm, "flag", "");  
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
