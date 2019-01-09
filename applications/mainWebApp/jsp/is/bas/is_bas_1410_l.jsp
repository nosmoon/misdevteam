<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bas.rec.*
	,	chosun.ciis.is.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BAS_1410_LDataSet ds = (IS_BAS_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_1410_LCURLISTRecord rec = (IS_BAS_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dlco_cd_seq", rec.dlco_cd_seq);
			rx.addCData(record, "dlco_abrv_nm", rec.dlco_abrv_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "fax_no", rec.fax_no);
			rx.add(record, "corp_clsf_nm", rec.corp_clsf_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "bizcond", rec.bizcond);
			rx.add(record, "item", rec.item);
			rx.addCData(record, "addr", rec.addr);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
