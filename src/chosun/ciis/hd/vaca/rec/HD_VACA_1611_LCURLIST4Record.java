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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_1611_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String faml_flnm;
	public String faml_birth;

	public HD_VACA_1611_LCURLIST4Record(){}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
	}

	public void setFaml_birth(String faml_birth){
		this.faml_birth = faml_birth;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
	}

	public String getFaml_birth(){
		return this.faml_birth;
	}
}

/* 작성시간 : Wed Oct 24 10:55:13 KST 2018 */