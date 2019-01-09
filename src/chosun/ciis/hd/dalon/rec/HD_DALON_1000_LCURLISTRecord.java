
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


package chosun.ciis.hd.dalon.rec;

import java.sql.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.ds.*;

/**
 * 
 */


public class HD_DALON_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_basi_dt;
	public String seq;
	public String prvdd_prsnt_tm_prv;
	public String prvdd_finish_tm_aft;
	public String prvdd_finish_tm_prv;
	public String thdd_prsnt_tm_aft;
	public String thdd_prsnt_tm_prv;
	public String thdd_duty_tm_excs;
	public String thdd_duty_tm_undr;
	public String pay_amt;

	public HD_DALON_1000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPrvdd_prsnt_tm_prv(String prvdd_prsnt_tm_prv){
		this.prvdd_prsnt_tm_prv = prvdd_prsnt_tm_prv;
	}

	public void setPrvdd_finish_tm_aft(String prvdd_finish_tm_aft){
		this.prvdd_finish_tm_aft = prvdd_finish_tm_aft;
	}

	public void setPrvdd_finish_tm_prv(String prvdd_finish_tm_prv){
		this.prvdd_finish_tm_prv = prvdd_finish_tm_prv;
	}

	public void setThdd_prsnt_tm_aft(String thdd_prsnt_tm_aft){
		this.thdd_prsnt_tm_aft = thdd_prsnt_tm_aft;
	}

	public void setThdd_prsnt_tm_prv(String thdd_prsnt_tm_prv){
		this.thdd_prsnt_tm_prv = thdd_prsnt_tm_prv;
	}

	public void setThdd_duty_tm_excs(String thdd_duty_tm_excs){
		this.thdd_duty_tm_excs = thdd_duty_tm_excs;
	}

	public void setThdd_duty_tm_undr(String thdd_duty_tm_undr){
		this.thdd_duty_tm_undr = thdd_duty_tm_undr;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPrvdd_prsnt_tm_prv(){
		return this.prvdd_prsnt_tm_prv;
	}

	public String getPrvdd_finish_tm_aft(){
		return this.prvdd_finish_tm_aft;
	}

	public String getPrvdd_finish_tm_prv(){
		return this.prvdd_finish_tm_prv;
	}

	public String getThdd_prsnt_tm_aft(){
		return this.thdd_prsnt_tm_aft;
	}

	public String getThdd_prsnt_tm_prv(){
		return this.thdd_prsnt_tm_prv;
	}

	public String getThdd_duty_tm_excs(){
		return this.thdd_duty_tm_excs;
	}

	public String getThdd_duty_tm_undr(){
		return this.thdd_duty_tm_undr;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}
}

/* 작성시간 : Thu May 21 19:45:41 KST 2009 */