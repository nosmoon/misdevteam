<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.ddemp.rec.*
	,	chosun.ciis.hd.ddemp.ds.*;
	"
%>

<%
	System.out.println("7777777777");
	RwXml rx = new RwXml();
	HD_DDEMP_5000_LDataSet ds = (HD_DDEMP_5000_LDataSet)request.getAttribute("ds");
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
			HD_DDEMP_5000_LCURLISTRecord rec = (HD_DDEMP_5000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "emp_insr_fee", rec.emp_insr_fee);
			rx.add(record, "np_fee", rec.np_fee);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			rx.add(record, "hlth_insr_med_care_insr_fee", rec.hlth_insr_med_care_insr_fee);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "duty_yymm", rec.duty_yymm);
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
<hd_ddemp_5000_l>
	<dataSet>
		<CURLIST>
			<record>
				<duty_yymm/>
				<mang_no/>
				<flnm/>
				<prn/>
				<ptph_no/>
				<octgr_cd/>
				<octgr_cd_nm/>
				<lve_job_resn_cd/>
				<lve_job_resn_cd_nm/>
				<duty_dds/>
				<pay_amt/>
				<dd_amt/>
				<time_amt/>
				<incm_tax/>
				<res_tax/>
				<fisc_dt/>
				<emp_insr_fee/>
				<hlth_insr_fee/>
				<np_fee/>
				<budg_cd/>
				<budg_nm/>
				<rmks/>
				<actu_slip_no/>
				<proc_stat/>
				<proc_stat_nm/>
				<use_dept_cd/>
				<use_dept_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_ddemp_5000_l>
*/
%>

<% /* 작성시간 : Tue Feb 08 19:38:00 KST 2011 */ %>