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
	HD_AFFR_2600_LDataSet ds = (HD_AFFR_2600_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_2600_LCURLIST1Record rec = (HD_AFFR_2600_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "chk_dt", rec.chk_dt);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "faml_flnm", rec.faml_flnm);
			rx.add(record, "faml_prn", rec.faml_prn);
			rx.add(record, "chk_yn", rec.chk_yn);
			rx.add(record, "re_in_cmpy", rec.re_in_cmpy);
			rx.add(record, "last_temp_dt", rec.last_temp_dt);
			rx.add(record, "last_reinst_dt", rec.last_reinst_dt);
			rx.add(record, "last_stdy_dt", rec.last_stdy_dt);
			rx.add(record, "last_stdy_reinst_dt", rec.last_stdy_reinst_dt);
			rx.add(record, "temp_work", rec.temp_work);
			rx.add(record, "stdy", rec.stdy);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "lvcmpy_resn_nm", rec.lvcmpy_resn_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);			
		}
		rx.add(dataSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "countData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_2600_LCURLISTRecord rec = (HD_AFFR_2600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "full_seq", rec.full_seq);
			rx.add(record, "chk_seq", rec.chk_seq);
			rx.add(record, "temp_seq", rec.temp_seq);
			rx.add(record, "stdy_seq", rec.stdy_seq);
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
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<occr_dt/>
			<seq/>
			<chk_dt/>
			<flnm/>
			<dept_cd/>
			<dty_cd/>
			<posi_cd/>
			<dept_nm/>
			<dty_nm/>
			<posi_nm/>
			<prn/>
			<faml_flnm/>
			<faml_prn/>
			<chk_yn/>
			<re_in_cmpy/>
			<last_temp_dt/>
			<last_reinst_dt/>
			<last_stdy_dt/>
			<last_stdy_reinst_dt/>
			<temp_work/>
			<stdy/>
			<lvcmpy_dt/>
			<lvcmpy_resn_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<full_seq/>
			<chk_seq/>
			<temp_seq/>
			<stdy_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 01 20:56:50 KST 2009 */ %>