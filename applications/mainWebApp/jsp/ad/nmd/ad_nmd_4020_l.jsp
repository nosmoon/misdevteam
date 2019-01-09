<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_4020_LDataSet ds = (AD_NMD_4020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData2", ""); 
			
	try { 
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_NMD_4020_LCURLISTRecord rec = (AD_NMD_4020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "chpn_occr_dt", rec.chpn_occr_dt);
			rx.add(record, "chpn_occr_seq", rec.chpn_occr_seq);
			rx.addCData(record, "readr_nm", rec.readr_nm);
			rx.add(record, "read_stat", rec.read_stat);
			rx.add(record, "canc_yn", rec.canc_yn);
			rx.add(record, "tax_clsf", rec.tax_clsf);
			rx.add(record, "advt_yn", rec.advt_yn);			
			rx.add(record, "read_fr_dt", rec.read_fr_dt);
			rx.add(record, "stplt_time", rec.stplt_time);  
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "suspns_dt", rec.suspns_dt);
			rx.add(record, "refn_time", rec.refn_time);
			rx.add(record, "refn_amt", rec.refn_amt);
			rx.add(record, "hndl_clsf", rec.hndl_clsf);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "agn_nm", rec.agn);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "rcpm_clsf", rec.rcpm_clsf);
			rx.add(record, "unclct_amt", rec.unclct_amt);  
			rx.add(record, "clos_stat", rec.clos_stat);
			rx.add(record, "extn_no", rec.extn_no);
			rx.add(record, "grp_id", rec.grp_id);
			rx.add(record, "id", rec.id);
			rx.add(record, "re_reciv_dt", rec.re_reciv_dt);			
			rx.add(record, "old_occr_dt", rec.chpn_occr_dt);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

