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
	FC_ACCT_2310_LDataSet ds = (FC_ACCT_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int gridData = 0;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

    int suply_amt_sum = 0;
    int pch_amt1_sum = 0;
    int pch_amt2_sum = 0;


	resData = rx.add(root, "resData", "");
    gridData = rx.add(resData,"gridData","");
    dataSet = rx.add(gridData,"dataSet","");

    try {
		/****** VEXC_COMS_LIST BEGIN */
		recordSet = rx.add(dataSet, "VEXC_COMS_LIST", "");

		for(int i = 0; i < ds.vexc_coms_list.size(); i++) {
			FC_ACCT_2310_LVEXC_COMS_LISTRecord rec = (FC_ACCT_2310_LVEXC_COMS_LISTRecord)ds.vexc_coms_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "vexc_cmpy_cd", rec.vexc_cmpy_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "pch_amt1", rec.pch_amt1);
			rx.add(record, "pch_amt2", rec.pch_amt2);

            suply_amt_sum = suply_amt_sum + Integer.parseInt(rec.suply_amt);
            pch_amt1_sum = pch_amt1_sum + Integer.parseInt(rec.pch_amt1);
            pch_amt2_sum = pch_amt2_sum + Integer.parseInt(rec.pch_amt2);
		}
		rx.add(recordSet, "totalcnt", ds.vexc_coms_list.size());
		rx.add(recordSet, "suply_amt_sum", suply_amt_sum);
		rx.add(recordSet, "pch_amt1_sum", pch_amt1_sum);
		rx.add(recordSet, "pch_amt2_sum", pch_amt2_sum);
		/****** VEXC_COMS_LIST END */

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
	<VEXC_COMS_LIST>
		<record>
			<vexc_cmpy_cd/>
			<dlco_nm/>
			<suply_amt/>
			<pch_amt1/>
			<pch_amt1/>
		</record>
	</VEXC_COMS_LIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Feb 17 19:59:21 KST 2009 */ %>
