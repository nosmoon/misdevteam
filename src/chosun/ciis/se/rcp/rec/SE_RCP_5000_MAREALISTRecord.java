/***************************************************************************************************
* 파일명 : SE_RCP_5000_MAREALISTRecord.java
* 기능 : 판매- 입금관리 - 마감관리 - 일입금마감
* 작성일자 : 2009-05-20
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_5000_MAREALISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd		;
	public String area_nm		;
	public String dept_cd		;
	public String supr_dept_cd	;

	public SE_RCP_5000_MAREALISTRecord(){}

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

/* 작성시간 : Wed May 20 10:08:50 KST 2009 */