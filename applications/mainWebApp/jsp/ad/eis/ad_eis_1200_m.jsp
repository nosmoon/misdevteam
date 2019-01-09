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
	AD_EIS_1200_MDataSet ds = (AD_EIS_1200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_EIS_1200_MCURLISTRecord rec = (AD_EIS_1200_MCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( tempData , "record" , "");
			rx.add ( record, "sect_nm_cd", rec.sect_nm_cd);
			rx.add ( record, "sect_nm", !"".equals(StringUtil.nvl(rec.sect_nm)) ? rec.sect_nm : rec.sect_nm_cd);
			
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