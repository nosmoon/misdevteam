/***************************************************************************************************
* 파일명 : SE_RCP_5020_LCURLISTRecord.java
* 기능 : 판매- 입금관리 - 마감관리 - 일입금마감
* 작성일자 : 2009-05-20
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


public class SE_RCP_5020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd		;
	public String dept_nm		;
	public String part_cd		;
	public String part_nm		;
	public String area_cd		;
	public String area_nm		;
	public String bo_nm			;
	public String part_clos_yn	;
	public String aera_clos_yn	;
	public String amt_1			;
	public String amt_2			;
	public String amt_3			;
	public String amt_etc		;
	public String amt			;

	public SE_RCP_5020_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setPart_clos_yn(String part_clos_yn){
		this.part_clos_yn = part_clos_yn;
	}

	public void setAera_clos_yn(String aera_clos_yn){
		this.aera_clos_yn = aera_clos_yn;
	}

	public void setAmt_1(String amt_1){
		this.amt_1 = amt_1;
	}

	public void setAmt_2(String amt_2){
		this.amt_2 = amt_2;
	}

	public void setAmt_3(String amt_3){
		this.amt_3 = amt_3;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getPart_clos_yn(){
		return this.part_clos_yn;
	}

	public String getAera_clos_yn(){
		return this.aera_clos_yn;
	}

	public String getAmt_1(){
		return this.amt_1;
	}

	public String getAmt_2(){
		return this.amt_2;
	}

	public String getAmt_3(){
		return this.amt_3;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getAmt_etc() {
		return amt_etc;
	}

	public void setAmt_etc(String amt_etc) {
		this.amt_etc = amt_etc;
	}
}

/* 작성시간 : Wed May 20 17:02:22 KST 2009 */