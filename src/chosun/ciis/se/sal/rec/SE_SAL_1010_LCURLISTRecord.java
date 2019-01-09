/***************************************************************************************************
* 파일명 : SE_SAL_1010_LCURLISTRecord.java
* 기능 : 판매 - 지대관리 - 매출관리 - 월지역담당정보관리
* 작성일자 : 2009-04-09
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm			;
	public String supr_dept_cd	;
	public String supr_dept_nm	;
	public String dept_cd		;
	public String dept_nm		;
	public String sido_cd		;
	public String sido_nm		;
	public String area_cd		;
	public String area_nm		;
	public String chrg_pers		;
	public String flnm			;
	public String gubun			;
	public String crte_yn		;

	public SE_SAL_1010_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setSupr_dept_nm(String supr_dept_nm){
		this.supr_dept_nm = supr_dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSido_cd(String sido_cd){
		this.sido_cd = sido_cd;
	}

	public void setSido_nm(String sido_nm){
		this.sido_nm = sido_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCrte_yn(String crte_yn){
		this.crte_yn = crte_yn;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getSupr_dept_nm(){
		return this.supr_dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSido_cd(){
		return this.sido_cd;
	}

	public String getSido_nm(){
		return this.sido_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCrte_yn(){
		return this.crte_yn;
	}
}

/* 작성시간 : Thu Apr 09 10:50:00 KST 2009 */