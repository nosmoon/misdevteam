<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DUTY_1700_LDataSet ds = (HD_DUTY_1700_LDataSet)request.getAttribute("ds");
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
			HD_DUTY_1700_LCURLISTRecord rec = (HD_DUTY_1700_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_dd_nm", rec.finish_dd_nm);
			rx.add(record, "finish_tm", rec.finish_tm);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "hody_clsf_nm", rec.hody_clsf_nm);
			rx.add(record, "alon_pay_mm", rec.alon_pay_mm);
			rx.add(record, "addm_rest_minute", rec.addm_rest_minute);
			rx.add(record, "duty_clsf_nm", rec.duty_clsf_nm);

			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "duty_dt", StringUtil.replaceToXml(rec.duty_dt));
			//rx.add(record, "prsnt_tm", StringUtil.replaceToXml(rec.prsnt_tm));
			//rx.add(record, "finish_dd_nm", StringUtil.replaceToXml(rec.finish_dd_nm));
			//rx.add(record, "finish_tm", StringUtil.replaceToXml(rec.finish_tm));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "hody_clsf_nm", StringUtil.replaceToXml(rec.hody_clsf_nm));
			//rx.add(record, "alon_pay_mm", StringUtil.replaceToXml(rec.alon_pay_mm));
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
<hd_duty_1700_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<posi_nm/>
				<duty_dt/>
				<prsnt_tm/>
				<finish_dd_nm/>
				<finish_tm/>
				<proc_stat_nm/>
				<proc_stat/>
				<hody_clsf_nm/>
				<alon_pay_mm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_duty_1700_l>
*/
%>

<% /* 작성시간 : Wed Aug 01 19:23:13 KST 2012 */ %>