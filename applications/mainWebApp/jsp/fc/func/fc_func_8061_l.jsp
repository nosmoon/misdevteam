<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_8061_LDataSet ds = (FC_FUNC_8061_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_8061_LCURLISTRecord rec = (FC_FUNC_8061_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pay_prd_from", rec.pay_prd_from);
			rx.add(record, "pay_prd_to", rec.pay_prd_to);
			rx.add(record, "libo_int_rate", rec.libo_int_rate);
			rx.add(record, "fix_yn", rec.fix_yn);
			//rx.add(record, "pay_prd_from", StringUtil.replaceToXml(rec.pay_prd_from));
			//rx.add(record, "pay_prd_to", StringUtil.replaceToXml(rec.pay_prd_to));
			//rx.add(record, "libo_int_rate", StringUtil.replaceToXml(rec.libo_int_rate));
			//rx.add(record, "fix_yn", StringUtil.replaceToXml(rec.fix_yn));
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
<fc_func_8061_l>
	<dataSet>
		<CURLIST>
			<record>
				<pay_prd_from/>
				<pay_prd_to/>
				<libo_int_rate/>
				<fix_yn/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_8061_l>
*/
%>

<% /* 작성시간 : Sat Apr 11 13:18:30 KST 2009 */ %>