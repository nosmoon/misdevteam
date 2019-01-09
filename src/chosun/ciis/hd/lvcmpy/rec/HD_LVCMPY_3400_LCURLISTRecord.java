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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_3400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String dty_nm;
	public String posi_nm;
	public String in_cmpy_dt;
	public String cont_svc_yys;
	public String grad_advn_yys;
	public String saly_3month_stot;
	public String alon_amt;
	public String bns;
	public String yymm_alon;
	public String etc_saly;
	public String mm_avg_saly;
	public String lvcmpy_saly_estm_amt;
	public String dty_acty_fee;

	public HD_LVCMPY_3400_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setCont_svc_yys(String cont_svc_yys){
		this.cont_svc_yys = cont_svc_yys;
	}

	public void setGrad_advn_yys(String grad_advn_yys){
		this.grad_advn_yys = grad_advn_yys;
	}

	public void setSaly_3month_stot(String saly_3month_stot){
		this.saly_3month_stot = saly_3month_stot;
	}

	public void setAlon_amt(String alon_amt){
		this.alon_amt = alon_amt;
	}

	public void setBns(String bns){
		this.bns = bns;
	}

	public void setYymm_alon(String yymm_alon){
		this.yymm_alon = yymm_alon;
	}

	public void setEtc_saly(String etc_saly){
		this.etc_saly = etc_saly;
	}

	public void setMm_avg_saly(String mm_avg_saly){
		this.mm_avg_saly = mm_avg_saly;
	}

	public void setLvcmpy_saly_estm_amt(String lvcmpy_saly_estm_amt){
		this.lvcmpy_saly_estm_amt = lvcmpy_saly_estm_amt;
	}

	public void setDty_acty_fee(String dty_acty_fee){
		this.dty_acty_fee = dty_acty_fee;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getCont_svc_yys(){
		return this.cont_svc_yys;
	}

	public String getGrad_advn_yys(){
		return this.grad_advn_yys;
	}

	public String getSaly_3month_stot(){
		return this.saly_3month_stot;
	}

	public String getAlon_amt(){
		return this.alon_amt;
	}

	public String getBns(){
		return this.bns;
	}

	public String getYymm_alon(){
		return this.yymm_alon;
	}

	public String getEtc_saly(){
		return this.etc_saly;
	}

	public String getMm_avg_saly(){
		return this.mm_avg_saly;
	}

	public String getLvcmpy_saly_estm_amt(){
		return this.lvcmpy_saly_estm_amt;
	}

	public String getDty_acty_fee(){
		return this.dty_acty_fee;
	}
}

/* 작성시간 : Thu Apr 13 16:56:59 KST 2017 */