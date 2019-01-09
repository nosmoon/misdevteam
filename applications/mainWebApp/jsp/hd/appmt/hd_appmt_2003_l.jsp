<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.appmt.rec.*
	,	chosun.ciis.hd.appmt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_APPMT_2003_LDataSet ds = (HD_APPMT_2003_LDataSet)request.getAttribute("ds");
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
			HD_APPMT_2003_LCURLISTRecord rec = (HD_APPMT_2003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "noti_dt", rec.noti_dt);
			rx.add(record, "aply_fr_dt", rec.aply_fr_dt);
			rx.add(record, "aply_to_dt", rec.aply_to_dt);
			rx.add(record, "prv_base_saly", rec.prv_base_saly);
			rx.add(record, "prv_evngt_saly", rec.prv_evngt_saly);
			rx.add(record, "prv_evlu_saly", rec.prv_evlu_saly);
			rx.add(record, "prv_dty_acty_saly", rec.prv_dty_acty_saly); //2017.07.11  tv조선 직책활동비 항목 추가 
			rx.add(record, "aft_base_saly", rec.aft_base_saly);
			rx.add(record, "aft_evngt_saly", rec.aft_evngt_saly);
			rx.add(record, "aft_evlu_saly", rec.aft_evlu_saly);
			rx.add(record, "aft_dty_acty_saly", rec.aft_dty_acty_saly); //2017.07.11  tv조선 직책활동비 항목 추가 
			rx.add(record, "diff_base_saly", rec.diff_base_saly);
			rx.add(record, "diff_evngt_saly", rec.diff_evngt_saly);
			rx.add(record, "diff_evlu_saly", rec.diff_evlu_saly);
			rx.add(record, "diff_dty_acty_saly", rec.diff_dty_acty_saly);//2017.07.11  tv조선 직책활동비 항목 추가 
			rx.add(record, "sum_prv_amt", rec.sum_prv_amt);
			rx.add(record, "sum_aft_amt", rec.sum_aft_amt);
			rx.add(record, "sum_diff_amt", rec.sum_diff_amt);
			rx.add(record, "tot_sum_prv_amt", rec.tot_sum_prv_amt);
			rx.add(record, "tot_sum_aft_amt", rec.tot_sum_aft_amt);
			rx.add(record, "tot_sum_diff_amt", rec.tot_sum_diff_amt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "noti_dt", StringUtil.replaceToXml(rec.noti_dt));
			//rx.add(record, "aply_fr_dt", StringUtil.replaceToXml(rec.aply_fr_dt));
			//rx.add(record, "aply_to_dt", StringUtil.replaceToXml(rec.aply_to_dt));
			//rx.add(record, "prv_base_saly", StringUtil.replaceToXml(rec.prv_base_saly));
			//rx.add(record, "prv_evngt_saly", StringUtil.replaceToXml(rec.prv_evngt_saly));
			//rx.add(record, "prv_evlu_saly", StringUtil.replaceToXml(rec.prv_evlu_saly));
			//rx.add(record, "aft_base_saly", StringUtil.replaceToXml(rec.aft_base_saly));
			//rx.add(record, "aft_evngt_saly", StringUtil.replaceToXml(rec.aft_evngt_saly));
			//rx.add(record, "aft_evlu_saly", StringUtil.replaceToXml(rec.aft_evlu_saly));
			//rx.add(record, "diff_base_saly", StringUtil.replaceToXml(rec.diff_base_saly));
			//rx.add(record, "diff_evngt_saly", StringUtil.replaceToXml(rec.diff_evngt_saly));
			//rx.add(record, "diff_evlu_saly", StringUtil.replaceToXml(rec.diff_evlu_saly));
			//rx.add(record, "sum_prv_amt", StringUtil.replaceToXml(rec.sum_prv_amt));
			//rx.add(record, "sum_aft_amt", StringUtil.replaceToXml(rec.sum_aft_amt));
			//rx.add(record, "sum_diff_amt", StringUtil.replaceToXml(rec.sum_diff_amt));
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
<hd_appmt_2003_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<flnm/>
				<in_cmpy_dt/>
				<dept_cd/>
				<dept_nm/>
				<posi_nm/>
				<noti_dt/>
				<aply_fr_dt/>
				<aply_to_dt/>
				<prv_base_saly/>
				<prv_evngt_saly/>
				<prv_evlu_saly/>
				<aft_base_saly/>
				<aft_evngt_saly/>
				<aft_evlu_saly/>
				<diff_base_saly/>
				<diff_evngt_saly/>
				<diff_evlu_saly/>
				<sum_prv_amt/>
				<sum_aft_amt/>
				<sum_diff_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_appmt_2003_l>
*/
%>

<% /* 작성시간 : Thu Mar 28 14:26:44 KST 2013 */ %>