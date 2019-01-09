/***************************************************************************************************
* 파일명 : SS_SLS_BRSUP_2900_ATEAMLISTRecord.java
* 기능 : 센터지원-판촉현황-요원관리-요원별실적관리
* 작성일자 : 2016-05-02
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
**  센터지원-판촉현황-요원관리-요원별실적관리
**/


public class SS_SLS_BRSUP_2900_ATEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_SLS_BRSUP_2900_ATEAMLISTRecord(){}

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

/* 작성시간 : Tue May 03 18:08:49 KST 2016 */