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


public class HD_SALY_4303_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String acpn_yy;
	public String acpn_seq;
	public String seiz_dduc_tms;
	public String proc_clsf;
	public String dduc_dt;
	public String seiz_dduc_amt;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String saly_yy;
	public String saly_no;

	public HD_SALY_4303_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcpn_yy(String acpn_yy){
		this.acpn_yy = acpn_yy;
	}

	public void setAcpn_seq(String acpn_seq){
		this.acpn_seq = acpn_seq;
	}

	public void setSeiz_dduc_tms(String seiz_dduc_tms){
		this.seiz_dduc_tms = seiz_dduc_tms;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setDduc_dt(String dduc_dt){
		this.dduc_dt = dduc_dt;
	}

	public void setSeiz_dduc_amt(String seiz_dduc_amt){
		this.seiz_dduc_amt = seiz_dduc_amt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcpn_yy(){
		return this.acpn_yy;
	}

	public String getAcpn_seq(){
		return this.acpn_seq;
	}

	public String getSeiz_dduc_tms(){
		return this.seiz_dduc_tms;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getDduc_dt(){
		return this.dduc_dt;
	}

	public String getSeiz_dduc_amt(){
		return this.seiz_dduc_amt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}
}

/* 작성시간 : Wed Sep 16 20:36:58 KST 2009 */