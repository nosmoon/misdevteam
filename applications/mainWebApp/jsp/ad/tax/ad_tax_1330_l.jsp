<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	AD_TAX_1330_LDataSet ds = (AD_TAX_1330_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData3", "");

	try {
		for(int i=0; i<ds.curlist.size(); i++){  
			AD_TAX_1330_LCURLISTRecord rec = (AD_TAX_1330_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData, "record" , "");
			rx.add ( record, "prof_type", rec.prof_type_nm );
			rx.add ( record, "cnt", rec.cnt );
			rx.add ( record, "suply_amt", rec.suply_amt );
			rx.add ( record, "vat_amt", rec.vat_amt );
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