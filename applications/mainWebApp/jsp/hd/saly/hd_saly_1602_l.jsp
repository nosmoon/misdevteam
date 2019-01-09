<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_1602_LDataSet ds = (HD_SALY_1602_LDataSet)request.getAttribute("ds");
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
			HD_SALY_1602_LCURLISTRecord rec = (HD_SALY_1602_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "now_impt_stot", rec.now_impt_stot);
			rx.add(record, "prv_impt_stot", rec.prv_impt_stot);
			rx.add(record, "impt_stot", rec.impt_stot);
			rx.add(record, "non_tax_jrnst", rec.non_tax_jrnst);
			rx.add(record, "prv_non_tax_prod", rec.prv_non_tax_prod);
			rx.add(record, "non_tax_jrnst_stot", rec.non_tax_jrnst_stot);
			rx.add(record, "non_tax_frnc", rec.non_tax_frnc);
			rx.add(record, "prv_non_tax_frnc", rec.prv_non_tax_frnc);
			rx.add(record, "non_tax_frnc_stot", rec.non_tax_frnc_stot);
			rx.add(record, "now_stot", rec.now_stot);
			rx.add(record, "prv_stot", rec.prv_stot);
			rx.add(record, "stot", rec.stot);
			//rx.add(record, "now_impt_stot", StringUtil.replaceToXml(rec.now_impt_stot));
			//rx.add(record, "prv_impt_stot", StringUtil.replaceToXml(rec.prv_impt_stot));
			//rx.add(record, "impt_stot", StringUtil.replaceToXml(rec.impt_stot));
			//rx.add(record, "non_tax_jrnst", StringUtil.replaceToXml(rec.non_tax_jrnst));
			//rx.add(record, "prv_non_tax_prod", StringUtil.replaceToXml(rec.prv_non_tax_prod));
			//rx.add(record, "non_tax_jrnst_stot", StringUtil.replaceToXml(rec.non_tax_jrnst_stot));
			//rx.add(record, "non_tax_frnc", StringUtil.replaceToXml(rec.non_tax_frnc));
			//rx.add(record, "prv_non_tax_frnc", StringUtil.replaceToXml(rec.prv_non_tax_frnc));
			//rx.add(record, "non_tax_frnc_stot", StringUtil.replaceToXml(rec.non_tax_frnc_stot));
			//rx.add(record, "now_stot", StringUtil.replaceToXml(rec.now_stot));
			//rx.add(record, "prv_stot", StringUtil.replaceToXml(rec.prv_stot));
			//rx.add(record, "stot", StringUtil.replaceToXml(rec.stot));
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
<hd_saly_1602_l>
	<dataSet>
		<CURLIST>
			<record>
				<now_impt_stot/>
				<prv_impt_stot/>
				<impt_stot/>
				<non_tax_jrnst/>
				<prv_non_tax_prod/>
				<non_tax_jrnst_stot/>
				<non_tax_frnc/>
				<prv_non_tax_frnc/>
				<non_tax_frnc_stot/>
				<now_stot/>
				<prv_stot/>
				<stot/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_1602_l>
*/
%>

<% /* 작성시간 : Thu May 21 15:52:47 KST 2009 */ %>