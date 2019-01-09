<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.job.rec.*
	,	chosun.ciis.hd.job.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_JOB_1101_LDataSet ds = (HD_JOB_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_JOB_1101_LCURLISTRecord rec = (HD_JOB_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chk", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			rx.add(record, "frdt", StringUtil.replaceToXml(rec.frdt));
			rx.add(record, "todt", StringUtil.replaceToXml(rec.todt));
			rx.add(record, "part_cd", StringUtil.replaceToXml(rec.part_cd));
			rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			rx.add(record, "cmpy_posk_cd", StringUtil.replaceToXml(rec.cmpy_posk_cd));
			rx.add(record, "cmpy_posk_nm", StringUtil.replaceToXml(rec.cmpy_posk_nm));
			rx.add(record, "chrg_job", StringUtil.replaceToXml(rec.chrg_job));
			rx.add(record, "dtls_job", StringUtil.replaceToXml(rec.dtls_job));
			rx.add(record, "aprv_stat", StringUtil.replaceToXml(rec.aprv_stat));
			rx.add(record, "aprv_stat_nm", StringUtil.replaceToXml(rec.aprv_stat_nm));
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dtls_cd1_1", rec.dtls_cd1_1);
			rx.add(record, "dtls_cd1_2", rec.dtls_cd1_2);
			rx.add(record, "dtls_cd2_1", rec.dtls_cd2_1);
			rx.add(record, "dtls_cd2_2", rec.dtls_cd2_2);
			rx.addCData(record, "dtls_nm1", rec.dtls_nm1);
			rx.addCData(record, "dtls_nm2", rec.dtls_nm2);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "frdt", StringUtil.replaceToXml(rec.frdt));
			//rx.add(record, "todt", StringUtil.replaceToXml(rec.todt));
			//rx.add(record, "part_cd", StringUtil.replaceToXml(rec.part_cd));
			//rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			//rx.add(record, "cmpy_posk_cd", StringUtil.replaceToXml(rec.cmpy_posk_cd));
			//rx.add(record, "cmpy_posk_nm", StringUtil.replaceToXml(rec.cmpy_posk_nm));
			//rx.add(record, "chrg_job", StringUtil.replaceToXml(rec.chrg_job));
			//rx.add(record, "dtls_job", StringUtil.replaceToXml(rec.dtls_job));
			//rx.add(record, "aprv_stat", StringUtil.replaceToXml(rec.aprv_stat));
			//rx.add(record, "aprv_stat_nm", StringUtil.replaceToXml(rec.aprv_stat_nm));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
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
<hd_job_1101_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<frdt/>
				<todt/>
				<part_cd/>
				<part_nm/>
				<cmpy_posk_cd/>
				<cmpy_posk_nm/>
				<chrg_job/>
				<dtls_job/>
				<aprv_stat/>
				<aprv_stat_nm/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_job_1101_l>
*/
%>

<% /* 작성시간 : Tue May 04 16:35:23 KST 2010 */ %>