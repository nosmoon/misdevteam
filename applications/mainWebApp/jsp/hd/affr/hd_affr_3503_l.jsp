<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_3503_LDataSet ds = (HD_AFFR_3503_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_3503_LCURLISTRecord rec = (HD_AFFR_3503_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sel_type", rec.sel_type);
			rx.add(record, "emp_cnt", rec.emp_cnt);
			//rx.add(record, "sel_type", StringUtil.replaceToXml(rec.sel_type));
			//rx.add(record, "emp_cnt", StringUtil.replaceToXml(rec.emp_cnt));
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
<hd_affr_3503_l>
	<dataSet>
		<CURLIST>
			<record>
				<sel_type/>
				<emp_cnt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_3503_l>
*/
%>

<% /* 작성시간 : Mon Nov 02 21:31:50 KST 2009 */ %>