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
	AD_PUB_2100_MDataSet ds = (AD_PUB_2100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	   
		//매체구분 
		int medi_cd = rx.add( tempData , "medi_cd" , "");	
		int item  = rx.add( medi_cd , "item" , "");
		rx.add ( item, "value", "");	
		rx.add ( item, "label", "전체"); 
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_2100_MCURLISTRecord rec = (AD_PUB_2100_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm ); 
			
		}
		
		//업종구분
		int indt_clsf = rx.add( tempData , "indt_clsf" , "");	
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_2100_MCURLIST2Record rec = (AD_PUB_2100_MCURLIST2Record)ds.curlist2.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm ); 
			
		}		

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
