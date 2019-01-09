<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.hlywrk.rec.*
	,	chosun.ciis.hd.hlywrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_HLYWRK_1100_LDataSet ds = (HD_HLYWRK_1100_LDataSet)request.getAttribute("ds");
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
			HD_HLYWRK_1100_LCURLISTRecord rec = (HD_HLYWRK_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "chk", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_dd_clsf", rec.finish_dd_clsf);
			rx.add(record, "finish_tm", rec.finish_tm);
			rx.add(record, "tot_duty_tm", rec.tot_duty_tm);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "alvc_use_dt", rec.alvc_use_dt);
			rx.add(record, "alvc_use_yn", rec.alvc_use_yn);
			rx.add(record, "alvc_use_yn_nm", rec.alvc_use_yn_nm);
			rx.add(record, "hody_clsf", rec.hody_clsf);
			rx.add(record, "hody_clsf_nm", rec.hody_clsf_nm);
			rx.add(record, "alvc_plan_dt", "");
			rx.add(record, "finish_dd_clsf_nm", rec.finish_dd_clsf_nm);
			rx.add(record, "paidhody_cnt", rec.paidhody_cnt);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
			<dept_cd/>
			<cd_nm/>
			<nm_korn/>
			<posi_nm/>
			<emp_no/>
			<duty_dt/>
			<prsnt_tm/>
			<finish_dd_clsf/>
			<finish_tm/>
			<tot_duty_tm/>
			<proc_stat/>
			<alvc_use_dt/>
			<alvc_use_yn/>
			<alvc_use_yn_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 20 10:50:53 KST 2009 */ %>