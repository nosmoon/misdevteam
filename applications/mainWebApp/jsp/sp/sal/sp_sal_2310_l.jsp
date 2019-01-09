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
	SP_SAL_2310_LDataSet ds = (SP_SAL_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_2310_LCURLIST1Record rec = (SP_SAL_2310_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "deps_pers", rec.deps_pers);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_nm_1", rec.bo_nm_1);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "shft_noit", rec.shft_noit);
			rx.add(record, "payo_amt", rec.payo_amt);
			rx.add(record, "coms", rec.coms);
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
