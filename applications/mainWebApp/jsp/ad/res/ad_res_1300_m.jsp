<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.res.rec.*,chosun.ciis.ad.res.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_RES_1300_MDataSet ds = (AD_RES_1300_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int tempData  = rx.add( root , "tempData" , "");
	
	rx.add ( tempData, "team_auth", ds.team_auth);	
	rx.add ( tempData, "part_auth", ds.part_auth);	
	rx.add ( tempData, "chrg_auth", ds.chrg_auth);	
	rx.add ( tempData, "close_dt", ds.close_dt);	
	//영업담당 
	int slcrg_pers = rx.add( tempData , "slcrg_pers" , "");
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1300_MCURLISTRecord rec = (AD_RES_1300_MCURLISTRecord)ds.curlist.get(i);
		int item  = rx.add( slcrg_pers , "item" , "");
		rx.add(item, "value", rec.acct_id); 
		rx.add(item, "label", rec.acct_nm); 
	}
		
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>