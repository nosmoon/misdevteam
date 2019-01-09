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


public class FC_ACCT_8091_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String incm_clsf_cd;
	public String yscd;
	public String acntcymd;
	public String dlco_cd;
	public String dlco_nm;
	public String jgamt;
	public String sdsamt;
	public String jmsamt;
	public String jeog;

	public FC_ACCT_8091_LCURLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setYscd(String yscd){
		this.yscd = yscd;
	}

	public void setAcntcymd(String acntcymd){
		this.acntcymd = acntcymd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setJgamt(String jgamt){
		this.jgamt = jgamt;
	}

	public void setSdsamt(String sdsamt){
		this.sdsamt = sdsamt;
	}

	public void setJmsamt(String jmsamt){
		this.jmsamt = jmsamt;
	}

	public void setJeog(String jeog){
		this.jeog = jeog;
	}

	public String getChk(){
		return this.chk;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getYscd(){
		return this.yscd;
	}

	public String getAcntcymd(){
		return this.acntcymd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getJgamt(){
		return this.jgamt;
	}

	public String getSdsamt(){
		return this.sdsamt;
	}

	public String getJmsamt(){
		return this.jmsamt;
	}

	public String getJeog(){
		return this.jeog;
	}
}

/* 작성시간 : Fri Apr 17 13:21:36 KST 2009 */