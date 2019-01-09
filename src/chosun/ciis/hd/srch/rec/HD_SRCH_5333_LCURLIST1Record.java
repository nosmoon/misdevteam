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


public class HD_SRCH_5333_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String clas_clsf1_01;
	public String clas_clsf2_01;
	public String pre_emp_cnt_01;
	public String pre_servcost_01;
	public String emp_cnt_01;
	public String servcost_01;
	public String icdc_amt_01;

	public HD_SRCH_5333_LCURLIST1Record(){}

	public void setClas_clsf1_01(String clas_clsf1_01){
		this.clas_clsf1_01 = clas_clsf1_01;
	}

	public void setClas_clsf2_01(String clas_clsf2_01){
		this.clas_clsf2_01 = clas_clsf2_01;
	}

	public void setPre_emp_cnt_01(String pre_emp_cnt_01){
		this.pre_emp_cnt_01 = pre_emp_cnt_01;
	}

	public void setPre_servcost_01(String pre_servcost_01){
		this.pre_servcost_01 = pre_servcost_01;
	}

	public void setEmp_cnt_01(String emp_cnt_01){
		this.emp_cnt_01 = emp_cnt_01;
	}

	public void setServcost_01(String servcost_01){
		this.servcost_01 = servcost_01;
	}

	public void setIcdc_amt_01(String icdc_amt_01){
		this.icdc_amt_01 = icdc_amt_01;
	}

	public String getClas_clsf1_01(){
		return this.clas_clsf1_01;
	}

	public String getClas_clsf2_01(){
		return this.clas_clsf2_01;
	}

	public String getPre_emp_cnt_01(){
		return this.pre_emp_cnt_01;
	}

	public String getPre_servcost_01(){
		return this.pre_servcost_01;
	}

	public String getEmp_cnt_01(){
		return this.emp_cnt_01;
	}

	public String getServcost_01(){
		return this.servcost_01;
	}

	public String getIcdc_amt_01(){
		return this.icdc_amt_01;
	}
}

/* 작성시간 : Mon Nov 26 15:01:54 KST 2018 */