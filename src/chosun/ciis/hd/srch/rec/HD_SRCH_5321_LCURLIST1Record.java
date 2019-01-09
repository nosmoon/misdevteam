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


public class HD_SRCH_5321_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String clsf1;
	public String clsf2;
	public String emp_clsf1;
	public String emp_clsf2;
	public String emp_clsf3;
	public String emp_clsf4;
	public String tot_stot;

	public HD_SRCH_5321_LCURLIST1Record(){}

	public void setClsf1(String clsf1){
		this.clsf1 = clsf1;
	}

	public void setClsf2(String clsf2){
		this.clsf2 = clsf2;
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

	public void setTot_stot(String tot_stot){
		this.tot_stot = tot_stot;
	}

	public String getClsf1(){
		return this.clsf1;
	}

	public String getClsf2(){
		return this.clsf2;
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

	public String getTot_stot(){
		return this.tot_stot;
	}
}

/* 작성시간 : Tue Oct 16 17:02:25 KST 2018 */