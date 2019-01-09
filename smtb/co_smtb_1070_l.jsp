<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.smtb.rec.*
	,	chosun.ciis.co.smtb.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SMTB_1070_LDataSet ds = (CO_SMTB_1070_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** FND_USERLIST BEGIN */
		recordSet = rx.add(dataSet, "FND_USERLIST", "");

		for(int i = 0; i < ds.fnd_userlist.size(); i++) {
			CO_SMTB_1070_LFND_USERLISTRecord rec = (CO_SMTB_1070_LFND_USERLISTRecord)ds.fnd_userlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fnd_user", rec.fnd_user);
			rx.add(record, "fnd_regno", rec.fnd_regno);
			rx.add(record, "fnd_user_name", rec.fnd_user_name);
			rx.add(record, "smart_id", rec.smart_id);
			rx.add(record, "smart_password", rec.smart_password);
			rx.add(record, "smart_email", rec.smart_email);
		}
		rx.add(recordSet, "totalcnt", ds.fnd_userlist.size());
		/****** FND_USERLIST END */

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
<co_smtb_1070_l>
	<dataSet>
		<FND_USERLIST>
			<record>
				<fnd_user/>
				<fnd_regno/>
				<fnd_user_name/>
				<smart_id/>
				<smart_email/>
			</record>
		</FND_USERLIST>
	</dataSet>
</co_smtb_1070_l>
*/
%>

<% /* 작성시간 : Mon May 16 10:50:31 KST 2011 */ %>