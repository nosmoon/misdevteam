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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_1610_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String slip_clsf_nm;
	public String tot_yesu_amt;
	public String tot_yesu_exch_amt;
	public String tot_sunsu_amt;

	public IS_DEP_1610_LCURLIST2Record(){}

	public void setSlip_clsf_nm(String slip_clsf_nm){
		this.slip_clsf_nm = slip_clsf_nm;
	}

	public void setTot_yesu_amt(String tot_yesu_amt){
		this.tot_yesu_amt = tot_yesu_amt;
	}

	public void setTot_yesu_exch_amt(String tot_yesu_exch_amt){
		this.tot_yesu_exch_amt = tot_yesu_exch_amt;
	}

	public void setTot_sunsu_amt(String tot_sunsu_amt){
		this.tot_sunsu_amt = tot_sunsu_amt;
	}

	public String getSlip_clsf_nm(){
		return this.slip_clsf_nm;
	}

	public String getTot_yesu_amt(){
		return this.tot_yesu_amt;
	}

	public String getTot_yesu_exch_amt(){
		return this.tot_yesu_exch_amt;
	}

	public String getTot_sunsu_amt(){
		return this.tot_sunsu_amt;
	}
}

/* 작성시간 : Tue May 22 10:41:41 KST 2012 */