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
	IS_AGR_1620_LDataSet ds = (IS_AGR_1620_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_1620_LCURLISTRecord rec = (IS_AGR_1620_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "scat_mm", rec.scat_mm);
			rx.add(record, "indt_nm", rec.indt_nm);
			rx.add(record, "ord_amt_01", rec.ord_amt_01);
			rx.add(record, "purc_amt_01", rec.purc_amt_01);
			rx.add(record, "prft_amt_01", rec.prft_amt_01);
			//rx.add(record, "prft_rate_01", rec.prft_rate_01);
			rx.add(record, "prft_rate_01", DigitUtil.cutUnderPoint(rec.prft_rate_01,2));
			rx.add(record, "ord_amt_02", rec.ord_amt_02);
			rx.add(record, "purc_amt_02", rec.purc_amt_02);
			rx.add(record, "prft_amt_02", rec.prft_amt_02);
			//rx.add(record, "prft_rate_02", rec.prft_rate_02);
			rx.add(record, "prft_rate_02", DigitUtil.cutUnderPoint(rec.prft_rate_02,2));
			//rx.add(record, "t_no", rec.t_no);
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
