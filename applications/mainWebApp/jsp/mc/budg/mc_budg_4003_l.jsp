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
	MC_BUDG_4003_LDataSet ds = (MC_BUDG_4003_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4003_LCURLISTRecord rec = (MC_BUDG_4003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "work_no", rec.work_no);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "fix_asin_amt", rec.fix_asin_amt);
			rx.add(record, "fix_asin_uprc", rec.fix_asin_uprc);
			rx.add(record, "fix_asin_qunt", rec.fix_asin_qunt);
			//rx.add(record, "work_no", StringUtil.replaceToXml(rec.work_no));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
			//rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "fix_asin_amt", StringUtil.replaceToXml(rec.fix_asin_amt));
			//rx.add(record, "fix_asin_uprc", StringUtil.replaceToXml(rec.fix_asin_uprc));
			//rx.add(record, "fix_asin_qunt", StringUtil.replaceToXml(rec.fix_asin_qunt));
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
<mc_budg_4003_l>
	<dataSet>
		<CURLIST>
			<record>
				<work_no/>
				<seq/>
				<sub_seq/>
				<use_dept_cd/>
				<medi_cd/>
				<rmks/>
				<fix_asin_amt/>
				<fix_asin_uprc/>
				<fix_asin_qunt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4003_l>
*/
%>

<% /* 작성시간 : Tue May 19 22:04:01 KST 2009 */ %>