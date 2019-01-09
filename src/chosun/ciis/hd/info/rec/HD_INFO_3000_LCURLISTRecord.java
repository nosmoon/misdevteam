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


public class HD_INFO_3000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String cont1;
	public String cont2;
	public String cont3;
	public String cont4;

	public HD_INFO_3000_LCURLISTRecord(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
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

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setCont1(String cont1){
		this.cont1 = cont1;
	}

	public void setCont2(String cont2){
		this.cont2 = cont2;
	}

	public void setCont3(String cont3){
		this.cont3 = cont3;
	}

	public void setCont4(String cont4){
		this.cont4 = cont4;
	}

	public String getCd_nm(){
		return this.cd_nm;
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

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getCont1(){
		return this.cont1;
	}

	public String getCont2(){
		return this.cont2;
	}

	public String getCont3(){
		return this.cont3;
	}

	public String getCont4(){
		return this.cont4;
	}
}

/* 작성시간 : Fri Aug 21 20:42:44 KST 2009 */