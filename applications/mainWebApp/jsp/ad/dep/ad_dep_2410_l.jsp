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
	AD_DEP_2410_LDataSet ds = (AD_DEP_2410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	long tot_note = 0; //어음합계 
	
	try {  
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_2410_LCURLISTRecord rec = (AD_DEP_2410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "now_note_stat_nm", rec.now_note_stat_nm);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "note_clsf_nm", rec.note_clsf_nm);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "mang_chrg_pers", rec.mang_chrg_pers);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "rcpm_acct", rec.rcpm_acct);
			rx.add(record, "sale_aprv_no", rec.sale_aprv_no);
			
			String dlco_clsf_nm = null;
			
			if("15".equals(rec.dlco_clsf_cd)){
				dlco_clsf_nm = "외근";
			}else if("16".equals(rec.dlco_clsf_cd)){
				dlco_clsf_nm = "대행사";
			}else if("17".equals(rec.dlco_clsf_cd)){
				dlco_clsf_nm = "광고지사";
			}else if("18".equals(rec.dlco_clsf_cd)){
				dlco_clsf_nm = "지국지사";
			}
			
			
			rx.add(record, "custnm", dlco_clsf_nm +" "+ rec.dlco_nm);
			
			tot_note += StringUtil.toLong(rec.note_amt);
			
		}
		
	    int resForm = rx.add(resData, "resForm", "");
	    
	    rx.add(resForm, "tot_note", tot_note);
			
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
