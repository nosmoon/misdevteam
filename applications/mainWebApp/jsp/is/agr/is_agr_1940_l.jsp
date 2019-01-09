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
	IS_AGR_1940_LDataSet ds = (IS_AGR_1940_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData3 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_1940_LCURLISTRecord rec = (IS_AGR_1940_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "t_no", rec.t_no);
			rx.add(record, "spc_sale_clsf_nm", rec.spc_sale_clsf_nm);
			rx.add(record, "scat_year", rec.scat_year);
			rx.add(record, "mm01", rec.mm01);
			rx.add(record, "mm02", rec.mm02);
			rx.add(record, "mm03", rec.mm03);
			rx.add(record, "mm04", rec.mm04);
			rx.add(record, "mm05", rec.mm05);
			rx.add(record, "mm06", rec.mm06);
			rx.add(record, "mm07", rec.mm07);
			rx.add(record, "mm08", rec.mm08);
			rx.add(record, "mm09", rec.mm09);
			rx.add(record, "mm10", rec.mm10);
			rx.add(record, "mm11", rec.mm11);
			rx.add(record, "mm12", rec.mm12);
			rx.add(record, "amt_tot", rec.amt_tot);
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
