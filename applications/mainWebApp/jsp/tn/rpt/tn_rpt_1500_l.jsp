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
	TN_RPT_1500_LDataSet ds = (TN_RPT_1500_LDataSet)request.getAttribute("ds");
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
			TN_RPT_1500_LCURLISTRecord rec = (TN_RPT_1500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "promiseidx", rec.promiseidx);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "code", rec.code);
			rx.add(record, "kind", rec.kind);
			rx.add(record, "data_kind", rec.data_kind);
			rx.add(record, "chg_cont_ssum", rec.chg_cont_ssum);
			rx.add(record, "chgpers", rec.chgpers);
			rx.add(record, "chgincmgdt", rec.chgincmgdt);
			//rx.add(record, "paymentidx", StringUtil.replaceToXml(rec.paymentidx));
			//rx.add(record, "promiseidx", StringUtil.replaceToXml(rec.promiseidx));
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "kind", StringUtil.replaceToXml(rec.kind));
			//rx.add(record, "data_kind", StringUtil.replaceToXml(rec.data_kind));
			//rx.add(record, "chg_cont_ssum", StringUtil.replaceToXml(rec.chg_cont_ssum));
			//rx.add(record, "chgpers", StringUtil.replaceToXml(rec.chgpers));
			//rx.add(record, "chgdt", StringUtil.replaceToXml(rec.chgdt));
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
<tn_rpt_1500_l>
	<dataSet>
		<CURLIST>
			<record>
				<paymentidx/>
				<promiseidx/>
				<memberidx/>
				<kind/>
				<data_kind/>
				<chg_cont_ssum/>
				<chgpers/>
				<chgincmgdt/>
			</record>
		</CURLIST>
	</dataSet>
</tn_rpt_1500_l>
*/
%>

<% /* 작성시간 : Thu Nov 03 10:17:03 KST 2016 */ %>