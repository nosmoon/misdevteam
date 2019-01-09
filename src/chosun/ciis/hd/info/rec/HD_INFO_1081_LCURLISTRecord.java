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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_1081_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String frnc_word_seq;
	public String frnc_word_cd;
	public String frnc_word_flnm;
	public String frnc_word_nm;
	public String test_cd;
	public String test_flnm;
	public String test_nm;
	public String test_grad;
	public String test_scor;
	public String test_dt;
	public String test_enfc_instt;
	public String spc_matt;

	public HD_INFO_1081_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFrnc_word_seq(String frnc_word_seq){
		this.frnc_word_seq = frnc_word_seq;
	}

	public void setFrnc_word_cd(String frnc_word_cd){
		this.frnc_word_cd = frnc_word_cd;
	}

	public void setFrnc_word_flnm(String frnc_word_flnm){
		this.frnc_word_flnm = frnc_word_flnm;
	}

	public void setFrnc_word_nm(String frnc_word_nm){
		this.frnc_word_nm = frnc_word_nm;
	}

	public void setTest_cd(String test_cd){
		this.test_cd = test_cd;
	}

	public void setTest_flnm(String test_flnm){
		this.test_flnm = test_flnm;
	}

	public void setTest_nm(String test_nm){
		this.test_nm = test_nm;
	}

	public void setTest_grad(String test_grad){
		this.test_grad = test_grad;
	}

	public void setTest_scor(String test_scor){
		this.test_scor = test_scor;
	}

	public void setTest_dt(String test_dt){
		this.test_dt = test_dt;
	}

	public void setTest_enfc_instt(String test_enfc_instt){
		this.test_enfc_instt = test_enfc_instt;
	}

	public void setSpc_matt(String spc_matt){
		this.spc_matt = spc_matt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFrnc_word_seq(){
		return this.frnc_word_seq;
	}

	public String getFrnc_word_cd(){
		return this.frnc_word_cd;
	}

	public String getFrnc_word_flnm(){
		return this.frnc_word_flnm;
	}

	public String getFrnc_word_nm(){
		return this.frnc_word_nm;
	}

	public String getTest_cd(){
		return this.test_cd;
	}

	public String getTest_flnm(){
		return this.test_flnm;
	}

	public String getTest_nm(){
		return this.test_nm;
	}

	public String getTest_grad(){
		return this.test_grad;
	}

	public String getTest_scor(){
		return this.test_scor;
	}

	public String getTest_dt(){
		return this.test_dt;
	}

	public String getTest_enfc_instt(){
		return this.test_enfc_instt;
	}

	public String getSpc_matt(){
		return this.spc_matt;
	}
}

/* 작성시간 : Mon Mar 09 11:59:34 KST 2009 */