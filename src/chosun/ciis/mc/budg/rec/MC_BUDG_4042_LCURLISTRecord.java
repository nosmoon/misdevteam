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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_4042_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String work_no;
	public String medi_cd;
	public String use_dept_cd;
	public String budg_yymm;
	public String dtsqty;
	public String dtdan;
	public String dtamt;
	public String rmks;
	public String crte_clsf;
	public String work_dt;
	public String hsty_no;

	public MC_BUDG_4042_LCURLISTRecord(){}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setDtsqty(String dtsqty){
		this.dtsqty = dtsqty;
	}

	public void setDtdan(String dtdan){
		this.dtdan = dtdan;
	}

	public void setDtamt(String dtamt){
		this.dtamt = dtamt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setCrte_clsf(String crte_clsf){
		this.crte_clsf = crte_clsf;
	}

	public void setWork_dt(String work_dt){
		this.work_dt = work_dt;
	}

	public void setHsty_no(String hsty_no){
		this.hsty_no = hsty_no;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getDtsqty(){
		return this.dtsqty;
	}

	public String getDtdan(){
		return this.dtdan;
	}

	public String getDtamt(){
		return this.dtamt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getCrte_clsf(){
		return this.crte_clsf;
	}

	public String getWork_dt(){
		return this.work_dt;
	}

	public String getHsty_no(){
		return this.hsty_no;
	}
}

/* 작성시간 : Fri Apr 17 14:51:07 KST 2009 */