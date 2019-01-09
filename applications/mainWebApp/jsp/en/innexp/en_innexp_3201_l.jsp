<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.en.innexp.rec.*
	,	chosun.ciis.en.innexp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_INNEXP_3201_LDataSet ds = (EN_INNEXP_3201_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_3201_LCURLISTRecord rec = (EN_INNEXP_3201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "chrg_pers_emp_nm", rec.chrg_pers_emp_nm);
			rx.add(record, "stlm_yn", rec.stlm_yn);
			rx.add(record, "spon_amt", rec.spon_amt);
			rx.add(record, "advt_amt", rec.advt_amt);
			rx.add(record, "entr_amt", rec.entr_amt);
			rx.add(record, "join_amt", rec.join_amt);
			rx.add(record, "etc_amt", rec.etc_amt);
			rx.add(record, "reven_amt", rec.reven_amt);
			rx.add(record, "expn_amt", rec.expn_amt);
			rx.add(record, "bal_amt", rec.bal_amt);
			rx.add(record, "unrcp_amt", rec.unrcp_amt);
			rx.add(record, "budg_reven_amt", rec.budg_reven_amt);
			rx.add(record, "budg_expn_amt", rec.budg_expn_amt);
			rx.add(record, "budg_bal_amt", rec.budg_bal_amt);
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
			<evnt_cd/>
			<evnt_nm/>
			<chrg_pers_emp_nm/>
			<stlm_yn/>
			<spon_amt/>
			<advt_amt/>
			<entr_amt/>
			<join_amt/>
			<etc_amt/>
			<reven_amt/>
			<expn_amt/>
			<bal_amt/>
			<unrcp_amt/>
			<budg_reven_amt/>
			<budg_expn_amt/>
			<budg_bal_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 11 17:38:05 KST 2009 */ %>