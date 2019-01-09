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
	EN_INNEXP_1019_MDataSet ds = (EN_INNEXP_1019_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			EN_INNEXP_1019_MCURLIST4Record rec = (EN_INNEXP_1019_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "reven_amt", rec.reven_amt);
			rx.add(record, "expn_amt", rec.expn_amt);
			rx.add(record, "bal_amt", rec.bal_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			EN_INNEXP_1019_MCURLIST3Record rec = (EN_INNEXP_1019_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "chrg_dept_cd", rec.chrg_dept_cd);
			rx.add(record, "chrg_dept_nm", rec.chrg_dept_nm);
			rx.add(record, "chrg_pers_emp_no", rec.chrg_pers_emp_no);
			rx.add(record, "chrg_pers_emp_nm", rec.chrg_pers_emp_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			EN_INNEXP_1019_MCURLIST2Record rec = (EN_INNEXP_1019_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "evnt_seq", rec.evnt_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			EN_INNEXP_1019_MCURLIST1Record rec = (EN_INNEXP_1019_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_seq", rec.evnt_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			EN_INNEXP_1019_MCURLIST5Record rec = (EN_INNEXP_1019_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "reven_stot", rec.reven_stot);
			rx.add(record, "expn_stot", rec.expn_stot);
			rx.add(record, "bal_stot", rec.bal_stot);
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

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
	<CURLIST4>
		<record>
			<reven_amt/>
			<expn_amt/>
			<bal_amt/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<evnt_nm/>
			<chrg_dept_cd/>
			<chrg_dept_nm/>
			<chrg_pers_emp_no/>
			<chrg_pers_emp_nm/>
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
			<evnt_nm/>
			<evnt_seq/>
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
			<evnt_seq/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST5>
		<record>
			<reven_stot/>
			<expn_stot/>
			<bal_stot/>
		</record>
	</CURLIST5>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 22 16:43:35 KST 2009 */ %>