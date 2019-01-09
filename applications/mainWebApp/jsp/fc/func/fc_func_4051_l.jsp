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
	FC_FUNC_4051_LDataSet ds = (FC_FUNC_4051_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_4051_LCURLISTRecord rec = (FC_FUNC_4051_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "curacct_clsf_cd", rec.curacct_clsf_cd);
			rx.add(record, "pay_note_no", rec.pay_note_no);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "djgbnm", rec.djgbnm);
			rx.add(record, "total", rec.total);
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
			<mtry_dt/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<curacct_clsf_cd/>
			<pay_note_no/>
			<note_amt/>
			<comp_dt/>
			<compnm/>
			<djgbnm/>
			<total/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Mar 07 13:17:57 KST 2009 */ %>