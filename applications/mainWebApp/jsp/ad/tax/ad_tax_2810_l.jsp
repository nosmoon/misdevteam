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
	AD_TAX_2810_LDataSet ds = (AD_TAX_2810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gd_main", "");

	try {
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_TAX_2810_LCURLISTRecord rec = (AD_TAX_2810_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "prof_type_cd", rec.prof_type_cd );
			rx.add ( record, "prof_type_nm", rec.prof_type_nm );
			rx.add ( record, "medi_cd", rec.medi_cd );
			rx.add ( record, "medi_nm", rec.medi_nm );
			rx.add ( record, "dlco_no", rec.dlco_no );
			rx.add ( record, "dlco_nm", rec.dlco_nm );
			rx.add ( record, "advt_fee", rec.advt_fee ); 
			rx.add ( record, "vat", rec.vat );
			rx.add ( record, "agn", rec.agn );
			rx.add ( record, "agn_nm", rec.agn_nm );
			rx.add ( record, "fee", rec.fee );
			rx.add ( record, "hndl_plac_cd", rec.hndl_plac_cd );
			rx.add ( record, "hndl_plac_nm", rec.hndl_plac_nm );
			rx.add ( record, "coms", rec.coms );
			rx.add ( record, "pubc_dt", rec.pubc_dt );
			rx.add ( record, "pubc_slip_no", rec.pubc_slip_no );
			rx.add ( record, "sect_cd_seq", rec.sect_cd_seq );
			rx.add ( record, "dn", rec.dn );
			rx.add ( record, "cm", rec.cm );
			rx.add ( record, "arow", rec.arow );
			rx.add ( record, "slcrg_pers", rec.slcrg_pers );
			rx.add ( record, "slcrg_pers_nm", rec.slcrg_pers_nm );
			rx.add ( record, "mchrg_pers", rec.mchrg_pers );
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