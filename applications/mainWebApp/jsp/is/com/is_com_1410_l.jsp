<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.com.rec.*
	,	chosun.ciis.is.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_COM_1410_LDataSet ds = (IS_COM_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_COM_1410_LCURLISTRecord rec = (IS_COM_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_chrg_pers_seq", rec.dlco_chrg_pers_seq);
			rx.add(record, "chrg_job_clsf", rec.chrg_job_clsf);
			rx.add(record, "chrg_job_clsf_nm", rec.chrg_job_clsf_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "tel_no_1", rec.tel_no_1);
			rx.add(record, "fax_no", rec.fax_no);
			rx.add(record, "email", rec.email);
			rx.add(record, "kind_erplace_no", rec.kind_erplace_no);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
