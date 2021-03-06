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
	AD_CO_1000_LDataSet ds = (AD_CO_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {
		  
		int gridData1 = rx.add(resData, "gridData1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_CO_1000_LCURLISTRecord rec = (AD_CO_1000_LCURLISTRecord)ds.curlist.get(i);
			
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		} 
		
		int gridData2 = rx.add(resData, "gridData2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {  
			AD_CO_1000_LCURLIST2Record rec = (AD_CO_1000_LCURLIST2Record)ds.curlist2.get(i);
			
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


<% /* �ۼ��ð� : Wed Jan 21 21:10:45 KST 2009 */ %>