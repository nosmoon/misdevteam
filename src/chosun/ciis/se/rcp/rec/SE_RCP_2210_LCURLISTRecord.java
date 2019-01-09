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


public class SE_RCP_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_nm;
	public String bo_head_nm;
	public String cyov_bal;
	public String net_sale_amt;
	public String tot_amt;
	public String aigamt;
	public String jamt;
	public String rcpm_rate;
	public String fpymt_dt;
	public String clos_amt;
	public String fpymt_encur_amt;
	public String ajggiw;
	public String ajrgiw;
	public String pdlv_altn_amt;

	public SE_RCP_2210_LCURLISTRecord(){}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setCyov_bal(String cyov_bal){
		this.cyov_bal = cyov_bal;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setAigamt(String aigamt){
		this.aigamt = aigamt;
	}

	public void setJamt(String jamt){
		this.jamt = jamt;
	}

	public void setRcpm_rate(String rcpm_rate){
		this.rcpm_rate = rcpm_rate;
	}

	public void setFpymt_dt(String fpymt_dt){
		this.fpymt_dt = fpymt_dt;
	}

	public void setClos_amt(String clos_amt){
		this.clos_amt = clos_amt;
	}

	public void setFpymt_encur_amt(String fpymt_encur_amt){
		this.fpymt_encur_amt = fpymt_encur_amt;
	}

	public void setAjggiw(String ajggiw){
		this.ajggiw = ajggiw;
	}

	public void setAjrgiw(String ajrgiw){
		this.ajrgiw = ajrgiw;
	}

	public void setPdlv_altn_amt(String pdlv_altn_amt){
		this.pdlv_altn_amt = pdlv_altn_amt;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getCyov_bal(){
		return this.cyov_bal;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getAigamt(){
		return this.aigamt;
	}

	public String getJamt(){
		return this.jamt;
	}

	public String getRcpm_rate(){
		return this.rcpm_rate;
	}

	public String getFpymt_dt(){
		return this.fpymt_dt;
	}

	public String getClos_amt(){
		return this.clos_amt;
	}

	public String getFpymt_encur_amt(){
		return this.fpymt_encur_amt;
	}

	public String getAjggiw(){
		return this.ajggiw;
	}

	public String getAjrgiw(){
		return this.ajrgiw;
	}

	public String getPdlv_altn_amt(){
		return this.pdlv_altn_amt;
	}
}

/* 작성시간 : Thu Nov 29 11:55:01 KST 2012 */