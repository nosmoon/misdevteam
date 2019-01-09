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


public class HD_SRCH_5131_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String guk_nm;
	public String dept_nm;
	public String guk_cd;
	public String emp_clsf1;
	public String emp_clsf2;
	public String emp_clsf3;
	public String emp_clsf4;
	public String emp_cnt;
	public String in_cmpy;
	public String lvcmpy;
	public String remk;

	public HD_SRCH_5131_LCURLISTRecord(){}

	public void setGuk_nm(String guk_nm){
		this.guk_nm = guk_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setGuk_cd(String guk_cd){
		this.guk_cd = guk_cd;
	}

	public void setEmp_clsf1(String emp_clsf1){
		this.emp_clsf1 = emp_clsf1;
	}

	public void setEmp_clsf2(String emp_clsf2){
		this.emp_clsf2 = emp_clsf2;
	}

	public void setEmp_clsf3(String emp_clsf3){
		this.emp_clsf3 = emp_clsf3;
	}

	public void setEmp_clsf4(String emp_clsf4){
		this.emp_clsf4 = emp_clsf4;
	}

	public void setEmp_cnt(String emp_cnt){
		this.emp_cnt = emp_cnt;
	}

	public void setIn_cmpy(String in_cmpy){
		this.in_cmpy = in_cmpy;
	}

	public void setLvcmpy(String lvcmpy){
		this.lvcmpy = lvcmpy;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getGuk_nm(){
		return this.guk_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getGuk_cd(){
		return this.guk_cd;
	}

	public String getEmp_clsf1(){
		return this.emp_clsf1;
	}

	public String getEmp_clsf2(){
		return this.emp_clsf2;
	}

	public String getEmp_clsf3(){
		return this.emp_clsf3;
	}

	public String getEmp_clsf4(){
		return this.emp_clsf4;
	}

	public String getEmp_cnt(){
		return this.emp_cnt;
	}

	public String getIn_cmpy(){
		return this.in_cmpy;
	}

	public String getLvcmpy(){
		return this.lvcmpy;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu Nov 22 16:41:44 KST 2018 */