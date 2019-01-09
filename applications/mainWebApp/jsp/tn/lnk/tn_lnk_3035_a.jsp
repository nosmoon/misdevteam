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
	TN_LNK_3035_ADataSet ds = (TN_LNK_3035_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	int fileData = rx.add(root, "makefile_data", "");
	
	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_3035_ACURLISTRecord rec = (TN_LNK_3035_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(fileData, "record", "");
			rx.addCData(record, "file_data", rec.file_data);
		}

		rx.add(fileData, "cmsidx", 	 ds.cmsidx);
		rx.add(fileData, "totalcnt", ds.curlist.size());

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_lnk_3035_a>
	<dataSet>
		<CURLIST>
			<record>
				<file_data/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_3035_a>
*/
%>

<% /* 작성시간 : Mon Jul 18 17:14:01 KST 2016 */ %>