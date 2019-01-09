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
	IS_SND_1120_LDataSet ds = (IS_SND_1120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_SND_1120_LCURLIST1Record rec = (IS_SND_1120_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "send_yn", rec.send_yn);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
		}
		/****** CURLIST1 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
