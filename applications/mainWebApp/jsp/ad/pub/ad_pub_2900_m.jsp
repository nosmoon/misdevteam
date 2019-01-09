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
	AD_PUB_2900_MDataSet ds = (AD_PUB_2900_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	   
	    //¸Å
	    int medi_cd = rx.add( tempData , "medi_cd" , "");	
		int item  = rx.add( medi_cd , "item" , "");
		rx.add ( item, "value", "100");	
		rx.add ( item, "label", "ÀüÃ¼"); 
		
		for(int i=0; i<ds.curlist1.size(); i++){
			AD_PUB_2900_MCURLIST1Record rec = (AD_PUB_2900_MCURLIST1Record)ds.curlist1.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm ); 
			
		}	
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
