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


package chosun.ciis.as.lear.rec;

import java.sql.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.ds.*;

/**
 * 
 */


public class AS_LEAR_1301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bldg_nm;
	public String ser_no;
	public String leas_size;
	public String hire_dlco_nm;
	public String day_fr;
	public String day_to2;
	public String cntr_gurt_amt;
	public String cntr_leas_amt;
	public String tot_amt;
	public String gurt_int_amt;
	public String mon_clam_amt;
	public String out_date;
	public String tax_cnt;
	public String cmpy_cd;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String hire_dlco_ern;
	public String leas_clam_cycl;
	public String mang_clam_cycl;

	public AS_LEAR_1301_LCURLISTRecord(){}

	public void setBldg_nm(String bldg_nm){
		this.bldg_nm = bldg_nm;
	}

	public void setSer_no(String ser_no){
		this.ser_no = ser_no;
	}

	public void setLeas_size(String leas_size){
		this.leas_size = leas_size;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setDay_fr(String day_fr){
		this.day_fr = day_fr;
	}

	public void setDay_to2(String day_to2){
		this.day_to2 = day_to2;
	}

	public void setCntr_gurt_amt(String cntr_gurt_amt){
		this.cntr_gurt_amt = cntr_gurt_amt;
	}

	public void setCntr_leas_amt(String cntr_leas_amt){
		this.cntr_leas_amt = cntr_leas_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setGurt_int_amt(String gurt_int_amt){
		this.gurt_int_amt = gurt_int_amt;
	}

	public void setMon_clam_amt(String mon_clam_amt){
		this.mon_clam_amt = mon_clam_amt;
	}

	public void setOut_date(String out_date){
		this.out_date = out_date;
	}

	public void setTax_cnt(String tax_cnt){
		this.tax_cnt = tax_cnt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setLeas_clam_cycl(String leas_clam_cycl){
		this.leas_clam_cycl = leas_clam_cycl;
	}

	public void setMang_clam_cycl(String mang_clam_cycl){
		this.mang_clam_cycl = mang_clam_cycl;
	}

	public String getBldg_nm(){
		return this.bldg_nm;
	}

	public String getSer_no(){
		return this.ser_no;
	}

	public String getLeas_size(){
		return this.leas_size;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getDay_fr(){
		return this.day_fr;
	}

	public String getDay_to2(){
		return this.day_to2;
	}

	public String getCntr_gurt_amt(){
		return this.cntr_gurt_amt;
	}

	public String getCntr_leas_amt(){
		return this.cntr_leas_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getGurt_int_amt(){
		return this.gurt_int_amt;
	}

	public String getMon_clam_amt(){
		return this.mon_clam_amt;
	}

	public String getOut_date(){
		return this.out_date;
	}

	public String getTax_cnt(){
		return this.tax_cnt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getLeas_clam_cycl(){
		return this.leas_clam_cycl;
	}

	public String getMang_clam_cycl(){
		return this.mang_clam_cycl;
	}
}

/* 작성시간 : Thu Apr 23 17:44:15 KST 2009 */