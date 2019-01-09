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
	IS_RPT_1040_LDataSet ds = (IS_RPT_1040_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData4 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_RPT_1040_LCURLIST1Record rec = (IS_RPT_1040_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData4, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "sub_dept_cd", rec.sub_dept_cd);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "m_rd_amt", rec.m_rd_amt);
			rx.add(record, "m_cd_amt", rec.m_cd_amt);
			rx.add(record, "m_tm_amt", rec.m_tm_amt);
			rx.add(record, "m_rm_amt", rec.m_rm_amt);
			rx.add(record, "s_rd_amt", rec.s_rd_amt);
			rx.add(record, "s_cd_amt", rec.s_cd_amt);
			rx.add(record, "s_tm_amt", rec.s_tm_amt);
			rx.add(record, "s_rm_amt", rec.s_rm_amt);
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
