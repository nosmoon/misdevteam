/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-독자등급관리-초기화면
* 작성일자 : 2009-04-10
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자현황-독자등급관리-초기화면
 */

public class SS_L_RDRCRTS_INITAREALISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;
	public String dept_cd;
	public String supr_dept_cd;

	public SS_L_RDRCRTS_INITAREALISTRecord(){}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}
}

/* 작성시간 : Sat Apr 11 13:13:10 KST 2009 */