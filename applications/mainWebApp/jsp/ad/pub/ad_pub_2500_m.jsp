<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_2500_MDataSet ds = (AD_PUB_2500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		
		//섹션대분류
		int sect_clsf_cd = rx.add( tempData , "sect_clsf_cd" , "");
		int item  = rx.add( sect_clsf_cd , "item" , "");
		rx.add ( item, "value", "");	
		rx.add ( item, "label", "전체");
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_2500_MCURLISTRecord rec = (AD_PUB_2500_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( sect_clsf_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", "");
			
		}
		
		//섹션중분류
		int sect_nm_cd = rx.add( tempData , "sect_nm_cd" , "");
		int item2  = rx.add( sect_nm_cd , "item" , "");
		rx.add ( item2, "value", "");	
		rx.add ( item2, "label", "전체");
		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_2500_MCURLIST2Record rec = (AD_PUB_2500_MCURLIST2Record)ds.curlist2.get(i);
			item2  = rx.add( sect_nm_cd , "item" , "");
			rx.add ( item2, "value", rec.cd );
			rx.addCData ( item2, "label", rec.cdnm);
			rx.add ( item2, "pcode", rec.mang_cd_1);
			
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
