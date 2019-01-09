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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_2810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String adms_dstc_cd_nm;
	public String dlco_nm;
	public String dlco_no;
	public String dlco_head;
	public String dlco_head_tel;
	public String sp_comp_chrg_pers_emp_nm;
	public String pre_misu;
	public String cur_stot_amt;
	public String cur_in_amt;
	public String misu_amt;

	public SP_SAL_2810_LCURLISTRecord(){}

	public void setAdms_dstc_cd_nm(String adms_dstc_cd_nm){
		this.adms_dstc_cd_nm = adms_dstc_cd_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_head(String dlco_head){
		this.dlco_head = dlco_head;
	}

	public void setDlco_head_tel(String dlco_head_tel){
		this.dlco_head_tel = dlco_head_tel;
	}

	public void setSp_comp_chrg_pers_emp_nm(String sp_comp_chrg_pers_emp_nm){
		this.sp_comp_chrg_pers_emp_nm = sp_comp_chrg_pers_emp_nm;
	}

	public void setPre_misu(String pre_misu){
		this.pre_misu = pre_misu;
	}

	public void setCur_stot_amt(String cur_stot_amt){
		this.cur_stot_amt = cur_stot_amt;
	}

	public void setCur_in_amt(String cur_in_amt){
		this.cur_in_amt = cur_in_amt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public String getAdms_dstc_cd_nm(){
		return this.adms_dstc_cd_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_head(){
		return this.dlco_head;
	}

	public String getDlco_head_tel(){
		return this.dlco_head_tel;
	}

	public String getSp_comp_chrg_pers_emp_nm(){
		return this.sp_comp_chrg_pers_emp_nm;
	}

	public String getPre_misu(){
		return this.pre_misu;
	}

	public String getCur_stot_amt(){
		return this.cur_stot_amt;
	}

	public String getCur_in_amt(){
		return this.cur_in_amt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}
}

/* 작성시간 : Sun Jul 22 17:22:20 KST 2012 */