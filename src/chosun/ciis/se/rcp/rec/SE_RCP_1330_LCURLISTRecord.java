/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
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


public class SE_RCP_1330_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String chrg_pers;
	public String net_sale_amt;
	public String acml_gurt_amt_stot;
	public String sply_rem_amt;
	public String misuamt;
	public String rcpm_amt;
	public String cntr_gurt_amt_stot;

	public SE_RCP_1330_LCURLISTRecord(){}

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

	public void setAcml_gurt_amt_stot(String acml_gurt_amt_stot){
		this.acml_gurt_amt_stot = acml_gurt_amt_stot;
	}

	public void setSply_rem_amt(String sply_rem_amt){
		this.sply_rem_amt = sply_rem_amt;
	}

	public void setMisuamt(String misuamt){
		this.misuamt = misuamt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setCntr_gurt_amt_stot(String cntr_gurt_amt_stot){
		this.cntr_gurt_amt_stot = cntr_gurt_amt_stot;
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

	public String getAcml_gurt_amt_stot(){
		return this.acml_gurt_amt_stot;
	}

	public String getSply_rem_amt(){
		return this.sply_rem_amt;
	}

	public String getMisuamt(){
		return this.misuamt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getCntr_gurt_amt_stot(){
		return this.cntr_gurt_amt_stot;
	}
}

/* 작성시간 : Wed Apr 29 13:44:00 KST 2009 */