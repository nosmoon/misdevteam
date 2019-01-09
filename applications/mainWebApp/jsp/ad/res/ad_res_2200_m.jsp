<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.res.rec.*,chosun.ciis.ad.res.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML ��ü ���� 
	
	AD_RES_2200_MDataSet ds = (AD_RES_2200_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int tempData  = rx.add( root , "tempData" , "");
	
	//������� 
	int slcrg_pers = rx.add( tempData , "slcrg_pers" , "");
	
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_2200_MCURLISTRecord rec = (AD_RES_2200_MCURLISTRecord)ds.curlist.get(i);
		int item  = rx.add( slcrg_pers , "item" , "");
		rx.add(item, "value", rec.acct_id); 
		rx.add(item, "label", rec.acct_nm); 
		
	}
	
	rx.add( tempData , "auth" , ds.auth);
		
    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>