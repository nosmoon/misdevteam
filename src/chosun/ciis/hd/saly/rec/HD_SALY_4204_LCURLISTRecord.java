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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_4204_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String adv_clsf;
	public String adv_dt;
	public String dduc_seq;
	public String proc_clsf;
	public String dduc_dt;
	public String saly_yy;
	public String saly_no;
	public String dduc_amt;

	public HD_SALY_4204_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAdv_clsf(String adv_clsf){
		this.adv_clsf = adv_clsf;
	}

	public void setAdv_dt(String adv_dt){
		this.adv_dt = adv_dt;
	}

	public void setDduc_seq(String dduc_seq){
		this.dduc_seq = dduc_seq;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setDduc_dt(String dduc_dt){
		this.dduc_dt = dduc_dt;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setDduc_amt(String dduc_amt){
		this.dduc_amt = dduc_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAdv_clsf(){
		return this.adv_clsf;
	}

	public String getAdv_dt(){
		return this.adv_dt;
	}

	public String getDduc_seq(){
		return this.dduc_seq;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getDduc_dt(){
		return this.dduc_dt;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getDduc_amt(){
		return this.dduc_amt;
	}
}

/* 작성시간 : Fri May 22 10:44:46 KST 2009 */