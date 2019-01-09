/***************************************************************************************************
 * 파일명   : PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord.java
 * 기능     : 수당-사원별수당관리 초기
 * 작성일자 : 2004-03-08
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.allow.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 *   수당-사원별수당관리 초기
 *
 **/

public class PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String deptcd;
	public String sellnetclsf;

	public PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setSellnetclsf(String sellnetclsf){
		this.sellnetclsf = sellnetclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSellnetclsf(){
		return this.sellnetclsf;
	}
}

/* 작성시간 : Wed Mar 21 18:40:03 KST 2007 */