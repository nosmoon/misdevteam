<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.job.rec.*
	,	chosun.ciis.hd.job.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_JOB_1000_LDataSet ds = (HD_JOB_1000_LDataSet)request.getAttribute("ds");
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
			HD_JOB_1000_LCURLISTRecord rec = (HD_JOB_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			rx.add(record, "chrg_job", StringUtil.replaceToXml(rec.chrg_job));
			rx.add(record, "dtls_job", StringUtil.replaceToXml(rec.dtls_job));
			rx.add(record, "aprv_stat", rec.aprv_stat);
			rx.add(record, "aprv_stat_yn", rec.aprv_stat_yn);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "in_cmpy_posk_cd", rec.cur_jobnon_cd);
			rx.add(record, "in_cmpy_posk_nm", rec.cur_jobnon_nm);
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
			<frdt/>
			<todt/>
			<part_cd/>
			<part_nm/>
			<chrg_job/>
			<dtls_job/>
			<aprv_stat/>
			<aprv_stat_yn/>
			<seq/>
			<cur_jobnon_cd/>
			<cur_jobnon_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 24 17:31:28 KST 2009 */ %>