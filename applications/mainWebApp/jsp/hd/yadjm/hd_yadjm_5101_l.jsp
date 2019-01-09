<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_5101_LDataSet ds = (HD_YADJM_5101_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_5101_LCURLISTRecord rec = (HD_YADJM_5101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "zip_1_1", rec.zip_1_1);
			//rx.add(record, "zip_2_1", rec.zip_2_1);
			//rx.add(record, "addr_1", rec.addr_1);
			//rx.add(record, "dtls_addr_1", rec.dtls_addr_1);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "zip_1_1", StringUtil.replaceToXml(rec.zip_1_1));
			rx.add(record, "zip_2_1", StringUtil.replaceToXml(rec.zip_2_1));
			rx.add(record, "addr_1", StringUtil.replaceToXml(rec.addr_1));
			rx.add(record, "dtls_addr_1", StringUtil.replaceToXml(rec.dtls_addr_1));
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
<hd_yadjm_5101_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<zip_1_1/>
				<zip_2_1/>
				<addr_1/>
				<dtls_addr_1/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_5101_l>
*/
%>

<% /* 작성시간 : Tue Jan 19 16:48:52 KST 2010 */ %>