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


public class FC_ACCT_6231_SCUR_EXPRSLTPTCR_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String exp_decl_no;
	public String ship_dt;
	public String frcr_clsf_cd;
	public String exrate;
	public String frcr_amt;
	public String won_amt;

	public FC_ACCT_6231_SCUR_EXPRSLTPTCR_LISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setExp_decl_no(String exp_decl_no){
		this.exp_decl_no = exp_decl_no;
	}

	public void setShip_dt(String ship_dt){
		this.ship_dt = ship_dt;
	}

	public void setFrcr_clsf_cd(String frcr_clsf_cd){
		this.frcr_clsf_cd = frcr_clsf_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getExp_decl_no(){
		return this.exp_decl_no;
	}

	public String getShip_dt(){
		return this.ship_dt;
	}

	public String getFrcr_clsf_cd(){
		return this.frcr_clsf_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getWon_amt(){
		return this.won_amt;
	}
}

/* 작성시간 : Thu Jun 26 15:46:20 KST 2014 */