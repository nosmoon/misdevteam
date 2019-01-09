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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_1712_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String faml_flnm;
	public String faml_prn;

	public HD_AFFR_1712_LCURLISTRecord(){}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}
}

/* 작성시간 : Mon Sep 28 15:14:03 KST 2009 */