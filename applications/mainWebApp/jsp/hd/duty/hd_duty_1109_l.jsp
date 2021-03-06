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
	HD_DUTY_1109_LDataSet ds = (HD_DUTY_1109_LDataSet)request.getAttribute("ds");
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
			HD_DUTY_1109_LCURLISTRecord rec = (HD_DUTY_1109_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_tm", rec.finish_tm);
			rx.add(record, "finish_dd_clsf", rec.finish_dd_clsf); 
			rx.add(record, "hody_clsf", rec.hody_clsf);
			rx.add(record, "hody_clsf_nm", rec.hody_clsf_nm);
			rx.add(record, "duty_proc_stat", rec.duty_proc_stat);
			rx.add(record, "duty_proc_stat_nm", rec.duty_proc_stat_nm);
			rx.add(record, "vaca_proc_stat", rec.vaca_proc_stat);
			rx.add(record, "vaca_proc_stat_nm", rec.vaca_proc_stat_nm);
			rx.add(record, "alvc_plan_dt", rec.alvc_plan_dt);
			rx.addCData(record, "alvc_plan_resn", rec.alvc_plan_resn);
			rx.add(record, "addm_rest_minute", rec.addm_rest_minute);
			rx.add(record, "duty_clsf", rec.duty_clsf);


			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "duty_dt", StringUtil.replaceToXml(rec.duty_dt));
			//rx.add(record, "prsnt_tm", StringUtil.replaceToXml(rec.prsnt_tm));
			//rx.add(record, "finish_tm", StringUtil.replaceToXml(rec.finish_tm));
			//rx.add(record, "finish_dd_clsf", StringUtil.replaceToXml(rec.finish_dd_clsf));
			//rx.add(record, "hody_clsf", StringUtil.replaceToXml(rec.hody_clsf));
			//rx.add(record, "hody_clsf_nm", StringUtil.replaceToXml(rec.hody_clsf_nm));
			//rx.add(record, "duty_proc_stat", StringUtil.replaceToXml(rec.duty_proc_stat));
			//rx.add(record, "duty_proc_stat_nm", StringUtil.replaceToXml(rec.duty_proc_stat_nm));
			//rx.add(record, "vaca_proc_stat", StringUtil.replaceToXml(rec.vaca_proc_stat));
			//rx.add(record, "vaca_proc_stat_nm", StringUtil.replaceToXml(rec.vaca_proc_stat_nm));
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
<hd_duty_1109_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<duty_dt/>
				<prsnt_tm/>
				<finish_tm/>
				<finish_dd_clsf/>
				<hody_clsf/>
				<hody_clsf_nm/>
				<duty_proc_stat/>
				<duty_proc_stat_nm/>
				<vaca_proc_stat/>
				<vaca_proc_stat_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_duty_1109_l>
*/
%>

<% /* 작성시간 : Mon Sep 13 17:09:09 KST 2010 */ %>