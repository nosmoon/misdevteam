<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.res.rec.*,chosun.ciis.ad.res.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML ��ü ���� 
	
	AD_RES_1600_MDataSet ds = (AD_RES_1600_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int resData  = rx.add( root , "resData" , "");

	//������� 
	int slcrgpers = rx.add( resData , "SLCRG_PERS" , "");
	int item  = rx.add( slcrgpers , "item" , "");
	rx.add ( item, "value", "");	
	rx.add ( item, "label", "��ü");
	
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1600_MCURLISTRecord rec = (AD_RES_1600_MCURLISTRecord)ds.curlist.get(i);
		item  = rx.add( slcrgpers , "item" , "");
		rx.add(item, "value", rec.acct_id); 
		rx.add(item, "label", rec.acct_nm); 
		
	}
	
	//���籸�� 
	int pubc_clsf = rx.add( resData , "PUBC_CLSF" , "");
	int item2  = rx.add( pubc_clsf , "item" , "");
	rx.add ( item2, "value", "");	
	rx.add ( item2, "label", "��ü");
	
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_RES_1600_MCURLIST2Record rec = (AD_RES_1600_MCURLIST2Record)ds.curlist2.get(i);
		item  = rx.add( pubc_clsf , "item" , "");
		rx.add ( item2, "value", rec.cd ); 
		rx.add ( item2, "label", rec.cd + " " + rec.cdnm );
		
	}
	
	//���� 
	int indt_clsf = rx.add( resData , "INDT_CLSF" , "");
	int item3  = rx.add( indt_clsf , "item" , "");
	rx.add ( item3, "value", "");	
	rx.add ( item3, "label", "��ü");
	
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_RES_1600_MCURLIST3Record rec = (AD_RES_1600_MCURLIST3Record)ds.curlist3.get(i);
		item  = rx.add( indt_clsf , "item" , "");
		rx.add ( item3, "value", rec.cd ); 
		rx.add ( item3, "label", rec.cd + " " + rec.cdnm );
		
	}
	
	//��ޱ��� 
	int hndl_clsf = rx.add( resData , "HNDL_CLSF" , "");
	int item4  = rx.add( hndl_clsf , "item" , "");
	rx.add ( item4, "value", "");	
	rx.add ( item4, "label", "��ü");
	
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_RES_1600_MCURLIST4Record rec = (AD_RES_1600_MCURLIST4Record)ds.curlist4.get(i);
		item  = rx.add( hndl_clsf , "item" , "");
		rx.add ( item4, "value", rec.cd ); 
		rx.add ( item4, "label", rec.cd + " " + rec.cdnm );
		
	}
	
	//�׷�� 
	int grp_cmpy_cd = rx.add( resData , "GRP_CMPY_CD" , "");
	int item5  = rx.add( grp_cmpy_cd , "item" , "");
	rx.add ( item5, "value", "");	
	rx.add ( item5, "label", "��ü");
	
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_RES_1600_MCURLIST5Record rec = (AD_RES_1600_MCURLIST5Record)ds.curlist5.get(i);
		item  = rx.add( grp_cmpy_cd , "item" , "");
		rx.add ( item5, "value", rec.cd ); 
		rx.add ( item5, "label", rec.cdnm );
		
	}
	
    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>