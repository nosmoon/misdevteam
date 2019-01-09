<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sup.rec.*
	,	chosun.ciis.sp.sup.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SUP_1420_SDataSet ds = (SP_SUP_1420_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");
	

	try {
		/****** CURLIST1 BEGIN */
		int gridData2 = rx.add(resForm, "gridData2", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SUP_1420_SCURLIST1Record rec = (SP_SUP_1420_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "acpn_dt", rec.acpn_dt);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "rdr_nm", rec.rdr_nm);
			rx.add(record, "cns_ptcr", rec.cns_ptcr);
		}
		/****** CURLIST1 END */
		
		/****** CURLIST2 BEGIN */
		int gridData3 = rx.add(resForm, "gridData3", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			SP_SUP_1420_SCURLIST2Record rec = (SP_SUP_1420_SCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "acpn_dt", rec.acpn_dt);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "rdr_nm", rec.rdr_nm);
			rx.add(record, "cns_clsf_nm", rec.cns_clsf_nm);
			rx.add(record, "cns_ptcr", rec.cns_ptcr);
		}
		/****** CURLIST2 END */
		
		rx.add(resForm, "acpn_no", ds.acpn_no);
		rx.add(resForm, "acpn_per", ds.acpn_pers_nm);
		rx.add(resForm, "acpn_per_no", ds.acpn_pers);
		rx.add(resForm, "acpn_dt_s", ds.acpn_dt);
		rx.add(resForm, "acpn_clsf", ds.acpn_clsf);
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "chrg_pers_nm", ds.chrg_pers_nm);
		rx.add(resForm, "ptph_no", ds.ptph_no);
		rx.add(resForm, "adms_dstc_cd_nm", ds.adms_dstc_cd_nm);
		rx.add(resForm, "tel_no", ds.tel_no);
		rx.add(resForm, "rdr_nm_s", ds.rdr_nm);
		rx.add(resForm, "cns_ptcr_s", ds.cns_ptcr);
		rx.add(resForm, "flag", "U");
        
        rx.add(resForm, "cns_cont_clsf_1", ds.cns_cont_clsf_1);
        rx.add(resForm, "cns_cont_clsf_2", ds.cns_cont_clsf_2);
        rx.add(resForm, "cns_cont_clsf_3", ds.cns_cont_clsf_3);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
