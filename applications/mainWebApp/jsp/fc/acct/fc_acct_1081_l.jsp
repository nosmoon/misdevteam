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
	FC_ACCT_1081_LDataSet ds = (FC_ACCT_1081_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_1081_LCURLISTRecord rec = (FC_ACCT_1081_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "remk", rec.remk);
			//rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.addCData(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.addCData(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.addCData(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "use_yn", StringUtil.replaceToXml(rec.use_yn));
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
<fc_acct_1081_l>
	<dataSet>
		<CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<remk/>
				<use_yn/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_1081_l>
*/
%>

<% /* 작성시간 : Thu Jul 09 20:17:03 KST 2009 */ %>