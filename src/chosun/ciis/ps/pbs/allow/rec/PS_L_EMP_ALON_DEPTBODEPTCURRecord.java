/***************************************************************************************************
* 파일명 : SP_PS_L_EMP_ALON_DEPT.java
* 수당-수당관리 지사별 부서코드
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * 수당-수당관리 지사별 부서코드 조회화면  
 *
 */ 

 

public class PS_L_EMP_ALON_DEPTBODEPTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;

	public PS_L_EMP_ALON_DEPTBODEPTCURRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}
}

/* 작성시간 : Mon Mar 08 14:54:16 KST 2004 */