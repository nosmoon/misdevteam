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
	HD_INFO_1081_LDataSet ds = (HD_INFO_1081_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1081_LCURLISTRecord rec = (HD_INFO_1081_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
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
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
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
			<emp_no/>
			<frnc_word_seq/>
			<frnc_word_cd/>
			<frnc_word_nm/>
			<test_cd/>
			<test_nm/>
			<test_grad/>
			<test_scor/>
			<test_dt/>
			<spk_grad_cd/>
			<spk_grad_nm/>
			<trn_grad_cd/>
			<trn_grad_nm/>
			<wrt_grad_cd/>
			<wrt_grad_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 11 09:13:36 KST 2009 */ %>