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
	AD_PUB_2000_MDataSet ds = (AD_PUB_2000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	   
	    //영업담당자  
	    int slcrg_pers = rx.add( tempData , "slcrg_pers" , "");	
		int item  = rx.add( slcrg_pers , "item" , "");
		rx.add ( item, "value", "");	
		rx.add ( item, "label", "전체"); 
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_2000_MCURLISTRecord rec = (AD_PUB_2000_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( slcrg_pers , "item" , "");
			rx.add ( item, "value", rec.acct_id ); 
			rx.add ( item, "label", rec.acct_nm ); 
			
		}	
		
		//업종구분(대분류)
		int indt_clsf = rx.add( tempData , "indt_clsf" , "");	
		try{
			for(int i=0; i<1; i++){
				AD_PUB_2000_MCURLIST2Record rec = (AD_PUB_2000_MCURLIST2Record)ds.curlist2.get(i);
				int item2  = rx.add( indt_clsf , "item" , "");
				rx.add ( item2, "value", "" ); 
				rx.add ( item2, "label", "전체" );
				rx.add ( item2, "pcode", rec.mang_cd_1);
			}
		}catch(Exception ignore){
		}
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_2000_MCURLIST2Record rec = (AD_PUB_2000_MCURLIST2Record)ds.curlist2.get(i);
			int item2  = rx.add( indt_clsf , "item" , "");
			rx.add ( item2, "value", rec.cd ); 
			rx.add ( item2, "label", rec.cdnm );
			rx.add ( item2, "pcode", "");
		}
		
		//업종구분(중분류)
		int indt_clsf2 = rx.add( tempData , "indt_clsf2" , "");	
		String pre_pcode = "";
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_PUB_2000_MCURLIST3Record rec = (AD_PUB_2000_MCURLIST3Record)ds.curlist3.get(i);
			if(!pre_pcode.equals(rec.mang_cd_1)){
				int item3  = rx.add( indt_clsf2 , "item" , "");
				rx.add ( item3, "value", "" ); 
				rx.add ( item3, "label", "전체" ); 
				rx.add ( item3, "pcode", rec.mang_cd_1 );				
			}
			int item3  = rx.add( indt_clsf2 , "item" , "");
			rx.add ( item3, "value", rec.cd ); 
			rx.add ( item3, "label", rec.cdnm ); 
			rx.add ( item3, "pcode", rec.mang_cd_1 );			
			
			pre_pcode = rec.mang_cd_1;
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
