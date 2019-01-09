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


public class AS_ASET_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_no;
	public String aset_nm;
	public String dept_nm;
	public String acqr_dt;
	public String orgin_acqr_amt;
	public String sale_dt;
	public String sale_amt;
	public String svc_yys_cnt;
	public String buy_clsf_nm;
	public String aset_qunt_cnt;
	public String aset_usag;
	public String aset_size;
	public String aset_loca;
	public String incmg_pers_nm;
	public String incmg_dt;
	public String bund_cd;
	public String bund_nm;
	public String insr_type;
	public String make_no;
	public String make_cmpy;
	public String remk;

	public AS_ASET_1002_LCURLISTRecord(){}

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

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setOrgin_acqr_amt(String orgin_acqr_amt){
		this.orgin_acqr_amt = orgin_acqr_amt;
	}

	public void setSale_dt(String sale_dt){
		this.sale_dt = sale_dt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setSvc_yys_cnt(String svc_yys_cnt){
		this.svc_yys_cnt = svc_yys_cnt;
	}

	public void setBuy_clsf_nm(String buy_clsf_nm){
		this.buy_clsf_nm = buy_clsf_nm;
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

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setBund_cd(String bund_cd){
		this.bund_cd = bund_cd;
	}

	public void setBund_nm(String bund_nm){
		this.bund_nm = bund_nm;
	}

	public void setInsr_type(String insr_type){
		this.insr_type = insr_type;
	}

	public void setMake_no(String make_no){
		this.make_no = make_no;
	}

	public void setMake_cmpy(String make_cmpy){
		this.make_cmpy = make_cmpy;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getOrgin_acqr_amt(){
		return this.orgin_acqr_amt;
	}

	public String getSale_dt(){
		return this.sale_dt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getSvc_yys_cnt(){
		return this.svc_yys_cnt;
	}

	public String getBuy_clsf_nm(){
		return this.buy_clsf_nm;
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

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getBund_cd(){
		return this.bund_cd;
	}

	public String getBund_nm(){
		return this.bund_nm;
	}

	public String getInsr_type(){
		return this.insr_type;
	}

	public String getMake_no(){
		return this.make_no;
	}

	public String getMake_cmpy(){
		return this.make_cmpy;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu Oct 08 14:54:50 KST 2015 */