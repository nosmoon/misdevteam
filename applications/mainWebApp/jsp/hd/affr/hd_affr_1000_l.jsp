<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_1000_LDataSet ds = (HD_AFFR_1000_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_1000_LCURLISTRecord rec = (HD_AFFR_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "now_duty_dept_cd", rec.now_duty_dept_cd);
			rx.add(record, "now_duty_dept_nm", rec.now_duty_dept_nm);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "email_id", rec.email_id);
			rx.add(record, "use_hday", rec.use_hday);
			rx.add(record, "use_day1", rec.use_day1);
			rx.add(record, "use_day2", rec.use_day2);
			rx.add(record, "count_day", rec.count_day);
			rx.add(record, "use_day1_next", rec.use_day1_next);
			rx.add(record, "use_day2_next", rec.use_day2_next);
			rx.add(record, "count_day_next", rec.count_day_next);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "emp_clsf_cd", StringUtil.replaceToXml(rec.emp_clsf_cd));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "emp_dtls_clsf", StringUtil.replaceToXml(rec.emp_dtls_clsf));
			//rx.add(record, "emp_dtls_clsf_nm", StringUtil.replaceToXml(rec.emp_dtls_clsf_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "now_duty_dept_cd", StringUtil.replaceToXml(rec.now_duty_dept_cd));
			//rx.add(record, "now_duty_dept_nm", StringUtil.replaceToXml(rec.now_duty_dept_nm));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "ptph_no", StringUtil.replaceToXml(rec.ptph_no));
			//rx.add(record, "email_id", StringUtil.replaceToXml(rec.email_id));
			//rx.add(record, "use_hday", StringUtil.replaceToXml(rec.use_hday));
			//rx.add(record, "use_day1", StringUtil.replaceToXml(rec.use_day1));
			//rx.add(record, "use_day2", StringUtil.replaceToXml(rec.use_day2));
			//rx.add(record, "count_day", StringUtil.replaceToXml(rec.count_day));
			//rx.add(record, "use_day1_next", StringUtil.replaceToXml(rec.use_day1_next));
			//rx.add(record, "use_day2_next", StringUtil.replaceToXml(rec.use_day2_next));
			//rx.add(record, "count_day_next", StringUtil.replaceToXml(rec.count_day_next));
			//rx.add(record, "emp_clsf", StringUtil.replaceToXml(rec.emp_clsf));
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
<hd_affr_1000_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<nm_korn/>
				<prn/>
				<in_cmpy_dt/>
				<emp_clsf_cd/>
				<emp_clsf_nm/>
				<emp_dtls_clsf/>
				<emp_dtls_clsf_nm/>
				<dept_cd/>
				<dept_nm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<now_duty_dept_cd/>
				<now_duty_dept_nm/>
				<tel_no/>
				<ptph_no/>
				<email_id/>
				<use_hday/>
				<use_day1/>
				<use_day2/>
				<count_day/>
				<use_day1_next/>
				<use_day2_next/>
				<count_day_next/>
				<emp_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_1000_l>
*/
%>

<% /* 작성시간 : Fri Nov 20 14:22:15 KST 2009 */ %>