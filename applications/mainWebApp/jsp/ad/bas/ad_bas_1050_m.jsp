<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML ��ü ���� 
	
	AD_BAS_1050_MDataSet ds = (AD_BAS_1050_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int tempData  = rx.add( root , "tempData" , "");

		
	//�׷��	
	int grp_cmpy = rx.add( tempData , "grp_cmpy" , "");
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)ds.curlist1.get(i);
		
		int item  = rx.add( grp_cmpy , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cdnm);
	}	

	//����	
	int indt_clsf = rx.add( tempData , "indt_clsf" , "");
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)ds.curlist2.get(i);
		
		int item  = rx.add( indt_clsf , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cd  + " " + rec.cdnm);
	}
	
	//����	
	int type_clsf = rx.add( tempData , "type_clsf" , "");
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)ds.curlist3.get(i);
		
		int item  = rx.add( type_clsf, "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cd  + " " + rec.cdnm);
	}
	
	//�������
	int slcrg_pers = rx.add( tempData , "slcrg_pers" , "");
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)ds.curlist4.get(i);
		
		int item  = rx.add( slcrg_pers, "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cdnm);
	}
	
	//�������
	int mchrg_pers = rx.add( tempData , "mchrg_pers" , "");
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)ds.curlist5.get(i);
		
		int item  = rx.add( mchrg_pers , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cdnm);
	}
		
    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>