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
	FC_FUNC_8072_LDataSet ds = (FC_FUNC_8072_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_8072_LCURLISTRecord rec = (FC_FUNC_8072_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pymt_plan_dt", rec.pymt_plan_dt);
			rx.add(record, "pay_cost_clsfnm", rec.pay_cost_clsfnm);
			rx.add(record, "frex_cdnm", rec.frex_cdnm);
			rx.add(record, "libiwgamtint", rec.libiwgamtint);
			rx.add(record, "exrate", rec.exrate);
			rx.add(record, "won_amt", rec.won_amt);
			rx.add(record, "fst_leas_no", rec.fst_leas_no);
			//rx.add(record, "pymt_plan_dt", StringUtil.replaceToXml(rec.pymt_plan_dt));
			//rx.add(record, "pay_cost_clsfnm", StringUtil.replaceToXml(rec.pay_cost_clsfnm));
			//rx.add(record, "frex_cdnm", StringUtil.replaceToXml(rec.frex_cdnm));
			//rx.add(record, "libiwgamtint", StringUtil.replaceToXml(rec.libiwgamtint));
			//rx.add(record, "exrate", StringUtil.replaceToXml(rec.exrate));
			//rx.add(record, "won_amt", StringUtil.replaceToXml(rec.won_amt));
			//rx.add(record, "fst_leas_no", StringUtil.replaceToXml(rec.fst_leas_no));
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
<fc_func_8072_l>
	<dataSet>
		<CURLIST>
			<record>
				<pymt_plan_dt/>
				<pay_cost_clsfnm/>
				<frex_cdnm/>
				<libiwgamtint/>
				<exrate/>
				<won_amt/>
				<fst_leas_no/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_8072_l>
*/
%>

<% /* 작성시간 : Wed Apr 08 13:50:32 KST 2009 */ %>