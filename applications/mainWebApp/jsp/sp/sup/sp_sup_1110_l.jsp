<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sup.rec.*
	,	chosun.ciis.sp.sup.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SUP_1110_LDataSet ds = (SP_SUP_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SUP_1110_LCURLISTRecord rec = (SP_SUP_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sort", rec.sort);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "rslt_110", rec.rslt_110);
			rx.add(record, "rslt_111", rec.rslt_111);
			rx.add(record, "rslt_120", rec.rslt_120);
			rx.add(record, "rslt_121", rec.rslt_121);
			rx.add(record, "rslt_122", rec.rslt_122);
			rx.add(record, "rslt_130", rec.rslt_130);
			rx.add(record, "rslt_131", rec.rslt_131);
			rx.add(record, "rslt_132", rec.rslt_132);
			rx.add(record, "rslt_133", rec.rslt_133);
			rx.add(record, "rslt_134", rec.rslt_134);
			rx.add(record, "rslt_140", DigitUtil.cutUnderPoint(rec.rslt_140,2));
			rx.add(record, "rslt_141", DigitUtil.cutUnderPoint(rec.rslt_141,2));
			rx.add(record, "rslt_142", rec.rslt_142);
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
