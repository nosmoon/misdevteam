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


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_2510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String reg_dt;
	public String reg_seq;
	public String tran_uprc_clas;
	public String pay_dt;
	public String send_yymm;
	public String send_frdt;
	public String send_todt;
	public String tot_amt;
	public String clos_yn;
	public String actu_slip_no;
	public String occr_dt;
	public String seq;
	public String remk;

	public SE_SND_2510_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setSend_yymm(String send_yymm){
		this.send_yymm = send_yymm;
	}

	public void setSend_frdt(String send_frdt){
		this.send_frdt = send_frdt;
	}

	public void setSend_todt(String send_todt){
		this.send_todt = send_todt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getSend_yymm(){
		return this.send_yymm;
	}

	public String getSend_frdt(){
		return this.send_frdt;
	}

	public String getSend_todt(){
		return this.send_todt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Aug 04 20:32:25 KST 2009 */