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
	IS_BUS_1550_LDataSet ds = (IS_BUS_1550_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData5 = rx.add(root, "", "");

	try {
		/****** CURLIST_A BEGIN */
		for(int i = 0; i < ds.curlist_a.size(); i++) {
			IS_BUS_1550_LCURLIST_ARecord rec = (IS_BUS_1550_LCURLIST_ARecord)ds.curlist_a.get(i);
			int record = rx.add(gridData5, "record", "");
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "dm_amt_1", rec.dm_amt_1);
			rx.add(record, "dm_amt_2", rec.dm_amt_2);
			rx.add(record, "dm_amt", rec.dm_amt);
			rx.add(record, "jm_amt_1", rec.jm_amt_1);
			rx.add(record, "jm_amt_2", rec.jm_amt_2);
			rx.add(record, "jm_amt", rec.jm_amt);
			//rx.add(record, "m_amt_1_rate", rec.m_amt_1_rate);
			rx.add(record, "m_amt_1_rate", DigitUtil.cutUnderPoint(rec.m_amt_1_rate,2));
			//rx.add(record, "m_amt_2_rate", rec.m_amt_2_rate);
			rx.add(record, "m_amt_2_rate", DigitUtil.cutUnderPoint(rec.m_amt_2_rate,2));
			//rx.add(record, "m_amt_rate", rec.m_amt_rate);
			rx.add(record, "m_amt_rate", DigitUtil.cutUnderPoint(rec.m_amt_rate,2));
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