<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.snd.rec.*
	,	chosun.ciis.is.snd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SND_1430_LDataSet ds = (IS_SND_1430_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData3 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SND_1430_LCURLISTRecord rec = (IS_SND_1430_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "wh_cd_nm", rec.wh_cd_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "qunt", rec.qunt);
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