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
	AD_PUB_1900_MDataSet ds = (AD_PUB_1900_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	   
	    //�ȳ����� 
	    int guid_sec_kind_cd = rx.add( tempData , "guid_sec_kind_cd" , "");	
		int item  = rx.add( guid_sec_kind_cd , "item" , "");
		rx.add ( item, "value", "");	
		rx.add ( item, "label", "��ü"); 
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_1900_MCURLISTRecord rec = (AD_PUB_1900_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( guid_sec_kind_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd + " " + rec.cd_abrv_nm);  
			
		}	
		
		//��ޱ��� 
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");
		int item2  = rx.add( hndl_clsf , "item" , "");
		rx.add ( item, "value", "");	
		rx.add ( item, "label", "��ü"); 
		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_1900_MCURLIST2Record rec = (AD_PUB_1900_MCURLIST2Record)ds.curlist2.get(i);
			item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item2, "value", rec.cd );
			rx.add ( item2, "label", rec.cd +" "+ rec.cdnm);
			
		}
		
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
