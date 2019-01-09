<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.res.rec.*,chosun.ciis.ad.res.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML ��ü ���� 
	
	AD_RES_1900_MDataSet ds = (AD_RES_1900_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	
	//��ü���� 
	int mediclsf = rx.add( tempData , "medi_clsf" , "");
	int item     = rx.add( mediclsf , "item" , "");
	rx.add ( item, "value", "");	
	rx.add ( item, "label", "��ü");
	
	
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1900_MCURLISTRecord rec = (AD_RES_1900_MCURLISTRecord)ds.curlist.get(i);
		item  = rx.add( mediclsf , "item" , "");
		rx.add(item, "value", rec.cd);  
		rx.add(item, "label", rec.cd +" "+ rec.cdnm); 
		
	}
	
	//������� 
	int slcrg_pers = rx.add( tempData , "slcrg_pers" , "");
	int item2      = rx.add( slcrg_pers , "item" , "");
	rx.add ( item2, "value", "");	
	rx.add ( item2, "label", "��ü");
	
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_RES_1900_MCURLIST2Record rec = (AD_RES_1900_MCURLIST2Record)ds.curlist2.get(i);
		item2  = rx.add( slcrg_pers , "item" , "");
		rx.add(item2, "value", rec.acct_id);
		rx.add(item2, "label", rec.acct_nm);
		
	}
	
	//��ü���� ��2.
	int medi_clsf2 = rx.add( tempData , "medi_clsf2" , "");
	int item3      = rx.add( medi_clsf2 , "item" , "");

	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1900_MCURLISTRecord rec = (AD_RES_1900_MCURLISTRecord)ds.curlist.get(i);
		item3  = rx.add( medi_clsf2 , "item" , "");
		rx.add(item3, "value", rec.cd);  
		rx.add(item3, "label", rec.cd +" "+ rec.cdnm); 
		
	}
	
	//�������  ��ü�� ��.
	int slcrg_pers2 = rx.add( tempData , "slcrg_pers2" , "");
	int item4       = rx.add( mediclsf , "item" , "");
	
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_RES_1900_MCURLIST2Record rec = (AD_RES_1900_MCURLIST2Record)ds.curlist2.get(i);
		item4  = rx.add( slcrg_pers2 , "item" , "");
		rx.add(item4, "value", rec.acct_id);
		rx.add(item4, "label", rec.acct_nm);
		
	}
		
    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>