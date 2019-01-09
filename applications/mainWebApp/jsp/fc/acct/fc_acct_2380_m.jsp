<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2380_MDataSet ds = (FC_ACCT_2380_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** INCOM_CLSF BEGIN */
		recordSet = rx.add(dataSet, "INCOM_CLSF", "");

		for(int i = 0; i < ds.incom_clsf.size(); i++) {
			FC_ACCT_2380_MINCOM_CLSFRecord rec = (FC_ACCT_2380_MINCOM_CLSFRecord)ds.incom_clsf.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.incom_clsf.size());
		/****** INCOM_CLSF END */

		/****** MANG_CLSF BEGIN */
		recordSet = rx.add(dataSet, "MANG_CLSF", "");

		for(int i = 0; i < ds.mang_clsf.size(); i++) {
			FC_ACCT_2380_MMANG_CLSFRecord rec = (FC_ACCT_2380_MMANG_CLSFRecord)ds.mang_clsf.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.mang_clsf.size());
		/****** MANG_CLSF END */

		/****** MEDI BEGIN */
		recordSet = rx.add(dataSet, "MEDI", "");

		for(int i = 0; i < ds.medi.size(); i++) {
			FC_ACCT_2380_MMEDIRecord rec = (FC_ACCT_2380_MMEDIRecord)ds.medi.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.medi.size());
		/****** MEDI END */

		/****** BIZ_CD BEGIN */
		recordSet = rx.add(dataSet, "BIZ_CD", "");

		for(int i = 0; i < ds.biz_cd.size(); i++) {
			FC_ACCT_2380_MBIZ_CDRecord rec = (FC_ACCT_2380_MBIZ_CDRecord)ds.biz_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.biz_cd.size());
		/****** BIZ_CD END */

		/****** DLCO_CLSF BEGIN */
		recordSet = rx.add(dataSet, "DLCO_CLSF", "");

		for(int i = 0; i < ds.dlco_clsf.size(); i++) {
			FC_ACCT_2380_MDLCO_CLSFRecord rec = (FC_ACCT_2380_MDLCO_CLSFRecord)ds.dlco_clsf.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.dlco_clsf.size());
		/****** DLCO_CLSF END */

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
	<INCOM_CLSF>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</INCOM_CLSF>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MANG_CLSF>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</MANG_CLSF>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MEDI>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</MEDI>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<BIZ_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</BIZ_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<DLCO_CLSF>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</DLCO_CLSF>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 25 11:34:01 KST 2009 */ %>