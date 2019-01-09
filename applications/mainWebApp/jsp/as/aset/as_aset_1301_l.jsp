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
	AS_ASET_1301_LDataSet ds = (AS_ASET_1301_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AS_ASET_1301_LCURLIST2Record rec = (AS_ASET_1301_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.add(record, "befo_dept_cd", rec.befo_dept_cd);
			rx.add(record, "befo_loca", rec.befo_loca);
			rx.add(record, "now_dept_cd", rec.now_dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "now_loca", rec.now_loca);
			rx.add(record, "dtls_remk", rec.dtls_remk);
			rx.add(record, "hsty_cnt", rec.hsty_cnt);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "chg_clsf", rec.chg_clsf);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "dept_cd", rec.dept_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AS_ASET_1301_LCURLIST1Record rec = (AS_ASET_1301_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "remk", rec.remk);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
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
	<CURLIST2>
		<record>
			<aset_no/>
			<aset_nm/>
			<befo_dept_cd/>
			<befo_loca/>
			<now_dept_cd/>
			<dept_nm/>
			<now_loca/>
			<dtls_remk/>
			<hsty_cnt/>
			<dlco_nm/>
			<cmpy_cd/>
			<chg_clsf/>
			<occr_dt/>
			<occr_seq/>
			<sub_seq/>
			<dept_cd/>
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
			<chg_dt/>
			<remk/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 17 14:51:07 KST 2009 */ %>