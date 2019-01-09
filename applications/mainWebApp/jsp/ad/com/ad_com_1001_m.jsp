<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.com.rec.*
                ,chosun.ciis.ad.com.ds.*
                ,chosun.ciis.co.base.util.*
                ,java.util.*
                ,somo.framework.util.* " %>

<% 

	request.getSession().removeAttribute("LIST");
	
	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_COM_1001_MDataSet ds = (AD_COM_1001_MDataSet)request.getAttribute("ds");
	
	int root 	 	= RwXml.rootNodeID;
	int tempData 	= rx.add( root , "tempData" , "");
	
	int orga 		= rx.add( tempData , "orga" , "");		

	for(int i=0; i<ds.curlist.size(); i++){
		
		AD_COM_1001_MCURLISTRecord rec = (AD_COM_1001_MCURLISTRecord)ds.curlist.get(i);
		
		int depth       = StringUtil.toNumber(rec.depth) + orga;		

		int item  = rx.add( depth - 1 , "item" , "");
		rx.add ( item, "label", rec.orga_nm);  
		rx.add ( item, "value", rec.orga_cd );
		rx.add ( item, "value", rec.supr_orga_cd );
		rx.add ( item, "img", "");
		rx.add ( item, "sel_img", "");
		
	}
	
	rx.add ( tempData, "job_clsf", ds.job_clsf);

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>