/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.trip.rec;

import java.sql.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 * 
 */


public class HD_TRIP_1701_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String dty_cd;
	public String posi_cd;
	public String rptv_posi_cd;
	public String rptv_posi_nm;
	public String duty_area_cd;
	public String duty_area_nm;

	public HD_TRIP_1701_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setRptv_posi_cd(String rptv_posi_cd){
		this.rptv_posi_cd = rptv_posi_cd;
	}

	public void setRptv_posi_nm(String rptv_posi_nm){
		this.rptv_posi_nm = rptv_posi_nm;
	}

	public void setDuty_area_cd(String duty_area_cd){
		this.duty_area_cd = duty_area_cd;
	}

	public void setDuty_area_nm(String duty_area_nm){
		this.duty_area_nm = duty_area_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getRptv_posi_cd(){
		return this.rptv_posi_cd;
	}

	public String getRptv_posi_nm(){
		return this.rptv_posi_nm;
	}

	public String getDuty_area_cd(){
		return this.duty_area_cd;
	}

	public String getDuty_area_nm(){
		return this.duty_area_nm;
	}
}

/* �ۼ��ð� : Thu Jul 23 19:43:25 KST 2009 */