/***************************************************************************************************
* 파일명 : .java
* 기능 : 기초정보관리 - 장표관리
* 작성일자 : 2010-04-12
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.test.rec;

import java.sql.*;
import chosun.ciis.as.test.dm.*;
import chosun.ciis.as.test.ds.*;

/**
 * 
 */


public class AS_TEST_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dev_src;
	public String real_src;

	public AS_TEST_1002_LCURLISTRecord(){}

	public void setDev_src(String dev_src){
		this.dev_src = dev_src;
	}

	public void setReal_src(String real_src){
		this.real_src = real_src;
	}

	public String getDev_src(){
		return this.dev_src;
	}

	public String getReal_src(){
		return this.real_src;
	}

}

/* 작성시간 : Mon Apr 12 14:44:41 KST 2010 */