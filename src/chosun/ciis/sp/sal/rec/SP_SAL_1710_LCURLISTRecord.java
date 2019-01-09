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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_1710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_yymm;
	public String cnt;
	public String sale_amt;
	public String vat_amt;
	public String stot_amt;
	public String clos_yn;
	public String clos_proc_dt;
	public String actu_slip_no;
	public String clos_pers_emp_nm;

	public SP_SAL_1710_LCURLISTRecord(){}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_proc_dt(String clos_proc_dt){
		this.clos_proc_dt = clos_proc_dt;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setClos_pers_emp_nm(String clos_pers_emp_nm){
		this.clos_pers_emp_nm = clos_pers_emp_nm;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_proc_dt(){
		return this.clos_proc_dt;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getClos_pers_emp_nm(){
		return this.clos_pers_emp_nm;
	}
}

/* 작성시간 : Thu Jul 19 19:48:11 KST 2012 */