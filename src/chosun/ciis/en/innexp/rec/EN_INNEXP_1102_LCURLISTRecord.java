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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String proc_yn;
	public String occr_no;
	public String reven_dt;
	public String evnt_nm;
	public String dlco_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String reven_amt;
	public String vat_amt;
	public String tot_amt;
	public String occr_dt;
	public String occr_seq;
	public String titl;
	public String ern;
	public String addr;
	public String presi_nm;
	public String bizcond;
	public String item;
	public String evnt_cd;
	public String chrg_pers_emp_no;
	public String chrg_pers_emp_nm;
	public String stmt_occr_dt;
	public String stmt_occr_seq;

	public EN_INNEXP_1102_LCURLISTRecord(){}

	public void setProc_yn(String proc_yn){
		this.proc_yn = proc_yn;
	}

	public void setOccr_no(String occr_no){
		this.occr_no = occr_no;
	}

	public void setReven_dt(String reven_dt){
		this.reven_dt = reven_dt;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setReven_amt(String reven_amt){
		this.reven_amt = reven_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setChrg_pers_emp_no(String chrg_pers_emp_no){
		this.chrg_pers_emp_no = chrg_pers_emp_no;
	}

	public void setChrg_pers_emp_nm(String chrg_pers_emp_nm){
		this.chrg_pers_emp_nm = chrg_pers_emp_nm;
	}

	public void setStmt_occr_dt(String stmt_occr_dt){
		this.stmt_occr_dt = stmt_occr_dt;
	}

	public void setStmt_occr_seq(String stmt_occr_seq){
		this.stmt_occr_seq = stmt_occr_seq;
	}

	public String getProc_yn(){
		return this.proc_yn;
	}

	public String getOccr_no(){
		return this.occr_no;
	}

	public String getReven_dt(){
		return this.reven_dt;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getReven_amt(){
		return this.reven_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getErn(){
		return this.ern;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getChrg_pers_emp_no(){
		return this.chrg_pers_emp_no;
	}

	public String getChrg_pers_emp_nm(){
		return this.chrg_pers_emp_nm;
	}

	public String getStmt_occr_dt(){
		return this.stmt_occr_dt;
	}

	public String getStmt_occr_seq(){
		return this.stmt_occr_seq;
	}
}

/* 작성시간 : Tue Apr 21 13:38:17 KST 2009 */