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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */


public class AS_LEAS_1306_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bldg_nm;
	public String hire_dlco_nm;
	public String cntr_no;
	public String cntr_gurt_amt;
	public String gurt_tot_amt;
	public String gurt_out_amt;
	public String precpt_tot_amt;
	public String precpt_out_amt;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String hire_dlco_ern;
	public String hire_dlco_clsf_cd;

	public AS_LEAS_1306_LCURLISTRecord(){}

	public void setBldg_nm(String bldg_nm){
		this.bldg_nm = bldg_nm;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setCntr_gurt_amt(String cntr_gurt_amt){
		this.cntr_gurt_amt = cntr_gurt_amt;
	}

	public void setGurt_tot_amt(String gurt_tot_amt){
		this.gurt_tot_amt = gurt_tot_amt;
	}

	public void setGurt_out_amt(String gurt_out_amt){
		this.gurt_out_amt = gurt_out_amt;
	}

	public void setPrecpt_tot_amt(String precpt_tot_amt){
		this.precpt_tot_amt = precpt_tot_amt;
	}

	public void setPrecpt_out_amt(String precpt_out_amt){
		this.precpt_out_amt = precpt_out_amt;
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

	public void setHire_dlco_clsf_cd(String hire_dlco_clsf_cd){
		this.hire_dlco_clsf_cd = hire_dlco_clsf_cd;
	}

	public String getBldg_nm(){
		return this.bldg_nm;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getCntr_gurt_amt(){
		return this.cntr_gurt_amt;
	}

	public String getGurt_tot_amt(){
		return this.gurt_tot_amt;
	}

	public String getGurt_out_amt(){
		return this.gurt_out_amt;
	}

	public String getPrecpt_tot_amt(){
		return this.precpt_tot_amt;
	}

	public String getPrecpt_out_amt(){
		return this.precpt_out_amt;
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

	public String getHire_dlco_clsf_cd(){
		return this.hire_dlco_clsf_cd;
	}
}

/* 작성시간 : Tue Jun 02 14:31:40 KST 2009 */