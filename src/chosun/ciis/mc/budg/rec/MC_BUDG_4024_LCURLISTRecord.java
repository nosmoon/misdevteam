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


public class MC_BUDG_4024_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sub_no;
	public String work_no;
	public String seq;
	public String sub_seq;
	public String budg_cd;
	public String budg_cdnm;
	public String evnt_cd;
	public String evnt_cdnm;
	public String budg_yymm;
	public String use_dept_cd;
	public String medi_cd;
	public String medi_cdnm;
	public String rmks;
	public String yrsqty;
	public String yrdan;
	public String yramt;
	public String qunt;
	public String uprc;
	public String amt;

	public MC_BUDG_4024_LCURLISTRecord(){}

	public void setSub_no(String sub_no){
		this.sub_no = sub_no;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_cdnm(String evnt_cdnm){
		this.evnt_cdnm = evnt_cdnm;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cdnm(String medi_cdnm){
		this.medi_cdnm = medi_cdnm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setYrsqty(String yrsqty){
		this.yrsqty = yrsqty;
	}

	public void setYrdan(String yrdan){
		this.yrdan = yrdan;
	}

	public void setYramt(String yramt){
		this.yramt = yramt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getSub_no(){
		return this.sub_no;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_cdnm(){
		return this.evnt_cdnm;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cdnm(){
		return this.medi_cdnm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getYrsqty(){
		return this.yrsqty;
	}

	public String getYrdan(){
		return this.yrdan;
	}

	public String getYramt(){
		return this.yramt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Thu May 21 16:31:31 KST 2009 */