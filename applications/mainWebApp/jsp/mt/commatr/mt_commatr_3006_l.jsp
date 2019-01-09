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
	MT_COMMATR_3006_LDataSet ds = (MT_COMMATR_3006_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "tab_main", "");

		if( ds.curlist4.size()> 0) {
			MT_COMMATR_3006_LCURLIST4Record rec = (MT_COMMATR_3006_LCURLIST4Record)ds.curlist4.get(0);
			rx.add(recordSet, "dlco_no", rec.dlco_no);
			rx.add(recordSet, "dlco_nm", rec.dlco_nm);
			rx.add(recordSet, "ern", rec.ern);
			rx.add(recordSet, "presi_nm", rec.presi_nm);
			rx.add(recordSet, "addr", rec.addr);
			rx.add(recordSet, "item", rec.item);
			rx.add(recordSet, "tel_no", rec.tel_no);
			rx.add(recordSet, "fax_no", rec.fax_no);
			rx.add(recordSet, "presi_tel_no_1", rec.presi_tel_no_1);
			rx.add(recordSet, "presi_tel_no_2", rec.presi_tel_no_2);
			rx.add(recordSet, "presi_email", rec.presi_email);
			rx.add(recordSet, "presi_prof", rec.presi_prof);
			rx.add(recordSet, "chrg_pers", rec.chrg_pers);
			rx.add(recordSet, "chrg_pers_tel_no_1", rec.chrg_pers_tel_no_1);
			rx.add(recordSet, "chrg_pers_tel_no_2", rec.chrg_pers_tel_no_2);
			rx.add(recordSet, "chrg_pers_email_1", rec.chrg_pers_email_1);
			rx.add(recordSet, "trsm_usag_email_yn_1", rec.trsm_usag_email_yn_1);
			rx.add(recordSet, "chrg_pers_email_2", rec.chrg_pers_email_2);
			rx.add(recordSet, "trsm_usag_email_yn_2", rec.trsm_usag_email_yn_2);
			rx.add(recordSet, "chrg_pers_dept", rec.chrg_pers_dept);
			rx.add(recordSet, "chrg_pers_prof", rec.chrg_pers_prof);
			rx.add(recordSet, "fndt_dt", rec.fndt_dt);
			rx.add(recordSet, "cmpy_hmpg", rec.cmpy_hmpg);
			rx.add(recordSet, "sale_amt", rec.sale_amt);
			rx.add(recordSet, "mrkt_ocpy_rate", rec.mrkt_ocpy_rate);
			rx.add(recordSet, "dlco_pcond", rec.dlco_pcond);
			rx.add(recordSet, "remk", rec.remk);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());

		recordSet = rx.add(dataSet, "tab4_grid", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_COMMATR_3006_LCURLIST3Record rec = (MT_COMMATR_3006_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "movmt", rec.movmt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "tab3_grid", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_COMMATR_3006_LCURLIST2Record rec = (MT_COMMATR_3006_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "chrg_pers_tel_no", rec.chrg_pers_tel_no);
			rx.add(record, "chrg_pers_email", rec.chrg_pers_email);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "tab2_grid", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_COMMATR_3006_LCURLIST1Record rec = (MT_COMMATR_3006_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "yy", rec.yy);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "busn_prft", rec.busn_prft);
			rx.add(record, "busn_prft_rate", rec.busn_prft_rate);
			rx.add(record, "thterm_net_prft", rec.thterm_net_prft);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "tab1_grid", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_3006_LCURLISTRecord rec = (MT_COMMATR_3006_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "ewh_amt", rec.ewh_amt);
			rx.add(record, "aewh_amt", rec.aewh_amt);
			rx.add(record, "ewh_qunt", rec.ewh_qunt);
			rx.add(record, "ewh_uprc", rec.ewh_uprc);
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
	<CURLIST3>
		<record>
			<cmpy_cd/>
			<dlco_no/>
			<seq/>
			<movmt/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cmpy_cd/>
			<dlco_no/>
			<seq/>
			<chrg_pers_nm/>
			<chrg_pers_tel_no/>
			<chrg_pers_email/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<dlco_no/>
			<seq/>
			<yy/>
			<sale_amt/>
			<busn_prft/>
			<busn_prft_rate/>
			<thterm_net_prft/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<matr_cd/>
			<matr_nm/>
			<ewh_amt/>
			<aewh_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Jul 11 12:09:16 KST 2009 */ %>