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
	HD_SRCH_5111_LDataSet ds = (HD_SRCH_5111_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		rx.add(dataSet, "xx_nops_cnt", ds.xx_nops_cnt );
		
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SRCH_5111_LCURLISTRecord rec = (HD_SRCH_5111_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clas_clsf", rec.clas_clsf);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "prv_nops", rec.prv_nops);
			rx.add(record, "this_nops", rec.this_nops);
			rx.add(record, "cmpr_nops", rec.cmpr_nops);
			//rx.add(record, "clas_clsf", StringUtil.replaceToXml(rec.clas_clsf));
			//rx.add(record, "emp_clsf", StringUtil.replaceToXml(rec.emp_clsf));
			//rx.add(record, "prv_nops", StringUtil.replaceToXml(rec.prv_nops));
			//rx.add(record, "this_nops", StringUtil.replaceToXml(rec.this_nops));
			//rx.add(record, "cmpr_nops", StringUtil.replaceToXml(rec.cmpr_nops));
		}
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
<hd_srch_5111_l>
	<dataSet>
		<CURLIST>
			<record>
				<clas_clsf/>
				<emp_clsf/>
				<prv_nops/>
				<this_nops/>
				<cmpr_nops/>
			</record>
		</CURLIST>
	</dataSet>
</hd_srch_5111_l>
*/
%>

<% /* 작성시간 : Mon May 28 14:24:02 KST 2018 */ %>