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


public class MC_BUDG_4012_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String amt_s;
	public String use_dept_cd;
	public String medi_cd;
	public String rmks;
	public String qunt;
	public String uprc;
	public String yramt;
	public String amt;
	public String hsty_no;
	public String sub_no;

	public MC_BUDG_4012_LCURLISTRecord(){}

	public void setAmt_s(String amt_s){
		this.amt_s = amt_s;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setYramt(String yramt){
		this.yramt = yramt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setHsty_no(String hsty_no){
		this.hsty_no = hsty_no;
	}

	public void setSub_no(String sub_no){
		this.sub_no = sub_no;
	}

	public String getAmt_s(){
		return this.amt_s;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getYramt(){
		return this.yramt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getHsty_no(){
		return this.hsty_no;
	}

	public String getSub_no(){
		return this.sub_no;
	}
}

/* 작성시간 : Tue May 26 17:06:34 KST 2009 */