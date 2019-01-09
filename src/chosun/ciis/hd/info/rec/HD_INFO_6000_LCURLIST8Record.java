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


public class HD_INFO_6000_LCURLIST8Record extends java.lang.Object implements java.io.Serializable{

	public String frnc_word_seq;
	public String frnc_word_cd;
	public String frnc_word_cd_nm;
	public String test_cd;
	public String test_cd_nm;
	public String test_grad;
	public String test_scor;
	public String test_dt;
	public String test_enfc_instt;
	public String spc_matt;

	public HD_INFO_6000_LCURLIST8Record(){}

	public void setFrnc_word_seq(String frnc_word_seq){
		this.frnc_word_seq = frnc_word_seq;
	}

	public void setFrnc_word_cd(String frnc_word_cd){
		this.frnc_word_cd = frnc_word_cd;
	}

	public void setFrnc_word_cd_nm(String frnc_word_cd_nm){
		this.frnc_word_cd_nm = frnc_word_cd_nm;
	}

	public void setTest_cd(String test_cd){
		this.test_cd = test_cd;
	}

	public void setTest_cd_nm(String test_cd_nm){
		this.test_cd_nm = test_cd_nm;
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

	public String getFrnc_word_seq(){
		return this.frnc_word_seq;
	}

	public String getFrnc_word_cd(){
		return this.frnc_word_cd;
	}

	public String getFrnc_word_cd_nm(){
		return this.frnc_word_cd_nm;
	}

	public String getTest_cd(){
		return this.test_cd;
	}

	public String getTest_cd_nm(){
		return this.test_cd_nm;
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

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */