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


public class HD_VACA_1601_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String posi_nm;
	public String rmn_vaca_dds;

	public HD_VACA_1601_LCURLISTRecord(){}

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

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setRmn_vaca_dds(String rmn_vaca_dds){
		this.rmn_vaca_dds = rmn_vaca_dds;
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

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getRmn_vaca_dds(){
		return this.rmn_vaca_dds;
	}
}

/* 작성시간 : Thu May 28 11:41:33 KST 2009 */