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
	IS_AGR_2310_LDataSet ds = (IS_AGR_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_2310_LCURLISTRecord rec = (IS_AGR_2310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "t_no", rec.t_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "s_purc_amt", rec.s_purc_amt);
			rx.add(record, "prft_amt", rec.prft_amt);
			//rx.add(record, "prft_rate", rec.prft_rate);
			rx.add(record, "prft_rate", DigitUtil.cutUnderPoint(rec.prft_rate,2));
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
