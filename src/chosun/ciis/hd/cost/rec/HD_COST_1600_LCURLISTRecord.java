/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.cost.rec;

import java.sql.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.ds.*;

/**
 * 
 */


public class HD_COST_1600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String hd_mang_dty_nm;
	public String deal_dt;
	public String deal_day;
	public String use_plac;
	public String deal_amt;
	public String remk_2;
	public String slip_proc_mang;
	public String actu_slip_no;
	public String proc_clsf_nm;

	public HD_COST_1600_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setHd_mang_dty_nm(String hd_mang_dty_nm){
		this.hd_mang_dty_nm = hd_mang_dty_nm;
	}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_day(String deal_day){
		this.deal_day = deal_day;
	}

	public void setUse_plac(String use_plac){
		this.use_plac = use_plac;
	}

	public void setDeal_amt(String deal_amt){
		this.deal_amt = deal_amt;
	}

	public void setRemk_2(String remk_2){
		this.remk_2 = remk_2;
	}

	public void setSlip_proc_mang(String slip_proc_mang){
		this.slip_proc_mang = slip_proc_mang;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setProc_clsf_nm(String proc_clsf_nm){
		this.proc_clsf_nm = proc_clsf_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getHd_mang_dty_nm(){
		return this.hd_mang_dty_nm;
	}

	public String getDeal_dt(){
		return this.deal_dt;
	}

	public String getDeal_day(){
		return this.deal_day;
	}

	public String getUse_plac(){
		return this.use_plac;
	}

	public String getDeal_amt(){
		return this.deal_amt;
	}

	public String getRemk_2(){
		return this.remk_2;
	}

	public String getSlip_proc_mang(){
		return this.slip_proc_mang;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getProc_clsf_nm(){
		return this.proc_clsf_nm;
	}
}

/* 작성시간 : Wed Oct 19 14:53:52 KST 2016 */