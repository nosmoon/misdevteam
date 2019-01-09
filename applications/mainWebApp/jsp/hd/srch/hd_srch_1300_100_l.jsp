<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_1300_100_LDataSet ds = (HD_SRCH_1300_100_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_1300_100_LCURLISTRecord rec = (HD_SRCH_1300_100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "up_dept_nm", StringUtil.replaceToXml(rec.up_dept_nm));
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "birth_yyyymmdd", rec.birth_yyyymmdd);
			rx.add(record, "t1", rec.t1);
			rx.add(record, "last_upgrd_dt", rec.last_upgrd_dt);
			rx.add(record, "limit_age_due_date", rec.limit_age_due_date);
			//rx.add(record, "up_dept_cd", StringUtil.replaceToXml(rec.up_dept_cd));
			//rx.add(record, "up_dept_nm", StringUtil.replaceToXml(rec.up_dept_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "birth_yyyymmdd", StringUtil.replaceToXml(rec.birth_yyyymmdd));
			//rx.add(record, "t1", StringUtil.replaceToXml(rec.t1));
			//rx.add(record, "last_upgrd_dt", StringUtil.replaceToXml(rec.last_upgrd_dt));
			//rx.add(record, "limit_age_due_date", StringUtil.replaceToXml(rec.limit_age_due_date));
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
<hd_srch_1300_100_l>
	<dataSet>
		<CURLIST>
			<record>
				<up_dept_cd/>
				<up_dept_nm/>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_nm/>
				<posi_nm/>
				<emp_clsf_nm/>
				<in_cmpy_dt/>
				<birth_yyyymmdd/>
				<t1/>
				<last_upgrd_dt/>
				<limit_age_due_date/>
			</record>
		</CURLIST>
	</dataSet>
</hd_srch_1300_100_l>
*/
%>

<% /* 작성시간 : Thu Dec 15 11:20:13 KST 2016 */ %>