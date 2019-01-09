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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_4041_PCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fisc_dt;
	public String compcd;
	public String compnm;
	public String rmks1;
	public String rmks2;
	public String jpcd;
	public String occr_amt;
	public String occr_acct_cd;
	public String occr_acct_nm;
	public String extnc_acct_cd;
	public String extnc_acct_nm;
	public String sjamt;

	public FC_ACCT_4041_PCURLISTRecord(){}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setCompcd(String compcd){
		this.compcd = compcd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setJpcd(String jpcd){
		this.jpcd = jpcd;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setOccr_acct_cd(String occr_acct_cd){
		this.occr_acct_cd = occr_acct_cd;
	}

	public void setOccr_acct_nm(String occr_acct_nm){
		this.occr_acct_nm = occr_acct_nm;
	}

	public void setExtnc_acct_cd(String extnc_acct_cd){
		this.extnc_acct_cd = extnc_acct_cd;
	}

	public void setExtnc_acct_nm(String extnc_acct_nm){
		this.extnc_acct_nm = extnc_acct_nm;
	}

	public void setSjamt(String sjamt){
		this.sjamt = sjamt;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getCompcd(){
		return this.compcd;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getJpcd(){
		return this.jpcd;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getOccr_acct_cd(){
		return this.occr_acct_cd;
	}

	public String getOccr_acct_nm(){
		return this.occr_acct_nm;
	}

	public String getExtnc_acct_cd(){
		return this.extnc_acct_cd;
	}

	public String getExtnc_acct_nm(){
		return this.extnc_acct_nm;
	}

	public String getSjamt(){
		return this.sjamt;
	}
}

/* 작성시간 : Thu Aug 06 18:08:40 KST 2009 */