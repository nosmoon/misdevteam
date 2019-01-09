<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_5220_LDataSet ds = (HD_INFO_5220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "Frncword", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5220_LCURLISTRecord rec = (HD_INFO_5220_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "frnc_word_seq", rec.frnc_word_seq);
			rx.add(record, "frnc_word_cd", rec.frnc_word_cd);
			rx.add(record, "frnc_word_flnm", rec.frnc_word_flnm);
			rx.add(record, "frnc_word_nm", rec.frnc_word_nm);
			rx.add(record, "test_cd", rec.test_cd);
			rx.add(record, "test_flnm", rec.test_flnm);
			rx.add(record, "test_nm", rec.test_nm);
			rx.add(record, "test_grad", rec.test_grad);
			rx.add(record, "test_scor", rec.test_scor);
			rx.add(record, "test_dt", rec.test_dt);
			rx.add(record, "test_enfc_instt", rec.test_enfc_instt);
			rx.add(record, "spc_matt", rec.spc_matt);
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
			<emp_no/>
			<frnc_word_seq/>
			<frnc_word_cd/>
			<frnc_word_flnm/>
			<frnc_word_nm/>
			<test_cd/>
			<test_flnm/>
			<test_nm/>
			<test_grad/>
			<test_scor/>
			<test_dt/>
			<test_enfc_instt/>
			<spc_matt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri Apr 10 13:31:43 KST 2009 */ %>