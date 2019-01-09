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
	HD_SRCH_1400_100_LDataSet ds = (HD_SRCH_1400_100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
	//	recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SRCH_1400_100_LCURLISTRecord rec = (HD_SRCH_1400_100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "last_upgrd_dt", rec.last_upgrd_dt);
			rx.add(record, "pick_start_dt", rec.pick_start_dt);
			rx.add(record, "down_percent", rec.down_percent);
			rx.add(record, "tot_saly", rec.tot_saly);
			rx.add(record, "pick_salary", rec.pick_salary);
			rx.add(record, "minus_salary", rec.minus_salary);
			rx.add(record, "limit_age_due_date", rec.limit_age_due_date);
			rx.add(record, "basi_age", rec.basi_age);
			rx.add(record, "emp_birthday", rec.emp_birthday);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "last_upgrd_dt", StringUtil.replaceToXml(rec.last_upgrd_dt));
			//rx.add(record, "posi_stay_cnt", StringUtil.replaceToXml(rec.posi_stay_cnt));
			//rx.add(record, "pick_start_dt", StringUtil.replaceToXml(rec.pick_start_dt));
			//rx.add(record, "down_percent", StringUtil.replaceToXml(rec.down_percent));
			//rx.add(record, "tot_saly", StringUtil.replaceToXml(rec.tot_saly));
			//rx.add(record, "pick_salary", StringUtil.replaceToXml(rec.pick_salary));
			//rx.add(record, "minus_salary", StringUtil.replaceToXml(rec.minus_salary));
			//rx.add(record, "limit_age_due_date", StringUtil.replaceToXml(rec.limit_age_due_date));
			//rx.add(record, "basi_age", StringUtil.replaceToXml(rec.basi_age));
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
<hd_srch_1400_100_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<cd_nm/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<in_cmpy_dt/>
				<last_upgrd_dt/>
				<posi_stay_cnt/>
				<pick_start_dt/>
				<down_percent/>
				<tot_saly/>
				<pick_salary/>
				<minus_salary/>
				<limit_age_due_date/>
				<basi_age/>
			</record>
		</CURLIST>
	</dataSet>
</hd_srch_1400_100_l>
*/
%>

<% /* 작성시간 : Mon Dec 12 14:22:57 KST 2016 */ %>