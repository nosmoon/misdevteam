<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_6000_LDataSet ds = (HD_SALY_6000_LDataSet)request.getAttribute("ds");
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
			HD_SALY_6000_LCURLISTRecord rec = (HD_SALY_6000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "start_mm", rec.start_mm);
			rx.add(record, "end_mm", rec.end_mm);
			rx.add(record, "lock_use_yn", rec.lock_use_yn);
			rx.add(record, "term", rec.term);
			rx.add(record, "saly_st_mm", rec.saly_st_mm);
			rx.add(record, "saly_ed_mm", rec.saly_ed_mm);
			rx.add(record, "cur_used2", rec.cur_used2);
			rx.add(record, "cur_used", rec.cur_used);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "start_mm", StringUtil.replaceToXml(rec.start_mm));
			//rx.add(record, "end_mm", StringUtil.replaceToXml(rec.end_mm));
			//rx.add(record, "lock_use_yn", StringUtil.replaceToXml(rec.lock_use_yn));
			//rx.add(record, "term", StringUtil.replaceToXml(rec.term));
			//rx.add(record, "saly_st_mm", StringUtil.replaceToXml(rec.saly_st_mm));
			//rx.add(record, "saly_ed_mm", StringUtil.replaceToXml(rec.saly_ed_mm));
			//rx.add(record, "cur_used2", StringUtil.replaceToXml(rec.cur_used2));
			//rx.add(record, "cur_used", StringUtil.replaceToXml(rec.cur_used));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
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
<hd_saly_6000_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<posi_cd/>
				<posi_nm/>
				<start_mm/>
				<end_mm/>
				<lock_use_yn/>
				<term/>
				<saly_st_mm/>
				<saly_ed_mm/>
				<cur_used2/>
				<cur_used/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_6000_l>
*/
%>

<% /* 작성시간 : Wed Nov 24 13:17:23 KST 2010 */ %>