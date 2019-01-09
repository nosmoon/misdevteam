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
	IS_BAS_1610_LDataSet ds = (IS_BAS_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");


	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_1610_LCURLISTRecord rec = (IS_BAS_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "area_cd", rec.area_cd);
			rx.addCData(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.addCData(record, "bo_addr", rec.bo_addr);
			rx.add(record, "cntr_stat_clsf", rec.cntr_stat_clsf);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "a_bo_seq", rec.a_bo_seq);
			rx.add(record, "a_area_cd", rec.a_area_cd);
			rx.addCData(record, "a_bo_nm", rec.a_bo_nm);
			rx.addCData(record, "a_bo_head_nm", rec.a_bo_head_nm);
			rx.addCData(record, "a_bo_addr", rec.a_bo_addr);
			rx.add(record, "a_cntr_stat_clsf", rec.a_cntr_stat_clsf);
			rx.add(record, "a_dlco_no", rec.a_dlco_no);
			rx.add(record, "a_ern", rec.a_ern);
			rx.add(record, "a_chg_dt_tm", rec.a_chg_dt_tm);
			rx.add(record, "s_bo_seq", rec.s_bo_seq);
			rx.add(record, "s_area_cd", rec.s_area_cd);
			rx.add(record, "s_bo_nm", rec.s_bo_nm);
			rx.addCData(record, "s_bo_head_nm", rec.s_bo_head_nm);
			rx.addCData(record, "s_bo_addr", rec.s_bo_addr);
			rx.add(record, "s_cntr_stat_clsf", rec.s_cntr_stat_clsf);
			rx.add(record, "s_dlco_no", rec.s_dlco_no);
			rx.add(record, "s_ern", rec.s_ern);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
