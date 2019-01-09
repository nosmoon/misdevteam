<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	AD_CO_1610_LDataSet ds = (AD_CO_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "tempGridData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i=0; i<ds.curlist.size(); i++){  
			AD_CO_1610_LCURLISTRecord rec = (AD_CO_1610_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
//			rx.add ( record, "checked", !"".equals(StringUtil.nvl(rec.notaxrate_clsf)) ? "Y": "N" );

			rx.add ( record, "bank_cd", rec.bank_cd );
			rx.add ( record, "bank_nm", rec.bank_nm );
			rx.add ( record, "note_clsf_cd", rec.note_clsf_cd );
			rx.add ( record, "note_clsf_nm", rec.note_clsf_nm );
			rx.add ( record, "note_amt", rec.note_amt );
			rx.add ( record, "comp_dt", rec.comp_dt );
			rx.add ( record, "mtry_dt", rec.mtry_dt );
			rx.add ( record, "issu_cmpy_clsf_cd", rec.issu_cmpy_clsf_cd );
			rx.addCData ( record, "issu_pers_nm", rec.issu_pers_nm );
			rx.add ( record, "endorser_nm", rec.endorser_nm );
			rx.add ( record, "rcpm_acct", rec.rcpm_acct );
			rx.add ( record, "rcpm_acct_nm", rec.rcpm_acct_nm );
			rx.add ( record, "sale_aprv_no", rec.sale_aprv_no );
			rx.add ( record, "elec_note_key", rec.elec_note_key );
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

<% /* �ۼ��ð� : Wed Jan 21 21:10:45 KST 2009 */ %>