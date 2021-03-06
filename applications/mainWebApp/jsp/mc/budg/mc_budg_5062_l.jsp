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
	MC_BUDG_5062_LDataSet ds = (MC_BUDG_5062_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_5062_LCURLISTRecord rec = (MC_BUDG_5062_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "t1_sjamt", rec.t1_sjamt);
			rx.add(record, "jpamt", rec.jpamt);
			rx.add(record, "budg_cndt_amt", rec.budg_cndt_amt);
			rx.add(record, "cha2", rec.cha2);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "t1_sjamt", StringUtil.replaceToXml(rec.t1_sjamt));
			//rx.add(record, "jpamt", StringUtil.replaceToXml(rec.jpamt));
			//rx.add(record, "budg_cndt_amt", StringUtil.replaceToXml(rec.budg_cndt_amt));
			//rx.add(record, "cha2", StringUtil.replaceToXml(rec.cha2));
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
<mc_budg_5062_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<budg_cd/>
				<t1_sjamt/>
				<jpamt/>
				<budg_cndt_amt/>
				<cha2/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_5062_l>
*/
%>

<% /* 작성시간 : Mon Apr 20 10:17:51 KST 2009 */ %>