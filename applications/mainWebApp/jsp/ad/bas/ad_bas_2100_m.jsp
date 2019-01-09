<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_BAS_2100_MDataSet ds = (AD_BAS_2100_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int resData  = rx.add( root , "resData" , "");
	
	//직급 
	int curjob = rx.add( resData , "CUR_JOB" , "");
	
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_2100_MCURLISTRecord rec = (AD_BAS_2100_MCURLISTRecord)ds.curlist.get(i);
		int item  = rx.add( curjob , "item" , "");
		rx.add ( item, "value", rec.cd );   
		rx.add ( item, "label", rec.cdnm );  
		
	}
	
	//고개관리 
	int custmangitem = rx.add( resData , "CUST_MANG_ITEM" , "");
	
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_2100_MCURLIST2Record rec = (AD_BAS_2100_MCURLIST2Record)ds.curlist2.get(i);
		int item  = rx.add( custmangitem , "item" , "");
		rx.add ( item, "value", rec.cd ); 
		rx.add ( item, "label", rec.cdnm );
		
	}
	
	//종교 
	int relg = rx.add( resData , "RELG" , "");
	
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_2100_MCURLIST3Record rec = (AD_BAS_2100_MCURLIST3Record)ds.curlist3.get(i);
		int item  = rx.add( relg , "item" , "");
		rx.add ( item, "value", rec.cd ); 
		rx.add ( item, "label", rec.cdnm );
		
	}
	
	//이메일 
	int email = rx.add( resData , "EMAIL" , "");
	
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_2100_MCURLIST4Record rec = (AD_BAS_2100_MCURLIST4Record)ds.curlist4.get(i);
		int item  = rx.add( email , "item" , "");
		rx.add ( item, "value", rec.cdnm ); 
		rx.add ( item, "label", rec.cdnm );
		
	}
	
	//출생지 
	int nativ = rx.add( resData , "NATIV" , "");
	
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_BAS_2100_MCURLIST5Record rec = (AD_BAS_2100_MCURLIST5Record)ds.curlist5.get(i);
		int item  = rx.add( nativ , "item" , "");
		rx.add ( item, "value", rec.cd ); 
		rx.add ( item, "label", rec.cd_abrv_nm ); 
		
	}
	
	//	
	int slcrgpers = rx.add( resData , "SLCRG_PERS" , "");
	
	for(int i=0; i<ds.curlist6.size(); i++){
		AD_BAS_2100_MCURLIST6Record rec = (AD_BAS_2100_MCURLIST6Record)ds.curlist6.get(i);
		int item  = rx.add( slcrgpers , "item" , "");
		rx.add ( item, "value", rec.chrg_pers );  
		rx.add ( item, "label", rec.chrg_pers );  
		
	}	
		
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>