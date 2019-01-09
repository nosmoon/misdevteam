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


public class HD_SALY_3000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String saly_yy;
	public String saly_no;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String etc_dduc_nm_1;
	public String etc_dduc_1;
	public String etc_dduc_nm_2;
	public String etc_dduc_2;
	public String etc_dduc_nm_3;
	public String etc_dduc_3;
	public String etc_dduc_nm_4;
	public String etc_dduc_4;
	public String etc_dduc_nm_5;
	public String etc_dduc_5;
	public String prvmm_mstk_dduc;
	public String proc_stat;
	public String proc_stat_nm;
	public String etc_dduc_remk;

	public HD_SALY_3000_LCURLISTRecord(){}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

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

	public void setEtc_dduc_nm_1(String etc_dduc_nm_1){
		this.etc_dduc_nm_1 = etc_dduc_nm_1;
	}

	public void setEtc_dduc_1(String etc_dduc_1){
		this.etc_dduc_1 = etc_dduc_1;
	}

	public void setEtc_dduc_nm_2(String etc_dduc_nm_2){
		this.etc_dduc_nm_2 = etc_dduc_nm_2;
	}

	public void setEtc_dduc_2(String etc_dduc_2){
		this.etc_dduc_2 = etc_dduc_2;
	}

	public void setEtc_dduc_nm_3(String etc_dduc_nm_3){
		this.etc_dduc_nm_3 = etc_dduc_nm_3;
	}

	public void setEtc_dduc_3(String etc_dduc_3){
		this.etc_dduc_3 = etc_dduc_3;
	}

	public void setEtc_dduc_nm_4(String etc_dduc_nm_4){
		this.etc_dduc_nm_4 = etc_dduc_nm_4;
	}

	public void setEtc_dduc_4(String etc_dduc_4){
		this.etc_dduc_4 = etc_dduc_4;
	}
	
	public void setEtc_dduc_nm_5(String etc_dduc_nm_5){
		this.etc_dduc_nm_5 = etc_dduc_nm_5;
	}

	public void setEtc_dduc_5(String etc_dduc_5){
		this.etc_dduc_5 = etc_dduc_5;
	}

	public void setPrvmm_mstk_dduc(String prvmm_mstk_dduc){
		this.prvmm_mstk_dduc = prvmm_mstk_dduc;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setEtc_dduc_remk(String etc_dduc_remk){
		this.etc_dduc_remk = etc_dduc_remk;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
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

	public String getEtc_dduc_nm_1(){
		return this.etc_dduc_nm_1;
	}

	public String getEtc_dduc_1(){
		return this.etc_dduc_1;
	}

	public String getEtc_dduc_nm_2(){
		return this.etc_dduc_nm_2;
	}

	public String getEtc_dduc_2(){
		return this.etc_dduc_2;
	}

	public String getEtc_dduc_nm_3(){
		return this.etc_dduc_nm_3;
	}

	public String getEtc_dduc_3(){
		return this.etc_dduc_3;
	}

	public String getEtc_dduc_nm_4(){
		return this.etc_dduc_nm_4;
	}

	public String getEtc_dduc_4(){
		return this.etc_dduc_4;
	}

	public String getEtc_dduc_nm_5(){
		return this.etc_dduc_nm_5;
	}

	public String getEtc_dduc_5(){
		return this.etc_dduc_5;
	}
	public String getPrvmm_mstk_dduc(){
		return this.prvmm_mstk_dduc;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getEtc_dduc_remk(){
		return this.etc_dduc_remk;
	}
}

/* 작성시간 : Fri Feb 22 11:19:49 KST 2013 */