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


public class HD_COST_1303_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String save;
	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String dty_nm;
	public String posi_nm;
	public String card_no;
	public String decid_dt;
	public String deal_dt;
	public String deal_amt;
	public String use_plac;
	public String occr_dt;
	public String actu_slip_no;
	public String proc_clsf_nm;
	public String remk_2;
	public String card_type;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String decid_yymm;
	public String seq;

	public HD_COST_1303_LCURLISTRecord(){}

	public void setSave(String save){
		this.save = save;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setCard_no(String card_no){
		this.card_no = card_no;
	}

	public void setDecid_dt(String decid_dt){
		this.decid_dt = decid_dt;
	}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_amt(String deal_amt){
		this.deal_amt = deal_amt;
	}

	public void setUse_plac(String use_plac){
		this.use_plac = use_plac;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setProc_clsf_nm(String proc_clsf_nm){
		this.proc_clsf_nm = proc_clsf_nm;
	}

	public void setRemk_2(String remk_2){
		this.remk_2 = remk_2;
	}

	public void setCard_type(String card_type){
		this.card_type = card_type;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setDecid_yymm(String decid_yymm){
		this.decid_yymm = decid_yymm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getSave(){
		return this.save;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getCard_no(){
		return this.card_no;
	}

	public String getDecid_dt(){
		return this.decid_dt;
	}

	public String getDeal_dt(){
		return this.deal_dt;
	}

	public String getDeal_amt(){
		return this.deal_amt;
	}

	public String getUse_plac(){
		return this.use_plac;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getProc_clsf_nm(){
		return this.proc_clsf_nm;
	}

	public String getRemk_2(){
		return this.remk_2;
	}

	public String getCard_type(){
		return this.card_type;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getDecid_yymm(){
		return this.decid_yymm;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Fri Oct 14 16:32:57 KST 2016 */