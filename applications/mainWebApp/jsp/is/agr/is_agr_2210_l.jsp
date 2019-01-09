<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_AGR_2210_LDataSet ds = (IS_AGR_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_2210_LCURLISTRecord rec = (IS_AGR_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd", rec.sub_dept_cd);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "cur_cnt", rec.cur_cnt);
			rx.add(record, "bef_cnt", rec.bef_cnt);
			//rx.add(record, "cnt_rate", rec.cnt_rate);
			rx.add(record, "cnt_rate", DigitUtil.cutUnderPoint(rec.cnt_rate,2));
			rx.add(record, "cur_suply_amt", rec.cur_suply_amt);
			rx.add(record, "bef_suply_amt", rec.bef_suply_amt);
			//rx.add(record, "suply_amt_rate", rec.suply_amt_rate);
			rx.add(record, "suply_amt_rate", DigitUtil.cutUnderPoint(rec.suply_amt_rate,2));
			rx.add(record, "scat_dt_fr", rec.scat_dt_fr);
			rx.add(record, "scat_dt_to", rec.scat_dt_to);
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
