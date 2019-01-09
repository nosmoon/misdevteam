<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.cost.rec.*
	,	chosun.ciis.hd.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COST_1002_LDataSet ds = (HD_COST_1002_LDataSet)request.getAttribute("ds");
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
			HD_COST_1002_LCURLISTRecord rec = (HD_COST_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "subj_sel_dt", rec.subj_sel_dt);
			rx.add(record, "real_fee_subj_sel_item_cd", rec.real_fee_subj_sel_item_cd);
			rx.add(record, "item_seq", rec.item_seq);
			rx.add(record, "real_fee_subj_sel_fee", rec.real_fee_subj_sel_fee);
			rx.add(record, "subj_sel_ptcr",StringUtil.replaceToXml( rec.subj_sel_ptcr));
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "dtl_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);	
			rx.add(record, "proc_stat", rec.proc_stat );
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
			<dept_cd/>
			<dty_cd/>
			<posi_cd/>
			<subj_sel_dt/>
			<real_fee_subj_sel_item_cd/>
			<item_seq/>
			<real_fee_subj_sel_fee/>
			<subj_sel_ptcr/>
			<cmpy_cd/>
			<emp_no/>
			<occr_dt/>
			<seq/>
			<flnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 16 21:19:11 KST 2009 */ %>