<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_8031_LDataSet ds = (FC_FUNC_8031_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_FUNC_8031_LCURLIST2Record rec = (FC_FUNC_8031_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "leas_clsf_cd", rec.leas_clsf_cd);
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "pay_cost_clsf", rec.pay_cost_clsf);
			rx.add(record, "pay_cost_clsf_cdnm", rec.pay_cost_clsf_cdnm);
			rx.add(record, "hsty_seq", rec.hsty_seq);
			rx.add(record, "pymt_plan_dt", rec.pymt_plan_dt);
			rx.add(record, "prv_pymt_plan_prcp", rec.prv_pymt_plan_prcp);
			rx.add(record, "pymt_plan_prcp", rec.pymt_plan_prcp);
			rx.add(record, "pymt_plan_int", rec.pymt_plan_int);
			rx.add(record, "bal", rec.bal);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "pymt_yn", rec.pymt_yn);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_8031_LCURLIST1Record rec = (FC_FUNC_8031_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "cntr_clsf_cd", rec.cntr_clsf_cd);
			rx.add(record, "leas_clsf_cd", rec.leas_clsf_cd);
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "leas_nm", rec.leas_nm);
			rx.add(record, "frcr_amt", rec.frcr_amt);
			rx.add(record, "pay_plan_tms", rec.pay_plan_tms);
			rx.add(record, "leas_stat_cd", rec.leas_stat_cd);
			rx.add(record, "leas_stat_cdnm", rec.leas_stat_cdnm);
			rx.add(record, "pymt_cnt", rec.pymt_cnt);
			rx.add(record, "leas_hire_clsf_cd", rec.leas_hire_clsf_cd);
			rx.add(record, "leas_hire_clsf_cdnm", rec.leas_hire_clsf_cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST2>
		<record>
			<cmpy_cd/>
			<leas_clsf_cd/>
			<leas_no/>
			<pay_cost_clsf/>
			<pay_cost_clsf_cdnm/>
			<hsty_seq/>
			<pymt_plan_dt/>
			<prv_pymt_plan_prcp/>
			<pymt_plan_prcp/>
			<pymt_plan_int/>
			<bal/>
			<slip_no/>
			<pymt_yn/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<cntr_clsf_cd/>
			<leas_clsf_cd/>
			<leas_no/>
			<leas_nm/>
			<frcr_amt/>
			<pay_plan_tms/>
			<leas_stat_cd/>
			<leas_stat_cdnm/>
			<pymt_cnt/>
			<leas_hire_clsf_cd/>
			<leas_hire_clsf_cdnm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 01 11:24:24 KST 2009 */ %>