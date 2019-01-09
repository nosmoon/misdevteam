/***************************************************************************************************
* 파일명 : SS_L_POSTDLVRDR_INITTEAM_CDCURRecord.java
* 기능 : 독자관리 우송독자관리 초기화면
* 작성일자 : 2015-06-17
* 작성자 : 장 선 희 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :  
* 수정일자 : 
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 
 */


public class SS_L_POSTDLVRDR_INITTEAM_CDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_L_POSTDLVRDR_INITTEAM_CDCURRecord(){}

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

/* 작성시간 : Wed Jun 17 09:49:10 KST 2015 */