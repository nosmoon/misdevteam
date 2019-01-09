<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_1630_LDataSet ds = (AD_PUB_1630_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "gridData2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1630_LCURLISTRecord rec = (AD_PUB_1630_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "publ_std", rec.publ_std);
			rx.add(record, "slcrg_pers_nm", rec.slcrg_pers_nm);
			rx.add(record, "pubc_occr_dt", rec.pubc_occr_dt);
			rx.add(record, "pubc_occr_seq", rec.pubc_occr_seq);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Fri Jan 30 16:14:10 KST 2009 */ %>