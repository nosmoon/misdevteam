<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_BAS_1000_MDataSet ds = (AD_BAS_1000_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int resData  = rx.add( root , "resData" , "");
	
	//관리구분
	int mang_clsf = rx.add( resData , "mang_clsf" , "");	
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_1000_MCURLIST1Record rec = (AD_BAS_1000_MCURLIST1Record)ds.curlist1.get(i);
		
		int item  = rx.add( mang_clsf , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		
	}
	//계약형태
	int cntr_type = rx.add( resData , "cntr_type" , "");
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_1000_MCURLIST2Record rec = (AD_BAS_1000_MCURLIST2Record)ds.curlist2.get(i);
		
		int item  = rx.add( cntr_type , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		
	}	
	
	//업종	
	int indt_cd = rx.add( resData , "indt_cd" , "");
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_1000_MCURLIST3Record rec = (AD_BAS_1000_MCURLIST3Record)ds.curlist3.get(i);
		
		int item  = rx.add( indt_cd , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cd  + " " + rec.cdnm);
		
	}	
	
	//업무구분
	int job_clsf = rx.add( resData , "job_clsf" , "");
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_1000_MCURLIST4Record rec = (AD_BAS_1000_MCURLIST4Record)ds.curlist4.get(i);
		
		int item  = rx.add( job_clsf , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cdnm);
		
	}
	
	//그룹사	
	int grp_cmpy_cd = rx.add( resData , "grp_cmpy_cd" , "");
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_BAS_1000_MCURLIST5Record rec = (AD_BAS_1000_MCURLIST5Record)ds.curlist5.get(i);
		
		int item  = rx.add( grp_cmpy_cd , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cdnm);
		
	}	
	
	//전자세금계산서 업체
	int elec_tax_comp_cd = rx.add( resData , "elec_tax_comp_cd" , "");
	for(int i=0; i<ds.curlist6.size(); i++){
		AD_BAS_1000_MCURLIST6Record rec = (AD_BAS_1000_MCURLIST6Record)ds.curlist6.get(i);
		
		int item  = rx.add( elec_tax_comp_cd , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cdnm);
		
	}
	
	//유형
	int type_cd = rx.add( resData , "type_cd", "");
	for(int i=0; i<ds.curlist7.size(); i++){
		AD_BAS_1000_MCURLIST7Record rec = (AD_BAS_1000_MCURLIST7Record)ds.curlist7.get(i);
		
		int item  = rx.add( type_cd , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cd  + " " + rec.cdnm);
	}
		
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>