<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.hlywrk.rec.*
	,	chosun.ciis.hd.hlywrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_HLYWRK_1501_LDataSet ds = (HD_HLYWRK_1501_LDataSet)request.getAttribute("ds");
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
			HD_HLYWRK_1501_LCURLISTRecord rec = (HD_HLYWRK_1501_LCURLISTRecord)ds.curlist.get(i);
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
			rx.add(record, "alvc_use_yn_nm", rec.alvc_use_yn_nm);
			rx.add(record, "alvc_plan_dt", rec.alvc_plan_dt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "duty_dt", StringUtil.replaceToXml(rec.duty_dt));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "obj_clsf", StringUtil.replaceToXml(rec.obj_clsf));
			//rx.add(record, "hody_clsf", StringUtil.replaceToXml(rec.hody_clsf));
			//rx.add(record, "hody_clsf_nm", StringUtil.replaceToXml(rec.hody_clsf_nm));
			//rx.add(record, "prsnt_tm", StringUtil.replaceToXml(rec.prsnt_tm));
			//rx.add(record, "finish_dd_clsf", StringUtil.replaceToXml(rec.finish_dd_clsf));
			//rx.add(record, "finish_dd_clsf_nm", StringUtil.replaceToXml(rec.finish_dd_clsf_nm));
			//rx.add(record, "finish_tm", StringUtil.replaceToXml(rec.finish_tm));
			//rx.add(record, "tot_duty_tm", StringUtil.replaceToXml(rec.tot_duty_tm));
			//rx.add(record, "alvc_use_dt", StringUtil.replaceToXml(rec.alvc_use_dt));
			//rx.add(record, "alvc_use_yn", StringUtil.replaceToXml(rec.alvc_use_yn));
			//rx.add(record, "alvc_use_yn_nm", StringUtil.replaceToXml(rec.alvc_use_yn_nm));
			//rx.add(record, "alvc_plan_dt", StringUtil.replaceToXml(rec.alvc_plan_dt));
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
<hd_hlywrk_1501_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<duty_dt/>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<dty_nm/>
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
				<alvc_use_yn_nm/>
				<alvc_plan_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_hlywrk_1501_l>
*/
%>

<% /* 작성시간 : Wed May 14 17:27:04 KST 2014 */ %>