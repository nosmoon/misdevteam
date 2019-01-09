/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_3022_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_no;
	public String clam_dept_nm;
	public String budg_nm;
	public String medi_nm;
	public String use_dept_nm;
	public String rmks1;
	public String rmks2;

	public MC_COST_3022_LCURLISTRecord(){}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setClam_dept_nm(String clam_dept_nm){
		this.clam_dept_nm = clam_dept_nm;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getClam_dept_nm(){
		return this.clam_dept_nm;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}
}

/* 작성시간 : Wed May 06 20:24:07 KST 2009 */