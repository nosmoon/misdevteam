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
	HD_SRCH_5133_LDataSet ds = (HD_SRCH_5133_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "head_clsf_01_02", ds.head_clsf_01_02 );
	rx.add(dataSet, "text_tag", ds.text_tag );
	
	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_SRCH_5133_LCURLIST1Record rec = (HD_SRCH_5133_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "guk_nm", rec.guk_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
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
			//rx.add(record, "emp_clsf1", StringUtil.replaceToXml(rec.emp_clsf1));
			//rx.add(record, "emp_clsf2", StringUtil.replaceToXml(rec.emp_clsf2));
			//rx.add(record, "emp_clsf3", StringUtil.replaceToXml(rec.emp_clsf3));
			//rx.add(record, "emp_clsf4", StringUtil.replaceToXml(rec.emp_clsf4));
			//rx.add(record, "emp_cnt", StringUtil.replaceToXml(rec.emp_cnt));
			//rx.add(record, "in_cmpy", StringUtil.replaceToXml(rec.in_cmpy));
			//rx.add(record, "lvcmpy", StringUtil.replaceToXml(rec.lvcmpy));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<hd_srch_5133_l>
	<dataSet>
		<CURLIST1>
			<record>
				<guk_nm/>
				<dept_nm/>
				<emp_clsf1/>
				<emp_clsf2/>
				<emp_clsf3/>
				<emp_clsf4/>
				<emp_cnt/>
				<in_cmpy/>
				<lvcmpy/>
				<remk/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5133_l>
*/
%>

<% /* 작성시간 : Tue Nov 27 17:56:52 KST 2018 */ %>