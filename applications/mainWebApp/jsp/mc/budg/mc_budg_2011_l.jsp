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
	MC_BUDG_2011_LDataSet ds = (MC_BUDG_2011_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_2011_LCURLISTRecord rec = (MC_BUDG_2011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "month", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "sum_ini_plan_qunt_01", rec.sum_ini_plan_qunt_01);
			rx.add(record, "sum_ini_plan_qunt_02", rec.sum_ini_plan_qunt_02);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "form_dept_cd", rec.form_dept_cd);
			rx.add(record, "ini_plan_qunt", "");
			rx.add(record, "dtls_clsf_cd", "");
			rx.add(record, "dept_cd", "");
			//rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			//rx.add(record, "sum_ini_plan_qunt_01", StringUtil.replaceToXml(rec.sum_ini_plan_qunt_01));
			//rx.add(record, "sum_ini_plan_qunt_02", StringUtil.replaceToXml(rec.sum_ini_plan_qunt_02));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "form_dept_cd", StringUtil.replaceToXml(rec.form_dept_cd));
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
<mc_budg_2011_l>
	<dataSet>
		<CURLIST>
			<record>
				<yymm/>
				<sum_ini_plan_qunt_01/>
				<sum_ini_plan_qunt_02/>
				<rmks/>
				<form_dept_cd/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_2011_l>
*/
%>

<% /* 작성시간 : Fri May 15 17:46:46 KST 2009 */ %>