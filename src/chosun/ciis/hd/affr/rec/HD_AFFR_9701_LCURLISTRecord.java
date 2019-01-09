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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_9701_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mang_no;
	public String flnm;
	public String aply_obj_name;
	public String expn_clsf_nm;
	public String str_dt;
	public String end_dt;
	public String limt_amt;
	public String sply_amt;
	public String bank_nm;
	public String acct_no;
	public String deps_per;
	public String phon_no;
	public String seq;
	public String cmpy_cd;
	public String stlm_desty;
	public String proc_stat;
	public String proc_stat_nm;

	public HD_AFFR_9701_LCURLISTRecord(){}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}
	
	public void setAply_obj_name(String aply_obj_name){
		this.aply_obj_name = aply_obj_name;
	}
	
	public void setExpn_clsf_nm(String expn_clsf_nm){
		this.expn_clsf_nm = expn_clsf_nm;
	}

	public void setStr_dt(String str_dt){
		this.str_dt = str_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setLimt_amt(String limt_amt){
		this.limt_amt = limt_amt;
	}

	public void setSply_amt(String sply_amt){
		this.sply_amt = sply_amt;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}
	
	public void setDeps_per(String deps_per){
		this.deps_per = deps_per;
	}
	
	public void setPhon_no(String phon_no){
		this.phon_no = phon_no;
	}
	
	public void setSeq(String seq){
		this.seq = seq;
	}
	
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}
	
	public void setStlm_desty(String stlm_desty){
		this.stlm_desty = stlm_desty;
	}
	
	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}
	
	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}
	
	public String getMang_no(){
		return this.mang_no;
	}

	public String getFlnm(){
		return this.flnm;
	}
	
	public String getAply_obj_name(){
		return this.aply_obj_name;
	}
	
	public String getExpn_clsf_nm(){
		return this.expn_clsf_nm;
	}

	public String getStr_dt(){
		return this.str_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}
	
	public String getLimt_amt(){
		return this.limt_amt;
	}

	public String getSply_amt(){
		return this.sply_amt;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}
	
	public String getDeps_per(){
		return this.deps_per;
	}
	
	public String getPhon_no(){
		return this.phon_no;
	}
	
	public String getSeq(){
		return this.seq;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	
	public String getStlm_desty(){
		return this.stlm_desty;
	}
	
	public String getProc_stat(){
		return this.proc_stat;
	}
	
	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}	
	
}

/* 작성시간 : Mon Nov 23 14:12:37 KST 2009 */