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


public class FC_FUNC_1401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String eenosb;
	public String note_clsf_cd_nm;
	public String stcdnm;
	public String stat_dt;
	public String mtry_dt;
	public String note_amt;
	public String eejpno;
	public String issu_pers_nm;
	public String bank_cd_nm;
	public String pay_plac_cd_nm;
	public String dlco_cd;
	public String eecompnm;
	public String eseecompcd;
	public String eseecompnm;
	public String eeghcdnm;
	public String esjphno;

	public FC_FUNC_1401_LCURLISTRecord(){}

	public void setEenosb(String eenosb){
		this.eenosb = eenosb;
	}

	public void setNote_clsf_cd_nm(String note_clsf_cd_nm){
		this.note_clsf_cd_nm = note_clsf_cd_nm;
	}

	public void setStcdnm(String stcdnm){
		this.stcdnm = stcdnm;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setEejpno(String eejpno){
		this.eejpno = eejpno;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setBank_cd_nm(String bank_cd_nm){
		this.bank_cd_nm = bank_cd_nm;
	}

	public void setPay_plac_cd_nm(String pay_plac_cd_nm){
		this.pay_plac_cd_nm = pay_plac_cd_nm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setEecompnm(String eecompnm){
		this.eecompnm = eecompnm;
	}

	public void setEseecompcd(String eseecompcd){
		this.eseecompcd = eseecompcd;
	}

	public void setEseecompnm(String eseecompnm){
		this.eseecompnm = eseecompnm;
	}

	public void setEeghcdnm(String eeghcdnm){
		this.eeghcdnm = eeghcdnm;
	}

	public void setEsjphno(String esjphno){
		this.esjphno = esjphno;
	}

	public String getEenosb(){
		return this.eenosb;
	}

	public String getNote_clsf_cd_nm(){
		return this.note_clsf_cd_nm;
	}

	public String getStcdnm(){
		return this.stcdnm;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getEejpno(){
		return this.eejpno;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getBank_cd_nm(){
		return this.bank_cd_nm;
	}

	public String getPay_plac_cd_nm(){
		return this.pay_plac_cd_nm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getEecompnm(){
		return this.eecompnm;
	}

	public String getEseecompcd(){
		return this.eseecompcd;
	}

	public String getEseecompnm(){
		return this.eseecompnm;
	}

	public String getEeghcdnm(){
		return this.eeghcdnm;
	}

	public String getEsjphno(){
		return this.esjphno;
	}
}

/* 작성시간 : Mon Mar 09 14:16:02 KST 2009 */