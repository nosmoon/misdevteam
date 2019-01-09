/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.rec;

import java.sql.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */


public class SE_BAS_1510_LJOBLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String chrg_emp_nm;
	public String clos_pers_emp_nm;
	public String clos_proc_dt;
	public String clos_yn;
	public String work_remk_1;
	public String work_remk_2;

	public SE_BAS_1510_LJOBLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setChrg_emp_nm(String chrg_emp_nm){
		this.chrg_emp_nm = chrg_emp_nm;
	}

	public void setClos_pers_emp_nm(String clos_pers_emp_nm){
		this.clos_pers_emp_nm = clos_pers_emp_nm;
	}

	public void setClos_proc_dt(String clos_proc_dt){
		this.clos_proc_dt = clos_proc_dt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setWork_remk_1(String work_remk_1){
		this.work_remk_1 = work_remk_1;
	}

	public void setWork_remk_2(String work_remk_2){
		this.work_remk_2 = work_remk_2;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getChrg_emp_nm(){
		return this.chrg_emp_nm;
	}

	public String getClos_pers_emp_nm(){
		return this.clos_pers_emp_nm;
	}

	public String getClos_proc_dt(){
		return this.clos_proc_dt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getWork_remk_1(){
		return this.work_remk_1;
	}

	public String getWork_remk_2(){
		return this.work_remk_2;
	}
}

/* 작성시간 : Fri Aug 21 12:00:07 KST 2009 */