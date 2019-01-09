<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_LNK_4010_LDataSet ds = (TN_LNK_4010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_4010_LCURLISTRecord rec = (TN_LNK_4010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "name", rec.name);
			rx.add(record, "email", rec.email);
			rx.add(record, "cellphone", rec.cellphone);
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "email", StringUtil.replaceToXml(rec.email));
			//rx.add(record, "cellphone", StringUtil.replaceToXml(rec.cellphone));
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
<tn_lnk_4010_l>
	<dataSet>
		<CURLIST>
			<record>
				<memberidx/>
				<name/>
				<email/>
				<cellphone/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_4010_l>
*/
%>

<% /* 작성시간 : Wed Aug 31 15:05:03 KST 2016 */ %>