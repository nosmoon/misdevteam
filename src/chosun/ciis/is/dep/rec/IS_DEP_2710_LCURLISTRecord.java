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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_2710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String sale_proc_ym;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers_nm;
	public String tot_rvord_amt;
	public String setoff_amt_m0;
	public String setoff_amt_m1;
	public String setoff_amt_m2;
	public String setoff_amt_m3;
	public String setoff_amt_m4;
	public String setoff_amt_m5;
	public String setoff_amt_m6;
	public String setoff_amt_m7;
	public String misu_amt;
	public String setoff_amt_rate_m0;
	public String setoff_amt_rate_m1;
	public String setoff_amt_rate_m2;
	public String setoff_amt_rate_m3;
	public String setoff_amt_rate_m4;
	public String setoff_amt_rate_m5;
	public String setoff_amt_rate_m6;
	public String setoff_amt_rate_m7;
	public String misu_amt_rate;

	public IS_DEP_2710_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSale_proc_ym(String sale_proc_ym){
		this.sale_proc_ym = sale_proc_ym;
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

	public void setTot_rvord_amt(String tot_rvord_amt){
		this.tot_rvord_amt = tot_rvord_amt;
	}

	public void setSetoff_amt_m0(String setoff_amt_m0){
		this.setoff_amt_m0 = setoff_amt_m0;
	}

	public void setSetoff_amt_m1(String setoff_amt_m1){
		this.setoff_amt_m1 = setoff_amt_m1;
	}

	public void setSetoff_amt_m2(String setoff_amt_m2){
		this.setoff_amt_m2 = setoff_amt_m2;
	}

	public void setSetoff_amt_m3(String setoff_amt_m3){
		this.setoff_amt_m3 = setoff_amt_m3;
	}

	public void setSetoff_amt_m4(String setoff_amt_m4){
		this.setoff_amt_m4 = setoff_amt_m4;
	}

	public void setSetoff_amt_m5(String setoff_amt_m5){
		this.setoff_amt_m5 = setoff_amt_m5;
	}

	public void setSetoff_amt_m6(String setoff_amt_m6){
		this.setoff_amt_m6 = setoff_amt_m6;
	}

	public void setSetoff_amt_m7(String setoff_amt_m7){
		this.setoff_amt_m7 = setoff_amt_m7;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setSetoff_amt_rate_m0(String setoff_amt_rate_m0){
		this.setoff_amt_rate_m0 = setoff_amt_rate_m0;
	}

	public void setSetoff_amt_rate_m1(String setoff_amt_rate_m1){
		this.setoff_amt_rate_m1 = setoff_amt_rate_m1;
	}

	public void setSetoff_amt_rate_m2(String setoff_amt_rate_m2){
		this.setoff_amt_rate_m2 = setoff_amt_rate_m2;
	}

	public void setSetoff_amt_rate_m3(String setoff_amt_rate_m3){
		this.setoff_amt_rate_m3 = setoff_amt_rate_m3;
	}

	public void setSetoff_amt_rate_m4(String setoff_amt_rate_m4){
		this.setoff_amt_rate_m4 = setoff_amt_rate_m4;
	}

	public void setSetoff_amt_rate_m5(String setoff_amt_rate_m5){
		this.setoff_amt_rate_m5 = setoff_amt_rate_m5;
	}

	public void setSetoff_amt_rate_m6(String setoff_amt_rate_m6){
		this.setoff_amt_rate_m6 = setoff_amt_rate_m6;
	}

	public void setSetoff_amt_rate_m7(String setoff_amt_rate_m7){
		this.setoff_amt_rate_m7 = setoff_amt_rate_m7;
	}

	public void setMisu_amt_rate(String misu_amt_rate){
		this.misu_amt_rate = misu_amt_rate;
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

	public String getSale_proc_ym(){
		return this.sale_proc_ym;
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

	public String getTot_rvord_amt(){
		return this.tot_rvord_amt;
	}

	public String getSetoff_amt_m0(){
		return this.setoff_amt_m0;
	}

	public String getSetoff_amt_m1(){
		return this.setoff_amt_m1;
	}

	public String getSetoff_amt_m2(){
		return this.setoff_amt_m2;
	}

	public String getSetoff_amt_m3(){
		return this.setoff_amt_m3;
	}

	public String getSetoff_amt_m4(){
		return this.setoff_amt_m4;
	}

	public String getSetoff_amt_m5(){
		return this.setoff_amt_m5;
	}

	public String getSetoff_amt_m6(){
		return this.setoff_amt_m6;
	}

	public String getSetoff_amt_m7(){
		return this.setoff_amt_m7;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getSetoff_amt_rate_m0(){
		return this.setoff_amt_rate_m0;
	}

	public String getSetoff_amt_rate_m1(){
		return this.setoff_amt_rate_m1;
	}

	public String getSetoff_amt_rate_m2(){
		return this.setoff_amt_rate_m2;
	}

	public String getSetoff_amt_rate_m3(){
		return this.setoff_amt_rate_m3;
	}

	public String getSetoff_amt_rate_m4(){
		return this.setoff_amt_rate_m4;
	}

	public String getSetoff_amt_rate_m5(){
		return this.setoff_amt_rate_m5;
	}

	public String getSetoff_amt_rate_m6(){
		return this.setoff_amt_rate_m6;
	}

	public String getSetoff_amt_rate_m7(){
		return this.setoff_amt_rate_m7;
	}

	public String getMisu_amt_rate(){
		return this.misu_amt_rate;
	}
}

/* 작성시간 : Wed May 23 16:17:47 KST 2012 */