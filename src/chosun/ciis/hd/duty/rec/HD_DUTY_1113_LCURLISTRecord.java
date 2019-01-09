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


package chosun.ciis.hd.duty.rec;

import java.sql.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;

/**
 * 
 */


public class HD_DUTY_1113_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String dept_nm;
	public String posi_nm;
	public String rotate_duty_yn;

	public HD_DUTY_1113_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setRotate_duty_yn(String rotate_duty_yn){
		this.rotate_duty_yn = rotate_duty_yn;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getRotate_duty_yn(){
		return this.rotate_duty_yn;
	}
}

/* 작성시간 : Wed Oct 24 16:48:06 KST 2018 */