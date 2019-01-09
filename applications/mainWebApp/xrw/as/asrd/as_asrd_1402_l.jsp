<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.asrd.rec.*
	,	chosun.ciis.as.asrd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASRD_1402_LDataSet ds = (AS_ASRD_1402_LDataSet)request.getAttribute("ds");
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
			AS_ASRD_1402_LCURLISTRecord rec = (AS_ASRD_1402_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "chg_clsf", rec.chg_clsf);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "aset_nm", rec.aset_nm);
			rx.add(record, "chg_clsf_nm", rec.chg_clsf_nm);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "aset_qunt_cnt", rec.aset_qunt_cnt);
			rx.add(record, "chg_amt", rec.chg_amt);
			rx.add(record, "chg_vat_amt", rec.chg_vat_amt);
			rx.add(record, "dlco_ern", rec.dlco_ern);
			rx.add(record, "custnm", rec.custnm);
			rx.add(record, "befo_dept_nm", rec.befo_dept_nm);
			rx.add(record, "now_dept_nm", rec.now_dept_nm);
			rx.add(record, "now_loca", rec.now_loca);
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<chg_clsf/>
			<occr_dt/>
			<occr_seq/>
			<aset_no/>
			<aset_nm/>
			<chg_clsf_nm/>
			<chg_dt/>
			<aset_qunt_cnt/>
			<chg_amt/>
			<chg_vat_amt/>
			<dlco_ern/>
			<custnm/>
			<befo_dept_nm/>
			<now_dept_nm/>
			<now_loca/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon Mar 09 09:54:45 KST 2009 */ %>