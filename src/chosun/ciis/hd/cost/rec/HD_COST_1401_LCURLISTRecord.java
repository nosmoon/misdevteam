/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.cost.rec;

import java.sql.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.ds.*;

/**
 * 
 */


public class HD_COST_1401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String deal_dt;
	public String use_plac;
	public String deal_amt;
	public String remk_2;
	public String card_no;
	public String occr_dt;
	public String seq;
	public String use_type;
	public String medi_cd;
	public String dtls_medi_cd;

	public HD_COST_1401_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setUse_plac(String use_plac){
		this.use_plac = use_plac;
	}

	public void setDeal_amt(String deal_amt){
		this.deal_amt = deal_amt;
	}

	public void setRemk_2(String remk_2){
		this.remk_2 = remk_2;
	}

	public void setCard_no(String card_no){
		this.card_no = card_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setUse_type(String use_type){
		this.use_type = use_type;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDeal_dt(){
		return this.deal_dt;
	}

	public String getUse_plac(){
		return this.use_plac;
	}

	public String getDeal_amt(){
		return this.deal_amt;
	}

	public String getRemk_2(){
		return this.remk_2;
	}

	public String getCard_no(){
		return this.card_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getUse_type(){
		return this.use_type;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}
}

/* 작성시간 : Mon Jun 26 14:29:31 KST 2017 */