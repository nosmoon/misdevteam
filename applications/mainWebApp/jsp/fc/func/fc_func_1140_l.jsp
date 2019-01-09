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
	FC_FUNC_1140_LDataSet ds = (FC_FUNC_1140_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
    int resData = 0;
    int gridData = 0;
	int dataSet = 0;
    int NOTETOTZ = 0;

	String errcode = "";
	String errmsg = "";
	resData = rx.add(root, "resData", "");
    gridData = rx.add(resData,"gridData","");
    dataSet = rx.add(gridData,"dataSet","");

	try {
		/****** NOTETOTZ BEGIN */
		NOTETOTZ = rx.add(dataSet, "NOTETOTZ", "");

		for(int i = 0; i < ds.notetotz.size(); i++) {
			FC_FUNC_1140_LNOTETOTZRecord rec = (FC_FUNC_1140_LNOTETOTZRecord)ds.notetotz.get(i);
			int record = rx.add(NOTETOTZ, "record", "");
			rx.add(record, "note_prvdd_bal", rec.note_prvdd_bal);
			rx.add(record, "note_thdd_incr", rec.note_thdd_incr);
			rx.add(record, "note_thdd_redu", rec.note_thdd_redu);
			rx.add(record, "note_thdd_bal", rec.note_thdd_bal);
			rx.add(record, "cmpy_prvdd_bal", rec.cmpy_prvdd_bal);
			rx.add(record, "cmpy_thdd_incr", rec.cmpy_thdd_incr);
			rx.add(record, "cmpy_thdd_redu", rec.cmpy_thdd_redu);
			rx.add(record, "cmpy_thdd_bal", rec.cmpy_thdd_bal);
			rx.add(record, "icty_prvdd_bal", rec.icty_prvdd_bal);
			rx.add(record, "icty_thdd_incr", rec.icty_thdd_incr);
			rx.add(record, "icty_thdd_redu", rec.icty_thdd_redu);
			rx.add(record, "icty_thdd_bal", rec.icty_thdd_bal);
			rx.add(record, "lcl_prvdd_bal", rec.lcl_prvdd_bal);
			rx.add(record, "lcl_thdd_incr", rec.lcl_thdd_incr);
			rx.add(record, "lcl_thdd_redu", rec.lcl_thdd_redu);
			rx.add(record, "lcl_thdd_bal", rec.lcl_thdd_bal);
			rx.add(record, "prvdd_bal6", rec.prvdd_bal6);
			rx.add(record, "thdd_incr6", rec.thdd_incr6);
			rx.add(record, "thdd_redu6", rec.thdd_redu6);
			rx.add(record, "thdd_bal6", rec.thdd_bal6);
			rx.add(record, "prvdd_bal7", rec.prvdd_bal7);
			rx.add(record, "thdd_incr7", rec.thdd_incr7);
			rx.add(record, "thdd_redu7", rec.thdd_redu7);
			rx.add(record, "thdd_bal7", rec.thdd_bal7);			
			rx.add(record, "bank_prvdd_bal", rec.bank_prvdd_bal);
			rx.add(record, "bank_thdd_incr", rec.bank_thdd_incr);
			rx.add(record, "bank_thdd_redu", rec.bank_thdd_redu);
			rx.add(record, "bank_thdd_bal", rec.bank_thdd_bal);
			rx.add(record, "clct_ask_prvdd_bal", rec.clct_ask_prvdd_bal);
			rx.add(record, "clct_ask_thdd_incr", rec.clct_ask_thdd_incr);
			rx.add(record, "clct_ask_thdd_redu", rec.clct_ask_thdd_redu);
			rx.add(record, "clct_ask_thdd_bal", rec.clct_ask_thdd_bal);
			rx.add(record, "dscn_ask_prvdd_bal", rec.dscn_ask_prvdd_bal);
			rx.add(record, "dscn_ask_thdd_incr", rec.dscn_ask_thdd_incr);
			rx.add(record, "dscn_ask_thdd_redu", rec.dscn_ask_thdd_redu);
			rx.add(record, "dscn_ask_thdd_bal", rec.dscn_ask_thdd_bal);
			rx.add(record, "dscn_note_prvdd_bal", rec.dscn_note_prvdd_bal);
			rx.add(record, "dscn_note_thdd_incr", rec.dscn_note_thdd_incr);
			rx.add(record, "dscn_note_thdd_redu", rec.dscn_note_thdd_redu);
			rx.add(record, "dscn_note_thdd_bal", rec.dscn_note_thdd_bal);
			rx.add(record, "endr_note_prvdd_bal", rec.endr_note_prvdd_bal);
			rx.add(record, "endr_note_thdd_incr", rec.endr_note_thdd_incr);
			rx.add(record, "endr_note_thdd_redu", rec.endr_note_thdd_redu);
			rx.add(record, "endr_note_thdd_bal", rec.endr_note_thdd_bal);
			rx.add(record, "elseprvdd_bal", rec.elseprvdd_bal);
			rx.add(record, "elsethdd_incr", rec.elsethdd_incr);
			rx.add(record, "elsethdd_redu", rec.elsethdd_redu);
			rx.add(record, "elsethdd_bal", rec.elsethdd_bal);
		}
		rx.add(NOTETOTZ, "totalcnt", ds.notetotz.size());
		/****** NOTETOTZ END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(resData, "errcode", errcode);
		rx.add(resData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<NOTETOTZ>
		<record>
			<note_prvdd_bal/>
			<note_thdd_incr/>
			<note_thdd_redu/>
			<note_thdd_bal/>
			<cmpy_prvdd_bal/>
			<cmpy_thdd_incr/>
			<cmpy_thdd_redu/>
			<cmpy_thdd_bal/>
			<icty_prvdd_bal/>
			<icty_thdd_incr/>
			<icty_thdd_redu/>
			<icty_thdd_bal/>
			<lcl_prvdd_bal/>
			<lcl_thdd_incr/>
			<lcl_thdd_redu/>
			<lcl_thdd_bal/>
			<prvdd_bal6/>
			<thdd_incr6/>
			<thdd_redu6/>
			<thdd_bal6/>
			<prvdd_bal7/>
			<thdd_incr7/>
			<thdd_redu7/>
			<thdd_bal7/>			
			<bank_prvdd_bal/>
			<bank_thdd_incr/>
			<bank_thdd_redu/>
			<bank_thdd_bal/>
			<clct_ask_prvdd_bal/>
			<clct_ask_thdd_incr/>
			<clct_ask_thdd_redu/>
			<clct_ask_thdd_bal/>
			<dscn_ask_prvdd_bal/>
			<dscn_ask_thdd_incr/>
			<dscn_ask_thdd_redu/>
			<dscn_ask_thdd_bal/>
			<dscn_note_prvdd_bal/>
			<dscn_note_thdd_incr/>
			<dscn_note_thdd_redu/>
			<dscn_note_thdd_bal/>
			<endr_note_prvdd_bal/>
			<endr_note_thdd_incr/>
			<endr_note_thdd_redu/>
			<endr_note_thdd_bal/>
			<elseprvdd_bal/>
			<elsethdd_incr/>
			<elsethdd_redu/>
			<elsethdd_bal/>
		</record>
	</NOTETOTZ>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 04 16:02:24 KST 2009 */ %>
