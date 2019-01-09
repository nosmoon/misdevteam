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
	EN_INNEXP_1505_LDataSet ds = (EN_INNEXP_1505_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_1505_LCURLISTRecord rec = (EN_INNEXP_1505_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "tax_stmt_no", rec.tax_stmt_no);
			rx.add(record, "occr_no", rec.occr_no);
			rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "chrg_pers_nm", StringUtil.replaceToXml(rec.chrg_pers_nm));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "tax_stmt_no", StringUtil.replaceToXml(rec.tax_stmt_no));
			//rx.add(record, "occr_no", StringUtil.replaceToXml(rec.occr_no));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
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
<en_innexp_1505_l>
	<dataSet>
		<CURLIST>
			<record>
				<evnt_cd/>
				<evnt_nm/>
				<dlco_nm/>
				<chrg_pers_nm/>
				<budg_nm/>
				<amt/>
				<tax_stmt_no/>
				<occr_no/>
				<budg_cd/>
			</record>
		</CURLIST>
	</dataSet>
</en_innexp_1505_l>
*/
%>

<% /* 작성시간 : Fri Apr 24 14:49:00 KST 2009 */ %>