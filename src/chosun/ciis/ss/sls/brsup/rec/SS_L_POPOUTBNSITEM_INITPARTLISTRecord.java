/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-상세조회화면-출고추가
* 작성일자 : 2009-05-08
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 통합정보지원시스템 판촉물재고현황 상세조회 출고추가팝업
 */

public class SS_L_POPOUTBNSITEM_INITPARTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String supr_dept_cd;

	public SS_L_POPOUTBNSITEM_INITPARTLISTRecord(){}

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

/* 작성시간 : Fri May 08 17:12:58 PDT 2009 */