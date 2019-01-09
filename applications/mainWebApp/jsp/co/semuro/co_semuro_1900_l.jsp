<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.semuro.rec.*
	,	chosun.ciis.co.semuro.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SEMURO_1900_LDataSet ds = (CO_SEMURO_1900_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_SEMURO_1900_LCURLISTRecord rec = (CO_SEMURO_1900_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "stat_clsf", rec.stat_clsf);
			rx.add(record, "slip_occr_cd", rec.slip_occr_cd);
			rx.add(record, "rmsg_pers_eps_no", rec.rmsg_pers_eps_no);
			rx.add(record, "rmsg_pers_presi_nm", rec.rmsg_pers_presi_nm);
			rx.add(record, "rmsg_pers_nm", rec.rmsg_pers_nm);
			rx.add(record, "rmsg_pers_email", rec.rmsg_pers_email);
			rx.add(record, "tot_suply_amt", rec.tot_suply_amt);
			rx.add(record, "tot_tax_amt", rec.tot_tax_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "semuro_no", rec.semuro_no);
			rx.add(record, "sam_data", "");
			rx.add(record, "tmsg_type", "");
			rx.add(record, "tax_stmt_clsf", "");
			rx.add(record, "rmsg_pers_clsf", "");

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
<tempData>
	<gridData>
		<record>
			<occr_dt/>
			<seq/>
			<slip_occr_dt/>
			<slip_seq/>
			<slip_occr_cd/>
			<rmsg_pers_eps_no/>
			<semuro_no/>
			<rmsg_pers_presi_nm/>
			<rmsg_pers_nm/>
			<rmsg_pers_email/>
			<tot_suply_amt/>
			<tot_tax_amt/>
			<tot_amt/>
		</record>
	</gridData>
</tempData>
*/
%>

<% /* 작성시간 : Sun Mar 15 19:03:07 KST 2009 */ %>