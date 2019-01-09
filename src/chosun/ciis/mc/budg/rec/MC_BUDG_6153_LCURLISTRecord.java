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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6153_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_clsf;
	public String paper_amt;
	public String submat_amt;
	public String prt_amt;
	public String non_dduc_paper_amt;
	public String non_dduc_submat_amt;
	public String non_dduc_prt_amt;
	public String paper_amt_cost;
	public String submat_amt_cost;
	public String prt_amt_cost;
	public String pcnt_cost;
	public String cho_issu_cnt;
	public String local_issu_cnt;
	public String avg_cnt;

	public MC_BUDG_6153_LCURLISTRecord(){}

	public void setArea_clsf(String area_clsf){
		this.area_clsf = area_clsf;
	}

	public void setPaper_amt(String paper_amt){
		this.paper_amt = paper_amt;
	}

	public void setSubmat_amt(String submat_amt){
		this.submat_amt = submat_amt;
	}

	public void setPrt_amt(String prt_amt){
		this.prt_amt = prt_amt;
	}

	public void setNon_dduc_paper_amt(String non_dduc_paper_amt){
		this.non_dduc_paper_amt = non_dduc_paper_amt;
	}

	public void setNon_dduc_submat_amt(String non_dduc_submat_amt){
		this.non_dduc_submat_amt = non_dduc_submat_amt;
	}

	public void setNon_dduc_prt_amt(String non_dduc_prt_amt){
		this.non_dduc_prt_amt = non_dduc_prt_amt;
	}

	public void setPaper_amt_cost(String paper_amt_cost){
		this.paper_amt_cost = paper_amt_cost;
	}

	public void setSubmat_amt_cost(String submat_amt_cost){
		this.submat_amt_cost = submat_amt_cost;
	}

	public void setPrt_amt_cost(String prt_amt_cost){
		this.prt_amt_cost = prt_amt_cost;
	}

	public void setPcnt_cost(String pcnt_cost){
		this.pcnt_cost = pcnt_cost;
	}

	public void setCho_issu_cnt(String cho_issu_cnt){
		this.cho_issu_cnt = cho_issu_cnt;
	}

	public void setLocal_issu_cnt(String local_issu_cnt){
		this.local_issu_cnt = local_issu_cnt;
	}

	public void setAvg_cnt(String avg_cnt){
		this.avg_cnt = avg_cnt;
	}

	public String getArea_clsf(){
		return this.area_clsf;
	}

	public String getPaper_amt(){
		return this.paper_amt;
	}

	public String getSubmat_amt(){
		return this.submat_amt;
	}

	public String getPrt_amt(){
		return this.prt_amt;
	}

	public String getNon_dduc_paper_amt(){
		return this.non_dduc_paper_amt;
	}

	public String getNon_dduc_submat_amt(){
		return this.non_dduc_submat_amt;
	}

	public String getNon_dduc_prt_amt(){
		return this.non_dduc_prt_amt;
	}

	public String getPaper_amt_cost(){
		return this.paper_amt_cost;
	}

	public String getSubmat_amt_cost(){
		return this.submat_amt_cost;
	}

	public String getPrt_amt_cost(){
		return this.prt_amt_cost;
	}

	public String getPcnt_cost(){
		return this.pcnt_cost;
	}

	public String getCho_issu_cnt(){
		return this.cho_issu_cnt;
	}

	public String getLocal_issu_cnt(){
		return this.local_issu_cnt;
	}

	public String getAvg_cnt(){
		return this.avg_cnt;
	}
}

/* 작성시간 : Fri May 22 10:30:46 KST 2009 */