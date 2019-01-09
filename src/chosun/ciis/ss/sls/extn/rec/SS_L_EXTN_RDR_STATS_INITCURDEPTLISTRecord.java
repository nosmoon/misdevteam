/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_EXTN_RDR_STATS_INITCURDEPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;
	public String dept_cd;
	public String supr_dept_cd;
	
	public SS_L_EXTN_RDR_STATS_INITCURDEPTLISTRecord(){}

	public void setAreacd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setAreanm(String area_nm){
		this.area_nm = area_nm;
	}
	public void setDeptcd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSuprdeptcd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public String getAreacd(){
		return this.area_cd;
	}

	public String getAreanm(){
		return this.area_nm;
	}
	public String getDeptcd(){
		return this.dept_cd;
	}

	public String getSuprdeptcd(){
		return this.supr_dept_cd;
	}
}

/* 작성시간 : Sat Feb 11 12:15:39 KST 2012 */