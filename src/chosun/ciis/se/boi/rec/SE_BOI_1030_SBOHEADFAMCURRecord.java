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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 *
 */


public class SE_BOI_1030_SBOHEADFAMCURRecord extends java.lang.Object implements java.io.Serializable{

	public String faml_seq;
	public String flnm;
	public String faml_rshp_cd;
	public String faml_rshp_nm;
	public String bidt;
	public String luso_clsf;

	public SE_BOI_1030_SBOHEADFAMCURRecord(){}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setFaml_rshp_nm(String faml_rshp_nm){
		this.faml_rshp_nm = faml_rshp_nm;
	}

	public void setBidt(String bidt){
		this.bidt = bidt;
	}

	public void setLuso_clsf(String luso_clsf){
		this.luso_clsf = luso_clsf;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getFaml_rshp_nm(){
		return this.faml_rshp_nm;
	}

	public String getBidt(){
		return this.bidt;
	}

	public String getLuso_clsf(){
		return this.luso_clsf;
	}
}

/* 작성시간 : Tue Jan 20 18:12:34 KST 2009 */