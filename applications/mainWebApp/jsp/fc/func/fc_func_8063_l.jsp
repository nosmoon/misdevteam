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
	FC_FUNC_8063_LDataSet ds = (FC_FUNC_8063_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_8063_LCURLISTRecord rec = (FC_FUNC_8063_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "pay_plan_dt", rec.pay_plan_dt);
			rx.add(record, "lciyul", rec.lciyul);
			rx.add(record, "frex_cd_nm", rec.frex_cd_nm);
			rx.add(record, "repay_prcp", rec.repay_prcp);
			rx.add(record, "repay_int", rec.repay_int);
			rx.add(record, "sum_repay_prcp", rec.sum_repay_prcp);
			rx.add(record, "exrate", rec.exrate);
			rx.add(record, "won_amt", rec.won_amt);
			rx.add(record, "libo_int_rate", rec.libo_int_rate);
			rx.add(record, "dedu_int_rate", rec.dedu_int_rate);
			rx.add(record, "frex_cd", rec.frex_cd);
			rx.add(record, "frex_nm", rec.frex_nm);
			//rx.add(record, "leas_no", StringUtil.replaceToXml(rec.leas_no));
			//rx.add(record, "pay_plan_dt", StringUtil.replaceToXml(rec.pay_plan_dt));
			//rx.add(record, "lciyul", StringUtil.replaceToXml(rec.lciyul));
			//rx.add(record, "frex_cd_nm", StringUtil.replaceToXml(rec.frex_cd_nm));
			//rx.add(record, "repay_prcp", StringUtil.replaceToXml(rec.repay_prcp));
			//rx.add(record, "repay_int", StringUtil.replaceToXml(rec.repay_int));
			//rx.add(record, "sum_repay_prcp", StringUtil.replaceToXml(rec.sum_repay_prcp));
			//rx.add(record, "exrate", StringUtil.replaceToXml(rec.exrate));
			//rx.add(record, "won_amt", StringUtil.replaceToXml(rec.won_amt));
			//rx.add(record, "libo_int_rate", StringUtil.replaceToXml(rec.libo_int_rate));
			//rx.add(record, "dedu_int_rate", StringUtil.replaceToXml(rec.dedu_int_rate));
			//rx.add(record, "frex_cd", StringUtil.replaceToXml(rec.frex_cd));
			//rx.add(record, "frex_nm", StringUtil.replaceToXml(rec.frex_nm));
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
<fc_func_8063_l>
	<dataSet>
		<CURLIST>
			<record>
				<leas_no/>
				<pay_plan_dt/>
				<lciyul/>
				<frex_cd_nm/>
				<repay_prcp/>
				<repay_int/>
				<sum_repay_prcp/>
				<exrate/>
				<won_amt/>
				<libo_int_rate/>
				<dedu_int_rate/>
				<frex_cd/>
				<frex_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_8063_l>
*/
%>

<% /* 작성시간 : Sat Apr 11 13:18:30 KST 2009 */ %>