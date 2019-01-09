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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_2300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dspch_enpr;
	public String in_cmpy_dt;
	public String servcost;
	public String paid_hody_alon;
	public String lvcmpy_pers_alon;
	public String snk_fee;
	public String pgsw_yybi_sum;

	public HD_SALY_2300_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDspch_enpr(String dspch_enpr){
		this.dspch_enpr = dspch_enpr;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}

	public void setPaid_hody_alon(String paid_hody_alon){
		this.paid_hody_alon = paid_hody_alon;
	}

	public void setLvcmpy_pers_alon(String lvcmpy_pers_alon){
		this.lvcmpy_pers_alon = lvcmpy_pers_alon;
	}

	public void setSnk_fee(String snk_fee){
		this.snk_fee = snk_fee;
	}

	public void setPgsw_yybi_sum(String pgsw_yybi_sum){
		this.pgsw_yybi_sum = pgsw_yybi_sum;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDspch_enpr(){
		return this.dspch_enpr;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getServcost(){
		return this.servcost;
	}

	public String getPaid_hody_alon(){
		return this.paid_hody_alon;
	}

	public String getLvcmpy_pers_alon(){
		return this.lvcmpy_pers_alon;
	}

	public String getSnk_fee(){
		return this.snk_fee;
	}

	public String getPgsw_yybi_sum(){
		return this.pgsw_yybi_sum;
	}
}

/* 작성시간 : Sun Sep 27 16:38:09 KST 2009 */