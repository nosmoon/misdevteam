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
	SP_SAL_2620_LDataSet ds = (SP_SAL_2620_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");
	
	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_2620_LCURLISTRecord rec = (SP_SAL_2620_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "ern", rec.ern);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "sale_item_cd_nm", rec.sale_item_cd_nm);
			rx.addCData(record, "gds_nm", rec.gds_nm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "stot_amt", rec.stot_amt);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "sale_item_cd_sort", rec.sale_item_cd_sort);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "sale_item_cd", rec.sale_item_cd);
			rx.add(record, "rsort", rec.rsort);
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
