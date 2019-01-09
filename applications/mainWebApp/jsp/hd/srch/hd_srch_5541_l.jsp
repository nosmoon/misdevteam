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
	HD_SRCH_5541_LDataSet ds = (HD_SRCH_5541_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_SRCH_5541_LCURLIST1Record rec = (HD_SRCH_5541_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "guk_nm", rec.guk_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "emp_clsf1", rec.emp_clsf1);
			rx.add(record, "emp_clsf2", rec.emp_clsf2);
			rx.add(record, "emp_clsf3", rec.emp_clsf3);
			rx.add(record, "emp_clsf4", rec.emp_clsf4);
			rx.add(record, "emp_clsf5", rec.emp_clsf5);
			rx.add(record, "emp_clsf6", rec.emp_clsf6);
			rx.add(record, "emp_clsf7", rec.emp_clsf7);
			rx.add(record, "emp_clsf8", rec.emp_clsf8);
			rx.add(record, "emp_clsf9", rec.emp_clsf9);
			rx.add(record, "emp_clsf10", rec.emp_clsf10);
			rx.add(record, "emp_clsf11", rec.emp_clsf11);
			rx.add(record, "tot_sum", rec.tot_sum);
			//rx.add(record, "guk_nm", StringUtil.replaceToXml(rec.guk_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "emp_clsf1", StringUtil.replaceToXml(rec.emp_clsf1));
			//rx.add(record, "emp_clsf2", StringUtil.replaceToXml(rec.emp_clsf2));
			//rx.add(record, "emp_clsf3", StringUtil.replaceToXml(rec.emp_clsf3));
			//rx.add(record, "emp_clsf4", StringUtil.replaceToXml(rec.emp_clsf4));
			//rx.add(record, "emp_clsf5", StringUtil.replaceToXml(rec.emp_clsf5));
			//rx.add(record, "emp_clsf6", StringUtil.replaceToXml(rec.emp_clsf6));
			//rx.add(record, "emp_clsf7", StringUtil.replaceToXml(rec.emp_clsf7));
			//rx.add(record, "emp_clsf8", StringUtil.replaceToXml(rec.emp_clsf8));
			//rx.add(record, "emp_clsf9", StringUtil.replaceToXml(rec.emp_clsf9));
			//rx.add(record, "emp_clsf10", StringUtil.replaceToXml(rec.emp_clsf10));
			//rx.add(record, "emp_clsf11", StringUtil.replaceToXml(rec.emp_clsf11));
			//rx.add(record, "tot_sum", StringUtil.replaceToXml(rec.tot_sum));
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
<hd_srch_5541_l>
	<dataSet>
		<CURLIST1>
			<record>
				<guk_nm/>
				<dept_nm/>
				<dept_cd/>
				<emp_clsf1/>
				<emp_clsf2/>
				<emp_clsf3/>
				<emp_clsf4/>
				<emp_clsf5/>
				<emp_clsf6/>
				<emp_clsf7/>
				<emp_clsf8/>
				<emp_clsf9/>
				<emp_clsf10/>
				<emp_clsf11/>
				<tot_sum/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5541_l>
*/
%>

<% /* 작성시간 : Wed Nov 07 18:58:26 KST 2018 */ %>