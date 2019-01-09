/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-VacationStop-코드-초기화면
* 작성일자 : 2009-03-18
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자현황-VacationStop-코드-초기화면
 */

public class SS_L_VSCD_INITTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_L_VSCD_INITTEAMLISTRecord(){}

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

/* 작성시간 : Wed Mar 18 18:09:01 KST 2009 */