<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2431_LDataSet ds = (FC_ACCT_2431_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int gridData = 0;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

    int adpay_amt_sum = 0;

	resData = rx.add(root, "resData", "");
    gridData = rx.add(resData,"gridData","");
    dataSet = rx.add(gridData,"dataSet","");

	try {
		/****** IMPT_EXPNLIST BEGIN */
		recordSet = rx.add(dataSet, "IMPT_EXPNLIST", "");

		for(int i = 0; i < ds.impt_expnlist.size(); i++) {
			FC_ACCT_2431_LIMPT_EXPNLISTRecord rec = (FC_ACCT_2431_LIMPT_EXPNLISTRecord)ds.impt_expnlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			//rx.addCData(record, "titl", StringUtil.replaceToXml(rec.titl));
			rx.addCData(record, "titl", rec.titl);
			rx.add(record, "reso_amt", StringUtil.replaceToXml(rec.reso_amt));
			rx.add(record, "adpay_amt", StringUtil.replaceToXml(rec.adpay_amt));
			rx.add(record, "incmg_emp_no", StringUtil.replaceToXml(rec.incmg_emp_no));
			rx.add(record, "incmg_emp_nm", StringUtil.replaceToXml(rec.incmg_emp_nm));
			rx.add(record, "chrg_emp_no", StringUtil.replaceToXml(rec.chrg_emp_no));
			rx.add(record, "chrg_emp_nm", StringUtil.replaceToXml(rec.chrg_emp_nm));
			rx.add(record, "expn_clsf", StringUtil.replaceToXml(rec.expn_clsf));
			rx.add(record, "impt_expn_clsf", StringUtil.replaceToXml(rec.impt_expn_clsf));
			rx.add(record, "slip_aprv_yn", StringUtil.replaceToXml(rec.slip_aprv_yn));
			rx.add(record, "pg_mid", StringUtil.replaceToXml(rec.pg_mid));
			rx.add(record, "slipprocstat", StringUtil.replaceToXml(rec.slipprocstat));

            adpay_amt_sum = adpay_amt_sum + Integer.parseInt(rec.adpay_amt);
		}
		rx.add(recordSet, "totalcnt", ds.impt_expnlist.size());
		rx.add(recordSet, "adpay_amt_sum", adpay_amt_sum);
		/****** IMPT_EXPNLIST END */

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
<dataSet>
	<IMPT_EXPNLIST>
		<record>
			<slip_no/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_sub_seq/>
			<titl/>
			<reso_amt/>
			<adpay_amt/>
			<incmg_emp_no/>
			<incmg_emp_nm/>
			<chrg_emp_no/>
			<chrg_emp_nm/>
			<expn_clsf/>
			<impt_expn_clsf/>
			<slip_aprv_yn/>
			<pg_mid/>
			<slipprocstat/>
		</record>
	</IMPT_EXPNLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 18 13:48:53 KST 2009 */ %>
