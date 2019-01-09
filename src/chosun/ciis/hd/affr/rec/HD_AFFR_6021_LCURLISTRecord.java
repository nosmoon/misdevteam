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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_6021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String seq;
	public String dept_cd;
	public String dept_name;
	public String appmt_dt;
	public String dty_cd;
	public String posi_cd;
	public String prt_usag_dty_cd;
	public String dty_name;
	public String posi_name;
	public String prt_usag_dty_cd_name;
	public String appmt_cont;

	public HD_AFFR_6021_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_name(String dept_name){
		this.dept_name = dept_name;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPrt_usag_dty_cd(String prt_usag_dty_cd){
		this.prt_usag_dty_cd = prt_usag_dty_cd;
	}

	public void setDty_name(String dty_name){
		this.dty_name = dty_name;
	}

	public void setPosi_name(String posi_name){
		this.posi_name = posi_name;
	}

	public void setPrt_usag_dty_cd_name(String prt_usag_dty_cd_name){
		this.prt_usag_dty_cd_name = prt_usag_dty_cd_name;
	}

	public void setAppmt_cont(String appmt_cont){
		this.appmt_cont = appmt_cont;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_name(){
		return this.dept_name;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPrt_usag_dty_cd(){
		return this.prt_usag_dty_cd;
	}

	public String getDty_name(){
		return this.dty_name;
	}

	public String getPosi_name(){
		return this.posi_name;
	}

	public String getPrt_usag_dty_cd_name(){
		return this.prt_usag_dty_cd_name;
	}

	public String getAppmt_cont(){
		return this.appmt_cont;
	}
}

/* 작성시간 : Fri Mar 13 13:28:47 KST 2009 */