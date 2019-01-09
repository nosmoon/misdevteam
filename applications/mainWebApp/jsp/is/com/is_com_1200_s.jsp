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
	IS_COM_1200_SDataSet ds = (IS_COM_1200_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	int record		= 0;
	formData = rx.add(root, "tempData", "");
	
	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_COM_1200_SCURLISTRecord rec = (IS_COM_1200_SCURLISTRecord)ds.curlist.get(i);
			record = rx.add(formData, "record", "");
			rx.add(record, "dlco_clsf_cd_seq", rec.dlco_clsf_cd_seq);
			rx.add(record, "dlco_abrv_nm", rec.dlco_abrv_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
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
