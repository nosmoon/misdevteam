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
	IS_AGR_1030_LDataSet ds = (IS_AGR_1030_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int recordSet = 0;
	int resForm2   = rx.add(root, "resForm2", "");
	
	try {
		/****** CURLIST BEGIN */
		int gridData1 = rx.add(resForm2, "gridData1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_1030_LCURLISTRecord rec = (IS_AGR_1030_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "b_dlco_clsf_cd_seq", rec.a_dlco_clsf_cd_seq);
			rx.add(record, "b_dlco_abrv_nm", rec.a_dlco_abrv_nm);
			rx.add(record, "b_dlco_nm", rec.a_dlco_nm);
			rx.add(record, "b_asnt_dstc_cd", rec.a_asnt_dstc_cd);
			rx.add(record, "b_asnt_dstc_cd_nm", rec.a_asnt_dstc_cd_nm);
			rx.add(record, "b_send_qty", rec.send_qty);
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
