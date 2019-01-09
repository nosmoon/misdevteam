<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_3600_LDataSet ds = (HD_LVCMPY_3600_LDataSet)request.getAttribute("ds");
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
			HD_LVCMPY_3600_LCURLISTRecord rec = (HD_LVCMPY_3600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "priv_lvcmpy_saly_estm_amt", rec.priv_lvcmpy_saly_estm_amt);
			rx.add(record, "this_month_out_amt", rec.this_month_out_amt);
			rx.add(record, "lvcmpy_saly_estm_amt", rec.lvcmpy_saly_estm_amt);
			rx.add(record, "set_amt", rec.set_amt);
			rx.add(record, "last_month_sum", rec.last_month_sum);
			rx.add(record, "diff_amt", rec.diff_amt);
			rx.add(record, "this_month_in_amt", rec.this_month_in_amt);
			rx.add(record, "this_year_sum", rec.this_year_sum);
			rx.add(record, "total_year_sum", rec.total_year_sum);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "priv_lvcmpy_saly_estm_amt", StringUtil.replaceToXml(rec.priv_lvcmpy_saly_estm_amt));
			//rx.add(record, "this_month_out_amt", StringUtil.replaceToXml(rec.this_month_out_amt));
			//rx.add(record, "lvcmpy_saly_estm_amt", StringUtil.replaceToXml(rec.lvcmpy_saly_estm_amt));
			//rx.add(record, "set_amt", StringUtil.replaceToXml(rec.set_amt));
			//rx.add(record, "last_month_sum", StringUtil.replaceToXml(rec.last_month_sum));
			//rx.add(record, "diff_amt", StringUtil.replaceToXml(rec.diff_amt));
			//rx.add(record, "this_month_in_amt", StringUtil.replaceToXml(rec.this_month_in_amt));
			//rx.add(record, "this_year_sum", StringUtil.replaceToXml(rec.this_year_sum));
			//rx.add(record, "total_year_sum", StringUtil.replaceToXml(rec.total_year_sum));
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
<hd_lvcmpy_3600_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<priv_lvcmpy_saly_estm_amt/>
				<this_month_out_amt/>
				<lvcmpy_saly_estm_amt/>
				<set_amt/>
				<last_month_sum/>
				<diff_amt/>
				<this_month_in_amt/>
				<this_year_sum/>
				<total_year_sum/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_3600_l>
*/
%>

<% /* 작성시간 : Mon Apr 09 15:05:56 KST 2012 */ %>