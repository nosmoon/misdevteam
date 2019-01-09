/***************************************************************************************************
* 파일명 : SE_RCP_2800_MPARTLISTRecord.java
* 기능 : 판매 - 입금관리 - 지대입금관리 - 보증인채무통보
* 작성일자 : 2009-04-24
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


public class SE_RCP_2800_MPARTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd		;
	public String dept_nm		;
	public String supr_dept_cd	;

	public SE_RCP_2800_MPARTLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}
}

/* 작성시간 : Fri Apr 24 13:21:16 KST 2009 */