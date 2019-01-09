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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_3420_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String posi_cd;
	public String posi_nm;
	public String dty_cd;
	public String dty_nm;
	public String in_cmpy_yn;
	public String lvcmpy_yn;
	public String reinst_yn;
	public String susp_yn;
	public String temp_yn;
	public String dspch_yn;
	public String stdy_yn;
	public String labr_tm_exem_yn;
	public String labr_tm_exem_end_yn;
	public String child_birth_vaca;
	public String sick_vaca;
	public String exec_clsf;
	public String exec_clsf_nm;
	public String proc_stat;
	public String proc_stat_nm;

	public HD_VACA_3420_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setIn_cmpy_yn(String in_cmpy_yn){
		this.in_cmpy_yn = in_cmpy_yn;
	}

	public void setLvcmpy_yn(String lvcmpy_yn){
		this.lvcmpy_yn = lvcmpy_yn;
	}

	public void setReinst_yn(String reinst_yn){
		this.reinst_yn = reinst_yn;
	}

	public void setSusp_yn(String susp_yn){
		this.susp_yn = susp_yn;
	}

	public void setTemp_yn(String temp_yn){
		this.temp_yn = temp_yn;
	}

	public void setDspch_yn(String dspch_yn){
		this.dspch_yn = dspch_yn;
	}

	public void setStdy_yn(String stdy_yn){
		this.stdy_yn = stdy_yn;
	}

	public void setLabr_tm_exem_yn(String labr_tm_exem_yn){
		this.labr_tm_exem_yn = labr_tm_exem_yn;
	}

	public void setLabr_tm_exem_end_yn(String labr_tm_exem_end_yn){
		this.labr_tm_exem_end_yn = labr_tm_exem_end_yn;
	}

	public void setChild_birth_vaca(String child_birth_vaca){
		this.child_birth_vaca = child_birth_vaca;
	}

	public void setSick_vaca(String sick_vaca){
		this.sick_vaca = sick_vaca;
	}

	public void setExec_clsf(String exec_clsf){
		this.exec_clsf = exec_clsf;
	}

	public void setExec_clsf_nm(String exec_clsf_nm){
		this.exec_clsf_nm = exec_clsf_nm;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getIn_cmpy_yn(){
		return this.in_cmpy_yn;
	}

	public String getLvcmpy_yn(){
		return this.lvcmpy_yn;
	}

	public String getReinst_yn(){
		return this.reinst_yn;
	}

	public String getSusp_yn(){
		return this.susp_yn;
	}

	public String getTemp_yn(){
		return this.temp_yn;
	}

	public String getDspch_yn(){
		return this.dspch_yn;
	}

	public String getStdy_yn(){
		return this.stdy_yn;
	}

	public String getLabr_tm_exem_yn(){
		return this.labr_tm_exem_yn;
	}

	public String getLabr_tm_exem_end_yn(){
		return this.labr_tm_exem_end_yn;
	}

	public String getChild_birth_vaca(){
		return this.child_birth_vaca;
	}

	public String getSick_vaca(){
		return this.sick_vaca;
	}

	public String getExec_clsf(){
		return this.exec_clsf;
	}

	public String getExec_clsf_nm(){
		return this.exec_clsf_nm;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}
}

/* 작성시간 : Mon Aug 31 13:48:56 KST 2015 */