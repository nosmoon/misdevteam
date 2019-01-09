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


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_1230_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String chrg_pers;
	public String net_sale_amt;
	public String acct_tot_amt;
	public String acpt_tot_amt;
	public String rmtt_dt;
	public String rmtt_plac;
	public String pdlv_altn_amt;

	public SE_RCP_1230_LCURLISTRecord(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setAcct_tot_amt(String acct_tot_amt){
		this.acct_tot_amt = acct_tot_amt;
	}

	public void setAcpt_tot_amt(String acpt_tot_amt){
		this.acpt_tot_amt = acpt_tot_amt;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setPdlv_altn_amt(String pdlv_altn_amt){
		this.pdlv_altn_amt = pdlv_altn_amt;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getAcct_tot_amt(){
		return this.acct_tot_amt;
	}

	public String getAcpt_tot_amt(){
		return this.acpt_tot_amt;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getPdlv_altn_amt(){
		return this.pdlv_altn_amt;
	}
}

/* 작성시간 : Wed Nov 28 11:25:32 KST 2012 */