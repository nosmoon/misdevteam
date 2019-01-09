/***************************************************************************************************
* 파일명 : SS_MO_L_LOGINAPLC_INITTEAMLISTRecord.java
* 기능 :   관리자-모바일관리-로그인승인신청 초기화면을 위한 Record
* 작성일자 : 2016-09-22
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 *  관리자-모바일관리-로그인승인신청 초기화면을 위한 Record
 */


public class SS_MO_L_LOGINAPLC_INITTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_MO_L_LOGINAPLC_INITTEAMLISTRecord(){}

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

/* 작성시간 : Thu Sep 22 11:22:28 KST 2016 */