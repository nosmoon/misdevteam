/***************************************************************************************************
* 파일명 : .java
* 기능 :  세션정보가져오기
* 작성일자 : 2014.03.31
* 작성자   : 노상현
***************************************************************************************************/


package chosun.ciis.co.mng.rec;

import java.sql.*;
import chosun.ciis.co.mng.dm.*;
import chosun.ciis.co.mng.ds.*;

/**
 * 세션정보가져오기
 */

public class CO_MNG_1050_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String part_cd;
	public String prn;
	public String empno;
	public String nm;
	public String acct_passwd;
	public String emp_clsf_cd;
	public String emp_clsf_nm;
	public String inpre_no;
	public String ptph;
	public String email_id;
	public String blng_cmpy_cd;
	public String blng_cmpy_nm;
	public String duty_cmpy_cd;
	public String duty_cmpy_nm;
	public String offi_real_hdqtboks_cd;
	public String offi_real_hdqtboks_nm;
	public String boks_team_cd;
	public String boks_team_nm;
	public String part_nm;
	public String class_cd;
	public String class_nm;
	public String posi_cd;
	public String posi_nm;
	public String dty_cd;
	public String dty_nm;
	public String job_clsf_use_vdty_dd;
	public String job_clsf_cd;
	public String job_clsf_nm;
	public String crm_usepers_type;
	public String lvcmpy_dt;
	public String crm_deal_bank_cd;
	public String crm_deal_bank_nm;
	public String crm_acct_no;
	public String crm_mang_area_cd;
	public String crm_mang_area_nm;
	public String crm_sell_dept_cd;
	public String crm_sell_dept_nm;
	public String crm_bof_cd;
	public String crm_sell_part_nm;
	public String crm_bof_nm;
	public String crm_area_cd;
	public String crm_area_nm;
	public String crm_hd_dept_cd;
	public String crm_hd_dept_nm;
	public String crm_bof_clsf;
	public String crm_bof_clsf_nm;
	public String crm_bill_grp_id;
	public String crm_bill_grp_type;
	public String crm_bill_blng_cd;
	public String crm_sell_part_cd;
	public String crm_mang_dept_cd;
	public String crm_mang_dept_nm;
	public String crm_cust_src_cd;
	public String crm_cust_src_nm;
	public String crm_publ_bo_cd;
	public String crm_publ_bo_nm;
	public String crm_job_clsf_cd;
	public String crm_job_clsf_nm;
	public String usb_key;
	public String pre_dept_cd;
	public String dept_chg_dt;
	public String rep_posi_type_cd;
	public String usb_key_reg_dt;
	public String vpn_user_yn;
	public String xcoop_use;
	public String elec_tax_bill_use;
	public String eis_user_level;
	public String team_bb_use;
	public String cust71;
	public String cust76;
	public String cust77;
	public String cust78;
	public String cust79;
	public String cust80;
	public String cust81;
	public String cust82;
	public String cust83;
	public String cust84;
	public String cust85;
	public String olap_yn;
	public String pwd_chg_dt;
	public String chief_yn;

	public CO_MNG_1050_LCURCOMMLISTRecord(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmpno(String empno){
		this.empno = empno;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public void setAcct_passwd(String acct_passwd){
		this.acct_passwd = acct_passwd;
	}

	public void setEmp_clsf_cd(String emp_clsf_cd){
		this.emp_clsf_cd = emp_clsf_cd;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setInpre_no(String inpre_no){
		this.inpre_no = inpre_no;
	}

	public void setPtph(String ptph){
		this.ptph = ptph;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setBlng_cmpy_cd(String blng_cmpy_cd){
		this.blng_cmpy_cd = blng_cmpy_cd;
	}

	public void setBlng_cmpy_nm(String blng_cmpy_nm){
		this.blng_cmpy_nm = blng_cmpy_nm;
	}

	public void setDuty_cmpy_cd(String duty_cmpy_cd){
		this.duty_cmpy_cd = duty_cmpy_cd;
	}

	public void setDuty_cmpy_nm(String duty_cmpy_nm){
		this.duty_cmpy_nm = duty_cmpy_nm;
	}

	public void setOffi_real_hdqtboks_cd(String offi_real_hdqtboks_cd){
		this.offi_real_hdqtboks_cd = offi_real_hdqtboks_cd;
	}

	public void setOffi_real_hdqtboks_nm(String offi_real_hdqtboks_nm){
		this.offi_real_hdqtboks_nm = offi_real_hdqtboks_nm;
	}

	public void setBoks_team_cd(String boks_team_cd){
		this.boks_team_cd = boks_team_cd;
	}

	public void setBoks_team_nm(String boks_team_nm){
		this.boks_team_nm = boks_team_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setClass_cd(String class_cd){
		this.class_cd = class_cd;
	}

	public void setClass_nm(String class_nm){
		this.class_nm = class_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setJob_clsf_use_vdty_dd(String job_clsf_use_vdty_dd){
		this.job_clsf_use_vdty_dd = job_clsf_use_vdty_dd;
	}

	public void setJob_clsf_cd(String job_clsf_cd){
		this.job_clsf_cd = job_clsf_cd;
	}

	public void setJob_clsf_nm(String job_clsf_nm){
		this.job_clsf_nm = job_clsf_nm;
	}

	public void setCrm_usepers_type(String crm_usepers_type){
		this.crm_usepers_type = crm_usepers_type;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setCrm_deal_bank_cd(String crm_deal_bank_cd){
		this.crm_deal_bank_cd = crm_deal_bank_cd;
	}

	public void setCrm_deal_bank_nm(String crm_deal_bank_nm){
		this.crm_deal_bank_nm = crm_deal_bank_nm;
	}

	public void setCrm_acct_no(String crm_acct_no){
		this.crm_acct_no = crm_acct_no;
	}

	public void setCrm_mang_area_cd(String crm_mang_area_cd){
		this.crm_mang_area_cd = crm_mang_area_cd;
	}

	public void setCrm_mang_area_nm(String crm_mang_area_nm){
		this.crm_mang_area_nm = crm_mang_area_nm;
	}

	public void setCrm_sell_dept_cd(String crm_sell_dept_cd){
		this.crm_sell_dept_cd = crm_sell_dept_cd;
	}

	public void setCrm_sell_dept_nm(String crm_sell_dept_nm){
		this.crm_sell_dept_nm = crm_sell_dept_nm;
	}

	public void setCrm_bof_cd(String crm_bof_cd){
		this.crm_bof_cd = crm_bof_cd;
	}

	public void setCrm_sell_part_nm(String crm_sell_part_nm){
		this.crm_sell_part_nm = crm_sell_part_nm;
	}

	public void setCrm_bof_nm(String crm_bof_nm){
		this.crm_bof_nm = crm_bof_nm;
	}

	public void setCrm_area_cd(String crm_area_cd){
		this.crm_area_cd = crm_area_cd;
	}

	public void setCrm_area_nm(String crm_area_nm){
		this.crm_area_nm = crm_area_nm;
	}

	public void setCrm_hd_dept_cd(String crm_hd_dept_cd){
		this.crm_hd_dept_cd = crm_hd_dept_cd;
	}

	public void setCrm_hd_dept_nm(String crm_hd_dept_nm){
		this.crm_hd_dept_nm = crm_hd_dept_nm;
	}

	public void setCrm_bof_clsf(String crm_bof_clsf){
		this.crm_bof_clsf = crm_bof_clsf;
	}

	public void setCrm_bof_clsf_nm(String crm_bof_clsf_nm){
		this.crm_bof_clsf_nm = crm_bof_clsf_nm;
	}

	public void setCrm_bill_grp_id(String crm_bill_grp_id){
		this.crm_bill_grp_id = crm_bill_grp_id;
	}

	public void setCrm_bill_grp_type(String crm_bill_grp_type){
		this.crm_bill_grp_type = crm_bill_grp_type;
	}

	public void setCrm_bill_blng_cd(String crm_bill_blng_cd){
		this.crm_bill_blng_cd = crm_bill_blng_cd;
	}

	public void setCrm_sell_part_cd(String crm_sell_part_cd){
		this.crm_sell_part_cd = crm_sell_part_cd;
	}

	public void setCrm_mang_dept_cd(String crm_mang_dept_cd){
		this.crm_mang_dept_cd = crm_mang_dept_cd;
	}

	public void setCrm_mang_dept_nm(String crm_mang_dept_nm){
		this.crm_mang_dept_nm = crm_mang_dept_nm;
	}

	public void setCrm_cust_src_cd(String crm_cust_src_cd){
		this.crm_cust_src_cd = crm_cust_src_cd;
	}

	public void setCrm_cust_src_nm(String crm_cust_src_nm){
		this.crm_cust_src_nm = crm_cust_src_nm;
	}

	public void setCrm_publ_bo_cd(String crm_publ_bo_cd){
		this.crm_publ_bo_cd = crm_publ_bo_cd;
	}

	public void setCrm_publ_bo_nm(String crm_publ_bo_nm){
		this.crm_publ_bo_nm = crm_publ_bo_nm;
	}

	public void setCrm_job_clsf_cd(String crm_job_clsf_cd){
		this.crm_job_clsf_cd = crm_job_clsf_cd;
	}

	public void setCrm_job_clsf_nm(String crm_job_clsf_nm){
		this.crm_job_clsf_nm = crm_job_clsf_nm;
	}

	public void setUsb_key(String usb_key){
		this.usb_key = usb_key;
	}

	public void setPre_dept_cd(String pre_dept_cd){
		this.pre_dept_cd = pre_dept_cd;
	}

	public void setDept_chg_dt(String dept_chg_dt){
		this.dept_chg_dt = dept_chg_dt;
	}

	public void setRep_posi_type_cd(String rep_posi_type_cd){
		this.rep_posi_type_cd = rep_posi_type_cd;
	}

	public void setUsb_key_reg_dt(String usb_key_reg_dt){
		this.usb_key_reg_dt = usb_key_reg_dt;
	}

	public void setVpn_user_yn(String vpn_user_yn){
		this.vpn_user_yn = vpn_user_yn;
	}

	public void setXcoop_use(String xcoop_use){
		this.xcoop_use = xcoop_use;
	}

	public void setElec_tax_bill_use(String elec_tax_bill_use){
		this.elec_tax_bill_use = elec_tax_bill_use;
	}

	public void setEis_user_level(String eis_user_level){
		this.eis_user_level = eis_user_level;
	}

	public void setTeam_bb_use(String team_bb_use){
		this.team_bb_use = team_bb_use;
	}

	public void setCust71(String cust71){
		this.cust71 = cust71;
	}

	public void setCust76(String cust76){
		this.cust76 = cust76;
	}

	public void setCust77(String cust77){
		this.cust77 = cust77;
	}

	public void setCust78(String cust78){
		this.cust78 = cust78;
	}

	public void setCust79(String cust79){
		this.cust79 = cust79;
	}

	public void setCust80(String cust80){
		this.cust80 = cust80;
	}

	public void setCust81(String cust81){
		this.cust81 = cust81;
	}

	public void setCust82(String cust82){
		this.cust82 = cust82;
	}

	public void setCust83(String cust83){
		this.cust83 = cust83;
	}

	public void setCust84(String cust84){
		this.cust84 = cust84;
	}

	public void setCust85(String cust85){
		this.cust85 = cust85;
	}

	public void setOlap_yn(String olap_yn){
		this.olap_yn = olap_yn;
	}

	public void setPwd_chg_dt(String pwd_chg_dt){
		this.pwd_chg_dt = pwd_chg_dt;
	}

	public void setChief_yn(String chief_yn){
		this.chief_yn = chief_yn;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmpno(){
		return this.empno;
	}

	public String getNm(){
		return this.nm;
	}

	public String getAcct_passwd(){
		return this.acct_passwd;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getInpre_no(){
		return this.inpre_no;
	}

	public String getPtph(){
		return this.ptph;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getBlng_cmpy_cd(){
		return this.blng_cmpy_cd;
	}

	public String getBlng_cmpy_nm(){
		return this.blng_cmpy_nm;
	}

	public String getDuty_cmpy_cd(){
		return this.duty_cmpy_cd;
	}

	public String getDuty_cmpy_nm(){
		return this.duty_cmpy_nm;
	}

	public String getOffi_real_hdqtboks_cd(){
		return this.offi_real_hdqtboks_cd;
	}

	public String getOffi_real_hdqtboks_nm(){
		return this.offi_real_hdqtboks_nm;
	}

	public String getBoks_team_cd(){
		return this.boks_team_cd;
	}

	public String getBoks_team_nm(){
		return this.boks_team_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getClass_cd(){
		return this.class_cd;
	}

	public String getClass_nm(){
		return this.class_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getJob_clsf_use_vdty_dd(){
		return this.job_clsf_use_vdty_dd;
	}

	public String getJob_clsf_cd(){
		return this.job_clsf_cd;
	}

	public String getJob_clsf_nm(){
		return this.job_clsf_nm;
	}

	public String getCrm_usepers_type(){
		return this.crm_usepers_type;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getCrm_deal_bank_cd(){
		return this.crm_deal_bank_cd;
	}

	public String getCrm_deal_bank_nm(){
		return this.crm_deal_bank_nm;
	}

	public String getCrm_acct_no(){
		return this.crm_acct_no;
	}

	public String getCrm_mang_area_cd(){
		return this.crm_mang_area_cd;
	}

	public String getCrm_mang_area_nm(){
		return this.crm_mang_area_nm;
	}

	public String getCrm_sell_dept_cd(){
		return this.crm_sell_dept_cd;
	}

	public String getCrm_sell_dept_nm(){
		return this.crm_sell_dept_nm;
	}

	public String getCrm_bof_cd(){
		return this.crm_bof_cd;
	}

	public String getCrm_sell_part_nm(){
		return this.crm_sell_part_nm;
	}

	public String getCrm_bof_nm(){
		return this.crm_bof_nm;
	}

	public String getCrm_area_cd(){
		return this.crm_area_cd;
	}

	public String getCrm_area_nm(){
		return this.crm_area_nm;
	}

	public String getCrm_hd_dept_cd(){
		return this.crm_hd_dept_cd;
	}

	public String getCrm_hd_dept_nm(){
		return this.crm_hd_dept_nm;
	}

	public String getCrm_bof_clsf(){
		return this.crm_bof_clsf;
	}

	public String getCrm_bof_clsf_nm(){
		return this.crm_bof_clsf_nm;
	}

	public String getCrm_bill_grp_id(){
		return this.crm_bill_grp_id;
	}

	public String getCrm_bill_grp_type(){
		return this.crm_bill_grp_type;
	}

	public String getCrm_bill_blng_cd(){
		return this.crm_bill_blng_cd;
	}

	public String getCrm_sell_part_cd(){
		return this.crm_sell_part_cd;
	}

	public String getCrm_mang_dept_cd(){
		return this.crm_mang_dept_cd;
	}

	public String getCrm_mang_dept_nm(){
		return this.crm_mang_dept_nm;
	}

	public String getCrm_cust_src_cd(){
		return this.crm_cust_src_cd;
	}

	public String getCrm_cust_src_nm(){
		return this.crm_cust_src_nm;
	}

	public String getCrm_publ_bo_cd(){
		return this.crm_publ_bo_cd;
	}

	public String getCrm_publ_bo_nm(){
		return this.crm_publ_bo_nm;
	}

	public String getCrm_job_clsf_cd(){
		return this.crm_job_clsf_cd;
	}

	public String getCrm_job_clsf_nm(){
		return this.crm_job_clsf_nm;
	}

	public String getUsb_key(){
		return this.usb_key;
	}

	public String getPre_dept_cd(){
		return this.pre_dept_cd;
	}

	public String getDept_chg_dt(){
		return this.dept_chg_dt;
	}

	public String getRep_posi_type_cd(){
		return this.rep_posi_type_cd;
	}

	public String getUsb_key_reg_dt(){
		return this.usb_key_reg_dt;
	}

	public String getVpn_user_yn(){
		return this.vpn_user_yn;
	}

	public String getXcoop_use(){
		return this.xcoop_use;
	}

	public String getElec_tax_bill_use(){
		return this.elec_tax_bill_use;
	}

	public String getEis_user_level(){
		return this.eis_user_level;
	}

	public String getTeam_bb_use(){
		return this.team_bb_use;
	}

	public String getCust71(){
		return this.cust71;
	}

	public String getCust76(){
		return this.cust76;
	}

	public String getCust77(){
		return this.cust77;
	}

	public String getCust78(){
		return this.cust78;
	}

	public String getCust79(){
		return this.cust79;
	}

	public String getCust80(){
		return this.cust80;
	}

	public String getCust81(){
		return this.cust81;
	}

	public String getCust82(){
		return this.cust82;
	}

	public String getCust83(){
		return this.cust83;
	}

	public String getCust84(){
		return this.cust84;
	}

	public String getCust85(){
		return this.cust85;
	}

	public String getOlap_yn(){
		return this.olap_yn;
	}

	public String getPwd_chg_dt(){
		return this.pwd_chg_dt;
	}

	public String getChief_yn(){
		return this.chief_yn;
	}
}

/* 작성시간 : Mon Mar 31 12:32:10 KST 2014 */