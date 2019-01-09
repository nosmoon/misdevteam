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


public class IS_DEP_2720_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String sale_proc_ym;
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

	public IS_DEP_2720_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSale_proc_ym(String sale_proc_ym){
		this.sale_proc_ym = sale_proc_ym;
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

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSale_proc_ym(){
		return this.sale_proc_ym;
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

/* 작성시간 : Wed May 23 16:50:37 KST 2012 */