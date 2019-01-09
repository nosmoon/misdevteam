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
	HD_AFFR_1601_LDataSet ds = (HD_AFFR_1601_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int combo = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "initData", "");
	combo = rx.add(dataSet, "comboSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(combo, "scl_exps_clsf", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_AFFR_1601_LCURLIST2Record rec = (HD_AFFR_1601_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");	
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
		}

		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(combo, "obj_pers_flnm", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_1601_LCURLIST1Record rec = (HD_AFFR_1601_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.faml_prn);
			rx.add(record, "label", rec.faml_flnm);
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
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
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
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 17 15:12:17 KST 2009 */ %>