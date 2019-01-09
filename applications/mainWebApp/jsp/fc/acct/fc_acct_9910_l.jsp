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
	FC_ACCT_9910_LDataSet ds = (FC_ACCT_9910_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_9910_LCURLISTRecord rec = (FC_ACCT_9910_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_clsf_nm", rec.dlco_clsf_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "patr_chrg_pers", rec.patr_chrg_pers);
			rx.add(record, "titl", rec.titl);
			rx.add(record, "cont", rec.cont);
			rx.add(record, "tag", rec.tag);
			rx.add(record, "team_chf_yn", rec.team_chf_yn);
			rx.add(record, "file_yn", rec.file_yn); 
			rx.add(record, "w_file_yn", rec.w_file_yn);
			rx.add(record, "p_file_yn", rec.p_file_yn);
			rx.add(record, "add_file_no1", rec.add_file_no1);
			rx.add(record, "add_file_nm1", rec.add_file_nm1);
			rx.add(record, "add_file_no2", rec.add_file_no2);
			rx.add(record, "add_file_nm2", rec.add_file_nm2);
			rx.add(record, "add_file_no3", rec.add_file_no3);
			rx.add(record, "add_file_nm3", rec.add_file_nm3);
			rx.add(record, "add_file_no4", rec.add_file_no4);
			rx.add(record, "add_file_nm4", rec.add_file_nm4);
			rx.add(record, "add_file_no5", rec.add_file_no5);
			rx.add(record, "add_file_nm5", rec.add_file_nm5);
			rx.add(record, "add_file_no6", rec.add_file_no6);
			rx.add(record, "add_file_nm6", rec.add_file_nm6);
			rx.add(record, "add_file_no7", rec.add_file_no7);
            rx.add(record, "add_file_nm7", rec.add_file_nm7);
			rx.add(record, "add_file_no8", rec.add_file_no8);
			rx.add(record, "add_file_nm8", rec.add_file_nm8);
			rx.add(record, "add_file_no9", rec.add_file_no9);
			rx.add(record, "add_file_nm9", rec.add_file_nm9);
			rx.add(record, "add_file_no10", rec.add_file_no10);
			rx.add(record, "add_file_nm10", rec.add_file_nm10);
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
<fc_acct_9910_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<dlco_clsf/>
				<dlco_clsf_nm/>
				<chrg_pers/>
				<dlco_no/>
				<dlco_nm/>
				<patr_chrg_pers/>
				<titl/>
				<cont/>
				<tag/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_9910_l>
*/
%>

<% /* 작성시간 : Thu Jun 21 19:16:40 KST 2012 */ %>