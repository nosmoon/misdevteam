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


public class IS_AGR_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_cd_nm;
	public String sub_dept_cd;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String cur_cnt;
	public String bef_cnt;
	public String cnt_rate;
	public String cur_suply_amt;
	public String bef_suply_amt;
	public String suply_amt_rate;
	public String scat_dt_fr;
	public String scat_dt_to;

	public IS_AGR_2210_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setCur_cnt(String cur_cnt){
		this.cur_cnt = cur_cnt;
	}

	public void setBef_cnt(String bef_cnt){
		this.bef_cnt = bef_cnt;
	}

	public void setCnt_rate(String cnt_rate){
		this.cnt_rate = cnt_rate;
	}

	public void setCur_suply_amt(String cur_suply_amt){
		this.cur_suply_amt = cur_suply_amt;
	}

	public void setBef_suply_amt(String bef_suply_amt){
		this.bef_suply_amt = bef_suply_amt;
	}

	public void setSuply_amt_rate(String suply_amt_rate){
		this.suply_amt_rate = suply_amt_rate;
	}

	public void setScat_dt_fr(String scat_dt_fr){
		this.scat_dt_fr = scat_dt_fr;
	}

	public void setScat_dt_to(String scat_dt_to){
		this.scat_dt_to = scat_dt_to;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getCur_cnt(){
		return this.cur_cnt;
	}

	public String getBef_cnt(){
		return this.bef_cnt;
	}

	public String getCnt_rate(){
		return this.cnt_rate;
	}

	public String getCur_suply_amt(){
		return this.cur_suply_amt;
	}

	public String getBef_suply_amt(){
		return this.bef_suply_amt;
	}

	public String getSuply_amt_rate(){
		return this.suply_amt_rate;
	}

	public String getScat_dt_fr(){
		return this.scat_dt_fr;
	}

	public String getScat_dt_to(){
		return this.scat_dt_to;
	}
}

/* 작성시간 : Fri May 25 10:39:06 KST 2012 */