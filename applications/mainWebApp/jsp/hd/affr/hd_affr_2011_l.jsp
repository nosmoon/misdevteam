<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_2011_LDataSet ds = (HD_AFFR_2011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	recordSet = rx.add(dataSet, "child_flnm", "");
	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_2011_LCURLIST1Record rec = (HD_AFFR_2011_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.child_flnm);
			rx.add(record, "label", rec.child_flnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_2011_LCURLIST1Record rec = (HD_AFFR_2011_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "child_flnm", rec.child_flnm);
			rx.add(record, "child_seqo", rec.child_seqo);
			rx.add(record, "child_bidt", rec.child_bidt);
			rx.add(record, "sply_strt_yymm", rec.sply_strt_yymm);
			rx.add(record, "last_sply_yymm", rec.last_sply_yymm);
			rx.add(record, "acml_sply_tms", rec.acml_sply_tms);
			rx.add(record, "sply_amt", rec.sply_amt);
			rx.add(record, "ch_occr_dt", rec.ch_occr_dt);
			rx.add(record, "ch_seq", rec.ch_seq);	
		}		
		
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_2011_LCURLISTRecord rec = (HD_AFFR_2011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "pay_plac_clsf", rec.pay_plac_clsf);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "totalcnt", ds.curlist.size());			
		}
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
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<faml_seq/>
			<faml_rshp_cd/>
			<faml_rshp_nm/>
			<faml_flnm/>
			<faml_prn/>
			<ocpn_cd/>
			<ocpn_nm/>
			<offi_nm/>
			<posi/>
			<schir_cd/>
			<schir_nm/>
			<nmat_yn/>
			<dth_dt/>
			<spos_dduc_obj_yn/>
			<child_dduc_obj_yn/>
			<oldg_dduc_obj_yn/>
			<obcl_pers_dduc_obj_yn/>
			<rspc_dduc_obj_yn/>
			<fml_hshd_dduc_yn/>
			<care_fee_dduc_yn/>
			<flnm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<emp_no/>
			<flnm/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 23 10:17:22 KST 2009 */ %>