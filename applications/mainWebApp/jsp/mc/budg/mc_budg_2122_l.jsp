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
	MC_BUDG_2122_LDataSet ds = (MC_BUDG_2122_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_2122_LCURLIST1Record rec = (MC_BUDG_2122_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_nm", rec.budg_nm);
			//rx.add(record, "rmks", rec.rmks);
			//rx.add(record, "budg_yyyy", rec.budg_yyyy);
			//rx.add(record, "req_amt_01", rec.req_amt_01);
			//rx.add(record, "req_amt_02", rec.req_amt_02);
			//rx.add(record, "req_amt_03", rec.req_amt_03);
			//rx.add(record, "req_amt_04", rec.req_amt_04);
			//rx.add(record, "req_amt_05", rec.req_amt_05);
			//rx.add(record, "req_amt_06", rec.req_amt_06);
			//rx.add(record, "req_amt_07", rec.req_amt_07);
			//rx.add(record, "req_amt_08", rec.req_amt_08);
			//rx.add(record, "req_amt_09", rec.req_amt_09);
			//rx.add(record, "req_amt_10", rec.req_amt_10);
			//rx.add(record, "req_amt_11", rec.req_amt_11);
			//rx.add(record, "req_amt_12", rec.req_amt_12);
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			rx.add(record, "budg_yyyy", StringUtil.replaceToXml(rec.budg_yyyy));
			rx.add(record, "req_amt_01", StringUtil.replaceToXml(rec.req_amt_01));
			rx.add(record, "req_amt_02", StringUtil.replaceToXml(rec.req_amt_02));
			rx.add(record, "req_amt_03", StringUtil.replaceToXml(rec.req_amt_03));
			rx.add(record, "req_amt_04", StringUtil.replaceToXml(rec.req_amt_04));
			rx.add(record, "req_amt_05", StringUtil.replaceToXml(rec.req_amt_05));
			rx.add(record, "req_amt_06", StringUtil.replaceToXml(rec.req_amt_06));
			rx.add(record, "req_amt_07", StringUtil.replaceToXml(rec.req_amt_07));
			rx.add(record, "req_amt_08", StringUtil.replaceToXml(rec.req_amt_08));
			rx.add(record, "req_amt_09", StringUtil.replaceToXml(rec.req_amt_09));
			rx.add(record, "req_amt_10", StringUtil.replaceToXml(rec.req_amt_10));
			rx.add(record, "req_amt_11", StringUtil.replaceToXml(rec.req_amt_11));
			rx.add(record, "req_amt_12", StringUtil.replaceToXml(rec.req_amt_12));
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
<mc_budg_2122_l>
	<dataSet>
		<CURLIST1>
			<record>
				<seq/>
				<budg_cd/>
				<budg_nm/>
				<rmks/>
				<budg_yyyy/>
				<req_amt_01/>
				<req_amt_02/>
				<req_amt_03/>
				<req_amt_04/>
				<req_amt_05/>
				<req_amt_06/>
				<req_amt_07/>
				<req_amt_08/>
				<req_amt_09/>
				<req_amt_10/>
				<req_amt_11/>
				<req_amt_12/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_2122_l>
*/
%>

<% /* 작성시간 : Tue May 26 15:37:18 KST 2009 */ %>