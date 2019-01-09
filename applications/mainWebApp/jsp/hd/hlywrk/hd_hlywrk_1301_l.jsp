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
	HD_HLYWRK_1301_LDataSet ds = (HD_HLYWRK_1301_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_HLYWRK_1301_LCURLISTRecord rec = (HD_HLYWRK_1301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "obj_clsf", rec.obj_clsf);
			rx.add(record, "hody_clsf", rec.hody_clsf);
			rx.add(record, "hody_clsf_nm", rec.hody_clsf_nm);
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_dd_clsf", rec.finish_dd_clsf);
			rx.add(record, "finish_dd_clsf_nm", rec.finish_dd_clsf_nm);
			rx.add(record, "finish_tm", rec.finish_tm);
			rx.add(record, "tot_duty_tm", rec.tot_duty_tm);
			rx.add(record, "alvc_use_dt", rec.alvc_use_dt);
			rx.add(record, "alvc_use_yn", rec.alvc_use_yn);
			rx.add(record, "alvc_plan_dt", rec.alvc_plan_dt);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "paidhody_ck", rec.paidhody_ck);
			rx.add(record, "alvc_use_yn_nm", rec.alvc_use_yn_nm);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "base_alon", rec.base_alon);
			rx.add(record, "cmpn_alon", rec.cmpn_alon);
			rx.add(record, "alon_pay_mm", rec.alon_pay_mm);
			rx.add(record, "dspch_enpr_main_clsf", rec.dspch_enpr_main_clsf); 
			rx.add(record, "hody_duty_cnt", rec.hody_duty_cnt); 
			rx.add(record, "chk", "");
			rx.add(record, "re_chk", "");
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
		<duty_dt/>
		<emp_no/>
		<nm_korn/>
		<dept_cd/>
		<dept_nm/>
		<posi_nm/>
		<obj_clsf/>
		<hody_clsf/>
		<hody_clsf_nm/>
		<prsnt_tm/>
		<finish_dd_clsf/>
		<finish_dd_clsf_nm/>
		<finish_tm/>
		<tot_duty_tm/>
		<alvc_use_dt/>
		<alvc_use_yn/>
		<alvc_plan_dt/>
		<proc_stat/>
		<paidhody_ck/>
		<alvc_use_yn_nm/>
		<proc_stat_nm/>
		<base_alon/>
		<cmpn_alon/>
		<alon_pay_mm/>
	</record>
</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 22 13:33:59 KST 2009 */ %>