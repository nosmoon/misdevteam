/***************************************************************************************************
* 파일명 : MT_PRNPAP_1000_LCURLISTRecord.java
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-03-30 
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String occr_qq;
	public String seq;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String papcmpy_cd;
	public String papcmpy_nm;
	public String eqp_mchn_no;
	public String test_ask_dt;
	public String test_frdt;
	public String test_todt;
	public String test_instt;
	public String remk;

	public MT_PRNPAP_1000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_qq(String occr_qq){
		this.occr_qq = occr_qq;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setPapcmpy_nm(String papcmpy_nm){
		this.papcmpy_nm = papcmpy_nm;
	}

	public void setEqp_mchn_no(String eqp_mchn_no){
		this.eqp_mchn_no = eqp_mchn_no;
	}

	public void setTest_ask_dt(String test_ask_dt){
		this.test_ask_dt = test_ask_dt;
	}

	public void setTest_frdt(String test_frdt){
		this.test_frdt = test_frdt;
	}

	public void setTest_todt(String test_todt){
		this.test_todt = test_todt;
	}

	public void setTest_instt(String test_instt){
		this.test_instt = test_instt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_qq(){
		return this.occr_qq;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getPapcmpy_nm(){
		return this.papcmpy_nm;
	}

	public String getEqp_mchn_no(){
		return this.eqp_mchn_no;
	}

	public String getTest_ask_dt(){
		return this.test_ask_dt;
	}

	public String getTest_frdt(){
		return this.test_frdt;
	}

	public String getTest_todt(){
		return this.test_todt;
	}

	public String getTest_instt(){
		return this.test_instt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Mar 30 17:09:10 KST 2009 */