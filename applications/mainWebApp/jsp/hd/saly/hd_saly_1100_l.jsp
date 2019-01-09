<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_1100_LDataSet ds = (HD_SALY_1100_LDataSet)request.getAttribute("ds");
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
			HD_SALY_1100_LCURLISTRecord rec = (HD_SALY_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "job_clsf_nm", rec.job_clsf_nm);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "end_dt_tm", rec.end_dt_tm);
			//rx.add(record, "job_clsf_nm", StringUtil.replaceToXml(rec.job_clsf_nm));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "end_dt_tm", StringUtil.replaceToXml(rec.end_dt_tm));
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
<hd_saly_1100_l>
	<dataSet>
		<CURLIST>
			<record>
				<job_clsf_nm/>
				<proc_stat_nm/>
				<end_dt_tm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_1100_l>
*/
%>

<% /* 작성시간 : Wed Apr 22 19:21:05 KST 2009 */ %>