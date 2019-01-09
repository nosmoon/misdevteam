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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1110_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String repl_rtcn_cnfm1;
	public String repl_rtcn_cnfm2;
	public String repl_rtcn_cnfm3;
	public String mortg_clsf;
	public String mortg_cont;
	public String mortg_amt;
	public String acct_no;
	public String gurt_frdt;
	public String gurt_todt;
	public String ewh_dt;
	public String remk;
	public String setup_pers;
	public String ewh_cnfm;
	public String owh_cnfm;
	public String eip_stat;

	public AD_BAS_1110_SCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRepl_rtcn_cnfm1(String repl_rtcn_cnfm1){
		this.repl_rtcn_cnfm1 = repl_rtcn_cnfm1;
	}

	public void setRepl_rtcn_cnfm2(String repl_rtcn_cnfm2){
		this.repl_rtcn_cnfm2 = repl_rtcn_cnfm2;
	}

	public void setRepl_rtcn_cnfm3(String repl_rtcn_cnfm3){
		this.repl_rtcn_cnfm3 = repl_rtcn_cnfm3;
	}

	public void setMortg_clsf(String mortg_clsf){
		this.mortg_clsf = mortg_clsf;
	}

	public void setMortg_cont(String mortg_cont){
		this.mortg_cont = mortg_cont;
	}

	public void setMortg_amt(String mortg_amt){
		this.mortg_amt = mortg_amt;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setGurt_frdt(String gurt_frdt){
		this.gurt_frdt = gurt_frdt;
	}

	public void setGurt_todt(String gurt_todt){
		this.gurt_todt = gurt_todt;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSetup_pers(String setup_pers){
		this.setup_pers = setup_pers;
	}

	public void setEwh_cnfm(String ewh_cnfm){
		this.ewh_cnfm = ewh_cnfm;
	}

	public void setOwh_cnfm(String owh_cnfm){
		this.owh_cnfm = owh_cnfm;
	}

	public void setEip_stat(String eip_stat){
		this.eip_stat = eip_stat;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRepl_rtcn_cnfm1(){
		return this.repl_rtcn_cnfm1;
	}

	public String getRepl_rtcn_cnfm2(){
		return this.repl_rtcn_cnfm2;
	}

	public String getRepl_rtcn_cnfm3(){
		return this.repl_rtcn_cnfm3;
	}

	public String getMortg_clsf(){
		return this.mortg_clsf;
	}

	public String getMortg_cont(){
		return this.mortg_cont;
	}

	public String getMortg_amt(){
		return this.mortg_amt;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getGurt_frdt(){
		return this.gurt_frdt;
	}

	public String getGurt_todt(){
		return this.gurt_todt;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSetup_pers(){
		return this.setup_pers;
	}

	public String getEwh_cnfm(){
		return this.ewh_cnfm;
	}

	public String getOwh_cnfm(){
		return this.owh_cnfm;
	}

	public String getEip_stat(){
		return this.eip_stat;
	}
}

/* 작성시간 : Wed Jun 05 18:01:24 KST 2013 */