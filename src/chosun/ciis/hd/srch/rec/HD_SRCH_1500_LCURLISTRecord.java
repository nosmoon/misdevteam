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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String up_dept_cd;
	public String up_dept_nm;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String in_cmpy_dt;
	public String last_upgrd_dt;
	public String wowlrdlftn2;
	public String duty_yydd;
	public String qlrmsrlrks2;
	public String rmsthrdlftn2;
	public String dkstlrdlfwk;
	public String dkstlr;

	public HD_SRCH_1500_LCURLISTRecord(){}

	public void setUp_dept_cd(String up_dept_cd){
		this.up_dept_cd = up_dept_cd;
	}

	public void setUp_dept_nm(String up_dept_nm){
		this.up_dept_nm = up_dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLast_upgrd_dt(String last_upgrd_dt){
		this.last_upgrd_dt = last_upgrd_dt;
	}

	public void setWowlrdlftn2(String wowlrdlftn2){
		this.wowlrdlftn2 = wowlrdlftn2;
	}

	public void setDuty_yydd(String duty_yydd){
		this.duty_yydd = duty_yydd;
	}

	public void setQlrmsrlrks2(String qlrmsrlrks2){
		this.qlrmsrlrks2 = qlrmsrlrks2;
	}

	public void setRmsthrdlftn2(String rmsthrdlftn2){
		this.rmsthrdlftn2 = rmsthrdlftn2;
	}

	public void setDkstlrdlfwk(String dkstlrdlfwk){
		this.dkstlrdlfwk = dkstlrdlfwk;
	}

	public void setDkstlr(String dkstlr){
		this.dkstlr = dkstlr;
	}

	public String getUp_dept_cd(){
		return this.up_dept_cd;
	}

	public String getUp_dept_nm(){
		return this.up_dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLast_upgrd_dt(){
		return this.last_upgrd_dt;
	}

	public String getWowlrdlftn2(){
		return this.wowlrdlftn2;
	}

	public String getDuty_yydd(){
		return this.duty_yydd;
	}

	public String getQlrmsrlrks2(){
		return this.qlrmsrlrks2;
	}

	public String getRmsthrdlftn2(){
		return this.rmsthrdlftn2;
	}

	public String getDkstlrdlfwk(){
		return this.dkstlrdlfwk;
	}

	public String getDkstlr(){
		return this.dkstlr;
	}
}

/* 작성시간 : Mon Aug 17 09:26:22 KST 2009 */