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
	HD_SRCH_5123_LDataSet ds = (HD_SRCH_5123_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");


	rx.add(dataSet, "head_clsf_01_02", ds.head_clsf_01_02 );
	rx.add(dataSet, "text_tag", ds.text_tag );
	rx.add(dataSet, "grid_title", ds.grid_title );
	
	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_SRCH_5123_LCURLIST1Record rec = (HD_SRCH_5123_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "dept_nops1", rec.dept_nops1);
			rx.add(record, "dept_nops2", rec.dept_nops2);
			rx.add(record, "dept_nops3", rec.dept_nops3);
			rx.add(record, "dept_nops4", rec.dept_nops4);
			rx.add(record, "dept_nops5", rec.dept_nops5);
			rx.add(record, "dept_nops6", rec.dept_nops6);
			rx.add(record, "dept_nops7", rec.dept_nops7);
			rx.add(record, "dept_nops8", rec.dept_nops8);
			rx.add(record, "dept_nops9", rec.dept_nops9);
			rx.add(record, "dept_nops10", rec.dept_nops10);
			rx.add(record, "sum_nops", rec.sum_nops);
			rx.add(record, "ratio_nops", rec.ratio_nops);
			//rx.add(record, "emp_clsf", StringUtil.replaceToXml(rec.emp_clsf));
			//rx.add(record, "dept_nops1", StringUtil.replaceToXml(rec.dept_nops1));
			//rx.add(record, "dept_nops2", StringUtil.replaceToXml(rec.dept_nops2));
			//rx.add(record, "dept_nops3", StringUtil.replaceToXml(rec.dept_nops3));
			//rx.add(record, "dept_nops4", StringUtil.replaceToXml(rec.dept_nops4));
			//rx.add(record, "dept_nops5", StringUtil.replaceToXml(rec.dept_nops5));
			//rx.add(record, "dept_nops6", StringUtil.replaceToXml(rec.dept_nops6));
			//rx.add(record, "dept_nops7", StringUtil.replaceToXml(rec.dept_nops7));
			//rx.add(record, "dept_nops8", StringUtil.replaceToXml(rec.dept_nops8));
			//rx.add(record, "dept_nops9", StringUtil.replaceToXml(rec.dept_nops9));
			//rx.add(record, "dept_nops10", StringUtil.replaceToXml(rec.dept_nops10));
			//rx.add(record, "sum_nops", StringUtil.replaceToXml(rec.sum_nops));
			//rx.add(record, "ratio_nops", StringUtil.replaceToXml(rec.ratio_nops));
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
<hd_srch_5123_l>
	<dataSet>
		<CURLIST1>
			<record>
				<emp_clsf/>
				<dept_nops1/>
				<dept_nops2/>
				<dept_nops3/>
				<dept_nops4/>
				<dept_nops5/>
				<dept_nops6/>
				<dept_nops7/>
				<dept_nops8/>
				<dept_nops9/>
				<dept_nops10/>
				<sum_nops/>
				<ratio_nops/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5123_l>
*/
%>

<% /* 작성시간 : Tue Nov 27 18:06:23 KST 2018 */ %>