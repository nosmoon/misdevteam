<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_2300_MDataSet ds = (AD_BAS_2300_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	
		//조중동게재유형:조선
		int pubc_clsf1 = rx.add( tempData , "pubc_clsf1" , "");		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_BAS_2300_MCURLISTRecord rec = (AD_BAS_2300_MCURLISTRecord)ds.curlist.get(i);
			
			if("Y".equals(rec.mang_cd_1)){
				int item  = rx.add( pubc_clsf1 , "item" , "");
				rx.add ( item, "value", rec.cd );
				rx.add ( item, "label", rec.cd_abrv_nm);
			}			
		}	
		//조중동게재유형:중앙,동아
		int pubc_clsf2 = rx.add( tempData , "pubc_clsf2" , "");		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_BAS_2300_MCURLISTRecord rec = (AD_BAS_2300_MCURLISTRecord)ds.curlist.get(i);
			
			if("Y".equals(rec.mang_cd_2)){
				int item  = rx.add( pubc_clsf2 , "item" , "");
				rx.add ( item, "value", rec.cd );
				rx.add ( item, "label", rec.cd_abrv_nm);
			}			
		}	
	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>