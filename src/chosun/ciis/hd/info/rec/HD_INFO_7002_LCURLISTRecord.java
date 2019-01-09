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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_7002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String frlc_no;
	public String flnm;
	public String prn;
	public String tel_no;
	public String addr;
	public String chrg_posk_cd;
	public String thrw_pgm;
	public String pay_cycl;
	public String servcost;
	public String serv_pay_cond;
	public String fst_cntr_dt;
	public String last_cntr_dt;
	public String cntr_expr_dt;
	public String draft_no;
	public String bank_cd;
	public String acct_no;
	public String medi_cd;
	public String mang_no;
	public String medi_cd2;
	public String thrw_pgm2;

	public HD_INFO_7002_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrlc_no(String frlc_no){
		this.frlc_no = frlc_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setChrg_posk_cd(String chrg_posk_cd){
		this.chrg_posk_cd = chrg_posk_cd;
	}

	public void setThrw_pgm(String thrw_pgm){
		this.thrw_pgm = thrw_pgm;
	}

	public void setPay_cycl(String pay_cycl){
		this.pay_cycl = pay_cycl;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}

	public void setServ_pay_cond(String serv_pay_cond){
		this.serv_pay_cond = serv_pay_cond;
	}

	public void setFst_cntr_dt(String fst_cntr_dt){
		this.fst_cntr_dt = fst_cntr_dt;
	}

	public void setLast_cntr_dt(String last_cntr_dt){
		this.last_cntr_dt = last_cntr_dt;
	}

	public void setCntr_expr_dt(String cntr_expr_dt){
		this.cntr_expr_dt = cntr_expr_dt;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setMedi_cd2(String medi_cd2){
		this.medi_cd2 = medi_cd2;
	}

	public void setThrw_pgm2(String thrw_pgm2){
		this.thrw_pgm2 = thrw_pgm2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrlc_no(){
		return this.frlc_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getChrg_posk_cd(){
		return this.chrg_posk_cd;
	}

	public String getThrw_pgm(){
		return this.thrw_pgm;
	}

	public String getPay_cycl(){
		return this.pay_cycl;
	}

	public String getServcost(){
		return this.servcost;
	}

	public String getServ_pay_cond(){
		return this.serv_pay_cond;
	}

	public String getFst_cntr_dt(){
		return this.fst_cntr_dt;
	}

	public String getLast_cntr_dt(){
		return this.last_cntr_dt;
	}

	public String getCntr_expr_dt(){
		return this.cntr_expr_dt;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getMedi_cd2(){
		return this.medi_cd2;
	}

	public String getThrw_pgm2(){
		return this.thrw_pgm2;
	}
}

/* 작성시간 : Thu Dec 13 17:50:51 KST 2012 */