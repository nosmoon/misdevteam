<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.eis.rec.*
	,	chosun.ciis.ad.eis.ds.*;
	"
%>

<%
	  
	RwXml rx = new RwXml();
	AD_EIS_1400_MDataSet ds = (AD_EIS_1400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		
		int grp_cmpy_cd = rx.add( tempData , "grp_cmpy_cd" , "");		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_EIS_1400_MCURLISTRecord rec = (AD_EIS_1400_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( grp_cmpy_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd_abrv_nm);
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