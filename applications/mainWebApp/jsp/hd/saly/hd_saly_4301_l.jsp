<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_4301_LDataSet ds = (HD_SALY_4301_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_4301_LCURLISTRecord rec = (HD_SALY_4301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "acpn_yy", rec.acpn_yy);
			rx.add(record, "acpn_seq", rec.acpn_seq);
			rx.add(record, "acpn_dt", rec.acpn_dt);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "now_seiz_clsf", rec.now_seiz_clsf);
			rx.add(record, "fst_seiz_clsf", rec.fst_seiz_clsf);
			rx.add(record, "seiz_deci_dt", rec.seiz_deci_dt);
			rx.add(record, "seiz_clsf_chg_dt", rec.seiz_clsf_chg_dt);
			rx.add(record, "crdtor", rec.crdtor);
			rx.add(record, "seiz_clam_amt", rec.seiz_clam_amt);
			rx.add(record, "seiz_dduc_ratio", rec.seiz_dduc_ratio);
			rx.add(record, "seiz_bgn_saly_yy", rec.seiz_bgn_saly_yy);
			rx.add(record, "seiz_bgn_saly_no", rec.seiz_bgn_saly_no);
			rx.add(record, "dduc_amt_agg", rec.dduc_amt_agg);
			rx.add(record, "repay_amt_agg", rec.repay_amt_agg);
			rx.add(record, "psdo_seiz_rels_dt", rec.psdo_seiz_rels_dt);
			rx.add(record, "dduc_end_yn", rec.dduc_end_yn);
			rx.add(record, "dduc_end_dt", rec.dduc_end_dt);
			rx.add(record, "repay_end_yn", rec.repay_end_yn);
			rx.add(record, "repay_end_dt", rec.repay_end_dt);
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
			<emp_no/>
			<dept_cd/>
			<dept_nm/>
			<nm_korn/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<acpn_yy/>
			<acpn_seq/>
			<acpn_dt/>
			<flnm/>
			<now_seiz_clsf/>
			<fst_seiz_clsf/>
			<seiz_deci_dt/>
			<seiz_clsf_chg_dt/>
			<crdtor/>
			<seiz_clam_amt/>
			<seiz_dduc_ratio/>
			<seiz_bgn_saly_yy/>
			<seiz_bgn_saly_no/>
			<dduc_amt_agg/>
			<repay_amt_agg/>
			<psdo_seiz_rels_dt/>
			<dduc_end_yn/>
			<dduc_end_dt/>
			<repay_end_yn/>
			<repay_end_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 20 13:20:16 KST 2009 */ %>