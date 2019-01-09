<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2172_ADataSet ds = (FC_ACCT_2172_ADataSet)request.getAttribute("ds");
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
			FC_ACCT_2172_ACURLISTRecord rec = (FC_ACCT_2172_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "col", rec.col);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_occr_cd", rec.slip_occr_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "col", StringUtil.replaceToXml(rec.col));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_occr_cd", StringUtil.replaceToXml(rec.slip_occr_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
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
<fc_acct_2172_a>
	<dataSet>
		<CURLIST>
			<record>
				<col/>
				<slip_occr_dt/>
				<slip_occr_cd/>
				<slip_seq/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2172_a>
*/
%>

<% /* 작성시간 : Fri Aug 14 10:07:22 KST 2009 */ %>