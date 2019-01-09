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
	FC_ACCT_2901_LDataSet ds = (FC_ACCT_2901_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** SRC_TAX_LIST BEGIN */
		recordSet = rx.add(dataSet, "SRC_TAX_LIST", "");

		for(int i = 0; i < ds.src_tax_list.size(); i++) {
			FC_ACCT_2901_LSRC_TAX_LISTRecord rec = (FC_ACCT_2901_LSRC_TAX_LISTRecord)ds.src_tax_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "check1", rec.check1);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "atic_fee", rec.atic_fee);
			//rx.add(record, "incm_clsf_nm", rec.incm_clsf_nm);
			//rx.add(record, "incm_tax", rec.incm_tax);
			//rx.add(record, "res_tax", rec.res_tax);
			//rx.add(record, "cal_pay_amt", rec.cal_pay_amt);
			rx.add(record, "check1", StringUtil.replaceToXml(rec.check1));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "atic_fee", StringUtil.replaceToXml(rec.atic_fee));
			rx.add(record, "incm_clsf_nm", StringUtil.replaceToXml(rec.incm_clsf_nm));
			rx.add(record, "incm_tax", StringUtil.replaceToXml(rec.incm_tax));
			rx.add(record, "res_tax", StringUtil.replaceToXml(rec.res_tax));
			rx.add(record, "cal_pay_amt", StringUtil.replaceToXml(rec.cal_pay_amt));
		}
		rx.add(recordSet, "totalcnt", ds.src_tax_list.size());
		/****** SRC_TAX_LIST END */

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
<fc_acct_2901_l>
	<dataSet>
		<SRC_TAX_LIST>
			<record>
				<check1/>
				<dlco_nm/>
				<dlco_cd/>
				<atic_fee/>
				<incm_clsf_nm/>
				<incm_tax/>
				<res_tax/>
				<cal_pay_amt/>
			</record>
		</SRC_TAX_LIST>
	</dataSet>
</fc_acct_2901_l>
*/
%>

<% /* 작성시간 : Thu Jun 18 10:18:59 KST 2009 */ %>