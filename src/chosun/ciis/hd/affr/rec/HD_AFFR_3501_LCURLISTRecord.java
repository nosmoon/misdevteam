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


public class HD_AFFR_3501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sch_yyyy;
	public String flnm;
	public String emp_no;
	public String affr_type_nm;
	public String affr_amt;
	public String offi_nm;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;

	public HD_AFFR_3501_LCURLISTRecord(){}

	public void setSch_yyyy(String sch_yyyy){
		this.sch_yyyy = sch_yyyy;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAffr_type_nm(String affr_type_nm){
		this.affr_type_nm = affr_type_nm;
	}

	public void setAffr_amt(String affr_amt){
		this.affr_amt = affr_amt;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
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

	public String getSch_yyyy(){
		return this.sch_yyyy;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAffr_type_nm(){
		return this.affr_type_nm;
	}

	public String getAffr_amt(){
		return this.affr_amt;
	}

	public String getOffi_nm(){
		return this.offi_nm;
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
}

/* 작성시간 : Mon Nov 02 17:52:01 KST 2009 */