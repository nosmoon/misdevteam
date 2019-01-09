<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_3400_MDataSet ds = (AD_BAS_3400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	
	try {
		/****** CURLIST BEGIN */
		int medi_cd = rx.add( tempData , "medi_cd" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_3400_MCURLISTRecord rec = (AD_BAS_3400_MCURLISTRecord)ds.curlist.get(i);
			
			int item  = rx.add( medi_cd , "item" , "");			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}		
		/****** CURLIST END */	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
