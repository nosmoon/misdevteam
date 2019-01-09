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
	TN_LNK_5050_ADataSet ds = (TN_LNK_5050_ADataSet)request.getAttribute("ds");
	TN_LNK_5055_ADataSet ds2 = (TN_LNK_5055_ADataSet)request.getAttribute("ds2");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		rx.add(dataSet, "tailresult", ds2.tailresult);
		rx.add(dataSet, "tailresultmsg", ds2.tailresultmsg);
		
		/*
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_5050_ACURLISTRecord rec = (TN_LNK_5050_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "filedata", rec.filedata);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());

		*/
		
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_lnk_5050_a>
	<dataSet>
		<CURLIST>
			<record>
				<filedata/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_5050_a>
*/
%>

<% /* 작성시간 : Thu Sep 22 13:42:14 KST 2016 */ %>