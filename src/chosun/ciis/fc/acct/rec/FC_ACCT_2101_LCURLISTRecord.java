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


public class FC_ACCT_2101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_no;
	public String rmks1;
	public String rmks2;
	public String fisc_dt;
	public String incmg_dt;
	public String draft_impt_amt1;
	public String draft_expn_amt1;
	public String draft_impt_amt2;
	public String draft_expn_amt2;
	public String draft_impt_amt;
	public String draft_expn_amt;

	public FC_ACCT_2101_LCURLISTRecord(){}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setDraft_impt_amt1(String draft_impt_amt1){
		this.draft_impt_amt1 = draft_impt_amt1;
	}

	public void setDraft_expn_amt1(String draft_expn_amt1){
		this.draft_expn_amt1 = draft_expn_amt1;
	}

	public void setDraft_impt_amt2(String draft_impt_amt2){
		this.draft_impt_amt2 = draft_impt_amt2;
	}

	public void setDraft_expn_amt2(String draft_expn_amt2){
		this.draft_expn_amt2 = draft_expn_amt2;
	}

	public void setDraft_impt_amt(String draft_impt_amt){
		this.draft_impt_amt = draft_impt_amt;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getDraft_impt_amt1(){
		return this.draft_impt_amt1;
	}

	public String getDraft_expn_amt1(){
		return this.draft_expn_amt1;
	}

	public String getDraft_impt_amt2(){
		return this.draft_impt_amt2;
	}

	public String getDraft_expn_amt2(){
		return this.draft_expn_amt2;
	}

	public String getDraft_impt_amt(){
		return this.draft_impt_amt;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}
}

/* 작성시간 : Mon Jul 06 17:18:23 KST 2009 */