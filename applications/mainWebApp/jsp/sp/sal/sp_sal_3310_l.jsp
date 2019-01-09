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
	SP_SAL_3310_LDataSet ds = (SP_SAL_3310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_3310_LCURLISTRecord rec = (SP_SAL_3310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.addCData(record, "suply_pers_nm", rec.suply_pers_nm);
			rx.add(record, "doco_no", rec.doco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "sp_comp_chrg_pers_emp_nm", rec.sp_comp_chrg_pers_emp_nm);
			rx.addCData(record, "gds_nm", rec.gds_nm);
			rx.add(record, "ordr_dt", rec.ordr_dt);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "buy_unit_price", rec.buy_unit_price);
			rx.add(record, "buy_amt", rec.buy_amt);
			rx.add(record, "buy_vat_amt", rec.buy_vat_amt);
			rx.add(record, "btot_amt", DigitUtil.cutUnderPoint(rec.btot_amt,2));
			rx.add(record, "sale_unit_price", rec.sale_unit_price);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "sale_vat_amt", rec.sale_vat_amt);
			rx.add(record, "stot_amt", DigitUtil.cutUnderPoint(rec.stot_amt,2));
			rx.add(record, "profit_amt", rec.profit_amt);
			rx.add(record, "profit_rate", DigitUtil.cutUnderPoint(rec.profit_rate,2));
			rx.add(record, "clamt", rec.clamt);
			rx.add(record, "mi_amt", rec.mi_amt);
			rx.add(record, "chrg_pers", rec.chrg_pers);
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
