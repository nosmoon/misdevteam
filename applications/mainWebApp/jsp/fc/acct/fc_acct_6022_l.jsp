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
	FC_ACCT_6022_LDataSet ds = (FC_ACCT_6022_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_6022_LCURLISTRecord rec = (FC_ACCT_6022_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "acct_nm", rec.acct_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "obj_amt", rec.obj_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "ndduc_rate", rec.ndduc_rate);
			rx.add(record, "ndduc_amt", rec.ndduc_amt);
			rx.add(record, "orgy_ndduc_amt", rec.orgy_ndduc_amt);
			rx.add(record, "comn_ndduc_amt", rec.comn_ndduc_amt);
			rx.add(record, "non_dduc_stot", rec.non_dduc_stot);
			rx.add(record, "orgy_dduc_amt", rec.orgy_dduc_amt);
			rx.add(record, "comn_dduc_amt", rec.comn_dduc_amt);
			rx.add(record, "dduc_stot", rec.dduc_stot);
			rx.add(record, "acml_amt1", rec.acml_amt1);
			rx.add(record, "acml_amt2", rec.acml_amt2);
			rx.add(record, "slip_mang_clsf", rec.slip_mang_clsf);
			rx.add(record, "slip_mang_clsf_nm", rec.slip_mang_clsf_nm);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "slip_occr_dt1", rec.slip_occr_dt1);
			rx.add(record, "slip_clsf_cd1", rec.slip_clsf_cd1);
			rx.add(record, "slip_seq1", rec.slip_seq1);
			rx.add(record, "slip_sub_seq1", rec.slip_sub_seq1);
			rx.add(record, "slip_arow_no1", rec.slip_arow_no1);
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
<dataSet>
	<CURLIST>
		<record>
			<acct_cd/>
			<acct_nm/>
			<budg_cd/>
			<clam_dept_cd/>
			<use_dept_cd/>
			<medi_cd/>
			<obj_amt/>
			<vat_amt/>
			<ndduc_rate/>
			<ndduc_amt/>
			<orgy_ndduc_amt/>
			<comn_ndduc_amt/>
			<non_dduc_stot/>
			<orgy_dduc_amt/>
			<comn_dduc_amt/>
			<dduc_stot/>
			<acml_amt1/>
			<acml_amt2/>
			<slip_mang_clsf/>
			<slip_mang_clsf_nm/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_sub_seq/>
			<slip_arow_no/>
			<slip_occr_dt1/>
			<slip_clsf_cd1/>
			<slip_seq1/>
			<slip_sub_seq1/>
			<slip_arow_no1/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 06 09:44:30 KST 2009 */ %>