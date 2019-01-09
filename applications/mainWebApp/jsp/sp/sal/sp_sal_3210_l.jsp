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
	SP_SAL_3210_LDataSet ds = (SP_SAL_3210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_3210_LCURLISTRecord rec = (SP_SAL_3210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "suply_pers_nm", rec.suply_pers_nm);
			rx.add(record, "ordr_dt", rec.ordr_dt);
			rx.add(record, "doco_no", rec.doco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "bo_addr", rec.bo_addr);
			rx.add(record, "gds_nm", rec.gds_nm);
			rx.add(record, "stot_amt", rec.stot_amt);
			rx.add(record, "sale_cost", rec.sale_cost);
			rx.add(record, "profit_rate", DigitUtil.cutUnderPoint(rec.profit_rate,2));
			rx.add(record, "profit_amt", rec.profit_amt);
			rx.add(record, "clamt_mthd", rec.clamt_mthd);
			rx.add(record, "div_cnt", rec.div_cnt);
			rx.add(record, "sale_yymm", rec.sale_yymm);
			rx.add(record, "div_01", rec.div_01);
			rx.add(record, "div_02", rec.div_02);
			rx.add(record, "div_03", rec.div_03);
			rx.add(record, "div_04", rec.div_04);
			rx.add(record, "div_05", rec.div_05);
			rx.add(record, "div_06", rec.div_06);
			rx.add(record, "div_07", rec.div_07);
			rx.add(record, "div_08", rec.div_08);
			rx.add(record, "div_09", rec.div_09);
			rx.add(record, "div_10", rec.div_10);
			rx.add(record, "div_11", rec.div_11);
			rx.add(record, "div_12", rec.div_12);
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
