<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*
	,	chosun.ciis.co.base.util.*;
	"
%>

<%   
	RwXml rx = new RwXml();
	AD_CO_1001_LDataSet ds = (AD_CO_1001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");

	try {
		int gridData2 = rx.add(root, "gridData2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {  
			AD_CO_1001_LCURLISTRecord rec = (AD_CO_1001_LCURLISTRecord)ds.curlist.get(i);
			
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "major", rec.major);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>


<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>