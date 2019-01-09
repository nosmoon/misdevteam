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
	FC_FUNC_8042_LDataSet ds = (FC_FUNC_8042_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_8042_LCURLIST1Record rec = (FC_FUNC_8042_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pymt_plan_dt", rec.pymt_plan_dt);
			rx.add(record, "pymt_plan_prcp", rec.pymt_plan_prcp);
			rx.add(record, "pymt_plan_int", rec.pymt_plan_int);
			rx.add(record, "bal", rec.bal);
			rx.add(record, "pymt_yn", rec.pymt_yn);
			rx.add(record, "pymt_dt", rec.pymt_dt);
			rx.add(record, "pymt_prcp", rec.pymt_prcp);
			rx.add(record, "pymt_int", rec.pymt_int);
			rx.add(record, "pay_cost_clsf", rec.pay_cost_clsf);
			rx.add(record, "hsty_seq", rec.hsty_seq);
			//rx.add(record, "pymt_plan_dt", StringUtil.replaceToXml(rec.pymt_plan_dt));
			//rx.add(record, "pymt_plan_prcp", StringUtil.replaceToXml(rec.pymt_plan_prcp));
			//rx.add(record, "pymt_plan_int", StringUtil.replaceToXml(rec.pymt_plan_int));
			//rx.add(record, "bal", StringUtil.replaceToXml(rec.bal));
			//rx.add(record, "pymt_yn", StringUtil.replaceToXml(rec.pymt_yn));
			//rx.add(record, "pymt_dt", StringUtil.replaceToXml(rec.pymt_dt));
			//rx.add(record, "pymt_prcp", StringUtil.replaceToXml(rec.pymt_prcp));
			//rx.add(record, "pymt_int", StringUtil.replaceToXml(rec.pymt_int));
			//rx.add(record, "pay_cost_clsf", StringUtil.replaceToXml(rec.pay_cost_clsf));
			//rx.add(record, "hsty_seq", StringUtil.replaceToXml(rec.hsty_seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<fc_func_8042_l>
	<dataSet>
		<CURLIST1>
			<record>
				<pymt_plan_dt/>
				<pymt_plan_prcp/>
				<pymt_plan_int/>
				<bal/>
				<pymt_yn/>
				<pymt_dt/>
				<pymt_prcp/>
				<pymt_int/>
				<pay_cost_clsf/>
				<hsty_seq/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_8042_l>
*/
%>

<% /* 작성시간 : Thu Apr 09 16:58:52 KST 2009 */ %>