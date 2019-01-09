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


public class FC_ACCT_2450_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String titl;
	public String reso_amt;
	public String impt_expn_clsf;
	public String proc_clsf;
	public String proc_clsf_nm;
	public String proc_dt_tm;
	public String emp_no;
	public String nm_korn;
	public String incmg_pers_ipadd;

	public FC_ACCT_2450_LCURCOMMLISTRecord(){}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setImpt_expn_clsf(String impt_expn_clsf){
		this.impt_expn_clsf = impt_expn_clsf;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setProc_clsf_nm(String proc_clsf_nm){
		this.proc_clsf_nm = proc_clsf_nm;
	}

	public void setProc_dt_tm(String proc_dt_tm){
		this.proc_dt_tm = proc_dt_tm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getImpt_expn_clsf(){
		return this.impt_expn_clsf;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getProc_clsf_nm(){
		return this.proc_clsf_nm;
	}

	public String getProc_dt_tm(){
		return this.proc_dt_tm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}
}

/* 작성시간 : Wed Jul 15 21:25:24 KST 2009 */