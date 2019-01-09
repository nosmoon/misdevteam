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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_3105_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String type_nm;
	public String evnt_cd;
	public String evnt_nm;
	public String amt1;
	public String amt2;
	public String amt3;
	public String stlm_dt;
	public String evnt_frdt;
	public String evnt_todt;
	public String evnt_dds;
	public String entr_nops;
	public String chrg_pers_emp_nm;

	public EN_INNEXP_3105_LCURLISTRecord(){}

	public void setType_nm(String type_nm){
		this.type_nm = type_nm;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setAmt3(String amt3){
		this.amt3 = amt3;
	}

	public void setStlm_dt(String stlm_dt){
		this.stlm_dt = stlm_dt;
	}

	public void setEvnt_frdt(String evnt_frdt){
		this.evnt_frdt = evnt_frdt;
	}

	public void setEvnt_todt(String evnt_todt){
		this.evnt_todt = evnt_todt;
	}

	public void setEvnt_dds(String evnt_dds){
		this.evnt_dds = evnt_dds;
	}

	public void setEntr_nops(String entr_nops){
		this.entr_nops = entr_nops;
	}

	public void setChrg_pers_emp_nm(String chrg_pers_emp_nm){
		this.chrg_pers_emp_nm = chrg_pers_emp_nm;
	}

	public String getType_nm(){
		return this.type_nm;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getAmt3(){
		return this.amt3;
	}

	public String getStlm_dt(){
		return this.stlm_dt;
	}

	public String getEvnt_frdt(){
		return this.evnt_frdt;
	}

	public String getEvnt_todt(){
		return this.evnt_todt;
	}

	public String getEvnt_dds(){
		return this.evnt_dds;
	}

	public String getEntr_nops(){
		return this.entr_nops;
	}

	public String getChrg_pers_emp_nm(){
		return this.chrg_pers_emp_nm;
	}
}

/* 작성시간 : Fri May 01 17:32:09 KST 2009 */