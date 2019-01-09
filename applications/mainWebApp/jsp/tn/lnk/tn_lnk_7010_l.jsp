<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_LNK_7010_LDataSet ds = (TN_LNK_7010_LDataSet)request.getAttribute("ds");
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
			TN_LNK_7010_LCURLISTRecord rec = (TN_LNK_7010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "subs_fld", rec.subs_fld);
			rx.add(record, "subm_dt", rec.subm_dt);
			rx.addCData(record, "subs_cd", rec.subs_cd);
			rx.addCData(record, "work_nm", rec.work_nm);
			rx.addCData(record, "char_nm", rec.char_nm);
			rx.addCData(record, "char_email", rec.char_email);
			rx.add(record, "char_tel", rec.char_tel);
			rx.add(record, "char_hp", rec.char_hp);
			rx.addCData(record, "subs_work_nm", rec.subs_work_nm);
			rx.addCData(record, "work_cont", rec.work_cont);
			rx.add(record, "tot_budget", rec.tot_budget);
			rx.add(record, "myself_amt", rec.myself_amt);
			rx.addCData(record, "attch_nm", rec.attch_nm);
			rx.addCData(record, "attch_url", rec.attch_url);
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