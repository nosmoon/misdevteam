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


public class IS_AGR_2110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String t_no;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers_nm;
	public String rvord_type_amt01;
	public String rvord_type_amt01_rate;
	public String rvord_type_amt02;
	public String rvord_type_amt02_rate;
	public String rvord_type_amt_subtot;
	public String rvord_type_amt03;
	public String rvord_type_amt_tot;

	public IS_AGR_2110_LCURLISTRecord(){}

	public void setT_no(String t_no){
		this.t_no = t_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setRvord_type_amt01(String rvord_type_amt01){
		this.rvord_type_amt01 = rvord_type_amt01;
	}

	public void setRvord_type_amt01_rate(String rvord_type_amt01_rate){
		this.rvord_type_amt01_rate = rvord_type_amt01_rate;
	}

	public void setRvord_type_amt02(String rvord_type_amt02){
		this.rvord_type_amt02 = rvord_type_amt02;
	}

	public void setRvord_type_amt02_rate(String rvord_type_amt02_rate){
		this.rvord_type_amt02_rate = rvord_type_amt02_rate;
	}

	public void setRvord_type_amt_subtot(String rvord_type_amt_subtot){
		this.rvord_type_amt_subtot = rvord_type_amt_subtot;
	}

	public void setRvord_type_amt03(String rvord_type_amt03){
		this.rvord_type_amt03 = rvord_type_amt03;
	}

	public void setRvord_type_amt_tot(String rvord_type_amt_tot){
		this.rvord_type_amt_tot = rvord_type_amt_tot;
	}

	public String getT_no(){
		return this.t_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getRvord_type_amt01(){
		return this.rvord_type_amt01;
	}

	public String getRvord_type_amt01_rate(){
		return this.rvord_type_amt01_rate;
	}

	public String getRvord_type_amt02(){
		return this.rvord_type_amt02;
	}

	public String getRvord_type_amt02_rate(){
		return this.rvord_type_amt02_rate;
	}

	public String getRvord_type_amt_subtot(){
		return this.rvord_type_amt_subtot;
	}

	public String getRvord_type_amt03(){
		return this.rvord_type_amt03;
	}

	public String getRvord_type_amt_tot(){
		return this.rvord_type_amt_tot;
	}
}

/* 작성시간 : Fri Jun 01 17:34:41 KST 2012 */