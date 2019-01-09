<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.co.bank.rec.*
                ,chosun.ciis.co.bank.ds.*
                ,chosun.ciis.co.base.util.*
                ,java.util.*
                ,somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	
	CO_BANK_1000_MDataSet ds = (CO_BANK_1000_MDataSet)request.getAttribute("ds");
	
	int root 	 	= RwXml.rootNodeID;
	int tempData 	= rx.add( root , "tempData" , "");
					
	rx.add( tempData , "xx_cd_020" , ds.getXx_cd_020());
	rx.add( tempData , "xx_cd_030" , ds.getXx_cd_030());
	
	int acct_num = rx.add( tempData , "acct_num" , "");
	for(int i=0; i<ds.curlist.size(); i++){
		CO_BANK_1000_MCURLISTRecord rec = (CO_BANK_1000_MCURLISTRecord)ds.curlist.get(i);
		
		int item  = rx.add( acct_num , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cd +" "+ rec.cd_abrv_nm);
		
	}	
	
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>