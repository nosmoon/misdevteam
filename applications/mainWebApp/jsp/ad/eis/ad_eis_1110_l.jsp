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
	AD_EIS_1110_LDataSet ds = (AD_EIS_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_EIS_1110_LCURLISTRecord rec = (AD_EIS_1110_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "dlco_no", rec.dlco_no );
			rx.add ( record, "dlco_nm", rec.dlco_nm );
			rx.add ( record, "advt_amt", rec.advt_amt );
			
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* �ۼ��ð� : Wed Jan 21 21:10:45 KST 2009 */ %>