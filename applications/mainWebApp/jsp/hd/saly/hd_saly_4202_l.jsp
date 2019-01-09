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
	HD_SALY_4202_LDataSet ds = (HD_SALY_4202_LDataSet)request.getAttribute("ds");
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
			HD_SALY_4202_LCURLISTRecord rec = (HD_SALY_4202_LCURLISTRecord)ds.curlist.get(i);
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
			rx.add(record, "adv_clsf", rec.adv_clsf);
			rx.add(record, "adv_clsf_nm", rec.adv_clsf_nm);
			rx.add(record, "adv_dt", rec.adv_dt);
			rx.add(record, "mtry_months", rec.mtry_months);
			rx.add(record, "adv_prcp", rec.adv_prcp);
			rx.add(record, "mm_pymt_prcp", rec.mm_pymt_prcp);
			rx.add(record, "pymt_acml_tms", rec.pymt_acml_tms);
			rx.add(record, "rmn_amt", rec.rmn_amt);
			rx.add(record, "end_yn", rec.end_yn);
			rx.add(record, "end_dt", rec.end_dt);
			rx.add(record, "dduc_amt_sum", rec.dduc_amt_sum);
			rx.add(record, "dduc_dt_max", rec.dduc_dt_max);
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
			<adv_clsf/>
			<adv_clsf_nm/>
			<adv_dt/>
			<mtry_months/>
			<adv_prcp/>
			<mm_pymt_prcp/>
			<pymt_acml_tms/>
			<rmn_amt/>
			<end_yn/>
			<end_dt/>
			<dduc_amt_sum/>
			<dduc_dt_max/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 21 19:40:07 KST 2009 */ %>