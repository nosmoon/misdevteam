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


public class HD_SALY_4005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String lon_clsf_cd;
	public String lon_dt;
	public String dduc_seq;
	public String flnm;
	public String proc_clsf;
	public String dduc_dt;
	public String saly_yy;
	public String saly_no;
	public String prcp_dduc_amt;
	public String int_dduc_amt;

	public HD_SALY_4005_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLon_clsf_cd(String lon_clsf_cd){
		this.lon_clsf_cd = lon_clsf_cd;
	}

	public void setLon_dt(String lon_dt){
		this.lon_dt = lon_dt;
	}

	public void setDduc_seq(String dduc_seq){
		this.dduc_seq = dduc_seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
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

	public void setPrcp_dduc_amt(String prcp_dduc_amt){
		this.prcp_dduc_amt = prcp_dduc_amt;
	}

	public void setInt_dduc_amt(String int_dduc_amt){
		this.int_dduc_amt = int_dduc_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLon_clsf_cd(){
		return this.lon_clsf_cd;
	}

	public String getLon_dt(){
		return this.lon_dt;
	}

	public String getDduc_seq(){
		return this.dduc_seq;
	}

	public String getFlnm(){
		return this.flnm;
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

	public String getPrcp_dduc_amt(){
		return this.prcp_dduc_amt;
	}

	public String getInt_dduc_amt(){
		return this.int_dduc_amt;
	}
}

/* 작성시간 : Thu May 14 17:49:37 KST 2009 */