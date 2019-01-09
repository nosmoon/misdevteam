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
	MC_BUDG_2118_LDataSet ds = (MC_BUDG_2118_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_2118_LCURLISTRecord rec = (MC_BUDG_2118_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "yymm", rec.yymm);
			//rx.add(record, "ini_plan_qunt", rec.ini_plan_qunt);
			//rx.add(record, "budg_yymm", rec.budg_yymm);
			//rx.add(record, "req_qunt", rec.req_qunt);
			//rx.add(record, "req_uprc", rec.req_uprc);
			//rx.add(record, "req_amt", rec.req_amt);
			//rx.add(record, "rmks", rec.rmks);
			//rx.add(record, "jobtag", rec.jobtag);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			rx.add(record, "ini_plan_qunt", StringUtil.replaceToXml(rec.ini_plan_qunt));
			rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			rx.add(record, "req_qunt", StringUtil.replaceToXml(rec.req_qunt));
			rx.add(record, "req_uprc", StringUtil.replaceToXml(rec.req_uprc));
			rx.add(record, "req_amt", StringUtil.replaceToXml(rec.req_amt));
			rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			rx.add(record, "jobtag", StringUtil.replaceToXml(rec.jobtag));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
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
<mc_budg_2118_l>
	<dataSet>
		<CURLIST>
			<record>
				<yymm/>
				<ini_plan_qunt/>
				<budg_yymm/>
				<req_qunt/>
				<req_uprc/>
				<req_amt/>
				<rmks/>
				<jobtag/>
				<seq/>
				<use_dept_cd/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_2118_l>
*/
%>

<% /* 작성시간 : Wed May 27 20:17:27 KST 2009 */ %>