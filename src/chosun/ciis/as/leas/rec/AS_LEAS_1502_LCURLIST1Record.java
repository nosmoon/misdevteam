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


public class AS_LEAS_1502_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String leas_mm;
	public String bldg_nm;
	public String aset_nm;
	public String leas_dlco_ern_nm;
	public String leas_prd;
	public String cntr_no;
	public String cntr_leas_amt;
	public String cntr_mang_amt;
	public String cntr_gurt_amt;
	public String incr_amt;
	public String gurt_int_amt;
	public String impl_pfls;
	public String cmpy_cd;

	public AS_LEAS_1502_LCURLIST1Record(){}

	public void setLeas_mm(String leas_mm){
		this.leas_mm = leas_mm;
	}

	public void setBldg_nm(String bldg_nm){
		this.bldg_nm = bldg_nm;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setLeas_dlco_ern_nm(String leas_dlco_ern_nm){
		this.leas_dlco_ern_nm = leas_dlco_ern_nm;
	}

	public void setLeas_prd(String leas_prd){
		this.leas_prd = leas_prd;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setCntr_leas_amt(String cntr_leas_amt){
		this.cntr_leas_amt = cntr_leas_amt;
	}

	public void setCntr_mang_amt(String cntr_mang_amt){
		this.cntr_mang_amt = cntr_mang_amt;
	}

	public void setCntr_gurt_amt(String cntr_gurt_amt){
		this.cntr_gurt_amt = cntr_gurt_amt;
	}

	public void setIncr_amt(String incr_amt){
		this.incr_amt = incr_amt;
	}

	public void setGurt_int_amt(String gurt_int_amt){
		this.gurt_int_amt = gurt_int_amt;
	}

	public void setImpl_pfls(String impl_pfls){
		this.impl_pfls = impl_pfls;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getLeas_mm(){
		return this.leas_mm;
	}

	public String getBldg_nm(){
		return this.bldg_nm;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getLeas_dlco_ern_nm(){
		return this.leas_dlco_ern_nm;
	}

	public String getLeas_prd(){
		return this.leas_prd;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getCntr_leas_amt(){
		return this.cntr_leas_amt;
	}

	public String getCntr_mang_amt(){
		return this.cntr_mang_amt;
	}

	public String getCntr_gurt_amt(){
		return this.cntr_gurt_amt;
	}

	public String getIncr_amt(){
		return this.incr_amt;
	}

	public String getGurt_int_amt(){
		return this.gurt_int_amt;
	}

	public String getImpl_pfls(){
		return this.impl_pfls;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
}

/* 작성시간 : Tue Apr 14 13:47:38 KST 2009 */