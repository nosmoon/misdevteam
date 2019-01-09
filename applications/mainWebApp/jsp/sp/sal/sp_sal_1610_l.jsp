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
	SP_SAL_1610_LDataSet ds = (SP_SAL_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_1610_LCURLISTRecord rec = (SP_SAL_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "car_ownr_nm", rec.car_ownr_nm);
			rx.add(record, "car_no", rec.car_no);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "engn_dsplt", rec.engn_dsplt);
			rx.add(record, "insr_entr_hope_yn", rec.insr_entr_hope_yn);
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "proc_clsf", rec.proc_clsf);
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
