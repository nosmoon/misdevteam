<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.corr.rec.*
	,	chosun.ciis.hd.corr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CORR_1400_LDataSet ds = (HD_CORR_1400_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
	HD_CORR_1400_LCURLISTRecord rec = (HD_CORR_1400_LCURLISTRecord)ds.curlist.get(i);
	int record = rx.add(dataSet, "record", "");
	rx.add(record, "emp_no", rec.emp_no);
	rx.add(record, "occr_dt", rec.occr_dt);
	rx.add(record, "seq", rec.seq);
	rx.add(record, "flnm", rec.flnm);
	rx.add(record, "dept_cd", rec.dept_cd);
	rx.add(record, "dept_nm", rec.dept_nm);
	rx.add(record, "dty_cd", rec.dty_cd);
	rx.add(record, "dty_nm", rec.dty_nm);
	rx.add(record, "posi_cd", rec.posi_cd);
	rx.add(record, "posi_nm", rec.posi_nm);
	rx.add(record, "natn_cd", rec.natn_cd);
	rx.add(record, "natn_nm", rec.natn_nm);
	rx.add(record, "duty_area", rec.duty_area);
	rx.add(record, "duty_area_nm", rec.duty_area_nm);
	rx.add(record, "pay_yymm", rec.pay_yymm);
	rx.add(record, "aplc_frex_stot", rec.aplc_frex_stot);
	rx.add(record, "aplc_exrate", rec.aplc_exrate);
	rx.add(record, "aplc_won_stot", rec.aplc_won_stot);
	rx.add(record, "adjm_frex_stot", rec.adjm_frex_stot);
	rx.add(record, "adjm_exrate", rec.adjm_exrate);
	rx.add(record, "adjm_won_stot", rec.adjm_won_stot);
	rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
	rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
	rx.add(record, "start_work", rec.appmt_dt);
	rx.add(record, "end_work", rec.real_reinst_return_dt);
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
<tempData>
	<CURLIST>
		<record>
			<emp_no/>
			<occr_dt/>
			<seq/>
			<flnm/>
			<dept_cd/>
			<dty_cd/>
			<posi_cd/>
			<natn_cd/>
			<duty_area/>
			<pay_yymm/>
			<aplc_frex_stot/>
			<aplc_exrate/>
			<aplc_won_stot/>
			<adjm_frex_stot/>
			<adjm_exrate/>
			<adjm_won_stot/>
			<slip_proc_mang_dt/>
			<slip_proc_mang_seq/>
			<start_work/>
			<end_work/>
		</record>
	</CURLIST>
</tempData>
*/
%>

<% /* 작성시간 : Wed Apr 08 17:02:30 KST 2009 */ %>