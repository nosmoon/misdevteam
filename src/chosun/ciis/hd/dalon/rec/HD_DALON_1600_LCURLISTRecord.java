
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


package chosun.ciis.hd.dalon.rec;

import java.sql.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.ds.*;

/**
 * 
 */


public class HD_DALON_1600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String cost_obj_clsf_nm;
	public String dept_cd;
	public String dept_cd_nm;
	public String dty_nm;
	public String posi_nm;
	public String frdt;
	public String todt;
	public String out_in_plac;
	public String cost;
	public String proc_stat;

	public HD_DALON_1600_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setCost_obj_clsf_nm(String cost_obj_clsf_nm){
		this.cost_obj_clsf_nm = cost_obj_clsf_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setOut_in_plac(String out_in_plac){
		this.out_in_plac = out_in_plac;
	}

	public void setCost(String cost){
		this.cost = cost;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public String getRnum(){
		return this.rnum;
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

	public String getCost_obj_clsf_nm(){
		return this.cost_obj_clsf_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getOut_in_plac(){
		return this.out_in_plac;
	}

	public String getCost(){
		return this.cost;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}
}

/* 작성시간 : Thu Apr 16 17:39:50 KST 2009 */