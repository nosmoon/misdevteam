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


package chosun.ciis.se.test.rec;

import java.sql.*;
import chosun.ciis.se.test.dm.*;
import chosun.ciis.se.test.ds.*;

/**
 * 
 */


public class SE_TEST_1050_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String yy;
	public String mm;
	public String week;
	public String emp_no;
	public String erp_id;
	public String emp_nm;
	public String cmpycd;
	public String workcd;
	public String vip_lastweek;
	public String lastweek;
	public String thisweek;

	public SE_TEST_1050_LCURLIST1Record(){}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setMm(String mm){
		this.mm = mm;
	}

	public void setWeek(String week){
		this.week = week;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setErp_id(String erp_id){
		this.erp_id = erp_id;
	}

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setWorkcd(String workcd){
		this.workcd = workcd;
	}

	public void setVip_lastweek(String vip_lastweek){
		this.vip_lastweek = vip_lastweek;
	}

	public void setLastweek(String lastweek){
		this.lastweek = lastweek;
	}

	public void setThisweek(String thisweek){
		this.thisweek = thisweek;
	}

	public String getYy(){
		return this.yy;
	}

	public String getMm(){
		return this.mm;
	}

	public String getWeek(){
		return this.week;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getErp_id(){
		return this.erp_id;
	}

	public String getEmp_nm(){
		return this.emp_nm;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getWorkcd(){
		return this.workcd;
	}

	public String getVip_lastweek(){
		return this.vip_lastweek;
	}

	public String getLastweek(){
		return this.lastweek;
	}

	public String getThisweek(){
		return this.thisweek;
	}
}

/* 작성시간 : Thu Jun 27 10:24:36 KST 2013 */