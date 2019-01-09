<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_2105_LDataSet ds = (MC_BUDG_2105_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_2105_LCURLISTRecord rec = (MC_BUDG_2105_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "use_dept_cd", rec.use_dept_cd);
			//rx.add(record, "use_dept_nm", rec.use_dept_nm);			
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			rx.add(record, "use_dept_nm", StringUtil.replaceToXml(rec.use_dept_nm));
			rx.add(record, "jobtag", "");
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
<mc_budg_2105_l>
	<dataSet>
		<CURLIST>
			<record>
				<seq/>
				<use_dept_cd/>
				<use_dept_nm/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_2105_l>
*/
%>

<% /* 작성시간 : Tue May 19 19:55:01 KST 2009 */ %>