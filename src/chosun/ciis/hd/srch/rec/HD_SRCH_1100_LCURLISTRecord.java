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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String prn;
	public String emp_clsf;
	public String open_invit_clsf_nm;
	public String open_invit_desty;
	public String cd_nm;
	public String dept_nm;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String cmpy_cd;
	public String in_cmpy_dt;
	public String tot_saly;
	public String prz_pnsh_nm;
	public String prz_pnsh_nm_etc;
	public String chrg_job;

	public HD_SRCH_1100_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setOpen_invit_clsf_nm(String open_invit_clsf_nm){
		this.open_invit_clsf_nm = open_invit_clsf_nm;
	}

	public void setOpen_invit_desty(String open_invit_desty){
		this.open_invit_desty = open_invit_desty;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setTot_saly(String tot_saly){
		this.tot_saly = tot_saly;
	}

	public void setPrz_pnsh_nm(String prz_pnsh_nm){
		this.prz_pnsh_nm = prz_pnsh_nm;
	}

	public void setPrz_pnsh_nm_etc(String prz_pnsh_nm_etc){
		this.prz_pnsh_nm_etc = prz_pnsh_nm_etc;
	}

	public void setChrg_job(String chrg_job){
		this.chrg_job = chrg_job;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getOpen_invit_clsf_nm(){
		return this.open_invit_clsf_nm;
	}

	public String getOpen_invit_desty(){
		return this.open_invit_desty;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getTot_saly(){
		return this.tot_saly;
	}

	public String getPrz_pnsh_nm(){
		return this.prz_pnsh_nm;
	}

	public String getPrz_pnsh_nm_etc(){
		return this.prz_pnsh_nm_etc;
	}

	public String getChrg_job(){
		return this.chrg_job;
	}
}

/* 작성시간 : Fri Apr 03 09:10:36 KST 2009 */