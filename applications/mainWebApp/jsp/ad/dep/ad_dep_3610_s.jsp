<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%

	
	RwXml rx = new RwXml();
	AD_DEP_3610_SDataSet ds = (AD_DEP_3610_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm = rx.add(root, "resForm", "");

	try {  
			
		rx.add(resForm, "medi_nm", ds.medi_nm);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "pubc_frdt", ds.pubc_frdt);
		rx.add(resForm, "pubc_todt", ds.pubc_todt);
		rx.add(resForm, "advt_cont", ds.advt_cont);
		rx.add(resForm, "pubc_amt", ds.pubc_amt);
		rx.add(resForm, "rcpm_amt", ds.rcpm_amt);
		rx.add(resForm, "unrcp_amt", ds.unrcp_amt);
		rx.add(resForm, "slcrg_pers", ds.slcrg_pers);
		rx.add(resForm, "slcrg_pers_nm", ds.slcrg_pers_nm);
		rx.add(resForm, "mchrg_pers", ds.mchrg_pers);
		rx.add(resForm, "mchrg_pers_nm", ds.mchrg_pers_nm);
		rx.add(resForm, "ern", ds.ern);
		rx.add(resForm, "presi_nm", ds.presi_nm);
		rx.add(resForm, "tel_no", ds.tel_no);
		rx.add(resForm, "eps_clsf", ds.eps_clsf);
		rx.add(resForm, "zip_no", ds.zip_no);
		rx.add(resForm, "addr", ds.addr);
		rx.add(resForm, "dtls_addr", ds.dtls_addr);
		rx.addCData(resForm, "remk", ds.remk);
		rx.addCData(resForm, "occr_caus_busn", ds.occr_caus_busn);
		rx.addCData(resForm, "occr_caus_mang", ds.occr_caus_mang);
		rx.addCData(resForm, "act_matt_busn", ds.act_matt_busn);
		rx.addCData(resForm, "act_matt_mang", ds.act_matt_mang);
		rx.addCData(resForm, "proc_plan_busn", ds.proc_plan_busn);
		rx.addCData(resForm, "proc_plan_mang", ds.proc_plan_mang);
		rx.add(resForm, "rept_no", ds.rept_no);
		rx.add(resForm, "dlco_no", ds.dlco_no); 
		rx.add(resForm, "flag", ""); 
		
		//부도정보 
		rx.add(resForm, "enty_clsf"				, ds.enty_clsf);
		rx.add(resForm, "dhon_medi_nm"			, ds.dhon_medi_nm);
		rx.add(resForm, "dhon_dlco_nm"			, ds.dhon_dlco_nm);		
		rx.add(resForm, "note_no"				, ds.note_no);	
		rx.add(resForm, "dhon_frdt"				, ds.min_dhon_occr_dt);	
		rx.add(resForm, "dhon_todt"				, ds.max_dhon_occr_dt);
		rx.add(resForm, "dhon_amt"				, ds.dhon_amt);				
		rx.add(resForm, "dhon_rcpm_amt"			, ds.dhon_rcpm_amt);		
		rx.add(resForm, "jan_amt"				, ds.dhon_bal);	
		rx.add(resForm, "issu_pers_nm"			, ds.issu_pers_nm);
		rx.add(resForm, "dhon_slcrg_pers"		, ds.dhon_slcrg_pers);				
		rx.add(resForm, "dhon_slcrg_pers_nm"	, ds.dhon_slcrg_pers_nm);
		rx.add(resForm, "dhon_mchrg_pers"		, ds.dhon_mchrg_pers);
		rx.add(resForm, "dhon_mchrg_pers_nm"	, ds.dhon_mchrg_pers_nm);				
		
	}
	catch (Exception e) {
		
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
