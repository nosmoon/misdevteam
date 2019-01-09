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
	HD_SALY_4003_LDataSet ds = (HD_SALY_4003_LDataSet)request.getAttribute("ds");
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
			HD_SALY_4003_LCURLISTRecord rec = (HD_SALY_4003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "lon_clsf_cd", rec.lon_clsf_cd);
			rx.add(record, "lon_dt", rec.lon_dt);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "repay_months", rec.repay_months);
			rx.add(record, "lon_prcp", rec.lon_prcp);
			rx.add(record, "yy_int_rate", rec.yy_int_rate);
			rx.add(record, "lon_no", rec.lon_no);
			rx.add(record, "mm_pymt_dt", rec.mm_pymt_dt);
			rx.add(record, "mm_pymt_prcp", rec.mm_pymt_prcp);
			rx.add(record, "int_dduc_avg", rec.int_dduc_avg);
			rx.add(record, "pymt_acml_tms", rec.pymt_acml_tms);
			rx.add(record, "rmn_amt", rec.rmn_amt);
			rx.add(record, "end_yn", rec.end_yn);
			rx.add(record, "end_dt", rec.end_dt);
			rx.add(record, "prcp_dduc_amt_sum", rec.prcp_dduc_amt_sum);
			rx.add(record, "int_dduc_amt_sum", rec.int_dduc_amt_sum);
			rx.add(record, "dduc_dt_max", rec.dduc_dt_max);
			rx.add(record, "tot_amt_sum", rec.tot_amt_sum);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "lon_clsf_cd", StringUtil.replaceToXml(rec.lon_clsf_cd));
			//rx.add(record, "lon_dt", StringUtil.replaceToXml(rec.lon_dt));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "repay_months", StringUtil.replaceToXml(rec.repay_months));
			//rx.add(record, "lon_prcp", StringUtil.replaceToXml(rec.lon_prcp));
			//rx.add(record, "yy_int_rate", StringUtil.replaceToXml(rec.yy_int_rate));
			//rx.add(record, "lon_no", StringUtil.replaceToXml(rec.lon_no));
			//rx.add(record, "mm_pymt_dt", StringUtil.replaceToXml(rec.mm_pymt_dt));
			//rx.add(record, "mm_pymt_prcp", StringUtil.replaceToXml(rec.mm_pymt_prcp));
			//rx.add(record, "int_dduc_avg", StringUtil.replaceToXml(rec.int_dduc_avg));
			//rx.add(record, "pymt_acml_tms", StringUtil.replaceToXml(rec.pymt_acml_tms));
			//rx.add(record, "rmn_amt", StringUtil.replaceToXml(rec.rmn_amt));
			//rx.add(record, "end_yn", StringUtil.replaceToXml(rec.end_yn));
			//rx.add(record, "end_dt", StringUtil.replaceToXml(rec.end_dt));
			//rx.add(record, "prcp_dduc_amt_sum", StringUtil.replaceToXml(rec.prcp_dduc_amt_sum));
			//rx.add(record, "int_dduc_amt_sum", StringUtil.replaceToXml(rec.int_dduc_amt_sum));
			//rx.add(record, "dduc_dt_max", StringUtil.replaceToXml(rec.dduc_dt_max));
			//rx.add(record, "tot_amt_sum", StringUtil.replaceToXml(rec.tot_amt_sum));
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
<hd_saly_4003_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<lon_clsf_cd/>
				<lon_dt/>
				<flnm/>
				<repay_months/>
				<lon_prcp/>
				<yy_int_rate/>
				<lon_no/>
				<mm_pymt_dt/>
				<mm_pymt_prcp/>
				<int_dduc_avg/>
				<pymt_acml_tms/>
				<rmn_amt/>
				<end_yn/>
				<end_dt/>
				<prcp_dduc_amt_sum/>
				<int_dduc_amt_sum/>
				<dduc_dt_max/>
				<tot_amt_sum/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_4003_l>
*/
%>

<% /* 작성시간 : Tue Dec 08 13:57:59 KST 2009 */ %>