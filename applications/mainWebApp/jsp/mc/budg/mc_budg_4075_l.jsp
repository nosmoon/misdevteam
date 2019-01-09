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
	MC_BUDG_4075_LDataSet ds = (MC_BUDG_4075_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4075_LCURLISTRecord rec = (MC_BUDG_4075_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "work_dt", rec.work_dt);
			rx.add(record, "hsty_no", rec.hsty_no);
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "yramt", rec.yramt);
			rx.add(record, "amt", rec.amt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "work_dt", StringUtil.replaceToXml(rec.work_dt));
			//rx.add(record, "hsty_no", StringUtil.replaceToXml(rec.hsty_no));
			//rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			//rx.add(record, "yramt", StringUtil.replaceToXml(rec.yramt));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
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
<mc_budg_4075_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<work_dt/>
				<hsty_no/>
				<rmks2/>
				<yramt/>
				<amt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4075_l>
*/
%>

<% /* 작성시간 : Mon May 11 20:24:17 KST 2009 */ %>