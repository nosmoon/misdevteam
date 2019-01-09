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


public class HD_SALY_8004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String pymt_dt;
	public String welf_pens_amt;
	public String prsn_pens_amt;
	public String prsn_sppt_amt;
	public String sepr_pens_amt;
	public String remk;

	public HD_SALY_8004_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPymt_dt(String pymt_dt){
		this.pymt_dt = pymt_dt;
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

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPymt_dt(){
		return this.pymt_dt;
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

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Mar 04 14:37:24 KST 2016 */