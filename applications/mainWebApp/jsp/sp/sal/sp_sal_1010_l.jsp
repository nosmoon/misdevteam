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
	SP_SAL_1010_LDataSet ds = (SP_SAL_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_1010_LCURLIST1Record rec = (SP_SAL_1010_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "rcpm_clsf1", rec.rcpm_clsf1);
			rx.add(record, "sale_amt1", rec.sale_amt1);
			rx.add(record, "rcpm_clsf2", rec.rcpm_clsf2);
			rx.add(record, "sale_amt2", rec.sale_amt2);
			rx.add(record, "sale_amt3", rec.sale_amt3);
			rx.add(record, "sale_amt4", rec.sale_amt4);
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
