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
	FC_ACCT_2950_LDataSet ds = (FC_ACCT_2950_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int gridData = 0;
	int dataSet = 0;
	int recordSet = 0;

    String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	resData = rx.add(root, "resData", "");
    gridData = rx.add(resData,"gridData","");
    dataSet = rx.add(gridData,"dataSet","");

	try {
		/****** VEXC_COMS_SLIP_LIST BEGIN */
		recordSet = rx.add(dataSet, "VEXC_COMS_SLIP_LIST", "");

		for(int i = 0; i < ds.vexc_coms_slip_list.size(); i++) {
			FC_ACCT_2950_LVEXC_COMS_SLIP_LISTRecord rec = (FC_ACCT_2950_LVEXC_COMS_SLIP_LISTRecord)ds.vexc_coms_slip_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "pay_dt", rec.pay_dt);
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "vexc_cmpy_cd", rec.vexc_cmpy_cd);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "vexc_cmpy_nm", rec.vexc_cmpy_nm);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
		}
		rx.add(recordSet, "totalcnt", ds.vexc_coms_slip_list.size());
		/****** VEXC_COMS_SLIP_LIST END */

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
	<VEXC_COMS_SLIP_LIST>
		<record>
			<pay_dt/>
			<prof_type_cd/>
			<slip_clsf_cd/>
			<slip_occr_dt/>
			<slip_seq/>
			<vexc_cmpy_cd/>
			<suply_amt/>
			<vat_amt/>
			<acct_no/>
			<vexc_cmpy_nm/>
			<medi_nm/>
			<medi_cd/>
		</record>
	</VEXC_COMS_SLIP_LIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 02 15:34:47 KST 2009 */ %>
