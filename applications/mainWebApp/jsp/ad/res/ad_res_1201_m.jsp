<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.res.rec.*,chosun.ciis.ad.res.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML ��ü ���� 
	
	AD_RES_1201_MDataSet ds = (AD_RES_1201_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int tempData  = rx.add( root , "tempData" , "");
	int slcrg_pers = rx.add( tempData , "slcrg_pers" , "");
	
	
	int item  = rx.add( slcrg_pers , "item" , "");
	
	rx.add ( item, "label", "��ü");
	rx.add ( item, "value", "" );
	
	for(int i=0; i<ds.curlist.size(); i++)
	{
		AD_RES_1201_MCURLISTRecord rec = (AD_RES_1201_MCURLISTRecord)ds.curlist.get(i);		
		//item  = rx.add( slcrg_pers , "item" , "");		
		rx.add ( item, "label", rec.acct_nm);
		rx.add ( item, "value", rec.acct_id );
		
	}
		
    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>