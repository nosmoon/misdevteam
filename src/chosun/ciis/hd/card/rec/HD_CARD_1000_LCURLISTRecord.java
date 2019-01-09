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


package chosun.ciis.hd.card.rec;

import java.sql.*;
import chosun.ciis.hd.card.dm.*;
import chosun.ciis.hd.card.ds.*;

/**
 * 
 */


public class HD_CARD_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String dept_cd;
	public String emp_no;
	public String nm_korn;
	public String dty_cd;
	public String posi_cd;
	public String dty_nm;
	public String posi_nm;

	public HD_CARD_1000_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
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

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
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

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}
}

/* 작성시간 : Thu Aug 30 09:51:57 KST 2012 */