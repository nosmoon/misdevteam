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


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd_seq;
	public String asnt_dstc_cd;
	public String asnt_dstc_cd_nm;
	public String bo_nm;
	public String bo_head_nm;
	public String ern;
	public String leaf_now_chrg_pers;
	public String leaf_now_chrg_pers_nm;
	public String dept_cd;
	public String sub_dept_cd;
	public String chg_dt_tm;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;

	public IS_BAS_1210_LCURLISTRecord(){}

	public void setDlco_cd_seq(String dlco_cd_seq){
		this.dlco_cd_seq = dlco_cd_seq;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setLeaf_now_chrg_pers(String leaf_now_chrg_pers){
		this.leaf_now_chrg_pers = leaf_now_chrg_pers;
	}

	public void setLeaf_now_chrg_pers_nm(String leaf_now_chrg_pers_nm){
		this.leaf_now_chrg_pers_nm = leaf_now_chrg_pers_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
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

	public String getDlco_cd_seq(){
		return this.dlco_cd_seq;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getLeaf_now_chrg_pers(){
		return this.leaf_now_chrg_pers;
	}

	public String getLeaf_now_chrg_pers_nm(){
		return this.leaf_now_chrg_pers_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
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
}

/* 작성시간 : Thu Apr 26 13:49:30 KST 2012 */