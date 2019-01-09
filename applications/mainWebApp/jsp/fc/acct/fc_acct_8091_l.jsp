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
	FC_ACCT_8091_LDataSet ds = (FC_ACCT_8091_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_8091_LCURLISTRecord rec = (FC_ACCT_8091_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "chk", rec.chk);
			//rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			//rx.add(record, "yscd", rec.yscd);
			//rx.add(record, "acntcymd", rec.acntcymd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "jgamt", rec.jgamt);
			//rx.add(record, "sdsamt", rec.sdsamt);
			//rx.add(record, "jmsamt", rec.jmsamt);
			//rx.add(record, "jeog", rec.jeog);
			rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
			rx.add(record, "incm_clsf_cd", StringUtil.replaceToXml(rec.incm_clsf_cd));
			rx.add(record, "yscd", StringUtil.replaceToXml(rec.yscd));
			rx.add(record, "acntcymd", StringUtil.replaceToXml(rec.acntcymd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "jgamt", StringUtil.replaceToXml(rec.jgamt));
			rx.add(record, "sdsamt", StringUtil.replaceToXml(rec.sdsamt));
			rx.add(record, "jmsamt", StringUtil.replaceToXml(rec.jmsamt));
			rx.add(record, "jeog", StringUtil.replaceToXml(rec.jeog));
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
<fc_acct_8091_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk/>
				<incm_clsf_cd/>
				<yscd/>
				<acntcymd/>
				<dlco_cd/>
				<dlco_nm/>
				<jgamt/>
				<sdsamt/>
				<jmsamt/>
				<jeog/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_8091_l>
*/
%>

<% /* �ۼ��ð� : Fri Apr 17 13:21:36 KST 2009 */ %>