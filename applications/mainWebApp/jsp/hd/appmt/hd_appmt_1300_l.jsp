<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.appmt.rec.*
	,	chosun.ciis.hd.appmt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_APPMT_1300_LDataSet ds = (HD_APPMT_1300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		dataSet = rx.add(root, "tempData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_APPMT_1300_LCURLISTRecord rec = (HD_APPMT_1300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "save", "");
			rx.addCData(record, "cmpy_cd", rec.cmpy_cd);
			rx.addCData(record, "emp_no", rec.emp_no);
			rx.addCData(record, "flnm", rec.flnm);
			rx.addCData(record, "dept_cd", rec.dept_cd);
			rx.addCData(record, "dept_nm", rec.dept_nm);
			rx.addCData(record, "appmt_cd", rec.appmt_cd);
			rx.addCData(record, "appmt_nm", rec.appmt_nm);
			rx.addCData(record, "appmt_resn_cd", rec.appmt_resn_cd);
			rx.addCData(record, "appmt_resn_nm", rec.appmt_resn_nm);
			rx.addCData(record, "appmt_dt", rec.appmt_dt);
			rx.addCData(record, "mtry_dt", rec.mtry_dt);
			rx.addCData(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.addCData(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.addCData(record, "base_saly", rec.base_saly);
			rx.addCData(record, "posk_saly", rec.posk_saly);
			rx.addCData(record, "saly_stot", rec.saly_stot);
			rx.addCData(record, "lvcmpy_acml_amt", rec.lvcmpy_acml_amt);
			rx.addCData(record, "bns_incd_servcost", rec.bns_incd_servcost);
			rx.addCData(record, "appmt_sort", rec.appmt_sort);
			rx.addCData(record, "appmt_cont", rec.appmt_cont);
			rx.addCData(record, "clos_proc_yn", rec.clos_proc_yn);
			rx.addCData(record, "clos_proc_yn_nm", rec.clos_proc_yn_nm);
			rx.addCData(record, "seq", rec.seq);
			rx.addCData(record, "occr_dt", rec.occr_dt);
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
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<emp_dtls_clsf/>
			<emp_dtls_clsf_nm/>
			<base_saly/>
			<posk_saly/>
			<saly_stot/>
			<appmt_sort/>
			<appmt_cont/>
			<appmt_stat_clsf/>
			<appmt_stat_clsf_nm/>
			<evngt_saly/>
			<supl_saly/>
			<trff_alon/>
			<treat_add_amt/>
			<saly_cls/>
			<nxt_promo_dt/>
			<seq/>
			<occr_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 18 20:51:25 KST 2009 */ %>