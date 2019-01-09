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
	FC_ACCT_2906_LDataSet ds = (FC_ACCT_2906_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2906_LCURLISTRecord rec = (FC_ACCT_2906_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "chk", rec.chk);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_nm", rec.budg_nm);
			//rx.add(record, "rmks2", rec.rmks2);
			//rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			//rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			//rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "clam_dept_cd", StringUtil.replaceToXml(rec.clam_dept_cd));
			rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			rx.add(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
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
<fc_acct_2906_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk/>
				<budg_cd/>
				<budg_nm/>
				<rmks2/>
				<cnt/>
				<dr_amt/>
				<clam_dept_cd/>
				<mang_clsf_cd/>
				<boks_dlco_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2906_l>
*/
%>

<% /* 작성시간 : Thu Aug 06 17:15:41 KST 2009 */ %>