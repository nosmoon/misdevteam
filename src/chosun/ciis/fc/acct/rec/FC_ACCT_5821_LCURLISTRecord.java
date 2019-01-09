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


public class FC_ACCT_5821_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pch_acctnm;
	public String dlco_cd;
	public String pch_compnm;
	public String pch_convno;
	public String pch_gwgbnm;
	public String pch_mccdnm;
	public String intg_dlco_cd;
	public String pch_hsnm;
	public String dr_amt;
	public String crdt_amt;
	public String pch_amt;
	public String dr_amt_00;
	public String crdt_amt_00;
	public String pch_amt_00;

	public FC_ACCT_5821_LCURLISTRecord(){}

	public void setPch_acctnm(String pch_acctnm){
		this.pch_acctnm = pch_acctnm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setPch_convno(String pch_convno){
		this.pch_convno = pch_convno;
	}

	public void setPch_gwgbnm(String pch_gwgbnm){
		this.pch_gwgbnm = pch_gwgbnm;
	}

	public void setPch_mccdnm(String pch_mccdnm){
		this.pch_mccdnm = pch_mccdnm;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setPch_hsnm(String pch_hsnm){
		this.pch_hsnm = pch_hsnm;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setPch_amt(String pch_amt){
		this.pch_amt = pch_amt;
	}

	public void setDr_amt_00(String dr_amt_00){
		this.dr_amt_00 = dr_amt_00;
	}

	public void setCrdt_amt_00(String crdt_amt_00){
		this.crdt_amt_00 = crdt_amt_00;
	}

	public void setPch_amt_00(String pch_amt_00){
		this.pch_amt_00 = pch_amt_00;
	}

	public String getPch_acctnm(){
		return this.pch_acctnm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getPch_convno(){
		return this.pch_convno;
	}

	public String getPch_gwgbnm(){
		return this.pch_gwgbnm;
	}

	public String getPch_mccdnm(){
		return this.pch_mccdnm;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getPch_hsnm(){
		return this.pch_hsnm;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getPch_amt(){
		return this.pch_amt;
	}

	public String getDr_amt_00(){
		return this.dr_amt_00;
	}

	public String getCrdt_amt_00(){
		return this.crdt_amt_00;
	}

	public String getPch_amt_00(){
		return this.pch_amt_00;
	}
}

/* 작성시간 : Mon Jun 04 15:15:23 KST 2018 */