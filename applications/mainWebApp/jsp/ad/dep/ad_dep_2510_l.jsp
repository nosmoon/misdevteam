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
	AD_DEP_2510_LDataSet ds = (AD_DEP_2510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");

	try {  
	
		int gridData1 = rx.add(resData, "gridData1", "");
		String dlco_clsf = "";
		for(int i = 0; i<ds.curlist1.size(); i++) {
			AD_DEP_2510_LCURLIST1Record rec = (AD_DEP_2510_LCURLIST1Record)ds.curlist1.get(i);

			int record = rx.add(gridData1, "record", "");
			
			if("15".equals(rec.dlco_clsf_cd)) 		dlco_clsf = "외   근";
			else if("16".equals(rec.dlco_clsf_cd)) 	dlco_clsf = "대행사";
			else if("17".equals(rec.dlco_clsf_cd)) 	dlco_clsf = "광고지사";
			else if("19".equals(rec.dlco_clsf_cd)) 	dlco_clsf = "지사지국";
			else							  		dlco_clsf = rec.dlco_clsf_cd;	
												
			rx.add(record, "dlco_clsf_cd", dlco_clsf);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "rcpay_amt", rec.rcpay_amt);
			rx.add(record, "amt", rec.amt);
		}
		

		
		int gridData2 = rx.add(resData, "gridData2", "");
		for(int i = 0; i<ds.curlist2.size(); i++) {
			AD_DEP_2510_LCURLIST2Record rec = (AD_DEP_2510_LCURLIST2Record)ds.curlist2.get(i);

			int record = rx.add(gridData2, "record", "");
			
			if("15".equals(rec.dlco_clsf_cd)) 		dlco_clsf = "외   근";
			else if("16".equals(rec.dlco_clsf_cd)) 	dlco_clsf = "대행사";
			else if("17".equals(rec.dlco_clsf_cd)) 	dlco_clsf = "광고지사";
			else if("19".equals(rec.dlco_clsf_cd)) 	dlco_clsf = "지사지국";
			else							  		dlco_clsf = rec.dlco_clsf_cd;	
			
			rx.add(record, "dlco_clsf_cd", dlco_clsf);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dhon_occr_dt", rec.dhon_occr_dt);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "clamt_chrg_emp_no", rec.clamt_chrg_emp_no);
			rx.add(record, "slcrg_pers_emp_no", rec.slcrg_pers_emp_no);
		}		

	}
	catch (Exception e) {
		
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
