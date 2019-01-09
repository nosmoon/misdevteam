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
	FC_ACCT_2083_SDataSet ds = (FC_ACCT_2083_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CUR_MANG_CLSF_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_MANG_CLSF_CD_LIST", "");

		for(int i = 0; i < ds.cur_mang_clsf_cd_list.size(); i++) {
			FC_ACCT_2083_SCUR_MANG_CLSF_CD_LISTRecord rec = (FC_ACCT_2083_SCUR_MANG_CLSF_CD_LISTRecord)ds.cur_mang_clsf_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.cur_mang_clsf_cd_list.size());
		/****** CUR_MANG_CLSF_CD_LIST END */

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
	<CUR_MANG_CLSF_CD_LIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CUR_MANG_CLSF_CD_LIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 16 10:00:26 KST 2009 */ %>