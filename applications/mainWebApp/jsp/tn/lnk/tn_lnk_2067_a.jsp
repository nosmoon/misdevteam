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
	TN_LNK_2067_ADataSet ds = (TN_LNK_2067_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	int fileData = rx.add(root, "eb12_data", "");
	
	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_2067_ACURLISTRecord rec = (TN_LNK_2067_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(fileData, "record", "");
			rx.add(record, "cmsidx", rec.cmsidx);
			rx.addCData(record, "form_nm", rec.form_nm);
			rx.add(record, "form_seq", rec.form_seq);
			rx.addCData(record, "file_data", rec.file_data);
		}
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
<tn_lnk_2067_a>
	<dataSet>
		<CURLIST>
			<record>
				<cmsidx/>
				<form_nm/>
				<form_seq/>
				<file_data/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_2067_a>
*/
%>

<% /* 작성시간 : Fri Aug 12 14:04:55 KST 2016 */ %>