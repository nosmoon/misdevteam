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
	HD_SRCH_5521_LDataSet ds = (HD_SRCH_5521_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_5521_LCURLIST1Record rec = (HD_SRCH_5521_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "row_num", rec.row_num);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "prv_mm", rec.prv_mm);
			rx.add(record, "base_mm", rec.base_mm);
			rx.add(record, "prvmm_cmpr", rec.prvmm_cmpr);
			rx.add(record, "icdc_rate", rec.icdc_rate);
			//rx.add(record, "row_num", StringUtil.replaceToXml(rec.row_num));
			//rx.add(record, "emp_clsf", StringUtil.replaceToXml(rec.emp_clsf));
			//rx.add(record, "prv_mm", StringUtil.replaceToXml(rec.prv_mm));
			//rx.add(record, "base_mm", StringUtil.replaceToXml(rec.base_mm));
			//rx.add(record, "prvmm_cmpr", StringUtil.replaceToXml(rec.prvmm_cmpr));
			//rx.add(record, "icdc_rate", StringUtil.replaceToXml(rec.icdc_rate));
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
<hd_srch_5521_l>
	<dataSet>
		<CURLIST1>
			<record>
				<row_num/>
				<emp_clsf/>
				<prv_mm/>
				<base_mm/>
				<prvmm_cmpr/>
				<icdc_rate/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5521_l>
*/
%>

<% /* 작성시간 : Wed Nov 07 15:04:52 KST 2018 */ %>