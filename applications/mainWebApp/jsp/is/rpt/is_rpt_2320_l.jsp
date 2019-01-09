<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.rpt.rec.*
	,	chosun.ciis.is.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_RPT_2320_LDataSet ds = (IS_RPT_2320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_RPT_2320_LCURLIST1Record rec = (IS_RPT_2320_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "sido", rec.sido);
			rx.add(record, "gu", rec.gu);
			rx.add(record, "purc_dlco_no_sort", rec.purc_dlco_no_sort);
			rx.add(record, "yyyy", rec.yyyy);
			rx.add(record, "sido_nm", rec.sido_nm);
			rx.add(record, "gu_nm", rec.gu_nm);
			rx.add(record, "purc_dlco_nm", rec.purc_dlco_nm);
			rx.add(record, "purc_dlco_no", rec.purc_dlco_no);
			rx.add(record, "o_amt", rec.o_amt);
			rx.add(record, "p_amt", rec.p_amt);
			rx.add(record, "r_amt", rec.r_amt);
			//rx.add(record, "r_rate", rec.r_rate);
			rx.add(record, "r_rate", DigitUtil.cutUnderPoint(rec.r_rate,2));
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
