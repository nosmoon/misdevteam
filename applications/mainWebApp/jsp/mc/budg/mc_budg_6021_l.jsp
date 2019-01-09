<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_6021_LDataSet ds = (MC_BUDG_6021_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6021_LCURLISTRecord rec = (MC_BUDG_6021_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "chk", rec.chk);
			//rx.add(record, "yymm", rec.yymm);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "rmks", rec.rmks);
			//rx.add(record, "a_ini_plan_qunt", rec.a_ini_plan_qunt);
			//rx.add(record, "asin_qunt", rec.asin_qunt);
			//rx.add(record, "asin_qunt2", rec.asin_qunt2);
			//rx.add(record, "a_form_dept_cd", rec.a_form_dept_cd);
			//rx.add(record, "a_form_dept_nm", rec.a_form_dept_nm);
			rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
			rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			rx.add(record, "a_ini_plan_qunt", StringUtil.replaceToXml(rec.a_ini_plan_qunt));
			rx.add(record, "asin_qunt", StringUtil.replaceToXml(rec.asin_qunt));
			rx.add(record, "asin_qunt2", StringUtil.replaceToXml(rec.asin_qunt2));
			rx.add(record, "a_form_dept_cd", StringUtil.replaceToXml(rec.a_form_dept_cd));
			rx.add(record, "a_form_dept_nm", StringUtil.replaceToXml(rec.a_form_dept_nm));
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
<mc_budg_6021_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk/>
				<yymm/>
				<dept_cd/>
				<dept_nm/>
				<rmks/>
				<a_ini_plan_qunt/>
				<asin_qunt/>
				<asin_qunt2/>
				<a_form_dept_cd/>
				<a_form_dept_nm/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6021_l>
*/
%>

<% /* 작성시간 : Thu May 14 10:53:56 KST 2009 */ %>