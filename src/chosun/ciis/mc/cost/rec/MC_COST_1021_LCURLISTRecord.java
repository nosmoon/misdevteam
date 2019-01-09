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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_1021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_cdnm;
	public String medi_dstb_cd;
	public String mccdnm;
	public String dtls_medi_dstb_cd;
	public String dtls_medi_dstb_cdnm;
	public String whco_ndstb_cd;
	public String jscdnm;
	public String whco_comn_cost_yn;
	public String use_yn;

	public MC_COST_1021_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setMedi_dstb_cd(String medi_dstb_cd){
		this.medi_dstb_cd = medi_dstb_cd;
	}

	public void setMccdnm(String mccdnm){
		this.mccdnm = mccdnm;
	}

	public void setDtls_medi_dstb_cd(String dtls_medi_dstb_cd){
		this.dtls_medi_dstb_cd = dtls_medi_dstb_cd;
	}

	public void setDtls_medi_dstb_cdnm(String dtls_medi_dstb_cdnm){
		this.dtls_medi_dstb_cdnm = dtls_medi_dstb_cdnm;
	}

	public void setWhco_ndstb_cd(String whco_ndstb_cd){
		this.whco_ndstb_cd = whco_ndstb_cd;
	}

	public void setJscdnm(String jscdnm){
		this.jscdnm = jscdnm;
	}

	public void setWhco_comn_cost_yn(String whco_comn_cost_yn){
		this.whco_comn_cost_yn = whco_comn_cost_yn;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getMedi_dstb_cd(){
		return this.medi_dstb_cd;
	}

	public String getMccdnm(){
		return this.mccdnm;
	}

	public String getDtls_medi_dstb_cd(){
		return this.dtls_medi_dstb_cd;
	}

	public String getDtls_medi_dstb_cdnm(){
		return this.dtls_medi_dstb_cdnm;
	}

	public String getWhco_ndstb_cd(){
		return this.whco_ndstb_cd;
	}

	public String getJscdnm(){
		return this.jscdnm;
	}

	public String getWhco_comn_cost_yn(){
		return this.whco_comn_cost_yn;
	}

	public String getUse_yn(){
		return this.use_yn;
	}
}

/* 작성시간 : Tue Apr 28 13:38:23 KST 2009 */