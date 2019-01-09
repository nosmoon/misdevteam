<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.en.innexp.rec.*
	,	chosun.ciis.en.innexp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_INNEXP_1502_LDataSet ds = (EN_INNEXP_1502_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_1502_LCURLISTRecord rec = (EN_INNEXP_1502_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_no", rec.occr_no);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "titl", rec.titl);
			rx.add(record, "dr_budg_cd", rec.dr_budg_cd);
			rx.add(record, "dr_budg_nm", rec.dr_budg_nm);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "cr_budg_cd", rec.cr_budg_cd);
			rx.add(record, "cr_budg_nm", rec.cr_budg_nm);
			rx.add(record, "cr_amt", rec.cr_amt);
			//rx.add(record, "occr_no", StringUtil.replaceToXml(rec.occr_no));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			//rx.add(record, "dr_budg_cd", StringUtil.replaceToXml(rec.dr_budg_cd));
			//rx.add(record, "dr_budg_nm", StringUtil.replaceToXml(rec.dr_budg_nm));
			//rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			//rx.add(record, "cr_budg_cd", StringUtil.replaceToXml(rec.cr_budg_cd));
			//rx.add(record, "cr_budg_nm", StringUtil.replaceToXml(rec.cr_budg_nm));
			//rx.add(record, "cr_amt", StringUtil.replaceToXml(rec.cr_amt));
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
<en_innexp_1502_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_no/>
				<evnt_nm/>
				<dlco_nm/>
				<titl/>
				<dr_budg_cd/>
				<dr_budg_nm/>
				<dr_amt/>
				<cr_budg_cd/>
				<cr_budg_nm/>
				<cr_amt/>
			</record>
		</CURLIST>
	</dataSet>
</en_innexp_1502_l>
*/
%>

<% /* 작성시간 : Fri Apr 24 09:48:07 KST 2009 */ %>