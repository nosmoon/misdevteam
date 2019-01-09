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


public class FC_CO_1061_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cntr_clsf_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String leas_sub_seq;
	public String leas_nm;
	public String comp_dt;
	public String mtry_dt;
	public String re_leas_yn;
	public String cntr_clsf_cd1;

	public FC_CO_1061_LCURLISTRecord(){}

	public void setCntr_clsf_cd(String cntr_clsf_cd){
		this.cntr_clsf_cd = cntr_clsf_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setLeas_sub_seq(String leas_sub_seq){
		this.leas_sub_seq = leas_sub_seq;
	}

	public void setLeas_nm(String leas_nm){
		this.leas_nm = leas_nm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setRe_leas_yn(String re_leas_yn){
		this.re_leas_yn = re_leas_yn;
	}

	public void setCntr_clsf_cd1(String cntr_clsf_cd1){
		this.cntr_clsf_cd1 = cntr_clsf_cd1;
	}

	public String getCntr_clsf_cd(){
		return this.cntr_clsf_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getLeas_sub_seq(){
		return this.leas_sub_seq;
	}

	public String getLeas_nm(){
		return this.leas_nm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getRe_leas_yn(){
		return this.re_leas_yn;
	}

	public String getCntr_clsf_cd1(){
		return this.cntr_clsf_cd1;
	}
}

/* 작성시간 : Wed Mar 04 10:40:31 KST 2009 */