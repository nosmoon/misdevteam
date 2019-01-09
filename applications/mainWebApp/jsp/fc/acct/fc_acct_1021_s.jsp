<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_1021_SDataSet ds = (FC_ACCT_1021_SDataSet)request.getAttribute("ds");
	
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	tempData = rx.add(root, "tempData", "");


	recordSet = rx.add(tempData, "curList", "");

	for(int i = 0; i < ds.curlist.size(); i++) {
		FC_ACCT_1021_SCURLISTRecord rec = (FC_ACCT_1021_SCURLISTRecord)ds.curlist.get(i);
		int record = rx.add(recordSet, "record", "");
		
		rx.add(record, "insd_acct_cd", rec.insd_acct_cd);
		rx.addCData(record, "acct_subj_nm", rec.acct_subj_nm);
		rx.add(record, "tot_yn", rec.tot_yn);
		
		System.out.println(rec.insd_acct_cd + "^" + rec.acct_subj_nm);
	}
	
	rx.add(recordSet, "totalcnt", ds.curlist.size());
	
	rx.add(tempData, "errcode", errcode);
	rx.add(tempData, "errmsg", errmsg);
	
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());

%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_1021_s>
	<dataSet>
		<CURLIST>
			<record>
				<insd_acct_cd/>
				<acct_subj_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_1021_s>
*/
%>

<% /* 작성시간 : Thu Jun 12 11:52:59 KST 2014 */ %>