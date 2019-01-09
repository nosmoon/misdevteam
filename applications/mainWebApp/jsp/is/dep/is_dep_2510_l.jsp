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
	IS_DEP_2510_LDataSet ds = (IS_DEP_2510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");

	try {
		int gridData1 = rx.add(resData, "gridData1", "");
		String dlco_clsf = "";
		for(int i = 0; i<ds.curlist1.size(); i++) {
			IS_DEP_2510_LCURLIST1Record rec = (IS_DEP_2510_LCURLIST1Record)ds.curlist1.get(i);

			int record = rx.add(gridData1, "record", "");
			
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "rcpay_amt", rec.rcpay_amt);
			rx.add(record, "amt", rec.amt);
		}
		

		
		int gridData2 = rx.add(resData, "gridData2", "");
		for(int i = 0; i<ds.curlist2.size(); i++) {
			IS_DEP_2510_LCURLIST2Record rec = (IS_DEP_2510_LCURLIST2Record)ds.curlist2.get(i);

			int record = rx.add(gridData2, "record", "");
			
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
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
