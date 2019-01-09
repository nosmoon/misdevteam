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
	MC_BUDG_6001_LDataSet ds = (MC_BUDG_6001_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6001_LCURLISTRecord rec = (MC_BUDG_6001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "checked", rec.checked);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "req_amt", rec.req_amt);
			rx.add(record, "temp1", rec.temp1);
			rx.add(record, "asin_amt", rec.asin_amt);
			rx.add(record, "asin_amt2", rec.asin_amt2);
			rx.add(record, "req_qunt", rec.req_qunt);
			rx.add(record, "temp2", rec.temp2);
			rx.add(record, "asin_qunt", rec.asin_qunt);
			rx.add(record, "asin_qunt2", rec.asin_qunt2);
			rx.add(record, "req_uprc", rec.req_uprc);
			rx.add(record, "temp3", rec.temp3);
			rx.add(record, "asin_uprc", rec.asin_uprc);
			rx.add(record, "asin_uprc2", rec.asin_uprc2);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "work_no", rec.work_no);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			//rx.add(record, "checked", StringUtil.replaceToXml(rec.checked));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "req_amt", StringUtil.replaceToXml(rec.req_amt));
			//rx.add(record, "temp1", StringUtil.replaceToXml(rec.temp1));
			//rx.add(record, "asin_amt", StringUtil.replaceToXml(rec.asin_amt));
			//rx.add(record, "asin_amt2", StringUtil.replaceToXml(rec.asin_amt2));
			//rx.add(record, "req_qunt", StringUtil.replaceToXml(rec.req_qunt));
			//rx.add(record, "temp2", StringUtil.replaceToXml(rec.temp2));
			//rx.add(record, "asin_qunt", StringUtil.replaceToXml(rec.asin_qunt));
			//rx.add(record, "asin_qunt2", StringUtil.replaceToXml(rec.asin_qunt2));
			//rx.add(record, "req_uprc", StringUtil.replaceToXml(rec.req_uprc));
			//rx.add(record, "temp3", StringUtil.replaceToXml(rec.temp3));
			//rx.add(record, "asin_uprc", StringUtil.replaceToXml(rec.asin_uprc));
			//rx.add(record, "asin_uprc2", StringUtil.replaceToXml(rec.asin_uprc2));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "work_no", StringUtil.replaceToXml(rec.work_no));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
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
<mc_budg_6001_l>
	<dataSet>
		<CURLIST>
			<record>
				<checked/>
				<budg_cd/>
				<budg_cdnm/>
				<dept_cd/>
				<dept_nm/>
				<medi_cd/>
				<use_dept_cd/>
				<budg_yymm/>
				<req_amt/>
				<temp1/>
				<asin_amt/>
				<asin_amt2/>
				<req_qunt/>
				<temp2/>
				<asin_qunt/>
				<asin_qunt2/>
				<req_uprc/>
				<temp3/>
				<asin_uprc/>
				<asin_uprc2/>
				<rmks/>
				<evnt_cd/>
				<work_no/>
				<seq/>
				<evnt_nm/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6001_l>
*/
%>

<% /* 작성시간 : Mon May 25 19:17:19 KST 2009 */ %>