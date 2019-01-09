/***************************************************************************************************
* 파일명 : SE_BAS_1100_MPARTLISTRecord.java
* 기능 :  판매 - 기준정보 - 지역관리 
 * 작성일자 : 2009.01.15
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.rec;

import java.sql.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */


public class SE_BAS_1100_MPARTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String supr_dept_cd;
	
	public String getSupr_dept_cd() {
		return supr_dept_cd;
	}

	public void setSupr_dept_cd(String supr_dept_cd) {
		this.supr_dept_cd = supr_dept_cd;
	}

	public SE_BAS_1100_MPARTLISTRecord(){}

	public String getDept_cd() {
		return dept_cd;
	}

	public void setDept_cd(String dept_cd) {
		this.dept_cd = dept_cd;
	}

	public String getDept_nm() {
		return dept_nm;
	}

	public void setDept_nm(String dept_nm) {
		this.dept_nm = dept_nm;
	}

}

/* 작성시간 : Fri Jan 16 10:05:09 KST 2009 */