<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	AD_NMD_5110_LDataSet ds = (AD_NMD_5110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_NMD_5110_LCURLISTRecord rec = (AD_NMD_5110_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "checked", "N");
			rx.add ( record, "fee", rec.fee );
			rx.add ( record, "medi_nm", rec.medi_nm );
			rx.add ( record, "pubc_slip_no", rec.pubc_slip_no ); 
			rx.add ( record, "pubc_dt", rec.pubc_dt );
			rx.add ( record, "dlco_nm", rec.dlco_nm );
			rx.add ( record, "advt_fee", rec.advt_fee );
			rx.add ( record, "vat", rec.vat );
			rx.add ( record, "fee_rate", rec.fee_rate );
			rx.add ( record, "purc_stmt_issu_yn", rec.purc_stmt_issu_yn );
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