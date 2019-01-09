<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*;
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2860_MDataSet ds = (FC_ACCT_2860_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	dataSet = rx.add(root, "resData", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** RCPM_CLSFCDLIST BEGIN */
		recordSet = rx.add(dataSet, "rcpm_clsf", "");

		for(int i = 0; i < ds.rcpm_clsfcdlist.size(); i++) {
			FC_ACCT_2860_MRCPM_CLSFCDLISTRecord rec = (FC_ACCT_2860_MRCPM_CLSFCDLISTRecord)ds.rcpm_clsfcdlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cccodeval);
			rx.add(record, "cccdnm", rec.cccdnm);
			rx.add(record, "label", rec.cccdynm);
		}
		rx.add(recordSet, "totalcnt", ds.rcpm_clsfcdlist.size());
		/****** RCPM_CLSFCDLIST END */

		/****** WIDR_RESNCDLIST BEGIN */
		recordSet = rx.add(dataSet, "widr_resn", "");

		for(int i = 0; i < ds.widr_resncdlist.size(); i++) {
			FC_ACCT_2860_MWIDR_RESNCDLISTRecord rec = (FC_ACCT_2860_MWIDR_RESNCDLISTRecord)ds.widr_resncdlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cccodeval);
			rx.add(record, "cccdnm", rec.cccdnm);
			rx.add(record, "label", rec.cccdynm);
		}
		rx.add(recordSet, "totalcnt", ds.widr_resncdlist.size());
		/****** WIDR_RESNCDLIST END */

		/****** RCPM_SHET_KINDCDLIST BEGIN */
		recordSet = rx.add(dataSet, "rcpm_shet_kind", "");

		for(int i = 0; i < ds.rcpm_shet_kindcdlist.size(); i++) {
			FC_ACCT_2860_MRCPM_SHET_KINDCDLISTRecord rec = (FC_ACCT_2860_MRCPM_SHET_KINDCDLISTRecord)ds.rcpm_shet_kindcdlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cccodeval);
			rx.add(record, "cccdnm", rec.cccdnm);
			rx.add(record, "label", rec.cccdynm);
		}
		rx.add(recordSet, "totalcnt", ds.rcpm_shet_kindcdlist.size());
		/****** RCPM_SHET_KINDCDLIST END */

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
<dataSet>
	<RCPM_CLSFCDLIST>
		<record>
			<cccodeval/>
			<cccdnm/>
			<cccdynm/>
		</record>
	</RCPM_CLSFCDLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<WIDR_RESNCDLIST>
		<record>
			<cccodeval/>
			<cccdnm/>
			<cccdynm/>
		</record>
	</WIDR_RESNCDLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<RCPM_SHET_KINDCDLIST>
		<record>
			<cccodeval/>
			<cccdnm/>
			<cccdynm/>
		</record>
	</RCPM_SHET_KINDCDLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jan 19 13:01:43 KST 2009 */ %>
