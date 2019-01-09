<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.dep.rec.*
	,	chosun.ciis.sp.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_DEP_1520_LDataSet ds = (SP_DEP_1520_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");


	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_DEP_1520_LCURLISTRecord rec = (SP_DEP_1520_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "dtls_seq", rec.dtls_seq);
			//rx.add(record, "budg_cd", rec.budg_cd+rec.occr_slip_clsf+rec.occr_slip);
			//rx.add(record, "occr_slip_clsf", rec.occr_slip_clsf);
			rx.add(record, "occr_slip", rec.budg_cd+rec.occr_slip_clsf+rec.occr_slip);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "sale_yymm", rec.sale_yymm);
			rx.add(record, "sale_item_cd", rec.sale_item_cd);			
			rx.add(record, "sale_item_cd_nm", rec.sale_item_cd_nm);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "rcpm_proc_amt", rec.rcpm_proc_amt);
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "remk", rec.remk);
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
