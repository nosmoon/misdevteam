<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_RPT_1701_LDataSet ds = (TN_RPT_1701_LDataSet)request.getAttribute("ds");
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
			TN_RPT_1701_LCURLIST1Record rec = (TN_RPT_1701_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fundidx", rec.fundidx);
			rx.add(record, "fund_nm", rec.fund_nm);
			rx.add(record, "paymethodcode", rec.paymethodcode);
			rx.add(record, "paymethod_nm", rec.paymethod_nm);
			rx.add(record, "mp0", rec.mp0);
			rx.add(record, "mp1", rec.mp1);
			rx.add(record, "mp2", rec.mp2);
			rx.add(record, "mp3", rec.mp3);
			rx.add(record, "mp4", rec.mp4);
			rx.add(record, "mp5", rec.mp5);
			rx.add(record, "mp6", rec.mp6);
			rx.add(record, "mp7", rec.mp7);
			rx.add(record, "mp8", rec.mp8);
			rx.add(record, "mp9", rec.mp9);
			rx.add(record, "mp10", rec.mp10);
			rx.add(record, "mp11", rec.mp11);
			rx.add(record, "mp12", rec.mp12);
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
<tn_rpt_1701_l>
	<dataSet>
		<CURLIST1>
			<record>
				<fundidx/>
				<fund_nm/>
				<paymethodcode/>
				<paymethod_nm/>
				<mp0/>
				<mp1/>
				<mp2/>
				<mp3/>
				<mp4/>
				<mp5/>
				<mp6/>
				<mp7/>
				<mp8/>
				<mp9/>
				<mp10/>
				<mp11/>
				<mp12/>
			</record>
		</CURLIST1>
	</dataSet>
</tn_rpt_1701_l>
*/
%>

<% /* 작성시간 : Wed Nov 30 10:35:01 KST 2016 */ %>