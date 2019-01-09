<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1103_LDataSet ds = (AS_ASET_1103_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1103_LCURLISTRecord rec = (AS_ASET_1103_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "aset_nm", rec.aset_nm);
			rx.add(record, "chg_amt", rec.chg_amt);
			rx.add(record, "chg_vat_amt", rec.chg_vat_amt);
			rx.add(record, "hsty_cnt", rec.hsty_cnt);
			rx.add(record, "hsty_dlco_ern", rec.hsty_dlco_ern);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "chg_clsf", rec.chg_clsf);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "dept_cd", rec.dept_cd);
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
			<aset_no/>
			<aset_nm/>
			<chg_amt/>
			<chg_vat_amt/>
			<hsty_cnt/>
			<hsty_dlco_ern/>
			<dlco_nm/>
			<remk/>
			<cmpy_cd/>
			<chg_clsf/>
			<occr_dt/>
			<occr_seq/>
			<sub_seq/>
			<dept_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Mar 11 18:50:13 KST 2009 */ %>