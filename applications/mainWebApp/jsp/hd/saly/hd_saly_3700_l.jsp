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
	HD_SALY_3700_LDataSet ds = (HD_SALY_3700_LDataSet)request.getAttribute("ds");
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
			HD_SALY_3700_LCURLISTRecord rec = (HD_SALY_3700_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "etc_saly_amt", rec.etc_saly_amt);
			rx.add(record, "incm_tax", rec.incm_tax);
			rx.add(record, "res_tax", rec.res_tax);
			rx.add(record, "total_fee", rec.total_fee);
			rx.add(record, "total_amt", rec.total_amt);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "etc_saly_amt", StringUtil.replaceToXml(rec.etc_saly_amt));
			//rx.add(record, "incm_tax", StringUtil.replaceToXml(rec.incm_tax));
			//rx.add(record, "res_tax", StringUtil.replaceToXml(rec.res_tax));
			//rx.add(record, "total_fee", StringUtil.replaceToXml(rec.total_fee));
			//rx.add(record, "total_amt", StringUtil.replaceToXml(rec.total_amt));
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
<hd_saly_3700_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<occr_dt/>
				<etc_saly_amt/>
				<incm_tax/>
				<res_tax/>
				<total_fee/>
				<total_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_3700_l>
*/
%>

<% /* 작성시간 : Fri Oct 23 18:12:52 KST 2009 */ %>