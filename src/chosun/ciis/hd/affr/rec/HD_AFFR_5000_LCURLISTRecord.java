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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_5000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String dept_name;
	public String dty_name;
	public String posi_name;

	public HD_AFFR_5000_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_name(String dept_name){
		this.dept_name = dept_name;
	}

	public void setDty_name(String dty_name){
		this.dty_name = dty_name;
	}

	public void setPosi_name(String posi_name){
		this.posi_name = posi_name;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_name(){
		return this.dept_name;
	}

	public String getDty_name(){
		return this.dty_name;
	}

	public String getPosi_name(){
		return this.posi_name;
	}
}

/* 작성시간 : Sun Jun 21 14:26:56 KST 2009 */