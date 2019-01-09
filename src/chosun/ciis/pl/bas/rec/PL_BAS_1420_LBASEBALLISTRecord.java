/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.rec;

import java.sql.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */


public class PL_BAS_1420_LBASEBALLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String reg_dt;
	public String reg_seq;
	public String dlco_cd;
	public String dlco_seq;
	public String medi_clsf;
	public String meda_clsf;
	public String setup_dt;
	public String basi_yymm;
	public String setup_amt;
	public String dd_clos_yn;
	public String remk;

	public PL_BAS_1420_LBASEBALLISTRecord(){}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setMeda_clsf(String meda_clsf){
		this.meda_clsf = meda_clsf;
	}

	public void setSetup_dt(String setup_dt){
		this.setup_dt = setup_dt;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setSetup_amt(String setup_amt){
		this.setup_amt = setup_amt;
	}

	public void setDd_clos_yn(String dd_clos_yn){
		this.dd_clos_yn = dd_clos_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getMeda_clsf(){
		return this.meda_clsf;
	}

	public String getSetup_dt(){
		return this.setup_dt;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getSetup_amt(){
		return this.setup_amt;
	}

	public String getDd_clos_yn(){
		return this.dd_clos_yn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu Mar 05 19:55:10 KST 2009 */