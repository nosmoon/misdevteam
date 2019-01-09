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
	AD_TAX_2320_LDataSet ds = (AD_TAX_2320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData2", "");

	try {
		int vat = 0;
		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_TAX_2320_LCURLISTRecord rec = (AD_TAX_2320_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			
			vat = StringUtil.toNumber(rec.fee) / 11;
			
			rx.add ( record, "pubc_slip_no", rec.pubc_slip_no );
			rx.add ( record, "medi_nm", rec.medi_nm );
			rx.addCData ( record, "dlco_nm", rec.dlco_nm );
			rx.addCData ( record, "acct_dlco_nm", rec.acct_dlco_nm ); 
			rx.add ( record, "ern", rec.ern );
			rx.add ( record, "suply_amt", StringUtil.toNumber(rec.fee) - vat ); 
			rx.add ( record, "vat_amt", vat );
			rx.add ( record, "fee", rec.fee );
			rx.add ( record, "slcrg_pers", rec.slcrg_pers );
			rx.add ( record, "mchrg_pers", rec.mchrg_pers );
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