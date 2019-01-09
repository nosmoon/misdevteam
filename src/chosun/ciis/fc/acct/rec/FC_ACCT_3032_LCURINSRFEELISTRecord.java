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


public class FC_ACCT_3032_LCURINSRFEELISTRecord extends java.lang.Object implements java.io.Serializable{

	public String x;
	public String pch_shggbnm;
	public String pch_gwgbnm;
	public String mang_no;
	public String insr_nm;
	public String mang_no2;
	public String mtry_dt;
	public String won_amt;
	public String dds;
	public String pch_totilsu;
	public String prvmm_bal;
	public String thmm_dr;
	public String thmm_crdt;
	public String thmm_bal;
	public String mang_clsf_cd;

	public FC_ACCT_3032_LCURINSRFEELISTRecord(){}

	public void setX(String x){
		this.x = x;
	}

	public void setPch_shggbnm(String pch_shggbnm){
		this.pch_shggbnm = pch_shggbnm;
	}

	public void setPch_gwgbnm(String pch_gwgbnm){
		this.pch_gwgbnm = pch_gwgbnm;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setInsr_nm(String insr_nm){
		this.insr_nm = insr_nm;
	}

	public void setMang_no2(String mang_no2){
		this.mang_no2 = mang_no2;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setDds(String dds){
		this.dds = dds;
	}

	public void setPch_totilsu(String pch_totilsu){
		this.pch_totilsu = pch_totilsu;
	}

	public void setPrvmm_bal(String prvmm_bal){
		this.prvmm_bal = prvmm_bal;
	}

	public void setThmm_dr(String thmm_dr){
		this.thmm_dr = thmm_dr;
	}

	public void setThmm_crdt(String thmm_crdt){
		this.thmm_crdt = thmm_crdt;
	}

	public void setThmm_bal(String thmm_bal){
		this.thmm_bal = thmm_bal;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public String getX(){
		return this.x;
	}

	public String getPch_shggbnm(){
		return this.pch_shggbnm;
	}

	public String getPch_gwgbnm(){
		return this.pch_gwgbnm;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getInsr_nm(){
		return this.insr_nm;
	}

	public String getMang_no2(){
		return this.mang_no2;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getDds(){
		return this.dds;
	}

	public String getPch_totilsu(){
		return this.pch_totilsu;
	}

	public String getPrvmm_bal(){
		return this.prvmm_bal;
	}

	public String getThmm_dr(){
		return this.thmm_dr;
	}

	public String getThmm_crdt(){
		return this.thmm_crdt;
	}

	public String getThmm_bal(){
		return this.thmm_bal;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}
}

/* 작성시간 : Thu Feb 05 10:37:49 KST 2009 */