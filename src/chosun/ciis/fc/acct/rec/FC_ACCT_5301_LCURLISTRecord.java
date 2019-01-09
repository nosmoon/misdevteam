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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_5301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String check1;
	public String slip_clsf_cd;
	public String clos_mm;
	public String slip_dtls_clas;
	public String bgn_dt;
	public String end_dt;
	public String clos_pers_emp_no;
	public String incmg_dt_tm;
	public String incmg_pers_ipadd;

	public FC_ACCT_5301_LCURLISTRecord(){}

	public void setCheck1(String check1){
		this.check1 = check1;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setClos_mm(String clos_mm){
		this.clos_mm = clos_mm;
	}

	public void setSlip_dtls_clas(String slip_dtls_clas){
		this.slip_dtls_clas = slip_dtls_clas;
	}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setClos_pers_emp_no(String clos_pers_emp_no){
		this.clos_pers_emp_no = clos_pers_emp_no;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCheck1(){
		return this.check1;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getClos_mm(){
		return this.clos_mm;
	}

	public String getSlip_dtls_clas(){
		return this.slip_dtls_clas;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getClos_pers_emp_no(){
		return this.clos_pers_emp_no;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}
}

/* 작성시간 : Fri Mar 13 10:41:02 KST 2009 */