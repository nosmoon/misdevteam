<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.res.rec.*,chosun.ciis.ad.res.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_RES_1500_MDataSet ds = (AD_RES_1500_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int resData  = rx.add( root , "resData" , "");
	
	//영업담당 
	int slcrgpers = rx.add( resData , "SLCRG_PERS" , "");
    int item  = rx.add( slcrgpers , "item" , "");
	rx.add ( item, "value", "");	
	rx.add ( item, "label", "전체");

	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1500_MCURLISTRecord rec = (AD_RES_1500_MCURLISTRecord)ds.curlist.get(i);
		item  = rx.add( slcrgpers , "item" , "");
	    rx.add(item, "value", rec.acct_id); 
		rx.add(item, "label", rec.acct_nm); 
		
	}
	
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>