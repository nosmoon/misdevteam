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
	AD_PUB_3000_MDataSet ds = (AD_PUB_3000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		//매체구분 
		int medi_cd = rx.add( tempData , "medi_cd" , "");
		for(int i=0; i<ds.curlist1.size(); i++){
			AD_PUB_3000_MCURLISTRecord rec = (AD_PUB_3000_MCURLISTRecord)ds.curlist1.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm );
		}
		
		//그룹사구분 
		int grp_cmpy = rx.add( tempData , "grp_cmpy" , "");
		int item1  = rx.add( grp_cmpy , "item" , "");
		rx.add ( item1, "value",  "1"); 
		rx.add ( item1, "label", "4대그룹" );	
		item1  = rx.add( grp_cmpy , "item" , "");
		rx.add ( item1, "value",  "2"); 
		rx.add ( item1, "label", "중견기업" );			
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_3000_MCURLISTRecord rec = (AD_PUB_3000_MCURLISTRecord)ds.curlist2.get(i);
			item1  = rx.add( grp_cmpy , "item" , "");
			rx.add ( item1, "value", rec.cd ); 
			rx.add ( item1, "label", rec.cdnm );
		}
		
		//업종대구분 
		int indt_clsf_1 = rx.add( tempData , "indt_clsf_1" , "");
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_PUB_3000_MCURLISTRecord rec = (AD_PUB_3000_MCURLISTRecord)ds.curlist3.get(i);
			int item  = rx.add( indt_clsf_1 , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm );
			rx.add ( item, "pcode", "");
		}
		
		//업종소구분 
		int indt_clsf_2 = rx.add( tempData , "indt_clsf_2" , "");
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_PUB_3000_MCURLISTRecord rec = (AD_PUB_3000_MCURLISTRecord)ds.curlist4.get(i);
			int item  = rx.add( indt_clsf_2 , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm );
			rx.add ( item, "pcode", rec.mang_cd_1);
		}
		
		//유형대구분 
		int type_clsf_1 = rx.add( tempData , "type_clsf_1" , "");
		for(int i=0; i<ds.curlist5.size(); i++){
			AD_PUB_3000_MCURLISTRecord rec = (AD_PUB_3000_MCURLISTRecord)ds.curlist5.get(i);
			int item  = rx.add( type_clsf_1 , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm );
			rx.add ( item, "pcode", "");
		}
		
		//유형소구분 
		int type_clsf_2 = rx.add( tempData , "type_clsf_2" , "");
		for(int i=0; i<ds.curlist6.size(); i++){
			AD_PUB_3000_MCURLISTRecord rec = (AD_PUB_3000_MCURLISTRecord)ds.curlist6.get(i);
			int item  = rx.add( type_clsf_2 , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm );
			rx.add ( item, "pcode", rec.mang_cd_1);
		}
		
		//거래처구분 
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");
		for(int i=0; i<ds.curlist7.size(); i++){
			AD_PUB_3000_MCURLISTRecord rec = (AD_PUB_3000_MCURLISTRecord)ds.curlist7.get(i);
			int item  = rx.add( hndl_clsf , "item" , "");
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
