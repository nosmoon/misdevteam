<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_4200_LDataSet ds = (HD_AFFR_4200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_4200_LCURLISTRecord rec = (HD_AFFR_4200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			rx.add(record, "use_dt", StringUtil.replaceToXml(rec.use_dt));
			rx.add(record, "use_plac", StringUtil.replaceToXml(rec.use_plac));
			rx.add(record, "indt_cd", StringUtil.replaceToXml(rec.indt_cd));
			rx.add(record, "indt_nm", StringUtil.replaceToXml(rec.indt_nm));
			rx.add(record, "category_clsf_nm", StringUtil.replaceToXml(rec.category_clsf_nm));
			rx.add(record, "use_amt", StringUtil.replaceToXml(rec.use_amt));
			rx.add(record, "aprv_dt", StringUtil.replaceToXml(rec.aprv_dt));
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
			<cd_nm/>
			<dept_nm/>
			<emp_no/>
			<nm_korn/>
			<dty_nm/>
			<posi_nm/>
			<use_dt/>
			<use_plac/>
			<indt_cd/>
			<indt_nm/>
			<category_clsf_nm/>
			<use_amt/>
			<aprv_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jul 06 20:23:25 KST 2009 */ %>