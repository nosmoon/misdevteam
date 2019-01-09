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


package chosun.ciis.hd.appmt.rec;

import java.sql.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;

/**
 * 
 */


public class HD_APPMT_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String flnm;
	public String dept_nm;
	public String posi_nm;
	public String in_cmpy_dt;
	public String appmt_dt;
	public String base_saly;
	public String posk_saly;
	public String saly_stot;
	public String yy_base_saly;
	public String yy_posk_saly;
	public String yy_saly_stot;

	public HD_APPMT_2001_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setSaly_stot(String saly_stot){
		this.saly_stot = saly_stot;
	}

	public void setYy_base_saly(String yy_base_saly){
		this.yy_base_saly = yy_base_saly;
	}

	public void setYy_posk_saly(String yy_posk_saly){
		this.yy_posk_saly = yy_posk_saly;
	}

	public void setYy_saly_stot(String yy_saly_stot){
		this.yy_saly_stot = yy_saly_stot;
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

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getSaly_stot(){
		return this.saly_stot;
	}

	public String getYy_base_saly(){
		return this.yy_base_saly;
	}

	public String getYy_posk_saly(){
		return this.yy_posk_saly;
	}

	public String getYy_saly_stot(){
		return this.yy_saly_stot;
	}
}

/* 작성시간 : Mon Jun 01 17:05:17 KST 2009 */