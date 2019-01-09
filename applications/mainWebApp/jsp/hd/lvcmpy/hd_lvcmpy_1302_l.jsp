<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_1302_LDataSet ds = (HD_LVCMPY_1302_LDataSet)request.getAttribute("ds");
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
			HD_LVCMPY_1302_LCURLISTRecord rec = (HD_LVCMPY_1302_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "lvcmpy_mm_np", rec.lvcmpy_mm_np);
			rx.add(record, "lvcmpy_mm_hlth_insr", rec.lvcmpy_mm_hlth_insr);
			rx.add(record, "lvcmpy_mm_emp_insr", rec.lvcmpy_mm_emp_insr);
			rx.add(record, "emp_insr_fee_drbk_amt", rec.emp_insr_fee_drbk_amt);
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "lvcmpy_mm_np", StringUtil.replaceToXml(rec.lvcmpy_mm_np));
			//rx.add(record, "lvcmpy_mm_hlth_insr", StringUtil.replaceToXml(rec.lvcmpy_mm_hlth_insr));
			//rx.add(record, "lvcmpy_mm_emp_insr", StringUtil.replaceToXml(rec.lvcmpy_mm_emp_insr));
			//rx.add(record, "emp_insr_fee_drbk_amt", StringUtil.replaceToXml(rec.emp_insr_fee_drbk_amt));
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
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
<hd_lvcmpy_1302_l>
	<dataSet>
		<CURLIST>
			<record>
				<lvcmpy_mm_np/>
				<lvcmpy_mm_hlth_insr/>
				<lvcmpy_mm_emp_insr/>
				<emp_insr_fee_drbk_amt/>
				<cnt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_1302_l>
*/
%>

<% /* 작성시간 : Mon Sep 07 22:29:44 KST 2009 */ %>