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


package chosun.ciis.hd.info.rec;

import java.sql.*;

import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2401_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public byte[] phot;
	public String emp_no;
	public String dept_cd;
	//public Blob bPhot = null;
	
	public HD_INFO_2401_LCURLIST1Record(){}
	
	/*
	public void setBphot(Blob bPhot1) {
		this.bPhot = bPhot1;
	}
	*/
	
	public void setPhot(byte[] phot){
		this.phot = phot;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}
	
	/*
	public Blob getBphot(){
		return this.bPhot;
	}
	*/

	public byte[] getPhot(){
		return this.phot;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}
}

/* 작성시간 : Fri Jun 05 10:17:55 KST 2009 */