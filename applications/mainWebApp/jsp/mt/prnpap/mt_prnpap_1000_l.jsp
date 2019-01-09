<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_1000_LDataSet ds = (MT_PRNPAP_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "paperqulttest", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_1000_LCURLISTRecord rec = (MT_PRNPAP_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt.substring(0,4));
			rx.add(record, "occr_dt1", rec.occr_dt);
			rx.add(record, "occr_qq", rec.occr_qq+"/4분기");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "papcmpy_nm", rec.papcmpy_nm);
			rx.add(record, "eqp_mchn_no", rec.eqp_mchn_no);
			rx.add(record, "test_ask_dt", rec.test_ask_dt);
			rx.add(record, "test_frdt", rec.test_frdt);
			rx.add(record, "test_todt", rec.test_todt);
			rx.add(record, "test_instt", rec.test_instt);
			rx.add(record, "remk", rec.remk);
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
			<occr_dt/>
			<occr_qq/>
			<seq/>
			<fac_clsf/>
			<papcmpy_cd/>
			<eqp_mchn_no/>
			<test_ask_dt/>
			<test_frdt/>
			<test_todt/>
			<test_instt/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 30 12:52:19 KST 2009 */ %>