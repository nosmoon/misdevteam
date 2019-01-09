<%@ page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_BAS_3610_MDataSet ds = (AD_BAS_3610_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int tempData  = rx.add( root , "tempData" , "");
	
	//전자메일주소
	int email_host = rx.add(tempData, "email_host", "");
	for( int i=0; i<ds.curlist1.size(); i++ )
	{
		AD_BAS_3610_MCURLISTRecord rec = (AD_BAS_3610_MCURLISTRecord)ds.curlist1.get(i);
		int item = rx.add(email_host, "item", "");
		rx.add(item, "value", rec.cd);
		rx.add(item, "label", rec.cd_abrv_nm + "(" + rec.cdnm + ")");
	}
	
	//담당업무
	int task = rx.add(tempData, "task", "");
	for( int i=0; i<ds.curlist2.size(); i++ )
	{
		AD_BAS_3610_MCURLISTRecord rec = (AD_BAS_3610_MCURLISTRecord)ds.curlist2.get(i);
		int item = rx.add(task, "item", "");
		rx.add(item, "value", rec.cd);
		rx.add(item, "label", rec.cdnm);
	}
	
	//고객관리항목
	int cust_item = rx.add(tempData, "cust_item", "");
	for( int i=0; i<ds.curlist3.size(); i++ )
	{
		AD_BAS_3610_MCURLISTRecord rec = (AD_BAS_3610_MCURLISTRecord)ds.curlist3.get(i);
		int item = rx.add(cust_item, "item", "");
		rx.add(item, "value", rec.cd);
		rx.add(item, "label", rec.cdnm);
	}
	
	//DDD1,2,3
	int ddd1 = rx.add(tempData, "ddd1", "");
	int ddd_item1 = rx.add(ddd1, "item", "");
	rx.add(ddd_item1, "value", "");
	rx.add(ddd_item1, "label", "");
	for( int i=0; i<ds.curlist4.size(); i++ )
	{
		AD_BAS_3610_MCURLISTRecord rec = (AD_BAS_3610_MCURLISTRecord)ds.curlist4.get(i);
		//int item = rx.add(ddd, "item", "");
		rx.add(ddd_item1, "value", rec.cd);
		rx.add(ddd_item1, "label", rec.cdnm);
	}
	int ddd2 = rx.add(tempData, "ddd2", "");
	int ddd_item2 = rx.add(ddd2, "item", "");
	rx.add(ddd_item2, "value", "");
	rx.add(ddd_item2, "label", "");
	for( int i=0; i<ds.curlist4.size(); i++ )
	{
		AD_BAS_3610_MCURLISTRecord rec = (AD_BAS_3610_MCURLISTRecord)ds.curlist4.get(i);
		//int item = rx.add(ddd, "item", "");
		rx.add(ddd_item2, "value", rec.cd);
		rx.add(ddd_item2, "label", rec.cdnm);
	}
	int ddd3 = rx.add(tempData, "ddd3", "");
	int ddd_item3 = rx.add(ddd3, "item", "");
	rx.add(ddd_item3, "value", "");
	rx.add(ddd_item3, "label", "");
	for( int i=0; i<ds.curlist4.size(); i++ )
	{
		AD_BAS_3610_MCURLISTRecord rec = (AD_BAS_3610_MCURLISTRecord)ds.curlist4.get(i);
		//int item = rx.add(ddd, "item", "");
		rx.add(ddd_item3, "value", rec.cd);
		rx.add(ddd_item3, "label", rec.cdnm);
	}
	
	//이동통신항목1,2
	int mobile_cmpy1 = rx.add(tempData, "mobile_cmpy1", "");
	int mobile_item1 = rx.add(mobile_cmpy1, "item", "");
	rx.add(mobile_item1, "value", "");
	rx.add(mobile_item1, "label", "");
	for( int i=0; i<ds.curlist5.size(); i++ )
	{
		AD_BAS_3610_MCURLISTRecord rec = (AD_BAS_3610_MCURLISTRecord)ds.curlist5.get(i);
		//int item = rx.add(mobile_cmpy, "item", "");
		rx.add(mobile_item1, "value", rec.cd);
		rx.add(mobile_item1, "label", rec.cdnm);
	}
	int mobile_cmpy2 = rx.add(tempData, "mobile_cmpy2", "");
	int mobile_item2 = rx.add(mobile_cmpy2, "item", "");
	rx.add(mobile_item2, "value", "");
	rx.add(mobile_item2, "label", "");
	for( int i=0; i<ds.curlist5.size(); i++ )
	{
		AD_BAS_3610_MCURLISTRecord rec = (AD_BAS_3610_MCURLISTRecord)ds.curlist5.get(i);
		//int item = rx.add(mobile_cmpy, "item", "");
		rx.add(mobile_item2, "value", rec.cd);
		rx.add(mobile_item2, "label", rec.cdnm);
	}
		
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>