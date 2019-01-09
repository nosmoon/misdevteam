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
	AD_PUB_3220_LDataSet ds = (AD_PUB_3220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData2", "");
	int gd_dlco = rx.add(resData, "gd_dlco", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3220_LCURLISTRecord rec = (AD_PUB_3220_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gd_dlco, "record", "");
			
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);  
			rx.add(record, "dlco_nm", 	   rec.dlco_nm);
			rx.add(record, "dlco_no",      rec.dlco_no); 
			rx.add(record, "dn",           rec.dn); 
			rx.add(record, "cm",           rec.cm); 						
			rx.add(record, "uprc",         rec.uprc);			
			rx.add(record, "advt_fee",     rec.advt_fee);
			rx.add(record, "indt_clsf_nm", rec.indt_clsf_nm); 						
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
