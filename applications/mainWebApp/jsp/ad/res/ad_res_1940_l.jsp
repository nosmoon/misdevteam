<%@	page contentType="text/xml; charset=EUC-KR" %>


<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	AD_RES_1940_LDataSet ds = (AD_RES_1940_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int curlist3 = rx.add(root, "curlist3", "");
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1940_LCURLISTRecord rec = (AD_RES_1940_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist3, "record", "");
			rx.add(record, "sun", rec.sun);	
			rx.add(record, "sun_yn", "N");		
			rx.add(record, "mon", rec.mon);		
			rx.add(record, "mon_yn", "N");		
			rx.add(record, "tue", rec.tue);		
			rx.add(record, "tue_yn", "N");		
			rx.add(record, "wed", rec.wed);		
			rx.add(record, "wed_yn", "N");		
			rx.add(record, "thr", rec.thr);		
			rx.add(record, "thr_yn", "N");		
			rx.add(record, "fri", rec.fri);		
			rx.add(record, "fri_yn", "N");		
			rx.add(record, "sat", rec.sat);		
			rx.add(record, "sat_yn", "N");			
		}		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
