<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_2430_LDataSet ds = (AD_DEP_2430_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {   
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_2430_LCURLISTRecord rec = (AD_DEP_2430_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			//rx.add(record, "rcpm_slip_clsf_cd", rec.rcpm_slip_clsf_cd);
			//rx.add(record, "rcpm_seq", rec.rcpm_seq);
			//rx.add(record, "rcpm_sub_seq", rec.rcpm_sub_seq);
			//rx.add(record, "bank_cd", rec.bank_cd);
			//rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "now_note_stat_nm", rec.now_note_stat_nm);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			
		}

	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
