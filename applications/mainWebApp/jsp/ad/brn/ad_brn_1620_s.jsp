<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.brn.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.brn.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BRN_1620_SDataSet ds = (AD_BRN_1620_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
	
		int resData2 = rx.add(root, "resData", "");
		int resForm = rx.add(resData2, "resForm", "");
		
		if(ds != null){
			rx.add(resForm, "icdc_clsf", ds.icdc_clsf); 
			rx.add(resForm, "upd_prv_amt", ds.upd_prv_amt);
			rx.add(resForm, "upd_aft_amt", ds.upd_aft_amt);
			rx.add(resForm, "icdc_amt", ds.icdc_amt);
			rx.add(resForm, "resn", "사유는 발행 후 수기작성.");
			rx.add(resForm, "resn", ds.resn);
//			rx.add(resForm, "make_dt", ds.make_dt);
			rx.add(resForm, "seq", ds.seq);
			rx.add(resForm, "fr_pubc_dt", ds.fr_pubc_dt);
			rx.add(resForm, "to_pubc_dt", ds.to_pubc_dt);
		}	
				
		int resData = rx.add(root, "resData", "");
		int gridData = rx.add(resData, "gridData", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BRN_1620_SCURLISTRecord rec = (AD_BRN_1620_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "checked", rec.checked);
			rx.add(record, "pubc_occr_dt", rec.pubc_occr_dt);
			rx.add(record, "pubc_occr_seq", rec.pubc_occr_seq);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect",    rec.sect_cd+rec.sect_seq);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "agn", rec.agn);
			rx.add(record, "pubc_dt", rec.pubc_dt);  
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "pubc_tot_amt", rec.pubc_tot_amt);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
