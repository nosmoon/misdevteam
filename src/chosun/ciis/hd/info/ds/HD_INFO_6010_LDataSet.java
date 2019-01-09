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


public class HD_INFO_6010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	
	public String errcode;
	public String errmsg;
	public String xx_deptcd_010;

	public HD_INFO_6010_LDataSet(){}
	public HD_INFO_6010_LDataSet(String errcode, String errmsg, String xx_deptcd_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_deptcd_010 = xx_deptcd_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}
	
	public void setXx_deptcd_010(String xx_deptcd_010){
		this.xx_deptcd_010 = xx_deptcd_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
	
	public String getXx_deptcd_010(){
		return this.xx_deptcd_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_deptcd_010 = Util.checkString(cstmt.getString(5));
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


/* 작성시간 : Thu Apr 07 17:50:19 KST 2016 */