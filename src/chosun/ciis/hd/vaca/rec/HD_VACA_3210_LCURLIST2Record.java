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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_3210_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String aply_yymm;
	public String week;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String posi_cd;
	public String posi_nm;
	public String dty_cd;
	public String dty_nm;
	public String week1;
	public String week2;
	public String week3;
	public String week4;
	public String week5;
	public String sun_rate;
	public String week_rate;

	public HD_VACA_3210_LCURLIST2Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setWeek(String week){
		this.week = week;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setWeek1(String week1){
		this.week1 = week1;
	}

	public void setWeek2(String week2){
		this.week2 = week2;
	}

	public void setWeek3(String week3){
		this.week3 = week3;
	}

	public void setWeek4(String week4){
		this.week4 = week4;
	}

	public void setWeek5(String week5){
		this.week5 = week5;
	}

	public void setSun_rate(String sun_rate){
		this.sun_rate = sun_rate;
	}

	public void setWeek_rate(String week_rate){
		this.week_rate = week_rate;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getWeek(){
		return this.week;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getWeek1(){
		return this.week1;
	}

	public String getWeek2(){
		return this.week2;
	}

	public String getWeek3(){
		return this.week3;
	}

	public String getWeek4(){
		return this.week4;
	}

	public String getWeek5(){
		return this.week5;
	}

	public String getSun_rate(){
		return this.sun_rate;
	}

	public String getWeek_rate(){
		return this.week_rate;
	}
}

/* 작성시간 : Wed Sep 02 09:51:56 KST 2015 */