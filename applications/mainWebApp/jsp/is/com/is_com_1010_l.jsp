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
	IS_COM_1010_LDataSet ds = (IS_COM_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_COM_1010_LCURLISTRecord rec = (IS_COM_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "advcs_cd", rec.advcs_cd);
			rx.addCData(record, "advcs_nm", rec.advcs_nm);
			rx.addCData(record, "tel_no", rec.tel_no);
			rx.addCData(record, "fax_no", rec.fax_no);
			rx.add(record, "sms_ptph_no", rec.sms_ptph_no);
			rx.add(record, "bizcond", rec.bizcond);
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
