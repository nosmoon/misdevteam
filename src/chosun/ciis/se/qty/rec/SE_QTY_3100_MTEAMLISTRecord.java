/***************************************************************************************************
* 파일명 : SE_QTY_3100_MTEAMLISTRecord.java
* 기능 : 부수관리 - 발송부수 - 발송부수증감현황
* 작성일자 : 2009-03-11
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_3100_MTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SE_QTY_3100_MTEAMLISTRecord(){}

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

/* 작성시간 : Tue Mar 10 16:26:41 KST 2009 */