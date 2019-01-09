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
	MC_BUDG_2281_LDataSet ds = (MC_BUDG_2281_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_2281_LCURLISTRecord rec = (MC_BUDG_2281_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "reg_no", rec.reg_no);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "req_qunt", rec.req_qunt);
			rx.add(record, "req_uprc", rec.req_uprc);
			rx.add(record, "req_amt", rec.req_amt);
			rx.add(record, "rmks", rec.rmks);
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "reg_no", StringUtil.replaceToXml(rec.reg_no));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			//rx.add(record, "use_dept_nm", StringUtil.replaceToXml(rec.use_dept_nm));
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
<mc_budg_2281_l>
	<dataSet>
		<CURLIST>
			<record>
				<evnt_cd/>
				<evnt_nm/>
				<budg_cd/>
				<budg_nm/>
				<reg_no/>
				<medi_cd/>
				<medi_nm/>
				<use_dept_nm/>
				<budg_yymm/>
				<req_qunt/>
				<req_uprc/>
				<req_amt/>
				<rmks/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_2281_l>
*/
%>

<% /* 작성시간 : Tue May 12 13:06:19 KST 2009 */ %>