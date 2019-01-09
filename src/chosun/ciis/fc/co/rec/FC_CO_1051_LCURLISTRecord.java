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


package chosun.ciis.fc.co.rec;

import java.sql.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;

/**
 * 
 */


public class FC_CO_1051_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String insr_clsf_cd;
	public String insr_no;
	public String comp_dt;
	public String mtry_dt;
	public String won_amt;
	public String insr_clsf_cd1;

	public FC_CO_1051_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInsr_clsf_cd(String insr_clsf_cd){
		this.insr_clsf_cd = insr_clsf_cd;
	}

	public void setInsr_no(String insr_no){
		this.insr_no = insr_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setInsr_clsf_cd1(String insr_clsf_cd1){
		this.insr_clsf_cd1 = insr_clsf_cd1;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInsr_clsf_cd(){
		return this.insr_clsf_cd;
	}

	public String getInsr_no(){
		return this.insr_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getInsr_clsf_cd1(){
		return this.insr_clsf_cd1;
	}
}

/* 작성시간 : Sat Apr 11 15:11:20 KST 2009 */