<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_7034_EDataSet ds = (FC_FUNC_7034_EDataSet)request.getAttribute("ds");
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
			FC_FUNC_7034_ECURLISTRecord rec = (FC_FUNC_7034_ECURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "prelae_pay_clsf_nm", rec.prelae_pay_clsf_nm);
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "janaeg", rec.janaeg);
			//rx.add(record, "prelae_pay_clsf_cd", StringUtil.replaceToXml(rec.prelae_pay_clsf_cd));
			//rx.add(record, "prelae_pay_clsf_nm", StringUtil.replaceToXml(rec.prelae_pay_clsf_nm));
			//rx.add(record, "cost_gain_stot", StringUtil.replaceToXml(rec.cost_gain_stot));
			//rx.add(record, "rcpay_amt_stot", StringUtil.replaceToXml(rec.rcpay_amt_stot));
			//rx.add(record, "janaeg", StringUtil.replaceToXml(rec.janaeg));
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
<fc_func_7034_e>
	<dataSet>
		<CURLIST>
			<record>
				<prelae_pay_clsf_cd/>
				<prelae_pay_clsf_nm/>
				<cost_gain_stot/>
				<rcpay_amt_stot/>
				<janaeg/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_7034_e>
*/
%>

<% /* 작성시간 : Tue Apr 07 11:17:52 KST 2009 */ %>