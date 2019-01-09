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
	SP_SAL_2630_LDataSet ds = (SP_SAL_2630_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData3 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_2630_LCURLISTRecord rec = (SP_SAL_2630_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "sale_item_cd_sort", rec.sale_item_cd_sort);
			rx.addCData(record, "sale_item_cd_nm", rec.sale_item_cd_nm);
			rx.addCData(record, "gds_nm", rec.gds_nm);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "stot_amt", rec.stot_amt);
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
