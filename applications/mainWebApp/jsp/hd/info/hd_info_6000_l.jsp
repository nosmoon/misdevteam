<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*
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
	HD_INFO_6000_LDataSet ds = (HD_INFO_6000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST5 BEGIN */ 
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_INFO_6000_LCURLIST5Record rec = (HD_INFO_6000_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "zip_1_01", rec.zip_1_01);
			rx.add(record, "zip_2_01", rec.zip_2_01);
			rx.add(record, "addr_01", rec.addr_01);
			rx.addCData(record, "dtls_addr_01", rec.dtls_addr_01);
			rx.add(record, "tel_no_01", rec.tel_no_01);
			rx.add(record, "fax_no_01", rec.fax_no_01);
			rx.add(record, "ptph_no_01", rec.ptph_no_01);
			rx.addCData(record, "email_id_01", rec.email_id_01);
			rx.add(record, "forn_zip_01", rec.forn_zip_01);
			rx.addCData(record, "forn_addr_01", rec.forn_addr_01);
			rx.add(record, "zip_1_02", rec.zip_1_02);
			rx.add(record, "zip_2_02", rec.zip_2_02);
			rx.addCData(record, "addr_02", rec.addr_02);
			rx.addCData(record, "dtls_addr_02", rec.dtls_addr_02);
			rx.add(record, "tel_no_02", rec.tel_no_02);
			rx.add(record, "fax_no_02", rec.fax_no_02);
			rx.add(record, "ptph_no_02", rec.ptph_no_02);
			rx.addCData(record, "email_id_02", rec.email_id_02);
			rx.add(record, "forn_zip_02", rec.forn_zip_02);
			rx.addCData(record, "forn_addr_02", rec.forn_addr_02);
			rx.add(record, "zip_1_03", rec.zip_1_03);
			rx.add(record, "zip_2_03", rec.zip_2_03);
			rx.addCData(record, "addr_03", rec.addr_03);
			rx.addCData(record, "dtls_addr_03", rec.dtls_addr_03);
			rx.add(record, "tel_no_03", rec.tel_no_03);
			rx.add(record, "fax_no_03", rec.fax_no_03);
			rx.add(record, "ptph_no_03", rec.ptph_no_03);
			rx.addCData(record, "email_id_03", rec.email_id_03);
			rx.add(record, "forn_zip_03", rec.forn_zip_03);
			rx.add(record, "forn_addr_03", rec.forn_addr_03);
			rx.add(record, "zip_1_04", rec.zip_1_04);
			rx.add(record, "zip_2_04", rec.zip_2_04);
			rx.addCData(record, "addr_04", rec.addr_04);
			rx.addCData(record, "dtls_addr_04", rec.dtls_addr_04);
			rx.add(record, "tel_no_04", rec.tel_no_04);
			rx.add(record, "fax_no_04", rec.fax_no_04);
			rx.add(record, "ptph_no_04", rec.ptph_no_04);
			rx.addCData(record, "email_id_04", rec.email_id_04);
			rx.addCData(record, "forn_zip_04", rec.forn_zip_04);
			rx.addCData(record, "forn_addr_04", rec.forn_addr_04);
			rx.add(record, "tel_no_05", rec.tel_no_05);
			rx.add(record, "cntc_rshp", rec.cntc_rshp);
			//rx.add(record, "zip_1_01", StringUtil.replaceToXml(rec.zip_1_01));
			//rx.add(record, "zip_2_01", StringUtil.replaceToXml(rec.zip_2_01));
			//rx.add(record, "addr_01", StringUtil.replaceToXml(rec.addr_01));
			//rx.add(record, "dtls_addr_01", StringUtil.replaceToXml(rec.dtls_addr_01));
			//rx.add(record, "tel_no_01", StringUtil.replaceToXml(rec.tel_no_01));
			//rx.add(record, "fax_no_01", StringUtil.replaceToXml(rec.fax_no_01));
			//rx.add(record, "ptph_no_01", StringUtil.replaceToXml(rec.ptph_no_01));
			//rx.add(record, "email_id_01", StringUtil.replaceToXml(rec.email_id_01));
			//rx.add(record, "forn_zip_01", StringUtil.replaceToXml(rec.forn_zip_01));
			//rx.add(record, "forn_addr_01", StringUtil.replaceToXml(rec.forn_addr_01));
			//rx.add(record, "zip_1_02", StringUtil.replaceToXml(rec.zip_1_02));
			//rx.add(record, "zip_2_02", StringUtil.replaceToXml(rec.zip_2_02));
			//rx.add(record, "addr_02", StringUtil.replaceToXml(rec.addr_02));
			//rx.add(record, "dtls_addr_02", StringUtil.replaceToXml(rec.dtls_addr_02));
			//rx.add(record, "tel_no_02", StringUtil.replaceToXml(rec.tel_no_02));
			//rx.add(record, "fax_no_02", StringUtil.replaceToXml(rec.fax_no_02));
			//rx.add(record, "ptph_no_02", StringUtil.replaceToXml(rec.ptph_no_02));
			//rx.add(record, "email_id_02", StringUtil.replaceToXml(rec.email_id_02));
			//rx.add(record, "forn_zip_02", StringUtil.replaceToXml(rec.forn_zip_02));
			//rx.add(record, "forn_addr_02", StringUtil.replaceToXml(rec.forn_addr_02));
			//rx.add(record, "zip_1_03", StringUtil.replaceToXml(rec.zip_1_03));
			//rx.add(record, "zip_2_03", StringUtil.replaceToXml(rec.zip_2_03));
			//rx.add(record, "addr_03", StringUtil.replaceToXml(rec.addr_03));
			//rx.add(record, "dtls_addr_03", StringUtil.replaceToXml(rec.dtls_addr_03));
			//rx.add(record, "tel_no_03", StringUtil.replaceToXml(rec.tel_no_03));
			//rx.add(record, "fax_no_03", StringUtil.replaceToXml(rec.fax_no_03));
			//rx.add(record, "ptph_no_03", StringUtil.replaceToXml(rec.ptph_no_03));
			//rx.add(record, "email_id_03", StringUtil.replaceToXml(rec.email_id_03));
			//rx.add(record, "forn_zip_03", StringUtil.replaceToXml(rec.forn_zip_03));
			//rx.add(record, "forn_addr_03", StringUtil.replaceToXml(rec.forn_addr_03));
			//rx.add(record, "zip_1_04", StringUtil.replaceToXml(rec.zip_1_04));
			//rx.add(record, "zip_2_04", StringUtil.replaceToXml(rec.zip_2_04));
			//rx.add(record, "addr_04", StringUtil.replaceToXml(rec.addr_04));
			//rx.add(record, "dtls_addr_04", StringUtil.replaceToXml(rec.dtls_addr_04));
			//rx.add(record, "tel_no_04", StringUtil.replaceToXml(rec.tel_no_04));
			//rx.add(record, "fax_no_04", StringUtil.replaceToXml(rec.fax_no_04));
			//rx.add(record, "ptph_no_04", StringUtil.replaceToXml(rec.ptph_no_04));
			//rx.add(record, "email_id_04", StringUtil.replaceToXml(rec.email_id_04));
			//rx.add(record, "forn_zip_04", StringUtil.replaceToXml(rec.forn_zip_04));
			//rx.add(record, "forn_addr_04", StringUtil.replaceToXml(rec.forn_addr_04));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_INFO_6000_LCURLIST4Record rec = (HD_INFO_6000_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "army_clsf_cd", rec.army_clsf_cd);
			rx.add(record, "army_clsf_cd_nm", rec.army_clsf_cd_nm);
			rx.add(record, "forc_clsi_cd", rec.forc_clsi_cd);
			rx.add(record, "forc_clsi_cd_nm", rec.forc_clsi_cd_nm);
			rx.add(record, "army_svc_cd", rec.army_svc_cd);
			rx.add(record, "army_svc_cd_nm", rec.army_svc_cd_nm);
			rx.add(record, "cls_cd", rec.cls_cd);
			rx.add(record, "cls_cd_nm", rec.cls_cd_nm);
			rx.add(record, "forc_no", rec.forc_no);
			rx.add(record, "cmmd_army_part_cd", rec.cmmd_army_part_cd);
			rx.add(record, "cmmd_army_part_cd_nm", rec.cmmd_army_part_cd_nm);
			rx.add(record, "sold_main_spc_cd", rec.sold_main_spc_cd);
			rx.add(record, "sold_main_spc_cd_nm", rec.sold_main_spc_cd_nm);
			rx.add(record, "in_army_dt", rec.in_army_dt);
			rx.add(record, "out_army_dt", rec.out_army_dt);
			rx.add(record, "out_army_clsf_cd", rec.out_army_clsf_cd);
			rx.add(record, "out_army_clsf_cd_nm", rec.out_army_clsf_cd_nm);
			rx.add(record, "army_un_finsh_resn_cd", rec.army_un_finsh_resn_cd);
			rx.add(record, "army_un_finsh_resn_cd_nm", rec.army_un_finsh_resn_cd_nm);
			rx.add(record, "rsv_forc_form_cd", rec.rsv_forc_form_cd);
			rx.add(record, "rsv_forc_form_cd_nm", rec.rsv_forc_form_cd_nm);
			rx.add(record, "rsv_forc_form_dt", rec.rsv_forc_form_dt);
			rx.add(record, "crps_spc_cd", rec.crps_spc_cd);
			//rx.add(record, "army_clsf_cd", StringUtil.replaceToXml(rec.army_clsf_cd));
			//rx.add(record, "army_clsf_cd_nm", StringUtil.replaceToXml(rec.army_clsf_cd_nm));
			//rx.add(record, "forc_clsi_cd", StringUtil.replaceToXml(rec.forc_clsi_cd));
			//rx.add(record, "forc_clsi_cd_nm", StringUtil.replaceToXml(rec.forc_clsi_cd_nm));
			//rx.add(record, "army_svc_cd", StringUtil.replaceToXml(rec.army_svc_cd));
			//rx.add(record, "army_svc_cd_nm", StringUtil.replaceToXml(rec.army_svc_cd_nm));
			//rx.add(record, "cls_cd", StringUtil.replaceToXml(rec.cls_cd));
			//rx.add(record, "cls_cd_nm", StringUtil.replaceToXml(rec.cls_cd_nm));
			//rx.add(record, "forc_no", StringUtil.replaceToXml(rec.forc_no));
			//rx.add(record, "cmmd_army_part_cd", StringUtil.replaceToXml(rec.cmmd_army_part_cd));
			//rx.add(record, "cmmd_army_part_cd_nm", StringUtil.replaceToXml(rec.cmmd_army_part_cd_nm));
			//rx.add(record, "sold_main_spc_cd", StringUtil.replaceToXml(rec.sold_main_spc_cd));
			//rx.add(record, "sold_main_spc_cd_nm", StringUtil.replaceToXml(rec.sold_main_spc_cd_nm));
			//rx.add(record, "in_army_dt", StringUtil.replaceToXml(rec.in_army_dt));
			//rx.add(record, "out_army_dt", StringUtil.replaceToXml(rec.out_army_dt));
			//rx.add(record, "out_army_clsf_cd", StringUtil.replaceToXml(rec.out_army_clsf_cd));
			//rx.add(record, "out_army_clsf_cd_nm", StringUtil.replaceToXml(rec.out_army_clsf_cd_nm));
			//rx.add(record, "army_un_finsh_resn_cd", StringUtil.replaceToXml(rec.army_un_finsh_resn_cd));
			//rx.add(record, "army_un_finsh_resn_cd_nm", StringUtil.replaceToXml(rec.army_un_finsh_resn_cd_nm));
			//rx.add(record, "rsv_forc_form_cd", StringUtil.replaceToXml(rec.rsv_forc_form_cd));
			//rx.add(record, "rsv_forc_form_cd_nm", StringUtil.replaceToXml(rec.rsv_forc_form_cd_nm));
			//rx.add(record, "rsv_forc_form_dt", StringUtil.replaceToXml(rec.rsv_forc_form_dt));
			//rx.add(record, "crps_spc_cd", StringUtil.replaceToXml(rec.crps_spc_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_INFO_6000_LCURLIST3Record rec = (HD_INFO_6000_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "faml_rshp_cd", rec.faml_rshp_cd);
			rx.add(record, "faml_rshp_nm", rec.faml_rshp_nm);
			rx.add(record, "faml_flnm", rec.faml_flnm);
			rx.add(record, "faml_prn", rec.faml_prn);
			rx.add(record, "ocpn_cd", rec.ocpn_cd);
			rx.addCData(record, "ocpn_nm", rec.ocpn_nm);
			rx.addCData(record, "offi_nm", rec.offi_nm);
			rx.add(record, "posi", rec.posi);
			rx.add(record, "schir_cd", rec.schir_cd);
			rx.addCData(record, "schir_nm", rec.schir_nm);
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
			rx.add(record, "faml_seq", rec.faml_seq);
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
			//rx.add(record, "faml_seq", StringUtil.replaceToXml(rec.faml_seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_INFO_6000_LCURLIST2Record rec = (HD_INFO_6000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "schir_seq", rec.schir_seq);
			rx.add(record, "scl_clsf", rec.scl_clsf);
			rx.add(record, "scl_clsf_nm", rec.scl_clsf_nm);
			rx.add(record, "scl_cd", rec.scl_cd);
			rx.addCData(record, "scl_nm", rec.scl_nm);
			rx.add(record, "enty_dt", rec.enty_dt);
			rx.add(record, "grdu_dt", rec.grdu_dt);
			rx.add(record, "grdu_clsf", rec.grdu_clsf);
			rx.addCData(record, "grdu_clsf_nm", rec.grdu_clsf_nm);
			rx.add(record, "schir_cd", rec.schir_cd);
			rx.addCData(record, "schir_nm", rec.schir_nm);
			rx.add(record, "majr_clsf_1", rec.majr_clsf_1);
			rx.addCData(record, "majr_clsf_nm_1", rec.majr_clsf_nm_1);
			rx.add(record, "majr_cd_1", rec.majr_cd_1);
			rx.addCData(record, "majr_nm_1", rec.majr_nm_1);
			rx.add(record, "majr_clsf_2", rec.majr_clsf_2);
			rx.addCData(record, "majr_clsf_nm_2", rec.majr_clsf_nm_2);
			rx.add(record, "majr_cd_2", rec.majr_cd_2);
			rx.addCData(record, "majr_nm_2", rec.majr_nm_2);
			rx.add(record, "majr_clsf_3", rec.majr_clsf_3);
			rx.addCData(record, "majr_clsf_nm_3", rec.majr_clsf_nm_3);
			rx.add(record, "majr_cd_3", rec.majr_cd_3);
			rx.addCData(record, "majr_nm_3", rec.majr_nm_3);
			rx.add(record, "sclgg_kind_cd", rec.sclgg_kind_cd);
			rx.addCData(record, "sclgg_kind_nm", rec.sclgg_kind_nm);
			rx.add(record, "plcw_cd", rec.plcw_cd);
			rx.add(record, "plcw_nm", rec.plcw_nm);
			rx.add(record, "natn_cd", rec.natn_cd);
			rx.add(record, "natn_nm", rec.natn_nm);
			//rx.add(record, "schir_seq", StringUtil.replaceToXml(rec.schir_seq));
			//rx.add(record, "scl_clsf", StringUtil.replaceToXml(rec.scl_clsf));
			//rx.add(record, "scl_clsf_nm", StringUtil.replaceToXml(rec.scl_clsf_nm));
			//rx.add(record, "scl_cd", StringUtil.replaceToXml(rec.scl_cd));
			//rx.add(record, "scl_nm", StringUtil.replaceToXml(rec.scl_nm));
			//rx.add(record, "enty_dt", StringUtil.replaceToXml(rec.enty_dt));
			//rx.add(record, "grdu_dt", StringUtil.replaceToXml(rec.grdu_dt));
			//rx.add(record, "grdu_clsf", StringUtil.replaceToXml(rec.grdu_clsf));
			//rx.add(record, "grdu_clsf_nm", StringUtil.replaceToXml(rec.grdu_clsf_nm));
			//rx.add(record, "schir_cd", StringUtil.replaceToXml(rec.schir_cd));
			//rx.add(record, "schir_nm", StringUtil.replaceToXml(rec.schir_nm));
			//rx.add(record, "majr_clsf_1", StringUtil.replaceToXml(rec.majr_clsf_1));
			//rx.add(record, "majr_clsf_nm_1", StringUtil.replaceToXml(rec.majr_clsf_nm_1));
			//rx.add(record, "majr_cd_1", StringUtil.replaceToXml(rec.majr_cd_1));
			//rx.add(record, "majr_nm_1", StringUtil.replaceToXml(rec.majr_nm_1));
			//rx.add(record, "majr_clsf_2", StringUtil.replaceToXml(rec.majr_clsf_2));
			//rx.add(record, "majr_clsf_nm_2", StringUtil.replaceToXml(rec.majr_clsf_nm_2));
			//rx.add(record, "majr_cd_2", StringUtil.replaceToXml(rec.majr_cd_2));
			//rx.add(record, "majr_nm_2", StringUtil.replaceToXml(rec.majr_nm_2));
			//rx.add(record, "majr_clsf_3", StringUtil.replaceToXml(rec.majr_clsf_3));
			//rx.add(record, "majr_clsf_nm_3", StringUtil.replaceToXml(rec.majr_clsf_nm_3));
			//rx.add(record, "majr_cd_3", StringUtil.replaceToXml(rec.majr_cd_3));
			//rx.add(record, "majr_nm_3", StringUtil.replaceToXml(rec.majr_nm_3));
			//rx.add(record, "sclgg_kind_cd", StringUtil.replaceToXml(rec.sclgg_kind_cd));
			//rx.add(record, "sclgg_kind_nm", StringUtil.replaceToXml(rec.sclgg_kind_nm));
			//rx.add(record, "plcw_cd", StringUtil.replaceToXml(rec.plcw_cd));
			//rx.add(record, "plcw_nm", StringUtil.replaceToXml(rec.plcw_nm));
			//rx.add(record, "natn_cd", StringUtil.replaceToXml(rec.natn_cd));
			//rx.add(record, "natn_nm", StringUtil.replaceToXml(rec.natn_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INFO_6000_LCURLIST1Record rec = (HD_INFO_6000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "duty_area_cd", rec.duty_area_cd);
			rx.add(record, "duty_area_nm", rec.duty_area_nm);
			rx.add(record, "dtplc_cd", rec.dtplc_cd);
			rx.add(record, "dtplc_nm", rec.dtplc_nm);
			rx.add(record, "in_cmpy_posk_cd", rec.in_cmpy_posk_cd);
			rx.add(record, "in_cmpy_posk_nm", rec.in_cmpy_posk_nm);
			rx.add(record, "cur_jobnon_cd", rec.cur_jobnon_cd);
			rx.addCData(record, "cur_jobnon_nm", rec.cur_jobnon_nm);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "lvcmpy_resn_cd", rec.lvcmpy_resn_cd);
			rx.add(record, "lvcmpy_resn_nm", rec.lvcmpy_resn_nm);
			rx.add(record, "last_midl_adjm_dt", rec.last_midl_adjm_dt);
			rx.add(record, "midl_adjm_tms", rec.midl_adjm_tms);
			rx.add(record, "last_upgrd_dt", rec.last_upgrd_dt);
			rx.add(record, "last_saly_chg_appmt_dt", rec.last_saly_chg_appmt_dt);
			rx.add(record, "last_appmt_dt", rec.last_appmt_dt);
			rx.add(record, "last_appmt_cd", rec.last_appmt_cd);
			rx.add(record, "last_appmt_nm", rec.last_appmt_nm);
			rx.add(record, "last_appmt_cont", rec.last_appmt_cont);
			rx.add(record, "last_temp_dt", rec.last_temp_dt);
			rx.add(record, "last_reinst_dt", rec.last_reinst_dt);
			rx.add(record, "last_temp_clsf", rec.last_temp_clsf);
			rx.add(record, "last_temp_clsf_nm", rec.last_temp_clsf_nm);
			rx.add(record, "last_stdy_dt", rec.last_stdy_dt);
			rx.add(record, "last_stdy_reinst_dt", rec.last_stdy_reinst_dt);
			rx.add(record, "in_cmpy_clsf", rec.in_cmpy_clsf);
			rx.add(record, "in_cmpy_clsf_nm", rec.in_cmpy_clsf_nm);
			rx.add(record, "open_invit_clsf", rec.open_invit_clsf);
			rx.add(record, "open_invit_clsf_nm", rec.open_invit_clsf_nm);
			rx.add(record, "open_invit_desty", rec.open_invit_desty);
			rx.add(record, "relg_cd", rec.relg_cd);
			rx.add(record, "relg_nm", rec.relg_nm);
			rx.add(record, "in_cmpy_resn_cd", rec.in_cmpy_resn_cd);
			rx.add(record, "in_cmpy_resn_nm", rec.in_cmpy_resn_nm);
			rx.add(record, "recom_pers_rshp_cd", rec.recom_pers_rshp_cd);
			rx.add(record, "recom_pers_rshp_nm", rec.recom_pers_rshp_nm);
			rx.add(record, "recom_pers_flnm", rec.recom_pers_flnm);
			rx.add(record, "blod_cd", rec.blod_cd);
			rx.add(record, "blod_nm", rec.blod_nm);
			rx.add(record, "nativ_cd", rec.nativ_cd);
			rx.add(record, "nativ_cd_nm", rec.nativ_cd_nm);
			rx.add(record, "nativ_dtls_area", rec.nativ_dtls_area);
			rx.add(record, "spc_1", rec.spc_1);
			rx.add(record, "spc_2", rec.spc_2);
			rx.add(record, "hby_1", rec.hby_1);
			rx.add(record, "hby_2", rec.hby_2);
			rx.add(record, "saly_shft_bank_cd", rec.saly_shft_bank_cd);
			rx.add(record, "saly_shft_bank_nm", rec.saly_shft_bank_nm);
			rx.add(record, "saly_shft_acct_no", rec.saly_shft_acct_no);
			rx.add(record, "alon_shft_bank_cd", rec.alon_shft_bank_cd);
			rx.add(record, "alon_shft_bank_nm", rec.alon_shft_bank_nm);
			rx.add(record, "alon_shft_acct_no", rec.alon_shft_acct_no);
			rx.add(record, "encrg_amt_shft_bank_cd", rec.encrg_amt_shft_bank_cd);
			rx.add(record, "encrg_amt_shft_bank_nm", rec.encrg_amt_shft_bank_nm);
			rx.add(record, "encrg_amt_shft_acct_no", rec.encrg_amt_shft_acct_no);
			rx.add(record, "etc_shft_bank_cd", rec.etc_shft_bank_cd);
			rx.add(record, "etc_shft_bank_nm", rec.etc_shft_bank_nm);
			rx.add(record, "etc_shft_acct_no", rec.etc_shft_acct_no);
			rx.add(record, "etc_shft_chqe_pay_yn", rec.etc_shft_chqe_pay_yn);
			rx.add(record, "entr_dt", rec.entr_dt);
			rx.add(record, "lve_dt", rec.lve_dt);
			rx.add(record, "aprv_in_cmpy", rec.aprv_in_cmpy);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "duty_area_cd", StringUtil.replaceToXml(rec.duty_area_cd));
			//rx.add(record, "duty_area_nm", StringUtil.replaceToXml(rec.duty_area_nm));
			//rx.add(record, "dtplc_cd", StringUtil.replaceToXml(rec.dtplc_cd));
			//rx.add(record, "dtplc_nm", StringUtil.replaceToXml(rec.dtplc_nm));
			//rx.add(record, "in_cmpy_posk_cd", StringUtil.replaceToXml(rec.in_cmpy_posk_cd));
			//rx.add(record, "in_cmpy_posk_nm", StringUtil.replaceToXml(rec.in_cmpy_posk_nm));
			//rx.add(record, "cur_jobnon_cd", StringUtil.replaceToXml(rec.cur_jobnon_cd));
			//rx.add(record, "cur_jobnon_nm", StringUtil.replaceToXml(rec.cur_jobnon_nm));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			//rx.add(record, "lvcmpy_resn_cd", StringUtil.replaceToXml(rec.lvcmpy_resn_cd));
			//rx.add(record, "lvcmpy_resn_nm", StringUtil.replaceToXml(rec.lvcmpy_resn_nm));
			//rx.add(record, "last_midl_adjm_dt", StringUtil.replaceToXml(rec.last_midl_adjm_dt));
			//rx.add(record, "midl_adjm_tms", StringUtil.replaceToXml(rec.midl_adjm_tms));
			//rx.add(record, "last_upgrd_dt", StringUtil.replaceToXml(rec.last_upgrd_dt));
			//rx.add(record, "last_saly_chg_appmt_dt", StringUtil.replaceToXml(rec.last_saly_chg_appmt_dt));
			//rx.add(record, "last_appmt_dt", StringUtil.replaceToXml(rec.last_appmt_dt));
			//rx.add(record, "last_appmt_cd", StringUtil.replaceToXml(rec.last_appmt_cd));
			//rx.add(record, "last_appmt_nm", StringUtil.replaceToXml(rec.last_appmt_nm));
			//rx.add(record, "last_appmt_cont", StringUtil.replaceToXml(rec.last_appmt_cont));
			//rx.add(record, "last_temp_dt", StringUtil.replaceToXml(rec.last_temp_dt));
			//rx.add(record, "last_reinst_dt", StringUtil.replaceToXml(rec.last_reinst_dt));
			//rx.add(record, "last_temp_clsf", StringUtil.replaceToXml(rec.last_temp_clsf));
			//rx.add(record, "last_temp_clsf_nm", StringUtil.replaceToXml(rec.last_temp_clsf_nm));
			//rx.add(record, "last_stdy_dt", StringUtil.replaceToXml(rec.last_stdy_dt));
			//rx.add(record, "last_stdy_reinst_dt", StringUtil.replaceToXml(rec.last_stdy_reinst_dt));
			//rx.add(record, "in_cmpy_clsf", StringUtil.replaceToXml(rec.in_cmpy_clsf));
			//rx.add(record, "in_cmpy_clsf_nm", StringUtil.replaceToXml(rec.in_cmpy_clsf_nm));
			//rx.add(record, "open_invit_clsf", StringUtil.replaceToXml(rec.open_invit_clsf));
			//rx.add(record, "open_invit_clsf_nm", StringUtil.replaceToXml(rec.open_invit_clsf_nm));
			//rx.add(record, "open_invit_desty", StringUtil.replaceToXml(rec.open_invit_desty));
			//rx.add(record, "relg_cd", StringUtil.replaceToXml(rec.relg_cd));
			//rx.add(record, "relg_nm", StringUtil.replaceToXml(rec.relg_nm));
			//rx.add(record, "in_cmpy_resn_cd", StringUtil.replaceToXml(rec.in_cmpy_resn_cd));
			//rx.add(record, "in_cmpy_resn_nm", StringUtil.replaceToXml(rec.in_cmpy_resn_nm));
			//rx.add(record, "recom_pers_rshp_cd", StringUtil.replaceToXml(rec.recom_pers_rshp_cd));
			//rx.add(record, "recom_pers_rshp_nm", StringUtil.replaceToXml(rec.recom_pers_rshp_nm));
			//rx.add(record, "recom_pers_flnm", StringUtil.replaceToXml(rec.recom_pers_flnm));
			//rx.add(record, "blod_cd", StringUtil.replaceToXml(rec.blod_cd));
			//rx.add(record, "blod_nm", StringUtil.replaceToXml(rec.blod_nm));
			//rx.add(record, "nativ_cd", StringUtil.replaceToXml(rec.nativ_cd));
			//rx.add(record, "nativ_cd_nm", StringUtil.replaceToXml(rec.nativ_cd_nm));
			//rx.add(record, "nativ_dtls_area", StringUtil.replaceToXml(rec.nativ_dtls_area));
			//rx.add(record, "spc_1", StringUtil.replaceToXml(rec.spc_1));
			//rx.add(record, "spc_2", StringUtil.replaceToXml(rec.spc_2));
			//rx.add(record, "hby_1", StringUtil.replaceToXml(rec.hby_1));
			//rx.add(record, "hby_2", StringUtil.replaceToXml(rec.hby_2));
			//rx.add(record, "saly_shft_bank_cd", StringUtil.replaceToXml(rec.saly_shft_bank_cd));
			//rx.add(record, "saly_shft_bank_nm", StringUtil.replaceToXml(rec.saly_shft_bank_nm));
			//rx.add(record, "saly_shft_acct_no", StringUtil.replaceToXml(rec.saly_shft_acct_no));
			//rx.add(record, "alon_shft_bank_cd", StringUtil.replaceToXml(rec.alon_shft_bank_cd));
			//rx.add(record, "alon_shft_bank_nm", StringUtil.replaceToXml(rec.alon_shft_bank_nm));
			//rx.add(record, "alon_shft_acct_no", StringUtil.replaceToXml(rec.alon_shft_acct_no));
			//rx.add(record, "encrg_amt_shft_bank_cd", StringUtil.replaceToXml(rec.encrg_amt_shft_bank_cd));
			//rx.add(record, "encrg_amt_shft_bank_nm", StringUtil.replaceToXml(rec.encrg_amt_shft_bank_nm));
			//rx.add(record, "encrg_amt_shft_acct_no", StringUtil.replaceToXml(rec.encrg_amt_shft_acct_no));
			//rx.add(record, "entr_dt", StringUtil.replaceToXml(rec.entr_dt));
			//rx.add(record, "lve_dt", StringUtil.replaceToXml(rec.lve_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST15 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST15", "");
		System.out.println("curlist15");
		for(int i = 0; i < ds.curlist15.size(); i++) {
			HD_INFO_6000_LCURLIST15Record rec = (HD_INFO_6000_LCURLIST15Record)ds.curlist15.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.addCData(record, "cur_jobnon_nm", rec.cur_jobnon_nm);
			rx.addCData(record, "chrg_job", rec.chrg_job);
			rx.addCData(record, "dtls_job", rec.dtls_job);
			rx.add(record, "aprv_stat_yn", rec.aprv_stat_yn);
			//rx.add(record, "frdt", StringUtil.replaceToXml(rec.frdt));
			//rx.add(record, "todt", StringUtil.replaceToXml(rec.todt));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			//rx.add(record, "cur_jobnon_nm", StringUtil.replaceToXml(rec.cur_jobnon_nm));
			//rx.add(record, "chrg_job", StringUtil.replaceToXml(rec.chrg_job));
			//rx.add(record, "dtls_job", StringUtil.replaceToXml(rec.dtls_job));
			//rx.add(record, "aprv_stat_yn", StringUtil.replaceToXml(rec.aprv_stat_yn));
		}
		rx.add(recordSet, "totalcnt", ds.curlist15.size());
		/****** CURLIST15 END */

		/****** CURLIST14 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST14", "");

		for(int i = 0; i < ds.curlist14.size(); i++) {
			HD_INFO_6000_LCURLIST14Record rec = (HD_INFO_6000_LCURLIST14Record)ds.curlist14.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "prz_dt", rec.prz_dt);
			rx.addCData(record, "prz_nm", rec.prz_nm);
			rx.addCData(record, "prz_resn", rec.prz_resn);
			rx.add(record, "prz_amt", rec.prz_amt);
			rx.add(record, "prz_ptcr", rec.prz_ptcr);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "prz_dt", StringUtil.replaceToXml(rec.prz_dt));
			//rx.add(record, "prz_nm", StringUtil.replaceToXml(rec.prz_nm));
			//rx.add(record, "prz_resn", StringUtil.replaceToXml(rec.prz_resn));
			//rx.add(record, "prz_amt", StringUtil.replaceToXml(rec.prz_amt));
			//rx.add(record, "prz_ptcr", StringUtil.replaceToXml(rec.prz_ptcr));
		}
		rx.add(recordSet, "totalcnt", ds.curlist14.size());
		/****** CURLIST14 END */

		/****** CURLIST13 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST13", "");
		System.out.println("curlist13");
		for(int i = 0; i < ds.curlist13.size(); i++) {
			HD_INFO_6000_LCURLIST13Record rec = (HD_INFO_6000_LCURLIST13Record)ds.curlist13.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "main_insp_ocom", rec.main_insp_ocom);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "main_insp_dt", rec.main_insp_dt);
			rx.addCData(record, "prz_pnsh_nm", rec.prz_pnsh_nm);
			rx.add(record, "prz_grad", rec.prz_grad);
			rx.addCData(record, "prz_resn_nm", rec.prz_resn_nm);
			rx.addCData(record, "case_nm", rec.case_nm);
			rx.add(record, "atic_pubc_dt", rec.atic_pubc_dt);
			rx.add(record, "atic_pubc_side", rec.atic_pubc_side);
			rx.add(record, "prz_amt", rec.prz_amt);
			//rx.add(record, "main_insp_ocom", StringUtil.replaceToXml(rec.main_insp_ocom));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "main_insp_dt", StringUtil.replaceToXml(rec.main_insp_dt));
			//rx.add(record, "prz_pnsh_nm", StringUtil.replaceToXml(rec.prz_pnsh_nm));
			//rx.add(record, "prz_grad", StringUtil.replaceToXml(rec.prz_grad));
			//rx.add(record, "prz_resn_nm", StringUtil.replaceToXml(rec.prz_resn_nm));
			//rx.add(record, "case_nm", StringUtil.replaceToXml(rec.case_nm));
			//rx.add(record, "atic_pubc_dt", StringUtil.replaceToXml(rec.atic_pubc_dt));
			//rx.add(record, "atic_pubc_side", StringUtil.replaceToXml(rec.atic_pubc_side));
			//rx.add(record, "prz_amt", StringUtil.replaceToXml(rec.prz_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist13.size());
		/****** CURLIST13 END */

		/****** CURLIST12 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST12", "");

		for(int i = 0; i < ds.curlist12.size(); i++) {
			HD_INFO_6000_LCURLIST12Record rec = (HD_INFO_6000_LCURLIST12Record)ds.curlist12.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "appmt_nm", rec.appmt_nm);
			rx.add(record, "appmt_resn_nm", rec.appmt_resn_nm);
			rx.add(record, "appmt_dt", rec.appmt_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "appmt_sort", rec.appmt_sort);
			rx.add(record, "base_saly", rec.base_saly);
			rx.add(record, "posk_saly", rec.posk_saly);
			rx.add(record, "saly_stot", rec.saly_stot);
			rx.add(record, "lvcmpy_acml_amt", rec.lvcmpy_acml_amt);
			rx.add(record, "bns_incd_servcost", rec.bns_incd_servcost);
			rx.addCData(record, "appmt_cont", rec.appmt_cont);
			rx.add(record, "clos_proc_yn_nm", rec.clos_proc_yn_nm);
			rx.add(record, "posk_clas_cd", rec.posk_clas_cd);
			rx.add(record, "posk_clas_nm", rec.posk_clas_nm);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "appmt_nm", StringUtil.replaceToXml(rec.appmt_nm));
			//rx.add(record, "appmt_resn_nm", StringUtil.replaceToXml(rec.appmt_resn_nm));
			//rx.add(record, "appmt_dt", StringUtil.replaceToXml(rec.appmt_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "appmt_sort", StringUtil.replaceToXml(rec.appmt_sort));
			//rx.add(record, "base_saly", StringUtil.replaceToXml(rec.base_saly));
			//rx.add(record, "posk_saly", StringUtil.replaceToXml(rec.posk_saly));
			//rx.add(record, "saly_stot", StringUtil.replaceToXml(rec.saly_stot));
			//rx.add(record, "lvcmpy_acml_amt", StringUtil.replaceToXml(rec.lvcmpy_acml_amt));
			//rx.add(record, "bns_incd_servcost", StringUtil.replaceToXml(rec.bns_incd_servcost));
			//rx.add(record, "appmt_cont", StringUtil.replaceToXml(rec.appmt_cont));
			//rx.add(record, "clos_proc_yn_nm", StringUtil.replaceToXml(rec.clos_proc_yn_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist12.size());
		/****** CURLIST12 END */

		/****** CURLIST11 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST11", "");
		System.out.println("curlist133");
		for(int i = 0; i < ds.curlist11.size(); i++) {
			HD_INFO_6000_LCURLIST11Record rec = (HD_INFO_6000_LCURLIST11Record)ds.curlist11.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "appmt_nm", rec.appmt_nm);
			rx.add(record, "appmt_resn_nm", rec.appmt_resn_nm);
			rx.add(record, "appmt_dt", rec.appmt_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "appmt_sort", rec.appmt_sort);
			rx.addCData(record, "appmt_cont", rec.appmt_cont);
			rx.add(record, "appmt_stat_clsf", rec.appmt_stat_clsf);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "appmt_nm", StringUtil.replaceToXml(rec.appmt_nm));
			//rx.add(record, "appmt_resn_nm", StringUtil.replaceToXml(rec.appmt_resn_nm));
			//rx.add(record, "appmt_dt", StringUtil.replaceToXml(rec.appmt_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "emp_dtls_clsf_nm", StringUtil.replaceToXml(rec.emp_dtls_clsf_nm));
			//rx.add(record, "appmt_sort", StringUtil.replaceToXml(rec.appmt_sort));
			//rx.add(record, "appmt_cont", StringUtil.replaceToXml(rec.appmt_cont));
			//rx.add(record, "appmt_stat_clsf", StringUtil.replaceToXml(rec.appmt_stat_clsf));
		}
		rx.add(recordSet, "totalcnt", ds.curlist11.size());
		/****** CURLIST11 END */

		/****** CURLIST10 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST10", "");
		System.out.println("curlist1310");
		for(int i = 0; i < ds.curlist10.size(); i++) {
			HD_INFO_6000_LCURLIST10Record rec = (HD_INFO_6000_LCURLIST10Record)ds.curlist10.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "gurt_insr_entr_dt", rec.gurt_insr_entr_dt);
			rx.add(record, "gurt_insr_mtry_dt", rec.gurt_insr_mtry_dt);
			rx.add(record, "gurt_insr_amt", rec.gurt_insr_amt);
			rx.add(record, "gurt_insr_no", rec.gurt_insr_no);
			//rx.add(record, "gurt_insr_entr_dt", StringUtil.replaceToXml(rec.gurt_insr_entr_dt));
			//rx.add(record, "gurt_insr_mtry_dt", StringUtil.replaceToXml(rec.gurt_insr_mtry_dt));
			//rx.add(record, "gurt_insr_amt", StringUtil.replaceToXml(rec.gurt_insr_amt));
			//rx.add(record, "gurt_insr_no", StringUtil.replaceToXml(rec.gurt_insr_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist10.size());
		/****** CURLIST10 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_6000_LCURLISTRecord rec = (HD_INFO_6000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "nm_chin", rec.nm_chin);
			rx.add(record, "nm_engl", rec.nm_engl);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.addCData(record, "cmpy_cd_nm", rec.cmpy_cd_nm);
			rx.add(record, "dspch_enpr_main_clsf", rec.dspch_enpr_main_clsf);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "alon_pay_dept_yn", rec.alon_pay_dept_yn);
			rx.add(record, "addm_dept_cd", rec.addm_dept_cd);
			rx.add(record, "addm_dept_nm", rec.addm_dept_nm);
			rx.add(record, "addm_dty_cd", rec.addm_dty_cd);
			rx.add(record, "addm_dty_nm", rec.addm_dty_nm);
			rx.add(record, "addm_posi_cd", rec.addm_posi_cd);
			rx.add(record, "addm_posi_nm", rec.addm_posi_nm);
			rx.add(record, "addm_alon_pay_dept_yn", rec.addm_alon_pay_dept_yn);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "nm_chin", StringUtil.replaceToXml(rec.nm_chin));
			//rx.add(record, "nm_engl", StringUtil.replaceToXml(rec.nm_engl));
			//rx.add(record, "emp_dtls_clsf", StringUtil.replaceToXml(rec.emp_dtls_clsf));
			//rx.add(record, "emp_dtls_clsf_nm", StringUtil.replaceToXml(rec.emp_dtls_clsf_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "emp_clsf_cd", StringUtil.replaceToXml(rec.emp_clsf_cd));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "cmpy_cd_nm", StringUtil.replaceToXml(rec.cmpy_cd_nm));
			//rx.add(record, "dspch_enpr_main_clsf", StringUtil.replaceToXml(rec.dspch_enpr_main_clsf));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "alon_pay_dept_yn", StringUtil.replaceToXml(rec.alon_pay_dept_yn));
			//rx.add(record, "addm_dept_cd", StringUtil.replaceToXml(rec.addm_dept_cd));
			//rx.add(record, "addm_dept_nm", StringUtil.replaceToXml(rec.addm_dept_nm));
			//rx.add(record, "addm_dty_cd", StringUtil.replaceToXml(rec.addm_dty_cd));
			//rx.add(record, "addm_dty_nm", StringUtil.replaceToXml(rec.addm_dty_nm));
			//rx.add(record, "addm_posi_cd", StringUtil.replaceToXml(rec.addm_posi_cd));
			//rx.add(record, "addm_posi_nm", StringUtil.replaceToXml(rec.addm_posi_nm));
			//rx.add(record, "addm_alon_pay_dept_yn", StringUtil.replaceToXml(rec.addm_alon_pay_dept_yn));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		/****** CURLIST9 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST9", "");
		System.out.println("curlist1309");
		for(int i = 0; i < ds.curlist9.size(); i++) {
			HD_INFO_6000_LCURLIST9Record rec = (HD_INFO_6000_LCURLIST9Record)ds.curlist9.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "prtct_obj_clsf_cd", rec.prtct_obj_clsf_cd);
			rx.addCData(record, "prtct_obj_clsf_nm", rec.prtct_obj_clsf_nm);
			rx.add(record, "prtct_obj_pers_no", rec.prtct_obj_pers_no);
			rx.add(record, "prtct_grad_cd", rec.prtct_grad_cd);
			rx.addCData(record, "prtct_grad_nm", rec.prtct_grad_nm);
			rx.add(record, "prtct_obj_relatn", rec.prtct_obj_relatn);
			rx.add(record, "prtct_obj_relatn_rshp_cd", rec.prtct_obj_relatn_rshp_cd);
			rx.add(record, "prtct_obj_relatn_rshp_nm", rec.prtct_obj_relatn_rshp_nm);
			rx.add(record, "prtct_appmt_ofbld_cd", rec.prtct_appmt_ofbld_cd);
			rx.addCData(record, "prtct_appmt_ofbld_nm", rec.prtct_appmt_ofbld_nm);
			//rx.add(record, "prtct_obj_clsf_cd", StringUtil.replaceToXml(rec.prtct_obj_clsf_cd));
			//rx.add(record, "prtct_obj_clsf_nm", StringUtil.replaceToXml(rec.prtct_obj_clsf_nm));
			//rx.add(record, "prtct_obj_pers_no", StringUtil.replaceToXml(rec.prtct_obj_pers_no));
			//rx.add(record, "prtct_grad_cd", StringUtil.replaceToXml(rec.prtct_grad_cd));
			//rx.add(record, "prtct_grad_nm", StringUtil.replaceToXml(rec.prtct_grad_nm));
			//rx.add(record, "prtct_obj_relatn", StringUtil.replaceToXml(rec.prtct_obj_relatn));
			//rx.add(record, "prtct_obj_relatn_rshp_cd", StringUtil.replaceToXml(rec.prtct_obj_relatn_rshp_cd));
			//rx.add(record, "prtct_obj_relatn_rshp_nm", StringUtil.replaceToXml(rec.prtct_obj_relatn_rshp_nm));
			//rx.add(record, "prtct_appmt_ofbld_cd", StringUtil.replaceToXml(rec.prtct_appmt_ofbld_cd));
			//rx.add(record, "prtct_appmt_ofbld_nm", StringUtil.replaceToXml(rec.prtct_appmt_ofbld_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist9.size());
		/****** CURLIST9 END */

		/****** CURLIST8 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST8", "");
		System.out.println("curlist1308");
		for(int i = 0; i < ds.curlist8.size(); i++) {
			HD_INFO_6000_LCURLIST8Record rec = (HD_INFO_6000_LCURLIST8Record)ds.curlist8.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "frnc_word_seq", rec.frnc_word_seq);
			rx.add(record, "frnc_word_cd", rec.frnc_word_cd);
			rx.addCData(record, "frnc_word_cd_nm", rec.frnc_word_cd_nm);
			rx.add(record, "test_cd", rec.test_cd);
			rx.addCData(record, "test_cd_nm", rec.test_cd_nm);
			rx.add(record, "test_grad", rec.test_grad);
			rx.add(record, "test_scor", rec.test_scor);
			rx.add(record, "test_dt", rec.test_dt);
			rx.add(record, "test_enfc_instt", rec.test_enfc_instt);
			rx.add(record, "spc_matt", rec.spc_matt);
			//rx.add(record, "frnc_word_seq", StringUtil.replaceToXml(rec.frnc_word_seq));
			//rx.add(record, "frnc_word_cd", StringUtil.replaceToXml(rec.frnc_word_cd));
			//rx.add(record, "frnc_word_cd_nm", StringUtil.replaceToXml(rec.frnc_word_cd_nm));
			//rx.add(record, "test_cd", StringUtil.replaceToXml(rec.test_cd));
			//rx.add(record, "test_cd_nm", StringUtil.replaceToXml(rec.test_cd_nm));
			//rx.add(record, "test_grad", StringUtil.replaceToXml(rec.test_grad));
			//rx.add(record, "test_scor", StringUtil.replaceToXml(rec.test_scor));
			//rx.add(record, "test_dt", StringUtil.replaceToXml(rec.test_dt));
			//rx.add(record, "test_enfc_instt", StringUtil.replaceToXml(rec.test_enfc_instt));
			//rx.add(record, "spc_matt", StringUtil.replaceToXml(rec.spc_matt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist8.size());
		/****** CURLIST8 END */

		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST7", "");
		System.out.println("curlist1307");
		for(int i = 0; i < ds.curlist7.size(); i++) {
			HD_INFO_6000_LCURLIST7Record rec = (HD_INFO_6000_LCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "qulf_pems_seq", rec.qulf_pems_seq);
			rx.add(record, "qulf_pems_cd", rec.qulf_pems_cd);
			rx.addCData(record, "qulf_pems_flnm", rec.qulf_pems_flnm);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "qulf_no", rec.qulf_no);
			rx.add(record, "qulf_pems_issu_plac_cd", rec.qulf_pems_issu_plac_cd);
			rx.addCData(record, "qulf_pems_issu_plac_flnm", rec.qulf_pems_issu_plac_flnm);
			//rx.add(record, "qulf_pems_seq", StringUtil.replaceToXml(rec.qulf_pems_seq));
			//rx.add(record, "qulf_pems_cd", StringUtil.replaceToXml(rec.qulf_pems_cd));
			//rx.add(record, "qulf_pems_flnm", StringUtil.replaceToXml(rec.qulf_pems_flnm));
			//rx.add(record, "acqr_dt", StringUtil.replaceToXml(rec.acqr_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "qulf_no", StringUtil.replaceToXml(rec.qulf_no));
			//rx.add(record, "qulf_pems_issu_plac_cd", StringUtil.replaceToXml(rec.qulf_pems_issu_plac_cd));
			//rx.add(record, "qulf_pems_issu_plac_flnm", StringUtil.replaceToXml(rec.qulf_pems_issu_plac_flnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");
		System.out.println("curlist1306");
		for(int i = 0; i < ds.curlist6.size(); i++) {
			HD_INFO_6000_LCURLIST6Record rec = (HD_INFO_6000_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "carr_seq", rec.carr_seq);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.addCData(record, "offi_nm", rec.offi_nm);
			rx.add(record, "dty", rec.dty);
			rx.addCData(record, "posk", rec.posk);
			rx.add(record, "asaly", rec.asaly);
			rx.addCData(record, "lvcmpy_resn", rec.lvcmpy_resn);
			rx.add(record, "natn_cd", rec.natn_cd);
			rx.addCData(record, "natn_nm", rec.natn_nm);
			rx.add(record, "duty_yys", rec.duty_yys);
			rx.add(record, "duty_dds", rec.duty_dds);
			rx.add(record, "carr_aprv_yys", rec.carr_aprv_yys);
			rx.add(record, "carr_aprv_dds", rec.carr_aprv_dds);
			//rx.add(record, "carr_seq", StringUtil.replaceToXml(rec.carr_seq));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			//rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			//rx.add(record, "dty", StringUtil.replaceToXml(rec.dty));
			//rx.add(record, "posk", StringUtil.replaceToXml(rec.posk));
			//rx.add(record, "asaly", StringUtil.replaceToXml(rec.asaly));
			//rx.add(record, "lvcmpy_resn", StringUtil.replaceToXml(rec.lvcmpy_resn));
			//rx.add(record, "natn_cd", StringUtil.replaceToXml(rec.natn_cd));
			//rx.add(record, "natn_nm", StringUtil.replaceToXml(rec.natn_nm));
			//rx.add(record, "duty_yys", StringUtil.replaceToXml(rec.duty_yys));
			//rx.add(record, "duty_dds", StringUtil.replaceToXml(rec.duty_dds));
			//rx.add(record, "carr_aprv_yys", StringUtil.replaceToXml(rec.carr_aprv_yys));
			//rx.add(record, "carr_aprv_dds", StringUtil.replaceToXml(rec.carr_aprv_dds));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

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
<hd_info_6000_l>
	<dataSet>
		<CURLIST5>
			<record>
				<zip_1_01/>
				<zip_2_01/>
				<addr_01/>
				<dtls_addr_01/>
				<tel_no_01/>
				<fax_no_01/>
				<ptph_no_01/>
				<email_id_01/>
				<forn_zip_01/>
				<forn_addr_01/>
				<zip_1_02/>
				<zip_2_02/>
				<addr_02/>
				<dtls_addr_02/>
				<tel_no_02/>
				<fax_no_02/>
				<ptph_no_02/>
				<email_id_02/>
				<forn_zip_02/>
				<forn_addr_02/>
				<zip_1_03/>
				<zip_2_03/>
				<addr_03/>
				<dtls_addr_03/>
				<tel_no_03/>
				<fax_no_03/>
				<ptph_no_03/>
				<email_id_03/>
				<forn_zip_03/>
				<forn_addr_03/>
				<zip_1_04/>
				<zip_2_04/>
				<addr_04/>
				<dtls_addr_04/>
				<tel_no_04/>
				<fax_no_04/>
				<ptph_no_04/>
				<email_id_04/>
				<forn_zip_04/>
				<forn_addr_04/>
			</record>
		</CURLIST5>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST4>
			<record>
				<army_clsf_cd/>
				<army_clsf_cd_nm/>
				<forc_clsi_cd/>
				<forc_clsi_cd_nm/>
				<army_svc_cd/>
				<army_svc_cd_nm/>
				<cls_cd/>
				<cls_cd_nm/>
				<forc_no/>
				<cmmd_army_part_cd/>
				<cmmd_army_part_cd_nm/>
				<sold_main_spc_cd/>
				<sold_main_spc_cd_nm/>
				<in_army_dt/>
				<out_army_dt/>
				<out_army_clsf_cd/>
				<out_army_clsf_cd_nm/>
				<army_un_finsh_resn_cd/>
				<army_un_finsh_resn_cd_nm/>
				<rsv_forc_form_cd/>
				<rsv_forc_form_cd_nm/>
				<rsv_forc_form_dt/>
				<crps_spc_cd/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST3>
			<record>
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
				<faml_seq/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST2>
			<record>
				<schir_seq/>
				<scl_clsf/>
				<scl_clsf_nm/>
				<scl_cd/>
				<scl_nm/>
				<enty_dt/>
				<grdu_dt/>
				<grdu_clsf/>
				<grdu_clsf_nm/>
				<schir_cd/>
				<schir_nm/>
				<majr_clsf_1/>
				<majr_clsf_nm_1/>
				<majr_cd_1/>
				<majr_nm_1/>
				<majr_clsf_2/>
				<majr_clsf_nm_2/>
				<majr_cd_2/>
				<majr_nm_2/>
				<majr_clsf_3/>
				<majr_clsf_nm_3/>
				<majr_cd_3/>
				<majr_nm_3/>
				<sclgg_kind_cd/>
				<sclgg_kind_nm/>
				<plcw_cd/>
				<plcw_nm/>
				<natn_cd/>
				<natn_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST1>
			<record>
				<emp_no/>
				<duty_area_cd/>
				<duty_area_nm/>
				<dtplc_cd/>
				<dtplc_nm/>
				<in_cmpy_posk_cd/>
				<in_cmpy_posk_nm/>
				<cur_jobnon_cd/>
				<cur_jobnon_nm/>
				<lvcmpy_dt/>
				<lvcmpy_resn_cd/>
				<lvcmpy_resn_nm/>
				<last_midl_adjm_dt/>
				<midl_adjm_tms/>
				<last_upgrd_dt/>
				<last_saly_chg_appmt_dt/>
				<last_appmt_dt/>
				<last_appmt_cd/>
				<last_appmt_nm/>
				<last_appmt_cont/>
				<last_temp_dt/>
				<last_reinst_dt/>
				<last_temp_clsf/>
				<last_temp_clsf_nm/>
				<last_stdy_dt/>
				<last_stdy_reinst_dt/>
				<in_cmpy_clsf/>
				<in_cmpy_clsf_nm/>
				<open_invit_clsf/>
				<open_invit_clsf_nm/>
				<open_invit_desty/>
				<relg_cd/>
				<relg_nm/>
				<in_cmpy_resn_cd/>
				<in_cmpy_resn_nm/>
				<recom_pers_rshp_cd/>
				<recom_pers_rshp_nm/>
				<recom_pers_flnm/>
				<blod_cd/>
				<blod_nm/>
				<nativ_cd/>
				<nativ_cd_nm/>
				<nativ_dtls_area/>
				<spc_1/>
				<spc_2/>
				<hby_1/>
				<hby_2/>
				<saly_shft_bank_cd/>
				<saly_shft_bank_nm/>
				<saly_shft_acct_no/>
				<alon_shft_bank_cd/>
				<alon_shft_bank_nm/>
				<alon_shft_acct_no/>
				<encrg_amt_shft_bank_cd/>
				<encrg_amt_shft_bank_nm/>
				<encrg_amt_shft_acct_no/>
				<entr_dt/>
				<lve_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST15>
			<record>
				<frdt/>
				<todt/>
				<dept_nm/>
				<part_nm/>
				<cur_jobnon_nm/>
				<chrg_job/>
				<dtls_job/>
				<aprv_stat_yn/>
			</record>
		</CURLIST15>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST14>
			<record>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<prz_dt/>
				<prz_nm/>
				<prz_resn/>
				<prz_amt/>
				<prz_ptcr/>
			</record>
		</CURLIST14>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST13>
			<record>
				<main_insp_ocom/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<main_insp_dt/>
				<prz_pnsh_nm/>
				<prz_grad/>
				<prz_resn_nm/>
				<case_nm/>
				<atic_pubc_dt/>
				<atic_pubc_side/>
				<prz_amt/>
			</record>
		</CURLIST13>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST12>
			<record>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<appmt_nm/>
				<appmt_resn_nm/>
				<appmt_dt/>
				<mtry_dt/>
				<emp_clsf_nm/>
				<appmt_sort/>
				<base_saly/>
				<posk_saly/>
				<saly_stot/>
				<lvcmpy_acml_amt/>
				<bns_incd_servcost/>
				<appmt_cont/>
				<clos_proc_yn_nm/>
			</record>
		</CURLIST12>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST11>
			<record>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<appmt_nm/>
				<appmt_resn_nm/>
				<appmt_dt/>
				<mtry_dt/>
				<emp_clsf_nm/>
				<dty_nm/>
				<posi_nm/>
				<emp_dtls_clsf_nm/>
				<appmt_sort/>
				<appmt_cont/>
				<appmt_stat_clsf/>
			</record>
		</CURLIST11>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST10>
			<record>
				<gurt_insr_entr_dt/>
				<gurt_insr_mtry_dt/>
				<gurt_insr_amt/>
				<gurt_insr_no/>
			</record>
		</CURLIST10>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<nm_korn/>
				<prn/>
				<nm_chin/>
				<nm_engl/>
				<emp_dtls_clsf/>
				<emp_dtls_clsf_nm/>
				<in_cmpy_dt/>
				<emp_clsf_cd/>
				<emp_clsf_nm/>
				<cmpy_cd_nm/>
				<dspch_enpr_main_clsf/>
				<dept_cd/>
				<dept_nm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<alon_pay_dept_yn/>
				<addm_dept_cd/>
				<addm_dept_nm/>
				<addm_dty_cd/>
				<addm_dty_nm/>
				<addm_posi_cd/>
				<addm_posi_nm/>
				<addm_alon_pay_dept_yn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST9>
			<record>
				<prtct_obj_clsf_cd/>
				<prtct_obj_clsf_nm/>
				<prtct_obj_pers_no/>
				<prtct_grad_cd/>
				<prtct_grad_nm/>
				<prtct_obj_relatn/>
				<prtct_obj_relatn_rshp_cd/>
				<prtct_obj_relatn_rshp_nm/>
				<prtct_appmt_ofbld_cd/>
				<prtct_appmt_ofbld_nm/>
			</record>
		</CURLIST9>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST8>
			<record>
				<frnc_word_seq/>
				<frnc_word_cd/>
				<frnc_word_cd_nm/>
				<test_cd/>
				<test_cd_nm/>
				<test_grad/>
				<test_scor/>
				<test_dt/>
				<test_enfc_instt/>
				<spc_matt/>
			</record>
		</CURLIST8>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST7>
			<record>
				<qulf_pems_seq/>
				<qulf_pems_cd/>
				<qulf_pems_flnm/>
				<acqr_dt/>
				<mtry_dt/>
				<qulf_no/>
				<qulf_pems_issu_plac_cd/>
				<qulf_pems_issu_plac_flnm/>
			</record>
		</CURLIST7>
	</dataSet>
</hd_info_6000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_6000_l>
	<dataSet>
		<CURLIST6>
			<record>
				<carr_seq/>
				<in_cmpy_dt/>
				<lvcmpy_dt/>
				<offi_nm/>
				<dty/>
				<posk/>
				<asaly/>
				<lvcmpy_resn/>
				<natn_cd/>
				<natn_nm/>
				<duty_yys/>
				<duty_dds/>
				<carr_aprv_yys/>
				<carr_aprv_dds/>
			</record>
		</CURLIST6>
	</dataSet>
</hd_info_6000_l>
*/
%>

<% /* 작성시간 : Wed Jul 14 11:13:14 KST 2010 */ %>