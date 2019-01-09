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
	AD_TAX_1610_LDataSet ds = (AD_TAX_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
	
		for(int i=0; i<ds.curlist.size(); i++){  
			AD_TAX_1610_LCURLISTRecord rec = (AD_TAX_1610_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "checked", !"".equals(StringUtil.nvl(rec.notaxrate_clsf)) ? "Y": "N" );
			rx.add ( record, "medi_nm", rec.medi_nm );
			rx.add ( record, "pubc_slip_no", rec.pubc_slip_no );
			rx.add ( record, "dlco_nm", rec.dlco_nm );
			rx.add ( record, "advt_fee", rec.advt_fee );
			rx.add ( record, "agn_nm", rec.agn_nm );
			rx.add ( record, "slcrg_pers", rec.slcrg_pers );
			rx.add ( record, "mchrg_pers", rec.mchrg_pers );
			rx.add ( record, "notaxrate_clsf", rec.notaxrate_clsf );
			rx.add ( record, "notaxrate_dt", rec.notaxrate_dt );
			rx.add ( record, "pubc_dt", rec.pubc_dt );
			rx.add ( record, "clos_stat", rec.clos_stat );
		}	
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>