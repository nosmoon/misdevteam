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
	HD_SALY_3600_LDataSet ds = (HD_SALY_3600_LDataSet)request.getAttribute("ds");
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
			HD_SALY_3600_LCURLISTRecord rec = (HD_SALY_3600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "saly_no", rec.saly_no);
			rx.add(record, "offi_nm", rec.offi_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "lon_dduc_seq", rec.lon_dduc_seq);
			rx.add(record, "prcp_dduc_amt", rec.prcp_dduc_amt);
			rx.add(record, "int_dduc_amt", rec.int_dduc_amt);
			rx.add(record, "lon_dt", rec.lon_dt);
			rx.add(record, "lon_prcp", rec.lon_prcp);
			//rx.add(record, "saly_yy", StringUtil.replaceToXml(rec.saly_yy));
			//rx.add(record, "saly_no", StringUtil.replaceToXml(rec.saly_no));
			//rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "lon_dduc_seq", StringUtil.replaceToXml(rec.lon_dduc_seq));
			//rx.add(record, "prcp_dduc_amt", StringUtil.replaceToXml(rec.prcp_dduc_amt));
			//rx.add(record, "int_dduc_amt", StringUtil.replaceToXml(rec.int_dduc_amt));
			//rx.add(record, "lon_dt", StringUtil.replaceToXml(rec.lon_dt));
			//rx.add(record, "lon_prcp", StringUtil.replaceToXml(rec.lon_prcp));
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
<hd_saly_3600_l>
	<dataSet>
		<CURLIST>
			<record>
				<saly_yy/>
				<saly_no/>
				<offi_nm/>
				<emp_no/>
				<nm_korn/>
				<lon_dduc_seq/>
				<prcp_dduc_amt/>
				<int_dduc_amt/>
				<lon_dt/>
				<lon_prcp/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_3600_l>
*/
%>

<% /* 작성시간 : Mon Oct 26 11:32:04 KST 2009 */ %>