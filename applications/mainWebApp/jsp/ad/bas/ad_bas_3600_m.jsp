<%@ page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_BAS_3600_MDataSet ds = (AD_BAS_3600_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int tempData  = rx.add( root , "tempData" , "");
	
	//환경변수
	rx.add(tempData, "xx_medi_clsf_001", ds.xx_medi_clsf_001);
	
	//전자메일주소
	int email_host = rx.add(tempData, "email_host", "");
	for( int i=0; i<ds.curlist_1.size(); i++ )
	{
		//AD_BAS_3600_MCURLISTRecord rec = (AD_BAS_3600_MCURLISTRecord)ds.curlist1.get(i);
		AD_BAS_3600_MCURLIST_1Record rec = (AD_BAS_3600_MCURLIST_1Record)ds.curlist_1.get(i);
		int item = rx.add(email_host, "item", "");
		rx.add(item, "value", rec.cd);
		rx.add(item, "label", rec.cd_abrv_nm + "(" + rec.cdnm + ")");
	}
	
	//그룹사
	int grp_cmpy = rx.add(tempData, "grp_cmpy", "");
	for( int i=0; i<ds.curlist_2.size(); i++ )
	{
		//AD_BAS_3600_MCURLISTRecord rec = (AD_BAS_3600_MCURLISTRecord)ds.curlist2.get(i);
		AD_BAS_3600_MCURLIST_2Record rec = (AD_BAS_3600_MCURLIST_2Record)ds.curlist_2.get(i);
		int item = rx.add(grp_cmpy, "item", "");
		rx.add(item, "value", rec.cd);
		rx.add(item, "label", rec.cdnm);
	}
	
	//고객관리항목
	int cust_item = rx.add(tempData, "cust_item", "");
	for( int i=0; i<ds.curlist_3.size(); i++ )
	{
		//AD_BAS_3600_MCURLISTRecord rec = (AD_BAS_3600_MCURLISTRecord)ds.curlist3.get(i);
		AD_BAS_3600_MCURLIST_3Record rec = (AD_BAS_3600_MCURLIST_3Record)ds.curlist_3.get(i);
		int item = rx.add(cust_item, "item", "");
		rx.add(item, "value", rec.cd);
		rx.add(item, "label", rec.cdnm);
	}
		
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>