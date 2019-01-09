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


public class HD_SRCH_5541_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String guk_nm;
	public String dept_nm;
	public String dept_cd;
	public String emp_clsf1;
	public String emp_clsf2;
	public String emp_clsf3;
	public String emp_clsf4;
	public String emp_clsf5;
	public String emp_clsf6;
	public String emp_clsf7;
	public String emp_clsf8;
	public String emp_clsf9;
	public String emp_clsf10;
	public String emp_clsf11;
	public String tot_sum;

	public HD_SRCH_5541_LCURLIST1Record(){}

	public void setGuk_nm(String guk_nm){
		this.guk_nm = guk_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
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

	public void setEmp_clsf5(String emp_clsf5){
		this.emp_clsf5 = emp_clsf5;
	}

	public void setEmp_clsf6(String emp_clsf6){
		this.emp_clsf6 = emp_clsf6;
	}

	public void setEmp_clsf7(String emp_clsf7){
		this.emp_clsf7 = emp_clsf7;
	}

	public void setEmp_clsf8(String emp_clsf8){
		this.emp_clsf8 = emp_clsf8;
	}

	public void setEmp_clsf9(String emp_clsf9){
		this.emp_clsf9 = emp_clsf9;
	}

	public void setEmp_clsf10(String emp_clsf10){
		this.emp_clsf10 = emp_clsf10;
	}

	public void setEmp_clsf11(String emp_clsf11){
		this.emp_clsf11 = emp_clsf11;
	}

	public void setTot_sum(String tot_sum){
		this.tot_sum = tot_sum;
	}

	public String getGuk_nm(){
		return this.guk_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
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

	public String getEmp_clsf5(){
		return this.emp_clsf5;
	}

	public String getEmp_clsf6(){
		return this.emp_clsf6;
	}

	public String getEmp_clsf7(){
		return this.emp_clsf7;
	}

	public String getEmp_clsf8(){
		return this.emp_clsf8;
	}

	public String getEmp_clsf9(){
		return this.emp_clsf9;
	}

	public String getEmp_clsf10(){
		return this.emp_clsf10;
	}

	public String getEmp_clsf11(){
		return this.emp_clsf11;
	}

	public String getTot_sum(){
		return this.tot_sum;
	}
}

/* 작성시간 : Wed Nov 07 18:58:26 KST 2018 */