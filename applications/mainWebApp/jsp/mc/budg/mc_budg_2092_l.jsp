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
	MC_BUDG_2092_LDataSet ds = (MC_BUDG_2092_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_2092_LCURLISTRecord rec = (MC_BUDG_2092_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "month", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "ghsqty", rec.ghsqty);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "req_qunt", rec.req_qunt);
			rx.add(record, "req_uprc", rec.req_uprc);
			rx.add(record, "req_amt", rec.req_amt);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "seq", "");
			rx.add(record, "use_dept_cd", "");
			rx.add(record, "ini_plan_qunt", "");
			//rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			//rx.add(record, "ghsqty", StringUtil.replaceToXml(rec.ghsqty));
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "req_qunt", StringUtil.replaceToXml(rec.req_qunt));
			//rx.add(record, "req_uprc", StringUtil.replaceToXml(rec.req_uprc));
			//rx.add(record, "req_amt", StringUtil.replaceToXml(rec.req_amt));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
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
<mc_budg_2092_l>
	<dataSet>
		<CURLIST>
			<record>
				<yymm/>
				<ghsqty/>
				<budg_yymm/>
				<req_qunt/>
				<req_uprc/>
				<req_amt/>
				<rmks/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_2092_l>
*/
%>

<% /* 작성시간 : Sat Jul 11 10:54:09 KST 2009 */ %>