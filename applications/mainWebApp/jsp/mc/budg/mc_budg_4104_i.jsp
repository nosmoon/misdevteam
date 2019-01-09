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
	MC_BUDG_4104_IDataSet ds = (MC_BUDG_4104_IDataSet)request.getAttribute("ds");
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
			MC_BUDG_4104_ICURLISTRecord rec = (MC_BUDG_4104_ICURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_bgn_yymm", rec.dept_bgn_yymm);
			rx.add(record, "dept_end_yymm", rec.dept_end_yymm);
			//rx.add(record, "dept_bgn_yymm", StringUtil.replaceToXml(rec.dept_bgn_yymm));
			//rx.add(record, "dept_end_yymm", StringUtil.replaceToXml(rec.dept_end_yymm));
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
<mc_budg_4104_i>
	<dataSet>
		<CURLIST>
			<record>
				<dept_bgn_yymm/>
				<dept_end_yymm/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4104_i>
*/
%>

<% /* 작성시간 : Wed Aug 19 21:01:23 KST 2009 */ %>