<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_3520_LDataSet ds = (IS_DEP_3520_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
		int gridData = rx.add(root, "gridData2", "");  

		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_3520_LCURLISTRecord rec = (IS_DEP_3520_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "dhon_occr_dt", rec.dhon_occr_dt);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dhon_amt", rec.dhon_amt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dhon_bal", rec.dhon_bal);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
