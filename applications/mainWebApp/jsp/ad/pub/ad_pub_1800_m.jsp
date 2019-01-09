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
	AD_PUB_1800_MDataSet ds = (AD_PUB_1800_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try
	{  
	    //매체구분 
	    int medi_cd = rx.add( tempData , "medi_cd" , "");
		int item  = rx.add( medi_cd , "item" , "");
		
		for(int i=0; i<ds.curlist.size(); i++)
		{
			AD_PUB_1800_MCURLISTRecord rec = (AD_PUB_1800_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.addCData ( item, "label", rec.cd +" "+ rec.cdnm); 
			
		}	
		
		//거래처구분 
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");
		int item2  = rx.add( hndl_clsf , "item" , "");
		rx.add ( item, "value", "");	
		rx.add ( item, "label", "전체"); 
		
		for(int i=0; i<ds.curlist2.size(); i++)
		{
			AD_PUB_1800_MCURLIST2Record rec = (AD_PUB_1800_MCURLIST2Record)ds.curlist2.get(i);
			item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item2, "value", rec.cd );
			rx.add ( item2, "label", rec.cd +" "+ rec.cdnm);
			
		}
		
		//섹션대분류(기본조회)
		int sect_clsf_cd = rx.add( tempData , "sect_clsf_cd" , "");
		int item3  = rx.add( sect_clsf_cd , "item" , "");
		rx.add ( item3, "value", "");	
		rx.add ( item3, "label", "전체");
		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_PUB_1800_MCURLIST3Record rec = (AD_PUB_1800_MCURLIST3Record)ds.curlist3.get(i);
			item  = rx.add( sect_clsf_cd , "item" , "");
			rx.add ( item3, "value", rec.cd );
			rx.add ( item3, "label", StringUtil.substr(rec.cd,1,2) +" "+ rec.cdnm);
			rx.add ( item3, "pcode", "");
			
		}
		
		//섹션명분류(기본조회)
		int sect_nm_cd = rx.add( tempData , "sect_nm_cd" , "");
		int item4  = rx.add( sect_nm_cd , "item" , "");
		rx.add ( item4, "value", "");	
		rx.add ( item4, "label", "전체");
		
		for(int i=0; i<ds.curlist8.size(); i++){
			AD_PUB_1800_MCURLIST8Record rec = (AD_PUB_1800_MCURLIST8Record)ds.curlist8.get(i);
			item  = rx.add( sect_nm_cd , "item" , "");
			rx.add ( item4, "value", rec.cd );
			rx.addCData ( item4, "label", rec.cd +" "+ rec.cdnm);
			rx.add ( item4, "pcode", rec.mang_cd_1);
			
		}
		
		//섹션대분류(상세조회)
		int sect_clsf_cd2 = rx.add( tempData , "sect_clsf_cd2" , "");
		int item5  = rx.add( sect_clsf_cd2 , "item" , "");
		rx.add ( item5, "value", "");	
		rx.add ( item5, "label", "전체");
		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_PUB_1800_MCURLIST3Record rec = (AD_PUB_1800_MCURLIST3Record)ds.curlist3.get(i);
			item  = rx.add( sect_clsf_cd2 , "item" , "");
			rx.add ( item5, "value", rec.cd );
			rx.add ( item5, "label", StringUtil.substr(rec.cd,1,2) +" "+ rec.cdnm);
			rx.add ( item5, "pcode", "");
			
		}
		
		//섹션명분류(상세조회)
		int sect_nm_cd2 = rx.add( tempData , "sect_nm_cd2" , "");
		int item6  = rx.add( sect_nm_cd2 , "item" , "");
		rx.add ( item6, "value", "");	
		rx.add ( item6, "label", "전체");
		
		for(int i=0; i<ds.curlist8.size(); i++){
			AD_PUB_1800_MCURLIST8Record rec = (AD_PUB_1800_MCURLIST8Record)ds.curlist8.get(i);
			item  = rx.add( sect_nm_cd2 , "item" , "");
			rx.add ( item6, "value", rec.cd );
			rx.addCData ( item6, "label", rec.cd +" "+ rec.cdnm);
			rx.add ( item6, "pcode", rec.mang_cd_1);
			
		}
		
		//색도 
   		int chro_clsf = rx.add( tempData , "chro_clsf" , "");
   		int item7  = rx.add( chro_clsf , "item" , "");
		rx.add ( item7, "value", "");	
		rx.add ( item7, "label", "전체");
		
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_PUB_1800_MCURLIST4Record rec = (AD_PUB_1800_MCURLIST4Record)ds.curlist4.get(i);
			item  = rx.add( chro_clsf , "item" , "");
			rx.add ( item7, "value", rec.cd );
			rx.add ( item7, "label", rec.cd +" "+ rec.cdnm);
			
		}
		
		//그룹사 
		int grp_cmpy_cd = rx.add( tempData , "grp_cmpy_cd" , "");
		int item8  = rx.add( grp_cmpy_cd , "item" , "");
		rx.add ( item8, "value", "");	
		rx.add ( item8, "label", "전체");
		
		for(int i=0; i<ds.curlist5.size(); i++){
			AD_PUB_1800_MCURLIST5Record rec = (AD_PUB_1800_MCURLIST5Record)ds.curlist5.get(i);
			item  = rx.add( grp_cmpy_cd , "item" , "");
			rx.add ( item8, "value", rec.cd );
			rx.add ( item8, "label", rec.cdnm);
			
		}
		
		//게재구분 
		int pubc_clsf = rx.add( tempData , "pubc_clsf" , "");
		int item9  = rx.add( pubc_clsf , "item" , "");
		rx.add ( item9, "value", "");	
		rx.add ( item9, "label", "전체");
		
		for(int i=0; i<ds.curlist7.size(); i++){
			AD_PUB_1800_MCURLIST7Record rec = (AD_PUB_1800_MCURLIST7Record)ds.curlist7.get(i);
			item  = rx.add( pubc_clsf , "item" , "");
			rx.add ( item9, "value", rec.cd );
			rx.add ( item9, "label", rec.cd +" "+ rec.cd_abrv_nm);
			
		}
		
		//게재구분2
		int pubc_clsf2 = rx.add( tempData , "pubc_clsf2" , "");
		for(int i=0; i<ds.curlist7.size(); i++){
			AD_PUB_1800_MCURLIST7Record rec = (AD_PUB_1800_MCURLIST7Record)ds.curlist7.get(i);
			item  = rx.add( pubc_clsf2 , "item" , "");
			rx.add ( item9, "value", rec.cd );
			rx.add ( item9, "label", rec.cd_abrv_nm);
			
		}
		
		//게재면
		int sect_cd = rx.add( tempData , "sect_cd" , "");
		int item10  = rx.add( sect_cd , "item" , "");
		rx.add ( item10, "value", "");	
		rx.add ( item10, "label", "전체");
		
		for(int i=0; i<ds.curlist9.size(); i++){
			AD_PUB_1800_MCURLIST9Record rec = (AD_PUB_1800_MCURLIST9Record)ds.curlist9.get(i);
			item  = rx.add( sect_cd , "item" , "");
			rx.add ( item10, "value", rec.sect_cd); 
			rx.add ( item10, "label", rec.sect_cd);
			rx.add ( item10, "pcode", "");
			
		}
		
		//게재면 
		int sect_seq = rx.add( tempData , "sect_seq" , "");
		int item11  = rx.add( sect_seq , "item" , "");
		rx.add ( item11, "value", "");	
		rx.add ( item11, "label", "전체");
		
		for(int i=0; i<ds.curlist10.size(); i++){
			AD_PUB_1800_MCURLIST10Record rec = (AD_PUB_1800_MCURLIST10Record)ds.curlist10.get(i);
			item  = rx.add( sect_seq , "item" , "");
			rx.add ( item11, "value", rec.sect_seq); 
			rx.add ( item11, "label", rec.sect_seq); 
			rx.add ( item11, "pcode", rec.sect_cd);
			
		}
		
		//판구분
		int edt_clsf = rx.add( tempData , "edt_clsf" , "");
		for(int i=0; i<ds.curlist6.size(); i++){
			AD_PUB_1800_MCURLIST6Record rec = (AD_PUB_1800_MCURLIST6Record)ds.curlist6.get(i);
			item  = rx.add( edt_clsf , "item" , "");
			rx.add ( item11, "value", rec.cd); 
			rx.add ( item11, "label", rec.cd +" "+ rec.cdnm); 
			
		}
		
		//업종대구분 
		int indt_clsf_1 = rx.add( tempData , "indt_clsf_1" , "");
		for(int i=0; i<ds.curlist11.size(); i++)
		{
			AD_PUB_1800_MCURLIST11Record rec = (AD_PUB_1800_MCURLIST11Record)ds.curlist11.get(i);
			int item_indt  = rx.add( indt_clsf_1 , "item" , "");
			rx.add ( item_indt, "value", rec.cd ); 
			rx.addCData ( item_indt, "label", rec.cd +" "+ rec.cdnm );
			rx.add ( item_indt, "pcode", "");
		}
		
		//업종소구분 
		int indt_clsf_2 = rx.add( tempData , "indt_clsf_2" , "");
		for(int i=0; i<ds.curlist12.size(); i++)
		{
			AD_PUB_1800_MCURLIST11Record rec = (AD_PUB_1800_MCURLIST11Record)ds.curlist12.get(i);
			int item_indt  = rx.add( indt_clsf_2 , "item" , "");
			rx.add ( item_indt, "value", rec.cd ); 
			rx.addCData ( item_indt, "label", rec.cd +" "+ rec.cdnm );
			rx.add ( item_indt, "pcode", rec.mang_cd_1);
		}
		
		//유형대구분 
		int type_clsf_1 = rx.add( tempData , "type_clsf_1" , "");
		for(int i=0; i<ds.curlist13.size(); i++){
			AD_PUB_1800_MCURLIST11Record rec = (AD_PUB_1800_MCURLIST11Record)ds.curlist13.get(i);
			int item_type  = rx.add( type_clsf_1 , "item" , "");
			rx.add ( item_type, "value", rec.cd ); 
			rx.add ( item_type, "label", rec.cd +" "+ rec.cdnm );
			rx.add ( item_type, "pcode", "");
		}
		
		//유형소구분 
		int type_clsf_2 = rx.add( tempData , "type_clsf_2" , "");
		for(int i=0; i<ds.curlist14.size(); i++){
			AD_PUB_1800_MCURLIST11Record rec = (AD_PUB_1800_MCURLIST11Record)ds.curlist14.get(i);
			int item_type  = rx.add( type_clsf_2 , "item" , "");
			rx.add ( item_type, "value", rec.cd ); 
			rx.add ( item_type, "label", rec.cd +" "+ rec.cdnm );
			rx.add ( item_type, "pcode", rec.mang_cd_1);
		}
		//행사년도
		int evnt_yyyy = rx.add( tempData , "evnt_yyyy" , "");
		String chk_cd = "";
		String sub_cd = "";
		for(int i=0; i<ds.curlist15.size(); i++){
			AD_PUB_1800_MCURLIST5Record rec = (AD_PUB_1800_MCURLIST5Record)ds.curlist15.get(i);
			String cd = rec.cd;
			sub_cd = cd.substring(0,4);
			if(!chk_cd.equals(sub_cd)){
				int item_evnt  = rx.add( evnt_yyyy , "item" , "");
				rx.add ( item_evnt, "value", sub_cd);
				rx.add ( item_evnt, "label", sub_cd);
				chk_cd = sub_cd;
			}
		}			
		//최종년도가 현재년도보다 작은경우
		GregorianCalendar today = new GregorianCalendar ( );
		int year = today.get(today.YEAR);
		int Int_cd = Integer.parseInt(sub_cd);
    	if(Int_cd < year){
			int item_evnt  = rx.add( evnt_yyyy , "item" , "");
			rx.add ( item_evnt, "value", Integer.toString(year));
			rx.add ( item_evnt, "label", Integer.toString(year));		
		}
		
		//행사코드		
		int evnt_cd = rx.add( tempData , "evnt_cd" , "");
		for(int i = 0; i < ds.curlist15.size(); i++) {
			AD_PUB_1800_MCURLIST5Record rec = (AD_PUB_1800_MCURLIST5Record)ds.curlist15.get(i);
			int item_evnt3 = rx.add(evnt_cd, "item", "");
			rx.add ( item_evnt3, "value", rec.cd ); 
			rx.addCData ( item_evnt3, "label", rec.cdnm); 
			rx.add ( item_evnt3, "pcode", rec.cd.substring(0,4));
		}		
	}
	catch (Exception e) {
		out.println(e);
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
