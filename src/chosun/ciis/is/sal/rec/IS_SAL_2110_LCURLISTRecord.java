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


package chosun.ciis.is.sal.rec;

import java.sql.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.ds.*;

/**
 * 
 */


public class IS_SAL_2110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String scat_dt;
	public String advt_nm;
	public String advcs_cd_nm;
	public String dlco_clsf_cd_seq;
	public String dlco_nm;
	public String sale_clsf_nm;
	public String spc_sale_clsf_nm;
	public String std_cd_nm;
	public String qunt;
	public String suply_amt;
	public String not_suply_amt;
	public String indt_cd_nm;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String erplace_cd_nm;

	public IS_SAL_2110_LCURLISTRecord(){}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setScat_dt(String scat_dt){
		this.scat_dt = scat_dt;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
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

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setNot_suply_amt(String not_suply_amt){
		this.not_suply_amt = not_suply_amt;
	}

	public void setIndt_cd_nm(String indt_cd_nm){
		this.indt_cd_nm = indt_cd_nm;
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

	public void setErplace_cd_nm(String erplace_cd_nm){
		this.erplace_cd_nm = erplace_cd_nm;
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

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
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

	public String getQunt(){
		return this.qunt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getNot_suply_amt(){
		return this.not_suply_amt;
	}

	public String getIndt_cd_nm(){
		return this.indt_cd_nm;
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

	public String getErplace_cd_nm(){
		return this.erplace_cd_nm;
	}
}

/* 작성시간 : Wed May 16 11:50:05 KST 2012 */