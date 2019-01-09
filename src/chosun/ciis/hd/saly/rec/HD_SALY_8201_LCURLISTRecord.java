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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_8201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String pymt_yy;
	public String pymt_no;
	public String cd_nm;
	public String dept_nm;
	public String dept_cd;
	public String flnm;
	public String welf_pens_amt;
	public String prsn_pens_amt;
	public String prsn_sppt_amt;
	public String sepr_pens_amt;
	public String pymt_gubun;
	public String pymt_gubun_nm;
	public String proc_stat_nm;
	public String prn;
	public String dty_nm;
	public String posi_nm;

	public HD_SALY_8201_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPymt_yy(String pymt_yy){
		this.pymt_yy = pymt_yy;
	}

	public void setPymt_no(String pymt_no){
		this.pymt_no = pymt_no;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setWelf_pens_amt(String welf_pens_amt){
		this.welf_pens_amt = welf_pens_amt;
	}

	public void setPrsn_pens_amt(String prsn_pens_amt){
		this.prsn_pens_amt = prsn_pens_amt;
	}

	public void setPrsn_sppt_amt(String prsn_sppt_amt){
		this.prsn_sppt_amt = prsn_sppt_amt;
	}

	public void setSepr_pens_amt(String sepr_pens_amt){
		this.sepr_pens_amt = sepr_pens_amt;
	}

	public void setPymt_gubun(String pymt_gubun){
		this.pymt_gubun = pymt_gubun;
	}

	public void setPymt_gubun_nm(String pymt_gubun_nm){
		this.pymt_gubun_nm = pymt_gubun_nm;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPymt_yy(){
		return this.pymt_yy;
	}

	public String getPymt_no(){
		return this.pymt_no;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getWelf_pens_amt(){
		return this.welf_pens_amt;
	}

	public String getPrsn_pens_amt(){
		return this.prsn_pens_amt;
	}

	public String getPrsn_sppt_amt(){
		return this.prsn_sppt_amt;
	}

	public String getSepr_pens_amt(){
		return this.sepr_pens_amt;
	}

	public String getPymt_gubun(){
		return this.pymt_gubun;
	}

	public String getPymt_gubun_nm(){
		return this.pymt_gubun_nm;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}
}

/* 작성시간 : Thu Sep 07 11:32:29 KST 2017 */