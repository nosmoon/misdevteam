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
	IS_RPT_1220_LDataSet ds = (IS_RPT_1220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData3 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_RPT_1220_LCURLIST1Record rec = (IS_RPT_1220_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "dm_tgt_amt", rec.dm_tgt_amt);
			rx.add(record, "dm_rst_amt", rec.dm_rst_amt);
			//rx.add(record, "dm_d_rate", rec.dm_d_rate);
			rx.add(record, "dm_d_rate", DigitUtil.cutUnderPoint(rec.dm_d_rate,2));
			rx.add(record, "dm_tgt_amt_s", rec.dm_tgt_amt_s);
			rx.add(record, "dm_rst_amt_s", rec.dm_rst_amt_s);
			//rx.add(record, "dm_d_rate_s", rec.dm_d_rate_s);
			rx.add(record, "dm_d_rate_s", DigitUtil.cutUnderPoint(rec.dm_d_rate_s,2));
			rx.add(record, "ty_tgt_amt", rec.ty_tgt_amt);
			rx.add(record, "ny_tgt_amt", rec.ny_tgt_amt);
			rx.add(record, "ny_rst_amt", rec.ny_rst_amt);
			//rx.add(record, "ny_d_rate", rec.ny_d_rate);
			rx.add(record, "ny_d_rate", DigitUtil.cutUnderPoint(rec.ny_d_rate,2));
			rx.add(record, "pl_rst_amt", rec.pl_rst_amt);
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
