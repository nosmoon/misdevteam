<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.semuro.rec.*
	,	chosun.ciis.co.semuro.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SEMURO_1400_LDataSet ds = (CO_SEMURO_1400_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_SEMURO_1400_LCURLISTRecord rec = (CO_SEMURO_1400_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "semuro_no", rec.semuro_no);
			rx.add(record, "tax_stmt_clsf", rec.tax_stmt_clsf);
			rx.add(record, "rmsg_pers_semuro_id", rec.rmsg_pers_semuro_id);
			rx.add(record, "send_pers_id", rec.send_pers_id);
			rx.add(record, "send_pers_eps_no", rec.send_pers_eps_no);
	 		rx.add(record, "send_pers_presi_flnm", rec.send_pers_presi_flnm);
			rx.add(record, "send_pers_firmnm", rec.send_pers_firmnm);
			rx.add(record, "send_pers_addr", rec.send_pers_addr);
			rx.add(record, "send_pers_bizcond", rec.send_pers_bizcond);
			rx.add(record, "send_pers_indt", rec.send_pers_indt);
			rx.add(record, "send_pers_email", rec.send_pers_email);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "tot_suply_amt", rec.tot_suply_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "tot_tax_amt", rec.tot_tax_amt);
			rx.add(record, "cash", rec.cash);
			rx.add(record, "note", rec.note);
			rx.add(record, "chqe", rec.chqe);
			rx.add(record, "trust_unrcp_amt", rec.trust_unrcp_amt);
			rx.add(record, "rcpt_clam_yn", rec.rcpt_clam_yn);
			rx.add(record, "stat_clsf", rec.stat_clsf);
			rx.add(record, "stat_clsf_dt_tm", rec.stat_clsf_dt_tm);
			rx.add(record, "get_yn", rec.get_yn);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<semuro_no/>
			<tax_stmt_clsf/>
			<rmsg_pers_semuro_id/>
			<send_pers_id/>
			<send_pers_eps_no/>
			<send_pers_presi_flnm/>
			<send_pers_firmnm/>
			<send_pers_addr/>
			<send_pers_bizcond/>
			<send_pers_indt/>
			<send_pers_email/>
			<issu_dt/>
			<tot_suply_amt/>
			<tot_amt/>
			<tot_tax_amt/>
			<cash/>
			<note/>
			<chqe/>
			<trust_unrcp_amt/>
			<rcpt_clam_yn/>
			<stat_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat May 23 10:59:48 KST 2009 */ %>