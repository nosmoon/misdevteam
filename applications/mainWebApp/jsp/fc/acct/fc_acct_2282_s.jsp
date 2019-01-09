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
	FC_ACCT_2282_SDataSet ds = (FC_ACCT_2282_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_2282_SCURLIST1Record rec = (FC_ACCT_2282_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "vipasetdebt_incmg_dt1", rec.vipasetdebt_incmg_dt1);
			rx.add(record, "vipasetdebt_incmg_dt2", rec.vipasetdebt_incmg_dt2);
			rx.add(record, "ddbal_incmg_dt1", rec.ddbal_incmg_dt1);
			rx.add(record, "ddbal_incmg_dt2", rec.ddbal_incmg_dt2);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "incmg_dt", StringUtil.replaceToXml(rec.incmg_dt));
			//rx.add(record, "vipasetdebt_incmg_dt1", StringUtil.replaceToXml(rec.vipasetdebt_incmg_dt1));
			//rx.add(record, "vipasetdebt_incmg_dt2", StringUtil.replaceToXml(rec.vipasetdebt_incmg_dt2));
			//rx.add(record, "ddbal_incmg_dt1", StringUtil.replaceToXml(rec.ddbal_incmg_dt1));
			//rx.add(record, "ddbal_incmg_dt2", StringUtil.replaceToXml(rec.ddbal_incmg_dt2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<fc_acct_2282_s>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<incmg_dt/>
				<vipasetdebt_incmg_dt1/>
				<vipasetdebt_incmg_dt2/>
				<ddbal_incmg_dt1/>
				<ddbal_incmg_dt2/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2282_s>
*/
%>

<% /* 작성시간 : Thu Apr 30 17:23:04 KST 2009 */ %>