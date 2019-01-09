<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_AGR_2610_LDataSet ds = (IS_AGR_2610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_2610_LCURLISTRecord rec = (IS_AGR_2610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "t_no", rec.t_no);
			rx.add(record, "sale_clsf", rec.sale_clsf);
			rx.add(record, "spc_sale_clsf", rec.spc_sale_clsf);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "spc_sale_clsf_nm", rec.spc_sale_clsf_nm);
			rx.add(record, "suply_amt_cur", rec.suply_amt_cur);
			rx.add(record, "purc_amt_cur", rec.purc_amt_cur);
			rx.add(record, "suply_amt_bef", rec.suply_amt_bef);
			rx.add(record, "purc_amt_bef", rec.purc_amt_bef);
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
