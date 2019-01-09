/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1410_SRCPMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fpymt_dt;
	public String ratio;
	public String cyov_bal;
	public String prvmm_net_sale_amt;
	public String smt_amt;
	public String rcpm_amt;
	public String rcpm_bal;
	public String label;
	public String bo_cyov;
	public String adjm_cyov;
	public String bal;
	public String net_sale_amt;
	public String smt_amt2;

	public SE_SAL_1410_SRCPMLISTRecord(){}

	public void setFpymt_dt(String fpymt_dt){
		this.fpymt_dt = fpymt_dt;
	}

	public void setRatio(String ratio){
		this.ratio = ratio;
	}

	public void setCyov_bal(String cyov_bal){
		this.cyov_bal = cyov_bal;
	}

	public void setPrvmm_net_sale_amt(String prvmm_net_sale_amt){
		this.prvmm_net_sale_amt = prvmm_net_sale_amt;
	}

	public void setSmt_amt(String smt_amt){
		this.smt_amt = smt_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_bal(String rcpm_bal){
		this.rcpm_bal = rcpm_bal;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public void setBo_cyov(String bo_cyov){
		this.bo_cyov = bo_cyov;
	}

	public void setAdjm_cyov(String adjm_cyov){
		this.adjm_cyov = adjm_cyov;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setSmt_amt2(String smt_amt2){
		this.smt_amt2 = smt_amt2;
	}

	public String getFpymt_dt(){
		return this.fpymt_dt;
	}

	public String getRatio(){
		return this.ratio;
	}

	public String getCyov_bal(){
		return this.cyov_bal;
	}

	public String getPrvmm_net_sale_amt(){
		return this.prvmm_net_sale_amt;
	}

	public String getSmt_amt(){
		return this.smt_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_bal(){
		return this.rcpm_bal;
	}

	public String getLabel(){
		return this.label;
	}

	public String getBo_cyov(){
		return this.bo_cyov;
	}

	public String getAdjm_cyov(){
		return this.adjm_cyov;
	}

	public String getBal(){
		return this.bal;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getSmt_amt2(){
		return this.smt_amt2;
	}
}

/* 작성시간 : Wed Sep 02 14:58:23 KST 2009 */