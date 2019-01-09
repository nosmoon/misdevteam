<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.com.rec.*
	,	chosun.ciis.is.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_COM_1110_LDataSet ds = (IS_COM_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_COM_1110_LCURLISTRecord rec = (IS_COM_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dlco_cd_seq", rec.dlco_cd_seq);
			rx.addCData(record, "dlco_abrv_nm", rec.dlco_abrv_nm);
			rx.add(record, "ern", rec.ern);
			rx.addCData(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "corp_clsf_nm", rec.corp_clsf_nm);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "asnt_dstc_cd", rec.asnt_dstc_cd);     
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
