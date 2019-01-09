<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bas.rec.*
	,	chosun.ciis.is.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BAS_2400_MDataSet ds = (IS_BAS_2400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		int slip_clsf = rx.add( tempData , "slip_clsf" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_2400_MCURLISTRecord rec = (IS_BAS_2400_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( slip_clsf, "item", "");
			rx.add( item, "value", rec.cd);
			rx.add( item, "label", rec.cd_abrv_nm);			
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
