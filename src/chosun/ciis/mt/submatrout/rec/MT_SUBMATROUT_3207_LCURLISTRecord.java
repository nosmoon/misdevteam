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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_3207_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_nm;
	public String dlco_per;
	public String dlco_telno;
	public String chrg_pers_email;
	public String dlco_faxno;
	public String ordr_per_nm;
	public String dept_nm;
	public String ordr_per_email;
	public String ordr_telno;
	public String ordr_faxno;
	public String ordr_hp;
	public String ordr_dt;
	public String dlvs_dt;
	public String fac_cd_nm;
	public String amt_pay_mthd;
	public String remk;

	public MT_SUBMATROUT_3207_LCURLISTRecord(){}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_per(String dlco_per){
		this.dlco_per = dlco_per;
	}

	public void setDlco_telno(String dlco_telno){
		this.dlco_telno = dlco_telno;
	}

	public void setChrg_pers_email(String chrg_pers_email){
		this.chrg_pers_email = chrg_pers_email;
	}

	public void setDlco_faxno(String dlco_faxno){
		this.dlco_faxno = dlco_faxno;
	}

	public void setOrdr_per_nm(String ordr_per_nm){
		this.ordr_per_nm = ordr_per_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setOrdr_per_email(String ordr_per_email){
		this.ordr_per_email = ordr_per_email;
	}

	public void setOrdr_telno(String ordr_telno){
		this.ordr_telno = ordr_telno;
	}

	public void setOrdr_faxno(String ordr_faxno){
		this.ordr_faxno = ordr_faxno;
	}

	public void setOrdr_hp(String ordr_hp){
		this.ordr_hp = ordr_hp;
	}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setFac_cd_nm(String fac_cd_nm){
		this.fac_cd_nm = fac_cd_nm;
	}

	public void setAmt_pay_mthd(String amt_pay_mthd){
		this.amt_pay_mthd = amt_pay_mthd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_per(){
		return this.dlco_per;
	}

	public String getDlco_telno(){
		return this.dlco_telno;
	}

	public String getChrg_pers_email(){
		return this.chrg_pers_email;
	}

	public String getDlco_faxno(){
		return this.dlco_faxno;
	}

	public String getOrdr_per_nm(){
		return this.ordr_per_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getOrdr_per_email(){
		return this.ordr_per_email;
	}

	public String getOrdr_telno(){
		return this.ordr_telno;
	}

	public String getOrdr_faxno(){
		return this.ordr_faxno;
	}

	public String getOrdr_hp(){
		return this.ordr_hp;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getFac_cd_nm(){
		return this.fac_cd_nm;
	}

	public String getAmt_pay_mthd(){
		return this.amt_pay_mthd;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Aug 25 14:07:22 KST 2009 */