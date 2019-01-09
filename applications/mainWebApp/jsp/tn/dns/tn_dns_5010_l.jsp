<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.dns.rec.*
	,	chosun.ciis.tn.dns.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_DNS_5010_LDataSet ds = (TN_DNS_5010_LDataSet)request.getAttribute("ds");
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
			TN_DNS_5010_LCURLISTRecord rec = (TN_DNS_5010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "subs_nm", rec.subs_nm);
			rx.add(record, "subs_addr", rec.subs_addr);
			rx.add(record, "subs_tel", rec.subs_tel);
			rx.add(record, "subs_email", rec.subs_email);
			rx.add(record, "agree_yn", rec.agree_yn);
			rx.add(record, "etc1", rec.etc1);
			rx.add(record, "etc2", rec.etc2);
			rx.add(record, "etc3", rec.etc3);
			rx.add(record, "etc4", rec.etc4);
			rx.add(record, "etc5", rec.etc5);
			rx.add(record, "event_cd", rec.event_cd);
			rx.add(record, "incmgdt", rec.incmgdt);
			
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
<tn_lnk_7010_l>
	<dataSet>
		<CURLIST>
			<record>
				<seq/>
				<subs_fld/>
				<subm_dt/>
				<subs_cd/>
				<work_nm/>
				<char_nm/>
				<char_email/>
				<char_tel/>
				<char_hp/>
				<subs_work_nm/>
				<work_cont/>
				<tot_budget/>
				<attch_nm/>
				<attch_url/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_7010_l>
*/
%>

<% /* 작성시간 : Tue Apr 11 14:24:30 KST 2017 */ %>