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
	SP_SUP_1410_LDataSet ds = (SP_SUP_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SUP_1410_LCURLISTRecord rec = (SP_SUP_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "acpn_dt", rec.acpn_dt);
			rx.add(record, "acpn_dt_tm", rec.acpn_dt_tm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "rdr_nm", rec.rdr_nm);
			rx.add(record, "cns_clsf_nm", rec.cns_clsf_nm);
			rx.add(record, "proc_clsf_nm", rec.proc_clsf_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "acpn_no", rec.acpn_no);
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
