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
	FC_FUNC_2001_LDataSet ds = (FC_FUNC_2001_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_2001_LCURLISTRecord rec = (FC_FUNC_2001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seci_nm", rec.seci_nm);
			rx.add(record, "face_val_amt", rec.face_val_amt);
			rx.add(record, "purc_amt", rec.purc_amt);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "defr_yys", rec.defr_yys);
			rx.add(record, "repay_yys", rec.repay_yys);
			rx.add(record, "div_repay_tms", rec.div_repay_tms);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "pay_bank_cd", rec.pay_bank_cd);
			rx.add(record, "banknm", rec.banknm);
			rx.add(record, "jpno", rec.jpno);
			rx.add(record, "acntsist", rec.acntsist);
			rx.add(record, "yugast", rec.yugast);
			rx.add(record, "preint", rec.preint);
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
			<seci_nm/>
			<face_val_amt/>
			<purc_amt/>
			<int_rate/>
			<issu_dt/>
			<comp_dt/>
			<mtry_dt/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<compnm/>
			<defr_yys/>
			<repay_yys/>
			<div_repay_tms/>
			<rmks/>
			<pay_bank_cd/>
			<banknm/>
			<jpno/>
			<acntsist/>
			<yugast/>
			<preint/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 10 14:43:28 KST 2009 */ %>