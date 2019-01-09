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
	HD_CORR_1200_LDataSet ds = (HD_CORR_1200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_CORR_1200_LCURLISTRecord rec = (HD_CORR_1200_LCURLISTRecord)ds.curlist.get(i);
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
			rx.add(record, "total_sum", rec.total_sum);
			rx.add(record, "cd_10", rec.cd_10);
			rx.add(record, "cd_12", rec.cd_12);
			rx.add(record, "cd_14", rec.cd_14);
			rx.add(record, "cd_16", rec.cd_16);
			rx.add(record, "cd_18", rec.cd_18);
			rx.add(record, "cd_20", rec.cd_20);
			rx.add(record, "cd_22", rec.cd_22);
			rx.add(record, "cd_24", rec.cd_24);
			rx.add(record, "cd_26", rec.cd_26);
			rx.add(record, "cd_28", rec.cd_28);
			rx.add(record, "cd_30", rec.cd_30);
			rx.add(record, "cd_32", rec.cd_32);
			rx.add(record, "cd_34", rec.cd_34);
			rx.add(record, "cd_36", rec.cd_36);
			rx.add(record, "cd_38", rec.cd_38);
			rx.add(record, "cd_40", rec.cd_40);
			rx.add(record, "cd_42", rec.cd_42);
			rx.add(record, "cd_44", rec.cd_44);
			rx.add(record, "cd_46", rec.cd_46);
			rx.add(record, "cd_48", rec.cd_48);
			rx.add(record, "cd_50", rec.cd_50);
			rx.add(record, "cd_52", rec.cd_52);
			rx.add(record, "cd_54", rec.cd_54);
			rx.add(record, "cd_56", rec.cd_56);
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
			<total_sum/>
			<cd_10/>
			<cd_12/>
			<cd_14/>
			<cd_16/>
			<cd_18/>
			<cd_20/>
			<cd_22/>
			<cd_24/>
			<cd_26/>
			<cd_28/>
			<cd_30/>
			<cd_32/>
			<cd_34/>
			<cd_36/>
			<cd_38/>
			<cd_40/>
			<cd_42/>
			<cd_44/>
			<cd_46/>
			<cd_48/>
			<cd_50/>
			<cd_52/>
			<cd_54/>
			<cd_56/>
		</record>
	</CURLIST>
</tempData>
*/
%>

<% /* 작성시간 : Mon Apr 13 10:02:19 KST 2009 */ %>