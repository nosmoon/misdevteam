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
	FC_FUNC_8131_LDataSet ds = (FC_FUNC_8131_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			FC_FUNC_8131_LCURLIST3Record rec = (FC_FUNC_8131_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dt", rec.dt);
			rx.add(record, "memo_cont", rec.memo_cont);
			rx.add(record, "memo_seq", rec.memo_seq);
			//rx.add(record, "dt", StringUtil.replaceToXml(rec.dt));
			//rx.add(record, "memo_cont", StringUtil.replaceToXml(rec.memo_cont));
			//rx.add(record, "memo_seq", StringUtil.replaceToXml(rec.memo_seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_FUNC_8131_LCURLIST2Record rec = (FC_FUNC_8131_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pymt_plan_dt", rec.pymt_plan_dt);
			rx.add(record, "pymt_plan_prcp_bal", rec.pymt_plan_prcp_bal);
			rx.add(record, "pymt_plan_prcp", rec.pymt_plan_prcp);
			rx.add(record, "pymt_plan_int", rec.pymt_plan_int);
			rx.add(record, "bal", rec.bal);
			rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "pymt_plan_dt", StringUtil.replaceToXml(rec.pymt_plan_dt));
			//rx.add(record, "pymt_plan_prcp_bal", StringUtil.replaceToXml(rec.pymt_plan_prcp_bal));
			//rx.add(record, "pymt_plan_prcp", StringUtil.replaceToXml(rec.pymt_plan_prcp));
			//rx.add(record, "pymt_plan_int", StringUtil.replaceToXml(rec.pymt_plan_int));
			//rx.add(record, "bal", StringUtil.replaceToXml(rec.bal));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_8131_LCURLIST1Record rec = (FC_FUNC_8131_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pymt_plan_dt", rec.pymt_plan_dt);
			rx.add(record, "pymt_plan_prcp_bal", rec.pymt_plan_prcp_bal);
			rx.add(record, "pymt_plan_prcp", rec.pymt_plan_prcp);
			rx.add(record, "pymt_plan_int", rec.pymt_plan_int);
			rx.add(record, "bal", rec.bal);
			rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "pymt_plan_dt", StringUtil.replaceToXml(rec.pymt_plan_dt));
			//rx.add(record, "pymt_plan_prcp_bal", StringUtil.replaceToXml(rec.pymt_plan_prcp_bal));
			//rx.add(record, "pymt_plan_prcp", StringUtil.replaceToXml(rec.pymt_plan_prcp));
			//rx.add(record, "pymt_plan_int", StringUtil.replaceToXml(rec.pymt_plan_int));
			//rx.add(record, "bal", StringUtil.replaceToXml(rec.bal));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
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
<fc_func_8131_l>
	<dataSet>
		<CURLIST3>
			<record>
				<dt/>
				<memo_cont/>
				<memo_seq/>
			</record>
		</CURLIST3>
	</dataSet>
</fc_func_8131_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_8131_l>
	<dataSet>
		<CURLIST2>
			<record>
				<pymt_plan_dt/>
				<pymt_plan_prcp_bal/>
				<pymt_plan_prcp/>
				<pymt_plan_int/>
				<bal/>
				<slip_no/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_func_8131_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_8131_l>
	<dataSet>
		<CURLIST1>
			<record>
				<pymt_plan_dt/>
				<pymt_plan_prcp_bal/>
				<pymt_plan_prcp/>
				<pymt_plan_int/>
				<bal/>
				<slip_no/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_8131_l>
*/
%>

<% /* 작성시간 : Thu Apr 09 13:44:11 KST 2009 */ %>