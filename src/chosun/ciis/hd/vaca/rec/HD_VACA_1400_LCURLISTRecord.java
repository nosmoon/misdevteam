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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_1400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String dept_cd;
	public String dept_nm;
	public String emp_clsf_cd;
	public String emp_clsf_nm;
	public String emp_dtls_clsf;
	public String emp_dtls_clsf_nm;
	public String emp_clsf;
	public String real_vaca_dds;
	public String use_vaca_dds;
	public String duty_vaca_dds;
	public String proc_stat;
	public String proc_stat_nm;
	public String aply_yy;
	public String qq_clsf;
	public String vaca_dds1;
	public String vaca_dds2;
	public String vaca_dds3;
	public String vaca_dds4;
	public String vaca_dds5;
	public String vaca_dds6;
	public String vaca_dds7;
	public String vaca_dds8;
	public String vaca_dds9;
	public String vaca_dds10;
	public String vaca_dds11;
	public String vaca_dds12;
	public String vaca_dds13;
	public String vaca_dds14;
	public String vaca_dds15;
	public String chkok;
	public String chkreturn;

	public HD_VACA_1400_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_clsf_cd(String emp_clsf_cd){
		this.emp_clsf_cd = emp_clsf_cd;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setEmp_dtls_clsf(String emp_dtls_clsf){
		this.emp_dtls_clsf = emp_dtls_clsf;
	}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setReal_vaca_dds(String real_vaca_dds){
		this.real_vaca_dds = real_vaca_dds;
	}

	public void setUse_vaca_dds(String use_vaca_dds){
		this.use_vaca_dds = use_vaca_dds;
	}

	public void setDuty_vaca_dds(String duty_vaca_dds){
		this.duty_vaca_dds = duty_vaca_dds;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setQq_clsf(String qq_clsf){
		this.qq_clsf = qq_clsf;
	}

	public void setVaca_dds1(String vaca_dds1){
		this.vaca_dds1 = vaca_dds1;
	}

	public void setVaca_dds2(String vaca_dds2){
		this.vaca_dds2 = vaca_dds2;
	}

	public void setVaca_dds3(String vaca_dds3){
		this.vaca_dds3 = vaca_dds3;
	}

	public void setVaca_dds4(String vaca_dds4){
		this.vaca_dds4 = vaca_dds4;
	}

	public void setVaca_dds5(String vaca_dds5){
		this.vaca_dds5 = vaca_dds5;
	}

	public void setVaca_dds6(String vaca_dds6){
		this.vaca_dds6 = vaca_dds6;
	}

	public void setVaca_dds7(String vaca_dds7){
		this.vaca_dds7 = vaca_dds7;
	}

	public void setVaca_dds8(String vaca_dds8){
		this.vaca_dds8 = vaca_dds8;
	}

	public void setVaca_dds9(String vaca_dds9){
		this.vaca_dds9 = vaca_dds9;
	}

	public void setVaca_dds10(String vaca_dds10){
		this.vaca_dds10 = vaca_dds10;
	}

	public void setVaca_dds11(String vaca_dds11){
		this.vaca_dds11 = vaca_dds11;
	}

	public void setVaca_dds12(String vaca_dds12){
		this.vaca_dds12 = vaca_dds12;
	}

	public void setVaca_dds13(String vaca_dds13){
		this.vaca_dds13 = vaca_dds13;
	}

	public void setVaca_dds14(String vaca_dds14){
		this.vaca_dds14 = vaca_dds14;
	}

	public void setVaca_dds15(String vaca_dds15){
		this.vaca_dds15 = vaca_dds15;
	}

	public void setChkok(String chkok){
		this.chkok = chkok;
	}

	public void setChkreturn(String chkreturn){
		this.chkreturn = chkreturn;
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

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getEmp_dtls_clsf(){
		return this.emp_dtls_clsf;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getReal_vaca_dds(){
		return this.real_vaca_dds;
	}

	public String getUse_vaca_dds(){
		return this.use_vaca_dds;
	}

	public String getDuty_vaca_dds(){
		return this.duty_vaca_dds;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getQq_clsf(){
		return this.qq_clsf;
	}

	public String getVaca_dds1(){
		return this.vaca_dds1;
	}

	public String getVaca_dds2(){
		return this.vaca_dds2;
	}

	public String getVaca_dds3(){
		return this.vaca_dds3;
	}

	public String getVaca_dds4(){
		return this.vaca_dds4;
	}

	public String getVaca_dds5(){
		return this.vaca_dds5;
	}

	public String getVaca_dds6(){
		return this.vaca_dds6;
	}

	public String getVaca_dds7(){
		return this.vaca_dds7;
	}

	public String getVaca_dds8(){
		return this.vaca_dds8;
	}

	public String getVaca_dds9(){
		return this.vaca_dds9;
	}

	public String getVaca_dds10(){
		return this.vaca_dds10;
	}

	public String getVaca_dds11(){
		return this.vaca_dds11;
	}

	public String getVaca_dds12(){
		return this.vaca_dds12;
	}

	public String getVaca_dds13(){
		return this.vaca_dds13;
	}

	public String getVaca_dds14(){
		return this.vaca_dds14;
	}

	public String getVaca_dds15(){
		return this.vaca_dds15;
	}

	public String getChkok(){
		return this.chkok;
	}

	public String getChkreturn(){
		return this.chkreturn;
	}
}

/* 작성시간 : Sun Apr 26 16:38:00 KST 2009 */