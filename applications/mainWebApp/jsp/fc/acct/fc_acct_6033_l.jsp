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
	FC_ACCT_6033_LDataSet ds = (FC_ACCT_6033_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_6033_LCURLISTRecord rec = (FC_ACCT_6033_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "erplace_cd", rec.erplace_cd);
			//rx.add(record, "ernm", rec.ernm);
			//rx.add(record, "ern", rec.ern);
			//rx.add(record, "presi_nm", rec.presi_nm);
			//rx.add(record, "erplace_addr", rec.erplace_addr);
			//rx.add(record, "erplace_bizcond", rec.erplace_bizcond);
			//rx.add(record, "erplace_item", rec.erplace_item);
			//rx.add(record, "taxoff", rec.taxoff);
			//rx.add(record, "corp_reg_no", rec.corp_reg_no);
			//rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd);
			rx.add(record, "erplace_cd", StringUtil.replaceToXml(rec.erplace_cd));
			rx.add(record, "ernm", StringUtil.replaceToXml(rec.ernm));
			rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			rx.add(record, "presi_nm", StringUtil.replaceToXml(rec.presi_nm));
			rx.add(record, "erplace_addr", StringUtil.replaceToXml(rec.erplace_addr));
			rx.add(record, "erplace_bizcond", StringUtil.replaceToXml(rec.erplace_bizcond));
			rx.add(record, "erplace_item", StringUtil.replaceToXml(rec.erplace_item));
			rx.add(record, "taxoff", StringUtil.replaceToXml(rec.taxoff));
			rx.add(record, "corp_reg_no", StringUtil.replaceToXml(rec.corp_reg_no));
			rx.add(record, "intg_dlco_cd", StringUtil.replaceToXml(rec.intg_dlco_cd));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<fc_acct_6033_l>
	<dataSet>
		<CURLIST>
			<record>
				<erplace_cd/>
				<ernm/>
				<ern/>
				<presi_nm/>
				<erplace_addr/>
				<erplace_bizcond/>
				<erplace_item/>
				<taxoff/>
				<corp_reg_no/>
				<intg_dlco_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_6033_l>
*/
%>

<% /* �ۼ��ð� : Mon Apr 27 10:39:44 KST 2009 */ %>