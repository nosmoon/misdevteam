<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_1701_LDataSet ds = (HD_AFFR_1701_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet1 = 0;
	int recordSet2 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet1 = rx.add(dataSet, "CURLIST1", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_1701_LCURLIST1Record rec = (HD_AFFR_1701_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet1, "item", "");
			rx.add(record, "value", rec.faml_prn);
			rx.add(record, "label", rec.faml_flnm);
		}
		rx.add(recordSet1, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		recordSet2 = rx.add(dataSet, "CURLIST2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			
			HD_AFFR_1701_LCURLIST2Record rec = (HD_AFFR_1701_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet2, "record2", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "emp_clsf", rec.emp_clsf);
		}
		rx.add(recordSet2, "totalcnt", ds.curlist2.size());
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
			<cmpy_cd/>
			<emp_no/>
			<flnm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<dept_cd/>
			<dept_nm/>
			<emp_clsf_cd/>
			<emp_clsf_nm/>
			<emp_dtls_clsf/>
			<emp_dtls_clsf_nm/>
			<emp_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 18 16:39:55 KST 2009 */ %>