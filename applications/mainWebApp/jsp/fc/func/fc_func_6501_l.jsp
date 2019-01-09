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
	FC_FUNC_6501_LDataSet ds = (FC_FUNC_6501_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_6501_LCURLISTRecord rec = (FC_FUNC_6501_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "deps_isav_nm", rec.deps_isav_nm);
			rx.add(record, "tot_pymt_amt", rec.tot_pymt_amt);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "mm_int", rec.mm_int);
			rx.add(record, "tot_int", rec.tot_int);
			rx.add(record, "jpno", rec.jpno);
			rx.add(record, "deps_isav_stat_cdnm", rec.deps_isav_stat_cdnm);
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
			<deps_isav_nm/>
			<tot_pymt_amt/>
			<int_rate/>
			<comp_dt/>
			<mtry_dt/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<compnm/>
			<rmks/>
			<mm_int/>
			<tot_int/>
			<jpno/>
			<deps_isav_stat_cdnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 13 12:01:54 KST 2009 */ %>