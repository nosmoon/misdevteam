/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_5262_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String saly_shft_bank_cd;
	public String saly_shft_bank_nm;
	public String saly_shft_acct_no;
	public String alon_shft_bank_cd;
	public String alon_shft_bank_nm;
	public String alon_shft_acct_no;
	public String encrg_amt_shft_bank_cd;
	public String encrg_amt_shft_bank_nm;
	public String encrg_amt_shft_acct_no;
	public String etc_shft_bank_cd;
	public String etc_shft_bank_nm;
	public String etc_shft_acct_no;
	public String etc_amt_shft_acct;
	public String etc_amt_shft_acct_nm;
	public String proc_stat;
	public String proc_stat_nm;

	public HD_INFO_5262_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSaly_shft_bank_cd(String saly_shft_bank_cd){
		this.saly_shft_bank_cd = saly_shft_bank_cd;
	}

	public void setSaly_shft_bank_nm(String saly_shft_bank_nm){
		this.saly_shft_bank_nm = saly_shft_bank_nm;
	}

	public void setSaly_shft_acct_no(String saly_shft_acct_no){
		this.saly_shft_acct_no = saly_shft_acct_no;
	}

	public void setAlon_shft_bank_cd(String alon_shft_bank_cd){
		this.alon_shft_bank_cd = alon_shft_bank_cd;
	}

	public void setAlon_shft_bank_nm(String alon_shft_bank_nm){
		this.alon_shft_bank_nm = alon_shft_bank_nm;
	}

	public void setAlon_shft_acct_no(String alon_shft_acct_no){
		this.alon_shft_acct_no = alon_shft_acct_no;
	}

	public void setEncrg_amt_shft_bank_cd(String encrg_amt_shft_bank_cd){
		this.encrg_amt_shft_bank_cd = encrg_amt_shft_bank_cd;
	}

	public void setEncrg_amt_shft_bank_nm(String encrg_amt_shft_bank_nm){
		this.encrg_amt_shft_bank_nm = encrg_amt_shft_bank_nm;
	}

	public void setEncrg_amt_shft_acct_no(String encrg_amt_shft_acct_no){
		this.encrg_amt_shft_acct_no = encrg_amt_shft_acct_no;
	}

	public void setEtc_shft_bank_cd(String etc_shft_bank_cd){
		this.etc_shft_bank_cd = etc_shft_bank_cd;
	}

	public void setEtc_shft_bank_nm(String etc_shft_bank_nm){
		this.etc_shft_bank_nm = etc_shft_bank_nm;
	}

	public void setEtc_shft_acct_no(String etc_shft_acct_no){
		this.etc_shft_acct_no = etc_shft_acct_no;
	}

	public void setEtc_amt_shft_acct(String etc_amt_shft_acct){
		this.etc_amt_shft_acct = etc_amt_shft_acct;
	}

	public void setEtc_amt_shft_acct_nm(String etc_amt_shft_acct_nm){
		this.etc_amt_shft_acct_nm = etc_amt_shft_acct_nm;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSaly_shft_bank_cd(){
		return this.saly_shft_bank_cd;
	}

	public String getSaly_shft_bank_nm(){
		return this.saly_shft_bank_nm;
	}

	public String getSaly_shft_acct_no(){
		return this.saly_shft_acct_no;
	}

	public String getAlon_shft_bank_cd(){
		return this.alon_shft_bank_cd;
	}

	public String getAlon_shft_bank_nm(){
		return this.alon_shft_bank_nm;
	}

	public String getAlon_shft_acct_no(){
		return this.alon_shft_acct_no;
	}

	public String getEncrg_amt_shft_bank_cd(){
		return this.encrg_amt_shft_bank_cd;
	}

	public String getEncrg_amt_shft_bank_nm(){
		return this.encrg_amt_shft_bank_nm;
	}

	public String getEncrg_amt_shft_acct_no(){
		return this.encrg_amt_shft_acct_no;
	}

	public String getEtc_shft_bank_cd(){
		return this.etc_shft_bank_cd;
	}

	public String getEtc_shft_bank_nm(){
		return this.etc_shft_bank_nm;
	}

	public String getEtc_shft_acct_no(){
		return this.etc_shft_acct_no;
	}

	public String getEtc_amt_shft_acct(){
		return this.etc_amt_shft_acct;
	}

	public String getEtc_amt_shft_acct_nm(){
		return this.etc_amt_shft_acct_nm;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}
}

/* �ۼ��ð� : Mon Dec 18 11:42:11 KST 2017 */