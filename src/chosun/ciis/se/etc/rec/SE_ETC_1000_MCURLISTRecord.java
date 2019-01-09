/***************************************************************************************************
* 파일명 : SE_ETC_1000_MCURLISTRecord.java
* 기능 : 판매-기타관리-확장수당등록
* 작성일자 : 2009-03-02
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.etc.rec;

import java.sql.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.ds.*;

/**
 * 
 */


public class SE_ETC_1000_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SE_ETC_1000_MCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}
}

/* 작성시간 : Mon Mar 02 15:29:40 KST 2009 */