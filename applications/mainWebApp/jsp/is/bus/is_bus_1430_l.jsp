<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bus.rec.*
	,	chosun.ciis.is.bus.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BUS_1430_LDataSet ds = (IS_BUS_1430_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData3 = rx.add(root, "", "");

	try {
		/****** CURLIST_A BEGIN */
		for(int i = 0; i < ds.curlist_a.size(); i++) {
			IS_BUS_1430_LCURLIST_ARecord rec = (IS_BUS_1430_LCURLIST_ARecord)ds.curlist_a.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "dw_tgt_amt", rec.dw_tgt_amt);
			rx.add(record, "dw_rst_amt", rec.dw_rst_amt);
			//rx.add(record, "dw_rate", rec.dw_rate);
			rx.add(record, "dw_rate", DigitUtil.cutUnderPoint(rec.dw_rate,2));
			rx.add(record, "jw_rst_amt", rec.jw_rst_amt);
			//rx.add(record, "dw_j_rate", rec.dw_j_rate);
			rx.add(record, "dw_j_rate", DigitUtil.cutUnderPoint(rec.dw_j_rate,2));
			rx.add(record, "dm_tgt_amt", rec.dm_tgt_amt);
			rx.add(record, "dm_rst_amt", rec.dm_rst_amt);
			//rx.add(record, "dm_rate", rec.dm_rate);
			rx.add(record, "dm_rate", DigitUtil.cutUnderPoint(rec.dm_rate,2));
			rx.add(record, "jm_rst_amt", rec.jm_rst_amt);
			//rx.add(record, "dm_j_rate", rec.dm_j_rate);
			rx.add(record, "dm_j_rate", DigitUtil.cutUnderPoint(rec.dm_j_rate,2));
			rx.add(record, "dt_tgt_amt", rec.dt_tgt_amt);
			rx.add(record, "dy_tgt_amt", rec.dy_tgt_amt);
			rx.add(record, "dy_rst_amt", rec.dy_rst_amt);
			//rx.add(record, "dt_rate", rec.dt_rate);
			rx.add(record, "dt_rate", DigitUtil.cutUnderPoint(rec.dt_rate,2));
			//rx.add(record, "dy_rate", rec.dy_rate);
			rx.add(record, "dy_rate", DigitUtil.cutUnderPoint(rec.dy_rate,2));
			rx.add(record, "jy_rst_amt", rec.jy_rst_amt);
			//rx.add(record, "dy_j_rate", rec.dy_j_rate);
			rx.add(record, "dy_j_rate", DigitUtil.cutUnderPoint(rec.dy_j_rate,2));
		}
		/****** CURLIST_A END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
