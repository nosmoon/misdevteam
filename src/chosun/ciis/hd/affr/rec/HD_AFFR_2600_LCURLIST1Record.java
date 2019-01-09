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


public class HD_AFFR_2600_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String chk_dt;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String prn;
	public String faml_flnm;
	public String faml_prn;
	public String chk_yn;
	public String re_in_cmpy;
	public String last_temp_dt;
	public String last_reinst_dt;
	public String last_stdy_dt;
	public String last_stdy_reinst_dt;
	public String temp_work;
	public String stdy;
	public String lvcmpy_dt;
	public String lvcmpy_resn_nm;
	public String in_cmpy_dt;

	public HD_AFFR_2600_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setChk_dt(String chk_dt){
		this.chk_dt = chk_dt;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public void setChk_yn(String chk_yn){
		this.chk_yn = chk_yn;
	}

	public void setRe_in_cmpy(String re_in_cmpy){
		this.re_in_cmpy = re_in_cmpy;
	}

	public void setLast_temp_dt(String last_temp_dt){
		this.last_temp_dt = last_temp_dt;
	}

	public void setLast_reinst_dt(String last_reinst_dt){
		this.last_reinst_dt = last_reinst_dt;
	}

	public void setLast_stdy_dt(String last_stdy_dt){
		this.last_stdy_dt = last_stdy_dt;
	}

	public void setLast_stdy_reinst_dt(String last_stdy_reinst_dt){
		this.last_stdy_reinst_dt = last_stdy_reinst_dt;
	}

	public void setTemp_work(String temp_work){
		this.temp_work = temp_work;
	}

	public void setStdy(String stdy){
		this.stdy = stdy;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setLvcmpy_resn_nm(String lvcmpy_resn_nm){
		this.lvcmpy_resn_nm = lvcmpy_resn_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getChk_dt(){
		return this.chk_dt;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}

	public String getChk_yn(){
		return this.chk_yn;
	}

	public String getRe_in_cmpy(){
		return this.re_in_cmpy;
	}

	public String getLast_temp_dt(){
		return this.last_temp_dt;
	}

	public String getLast_reinst_dt(){
		return this.last_reinst_dt;
	}

	public String getLast_stdy_dt(){
		return this.last_stdy_dt;
	}

	public String getLast_stdy_reinst_dt(){
		return this.last_stdy_reinst_dt;
	}

	public String getTemp_work(){
		return this.temp_work;
	}

	public String getStdy(){
		return this.stdy;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getLvcmpy_resn_nm(){
		return this.lvcmpy_resn_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}
}

/* 작성시간 : Thu Apr 02 08:52:56 KST 2009 */