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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String car_ownr_nm;
	public String car_no;
	public String prn;
	public String ptph_no;
	public String addr;
	public String engn_dsplt;
	public String insr_entr_hope_yn;
	public String reg_dt;
	public String proc_clsf;

	public SP_SAL_1610_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setCar_ownr_nm(String car_ownr_nm){
		this.car_ownr_nm = car_ownr_nm;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setEngn_dsplt(String engn_dsplt){
		this.engn_dsplt = engn_dsplt;
	}

	public void setInsr_entr_hope_yn(String insr_entr_hope_yn){
		this.insr_entr_hope_yn = insr_entr_hope_yn;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getCar_ownr_nm(){
		return this.car_ownr_nm;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getEngn_dsplt(){
		return this.engn_dsplt;
	}

	public String getInsr_entr_hope_yn(){
		return this.insr_entr_hope_yn;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}
}

/* 작성시간 : Fri Jul 06 09:11:13 KST 2012 */