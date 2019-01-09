<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.rpt.rec.*
	,	chosun.ciis.is.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_RPT_1050_LDataSet ds = (IS_RPT_1050_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_RPT_1050_LCURLIST1Record rec = (IS_RPT_1050_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "scat_dt", rec.scat_dt);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			//rx.add(record, "uprc", rec.uprc);
			rx.add(record, "uprc", DigitUtil.cutUnderPoint(rec.uprc,2));
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "suply_amt", rec.suply_amt);
			//rx.add(record, "avg_purc_uprc", rec.avg_purc_uprc);
			rx.add(record, "avg_purc_uprc", DigitUtil.cutUnderPoint(rec.avg_purc_uprc,2));
			rx.add(record, "tot_purc_amt", rec.tot_purc_amt);
			rx.add(record, "i_amt", rec.i_amt);
			rx.add(record, "i_amt_rate", rec.i_amt_rate);
			rx.add(record, "i_amt_rate", DigitUtil.cutUnderPoint(rec.i_amt_rate,2));
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
