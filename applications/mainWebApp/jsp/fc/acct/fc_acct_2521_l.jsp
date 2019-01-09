<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2521_LDataSet ds = (FC_ACCT_2521_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2521_LCURLISTRecord rec = (FC_ACCT_2521_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "rmks1", rec.rmks1);
			//rx.add(record, "rmks2", rec.rmks2);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "vat_amt", rec.vat_amt);
			//rx.add(record, "crdt_amt", rec.crdt_amt);
			//rx.add(record, "unit", rec.unit);
			//rx.add(record, "qunt", rec.qunt);
			//rx.add(record, "use_dept_cd", rec.use_dept_cd);
			//rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			//rx.add(record, "mang_no", rec.mang_no);
			//rx.add(record, "insd_acct_cd", rec.insd_acct_cd);
			//rx.add(record, "insd_acct_cd1", rec.insd_acct_cd1);
			//rx.add(record, "obj_acct_cd", rec.obj_acct_cd);
			rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			rx.add(record, "insd_acct_cd", StringUtil.replaceToXml(rec.insd_acct_cd));
			rx.add(record, "insd_acct_cd1", StringUtil.replaceToXml(rec.insd_acct_cd1));
			rx.add(record, "obj_acct_cd", StringUtil.replaceToXml(rec.obj_acct_cd));
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
<fc_acct_2521_l>
	<dataSet>
		<CURLIST>
			<record>
				<fisc_dt/>
				<slip_no/>
				<rmks1/>
				<rmks2/>
				<dlco_cd/>
				<dlco_nm/>
				<dr_amt/>
				<vat_amt/>
				<crdt_amt/>
				<unit/>
				<qunt/>
				<use_dept_cd/>
				<mang_clsf_cd/>
				<mang_no/>
				<insd_acct_cd/>
				<insd_acct_cd1/>
				<obj_acct_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2521_l>
*/
%>

<% /* 작성시간 : Mon Apr 13 15:38:11 KST 2009 */ %>