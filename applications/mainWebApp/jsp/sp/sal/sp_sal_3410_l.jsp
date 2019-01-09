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
	SP_SAL_3410_LDataSet ds = (SP_SAL_3410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURRLIST BEGIN */
		for(int i = 0; i < ds.currlist.size(); i++) {
			SP_SAL_3410_LCURRLISTRecord rec = (SP_SAL_3410_LCURRLISTRecord)ds.currlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "corp_clsf_nm", rec.corp_clsf_nm);
			rx.add(record, "dlco_nm2", rec.dlco_nm2);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "qty_2", rec.qty_2);
			rx.add(record, "dlv_fee", rec.dlv_fee);
		}
		/****** CURRLIST END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
