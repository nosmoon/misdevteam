/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 *
 */

public class HD_VACA_1200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String appm_vaca_plan_dt;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String aply_yy;
	public String qq_clsf;
	public String wkdy;
	public String dept_cd;
	public String proc_stat;
	public String db_status;

	public HD_VACA_1200_LCURLISTRecord(){}

	public void setAppm_vaca_plan_dt(String appm_vaca_plan_dt){
		this.appm_vaca_plan_dt = appm_vaca_plan_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setQq_clsf(String qq_clsf){
		this.qq_clsf = qq_clsf;
	}

	public void setWkdy(String wkdy){
		this.wkdy = wkdy;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getAppm_vaca_plan_dt(){
		return this.appm_vaca_plan_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getQq_clsf(){
		return this.qq_clsf;
	}

	public String getWkdy(){
		return this.wkdy;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Fri Jul 17 13:02:22 KST 2009 */