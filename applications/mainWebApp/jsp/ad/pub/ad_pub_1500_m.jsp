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
	AD_PUB_1500_MDataSet ds = (AD_PUB_1500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	   
	    //영업담당자  
	    int slcrg_pers = rx.add( tempData , "slcrg_pers" , "");	
		int item  = rx.add( slcrg_pers , "item" , "");
		rx.add ( item, "value", "");	
		rx.add ( item, "label", "전체"); 
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_1500_MCURLISTRecord rec = (AD_PUB_1500_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( slcrg_pers , "item" , "");
			rx.add ( item, "value", rec.acct_id ); 
			rx.add ( item, "label", rec.acct_nm ); 
		}	
		
		//조정증감사유서_매체구분 
		int medi_cd = rx.add( tempData , "medi_cd" , "");	
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_1500_MCURLIST2Record rec = (AD_PUB_1500_MCURLIST2Record)ds.curlist2.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm ); 
		}
		
		//조정증감사유서작성_매체구분 
		int medi_cd2 = rx.add( tempData , "medi_cd2" , "");	
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_PUB_1500_MCURLIST3Record rec = (AD_PUB_1500_MCURLIST3Record)ds.curlist3.get(i);
			item  = rx.add( medi_cd2 , "item" , "");
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
