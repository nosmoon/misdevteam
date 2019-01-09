<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.brn.rec.*
	,	chosun.ciis.ad.brn.ds.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	AD_BRN_1210_LDataSet ds = (AD_BRN_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
 
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_BRN_1210_LCURLISTRecord rec = (AD_BRN_1210_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "checked", "" );
			rx.add ( record, "medi_nm", rec.medi_nm );
			rx.add ( record, "pubc_slip_no", rec.pubc_slip_no );
			rx.add ( record, "dlco_nm", rec.dlco_nm ); 
			rx.add ( record, "slcrg_pers_nm", rec.slcrg_pers_nm ); 
			rx.add ( record, "advt_fee", rec.advt_fee );
			rx.add ( record, "vat", rec.vat );
			rx.add ( record, "unrcp_amt", rec.unrcp_amt );
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