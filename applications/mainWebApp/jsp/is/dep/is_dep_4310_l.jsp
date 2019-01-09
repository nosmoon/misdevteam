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
	IS_DEP_4310_LDataSet ds = (IS_DEP_4310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "tempGridData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_4310_LCURLISTRecord rec = (IS_DEP_4310_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add(record, "checked", "N"); 
			rx.add ( record, "reg_yn", rec.reg_yn );
			rx.add ( record, "occr_dt", rec.occr_dt );
			rx.add ( record, "bank_cd", rec.bank_cd );
			rx.add ( record, "note_clsf_cd", rec.note_clsf_cd );
			rx.add ( record, "occr_seq", rec.occr_seq );
			rx.add ( record, "bank_nm", rec.bank_nm );
			rx.add ( record, "note_clsf_nm", rec.note_clsf_nm );
			rx.add ( record, "issu_cmpy_clsf_cd", rec.issu_cmpy_clsf_cd );
			rx.add ( record, "issu_pers_nm", rec.issu_pers_nm );
			rx.add ( record, "endorser_nm", rec.endorser_nm );
			rx.add ( record, "note_amt", rec.note_amt );
			rx.add ( record, "comp_dt", rec.comp_dt );
			rx.add ( record, "mtry_dt", rec.mtry_dt );
			rx.add ( record, "rcpm_acct", rec.rcpm_acct );
			rx.add ( record, "sale_aprv_no", rec.sale_aprv_no );
			rx.add ( record, "note_no", rec.note_no );
			rx.add ( record, "note_seq", rec.note_seq );
			rx.add ( record, "rcpm_slip_no", rec.rcpm_slip_no );
		}
		/****** CURLIST END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
