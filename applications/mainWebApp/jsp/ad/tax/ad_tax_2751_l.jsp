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
	AD_TAX_2751_LDataSet ds = (AD_TAX_2751_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "tempGridData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i=0; i<ds.curlist.size(); i++){  
			AD_TAX_2751_LCURLISTRecord rec = (AD_TAX_2751_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
//			rx.add ( record, "checked", !"".equals(StringUtil.nvl(rec.notaxrate_clsf)) ? "Y": "N" );
			rx.add(record, "checked"		,"N"); 
			rx.add ( record, "issu_yn", rec.issu_yn );
			rx.add ( record, "elec_tax_comp_cd", rec.elec_tax_comp_cd );
			rx.add ( record, "elec_tax_comp_nm", rec.elec_tax_comp_nm );
			rx.add ( record, "make_dt", rec.make_dt );
			rx.add ( record, "byr_dlco_no", rec.byr_dlco_no );
			rx.addCData ( record, "byr_dlco_nm", rec.byr_dlco_nm );
			rx.add ( record, "byr_ern", rec.byr_ern );
			rx.add ( record, "broker_dlco_no", rec.broker_dlco_no );
			rx.addCData ( record, "broker_dlco_nm", rec.broker_dlco_nm );
			rx.add ( record, "broker_ern", rec.broker_ern );
			rx.add ( record, "suply_amt", rec.suply_amt );
			rx.add ( record, "vat_amt", rec.vat_amt );
			rx.add ( record, "tot_amt", rec.tot_amt );
			rx.add ( record, "approve_id", rec.approve_id );
			rx.addCData ( record, "byr_email", rec.byr_email );
			rx.addCData ( record, "remk", rec.remk );
			rx.add ( record, "occr_dt", rec.occr_dt );
			rx.add ( record, "occr_seq", rec.occr_seq );
			rx.add ( record, "incmg_pers", rec.incmg_pers );
			rx.add ( record, "incmg_pers_nm", rec.incmg_pers_nm );
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