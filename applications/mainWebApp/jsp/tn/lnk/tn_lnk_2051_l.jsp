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
	TN_LNK_2051_LDataSet ds = (TN_LNK_2051_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int sendFileData = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//dataSet = rx.add(root, "dataSet", "");

	sendFileData = rx.add(root, "send_filelist_data", "");

	try {

		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_2051_LCURLISTRecord rec = (TN_LNK_2051_LCURLISTRecord)ds.curlist.get(i);
			//int record = rx.add(recordSet, "record", "");
			int record = rx.add(sendFileData, "record", "");
			
			rx.add(record, "cmsidx", rec.cmsidx);
			rx.add(record, "deptidx", rec.deptidx);
			rx.addCData(record, "filename", rec.filename);
			rx.addCData(record, "filepath", "");
			//rx.addCData(record, "filepath", rec.filepath);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
<tn_lnk_2051_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmsidx/>
				<deptidx/>
				<filename/>
				<filepath/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_2051_l>
*/
%>

<% /* 작성시간 : Fri Aug 05 10:20:32 KST 2016 */ %>