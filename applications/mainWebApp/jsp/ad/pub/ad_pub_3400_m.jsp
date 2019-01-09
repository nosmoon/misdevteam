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
	AD_PUB_3400_MDataSet ds = (AD_PUB_3400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	try {
		
		//브랜드코드
		int brnd_cd = rx.add( tempData , "brnd_cd" , "");
			
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_3400_MCURLISTRecord rec = (AD_PUB_3400_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( brnd_cd , "item" , "");
			rx.add( item, "value", rec.cd );
			rx.addCData( item, "label", rec.cdnm);
		}
		
		//공급처
		int spl_dlco = rx.add( tempData , "spl_dlco" , "");
				
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_3400_MCURLIST2Record rec = (AD_PUB_3400_MCURLIST2Record)ds.curlist2.get(i);
			int item2  = rx.add( spl_dlco , "item" , "");
			rx.add( item2, "value", rec.cd );
			rx.addCData( item2, "label", rec.cdnm);	 		
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
