<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.trip.rec.*
	,	chosun.ciis.hd.trip.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_TRIP_1006_LDataSet ds = (HD_TRIP_1006_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData2 = rx.add(root, "tempData2", "");

	try {
	
		int dtl_medi_cd = rx.add( tempData2 , "dtl_medi_cd" , "");		
		for(int i=0; i<ds.curlist.size(); i++){
			HD_TRIP_1006_LCURLISTRecord rec = (HD_TRIP_1006_LCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( dtl_medi_cd , "item" , "");
			
			rx.add(item, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(item, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(item, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd) + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>