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


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1000_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String slf_burd_amt_sum;
	public String cmpy_burd_amt_sum;
	public String lvcmpy_swit_amt_sum;
	public String nan1;
	public String nan2;
	public String sumall;

	public HD_INSR_1000_LCURLIST3Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSlf_burd_amt_sum(String slf_burd_amt_sum){
		this.slf_burd_amt_sum = slf_burd_amt_sum;
	}

	public void setCmpy_burd_amt_sum(String cmpy_burd_amt_sum){
		this.cmpy_burd_amt_sum = cmpy_burd_amt_sum;
	}

	public void setLvcmpy_swit_amt_sum(String lvcmpy_swit_amt_sum){
		this.lvcmpy_swit_amt_sum = lvcmpy_swit_amt_sum;
	}

	public void setNan1(String nan1){
		this.nan1 = nan1;
	}

	public void setNan2(String nan2){
		this.nan2 = nan2;
	}

	public void setSumall(String sumall){
		this.sumall = sumall;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSlf_burd_amt_sum(){
		return this.slf_burd_amt_sum;
	}

	public String getCmpy_burd_amt_sum(){
		return this.cmpy_burd_amt_sum;
	}

	public String getLvcmpy_swit_amt_sum(){
		return this.lvcmpy_swit_amt_sum;
	}

	public String getNan1(){
		return this.nan1;
	}

	public String getNan2(){
		return this.nan2;
	}

	public String getSumall(){
		return this.sumall;
	}
}

/* 작성시간 : Thu Aug 20 20:54:39 KST 2009 */