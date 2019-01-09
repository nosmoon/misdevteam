<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_2004_LDataSet ds = (HD_DALON_2004_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_DALON_2004_LCURLIST1Record rec = (HD_DALON_2004_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(dataSet, "record1", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "cnt", rec.cnt);
		}
		rx.add(dataSet, "totalcnt1", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DALON_2004_LCURLISTRecord rec = (HD_DALON_2004_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "tmp_dr_amt", rec.tmp_dr_amt);
			rx.add(record, "tmp_crdt_amt", rec.tmp_crdt_amt);
			rx.add(record, "titl", rec.titl);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "proc_stat", rec.proc_stat);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
<tempData>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<flnm/>
			<cnt/>
		</record>
	</CURLIST1>
</tempData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<tempData>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<dept_cd/>
			<dept_nm/>
			<flnm/>
			<tmp_dr_amt/>
			<tmp_crdt_amt/>
			<titl/>
			<actu_slip_no/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<incmg_pers/>
			<incmg_pers_ipadd/>
			<proc_stat/>
		</record>
	</CURLIST>
</tempData>
*/
%>

<% /* �ۼ��ð� : Mon May 11 14:31:34 KST 2009 */ %>