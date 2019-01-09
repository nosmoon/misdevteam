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


package chosun.ciis.as.aset.dm;

import java.io.*;
import java.sql.*;

import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;
import chosun.ciis.as.com.rec.AS_COM_1000_SCURLISTRecord;
import chosun.ciis.co.base.util.Base64Util;
import chosun.ciis.co.base.util.StreamUtil;

/**
 * 
 */


public class AS_ASET_1008_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String item_cd;
	public String unit_cd;
	public String budg_cd;
	public String redm_clsf;
	public String redm_mthd_cd;
	public String svc_yys_cnt;
	public String aset_no;
	public String aset_nm;
	public String buy_clsf;
	public String aset_stat;
	public String dept_cd;
	public String acqr_dt;
	public String orgin_acqr_amt;
	public String vat_amt;
	public String dlco_clsf_cd;
	public String dlco_ern;
	public String bund_cd;
	public String aset_size;
	public String aset_loca;
	public String aset_qunt_cnt;
	public String aset_usag;
	public String aset_grp_yn;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String insr_type_cd;
	public String use_emp_no;
	public String use_cmpy_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String mst_remk;
	public String mst_chnl_clsf_cd;	
	public String land_plcw;
	public String acqr_land_amt;
	public String acqr_yymm;
	public String now_land_amt;
	public String now_yymm;
	public String land_usag;
	public String rela_aset_no;
	public String bldg_plcw;
	public String land_size;
	public String bldg_size;
	public String flor_size;
	public String arch;
	public String flor_cnt;
	public String cmpl_yymm;
	public String acqr_tax_amt;
	public String acqr_tax_yymm;
	public String now_tax_amt;
	public String now_tax_yymm;
	public String blng_ward_offi;
	public String under_flor;
	public String under_size;
	public String bldg_prmt_dt;
	public String leas_ern_no;
	public String rela_no;
	public String car_no;
	public String usag;
	public String car_engine_size;
	public String car_kind;
	public String insr_no;
	public String quorum_cnt;
	public String car_mang_no;
	public String car_make_yymm;
	public String car_usag;
	public String use_car_oil;
	public String make_natn;
	public String make_cmpy;
	public String make_yymm;
	public String make_no;
	public String mang_no;
	public String remk;
	public String file_size;
	//public Blob up_phot_img;
	public byte[] up_phot_img;
	//public byte[] up_phot_img = new byte[1048576];

	public AS_ASET_1008_ADM(){}
	//public AS_ASET_1008_ADM(String mode, String cmpy_cd, String item_cd, String aset_no, String aset_nm, String buy_clsf, String aset_stat, String dept_cd, String acqr_dt, String orgin_acqr_amt, String vat_amt, String dlco_clsf_cd, String dlco_ern, String bund_cd, String aset_size, String aset_loca, String aset_qunt_cnt, String aset_usag, String aset_grp_yn, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String land_plcw, String acqr_land_amt, String acqr_yymm, String now_land_amt, String now_yymm, String land_usag, String rela_aset_no, String bldg_plcw, String land_size, String bldg_size, String flor_size, String arch, String flor_cnt, String cmpl_yymm, String acqr_tax_amt, String acqr_tax_yymm, String now_tax_amt, String now_tax_yymm, String blng_ward_offi, String under_flor, String under_size, String bldg_prmt_dt, String leas_ern_no, String rela_no, String car_no, String usag, String car_engine_size, String car_kind, String insr_no, String quorum_cnt, String car_mang_no, String car_make_yymm, String car_usag, String use_car_oil, String make_natn, String make_cmpy, String make_yymm, String make_no, String mang_no, String remk, String file_size, Blob up_phot_img){
	//public AS_ASET_1008_ADM(String mode, String cmpy_cd, String item_cd, String unit_cd, String budg_cd, String redm_clsf, String redm_mthd_cd, String svc_yys_cnt, String aset_no, String aset_nm, String buy_clsf, String aset_stat, String dept_cd, String acqr_dt, String orgin_acqr_amt, String vat_amt, String dlco_clsf_cd, String dlco_ern, String bund_cd, String aset_size, String aset_loca, String aset_qunt_cnt, String aset_usag, String aset_grp_yn, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String land_plcw, String acqr_land_amt, String acqr_yymm, String now_land_amt, String now_yymm, String land_usag, String rela_aset_no, String bldg_plcw, String land_size, String bldg_size, String flor_size, String arch, String flor_cnt, String cmpl_yymm, String acqr_tax_amt, String acqr_tax_yymm, String now_tax_amt, String now_tax_yymm, String blng_ward_offi, String under_flor, String under_size, String bldg_prmt_dt, String leas_ern_no, String rela_no, String car_no, String usag, String car_engine_size, String car_kind, String insr_no, String quorum_cnt, String car_mang_no, String car_make_yymm, String car_usag, String use_car_oil, String make_natn, String make_cmpy, String make_yymm, String make_no, String mang_no, String remk, String file_size, byte[] up_phot_img){
	public AS_ASET_1008_ADM(String mode, String cmpy_cd, String item_cd, String unit_cd, String budg_cd, String redm_clsf, String redm_mthd_cd, String svc_yys_cnt, String aset_no, String aset_nm, String buy_clsf, String aset_stat, String dept_cd, String acqr_dt, String orgin_acqr_amt, String vat_amt, String dlco_clsf_cd, String dlco_ern, String bund_cd, String aset_size, String aset_loca, String aset_qunt_cnt, String aset_usag, String aset_grp_yn, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String insr_type_cd, String use_emp_no, String use_cmpy_cd, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String mst_remk, String mst_chnl_clsf_cd, String land_plcw, String acqr_land_amt, String acqr_yymm, String now_land_amt, String now_yymm, String land_usag, String rela_aset_no, String bldg_plcw, String land_size, String bldg_size, String flor_size, String arch, String flor_cnt, String cmpl_yymm, String acqr_tax_amt, String acqr_tax_yymm, String now_tax_amt, String now_tax_yymm, String blng_ward_offi, String under_flor, String under_size, String bldg_prmt_dt, String leas_ern_no, String rela_no, String car_no, String usag, String car_engine_size, String car_kind, String insr_no, String quorum_cnt, String car_mang_no, String car_make_yymm, String car_usag, String use_car_oil, String make_natn, String make_cmpy, String make_yymm, String make_no, String mang_no, String remk, String file_size, byte[] up_phot_img){
	//public AS_ASET_1008_ADM(String mode, String cmpy_cd, String item_cd, String aset_no, String aset_nm, String buy_clsf, String aset_stat, String dept_cd, String acqr_dt, String orgin_acqr_amt, String vat_amt, String dlco_clsf_cd, String dlco_ern, String bund_cd, String aset_size, String aset_loca, String aset_qunt_cnt, String aset_usag, String aset_grp_yn, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String land_plcw, String acqr_land_amt, String acqr_yymm, String now_land_amt, String now_yymm, String land_usag, String rela_aset_no, String bldg_plcw, String land_size, String bldg_size, String flor_size, String arch, String flor_cnt, String cmpl_yymm, String acqr_tax_amt, String acqr_tax_yymm, String now_tax_amt, String now_tax_yymm, String blng_ward_offi, String under_flor, String under_size, String bldg_prmt_dt, String leas_ern_no, String rela_no, String car_no, String usag, String car_engine_size, String car_kind, String insr_no, String quorum_cnt, String car_mang_no, String car_make_yymm, String car_usag, String use_car_oil, String make_natn, String make_cmpy, String make_yymm, String make_no, String mang_no, String remk){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.item_cd = item_cd;
		this.unit_cd = unit_cd;
		this.budg_cd = budg_cd;
		this.redm_clsf = redm_clsf;
		this.redm_mthd_cd = redm_mthd_cd;
		this.svc_yys_cnt = svc_yys_cnt;
		this.aset_no = aset_no;
		this.aset_nm = aset_nm;
		this.buy_clsf = buy_clsf;
		this.aset_stat = aset_stat;
		this.dept_cd = dept_cd;
		this.acqr_dt = acqr_dt;
		this.orgin_acqr_amt = orgin_acqr_amt;
		this.vat_amt = vat_amt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_ern = dlco_ern;
		this.bund_cd = bund_cd;
		this.aset_size = aset_size;
		this.aset_loca = aset_loca;
		this.aset_qunt_cnt = aset_qunt_cnt;
		this.aset_usag = aset_usag;
		this.aset_grp_yn = aset_grp_yn;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.insr_type_cd = insr_type_cd;
		this.use_emp_no = use_emp_no;
		this.use_cmpy_cd = use_cmpy_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.mst_remk = mst_remk;
		this.mst_chnl_clsf_cd = mst_chnl_clsf_cd;
		this.land_plcw = land_plcw;
		this.acqr_land_amt = acqr_land_amt;
		this.acqr_yymm = acqr_yymm;
		this.now_land_amt = now_land_amt;
		this.now_yymm = now_yymm;
		this.land_usag = land_usag;
		this.rela_aset_no = rela_aset_no;
		this.bldg_plcw = bldg_plcw;
		this.land_size = land_size;
		this.bldg_size = bldg_size;
		this.flor_size = flor_size;
		this.arch = arch;
		this.flor_cnt = flor_cnt;
		this.cmpl_yymm = cmpl_yymm;
		this.acqr_tax_amt = acqr_tax_amt;
		this.acqr_tax_yymm = acqr_tax_yymm;
		this.now_tax_amt = now_tax_amt;
		this.now_tax_yymm = now_tax_yymm;
		this.blng_ward_offi = blng_ward_offi;
		this.under_flor = under_flor;
		this.under_size = under_size;
		this.bldg_prmt_dt = bldg_prmt_dt;
		this.leas_ern_no = leas_ern_no;
		this.rela_no = rela_no;
		this.car_no = car_no;
		this.usag = usag;
		this.car_engine_size = car_engine_size;
		this.car_kind = car_kind;
		this.insr_no = insr_no;
		this.quorum_cnt = quorum_cnt;
		this.car_mang_no = car_mang_no;
		this.car_make_yymm = car_make_yymm;
		this.car_usag = car_usag;
		this.use_car_oil = use_car_oil;
		this.make_natn = make_natn;
		this.make_cmpy = make_cmpy;
		this.make_yymm = make_yymm;
		this.make_no = make_no;
		this.mang_no = mang_no;
		this.remk = remk;
		this.file_size = file_size;
		this.up_phot_img = up_phot_img;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setItem_cd(String item_cd){
		this.item_cd = item_cd;
	}

	public void setUnit_cd(String unit_cd){
		this.unit_cd = unit_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setRedm_clsf(String redm_clsf){
		this.redm_clsf = redm_clsf;
	}

	public void setRedm_mthd_cd(String redm_mthd_cd){
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public void setSvc_yys_cnt(String svc_yys_cnt){
		this.svc_yys_cnt = svc_yys_cnt;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setBuy_clsf(String buy_clsf){
		this.buy_clsf = buy_clsf;
	}

	public void setAset_stat(String aset_stat){
		this.aset_stat = aset_stat;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setOrgin_acqr_amt(String orgin_acqr_amt){
		this.orgin_acqr_amt = orgin_acqr_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setBund_cd(String bund_cd){
		this.bund_cd = bund_cd;
	}

	public void setAset_size(String aset_size){
		this.aset_size = aset_size;
	}

	public void setAset_loca(String aset_loca){
		this.aset_loca = aset_loca;
	}

	public void setAset_qunt_cnt(String aset_qunt_cnt){
		this.aset_qunt_cnt = aset_qunt_cnt;
	}

	public void setAset_usag(String aset_usag){
		this.aset_usag = aset_usag;
	}

	public void setAset_grp_yn(String aset_grp_yn){
		this.aset_grp_yn = aset_grp_yn;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setInsr_type_cd(String insr_type_cd){
		this.insr_type_cd = insr_type_cd;
	}

	public void setUse_emp_no(String use_emp_no){
		this.use_emp_no = use_emp_no;
	}

	public void setUse_cmpy_cd(String use_cmpy_cd){
		this.use_cmpy_cd = use_cmpy_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}
	
	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setMst_remk(String mst_remk){
		this.mst_remk = mst_remk;
	}
	
	public void setMst_chnl_clsf_cd(String mst_chnl_clsf_cd){
		this.mst_chnl_clsf_cd = mst_chnl_clsf_cd;
	}

	public void setLand_plcw(String land_plcw){
		this.land_plcw = land_plcw;
	}

	public void setAcqr_land_amt(String acqr_land_amt){
		this.acqr_land_amt = acqr_land_amt;
	}

	public void setAcqr_yymm(String acqr_yymm){
		this.acqr_yymm = acqr_yymm;
	}

	public void setNow_land_amt(String now_land_amt){
		this.now_land_amt = now_land_amt;
	}

	public void setNow_yymm(String now_yymm){
		this.now_yymm = now_yymm;
	}

	public void setLand_usag(String land_usag){
		this.land_usag = land_usag;
	}

	public void setRela_aset_no(String rela_aset_no){
		this.rela_aset_no = rela_aset_no;
	}

	public void setBldg_plcw(String bldg_plcw){
		this.bldg_plcw = bldg_plcw;
	}

	public void setLand_size(String land_size){
		this.land_size = land_size;
	}

	public void setBldg_size(String bldg_size){
		this.bldg_size = bldg_size;
	}

	public void setFlor_size(String flor_size){
		this.flor_size = flor_size;
	}

	public void setArch(String arch){
		this.arch = arch;
	}

	public void setFlor_cnt(String flor_cnt){
		this.flor_cnt = flor_cnt;
	}

	public void setCmpl_yymm(String cmpl_yymm){
		this.cmpl_yymm = cmpl_yymm;
	}

	public void setAcqr_tax_amt(String acqr_tax_amt){
		this.acqr_tax_amt = acqr_tax_amt;
	}

	public void setAcqr_tax_yymm(String acqr_tax_yymm){
		this.acqr_tax_yymm = acqr_tax_yymm;
	}

	public void setNow_tax_amt(String now_tax_amt){
		this.now_tax_amt = now_tax_amt;
	}

	public void setNow_tax_yymm(String now_tax_yymm){
		this.now_tax_yymm = now_tax_yymm;
	}

	public void setBlng_ward_offi(String blng_ward_offi){
		this.blng_ward_offi = blng_ward_offi;
	}

	public void setUnder_flor(String under_flor){
		this.under_flor = under_flor;
	}

	public void setUnder_size(String under_size){
		this.under_size = under_size;
	}

	public void setBldg_prmt_dt(String bldg_prmt_dt){
		this.bldg_prmt_dt = bldg_prmt_dt;
	}

	public void setLeas_ern_no(String leas_ern_no){
		this.leas_ern_no = leas_ern_no;
	}

	public void setRela_no(String rela_no){
		this.rela_no = rela_no;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setCar_engine_size(String car_engine_size){
		this.car_engine_size = car_engine_size;
	}

	public void setCar_kind(String car_kind){
		this.car_kind = car_kind;
	}

	public void setInsr_no(String insr_no){
		this.insr_no = insr_no;
	}

	public void setQuorum_cnt(String quorum_cnt){
		this.quorum_cnt = quorum_cnt;
	}

	public void setCar_mang_no(String car_mang_no){
		this.car_mang_no = car_mang_no;
	}

	public void setCar_make_yymm(String car_make_yymm){
		this.car_make_yymm = car_make_yymm;
	}

	public void setCar_usag(String car_usag){
		this.car_usag = car_usag;
	}

	public void setUse_car_oil(String use_car_oil){
		this.use_car_oil = use_car_oil;
	}

	public void setMake_natn(String make_natn){
		this.make_natn = make_natn;
	}

	public void setMake_cmpy(String make_cmpy){
		this.make_cmpy = make_cmpy;
	}

	public void setMake_yymm(String make_yymm){
		this.make_yymm = make_yymm;
	}

	public void setMake_no(String make_no){
		this.make_no = make_no;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setFile_size(String file_size){
		this.file_size = file_size;
	}
/*
	public void setUp_phot_img(Blob up_phot_img){
		this.up_phot_img = up_phot_img;
	}
*/
	public void setUp_phot_img(byte[] up_phot_img){
		this.up_phot_img = up_phot_img;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getItem_cd(){
		return this.item_cd;
	}

	public String getUnit_cd(){
		return this.unit_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getRedm_clsf(){
		return this.redm_clsf;
	}

	public String getRedm_mthd_cd(){
		return this.redm_mthd_cd;
	}

	public String getSvc_yys_cnt(){
		return this.svc_yys_cnt;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getBuy_clsf(){
		return this.buy_clsf;
	}

	public String getAset_stat(){
		return this.aset_stat;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getOrgin_acqr_amt(){
		return this.orgin_acqr_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getBund_cd(){
		return this.bund_cd;
	}

	public String getAset_size(){
		return this.aset_size;
	}

	public String getAset_loca(){
		return this.aset_loca;
	}

	public String getAset_qunt_cnt(){
		return this.aset_qunt_cnt;
	}

	public String getAset_usag(){
		return this.aset_usag;
	}

	public String getAset_grp_yn(){
		return this.aset_grp_yn;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getInsr_type_cd(){
		return this.insr_type_cd;
	}

	public String getUse_emp_no(){
		return this.use_emp_no;
	}

	public String getUse_cmpy_cd(){
		return this.use_cmpy_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}
	
	public String getMst_remk(){
		return this.mst_remk;
	}
	
	public String getMst_chnl_clsf_cd(){
		return this.mst_chnl_clsf_cd;
	}

	public String getLand_plcw(){
		return this.land_plcw;
	}

	public String getAcqr_land_amt(){
		return this.acqr_land_amt;
	}

	public String getAcqr_yymm(){
		return this.acqr_yymm;
	}

	public String getNow_land_amt(){
		return this.now_land_amt;
	}

	public String getNow_yymm(){
		return this.now_yymm;
	}

	public String getLand_usag(){
		return this.land_usag;
	}

	public String getRela_aset_no(){
		return this.rela_aset_no;
	}

	public String getBldg_plcw(){
		return this.bldg_plcw;
	}

	public String getLand_size(){
		return this.land_size;
	}

	public String getBldg_size(){
		return this.bldg_size;
	}

	public String getFlor_size(){
		return this.flor_size;
	}

	public String getArch(){
		return this.arch;
	}

	public String getFlor_cnt(){
		return this.flor_cnt;
	}

	public String getCmpl_yymm(){
		return this.cmpl_yymm;
	}

	public String getAcqr_tax_amt(){
		return this.acqr_tax_amt;
	}

	public String getAcqr_tax_yymm(){
		return this.acqr_tax_yymm;
	}

	public String getNow_tax_amt(){
		return this.now_tax_amt;
	}

	public String getNow_tax_yymm(){
		return this.now_tax_yymm;
	}

	public String getBlng_ward_offi(){
		return this.blng_ward_offi;
	}

	public String getUnder_flor(){
		return this.under_flor;
	}

	public String getUnder_size(){
		return this.under_size;
	}

	public String getBldg_prmt_dt(){
		return this.bldg_prmt_dt;
	}

	public String getLeas_ern_no(){
		return this.leas_ern_no;
	}

	public String getRela_no(){
		return this.rela_no;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getCar_engine_size(){
		return this.car_engine_size;
	}

	public String getCar_kind(){
		return this.car_kind;
	}

	public String getInsr_no(){
		return this.insr_no;
	}

	public String getQuorum_cnt(){
		return this.quorum_cnt;
	}

	public String getCar_mang_no(){
		return this.car_mang_no;
	}

	public String getCar_make_yymm(){
		return this.car_make_yymm;
	}

	public String getCar_usag(){
		return this.car_usag;
	}

	public String getUse_car_oil(){
		return this.use_car_oil;
	}

	public String getMake_natn(){
		return this.make_natn;
	}

	public String getMake_cmpy(){
		return this.make_cmpy;
	}

	public String getMake_yymm(){
		return this.make_yymm;
	}

	public String getMake_no(){
		return this.make_no;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getFile_size(){
		return this.file_size;
	}
/*
	public Blob getUp_phot_img(){
		return this.up_phot_img;
	}
*/
	public byte[] getUp_phot_img(){
		return this.up_phot_img;
	}

	public String getSQL(){
		 //return "{ call MISAST.SP_AS_ASET_1008_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
		 return "{ call MISAST.SP_AS_ASET_1008_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,?,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1008_ADM dm = (AS_ASET_1008_ADM)bdm;

		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.item_cd);
		cstmt.setString(6, dm.unit_cd);
		cstmt.setString(7, dm.budg_cd);
		cstmt.setString(8, dm.redm_clsf);
		cstmt.setString(9, dm.redm_mthd_cd);
		cstmt.setString(10, dm.svc_yys_cnt);
		cstmt.setString(11, dm.aset_no);
		cstmt.setString(12, dm.aset_nm);
		cstmt.setString(13, dm.buy_clsf);
		cstmt.setString(14, dm.aset_stat);	
		cstmt.setString(15, dm.dept_cd);
		cstmt.setString(16, dm.acqr_dt);
		cstmt.setString(17, dm.orgin_acqr_amt);
		cstmt.setString(18, dm.vat_amt);
		cstmt.setString(19, dm.dlco_clsf_cd);
		cstmt.setString(20, dm.dlco_ern);
		cstmt.setString(21, dm.bund_cd);
		cstmt.setString(22, dm.aset_size);
		cstmt.setString(23, dm.aset_loca);
		cstmt.setString(24, dm.aset_qunt_cnt);
		cstmt.setString(25, dm.aset_usag);
		cstmt.setString(26, dm.aset_grp_yn);
		cstmt.setString(27, dm.slip_occr_dt);
		cstmt.setString(28, dm.slip_clsf_cd);
		cstmt.setString(29, dm.slip_seq);
		cstmt.setString(30, dm.insr_type_cd);
		cstmt.setString(31, dm.use_emp_no);
		cstmt.setString(32, dm.use_cmpy_cd);
		cstmt.setString(33, dm.incmg_pers_ipadd);
		cstmt.setString(34, dm.incmg_pers);
		cstmt.setString(35, dm.chg_pers);
		cstmt.setString(36, dm.mst_remk);
		cstmt.setString(37, dm.mst_chnl_clsf_cd);
		cstmt.setString(38, dm.land_plcw);
		cstmt.setString(39, dm.acqr_land_amt);
		cstmt.setString(40, dm.acqr_yymm);
		cstmt.setString(41, dm.now_land_amt);
		cstmt.setString(42, dm.now_yymm);
		cstmt.setString(43, dm.land_usag);
		cstmt.setString(44, dm.rela_aset_no);
		cstmt.setString(45, dm.bldg_plcw);
		cstmt.setString(46, dm.land_size);
		cstmt.setString(47, dm.bldg_size);
		cstmt.setString(48, dm.flor_size);
		cstmt.setString(49, dm.arch);
		cstmt.setString(50, dm.flor_cnt);
		cstmt.setString(51, dm.cmpl_yymm);
		cstmt.setString(52, dm.acqr_tax_amt);
		cstmt.setString(53, dm.acqr_tax_yymm);
		cstmt.setString(54, dm.now_tax_amt);
		cstmt.setString(55, dm.now_tax_yymm);
		cstmt.setString(56, dm.blng_ward_offi);
		cstmt.setString(57, dm.under_flor);
		cstmt.setString(58, dm.under_size);
		cstmt.setString(59, dm.bldg_prmt_dt);
		cstmt.setString(60, dm.leas_ern_no);
		cstmt.setString(61, dm.rela_no);
		cstmt.setString(62, dm.car_no);
		cstmt.setString(63, dm.usag);
		cstmt.setString(64, dm.car_engine_size);
		cstmt.setString(65, dm.car_kind);
		cstmt.setString(66, dm.insr_no);
		cstmt.setString(67, dm.quorum_cnt);
		cstmt.setString(68, dm.car_mang_no);
		cstmt.setString(69, dm.car_make_yymm);
		cstmt.setString(70, dm.car_usag);
		cstmt.setString(71, dm.use_car_oil);
		cstmt.setString(72, dm.make_natn);
		cstmt.setString(73, dm.make_cmpy);
		cstmt.setString(74, dm.make_yymm);
		cstmt.setString(75, dm.make_no);
		cstmt.setString(76, dm.mang_no);
		cstmt.setString(77, dm.remk);
		cstmt.setString(78, dm.file_size);
		cstmt.setBytes(79, dm.getUp_phot_img());	
			
		//cstmt.setCharacterStream(69, new StringReader(dm.getUp_phot_img().toString()), dm.getUp_phot_img().toString().length());
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1008_ADataSet();
	}



    public void print(){
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("item_cd = [" + getItem_cd() + "]");
		System.out.println("unit_cd = [" + getUnit_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("redm_clsf = [" + getRedm_clsf() + "]");
		System.out.println("redm_mthd_cd = [" + getRedm_mthd_cd() + "]");
		System.out.println("svc_yys_cnt = [" + getSvc_yys_cnt() + "]");
		System.out.println("aset_no = [" + getAset_no() + "]");
		System.out.println("aset_nm = [" + getAset_nm() + "]");
		System.out.println("buy_clsf = [" + getBuy_clsf() + "]");
		System.out.println("aset_stat = [" + getAset_stat() + "]");	
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("acqr_dt = [" + getAcqr_dt() + "]");
		System.out.println("orgin_acqr_amt = [" + getOrgin_acqr_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_ern = [" + getDlco_ern() + "]");
		System.out.println("bund_cd = [" + getBund_cd() + "]");
		System.out.println("aset_size = [" + getAset_size() + "]");
		System.out.println("aset_loca = [" + getAset_loca() + "]");
		System.out.println("aset_qunt_cnt = [" + getAset_qunt_cnt() + "]");
		System.out.println("aset_usag = [" + getAset_usag() + "]");
		System.out.println("aset_grp_yn = [" + getAset_grp_yn() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("mst_remk = [" + getMst_remk() + "]");
		System.out.println("mst_chnl_clsf_cd = [" + getMst_chnl_clsf_cd() + "]");
		System.out.println("land_plcw = [" + getLand_plcw() + "]");
		System.out.println("acqr_land_amt = [" + getAcqr_land_amt() + "]");
		System.out.println("acqr_yymm = [" + getAcqr_yymm() + "]");
		System.out.println("now_land_amt = [" + getNow_land_amt() + "]");
		System.out.println("now_yymm = [" + getNow_yymm() + "]");
		System.out.println("land_usag = [" + getLand_usag() + "]");
		System.out.println("rela_aset_no = [" + getRela_aset_no() + "]");
		System.out.println("bldg_plcw = [" + getBldg_plcw() + "]");
		System.out.println("land_size = [" + getLand_size() + "]");
		System.out.println("bldg_size = [" + getBldg_size() + "]");
		System.out.println("flor_size = [" + getFlor_size() + "]");
		System.out.println("arch = [" + getArch() + "]");
		System.out.println("flor_cnt = [" + getFlor_cnt() + "]");
		System.out.println("cmpl_yymm = [" + getCmpl_yymm() + "]");
		System.out.println("acqr_tax_amt = [" + getAcqr_tax_amt() + "]");
		System.out.println("acqr_tax_yymm = [" + getAcqr_tax_yymm() + "]");
		System.out.println("now_tax_amt = [" + getNow_tax_amt() + "]");
		System.out.println("now_tax_yymm = [" + getNow_tax_yymm() + "]");
		System.out.println("blng_ward_offi = [" + getBlng_ward_offi() + "]");
		System.out.println("under_flor = [" + getUnder_flor() + "]");
		System.out.println("under_size = [" + getUnder_size() + "]");
		System.out.println("bldg_prmt_dt = [" + getBldg_prmt_dt() + "]");
		System.out.println("leas_ern_no = [" + getLeas_ern_no() + "]");
		System.out.println("rela_no = [" + getRela_no() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("usag = [" + getUsag() + "]");
		System.out.println("car_engine_size = [" + getCar_engine_size() + "]");
		System.out.println("car_kind = [" + getCar_kind() + "]");
		System.out.println("insr_no = [" + getInsr_no() + "]");
		System.out.println("quorum_cnt = [" + getQuorum_cnt() + "]");
		System.out.println("car_mang_no = [" + getCar_mang_no() + "]");
		System.out.println("car_make_yymm = [" + getCar_make_yymm() + "]");
		System.out.println("car_usag = [" + getCar_usag() + "]");
		System.out.println("use_car_oil = [" + getUse_car_oil() + "]");
		System.out.println("make_natn = [" + getMake_natn() + "]");
		System.out.println("make_cmpy = [" + getMake_cmpy() + "]");
		System.out.println("make_yymm = [" + getMake_yymm() + "]");
		System.out.println("make_no = [" + getMake_no() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("file_size = [" + getFile_size() + "]");
        System.out.println("phot_img = " + getUp_phot_img());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String item_cd = req.getParameter("item_cd");
if( item_cd == null){
	System.out.println(this.toString+" : item_cd is null" );
}else{
	System.out.println(this.toString+" : item_cd is "+item_cd );
}
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
String aset_nm = req.getParameter("aset_nm");
if( aset_nm == null){
	System.out.println(this.toString+" : aset_nm is null" );
}else{
	System.out.println(this.toString+" : aset_nm is "+aset_nm );
}
String buy_clsf = req.getParameter("buy_clsf");
if( buy_clsf == null){
	System.out.println(this.toString+" : buy_clsf is null" );
}else{
	System.out.println(this.toString+" : buy_clsf is "+buy_clsf );
}
String aset_stat = req.getParameter("aset_stat");
if( aset_stat == null){
	System.out.println(this.toString+" : aset_stat is null" );
}else{
	System.out.println(this.toString+" : aset_stat is "+aset_stat );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String acqr_dt = req.getParameter("acqr_dt");
if( acqr_dt == null){
	System.out.println(this.toString+" : acqr_dt is null" );
}else{
	System.out.println(this.toString+" : acqr_dt is "+acqr_dt );
}
String orgin_acqr_amt = req.getParameter("orgin_acqr_amt");
if( orgin_acqr_amt == null){
	System.out.println(this.toString+" : orgin_acqr_amt is null" );
}else{
	System.out.println(this.toString+" : orgin_acqr_amt is "+orgin_acqr_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_ern = req.getParameter("dlco_ern");
if( dlco_ern == null){
	System.out.println(this.toString+" : dlco_ern is null" );
}else{
	System.out.println(this.toString+" : dlco_ern is "+dlco_ern );
}
String bund_cd = req.getParameter("bund_cd");
if( bund_cd == null){
	System.out.println(this.toString+" : bund_cd is null" );
}else{
	System.out.println(this.toString+" : bund_cd is "+bund_cd );
}
String aset_size = req.getParameter("aset_size");
if( aset_size == null){
	System.out.println(this.toString+" : aset_size is null" );
}else{
	System.out.println(this.toString+" : aset_size is "+aset_size );
}
String aset_loca = req.getParameter("aset_loca");
if( aset_loca == null){
	System.out.println(this.toString+" : aset_loca is null" );
}else{
	System.out.println(this.toString+" : aset_loca is "+aset_loca );
}
String aset_qunt_cnt = req.getParameter("aset_qunt_cnt");
if( aset_qunt_cnt == null){
	System.out.println(this.toString+" : aset_qunt_cnt is null" );
}else{
	System.out.println(this.toString+" : aset_qunt_cnt is "+aset_qunt_cnt );
}
String aset_usag = req.getParameter("aset_usag");
if( aset_usag == null){
	System.out.println(this.toString+" : aset_usag is null" );
}else{
	System.out.println(this.toString+" : aset_usag is "+aset_usag );
}
String aset_grp_yn = req.getParameter("aset_grp_yn");
if( aset_grp_yn == null){
	System.out.println(this.toString+" : aset_grp_yn is null" );
}else{
	System.out.println(this.toString+" : aset_grp_yn is "+aset_grp_yn );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String land_plcw = req.getParameter("land_plcw");
if( land_plcw == null){
	System.out.println(this.toString+" : land_plcw is null" );
}else{
	System.out.println(this.toString+" : land_plcw is "+land_plcw );
}
String acqr_land_amt = req.getParameter("acqr_land_amt");
if( acqr_land_amt == null){
	System.out.println(this.toString+" : acqr_land_amt is null" );
}else{
	System.out.println(this.toString+" : acqr_land_amt is "+acqr_land_amt );
}
String acqr_yymm = req.getParameter("acqr_yymm");
if( acqr_yymm == null){
	System.out.println(this.toString+" : acqr_yymm is null" );
}else{
	System.out.println(this.toString+" : acqr_yymm is "+acqr_yymm );
}
String now_land_amt = req.getParameter("now_land_amt");
if( now_land_amt == null){
	System.out.println(this.toString+" : now_land_amt is null" );
}else{
	System.out.println(this.toString+" : now_land_amt is "+now_land_amt );
}
String now_yymm = req.getParameter("now_yymm");
if( now_yymm == null){
	System.out.println(this.toString+" : now_yymm is null" );
}else{
	System.out.println(this.toString+" : now_yymm is "+now_yymm );
}
String land_usag = req.getParameter("land_usag");
if( land_usag == null){
	System.out.println(this.toString+" : land_usag is null" );
}else{
	System.out.println(this.toString+" : land_usag is "+land_usag );
}
String rela_aset_no = req.getParameter("rela_aset_no");
if( rela_aset_no == null){
	System.out.println(this.toString+" : rela_aset_no is null" );
}else{
	System.out.println(this.toString+" : rela_aset_no is "+rela_aset_no );
}
String bldg_plcw = req.getParameter("bldg_plcw");
if( bldg_plcw == null){
	System.out.println(this.toString+" : bldg_plcw is null" );
}else{
	System.out.println(this.toString+" : bldg_plcw is "+bldg_plcw );
}
String land_size = req.getParameter("land_size");
if( land_size == null){
	System.out.println(this.toString+" : land_size is null" );
}else{
	System.out.println(this.toString+" : land_size is "+land_size );
}
String bldg_size = req.getParameter("bldg_size");
if( bldg_size == null){
	System.out.println(this.toString+" : bldg_size is null" );
}else{
	System.out.println(this.toString+" : bldg_size is "+bldg_size );
}
String flor_size = req.getParameter("flor_size");
if( flor_size == null){
	System.out.println(this.toString+" : flor_size is null" );
}else{
	System.out.println(this.toString+" : flor_size is "+flor_size );
}
String arch = req.getParameter("arch");
if( arch == null){
	System.out.println(this.toString+" : arch is null" );
}else{
	System.out.println(this.toString+" : arch is "+arch );
}
String flor_cnt = req.getParameter("flor_cnt");
if( flor_cnt == null){
	System.out.println(this.toString+" : flor_cnt is null" );
}else{
	System.out.println(this.toString+" : flor_cnt is "+flor_cnt );
}
String cmpl_yymm = req.getParameter("cmpl_yymm");
if( cmpl_yymm == null){
	System.out.println(this.toString+" : cmpl_yymm is null" );
}else{
	System.out.println(this.toString+" : cmpl_yymm is "+cmpl_yymm );
}
String acqr_tax_amt = req.getParameter("acqr_tax_amt");
if( acqr_tax_amt == null){
	System.out.println(this.toString+" : acqr_tax_amt is null" );
}else{
	System.out.println(this.toString+" : acqr_tax_amt is "+acqr_tax_amt );
}
String acqr_tax_yymm = req.getParameter("acqr_tax_yymm");
if( acqr_tax_yymm == null){
	System.out.println(this.toString+" : acqr_tax_yymm is null" );
}else{
	System.out.println(this.toString+" : acqr_tax_yymm is "+acqr_tax_yymm );
}
String now_tax_amt = req.getParameter("now_tax_amt");
if( now_tax_amt == null){
	System.out.println(this.toString+" : now_tax_amt is null" );
}else{
	System.out.println(this.toString+" : now_tax_amt is "+now_tax_amt );
}
String now_tax_yymm = req.getParameter("now_tax_yymm");
if( now_tax_yymm == null){
	System.out.println(this.toString+" : now_tax_yymm is null" );
}else{
	System.out.println(this.toString+" : now_tax_yymm is "+now_tax_yymm );
}
String blng_ward_offi = req.getParameter("blng_ward_offi");
if( blng_ward_offi == null){
	System.out.println(this.toString+" : blng_ward_offi is null" );
}else{
	System.out.println(this.toString+" : blng_ward_offi is "+blng_ward_offi );
}
String under_flor = req.getParameter("under_flor");
if( under_flor == null){
	System.out.println(this.toString+" : under_flor is null" );
}else{
	System.out.println(this.toString+" : under_flor is "+under_flor );
}
String under_size = req.getParameter("under_size");
if( under_size == null){
	System.out.println(this.toString+" : under_size is null" );
}else{
	System.out.println(this.toString+" : under_size is "+under_size );
}
String bldg_prmt_dt = req.getParameter("bldg_prmt_dt");
if( bldg_prmt_dt == null){
	System.out.println(this.toString+" : bldg_prmt_dt is null" );
}else{
	System.out.println(this.toString+" : bldg_prmt_dt is "+bldg_prmt_dt );
}
String leas_ern_no = req.getParameter("leas_ern_no");
if( leas_ern_no == null){
	System.out.println(this.toString+" : leas_ern_no is null" );
}else{
	System.out.println(this.toString+" : leas_ern_no is "+leas_ern_no );
}
String rela_no = req.getParameter("rela_no");
if( rela_no == null){
	System.out.println(this.toString+" : rela_no is null" );
}else{
	System.out.println(this.toString+" : rela_no is "+rela_no );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String usag = req.getParameter("usag");
if( usag == null){
	System.out.println(this.toString+" : usag is null" );
}else{
	System.out.println(this.toString+" : usag is "+usag );
}
String car_engine_size = req.getParameter("car_engine_size");
if( car_engine_size == null){
	System.out.println(this.toString+" : car_engine_size is null" );
}else{
	System.out.println(this.toString+" : car_engine_size is "+car_engine_size );
}
String car_kind = req.getParameter("car_kind");
if( car_kind == null){
	System.out.println(this.toString+" : car_kind is null" );
}else{
	System.out.println(this.toString+" : car_kind is "+car_kind );
}
String insr_no = req.getParameter("insr_no");
if( insr_no == null){
	System.out.println(this.toString+" : insr_no is null" );
}else{
	System.out.println(this.toString+" : insr_no is "+insr_no );
}
String quorum_cnt = req.getParameter("quorum_cnt");
if( quorum_cnt == null){
	System.out.println(this.toString+" : quorum_cnt is null" );
}else{
	System.out.println(this.toString+" : quorum_cnt is "+quorum_cnt );
}
String car_mang_no = req.getParameter("car_mang_no");
if( car_mang_no == null){
	System.out.println(this.toString+" : car_mang_no is null" );
}else{
	System.out.println(this.toString+" : car_mang_no is "+car_mang_no );
}
String car_make_yymm = req.getParameter("car_make_yymm");
if( car_make_yymm == null){
	System.out.println(this.toString+" : car_make_yymm is null" );
}else{
	System.out.println(this.toString+" : car_make_yymm is "+car_make_yymm );
}
String car_usag = req.getParameter("car_usag");
if( car_usag == null){
	System.out.println(this.toString+" : car_usag is null" );
}else{
	System.out.println(this.toString+" : car_usag is "+car_usag );
}
String use_car_oil = req.getParameter("use_car_oil");
if( use_car_oil == null){
	System.out.println(this.toString+" : use_car_oil is null" );
}else{
	System.out.println(this.toString+" : use_car_oil is "+use_car_oil );
}
String make_natn = req.getParameter("make_natn");
if( make_natn == null){
	System.out.println(this.toString+" : make_natn is null" );
}else{
	System.out.println(this.toString+" : make_natn is "+make_natn );
}
String make_cmpy = req.getParameter("make_cmpy");
if( make_cmpy == null){
	System.out.println(this.toString+" : make_cmpy is null" );
}else{
	System.out.println(this.toString+" : make_cmpy is "+make_cmpy );
}
String make_yymm = req.getParameter("make_yymm");
if( make_yymm == null){
	System.out.println(this.toString+" : make_yymm is null" );
}else{
	System.out.println(this.toString+" : make_yymm is "+make_yymm );
}
String make_no = req.getParameter("make_no");
if( make_no == null){
	System.out.println(this.toString+" : make_no is null" );
}else{
	System.out.println(this.toString+" : make_no is "+make_no );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String file_size = req.getParameter("file_size");
if( file_size == null){
	System.out.println(this.toString+" : file_size is null" );
}else{
	System.out.println(this.toString+" : file_size is "+file_size );
}
String phot_img = req.getParameter("phot_img");
if( phot_img == null){
	System.out.println(this.toString+" : phot_img is null" );
}else{
	System.out.println(this.toString+" : phot_img is "+phot_img );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String item_cd = Util.checkString(req.getParameter("item_cd"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
String aset_nm = Util.checkString(req.getParameter("aset_nm"));
String buy_clsf = Util.checkString(req.getParameter("buy_clsf"));
String aset_stat = Util.checkString(req.getParameter("aset_stat"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String acqr_dt = Util.checkString(req.getParameter("acqr_dt"));
String orgin_acqr_amt = Util.checkString(req.getParameter("orgin_acqr_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
String bund_cd = Util.checkString(req.getParameter("bund_cd"));
String aset_size = Util.checkString(req.getParameter("aset_size"));
String aset_loca = Util.checkString(req.getParameter("aset_loca"));
String aset_qunt_cnt = Util.checkString(req.getParameter("aset_qunt_cnt"));
String aset_usag = Util.checkString(req.getParameter("aset_usag"));
String aset_grp_yn = Util.checkString(req.getParameter("aset_grp_yn"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String land_plcw = Util.checkString(req.getParameter("land_plcw"));
String acqr_land_amt = Util.checkString(req.getParameter("acqr_land_amt"));
String acqr_yymm = Util.checkString(req.getParameter("acqr_yymm"));
String now_land_amt = Util.checkString(req.getParameter("now_land_amt"));
String now_yymm = Util.checkString(req.getParameter("now_yymm"));
String land_usag = Util.checkString(req.getParameter("land_usag"));
String rela_aset_no = Util.checkString(req.getParameter("rela_aset_no"));
String bldg_plcw = Util.checkString(req.getParameter("bldg_plcw"));
String land_size = Util.checkString(req.getParameter("land_size"));
String bldg_size = Util.checkString(req.getParameter("bldg_size"));
String flor_size = Util.checkString(req.getParameter("flor_size"));
String arch = Util.checkString(req.getParameter("arch"));
String flor_cnt = Util.checkString(req.getParameter("flor_cnt"));
String cmpl_yymm = Util.checkString(req.getParameter("cmpl_yymm"));
String acqr_tax_amt = Util.checkString(req.getParameter("acqr_tax_amt"));
String acqr_tax_yymm = Util.checkString(req.getParameter("acqr_tax_yymm"));
String now_tax_amt = Util.checkString(req.getParameter("now_tax_amt"));
String now_tax_yymm = Util.checkString(req.getParameter("now_tax_yymm"));
String blng_ward_offi = Util.checkString(req.getParameter("blng_ward_offi"));
String under_flor = Util.checkString(req.getParameter("under_flor"));
String under_size = Util.checkString(req.getParameter("under_size"));
String bldg_prmt_dt = Util.checkString(req.getParameter("bldg_prmt_dt"));
String leas_ern_no = Util.checkString(req.getParameter("leas_ern_no"));
String rela_no = Util.checkString(req.getParameter("rela_no"));
String car_no = Util.checkString(req.getParameter("car_no"));
String usag = Util.checkString(req.getParameter("usag"));
String car_engine_size = Util.checkString(req.getParameter("car_engine_size"));
String car_kind = Util.checkString(req.getParameter("car_kind"));
String insr_no = Util.checkString(req.getParameter("insr_no"));
String quorum_cnt = Util.checkString(req.getParameter("quorum_cnt"));
String car_mang_no = Util.checkString(req.getParameter("car_mang_no"));
String car_make_yymm = Util.checkString(req.getParameter("car_make_yymm"));
String car_usag = Util.checkString(req.getParameter("car_usag"));
String use_car_oil = Util.checkString(req.getParameter("use_car_oil"));
String make_natn = Util.checkString(req.getParameter("make_natn"));
String make_cmpy = Util.checkString(req.getParameter("make_cmpy"));
String make_yymm = Util.checkString(req.getParameter("make_yymm"));
String make_no = Util.checkString(req.getParameter("make_no"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String remk = Util.checkString(req.getParameter("remk"));
String file_size = Util.checkString(req.getParameter("file_size"));
String phot_img = Util.checkString(req.getParameter("phot_img"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("item_cd")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
String aset_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_nm")));
String buy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_clsf")));
String aset_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_stat")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String acqr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqr_dt")));
String orgin_acqr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("orgin_acqr_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_ern")));
String bund_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bund_cd")));
String aset_size = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_size")));
String aset_loca = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_loca")));
String aset_qunt_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_qunt_cnt")));
String aset_usag = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_usag")));
String aset_grp_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_grp_yn")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String land_plcw = Util.Uni2Ksc(Util.checkString(req.getParameter("land_plcw")));
String acqr_land_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqr_land_amt")));
String acqr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("acqr_yymm")));
String now_land_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("now_land_amt")));
String now_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("now_yymm")));
String land_usag = Util.Uni2Ksc(Util.checkString(req.getParameter("land_usag")));
String rela_aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_aset_no")));
String bldg_plcw = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_plcw")));
String land_size = Util.Uni2Ksc(Util.checkString(req.getParameter("land_size")));
String bldg_size = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_size")));
String flor_size = Util.Uni2Ksc(Util.checkString(req.getParameter("flor_size")));
String arch = Util.Uni2Ksc(Util.checkString(req.getParameter("arch")));
String flor_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("flor_cnt")));
String cmpl_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpl_yymm")));
String acqr_tax_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqr_tax_amt")));
String acqr_tax_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("acqr_tax_yymm")));
String now_tax_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("now_tax_amt")));
String now_tax_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("now_tax_yymm")));
String blng_ward_offi = Util.Uni2Ksc(Util.checkString(req.getParameter("blng_ward_offi")));
String under_flor = Util.Uni2Ksc(Util.checkString(req.getParameter("under_flor")));
String under_size = Util.Uni2Ksc(Util.checkString(req.getParameter("under_size")));
String bldg_prmt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_prmt_dt")));
String leas_ern_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_ern_no")));
String rela_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_no")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
String car_engine_size = Util.Uni2Ksc(Util.checkString(req.getParameter("car_engine_size")));
String car_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("car_kind")));
String insr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_no")));
String quorum_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("quorum_cnt")));
String car_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_mang_no")));
String car_make_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("car_make_yymm")));
String car_usag = Util.Uni2Ksc(Util.checkString(req.getParameter("car_usag")));
String use_car_oil = Util.Uni2Ksc(Util.checkString(req.getParameter("use_car_oil")));
String make_natn = Util.Uni2Ksc(Util.checkString(req.getParameter("make_natn")));
String make_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("make_cmpy")));
String make_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("make_yymm")));
String make_no = Util.Uni2Ksc(Util.checkString(req.getParameter("make_no")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String file_size = Util.Uni2Ksc(Util.checkString(req.getParameter("file_size")));
String phot_img = Util.Uni2Ksc(Util.checkString(req.getParameter("phot_img")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setItem_cd(item_cd);
dm.setAset_no(aset_no);
dm.setAset_nm(aset_nm);
dm.setBuy_clsf(buy_clsf);
dm.setAset_stat(aset_stat);
dm.setDept_cd(dept_cd);
dm.setAcqr_dt(acqr_dt);
dm.setOrgin_acqr_amt(orgin_acqr_amt);
dm.setVat_amt(vat_amt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_ern(dlco_ern);
dm.setBund_cd(bund_cd);
dm.setAset_size(aset_size);
dm.setAset_loca(aset_loca);
dm.setAset_qunt_cnt(aset_qunt_cnt);
dm.setAset_usag(aset_usag);
dm.setAset_grp_yn(aset_grp_yn);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setLand_plcw(land_plcw);
dm.setAcqr_land_amt(acqr_land_amt);
dm.setAcqr_yymm(acqr_yymm);
dm.setNow_land_amt(now_land_amt);
dm.setNow_yymm(now_yymm);
dm.setLand_usag(land_usag);
dm.setRela_aset_no(rela_aset_no);
dm.setBldg_plcw(bldg_plcw);
dm.setLand_size(land_size);
dm.setBldg_size(bldg_size);
dm.setFlor_size(flor_size);
dm.setArch(arch);
dm.setFlor_cnt(flor_cnt);
dm.setCmpl_yymm(cmpl_yymm);
dm.setAcqr_tax_amt(acqr_tax_amt);
dm.setAcqr_tax_yymm(acqr_tax_yymm);
dm.setNow_tax_amt(now_tax_amt);
dm.setNow_tax_yymm(now_tax_yymm);
dm.setBlng_ward_offi(blng_ward_offi);
dm.setUnder_flor(under_flor);
dm.setUnder_size(under_size);
dm.setBldg_prmt_dt(bldg_prmt_dt);
dm.setLeas_ern_no(leas_ern_no);
dm.setRela_no(rela_no);
dm.setCar_no(car_no);
dm.setUsag(usag);
dm.setCar_engine_size(car_engine_size);
dm.setCar_kind(car_kind);
dm.setInsr_no(insr_no);
dm.setQuorum_cnt(quorum_cnt);
dm.setCar_mang_no(car_mang_no);
dm.setCar_make_yymm(car_make_yymm);
dm.setCar_usag(car_usag);
dm.setUse_car_oil(use_car_oil);
dm.setMake_natn(make_natn);
dm.setMake_cmpy(make_cmpy);
dm.setMake_yymm(make_yymm);
dm.setMake_no(make_no);
dm.setMang_no(mang_no);
dm.setRemk(remk);
dm.setFile_size(file_size);
dm.setPhot_img(phot_img);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 09:10:18 KST 2009 */