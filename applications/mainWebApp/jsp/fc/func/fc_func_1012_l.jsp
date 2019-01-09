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
	FC_FUNC_1012_LDataSet ds = (FC_FUNC_1012_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1012_LCURLISTRecord rec = (FC_FUNC_1012_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "stat_cd", rec.stat_cd);
			rx.add(record, "stat_dt", rec.stat_dt);
			rx.add(record, "stat_cd_nm", rec.stat_cd_nm);
			//rx.add(record, "stat_cd", StringUtil.replaceToXml(rec.stat_cd));
			//rx.add(record, "stat_dt", StringUtil.replaceToXml(rec.stat_dt));
			//rx.add(record, "stat_cd_nm", StringUtil.replaceToXml(rec.stat_cd_nm));
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
<fc_func_1012_l>
	<dataSet>
		<CURLIST>
			<record>
				<stat_cd/>
				<stat_dt/>
				<stat_cd_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1012_l>
*/
%>

<% /* 작성시간 : Wed Apr 22 17:39:30 KST 2009 */ %>