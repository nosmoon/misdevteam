<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_3002_LDataSet ds = (MT_COMMATR_3002_LDataSet)request.getAttribute("ds");
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
			MT_COMMATR_3002_LCURLISTRecord rec = (MT_COMMATR_3002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "item", rec.item);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "fax_no", rec.fax_no);
			rx.add(record, "presi_tel_no_1", rec.presi_tel_no_1);
			rx.add(record, "presi_tel_no_2", rec.presi_tel_no_2);
			rx.add(record, "presi_email", rec.presi_email);
			rx.add(record, "presi_prof", rec.presi_prof);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "chrg_pers_tel_no_1", rec.chrg_pers_tel_no_1);
			rx.add(record, "chrg_pers_tel_no_2", rec.chrg_pers_tel_no_2);
			rx.add(record, "chrg_pers_email_1", rec.chrg_pers_email_1);
			rx.add(record, "trsm_usag_email_yn_1", rec.trsm_usag_email_yn_1);
			rx.add(record, "chrg_pers_email_2", rec.chrg_pers_email_2);
			rx.add(record, "trsm_usag_email_yn_2", rec.trsm_usag_email_yn_2);
			rx.add(record, "chrg_pers_dept", rec.chrg_pers_dept);
			rx.add(record, "chrg_pers_prof", rec.chrg_pers_prof);
			rx.add(record, "fndt_dt", rec.fndt_dt);
			rx.add(record, "cmpy_hmpg", rec.cmpy_hmpg);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "mrkt_ocpy_rate", rec.mrkt_ocpy_rate);
			rx.add(record, "dlco_pcond", rec.dlco_pcond);
			rx.add(record, "remk", rec.remk);
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
			<dlco_no/>
			<dlco_nm/>
			<ern/>
			<presi_nm/>
			<addr/>
			<item/>
			<tel_no/>
			<fax_no/>
			<presi_tel_no_1/>
			<presi_tel_no_2/>
			<presi_email/>
			<presi_prof/>
			<chrg_pers/>
			<chrg_pers_tel_no_1/>
			<chrg_pers_tel_no_2/>
			<chrg_pers_email_1/>
			<trsm_usag_email_yn_1/>
			<chrg_pers_email_2/>
			<trsm_usag_email_yn_2/>
			<chrg_pers_dept/>
			<chrg_pers_prof/>
			<fndt_dt/>
			<cmpy_hmpg/>
			<sale_amt/>
			<mrkt_ocpy_rate/>
			<dlco_pcond/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Jul 11 13:16:00 KST 2009 */ %>