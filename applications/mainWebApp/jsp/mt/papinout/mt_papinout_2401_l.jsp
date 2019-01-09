<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2401_LDataSet ds = (MT_PAPINOUT_2401_LDataSet)request.getAttribute("ds");
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
			MT_PAPINOUT_2401_LCURLISTRecord rec = (MT_PAPINOUT_2401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "title", rec.title);
			rx.add(record, "jg_wt", rec.jg_wt);
			rx.add(record, "purc_uprc", rec.purc_uprc);
			rx.add(record, "stored_amt_nuge", rec.stored_amt_nuge);
			rx.add(record, "cur_amt", rec.cur_amt);
			rx.add(record, "cha_ak", rec.cha_ak);
			rx.add(record, "cur_ig_roll", rec.cur_ig_roll);
			rx.add(record, "cur_ig_wt", rec.cur_ig_wt);
			rx.add(record, "cur_ig_amt", rec.cur_ig_amt);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "grp", rec.grp);
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
			<title/>
			<jg_wt/>
			<purc_uprc/>
			<stored_amt_nuge/>
			<cur_amt/>
			<cha_ak/>
			<cur_ig_roll/>
			<cur_ig_wt/>
			<cur_ig_amt/>
			<matr_cd/>
			<grp/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 23 18:05:40 KST 2009 */ %>