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
	FC_ACCT_6210_MDataSet ds = (FC_ACCT_6210_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */

		//recordSet = rx.add(dataSet, "CURLIST2", "");

		//for(int i = 0; i < ds.curlist2.size(); i++) {
			//FC_ACCT_6210_MCURLIST2Record rec = (FC_ACCT_6210_MCURLIST2Record)ds.curlist2.get(i);
			//int record = rx.add(recordSet, "item", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		//}
		//rx.add(recordSet, "totalcnt", ds.curlist2.size());
		
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */		
		recordSet = rx.add(dataSet, "erplace_clsf", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_6210_MCURLIST1Record rec = (FC_ACCT_6210_MCURLIST1Record)ds.curlist1.get(i);
			int item = rx.add(recordSet, "item", "");
			rx.add(item, "value", rec.cd);
			//rx.add(item, "cdnm", rec.cdnm);
			//rx.add(item, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(item, "cdnm_cd", rec.cdnm_cd);
			rx.add(item, "label", rec.cdabrvnm_cd);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<fc_acct_6210_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_6210_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6210_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_6210_m>
*/
%>

<% /* 작성시간 : Tue Jun 17 16:44:36 KST 2014 */ %>