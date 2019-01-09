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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_1820_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String faml_flnm;

	public HD_YADJM_1820_LCURLISTRecord(){}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
	}
}

/* 작성시간 : Tue Jan 07 11:12:24 KST 2014 */