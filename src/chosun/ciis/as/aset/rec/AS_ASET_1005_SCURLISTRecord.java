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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1005_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_no;
	public String bldg_plcw;
	public String land_size;
	public String bldg_size;
	public String flor_size;
	public String arch;
	public String flor_cnt;
	public String cmpl_yymm;
	public String acqr_tax_amt;
	public String acqr_tax_yymm;
	public String now_tax_amt;
	public String now_tax_yymm;
	public String blng_ward_offi;
	public String under_flor;
	public String under_size;
	public String bldg_prmt_dt;
	public String leas_ern_no;
	public String rela_no;
	public String rela_nm;

	public AS_ASET_1005_SCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setBldg_plcw(String bldg_plcw){
		this.bldg_plcw = bldg_plcw;
	}

	public void setLand_size(String land_size){
		this.land_size = land_size;
	}

	public void setBldg_size(String bldg_size){
		this.bldg_size = bldg_size;
	}

	public void setFlor_size(String flor_size){
		this.flor_size = flor_size;
	}

	public void setArch(String arch){
		this.arch = arch;
	}

	public void setFlor_cnt(String flor_cnt){
		this.flor_cnt = flor_cnt;
	}

	public void setCmpl_yymm(String cmpl_yymm){
		this.cmpl_yymm = cmpl_yymm;
	}

	public void setAcqr_tax_amt(String acqr_tax_amt){
		this.acqr_tax_amt = acqr_tax_amt;
	}

	public void setAcqr_tax_yymm(String acqr_tax_yymm){
		this.acqr_tax_yymm = acqr_tax_yymm;
	}

	public void setNow_tax_amt(String now_tax_amt){
		this.now_tax_amt = now_tax_amt;
	}

	public void setNow_tax_yymm(String now_tax_yymm){
		this.now_tax_yymm = now_tax_yymm;
	}

	public void setBlng_ward_offi(String blng_ward_offi){
		this.blng_ward_offi = blng_ward_offi;
	}

	public void setUnder_flor(String under_flor){
		this.under_flor = under_flor;
	}

	public void setUnder_size(String under_size){
		this.under_size = under_size;
	}

	public void setBldg_prmt_dt(String bldg_prmt_dt){
		this.bldg_prmt_dt = bldg_prmt_dt;
	}

	public void setLeas_ern_no(String leas_ern_no){
		this.leas_ern_no = leas_ern_no;
	}

	public void setRela_no(String rela_no){
		this.rela_no = rela_no;
	}

	public void setRela_nm(String rela_nm){
		this.rela_nm = rela_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getBldg_plcw(){
		return this.bldg_plcw;
	}

	public String getLand_size(){
		return this.land_size;
	}

	public String getBldg_size(){
		return this.bldg_size;
	}

	public String getFlor_size(){
		return this.flor_size;
	}

	public String getArch(){
		return this.arch;
	}

	public String getFlor_cnt(){
		return this.flor_cnt;
	}

	public String getCmpl_yymm(){
		return this.cmpl_yymm;
	}

	public String getAcqr_tax_amt(){
		return this.acqr_tax_amt;
	}

	public String getAcqr_tax_yymm(){
		return this.acqr_tax_yymm;
	}

	public String getNow_tax_amt(){
		return this.now_tax_amt;
	}

	public String getNow_tax_yymm(){
		return this.now_tax_yymm;
	}

	public String getBlng_ward_offi(){
		return this.blng_ward_offi;
	}

	public String getUnder_flor(){
		return this.under_flor;
	}

	public String getUnder_size(){
		return this.under_size;
	}

	public String getBldg_prmt_dt(){
		return this.bldg_prmt_dt;
	}

	public String getLeas_ern_no(){
		return this.leas_ern_no;
	}

	public String getRela_no(){
		return this.rela_no;
	}

	public String getRela_nm(){
		return this.rela_nm;
	}
}

/* 작성시간 : Wed Mar 04 12:58:00 KST 2009 */