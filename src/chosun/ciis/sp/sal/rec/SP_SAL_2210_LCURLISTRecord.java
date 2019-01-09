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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String purc_adjm_reg_dt;
	public String purc_adjm_reg_seq;
	public String txn_clsf;
	public String purc_adjm_clsf_nm;
	public String dlco_no;
	public String dlco_nm;
	public String qunt;
	public String suply_amt;
	public String vat_amt;
	public String dduc_amt;
	public String stot_amt;
	public String clos_yn;

	public SP_SAL_2210_LCURLISTRecord(){}

	public void setPurc_adjm_reg_dt(String purc_adjm_reg_dt){
		this.purc_adjm_reg_dt = purc_adjm_reg_dt;
	}

	public void setPurc_adjm_reg_seq(String purc_adjm_reg_seq){
		this.purc_adjm_reg_seq = purc_adjm_reg_seq;
	}

	public void setTxn_clsf(String txn_clsf){
		this.txn_clsf = txn_clsf;
	}

	public void setPurc_adjm_clsf_nm(String purc_adjm_clsf_nm){
		this.purc_adjm_clsf_nm = purc_adjm_clsf_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setDduc_amt(String dduc_amt){
		this.dduc_amt = dduc_amt;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public String getPurc_adjm_reg_dt(){
		return this.purc_adjm_reg_dt;
	}

	public String getPurc_adjm_reg_seq(){
		return this.purc_adjm_reg_seq;
	}

	public String getTxn_clsf(){
		return this.txn_clsf;
	}

	public String getPurc_adjm_clsf_nm(){
		return this.purc_adjm_clsf_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getDduc_amt(){
		return this.dduc_amt;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}
}

/* 작성시간 : Fri Jul 06 18:21:09 KST 2012 */