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
	HD_JOB_1100_LDataSet ds = (HD_JOB_1100_LDataSet)request.getAttribute("ds");
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
			HD_JOB_1100_LCURLISTRecord rec = (HD_JOB_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.addCData(record, "dept_nm", rec.dept_nm);
			rx.addCData(record, "dty_nm", rec.dty_nm);
			rx.addCData(record, "posi_nm", rec.posi_nm);
			rx.addCData(record, "in_cmpy_jobnon_nm", rec.in_cmpy_jobnon_nm);
			rx.addCData(record, "cur_cmpy_jobnon_nm", rec.cur_cmpy_jobnon_nm);
			rx.add(record, "frdt", rec.frdt);
			rx.addCData(record, "cur_jobnon_nm", rec.cur_jobnon_nm);
			rx.addCData(record, "now_chrg_job", rec.now_chrg_job);
			rx.addCData(record, "now_dtls_job", rec.now_dtls_job);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "in_cmpy_jobnon_nm", StringUtil.replaceToXml(rec.in_cmpy_jobnon_nm));
			//rx.add(record, "cur_cmpy_jobnon_nm", StringUtil.replaceToXml(rec.cur_cmpy_jobnon_nm));
			//rx.add(record, "frdt", StringUtil.replaceToXml(rec.frdt));
			//rx.add(record, "cur_jobnon_nm", StringUtil.replaceToXml(rec.cur_jobnon_nm));
			//rx.add(record, "now_chrg_job", StringUtil.replaceToXml(rec.now_chrg_job));
			//rx.add(record, "now_dtls_job", StringUtil.replaceToXml(rec.now_dtls_job));
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
<hd_job_1100_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<nm_korn/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<in_cmpy_jobnon_nm/>
				<cur_cmpy_jobnon_nm/>
				<frdt/>
				<cur_jobnon_nm/>
				<now_chrg_job/>
				<now_dtls_job/>
			</record>
		</CURLIST>
	</dataSet>
</hd_job_1100_l>
*/
%>

<% /* 작성시간 : Wed Mar 02 15:04:39 KST 2011 */ %>