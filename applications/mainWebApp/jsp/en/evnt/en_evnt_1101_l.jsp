<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.en.evnt.rec.*
	,	chosun.ciis.en.evnt.ds.*
	, chosun.ciis.co.base.util.StringUtil;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_EVNT_1101_LDataSet ds = (EN_EVNT_1101_LDataSet)request.getAttribute("ds");
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
			EN_EVNT_1101_LCURLISTRecord rec = (EN_EVNT_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tmp_evnt_cd", rec.tmp_evnt_cd);
			rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			rx.add(record, "chrg_pers_emp_nm", StringUtil.replaceToXml(rec.chrg_pers_emp_nm));
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "stlm_dt", rec.stlm_dt);
			rx.add(record, "stlm_proc_pers_emp_no", StringUtil.replaceToXml(rec.stlm_proc_pers_emp_no));
			rx.add(record, "stlm_proc_pers_emp_nm", StringUtil.replaceToXml(rec.stlm_proc_pers_emp_nm));
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "evnt_yy", rec.evnt_yy);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_seq", rec.evnt_seq);
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
			<tmp_evnt_cd/>
			<evnt_nm/>
			<chrg_pers_emp_nm/>
			<clos_yn/>
			<stlm_dt/>
			<stlm_proc_pers_emp_no/>
			<stlm_proc_pers_emp_nm/>
			<cmpy_cd/>
			<evnt_yy/>
			<evnt_cd/>
			<evnt_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 12 18:19:26 KST 2009 */ %>