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


public class FC_ACCT_8081_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sdgb;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String acct_cd;
	public String cucustnm;
	public String dfgubun;
	public String obj_amt;
	public String crdt_amt;
	public String seyul;
	public String acntcym;
	public String cnt;
	public String natn_cd;
	public String frnc_addr;

	public FC_ACCT_8081_LCURLISTRecord(){}

	public void setSdgb(String sdgb){
		this.sdgb = sdgb;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setCucustnm(String cucustnm){
		this.cucustnm = cucustnm;
	}

	public void setDfgubun(String dfgubun){
		this.dfgubun = dfgubun;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setSeyul(String seyul){
		this.seyul = seyul;
	}

	public void setAcntcym(String acntcym){
		this.acntcym = acntcym;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setFrnc_addr(String frnc_addr){
		this.frnc_addr = frnc_addr;
	}

	public String getSdgb(){
		return this.sdgb;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getCucustnm(){
		return this.cucustnm;
	}

	public String getDfgubun(){
		return this.dfgubun;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getSeyul(){
		return this.seyul;
	}

	public String getAcntcym(){
		return this.acntcym;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getFrnc_addr(){
		return this.frnc_addr;
	}
}

/* 작성시간 : Thu Jul 09 13:33:28 KST 2015 */