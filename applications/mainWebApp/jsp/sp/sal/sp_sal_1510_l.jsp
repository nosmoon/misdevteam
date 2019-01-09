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
	SP_SAL_1510_LDataSet ds = (SP_SAL_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_1510_LCURLIST1Record rec = (SP_SAL_1510_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sale_yymm", rec.sale_yymm);
			rx.add(record, "cmpy_dlco_no", rec.cmpy_dlco_no);
			rx.add(record, "cmpy_dlco_nm", rec.cmpy_dlco_nm);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "qty_2", rec.qty_2);
			rx.add(record, "dlv_fee", rec.dlv_fee);
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
