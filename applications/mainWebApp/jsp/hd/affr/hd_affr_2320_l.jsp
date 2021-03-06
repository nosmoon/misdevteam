<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_2320_LDataSet ds = (HD_AFFR_2320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_2320_LCURLISTRecord rec = (HD_AFFR_2320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "ofcr_clsf", rec.ofcr_clsf);
			rx.add(record, "pay_plac_clsf", rec.pay_plac_clsf);
			rx.add(record, "congr_condl_dt", rec.congr_condl_dt);
			rx.add(record, "congr_condl_cd", rec.congr_condl_cd);
			rx.add(record, "congr_condl_fee", rec.congr_condl_fee);
			rx.add(record, "art_flower", rec.art_flower);
			rx.add(record, "ofcr_congr_condl_fee", rec.ofcr_congr_condl_fee);
			rx.add(record, "ofcr_art_flower", rec.ofcr_art_flower);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "congr_condl_nm", rec.congr_condl_nm);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
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
			<emp_no/>
			<occr_dt/>
			<seq/>
			<flnm/>
			<dept_cd/>
			<dty_cd/>
			<posi_cd/>
			<ofcr_clsf/>
			<pay_plac_clsf/>
			<congr_condl_dt/>
			<congr_condl_cd/>
			<congr_condl_fee/>
			<art_flower/>
			<ofcr_congr_condl_fee/>
			<ofcr_art_flower/>
			<remk/>
			<slip_proc_mang_dt/>
			<slip_proc_mang_seq/>
			<dept_nm/>
			<dty_nm/>
			<posi_nm/>
			<congr_condl_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 26 11:09:10 KST 2009 */ %>