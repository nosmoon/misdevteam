<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_5131_LDataSet ds = (HD_SRCH_5131_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_5131_LCURLISTRecord rec = (HD_SRCH_5131_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "guk_nm", rec.guk_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "guk_cd", rec.guk_cd);
			rx.add(record, "emp_clsf1", rec.emp_clsf1);
			rx.add(record, "emp_clsf2", rec.emp_clsf2);
			rx.add(record, "emp_clsf3", rec.emp_clsf3);
			rx.add(record, "emp_clsf4", rec.emp_clsf4);
			rx.add(record, "emp_cnt", rec.emp_cnt);
			rx.add(record, "in_cmpy", rec.in_cmpy);
			rx.add(record, "lvcmpy", rec.lvcmpy);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "guk_nm", StringUtil.replaceToXml(rec.guk_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "guk_cd", StringUtil.replaceToXml(rec.guk_cd));
			//rx.add(record, "emp_clsf1", StringUtil.replaceToXml(rec.emp_clsf1));
			//rx.add(record, "emp_clsf2", StringUtil.replaceToXml(rec.emp_clsf2));
			//rx.add(record, "emp_clsf3", StringUtil.replaceToXml(rec.emp_clsf3));
			//rx.add(record, "emp_clsf4", StringUtil.replaceToXml(rec.emp_clsf4));
			//rx.add(record, "emp_cnt", StringUtil.replaceToXml(rec.emp_cnt));
			//rx.add(record, "in_cmpy", StringUtil.replaceToXml(rec.in_cmpy));
			//rx.add(record, "lvcmpy", StringUtil.replaceToXml(rec.lvcmpy));
			//rx.add(record, "renk", StringUtil.replaceToXml(rec.renk));
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
<hd_srch_5131_l>
	<dataSet>
		<CURLIST>
			<record>
				<guk_nm/>
				<dept_nm/>
				<guk_cd/>
				<emp_clsf1/>
				<emp_clsf2/>
				<emp_clsf3/>
				<emp_clsf4/>
				<emp_cnt/>
				<in_cmpy/>
				<lvcmpy/>
				<renk/>
			</record>
		</CURLIST>
	</dataSet>
</hd_srch_5131_l>
*/
%>

<% /* 작성시간 : Thu Nov 22 16:41:44 KST 2018 */ %>