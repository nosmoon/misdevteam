<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_2301_LDataSet ds = (HD_EVLU_2301_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	int evlu_excl_dd = rx.add(dataSet, "evlu_excl_dd", ds.evlu_excl_dd);
	int evlu_excl_daycnt = rx.add(dataSet, "evlu_excl_daycnt", ds.evlu_excl_daycnt);
	int excl_per_memcnt = rx.add(dataSet, "excl_per_memcnt", ds.membcnt_rate);

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_2301_LCURLISTRecord rec = (HD_EVLU_2301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "fee_duty_dd", rec.fee_duty_dd);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "ictry_dspch", rec.ictry_dspch);
			rx.add(record, "forn_dspch", rec.forn_dspch);
			rx.add(record, "ictry_stdy", rec.ictry_stdy);
			rx.add(record, "forn_stdy", rec.forn_stdy);
			rx.add(record, "temp_duty", rec.temp_duty);
			rx.add(record, "susp_duty", rec.susp_duty);
			
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
			<dept_nm/>
			<emp_no/>
			<nm_korn/>
			<dty_nm/>
			<posi_nm/>
			<fee_duty_dd/>
			<remk/>
			<dept_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jul 21 17:31:49 KST 2009 */ %>