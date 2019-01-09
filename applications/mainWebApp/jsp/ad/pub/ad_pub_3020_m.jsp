<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_3020_MDataSet ds = (AD_PUB_3020_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
		int gridData = rx.add(root, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3020_MCURLISTRecord rec = (AD_PUB_3020_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "sun", rec.sun);
			rx.add(record, "sun_yn", rec.sun_yn);
			rx.add(record, "mon", rec.mon);
			rx.add(record, "mon_yn", rec.mon_yn);
			rx.add(record, "tue", rec.tue);
			rx.add(record, "tue_yn", rec.tue_yn);
			rx.add(record, "wed", rec.wed);
			rx.add(record, "wed_yn", rec.wed_yn);
			rx.add(record, "thr", rec.thr);
			rx.add(record, "thr_yn", rec.thr_yn);
			rx.add(record, "fri", rec.fri);
			rx.add(record, "fri_yn", rec.fri_yn);
			rx.add(record, "sat", rec.sat);
			rx.add(record, "sat_yn", rec.sat_yn);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>