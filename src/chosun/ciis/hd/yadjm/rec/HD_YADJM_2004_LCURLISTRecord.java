/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_YADJM_2004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yadjm;

	public HD_YADJM_2004_LCURLISTRecord(){}

	public void setYadjm(String yadjm){
		this.yadjm = yadjm;
	}

	public String getYadjm(){
		return this.yadjm;
	}
}

/* 작성시간 : Thu Feb 02 11:49:23 KST 2017 */