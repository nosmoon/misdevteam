<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.corr.rec.*
	,	chosun.ciis.hd.corr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CORR_1300_LDataSet ds = (HD_CORR_1300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_CORR_1300_LCURLISTRecord rec = (HD_CORR_1300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "pay_yymm", rec.pay_yymm);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "natn_cd", rec.natn_cd);
			rx.add(record, "natn_nm", rec.natn_nm);
			rx.add(record, "duty_area", rec.duty_area);
			rx.add(record, "duty_area_nm", rec.duty_area_nm);
			rx.add(record, "cd_48", rec.cd_48);
			rx.add(record, "cd_50", rec.cd_50);
			rx.add(record, "cd_52", rec.cd_52);
			rx.add(record, "cd_54", rec.cd_54);
			rx.add(record, "total_sum", rec.total_sum);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
<tempData>
	<CURLIST>
		<record>
			<seq/>
			<emp_no/>
			<flnm/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<natn_cd/>
			<natn_nm/>
			<duty_area/>
			<duty_area_nm/>
			<cd_48/>
			<cd_50/>
			<cd_52/>
			<cd_54/>
			<total_sum/>
		</record>
	</CURLIST>
</tempData>
*/
%>

<% /* 작성시간 : Mon Apr 13 10:25:39 KST 2009 */ %>