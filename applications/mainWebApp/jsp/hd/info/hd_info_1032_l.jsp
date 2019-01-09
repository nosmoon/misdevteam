<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_1032_LDataSet ds = (HD_INFO_1032_LDataSet)request.getAttribute("ds");
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
			HD_INFO_1032_LCURLISTRecord rec = (HD_INFO_1032_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "faml_seq", rec.faml_seq);
			rx.add(record, "faml_rshp_cd", rec.faml_rshp_cd);
			rx.add(record, "faml_rshp_nm", rec.faml_rshp_nm);
			rx.add(record, "faml_flnm", rec.faml_flnm);
			rx.add(record, "faml_prn", rec.faml_prn);
			rx.add(record, "ocpn_cd", rec.ocpn_cd);
			rx.add(record, "ocpn_nm", rec.ocpn_nm);
			rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			rx.add(record, "posi", rec.posi);
			rx.add(record, "schir_cd", rec.schir_cd);
			rx.add(record, "schir_nm", rec.schir_nm);
			rx.add(record, "nmat_yn", rec.nmat_yn);
			rx.add(record, "dth_dt", rec.dth_dt);
			rx.add(record, "spos_dduc_obj_yn", rec.spos_dduc_obj_yn);
			rx.add(record, "child_dduc_obj_yn", rec.child_dduc_obj_yn);
			rx.add(record, "oldg_dduc_obj_yn", rec.oldg_dduc_obj_yn);
			rx.add(record, "obcl_pers_dduc_obj_yn", rec.obcl_pers_dduc_obj_yn);
			rx.add(record, "rspc_dduc_obj_yn", rec.rspc_dduc_obj_yn);
			rx.add(record, "fml_hshd_dduc_yn", rec.fml_hshd_dduc_yn);
			rx.add(record, "care_fee_dduc_yn", rec.care_fee_dduc_yn);
			rx.add(record, "adopt_dt", rec.adopt_dt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "faml_seq", StringUtil.replaceToXml(rec.faml_seq));
			//rx.add(record, "faml_rshp_cd", StringUtil.replaceToXml(rec.faml_rshp_cd));
			//rx.add(record, "faml_rshp_nm", StringUtil.replaceToXml(rec.faml_rshp_nm));
			//rx.add(record, "faml_flnm", StringUtil.replaceToXml(rec.faml_flnm));
			//rx.add(record, "faml_prn", StringUtil.replaceToXml(rec.faml_prn));
			//rx.add(record, "ocpn_cd", StringUtil.replaceToXml(rec.ocpn_cd));
			//rx.add(record, "ocpn_nm", StringUtil.replaceToXml(rec.ocpn_nm));
			//rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			//rx.add(record, "posi", StringUtil.replaceToXml(rec.posi));
			//rx.add(record, "schir_cd", StringUtil.replaceToXml(rec.schir_cd));
			//rx.add(record, "schir_nm", StringUtil.replaceToXml(rec.schir_nm));
			//rx.add(record, "nmat_yn", StringUtil.replaceToXml(rec.nmat_yn));
			//rx.add(record, "dth_dt", StringUtil.replaceToXml(rec.dth_dt));
			//rx.add(record, "spos_dduc_obj_yn", StringUtil.replaceToXml(rec.spos_dduc_obj_yn));
			//rx.add(record, "child_dduc_obj_yn", StringUtil.replaceToXml(rec.child_dduc_obj_yn));
			//rx.add(record, "oldg_dduc_obj_yn", StringUtil.replaceToXml(rec.oldg_dduc_obj_yn));
			//rx.add(record, "obcl_pers_dduc_obj_yn", StringUtil.replaceToXml(rec.obcl_pers_dduc_obj_yn));
			//rx.add(record, "rspc_dduc_obj_yn", StringUtil.replaceToXml(rec.rspc_dduc_obj_yn));
			//rx.add(record, "fml_hshd_dduc_yn", StringUtil.replaceToXml(rec.fml_hshd_dduc_yn));
			//rx.add(record, "care_fee_dduc_yn", StringUtil.replaceToXml(rec.care_fee_dduc_yn));
			//rx.add(record, "adopt_dt", StringUtil.replaceToXml(rec.adopt_dt));
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
<hd_info_1032_l>
	<dataSet>
		<CURLIST>
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
				<adopt_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_1032_l>
*/
%>

<% /* 작성시간 : Fri Nov 27 16:27:34 KST 2009 */ %>