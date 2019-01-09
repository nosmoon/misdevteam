
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


package chosun.ciis.hd.prz.rec;

import java.sql.*;
import chosun.ciis.hd.prz.dm.*;
import chosun.ciis.hd.prz.ds.*;

/**
 * 
 */


public class HD_PRZ_1200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String prz_dt;
	public String prz_nm;
	public String prz_resn;
	public String prz_amt;
	public String prz_ptcr;

	public HD_PRZ_1200_LCURLISTRecord(){}

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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
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

	public void setPrz_dt(String prz_dt){
		this.prz_dt = prz_dt;
	}

	public void setPrz_nm(String prz_nm){
		this.prz_nm = prz_nm;
	}

	public void setPrz_resn(String prz_resn){
		this.prz_resn = prz_resn;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}

	public void setPrz_ptcr(String prz_ptcr){
		this.prz_ptcr = prz_ptcr;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
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

	public String getPrz_dt(){
		return this.prz_dt;
	}

	public String getPrz_nm(){
		return this.prz_nm;
	}

	public String getPrz_resn(){
		return this.prz_resn;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}

	public String getPrz_ptcr(){
		return this.prz_ptcr;
	}
}

/* 작성시간 : Thu Mar 26 15:18:20 KST 2009 */