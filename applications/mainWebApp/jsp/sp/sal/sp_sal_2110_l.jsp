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
	SP_SAL_2110_LDataSet ds = (SP_SAL_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_2110_LCURLIST1Record rec = (SP_SAL_2110_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sale_yymm", rec.sale_yymm);
			rx.add(record, "sale_seq", rec.sale_seq);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "sale_item_cd", rec.sale_item_cd);
			rx.add(record, "sale_item_cd_nm", rec.sale_item_cd_nm);
			rx.add(record, "vat_flag", rec.vat_flag);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "tot_rvord_amt", rec.tot_rvord_amt);
			rx.add(record, "sale_cost", rec.sale_cost);
			rx.add(record, "rcpm_clsf", rec.rcpm_clsf);
		}
		/****** CURLIST1 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
