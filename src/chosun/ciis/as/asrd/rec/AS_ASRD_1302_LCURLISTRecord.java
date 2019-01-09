/***************************************************************************************************
* 파일명 : .java
* 기능 :   고정자산 - 취득자산일괄조회
* 작성일자 : 2015.10.01
* 작성자   : 노상현
***************************************************************************************************/


package chosun.ciis.as.asrd.rec;

import java.sql.*;
import chosun.ciis.as.asrd.dm.*;
import chosun.ciis.as.asrd.ds.*;

/**
 * 고정자산 - 취득자산일괄조회
 */

public class AS_ASRD_1302_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_no;
	public String aset_nm;
	public String dept_nm;
	public String bund_nm;
	public String acqr_dt;
	public String orgin_acqr_amt;
	public String vat_amt;
	public String cur_acqr_amt;
	public String un_redm_amt;
	public String sale_dt;
	public String sale_amt;
	public String aset_stat_nm;
	public String aset_qunt_cnt;
	public String aset_usag;
	public String aset_size;
	public String aset_loca;

	public AS_ASRD_1302_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setBund_nm(String bund_nm){
		this.bund_nm = bund_nm;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setOrgin_acqr_amt(String orgin_acqr_amt){
		this.orgin_acqr_amt = orgin_acqr_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setCur_acqr_amt(String cur_acqr_amt){
		this.cur_acqr_amt = cur_acqr_amt;
	}

	public void setUn_redm_amt(String un_redm_amt){
		this.un_redm_amt = un_redm_amt;
	}

	public void setSale_dt(String sale_dt){
		this.sale_dt = sale_dt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setAset_stat_nm(String aset_stat_nm){
		this.aset_stat_nm = aset_stat_nm;
	}

	public void setAset_qunt_cnt(String aset_qunt_cnt){
		this.aset_qunt_cnt = aset_qunt_cnt;
	}

	public void setAset_usag(String aset_usag){
		this.aset_usag = aset_usag;
	}

	public void setAset_size(String aset_size){
		this.aset_size = aset_size;
	}

	public void setAset_loca(String aset_loca){
		this.aset_loca = aset_loca;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getBund_nm(){
		return this.bund_nm;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getOrgin_acqr_amt(){
		return this.orgin_acqr_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getCur_acqr_amt(){
		return this.cur_acqr_amt;
	}

	public String getUn_redm_amt(){
		return this.un_redm_amt;
	}

	public String getSale_dt(){
		return this.sale_dt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getAset_stat_nm(){
		return this.aset_stat_nm;
	}

	public String getAset_qunt_cnt(){
		return this.aset_qunt_cnt;
	}

	public String getAset_usag(){
		return this.aset_usag;
	}

	public String getAset_size(){
		return this.aset_size;
	}

	public String getAset_loca(){
		return this.aset_loca;
	}
}

/* 작성시간 : Mon Apr 17 19:08:41 KST 2017 */