<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_2100_LDataSet ds = (HD_LVCMPY_2100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_LVCMPY_2100_LCURLIST2Record rec = (HD_LVCMPY_2100_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "faml_seq", rec.faml_seq);
			rx.add(record, "faml_rshp_cd", rec.faml_rshp_cd);
			rx.add(record, "faml_rshp_nm", rec.faml_rshp_nm);
			rx.add(record, "faml_flnm", rec.faml_flnm);
			rx.add(record, "faml_prn", rec.faml_prn);
			rx.add(record, "nmat_yn", rec.nmat_yn);
			rx.add(record, "dth_dt", rec.dth_dt);
			rx.add(record, "spos_dduc_yn", rec.spos_dduc_yn);
			rx.add(record, "child_dduc_yn", rec.child_dduc_yn);
			rx.add(record, "oldg_dduc_yn", rec.oldg_dduc_yn);
			rx.add(record, "obcl_pers_dduc_yn", rec.obcl_pers_dduc_yn);
			rx.add(record, "rspc_dduc_yn", rec.rspc_dduc_yn);
			rx.add(record, "fml_hshd_dduc_yn", rec.fml_hshd_dduc_yn);
			rx.add(record, "care_fee_dduc_yn", rec.care_fee_dduc_yn);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_LVCMPY_2100_LCURLIST1Record rec = (HD_LVCMPY_2100_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "zip_1", rec.zip_1);
			rx.add(record, "zip_2", rec.zip_2);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "dtls_addr", rec.dtls_addr);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "fax_no", rec.fax_no);
			rx.add(record, "ptph_no", rec.ptph_no);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST2>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<faml_seq/>
			<faml_rshp_cd/>
			<faml_rshp_nm/>
			<faml_flnm/>
			<faml_prn/>
			<nmat_yn/>
			<dth_dt/>
			<spos_dduc_yn/>
			<child_dduc_yn/>
			<oldg_dduc_yn/>
			<obcl_pers_dduc_yn/>
			<rspc_dduc_yn/>
			<fml_hshd_dduc_yn/>
			<care_fee_dduc_yn/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<dtls_addr/>
			<tel_no/>
			<fax_no/>
			<ptph_no/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 07 16:04:59 KST 2009 */ %>