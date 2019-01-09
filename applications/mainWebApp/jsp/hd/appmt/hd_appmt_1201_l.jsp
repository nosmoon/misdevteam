<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.appmt.rec.*
	,	chosun.ciis.hd.appmt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_APPMT_1201_LDataSet ds = (HD_APPMT_1201_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		dataSet = rx.add(root, "tempData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_APPMT_1201_LCURLISTRecord rec = (HD_APPMT_1201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "row_num", rec.row_num);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "appmt_cd", rec.appmt_cd);
			rx.add(record, "appmt_nm", rec.appmt_nm);
			rx.add(record, "appmt_resn_cd", rec.appmt_resn_cd);
			rx.add(record, "appmt_resn_nm", rec.appmt_resn_nm);
			rx.add(record, "appmt_dt", rec.appmt_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "appmt_sort", rec.appmt_sort);
			rx.add(record, "base_saly", rec.base_saly);
			rx.add(record, "posk_saly", rec.posk_saly);
			rx.add(record, "saly_stot", rec.saly_stot);
			rx.add(record, "lvcmpy_acml_amt", rec.lvcmpy_acml_amt);
			rx.add(record, "bns_incd_servcost", rec.bns_incd_servcost);
			rx.add(record, "appmt_cont", rec.appmt_cont);
			rx.add(record, "clos_proc_yn", rec.clos_proc_yn);
			rx.add(record, "clos_proc_yn_nm", rec.clos_proc_yn_nm);
			rx.add(record, "dspch_enpr_main_clsf", rec.dspch_enpr_main_clsf);
			rx.add(record, "dspch_enpr_main_nm", rec.dspch_enpr_main_nm);
			rx.add(record, "posk_clas_cd", rec.posk_clas_cd);
			rx.add(record, "posk_clas_nm", rec.posk_clas_nm);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "appmt_indc_yn", rec.appmt_indc_yn);

			rx.add(record, "occr_dt", rec.occr_dt);
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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<flnm/>
			<dept_cd/>
			<dept_nm/>
			<appmt_cd/>
			<appmt_nm/>
			<appmt_resn_cd/>
			<appmt_resn_nm/>
			<appmt_dt/>
			<mtry_dt/>
			<emp_clsf_cd/>
			<emp_clsf_nm/>
			<appmt_dt/>
			<mtry_dt/>
			<emp_clsf_cd/>
			<emp_clsf_nm/>
			<appmt_sort/>
			<base_saly/>
			<posk_saly/>
			<lvcmpy_acml_amt/>
			<bns_incd_servcost/>
			<appmt_cont/>
			<seq/>
			<occr_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 18 15:03:27 KST 2009 */ %>