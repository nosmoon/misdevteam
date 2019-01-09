<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.knowhow.rec.*
	,	chosun.ciis.mt.knowhow.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_KNOWHOW_1002_LDataSet ds = (MT_KNOWHOW_1002_LDataSet)request.getAttribute("ds");
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
			MT_KNOWHOW_1002_LCURLISTRecord rec = (MT_KNOWHOW_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "question", StringUtil.replaceToXml(rec.question));
			rx.add(record, "answer", StringUtil.replaceToXml(rec.answer));
			rx.add(record, "reg_dt", StringUtil.replaceToXml(rec.reg_dt));
			rx.add(record, "qust_emp_nm", StringUtil.replaceToXml(rec.qust_emp_nm));
			rx.add(record, "ans_emp_nm", StringUtil.replaceToXml(rec.ans_emp_nm));
			rx.add(record, "lcls", StringUtil.replaceToXml(rec.lcls));
			rx.add(record, "reg_seq", StringUtil.replaceToXml(rec.reg_seq));
			rx.add(record, "qna", StringUtil.replaceToXml(rec.qna));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "question", rec.question);
			//rx.add(record, "answer", rec.answer);
			//rx.add(record, "reg_dt", rec.reg_dt);
			//rx.add(record, "qust_emp_nm", rec.qust_emp_nm);
			//rx.add(record, "ans_emp_nm", rec.ans_emp_nm);
			//rx.add(record, "lcls", rec.lcls);
			//rx.add(record, "reg_seq", rec.reg_seq);
			//rx.add(record, "qna", rec.qna);
			//rx.add(record, "seq", rec.seq);
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
<mt_knowhow_1002_l>
	<dataSet>
		<CURLIST>
			<record>
				<question/>
				<answer/>
				<reg_dt/>
				<qust_emp_nm/>
				<ans_emp_nm/>
				<lcls/>
				<reg_seq/>
				<qna/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</mt_knowhow_1002_l>
*/
%>

<% /* 작성시간 : Wed Jun 10 13:20:24 KST 2009 */ %>