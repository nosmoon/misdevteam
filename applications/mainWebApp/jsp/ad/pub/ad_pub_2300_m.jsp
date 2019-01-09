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
	AD_PUB_2300_MDataSet ds = (AD_PUB_2300_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	   
	    //매체구분 
	    int medi_cd = rx.add( tempData , "medi_cd" , "");	
		int item  = rx.add( medi_cd , "item" , "");
		//rx.add ( item, "value", "");	
		//rx.add ( item, "label", "전체"); 
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_2300_MCURLISTRecord rec = (AD_PUB_2300_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd +" "+ rec.cd_abrv_nm); 
			
		}	
		
		//거래처구분 
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");
		int item2  = rx.add( hndl_clsf , "item" , "");
		rx.add ( item2, "value", "");	
		rx.add ( item2, "label", "전체"); 
		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_2300_MCURLIST2Record rec = (AD_PUB_2300_MCURLIST2Record)ds.curlist2.get(i);
			item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item2, "value", rec.cd );
			rx.add ( item2, "label", rec.cd +" "+ rec.cdnm);
			
		}
		
		
		//규격 
		int std_clsf = rx.add( tempData , "std_clsf" , "");
		int item4  = rx.add( std_clsf , "item" , "");
		rx.add ( item4, "value", "");	
		rx.add ( item4, "label", "전체"); 
		
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_PUB_2300_MCURLIST4Record rec = (AD_PUB_2300_MCURLIST4Record)ds.curlist4.get(i);
			item  = rx.add( std_clsf , "item" , "");
			rx.add ( item4, "value", rec.cd );
			rx.add ( item4, "label", rec.cd_abrv_nm);
			
		}
		
		//지종구분
		int nwsp_type_clsf = rx.add( tempData , "nwsp_type_clsf" , "");
		int item5  = rx.add( nwsp_type_clsf , "item" , "");
		rx.add ( item5, "value", "");	
		rx.add ( item5, "label", "전체"); 
		
		for(int i=0; i<ds.curlist5.size(); i++){
			AD_PUB_2300_MCURLIST5Record rec = (AD_PUB_2300_MCURLIST5Record)ds.curlist5.get(i);
			item  = rx.add( nwsp_type_clsf , "item" , "");
			rx.add ( item5, "value", rec.cd );
			rx.add ( item5, "label", StringUtil.substr(rec.cd,1,2) +" "+ rec.cd_abrv_nm); 
			 
		}
		
		//색도 
		int chro_clsf = rx.add( tempData , "chro_clsf" , "");
		int item8  = rx.add( chro_clsf , "item" , "");
		rx.add ( item8, "value", "");	
		rx.add ( item8, "label", "전체");
		
		for(int i=0; i<ds.curlist8.size(); i++){
			AD_PUB_2300_MCURLIST8Record rec = (AD_PUB_2300_MCURLIST8Record)ds.curlist8.get(i);
			item  = rx.add( chro_clsf , "item" , "");
			rx.add ( item8, "value", rec.cd); 
			rx.add ( item8, "label", rec.cd + " " +rec.cdnm); 
			
		}		
		
		//그룹사 
		int grp_cmpy_cd = rx.add( tempData , "grp_cmpy_cd" , "");
		int item9  = rx.add( grp_cmpy_cd , "item" , "");
		rx.add ( item9, "value", "");	
		rx.add ( item9, "label", "전체");
		
		for(int i=0; i<ds.curlist9.size(); i++){
			AD_PUB_2300_MCURLIST9Record rec = (AD_PUB_2300_MCURLIST9Record)ds.curlist9.get(i);
			item  = rx.add( grp_cmpy_cd , "item" , "");
			rx.add ( item9, "value", rec.cd); 
			rx.add ( item9, "label", rec.cdnm); 
			
		}
		//업종
		int indt_clsf = rx.add( tempData , "indt_clsf" , "");	
		try{
			for(int i=0; i<1; i++){
				AD_PUB_2300_MCURLIST3Record rec = (AD_PUB_2300_MCURLIST3Record)ds.curlist3.get(i);
				int item3  = rx.add( indt_clsf , "item" , "");
				rx.add ( item3, "value", "" ); 
				rx.add ( item3, "label", "전체" );
				rx.add ( item3, "pcode", rec.mang_cd_1);
			}
		}catch(Exception ignore){
		}
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_PUB_2300_MCURLIST3Record rec = (AD_PUB_2300_MCURLIST3Record)ds.curlist3.get(i);
			int item3  = rx.add( indt_clsf , "item" , "");
			rx.add ( item3, "value", rec.cd ); 
			rx.add ( item3, "label", rec.cdnm );
			rx.add ( item3, "pcode", "");
		}
				
		//업종구분(중분류)
		int indt_clsf2 = rx.add( tempData , "indt_clsf2" , "");	
		String pre_pcode = "";
		for(int i=0; i<ds.curlist10.size(); i++){
			AD_PUB_2300_MCURLIST10Record rec = (AD_PUB_2300_MCURLIST10Record)ds.curlist10.get(i);
			if(!pre_pcode.equals(rec.mang_cd_1)){
				int item11  = rx.add( indt_clsf2 , "item" , "");
				rx.add ( item11, "value", "" ); 
				rx.add ( item11, "label", "전체" ); 
				rx.add ( item11, "pcode", rec.mang_cd_1 );				
			}
			int item11  = rx.add( indt_clsf2 , "item" , "");
			rx.add ( item11, "value", rec.cd ); 
			rx.add ( item11, "label", rec.cdnm ); 
			rx.add ( item11, "pcode", rec.mang_cd_1 );			
			
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
