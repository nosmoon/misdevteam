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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1441_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dt;
	public String pay_plac_cd;
	public String now_note_stat_cd_nm;
	public String note_no;
	public String mtry_dt;
	public String note_amt;
	public String dlco_clsf_cd_nm;
	public String issu_pers_nm;
	public String bank_cd_nm;
	public String note_clsf_cd_nm;
	public String cymd;
	public String total;

	public FC_FUNC_1441_LCURLISTRecord(){}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setPay_plac_cd(String pay_plac_cd){
		this.pay_plac_cd = pay_plac_cd;
	}

	public void setNow_note_stat_cd_nm(String now_note_stat_cd_nm){
		this.now_note_stat_cd_nm = now_note_stat_cd_nm;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setDlco_clsf_cd_nm(String dlco_clsf_cd_nm){
		this.dlco_clsf_cd_nm = dlco_clsf_cd_nm;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setBank_cd_nm(String bank_cd_nm){
		this.bank_cd_nm = bank_cd_nm;
	}

	public void setNote_clsf_cd_nm(String note_clsf_cd_nm){
		this.note_clsf_cd_nm = note_clsf_cd_nm;
	}

	public void setCymd(String cymd){
		this.cymd = cymd;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getPay_plac_cd(){
		return this.pay_plac_cd;
	}

	public String getNow_note_stat_cd_nm(){
		return this.now_note_stat_cd_nm;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getDlco_clsf_cd_nm(){
		return this.dlco_clsf_cd_nm;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getBank_cd_nm(){
		return this.bank_cd_nm;
	}

	public String getNote_clsf_cd_nm(){
		return this.note_clsf_cd_nm;
	}

	public String getCymd(){
		return this.cymd;
	}

	public String getTotal(){
		return this.total;
	}
}

/* 작성시간 : Tue Mar 03 16:18:38 KST 2009 */