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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_1040_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String scat_dt;
	public String rvord_type_nm;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String advcs_cd;
	public String advcs_cd_nm;
	public String advt_nm;
	public String suply_amt;
	public String vat_amt;
	public String tot_rvord_amt;
	public String indt_cd_nm;
	public String sale_clsf_nm;
	public String spc_sale_clsf_nm;
	public String std_cd_nm;
	public String vatclsf_nm;
	public String clamt_mthd_nm;
	public String fix_yn;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String chg_dt_tm;
	public String qunt;
	public String uprc;

	public IS_AGR_1040_LCURLISTRecord(){}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setScat_dt(String scat_dt){
		this.scat_dt = scat_dt;
	}

	public void setRvord_type_nm(String rvord_type_nm){
		this.rvord_type_nm = rvord_type_nm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTot_rvord_amt(String tot_rvord_amt){
		this.tot_rvord_amt = tot_rvord_amt;
	}

	public void setIndt_cd_nm(String indt_cd_nm){
		this.indt_cd_nm = indt_cd_nm;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setSpc_sale_clsf_nm(String spc_sale_clsf_nm){
		this.spc_sale_clsf_nm = spc_sale_clsf_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setVatclsf_nm(String vatclsf_nm){
		this.vatclsf_nm = vatclsf_nm;
	}

	public void setClamt_mthd_nm(String clamt_mthd_nm){
		this.clamt_mthd_nm = clamt_mthd_nm;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getScat_dt(){
		return this.scat_dt;
	}

	public String getRvord_type_nm(){
		return this.rvord_type_nm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTot_rvord_amt(){
		return this.tot_rvord_amt;
	}

	public String getIndt_cd_nm(){
		return this.indt_cd_nm;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getSpc_sale_clsf_nm(){
		return this.spc_sale_clsf_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getVatclsf_nm(){
		return this.vatclsf_nm;
	}

	public String getClamt_mthd_nm(){
		return this.clamt_mthd_nm;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}
}

/* 작성시간 : Tue Dec 18 18:02:24 KST 2012 */