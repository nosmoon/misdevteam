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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_6210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_no;
	public String cmpy_blng_cd;
	public String nm_korn;
	public String tel_no;
	public String fit_yy;
	public String fit_no;
	public String fitness_dus;
	public String locker_yn;
	public String locker_pay;
	public String fitness_sum;
	public String remk;
	public String magam_yn;
	public String occr_dt;
	public String seq;

	public HD_SALY_6210_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setCmpy_blng_cd(String cmpy_blng_cd){
		this.cmpy_blng_cd = cmpy_blng_cd;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFit_yy(String fit_yy){
		this.fit_yy = fit_yy;
	}

	public void setFit_no(String fit_no){
		this.fit_no = fit_no;
	}

	public void setFitness_dus(String fitness_dus){
		this.fitness_dus = fitness_dus;
	}

	public void setLocker_yn(String locker_yn){
		this.locker_yn = locker_yn;
	}

	public void setLocker_pay(String locker_pay){
		this.locker_pay = locker_pay;
	}

	public void setFitness_sum(String fitness_sum){
		this.fitness_sum = fitness_sum;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMagam_yn(String magam_yn){
		this.magam_yn = magam_yn;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getCmpy_blng_cd(){
		return this.cmpy_blng_cd;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFit_yy(){
		return this.fit_yy;
	}

	public String getFit_no(){
		return this.fit_no;
	}

	public String getFitness_dus(){
		return this.fitness_dus;
	}

	public String getLocker_yn(){
		return this.locker_yn;
	}

	public String getLocker_pay(){
		return this.locker_pay;
	}

	public String getFitness_sum(){
		return this.fitness_sum;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMagam_yn(){
		return this.magam_yn;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Thu Sep 17 14:12:39 KST 2015 */