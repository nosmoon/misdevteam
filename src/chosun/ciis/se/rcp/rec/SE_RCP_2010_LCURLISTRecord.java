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


public class SE_RCP_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bo_nm;
	public String cyov_bal;
	public String net_sale_amt;
	public String sale_tot;
	public String rcpm_amt;
	public String bo_trans_amt;
	public String aft_rcpm_amt;
	public String clracct_amt;
	public String aft_clos_amt;
	public String rcpm_rate;
	public String fpymt_dt;
	public String pdlv_altn_amt;

	public SE_RCP_2010_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setCyov_bal(String cyov_bal){
		this.cyov_bal = cyov_bal;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setSale_tot(String sale_tot){
		this.sale_tot = sale_tot;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setBo_trans_amt(String bo_trans_amt){
		this.bo_trans_amt = bo_trans_amt;
	}

	public void setAft_rcpm_amt(String aft_rcpm_amt){
		this.aft_rcpm_amt = aft_rcpm_amt;
	}

	public void setClracct_amt(String clracct_amt){
		this.clracct_amt = clracct_amt;
	}

	public void setAft_clos_amt(String aft_clos_amt){
		this.aft_clos_amt = aft_clos_amt;
	}

	public void setRcpm_rate(String rcpm_rate){
		this.rcpm_rate = rcpm_rate;
	}

	public void setFpymt_dt(String fpymt_dt){
		this.fpymt_dt = fpymt_dt;
	}

	public void setPdlv_altn_amt(String pdlv_altn_amt){
		this.pdlv_altn_amt = pdlv_altn_amt;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getCyov_bal(){
		return this.cyov_bal;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getSale_tot(){
		return this.sale_tot;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getBo_trans_amt(){
		return this.bo_trans_amt;
	}

	public String getAft_rcpm_amt(){
		return this.aft_rcpm_amt;
	}

	public String getClracct_amt(){
		return this.clracct_amt;
	}

	public String getAft_clos_amt(){
		return this.aft_clos_amt;
	}

	public String getRcpm_rate(){
		return this.rcpm_rate;
	}

	public String getFpymt_dt(){
		return this.fpymt_dt;
	}

	public String getPdlv_altn_amt(){
		return this.pdlv_altn_amt;
	}
}

/* 작성시간 : Thu Nov 29 11:35:48 KST 2012 */