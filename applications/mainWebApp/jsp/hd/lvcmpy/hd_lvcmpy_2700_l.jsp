<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_2700_LDataSet ds = (HD_LVCMPY_2700_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_LVCMPY_2700_LCURLIST1Record rec = (HD_LVCMPY_2700_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "in_slip_occr_dt", rec.in_slip_occr_dt);
			rx.add(record, "in_slip_seq", rec.in_slip_seq);
			//rx.add(record, "in_slip_occr_dt", StringUtil.replaceToXml(rec.in_slip_occr_dt));
			//rx.add(record, "in_slip_seq", StringUtil.replaceToXml(rec.in_slip_seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_2700_LCURLISTRecord rec = (HD_LVCMPY_2700_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "check", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "real_pay_saly", rec.real_pay_saly);
			rx.add(record, "no01", rec.no01);
			rx.add(record, "no02", rec.no02);
			rx.add(record, "no03", rec.no03);
			rx.add(record, "no04", rec.no04);
			rx.add(record, "no05", rec.no05);
			rx.add(record, "no06", rec.no06);
			rx.add(record, "no1", rec.no1);
			rx.add(record, "no2", rec.no2);
			rx.add(record, "no3", rec.no3);
			rx.add(record, "no5", rec.no5);
			rx.add(record, "no7", rec.no7);
			rx.add(record, "no8", rec.no8);
			rx.add(record, "no9", rec.no9);
			rx.add(record, "no10", rec.no10);
			rx.add(record, "no11", rec.no11);
			rx.add(record, "real_pay_lvcmpy_saly", rec.real_pay_lvcmpy_saly);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "real_pay_saly", StringUtil.replaceToXml(rec.real_pay_saly));
			//rx.add(record, "no1", StringUtil.replaceToXml(rec.no1));
			//rx.add(record, "no2", StringUtil.replaceToXml(rec.no2));
			//rx.add(record, "no3", StringUtil.replaceToXml(rec.no3));
			//rx.add(record, "no4", StringUtil.replaceToXml(rec.no4));
			//rx.add(record, "no5", StringUtil.replaceToXml(rec.no5));
			//rx.add(record, "no6", StringUtil.replaceToXml(rec.no6));
			//rx.add(record, "no7", StringUtil.replaceToXml(rec.no7));
			//rx.add(record, "no8", StringUtil.replaceToXml(rec.no8));
			//rx.add(record, "no9", StringUtil.replaceToXml(rec.no9));
			//rx.add(record, "no10", StringUtil.replaceToXml(rec.no10));
			//rx.add(record, "real_pay_lvcmpy_saly", StringUtil.replaceToXml(rec.real_pay_lvcmpy_saly));
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
<hd_lvcmpy_2700_l>
	<dataSet>
		<CURLIST1>
			<record>
				<in_slip_occr_dt/>
				<in_slip_seq/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_lvcmpy_2700_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_lvcmpy_2700_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<flnm/>
				<lvcmpy_dt/>
				<dept_nm/>
				<real_pay_saly/>
				<no1/>
				<no2/>
				<no3/>
				<no4/>
				<no5/>
				<no6/>
				<no7/>
				<no8/>
				<no9/>
				<no10/>
				<no11/>
				<real_pay_lvcmpy_saly/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_2700_l>
*/
%>

<% /* 작성시간 : Thu Sep 09 11:47:28 KST 2010 */ %>