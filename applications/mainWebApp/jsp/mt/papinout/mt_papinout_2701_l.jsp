<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2701_LDataSet ds = (MT_PAPINOUT_2701_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_2701_LCURLISTRecord rec = (MT_PAPINOUT_2701_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "save_yymm", rec.save_yymm);
			rx.add(record, "save_fac_clsf", rec.save_fac_clsf);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "ewh_plan_roll", rec.ewh_plan_roll);
			rx.add(record, "ewh_plan_wgt", rec.ewh_plan_wgt);
			rx.add(record, "owh_plan_roll", rec.owh_plan_roll);
			rx.add(record, "owh_plan_wgt", rec.owh_plan_wgt);
			rx.add(record, "save_work_frdt", rec.save_work_frdt);
			rx.add(record, "save_work_todt", rec.save_work_todt);
			rx.add(record, "roll_wgt", rec.roll_wgt);
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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<save_yymm/>
			<save_fac_clsf/>
			<matr_cd/>
			<ewh_plan_roll/>
			<ewh_plan_wgt/>
			<owh_plan_roll/>
			<owh_plan_wgt/>
			<save_work_frdt/>
			<save_work_todt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 01 15:53:01 KST 2009 */ %>