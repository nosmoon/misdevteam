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


public class HD_SALY_8003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String rptv_posi_cd;
	public String rptv_posi_nm;
	public String pens_aply_mm;
	public String welf_pens_amt;
	public String prsn_pens_amt;
	public String pens_stot;
	public String sum_pens_stot;
	public String prsn_sppt_amt;
	public String entr_yn;
	public String lvcmpy_yn;
	public String age;

	public HD_SALY_8003_LCURLISTRecord(){}

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

	public void setRptv_posi_cd(String rptv_posi_cd){
		this.rptv_posi_cd = rptv_posi_cd;
	}

	public void setRptv_posi_nm(String rptv_posi_nm){
		this.rptv_posi_nm = rptv_posi_nm;
	}

	public void setPens_aply_mm(String pens_aply_mm){
		this.pens_aply_mm = pens_aply_mm;
	}

	public void setWelf_pens_amt(String welf_pens_amt){
		this.welf_pens_amt = welf_pens_amt;
	}

	public void setPrsn_pens_amt(String prsn_pens_amt){
		this.prsn_pens_amt = prsn_pens_amt;
	}

	public void setPens_stot(String pens_stot){
		this.pens_stot = pens_stot;
	}

	public void setSum_pens_stot(String sum_pens_stot){
		this.sum_pens_stot = sum_pens_stot;
	}

	public void setPrsn_sppt_amt(String prsn_sppt_amt){
		this.prsn_sppt_amt = prsn_sppt_amt;
	}

	public void setEntr_yn(String entr_yn){
		this.entr_yn = entr_yn;
	}

	public void setLvcmpy_yn(String lvcmpy_yn){
		this.lvcmpy_yn = lvcmpy_yn;
	}

	public void setAge(String age){
		this.age = age;
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

	public String getRptv_posi_cd(){
		return this.rptv_posi_cd;
	}

	public String getRptv_posi_nm(){
		return this.rptv_posi_nm;
	}

	public String getPens_aply_mm(){
		return this.pens_aply_mm;
	}

	public String getWelf_pens_amt(){
		return this.welf_pens_amt;
	}

	public String getPrsn_pens_amt(){
		return this.prsn_pens_amt;
	}

	public String getPens_stot(){
		return this.pens_stot;
	}

	public String getSum_pens_stot(){
		return this.sum_pens_stot;
	}

	public String getPrsn_sppt_amt(){
		return this.prsn_sppt_amt;
	}

	public String getEntr_yn(){
		return this.entr_yn;
	}

	public String getLvcmpy_yn(){
		return this.lvcmpy_yn;
	}

	public String getAge(){
		return this.age;
	}
}

/* 작성시간 : Fri Mar 04 14:33:10 KST 2016 */