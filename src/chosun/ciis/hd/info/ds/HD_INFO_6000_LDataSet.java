/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_6000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist15 = new ArrayList();
	public ArrayList curlist14 = new ArrayList();
	public ArrayList curlist13 = new ArrayList();
	public ArrayList curlist12 = new ArrayList();
	public ArrayList curlist11 = new ArrayList();
	public ArrayList curlist10 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_6000_LDataSet(){}
	public HD_INFO_6000_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_INFO_6000_LCURLISTRecord rec = new HD_INFO_6000_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.nm_chin = Util.checkString(rset0.getString("nm_chin"));
			rec.nm_engl = Util.checkString(rset0.getString("nm_engl"));
			rec.emp_dtls_clsf = Util.checkString(rset0.getString("emp_dtls_clsf"));
			rec.emp_dtls_clsf_nm = Util.checkString(rset0.getString("emp_dtls_clsf_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.emp_clsf_cd = Util.checkString(rset0.getString("emp_clsf_cd"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.cmpy_cd_nm = Util.checkString(rset0.getString("cmpy_cd_nm"));
			rec.dspch_enpr_main_clsf = Util.checkString(rset0.getString("dspch_enpr_main_clsf"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.alon_pay_dept_yn = Util.checkString(rset0.getString("alon_pay_dept_yn"));
			rec.addm_dept_cd = Util.checkString(rset0.getString("addm_dept_cd"));
			rec.addm_dept_nm = Util.checkString(rset0.getString("addm_dept_nm"));
			rec.addm_dty_cd = Util.checkString(rset0.getString("addm_dty_cd"));
			rec.addm_dty_nm = Util.checkString(rset0.getString("addm_dty_nm"));
			rec.addm_posi_cd = Util.checkString(rset0.getString("addm_posi_cd"));
			rec.addm_posi_nm = Util.checkString(rset0.getString("addm_posi_nm"));
			rec.addm_alon_pay_dept_yn = Util.checkString(rset0.getString("addm_alon_pay_dept_yn"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			HD_INFO_6000_LCURLIST1Record rec = new HD_INFO_6000_LCURLIST1Record();
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.duty_area_cd = Util.checkString(rset1.getString("duty_area_cd"));
			rec.duty_area_nm = Util.checkString(rset1.getString("duty_area_nm"));
			rec.dtplc_cd = Util.checkString(rset1.getString("dtplc_cd"));
			rec.dtplc_nm = Util.checkString(rset1.getString("dtplc_nm"));
			rec.in_cmpy_posk_cd = Util.checkString(rset1.getString("in_cmpy_posk_cd"));
			rec.in_cmpy_posk_nm = Util.checkString(rset1.getString("in_cmpy_posk_nm"));
			rec.cur_jobnon_cd = Util.checkString(rset1.getString("cur_jobnon_cd"));
			rec.cur_jobnon_nm = Util.checkString(rset1.getString("cur_jobnon_nm"));
			rec.lvcmpy_dt = Util.checkString(rset1.getString("lvcmpy_dt"));
			rec.lvcmpy_resn_cd = Util.checkString(rset1.getString("lvcmpy_resn_cd"));
			rec.lvcmpy_resn_nm = Util.checkString(rset1.getString("lvcmpy_resn_nm"));
			rec.last_midl_adjm_dt = Util.checkString(rset1.getString("last_midl_adjm_dt"));
			rec.midl_adjm_tms = Util.checkString(rset1.getString("midl_adjm_tms"));
			rec.last_upgrd_dt = Util.checkString(rset1.getString("last_upgrd_dt"));
			rec.last_saly_chg_appmt_dt = Util.checkString(rset1.getString("last_saly_chg_appmt_dt"));
			rec.last_appmt_dt = Util.checkString(rset1.getString("last_appmt_dt"));
			rec.last_appmt_cd = Util.checkString(rset1.getString("last_appmt_cd"));
			rec.last_appmt_nm = Util.checkString(rset1.getString("last_appmt_nm"));
			rec.last_appmt_cont = Util.checkString(rset1.getString("last_appmt_cont"));
			rec.last_temp_dt = Util.checkString(rset1.getString("last_temp_dt"));
			rec.last_reinst_dt = Util.checkString(rset1.getString("last_reinst_dt"));
			rec.last_temp_clsf = Util.checkString(rset1.getString("last_temp_clsf"));
			rec.last_temp_clsf_nm = Util.checkString(rset1.getString("last_temp_clsf_nm"));
			rec.last_stdy_dt = Util.checkString(rset1.getString("last_stdy_dt"));
			rec.last_stdy_reinst_dt = Util.checkString(rset1.getString("last_stdy_reinst_dt"));
			rec.in_cmpy_clsf = Util.checkString(rset1.getString("in_cmpy_clsf"));
			rec.in_cmpy_clsf_nm = Util.checkString(rset1.getString("in_cmpy_clsf_nm"));
			rec.open_invit_clsf = Util.checkString(rset1.getString("open_invit_clsf"));
			rec.open_invit_clsf_nm = Util.checkString(rset1.getString("open_invit_clsf_nm"));
			rec.open_invit_desty = Util.checkString(rset1.getString("open_invit_desty"));
			rec.relg_cd = Util.checkString(rset1.getString("relg_cd"));
			rec.relg_nm = Util.checkString(rset1.getString("relg_nm"));
			rec.in_cmpy_resn_cd = Util.checkString(rset1.getString("in_cmpy_resn_cd"));
			rec.in_cmpy_resn_nm = Util.checkString(rset1.getString("in_cmpy_resn_nm"));
			rec.recom_pers_rshp_cd = Util.checkString(rset1.getString("recom_pers_rshp_cd"));
			rec.recom_pers_rshp_nm = Util.checkString(rset1.getString("recom_pers_rshp_nm"));
			rec.recom_pers_flnm = Util.checkString(rset1.getString("recom_pers_flnm"));
			rec.blod_cd = Util.checkString(rset1.getString("blod_cd"));
			rec.blod_nm = Util.checkString(rset1.getString("blod_nm"));
			rec.nativ_cd = Util.checkString(rset1.getString("nativ_cd"));
			rec.nativ_cd_nm = Util.checkString(rset1.getString("nativ_cd_nm"));
			rec.nativ_dtls_area = Util.checkString(rset1.getString("nativ_dtls_area"));
			rec.spc_1 = Util.checkString(rset1.getString("spc_1"));
			rec.spc_2 = Util.checkString(rset1.getString("spc_2"));
			rec.hby_1 = Util.checkString(rset1.getString("hby_1"));
			rec.hby_2 = Util.checkString(rset1.getString("hby_2"));
			rec.saly_shft_bank_cd = Util.checkString(rset1.getString("saly_shft_bank_cd"));
			rec.saly_shft_bank_nm = Util.checkString(rset1.getString("saly_shft_bank_nm"));
			rec.saly_shft_acct_no = Util.checkString(rset1.getString("saly_shft_acct_no"));
			rec.alon_shft_bank_cd = Util.checkString(rset1.getString("alon_shft_bank_cd"));
			rec.alon_shft_bank_nm = Util.checkString(rset1.getString("alon_shft_bank_nm"));
			rec.alon_shft_acct_no = Util.checkString(rset1.getString("alon_shft_acct_no"));
			rec.encrg_amt_shft_bank_cd = Util.checkString(rset1.getString("encrg_amt_shft_bank_cd"));
			rec.encrg_amt_shft_bank_nm = Util.checkString(rset1.getString("encrg_amt_shft_bank_nm"));
			rec.encrg_amt_shft_acct_no = Util.checkString(rset1.getString("encrg_amt_shft_acct_no"));
			rec.etc_shft_bank_cd = Util.checkString(rset1.getString("etc_shft_bank_cd"));
			rec.etc_shft_bank_nm = Util.checkString(rset1.getString("etc_shft_bank_nm"));
			rec.etc_shft_acct_no = Util.checkString(rset1.getString("etc_shft_acct_no"));
			rec.etc_shft_chqe_pay_yn = Util.checkString(rset1.getString("etc_shft_chqe_pay_yn"));
			rec.entr_dt = Util.checkString(rset1.getString("entr_dt"));
			rec.lve_dt = Util.checkString(rset1.getString("lve_dt"));
			rec.aprv_in_cmpy = Util.checkString(rset1.getString("aprv_in_cmpy"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			HD_INFO_6000_LCURLIST2Record rec = new HD_INFO_6000_LCURLIST2Record();
			rec.schir_seq = Util.checkString(rset2.getString("schir_seq"));
			rec.scl_clsf = Util.checkString(rset2.getString("scl_clsf"));
			rec.scl_clsf_nm = Util.checkString(rset2.getString("scl_clsf_nm"));
			rec.scl_cd = Util.checkString(rset2.getString("scl_cd"));
			rec.scl_nm = Util.checkString(rset2.getString("scl_nm"));
			rec.enty_dt = Util.checkString(rset2.getString("enty_dt"));
			rec.grdu_dt = Util.checkString(rset2.getString("grdu_dt"));
			rec.grdu_clsf = Util.checkString(rset2.getString("grdu_clsf"));
			rec.grdu_clsf_nm = Util.checkString(rset2.getString("grdu_clsf_nm"));
			rec.schir_cd = Util.checkString(rset2.getString("schir_cd"));
			rec.schir_nm = Util.checkString(rset2.getString("schir_nm"));
			rec.majr_clsf_1 = Util.checkString(rset2.getString("majr_clsf_1"));
			rec.majr_clsf_nm_1 = Util.checkString(rset2.getString("majr_clsf_nm_1"));
			rec.majr_cd_1 = Util.checkString(rset2.getString("majr_cd_1"));
			rec.majr_nm_1 = Util.checkString(rset2.getString("majr_nm_1"));
			rec.majr_clsf_2 = Util.checkString(rset2.getString("majr_clsf_2"));
			rec.majr_clsf_nm_2 = Util.checkString(rset2.getString("majr_clsf_nm_2"));
			rec.majr_cd_2 = Util.checkString(rset2.getString("majr_cd_2"));
			rec.majr_nm_2 = Util.checkString(rset2.getString("majr_nm_2"));
			rec.majr_clsf_3 = Util.checkString(rset2.getString("majr_clsf_3"));
			rec.majr_clsf_nm_3 = Util.checkString(rset2.getString("majr_clsf_nm_3"));
			rec.majr_cd_3 = Util.checkString(rset2.getString("majr_cd_3"));
			rec.majr_nm_3 = Util.checkString(rset2.getString("majr_nm_3"));
			rec.sclgg_kind_cd = Util.checkString(rset2.getString("sclgg_kind_cd"));
			rec.sclgg_kind_nm = Util.checkString(rset2.getString("sclgg_kind_nm"));
			rec.plcw_cd = Util.checkString(rset2.getString("plcw_cd"));
			rec.plcw_nm = Util.checkString(rset2.getString("plcw_nm"));
			rec.natn_cd = Util.checkString(rset2.getString("natn_cd"));
			rec.natn_nm = Util.checkString(rset2.getString("natn_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			HD_INFO_6000_LCURLIST3Record rec = new HD_INFO_6000_LCURLIST3Record();
			rec.faml_rshp_cd = Util.checkString(rset3.getString("faml_rshp_cd"));
			rec.faml_rshp_nm = Util.checkString(rset3.getString("faml_rshp_nm"));
			rec.faml_flnm = Util.checkString(rset3.getString("faml_flnm"));
			rec.faml_prn = Util.checkString(rset3.getString("faml_prn"));
			rec.ocpn_cd = Util.checkString(rset3.getString("ocpn_cd"));
			rec.ocpn_nm = Util.checkString(rset3.getString("ocpn_nm"));
			rec.offi_nm = Util.checkString(rset3.getString("offi_nm"));
			rec.posi = Util.checkString(rset3.getString("posi"));
			rec.schir_cd = Util.checkString(rset3.getString("schir_cd"));
			rec.schir_nm = Util.checkString(rset3.getString("schir_nm"));
			rec.nmat_yn = Util.checkString(rset3.getString("nmat_yn"));
			rec.dth_dt = Util.checkString(rset3.getString("dth_dt"));
			rec.spos_dduc_obj_yn = Util.checkString(rset3.getString("spos_dduc_obj_yn"));
			rec.child_dduc_obj_yn = Util.checkString(rset3.getString("child_dduc_obj_yn"));
			rec.oldg_dduc_obj_yn = Util.checkString(rset3.getString("oldg_dduc_obj_yn"));
			rec.obcl_pers_dduc_obj_yn = Util.checkString(rset3.getString("obcl_pers_dduc_obj_yn"));
			rec.rspc_dduc_obj_yn = Util.checkString(rset3.getString("rspc_dduc_obj_yn"));
			rec.fml_hshd_dduc_yn = Util.checkString(rset3.getString("fml_hshd_dduc_yn"));
			rec.care_fee_dduc_yn = Util.checkString(rset3.getString("care_fee_dduc_yn"));
			rec.adopt_dt = Util.checkString(rset3.getString("adopt_dt"));
			rec.faml_seq = Util.checkString(rset3.getString("faml_seq"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			HD_INFO_6000_LCURLIST4Record rec = new HD_INFO_6000_LCURLIST4Record();
			rec.army_clsf_cd = Util.checkString(rset4.getString("army_clsf_cd"));
			rec.army_clsf_cd_nm = Util.checkString(rset4.getString("army_clsf_cd_nm"));
			rec.forc_clsi_cd = Util.checkString(rset4.getString("forc_clsi_cd"));
			rec.forc_clsi_cd_nm = Util.checkString(rset4.getString("forc_clsi_cd_nm"));
			rec.army_svc_cd = Util.checkString(rset4.getString("army_svc_cd"));
			rec.army_svc_cd_nm = Util.checkString(rset4.getString("army_svc_cd_nm"));
			rec.cls_cd = Util.checkString(rset4.getString("cls_cd"));
			rec.cls_cd_nm = Util.checkString(rset4.getString("cls_cd_nm"));
			rec.forc_no = Util.checkString(rset4.getString("forc_no"));
			rec.cmmd_army_part_cd = Util.checkString(rset4.getString("cmmd_army_part_cd"));
			rec.cmmd_army_part_cd_nm = Util.checkString(rset4.getString("cmmd_army_part_cd_nm"));
			rec.sold_main_spc_cd = Util.checkString(rset4.getString("sold_main_spc_cd"));
			rec.sold_main_spc_cd_nm = Util.checkString(rset4.getString("sold_main_spc_cd_nm"));
			rec.in_army_dt = Util.checkString(rset4.getString("in_army_dt"));
			rec.out_army_dt = Util.checkString(rset4.getString("out_army_dt"));
			rec.out_army_clsf_cd = Util.checkString(rset4.getString("out_army_clsf_cd"));
			rec.out_army_clsf_cd_nm = Util.checkString(rset4.getString("out_army_clsf_cd_nm"));
			rec.army_un_finsh_resn_cd = Util.checkString(rset4.getString("army_un_finsh_resn_cd"));
			rec.army_un_finsh_resn_cd_nm = Util.checkString(rset4.getString("army_un_finsh_resn_cd_nm"));
			rec.rsv_forc_form_cd = Util.checkString(rset4.getString("rsv_forc_form_cd"));
			rec.rsv_forc_form_cd_nm = Util.checkString(rset4.getString("rsv_forc_form_cd_nm"));
			rec.rsv_forc_form_dt = Util.checkString(rset4.getString("rsv_forc_form_dt"));
			rec.crps_spc_cd = Util.checkString(rset4.getString("crps_spc_cd"));
			this.curlist4.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			HD_INFO_6000_LCURLIST5Record rec = new HD_INFO_6000_LCURLIST5Record();
			rec.zip_1_01 = Util.checkString(rset5.getString("zip_1_01"));
			rec.zip_2_01 = Util.checkString(rset5.getString("zip_2_01"));
			rec.addr_01 = Util.checkString(rset5.getString("addr_01"));
			rec.dtls_addr_01 = Util.checkString(rset5.getString("dtls_addr_01"));
			rec.tel_no_01 = Util.checkString(rset5.getString("tel_no_01"));
			rec.fax_no_01 = Util.checkString(rset5.getString("fax_no_01"));
			rec.ptph_no_01 = Util.checkString(rset5.getString("ptph_no_01"));
			rec.email_id_01 = Util.checkString(rset5.getString("email_id_01"));
			rec.forn_zip_01 = Util.checkString(rset5.getString("forn_zip_01"));
			rec.forn_addr_01 = Util.checkString(rset5.getString("forn_addr_01"));
			rec.zip_1_02 = Util.checkString(rset5.getString("zip_1_02"));
			rec.zip_2_02 = Util.checkString(rset5.getString("zip_2_02"));
			rec.addr_02 = Util.checkString(rset5.getString("addr_02"));
			rec.dtls_addr_02 = Util.checkString(rset5.getString("dtls_addr_02"));
			rec.tel_no_02 = Util.checkString(rset5.getString("tel_no_02"));
			rec.fax_no_02 = Util.checkString(rset5.getString("fax_no_02"));
			rec.ptph_no_02 = Util.checkString(rset5.getString("ptph_no_02"));
			rec.email_id_02 = Util.checkString(rset5.getString("email_id_02"));
			rec.forn_zip_02 = Util.checkString(rset5.getString("forn_zip_02"));
			rec.forn_addr_02 = Util.checkString(rset5.getString("forn_addr_02"));
			rec.zip_1_03 = Util.checkString(rset5.getString("zip_1_03"));
			rec.zip_2_03 = Util.checkString(rset5.getString("zip_2_03"));
			rec.addr_03 = Util.checkString(rset5.getString("addr_03"));
			rec.dtls_addr_03 = Util.checkString(rset5.getString("dtls_addr_03"));
			rec.tel_no_03 = Util.checkString(rset5.getString("tel_no_03"));
			rec.fax_no_03 = Util.checkString(rset5.getString("fax_no_03"));
			rec.ptph_no_03 = Util.checkString(rset5.getString("ptph_no_03"));
			rec.email_id_03 = Util.checkString(rset5.getString("email_id_03"));
			rec.forn_zip_03 = Util.checkString(rset5.getString("forn_zip_03"));
			rec.forn_addr_03 = Util.checkString(rset5.getString("forn_addr_03"));
			rec.zip_1_04 = Util.checkString(rset5.getString("zip_1_04"));
			rec.zip_2_04 = Util.checkString(rset5.getString("zip_2_04"));
			rec.addr_04 = Util.checkString(rset5.getString("addr_04"));
			rec.dtls_addr_04 = Util.checkString(rset5.getString("dtls_addr_04"));
			rec.tel_no_04 = Util.checkString(rset5.getString("tel_no_04"));
			rec.fax_no_04 = Util.checkString(rset5.getString("fax_no_04"));
			rec.ptph_no_04 = Util.checkString(rset5.getString("ptph_no_04"));
			rec.email_id_04 = Util.checkString(rset5.getString("email_id_04"));
			rec.forn_zip_04 = Util.checkString(rset5.getString("forn_zip_04"));
			rec.forn_addr_04 = Util.checkString(rset5.getString("forn_addr_04"));
			rec.tel_no_05 = Util.checkString(rset5.getString("tel_no_05"));
			rec.cntc_rshp = Util.checkString(rset5.getString("cntc_rshp"));
			this.curlist5.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			HD_INFO_6000_LCURLIST6Record rec = new HD_INFO_6000_LCURLIST6Record();
			rec.carr_seq = Util.checkString(rset6.getString("carr_seq"));
			rec.in_cmpy_dt = Util.checkString(rset6.getString("in_cmpy_dt"));
			rec.lvcmpy_dt = Util.checkString(rset6.getString("lvcmpy_dt"));
			rec.offi_nm = Util.checkString(rset6.getString("offi_nm"));
			rec.dty = Util.checkString(rset6.getString("dty"));
			rec.posk = Util.checkString(rset6.getString("posk"));
			rec.asaly = Util.checkString(rset6.getString("asaly"));
			rec.lvcmpy_resn = Util.checkString(rset6.getString("lvcmpy_resn"));
			rec.natn_cd = Util.checkString(rset6.getString("natn_cd"));
			rec.natn_nm = Util.checkString(rset6.getString("natn_nm"));
			rec.duty_yys = Util.checkString(rset6.getString("duty_yys"));
			rec.duty_dds = Util.checkString(rset6.getString("duty_dds"));
			rec.carr_aprv_yys = Util.checkString(rset6.getString("carr_aprv_yys"));
			rec.carr_aprv_dds = Util.checkString(rset6.getString("carr_aprv_dds"));
			this.curlist6.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			HD_INFO_6000_LCURLIST7Record rec = new HD_INFO_6000_LCURLIST7Record();
			rec.qulf_pems_seq = Util.checkString(rset7.getString("qulf_pems_seq"));
			rec.qulf_pems_cd = Util.checkString(rset7.getString("qulf_pems_cd"));
			rec.qulf_pems_flnm = Util.checkString(rset7.getString("qulf_pems_flnm"));
			rec.acqr_dt = Util.checkString(rset7.getString("acqr_dt"));
			rec.mtry_dt = Util.checkString(rset7.getString("mtry_dt"));
			rec.qulf_no = Util.checkString(rset7.getString("qulf_no"));
			rec.qulf_pems_issu_plac_cd = Util.checkString(rset7.getString("qulf_pems_issu_plac_cd"));
			rec.qulf_pems_issu_plac_flnm = Util.checkString(rset7.getString("qulf_pems_issu_plac_flnm"));
			this.curlist7.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(15);
		while(rset8.next()){
			HD_INFO_6000_LCURLIST8Record rec = new HD_INFO_6000_LCURLIST8Record();
			rec.frnc_word_seq = Util.checkString(rset8.getString("frnc_word_seq"));
			rec.frnc_word_cd = Util.checkString(rset8.getString("frnc_word_cd"));
			rec.frnc_word_cd_nm = Util.checkString(rset8.getString("frnc_word_cd_nm"));
			rec.test_cd = Util.checkString(rset8.getString("test_cd"));
			rec.test_cd_nm = Util.checkString(rset8.getString("test_cd_nm"));
			rec.test_grad = Util.checkString(rset8.getString("test_grad"));
			rec.test_scor = Util.checkString(rset8.getString("test_scor"));
			rec.test_dt = Util.checkString(rset8.getString("test_dt"));
			rec.test_enfc_instt = Util.checkString(rset8.getString("test_enfc_instt"));
			rec.spc_matt = Util.checkString(rset8.getString("spc_matt"));
			this.curlist8.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(16);
		while(rset9.next()){
			HD_INFO_6000_LCURLIST9Record rec = new HD_INFO_6000_LCURLIST9Record();
			rec.prtct_obj_clsf_cd = Util.checkString(rset9.getString("prtct_obj_clsf_cd"));
			rec.prtct_obj_clsf_nm = Util.checkString(rset9.getString("prtct_obj_clsf_nm"));
			rec.prtct_obj_pers_no = Util.checkString(rset9.getString("prtct_obj_pers_no"));
			rec.prtct_grad_cd = Util.checkString(rset9.getString("prtct_grad_cd"));
			rec.prtct_grad_nm = Util.checkString(rset9.getString("prtct_grad_nm"));
			rec.prtct_obj_relatn = Util.checkString(rset9.getString("prtct_obj_relatn"));
			rec.prtct_obj_relatn_rshp_cd = Util.checkString(rset9.getString("prtct_obj_relatn_rshp_cd"));
			rec.prtct_obj_relatn_rshp_nm = Util.checkString(rset9.getString("prtct_obj_relatn_rshp_nm"));
			rec.prtct_appmt_ofbld_cd = Util.checkString(rset9.getString("prtct_appmt_ofbld_cd"));
			rec.prtct_appmt_ofbld_nm = Util.checkString(rset9.getString("prtct_appmt_ofbld_nm"));
			this.curlist9.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(17);
		while(rset10.next()){
			HD_INFO_6000_LCURLIST10Record rec = new HD_INFO_6000_LCURLIST10Record();
			rec.gurt_insr_entr_dt = Util.checkString(rset10.getString("gurt_insr_entr_dt"));
			rec.gurt_insr_mtry_dt = Util.checkString(rset10.getString("gurt_insr_mtry_dt"));
			rec.gurt_insr_amt = Util.checkString(rset10.getString("gurt_insr_amt"));
			rec.gurt_insr_no = Util.checkString(rset10.getString("gurt_insr_no"));
			this.curlist10.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(18);
		while(rset11.next()){
			HD_INFO_6000_LCURLIST11Record rec = new HD_INFO_6000_LCURLIST11Record();
			rec.dept_nm = Util.checkString(rset11.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset11.getString("emp_no"));
			rec.flnm = Util.checkString(rset11.getString("flnm"));
			rec.appmt_nm = Util.checkString(rset11.getString("appmt_nm"));
			rec.appmt_resn_nm = Util.checkString(rset11.getString("appmt_resn_nm"));
			rec.appmt_dt = Util.checkString(rset11.getString("appmt_dt"));
			rec.mtry_dt = Util.checkString(rset11.getString("mtry_dt"));
			rec.emp_clsf_nm = Util.checkString(rset11.getString("emp_clsf_nm"));
			rec.dty_nm = Util.checkString(rset11.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset11.getString("posi_nm"));
			rec.emp_dtls_clsf_nm = Util.checkString(rset11.getString("emp_dtls_clsf_nm"));
			rec.appmt_sort = Util.checkString(rset11.getString("appmt_sort"));
			rec.appmt_cont = Util.checkString(rset11.getString("appmt_cont"));
			rec.appmt_stat_clsf = Util.checkString(rset11.getString("appmt_stat_clsf"));
			this.curlist11.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(19);
		while(rset12.next()){
			HD_INFO_6000_LCURLIST12Record rec = new HD_INFO_6000_LCURLIST12Record();
			rec.dept_nm = Util.checkString(rset12.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset12.getString("emp_no"));
			rec.flnm = Util.checkString(rset12.getString("flnm"));
			rec.appmt_nm = Util.checkString(rset12.getString("appmt_nm"));
			rec.appmt_resn_nm = Util.checkString(rset12.getString("appmt_resn_nm"));
			rec.appmt_dt = Util.checkString(rset12.getString("appmt_dt"));
			rec.mtry_dt = Util.checkString(rset12.getString("mtry_dt"));
			rec.emp_clsf_nm = Util.checkString(rset12.getString("emp_clsf_nm"));
			rec.appmt_sort = Util.checkString(rset12.getString("appmt_sort"));
			rec.base_saly = Util.checkString(rset12.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset12.getString("posk_saly"));
			rec.saly_stot = Util.checkString(rset12.getString("saly_stot"));
			rec.lvcmpy_acml_amt = Util.checkString(rset12.getString("lvcmpy_acml_amt"));
			rec.bns_incd_servcost = Util.checkString(rset12.getString("bns_incd_servcost"));
			rec.appmt_cont = Util.checkString(rset12.getString("appmt_cont"));
			rec.clos_proc_yn_nm = Util.checkString(rset12.getString("clos_proc_yn_nm"));
			rec.posk_clas_cd = Util.checkString(rset12.getString("posk_clas_cd"));
			rec.posk_clas_nm = Util.checkString(rset12.getString("posk_clas_nm"));
			this.curlist12.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(20);
		while(rset13.next()){
			HD_INFO_6000_LCURLIST13Record rec = new HD_INFO_6000_LCURLIST13Record();
			rec.main_insp_ocom = Util.checkString(rset13.getString("main_insp_ocom"));
			rec.dept_nm = Util.checkString(rset13.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset13.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset13.getString("posi_nm"));
			rec.main_insp_dt = Util.checkString(rset13.getString("main_insp_dt"));
			rec.prz_pnsh_nm = Util.checkString(rset13.getString("prz_pnsh_nm"));
			rec.prz_grad = Util.checkString(rset13.getString("prz_grad"));
			rec.prz_resn_nm = Util.checkString(rset13.getString("prz_resn_nm"));
			rec.case_nm = Util.checkString(rset13.getString("case_nm"));
			rec.atic_pubc_dt = Util.checkString(rset13.getString("atic_pubc_dt"));
			rec.atic_pubc_side = Util.checkString(rset13.getString("atic_pubc_side"));
			rec.prz_amt = Util.checkString(rset13.getString("prz_amt"));
			this.curlist13.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(21);
		while(rset14.next()){
			HD_INFO_6000_LCURLIST14Record rec = new HD_INFO_6000_LCURLIST14Record();
			rec.dept_nm = Util.checkString(rset14.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset14.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset14.getString("posi_nm"));
			rec.prz_dt = Util.checkString(rset14.getString("prz_dt"));
			rec.prz_nm = Util.checkString(rset14.getString("prz_nm"));
			rec.prz_resn = Util.checkString(rset14.getString("prz_resn"));
			rec.prz_amt = Util.checkString(rset14.getString("prz_amt"));
			rec.prz_ptcr = Util.checkString(rset14.getString("prz_ptcr"));
			this.curlist14.add(rec);
		}
		ResultSet rset15 = (ResultSet) cstmt.getObject(22);
		while(rset15.next()){
			HD_INFO_6000_LCURLIST15Record rec = new HD_INFO_6000_LCURLIST15Record();
			rec.frdt = Util.checkString(rset15.getString("frdt"));
			rec.todt = Util.checkString(rset15.getString("todt"));
			rec.dept_nm = Util.checkString(rset15.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset15.getString("part_nm"));
			rec.cur_jobnon_nm = Util.checkString(rset15.getString("cur_jobnon_nm"));
			rec.chrg_job = Util.checkString(rset15.getString("chrg_job"));
			rec.dtls_job = Util.checkString(rset15.getString("dtls_job"));
			rec.aprv_stat_yn = Util.checkString(rset15.getString("aprv_stat_yn"));
			this.curlist15.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_6000_LDataSet ds = (HD_INFO_6000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_6000_LCURLISTRecord curlistRec = (HD_INFO_6000_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INFO_6000_LCURLIST1Record curlist1Rec = (HD_INFO_6000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_INFO_6000_LCURLIST2Record curlist2Rec = (HD_INFO_6000_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_INFO_6000_LCURLIST3Record curlist3Rec = (HD_INFO_6000_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_INFO_6000_LCURLIST4Record curlist4Rec = (HD_INFO_6000_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		HD_INFO_6000_LCURLIST5Record curlist5Rec = (HD_INFO_6000_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		HD_INFO_6000_LCURLIST6Record curlist6Rec = (HD_INFO_6000_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		HD_INFO_6000_LCURLIST7Record curlist7Rec = (HD_INFO_6000_LCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		HD_INFO_6000_LCURLIST8Record curlist8Rec = (HD_INFO_6000_LCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		HD_INFO_6000_LCURLIST9Record curlist9Rec = (HD_INFO_6000_LCURLIST9Record)ds.curlist9.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist10.size(); i++){
		HD_INFO_6000_LCURLIST10Record curlist10Rec = (HD_INFO_6000_LCURLIST10Record)ds.curlist10.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist11.size(); i++){
		HD_INFO_6000_LCURLIST11Record curlist11Rec = (HD_INFO_6000_LCURLIST11Record)ds.curlist11.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist12.size(); i++){
		HD_INFO_6000_LCURLIST12Record curlist12Rec = (HD_INFO_6000_LCURLIST12Record)ds.curlist12.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist13.size(); i++){
		HD_INFO_6000_LCURLIST13Record curlist13Rec = (HD_INFO_6000_LCURLIST13Record)ds.curlist13.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist14.size(); i++){
		HD_INFO_6000_LCURLIST14Record curlist14Rec = (HD_INFO_6000_LCURLIST14Record)ds.curlist14.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist15.size(); i++){
		HD_INFO_6000_LCURLIST15Record curlist15Rec = (HD_INFO_6000_LCURLIST15Record)ds.curlist15.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
<%= ds.getCurlist8()%>
<%= ds.getCurlist9()%>
<%= ds.getCurlist10()%>
<%= ds.getCurlist11()%>
<%= ds.getCurlist12()%>
<%= ds.getCurlist13()%>
<%= ds.getCurlist14()%>
<%= ds.getCurlist15()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.prn%>
<%= curlistRec.nm_chin%>
<%= curlistRec.nm_engl%>
<%= curlistRec.emp_dtls_clsf%>
<%= curlistRec.emp_dtls_clsf_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.emp_clsf_cd%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.cmpy_cd_nm%>
<%= curlistRec.dspch_enpr_main_clsf%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.alon_pay_dept_yn%>
<%= curlistRec.addm_dept_cd%>
<%= curlistRec.addm_dept_nm%>
<%= curlistRec.addm_dty_cd%>
<%= curlistRec.addm_dty_nm%>
<%= curlistRec.addm_posi_cd%>
<%= curlistRec.addm_posi_nm%>
<%= curlistRec.addm_alon_pay_dept_yn%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.duty_area_cd%>
<%= curlist1Rec.duty_area_nm%>
<%= curlist1Rec.dtplc_cd%>
<%= curlist1Rec.dtplc_nm%>
<%= curlist1Rec.in_cmpy_posk_cd%>
<%= curlist1Rec.in_cmpy_posk_nm%>
<%= curlist1Rec.cur_jobnon_cd%>
<%= curlist1Rec.cur_jobnon_nm%>
<%= curlist1Rec.lvcmpy_dt%>
<%= curlist1Rec.lvcmpy_resn_cd%>
<%= curlist1Rec.lvcmpy_resn_nm%>
<%= curlist1Rec.last_midl_adjm_dt%>
<%= curlist1Rec.midl_adjm_tms%>
<%= curlist1Rec.last_upgrd_dt%>
<%= curlist1Rec.last_saly_chg_appmt_dt%>
<%= curlist1Rec.last_appmt_dt%>
<%= curlist1Rec.last_appmt_cd%>
<%= curlist1Rec.last_appmt_nm%>
<%= curlist1Rec.last_appmt_cont%>
<%= curlist1Rec.last_temp_dt%>
<%= curlist1Rec.last_reinst_dt%>
<%= curlist1Rec.last_temp_clsf%>
<%= curlist1Rec.last_temp_clsf_nm%>
<%= curlist1Rec.last_stdy_dt%>
<%= curlist1Rec.last_stdy_reinst_dt%>
<%= curlist1Rec.in_cmpy_clsf%>
<%= curlist1Rec.in_cmpy_clsf_nm%>
<%= curlist1Rec.open_invit_clsf%>
<%= curlist1Rec.open_invit_clsf_nm%>
<%= curlist1Rec.open_invit_desty%>
<%= curlist1Rec.relg_cd%>
<%= curlist1Rec.relg_nm%>
<%= curlist1Rec.in_cmpy_resn_cd%>
<%= curlist1Rec.in_cmpy_resn_nm%>
<%= curlist1Rec.recom_pers_rshp_cd%>
<%= curlist1Rec.recom_pers_rshp_nm%>
<%= curlist1Rec.recom_pers_flnm%>
<%= curlist1Rec.blod_cd%>
<%= curlist1Rec.blod_nm%>
<%= curlist1Rec.nativ_cd%>
<%= curlist1Rec.nativ_cd_nm%>
<%= curlist1Rec.nativ_dtls_area%>
<%= curlist1Rec.spc_1%>
<%= curlist1Rec.spc_2%>
<%= curlist1Rec.hby_1%>
<%= curlist1Rec.hby_2%>
<%= curlist1Rec.saly_shft_bank_cd%>
<%= curlist1Rec.saly_shft_bank_nm%>
<%= curlist1Rec.saly_shft_acct_no%>
<%= curlist1Rec.alon_shft_bank_cd%>
<%= curlist1Rec.alon_shft_bank_nm%>
<%= curlist1Rec.alon_shft_acct_no%>
<%= curlist1Rec.encrg_amt_shft_bank_cd%>
<%= curlist1Rec.encrg_amt_shft_bank_nm%>
<%= curlist1Rec.encrg_amt_shft_acct_no%>
<%= curlist1Rec.etc_shft_bank_cd%>
<%= curlist1Rec.etc_shft_bank_nm%>
<%= curlist1Rec.etc_shft_acct_no%>
<%= curlist1Rec.etc_shft_chqe_pay_yn%>
<%= curlist1Rec.entr_dt%>
<%= curlist1Rec.lve_dt%>
<%= curlist1Rec.aprv_in_cmpy%>
<%= curlist2Rec.schir_seq%>
<%= curlist2Rec.scl_clsf%>
<%= curlist2Rec.scl_clsf_nm%>
<%= curlist2Rec.scl_cd%>
<%= curlist2Rec.scl_nm%>
<%= curlist2Rec.enty_dt%>
<%= curlist2Rec.grdu_dt%>
<%= curlist2Rec.grdu_clsf%>
<%= curlist2Rec.grdu_clsf_nm%>
<%= curlist2Rec.schir_cd%>
<%= curlist2Rec.schir_nm%>
<%= curlist2Rec.majr_clsf_1%>
<%= curlist2Rec.majr_clsf_nm_1%>
<%= curlist2Rec.majr_cd_1%>
<%= curlist2Rec.majr_nm_1%>
<%= curlist2Rec.majr_clsf_2%>
<%= curlist2Rec.majr_clsf_nm_2%>
<%= curlist2Rec.majr_cd_2%>
<%= curlist2Rec.majr_nm_2%>
<%= curlist2Rec.majr_clsf_3%>
<%= curlist2Rec.majr_clsf_nm_3%>
<%= curlist2Rec.majr_cd_3%>
<%= curlist2Rec.majr_nm_3%>
<%= curlist2Rec.sclgg_kind_cd%>
<%= curlist2Rec.sclgg_kind_nm%>
<%= curlist2Rec.plcw_cd%>
<%= curlist2Rec.plcw_nm%>
<%= curlist2Rec.natn_cd%>
<%= curlist2Rec.natn_nm%>
<%= curlist3Rec.faml_rshp_cd%>
<%= curlist3Rec.faml_rshp_nm%>
<%= curlist3Rec.faml_flnm%>
<%= curlist3Rec.faml_prn%>
<%= curlist3Rec.ocpn_cd%>
<%= curlist3Rec.ocpn_nm%>
<%= curlist3Rec.offi_nm%>
<%= curlist3Rec.posi%>
<%= curlist3Rec.schir_cd%>
<%= curlist3Rec.schir_nm%>
<%= curlist3Rec.nmat_yn%>
<%= curlist3Rec.dth_dt%>
<%= curlist3Rec.spos_dduc_obj_yn%>
<%= curlist3Rec.child_dduc_obj_yn%>
<%= curlist3Rec.oldg_dduc_obj_yn%>
<%= curlist3Rec.obcl_pers_dduc_obj_yn%>
<%= curlist3Rec.rspc_dduc_obj_yn%>
<%= curlist3Rec.fml_hshd_dduc_yn%>
<%= curlist3Rec.care_fee_dduc_yn%>
<%= curlist3Rec.adopt_dt%>
<%= curlist3Rec.faml_seq%>
<%= curlist4Rec.army_clsf_cd%>
<%= curlist4Rec.army_clsf_cd_nm%>
<%= curlist4Rec.forc_clsi_cd%>
<%= curlist4Rec.forc_clsi_cd_nm%>
<%= curlist4Rec.army_svc_cd%>
<%= curlist4Rec.army_svc_cd_nm%>
<%= curlist4Rec.cls_cd%>
<%= curlist4Rec.cls_cd_nm%>
<%= curlist4Rec.forc_no%>
<%= curlist4Rec.cmmd_army_part_cd%>
<%= curlist4Rec.cmmd_army_part_cd_nm%>
<%= curlist4Rec.sold_main_spc_cd%>
<%= curlist4Rec.sold_main_spc_cd_nm%>
<%= curlist4Rec.in_army_dt%>
<%= curlist4Rec.out_army_dt%>
<%= curlist4Rec.out_army_clsf_cd%>
<%= curlist4Rec.out_army_clsf_cd_nm%>
<%= curlist4Rec.army_un_finsh_resn_cd%>
<%= curlist4Rec.army_un_finsh_resn_cd_nm%>
<%= curlist4Rec.rsv_forc_form_cd%>
<%= curlist4Rec.rsv_forc_form_cd_nm%>
<%= curlist4Rec.rsv_forc_form_dt%>
<%= curlist4Rec.crps_spc_cd%>
<%= curlist5Rec.zip_1_01%>
<%= curlist5Rec.zip_2_01%>
<%= curlist5Rec.addr_01%>
<%= curlist5Rec.dtls_addr_01%>
<%= curlist5Rec.tel_no_01%>
<%= curlist5Rec.fax_no_01%>
<%= curlist5Rec.ptph_no_01%>
<%= curlist5Rec.email_id_01%>
<%= curlist5Rec.forn_zip_01%>
<%= curlist5Rec.forn_addr_01%>
<%= curlist5Rec.zip_1_02%>
<%= curlist5Rec.zip_2_02%>
<%= curlist5Rec.addr_02%>
<%= curlist5Rec.dtls_addr_02%>
<%= curlist5Rec.tel_no_02%>
<%= curlist5Rec.fax_no_02%>
<%= curlist5Rec.ptph_no_02%>
<%= curlist5Rec.email_id_02%>
<%= curlist5Rec.forn_zip_02%>
<%= curlist5Rec.forn_addr_02%>
<%= curlist5Rec.zip_1_03%>
<%= curlist5Rec.zip_2_03%>
<%= curlist5Rec.addr_03%>
<%= curlist5Rec.dtls_addr_03%>
<%= curlist5Rec.tel_no_03%>
<%= curlist5Rec.fax_no_03%>
<%= curlist5Rec.ptph_no_03%>
<%= curlist5Rec.email_id_03%>
<%= curlist5Rec.forn_zip_03%>
<%= curlist5Rec.forn_addr_03%>
<%= curlist5Rec.zip_1_04%>
<%= curlist5Rec.zip_2_04%>
<%= curlist5Rec.addr_04%>
<%= curlist5Rec.dtls_addr_04%>
<%= curlist5Rec.tel_no_04%>
<%= curlist5Rec.fax_no_04%>
<%= curlist5Rec.ptph_no_04%>
<%= curlist5Rec.email_id_04%>
<%= curlist5Rec.forn_zip_04%>
<%= curlist5Rec.forn_addr_04%>
<%= curlist5Rec.tel_no_05%>
<%= curlist5Rec.cntc_rshp%>
<%= curlist6Rec.carr_seq%>
<%= curlist6Rec.in_cmpy_dt%>
<%= curlist6Rec.lvcmpy_dt%>
<%= curlist6Rec.offi_nm%>
<%= curlist6Rec.dty%>
<%= curlist6Rec.posk%>
<%= curlist6Rec.asaly%>
<%= curlist6Rec.lvcmpy_resn%>
<%= curlist6Rec.natn_cd%>
<%= curlist6Rec.natn_nm%>
<%= curlist6Rec.duty_yys%>
<%= curlist6Rec.duty_dds%>
<%= curlist6Rec.carr_aprv_yys%>
<%= curlist6Rec.carr_aprv_dds%>
<%= curlist7Rec.qulf_pems_seq%>
<%= curlist7Rec.qulf_pems_cd%>
<%= curlist7Rec.qulf_pems_flnm%>
<%= curlist7Rec.acqr_dt%>
<%= curlist7Rec.mtry_dt%>
<%= curlist7Rec.qulf_no%>
<%= curlist7Rec.qulf_pems_issu_plac_cd%>
<%= curlist7Rec.qulf_pems_issu_plac_flnm%>
<%= curlist8Rec.frnc_word_seq%>
<%= curlist8Rec.frnc_word_cd%>
<%= curlist8Rec.frnc_word_cd_nm%>
<%= curlist8Rec.test_cd%>
<%= curlist8Rec.test_cd_nm%>
<%= curlist8Rec.test_grad%>
<%= curlist8Rec.test_scor%>
<%= curlist8Rec.test_dt%>
<%= curlist8Rec.test_enfc_instt%>
<%= curlist8Rec.spc_matt%>
<%= curlist9Rec.prtct_obj_clsf_cd%>
<%= curlist9Rec.prtct_obj_clsf_nm%>
<%= curlist9Rec.prtct_obj_pers_no%>
<%= curlist9Rec.prtct_grad_cd%>
<%= curlist9Rec.prtct_grad_nm%>
<%= curlist9Rec.prtct_obj_relatn%>
<%= curlist9Rec.prtct_obj_relatn_rshp_cd%>
<%= curlist9Rec.prtct_obj_relatn_rshp_nm%>
<%= curlist9Rec.prtct_appmt_ofbld_cd%>
<%= curlist9Rec.prtct_appmt_ofbld_nm%>
<%= curlist10Rec.gurt_insr_entr_dt%>
<%= curlist10Rec.gurt_insr_mtry_dt%>
<%= curlist10Rec.gurt_insr_amt%>
<%= curlist10Rec.gurt_insr_no%>
<%= curlist11Rec.dept_nm%>
<%= curlist11Rec.emp_no%>
<%= curlist11Rec.flnm%>
<%= curlist11Rec.appmt_nm%>
<%= curlist11Rec.appmt_resn_nm%>
<%= curlist11Rec.appmt_dt%>
<%= curlist11Rec.mtry_dt%>
<%= curlist11Rec.emp_clsf_nm%>
<%= curlist11Rec.dty_nm%>
<%= curlist11Rec.posi_nm%>
<%= curlist11Rec.emp_dtls_clsf_nm%>
<%= curlist11Rec.appmt_sort%>
<%= curlist11Rec.appmt_cont%>
<%= curlist11Rec.appmt_stat_clsf%>
<%= curlist12Rec.dept_nm%>
<%= curlist12Rec.emp_no%>
<%= curlist12Rec.flnm%>
<%= curlist12Rec.appmt_nm%>
<%= curlist12Rec.appmt_resn_nm%>
<%= curlist12Rec.appmt_dt%>
<%= curlist12Rec.mtry_dt%>
<%= curlist12Rec.emp_clsf_nm%>
<%= curlist12Rec.appmt_sort%>
<%= curlist12Rec.base_saly%>
<%= curlist12Rec.posk_saly%>
<%= curlist12Rec.saly_stot%>
<%= curlist12Rec.lvcmpy_acml_amt%>
<%= curlist12Rec.bns_incd_servcost%>
<%= curlist12Rec.appmt_cont%>
<%= curlist12Rec.clos_proc_yn_nm%>
<%= curlist12Rec.posk_clas_cd%>
<%= curlist12Rec.posk_clas_nm%>
<%= curlist13Rec.main_insp_ocom%>
<%= curlist13Rec.dept_nm%>
<%= curlist13Rec.dty_nm%>
<%= curlist13Rec.posi_nm%>
<%= curlist13Rec.main_insp_dt%>
<%= curlist13Rec.prz_pnsh_nm%>
<%= curlist13Rec.prz_grad%>
<%= curlist13Rec.prz_resn_nm%>
<%= curlist13Rec.case_nm%>
<%= curlist13Rec.atic_pubc_dt%>
<%= curlist13Rec.atic_pubc_side%>
<%= curlist13Rec.prz_amt%>
<%= curlist14Rec.dept_nm%>
<%= curlist14Rec.dty_nm%>
<%= curlist14Rec.posi_nm%>
<%= curlist14Rec.prz_dt%>
<%= curlist14Rec.prz_nm%>
<%= curlist14Rec.prz_resn%>
<%= curlist14Rec.prz_amt%>
<%= curlist14Rec.prz_ptcr%>
<%= curlist15Rec.frdt%>
<%= curlist15Rec.todt%>
<%= curlist15Rec.dept_nm%>
<%= curlist15Rec.part_nm%>
<%= curlist15Rec.cur_jobnon_nm%>
<%= curlist15Rec.chrg_job%>
<%= curlist15Rec.dtls_job%>
<%= curlist15Rec.aprv_stat_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */