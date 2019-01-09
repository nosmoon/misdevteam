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
	SP_SAL_1110_LDataSet ds = (SP_SAL_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_1110_LCURLIST1Record rec = (SP_SAL_1110_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "checked", "N");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sale_yymm", rec.sale_yymm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "sale_item", rec.sale_item);
			rx.add(record, "sale_cost", rec.sale_cost);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "clamt_mthd", rec.clamt_mthd);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "ordr_amt", rec.ordr_amt);
			rx.add(record, "ipln_amt", rec.ipln_amt);
			rx.add(record, "ipln_meda_amt", rec.ipln_meda_amt);
			rx.add(record, "ordr_dt", rec.ordr_dt);
			rx.add(record, "suply_pers_ern", rec.suply_pers_ern);
			rx.add(record, "gds_no", rec.gds_no);
			rx.addCData(record, "gds_nm", rec.gds_nm);
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
