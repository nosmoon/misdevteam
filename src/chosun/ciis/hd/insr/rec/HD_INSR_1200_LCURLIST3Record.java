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


public class HD_INSR_1200_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String s_slf_burd_insr_fee;
	public String s_cmpy_burd_insr_fee;
	public String s_slf_burd_med_care_insr_fee;
	public String s_cmpy_burd_med_care_insr_fee;
	public String sumall;

	public HD_INSR_1200_LCURLIST3Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setS_slf_burd_insr_fee(String s_slf_burd_insr_fee){
		this.s_slf_burd_insr_fee = s_slf_burd_insr_fee;
	}

	public void setS_cmpy_burd_insr_fee(String s_cmpy_burd_insr_fee){
		this.s_cmpy_burd_insr_fee = s_cmpy_burd_insr_fee;
	}

	public void setS_slf_burd_med_care_insr_fee(String s_slf_burd_med_care_insr_fee){
		this.s_slf_burd_med_care_insr_fee = s_slf_burd_med_care_insr_fee;
	}

	public void setS_cmpy_burd_med_care_insr_fee(String s_cmpy_burd_med_care_insr_fee){
		this.s_cmpy_burd_med_care_insr_fee = s_cmpy_burd_med_care_insr_fee;
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

	public String getS_slf_burd_insr_fee(){
		return this.s_slf_burd_insr_fee;
	}

	public String getS_cmpy_burd_insr_fee(){
		return this.s_cmpy_burd_insr_fee;
	}

	public String getS_slf_burd_med_care_insr_fee(){
		return this.s_slf_burd_med_care_insr_fee;
	}

	public String getS_cmpy_burd_med_care_insr_fee(){
		return this.s_cmpy_burd_med_care_insr_fee;
	}

	public String getSumall(){
		return this.sumall;
	}
}

/* 작성시간 : Thu Aug 20 17:18:52 KST 2009 */