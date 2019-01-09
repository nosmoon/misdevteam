<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	AD_TAX_2310_LDataSet ds = (AD_TAX_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData1", "");

	try {

		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_TAX_2310_LCURLISTRecord rec = (AD_TAX_2310_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.addCData ( record, "dlco_nm", rec.dlco_nm );
			rx.add ( record, "pubc_slip_no", rec.pubc_slip_no );
			rx.add ( record, "pubc_dt", rec.pubc_dt );
			rx.add ( record, "pubc_tot_amt", rec.pubc_tot_amt ); 
			rx.addCData ( record, "agn_nm", rec.agn_nm );
			rx.add ( record, "rcpm_yn", rec.rcpm_yn );
			rx.add ( record, "agn", rec.agn );
			rx.add ( record, "slcrg_pers_nm", rec.slcrg_pers_nm );
			rx.add ( record, "mchrg_pers_nm", rec.mchrg_pers_nm );
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