<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.ddemp.rec.*
	,	chosun.ciis.hd.ddemp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DDEMP_5001_LDataSet ds = (HD_DDEMP_5001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DDEMP_5001_LCURLISTRecord rec = (HD_DDEMP_5001_LCURLISTRecord)ds.curlist.get(i);
			System.out.println("00000000000");
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "flnm", rec.flnm);
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
<hd_DDEMP_5001_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<mang_no/>
				<flnm/>
				<memb_clsf/>
				<spos_name/>
				<bank_cd/>
				<bank_nm/>
				<acct_no/>
				<deps_per/>
			</record>
		</CURLIST>
	</dataSet>
</hd_DDEMP_5001_l>
*/
%>

<% /* 작성시간 : Mon Sep 04 16:48:48 KST 2017 */ %>