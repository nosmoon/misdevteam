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
	AD_BAS_3500_MDataSet ds = (AD_BAS_3500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	
		//매체구분
		int oth_clsf = rx.add( tempData , "oth_clsf" , "");		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_BAS_3500_MCURLISTRecord rec = (AD_BAS_3500_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( oth_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cd_abrv_nm);
			
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