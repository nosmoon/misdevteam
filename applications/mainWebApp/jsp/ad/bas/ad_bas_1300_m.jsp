<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.*, chosun.ciis.co.base.util.* " %>

<%

	RwXml rx = new RwXml();         // XML ��ü ���� 
	
	AD_BAS_1300_MDataSet ds = (AD_BAS_1300_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int resData  = rx.add( root , "resData" , "");
	
	//�㺸���� 
	int mortgclsf = rx.add( resData , "MORTG_CLSF" , "");
	int item  = rx.add( mortgclsf , "item" , "");
	rx.add ( item, "value", "");	
	rx.add ( item, "label", "��ü"); 
	
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1300_MCURLISTRecord rec = (AD_BAS_1300_MCURLISTRecord)ds.curlist.get(i);
		item  = rx.add( mortgclsf , "item" , "");
		rx.add ( item, "value", rec.cd ); 
		rx.add ( item, "label", StringUtil.substr(rec.cd,1,2) +" "+ rec.cd_abrv_nm );
		
	}
	
		
    out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
%>