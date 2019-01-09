<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_2700_MDataSet ds = (AD_PUB_2700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	   
	    //섹션    
	    int sect_no = rx.add( tempData , "sect_no" , "");	
		int item  = rx.add( sect_no , "item" , "");
		rx.add ( item, "value", "0");	
		rx.add ( item, "label", "전체"); 
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_2700_MCURLISTRecord rec = (AD_PUB_2700_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( sect_no , "item" , "");
			rx.add ( item, "value", rec.sect_cd ); 
			rx.add ( item, "label", rec.sect_cd ); 
			
		}	
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
