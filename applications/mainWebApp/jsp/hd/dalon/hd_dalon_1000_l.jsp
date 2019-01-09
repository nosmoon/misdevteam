<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_1000_LDataSet ds = (HD_DALON_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "resData", "");
	dataSet = rx.add(dataSet, "gridData", "");

	try {
		/****** CURLIST BEGIN */
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DALON_1000_LCURLISTRecord rec = (HD_DALON_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "chk", "");
			rx.add(record, "prvdd_prsnt_tm_prv", rec.prvdd_prsnt_tm_prv);
			rx.add(record, "prvdd_finish_tm_aft", rec.prvdd_finish_tm_aft);
			rx.add(record, "prvdd_finish_tm_prv", rec.prvdd_finish_tm_prv);
			rx.add(record, "thdd_prsnt_tm_aft", rec.thdd_prsnt_tm_aft);
			rx.add(record, "thdd_prsnt_tm_prv", rec.thdd_prsnt_tm_prv);
			rx.add(record, "thdd_duty_tm_excs", rec.thdd_duty_tm_excs);
			rx.add(record, "thdd_duty_tm_undr", rec.thdd_duty_tm_undr);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aply_basi_dt", rec.aply_basi_dt);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "new_apst_dt", "");
			rx.add(record, "statusValue", "");

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
			<cmpy_cd/>
			<apst_dt/>
			<seq/>
			<dtamt_cd/>
			<dtamt_cd_nm/>
			<prov_cost/>
			<etc/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 09 15:05:17 KST 2009 */ %>