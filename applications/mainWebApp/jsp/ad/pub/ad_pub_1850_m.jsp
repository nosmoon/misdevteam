<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_1850_MDataSet ds = (AD_PUB_1850_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try
	{  
	    //매체구분 
	    int medi_cd = rx.add( tempData , "medi_cd" , "");
		int item  = rx.add( medi_cd , "item" , "");
		
		for(int i=0; i<ds.curlist.size(); i++)
		{
			AD_PUB_1850_MCURLISTRecord rec = (AD_PUB_1850_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm); 
			
		}	
		
		//거래처구분 
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");
		int item2  = rx.add( hndl_clsf , "item" , "");
		rx.add ( item, "value", "");	
		rx.add ( item, "label", "전체"); 
		
		for(int i=0; i<ds.curlist2.size(); i++)
		{
			AD_PUB_1850_MCURLIST2Record rec = (AD_PUB_1850_MCURLIST2Record)ds.curlist2.get(i);
			item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item2, "value", rec.cd );
			rx.add ( item2, "label", rec.cd +" "+ rec.cdnm);
			
		}
		
		
		//게재구분 
		int pubc_clsf = rx.add( tempData , "pubc_clsf" , "");
		int item9  = rx.add( pubc_clsf , "item" , "");
		//rx.add ( item9, "value", "");	
		//rx.add ( item9, "label", "전체");
		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_PUB_1850_MCURLIST3Record rec = (AD_PUB_1850_MCURLIST3Record)ds.curlist3.get(i);
			item  = rx.add( pubc_clsf , "item" , "");
			rx.add ( item9, "value", rec.cd );
			rx.add ( item9, "label", rec.cd +" "+ rec.cd_abrv_nm);
			
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
