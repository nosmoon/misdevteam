<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2112_LDataSet ds = (FC_ACCT_2112_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int gridData = 0;
	int fwdData = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "formData", "");
	
	rx.add(dataSet,"actu_slip_no",ds.actu_slip_no);
	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "curlist2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2112_LCURLISTRecord rec = (FC_ACCT_2112_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "supr_dept_nm", rec.supr_dept_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_nm", rec.emp_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "lv_cmpy_dt", rec.lv_cmpy_dt);
			rx.add(record, "sply_basi_cd", rec.sply_basi_cd);
			rx.add(record, "duty_dds", rec.duty_dds);
			rx.add(record, "sply_basi_amt", rec.sply_basi_amt);
			rx.add(record, "sply_amt", rec.sply_amt);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST1 END */

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
	<CURLIST1>
		<record>
			<occr_amt/>
			<actu_adpay_bal/>
			<rest_amt/>
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
			<chk/>
			<slip_no/>
			<rmks1/>
			<fisc_dt/>
			<occr_amt/>
			<actu_adpay_bal/>
			<rest_amt/>
			<evnt_cd/>
			<dept_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 04 17:28:13 KST 2009 */ %>