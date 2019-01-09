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
	FC_ACCT_2510_MDataSet ds = (FC_ACCT_2510_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	try {
		/****** CUR_MANG_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_MANG_CLSF_LIST", "");

		for(int i = 0; i < ds.cur_mang_clsf_list.size(); i++) {
			FC_ACCT_2510_MCUR_MANG_CLSF_LISTRecord rec = (FC_ACCT_2510_MCUR_MANG_CLSF_LISTRecord)ds.cur_mang_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_mang_clsf_list.size());
		/****** CUR_MANG_CLSF_LIST END */

		/****** CUR_SLIP_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_SLIP_CLSF_LIST", "");

		for(int i = 0; i < ds.cur_slip_clsf_list.size(); i++) {
			FC_ACCT_2510_MCUR_SLIP_CLSF_LISTRecord rec = (FC_ACCT_2510_MCUR_SLIP_CLSF_LISTRecord)ds.cur_slip_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_slip_clsf_list.size());
		/****** CUR_SLIP_CLSF_LIST END */
		
		/****** CUR_ACCT_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_ACCT_LIST", "");
		
		for(int i = 0; i < ds.cur_acct_list.size(); i++) {
			FC_ACCT_2510_MCUR_ACCT_LISTRecord rec = (FC_ACCT_2510_MCUR_ACCT_LISTRecord)ds.cur_acct_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "acct_abrv_nm ", rec.acct_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.cur_acct_list.size());
		/****** CUR_ACCT_LIST END */
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
	<CUR_MANG_CLSF_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_MANG_CLSF_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_SLIP_CLSF_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_SLIP_CLSF_LIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 11 19:23:05 KST 2009 */ %>