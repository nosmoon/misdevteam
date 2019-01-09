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
	IS_SND_1240_LDataSet ds = (IS_SND_1240_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData4 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SND_1240_LCURLISTRecord rec = (IS_SND_1240_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData4, "record", "");
			rx.add(record, "checked", "N");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "cmpy_cd_nm", rec.cmpy_cd_nm);			
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.add(record, "asnt_dstc_cd", rec.asnt_dstc_cd);			
			rx.add(record, "purc_dlco_no", rec.purc_dlco_no);
			rx.add(record, "purc_dlco_nm", rec.purc_dlco_nm);

 	
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
