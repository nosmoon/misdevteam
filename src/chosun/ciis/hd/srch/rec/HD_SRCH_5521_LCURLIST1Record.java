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


public class HD_SRCH_5521_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String row_num;
	public String emp_clsf;
	public String prv_mm;
	public String base_mm;
	public String prvmm_cmpr;
	public String icdc_rate;

	public HD_SRCH_5521_LCURLIST1Record(){}

	public void setRow_num(String row_num){
		this.row_num = row_num;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setPrv_mm(String prv_mm){
		this.prv_mm = prv_mm;
	}

	public void setBase_mm(String base_mm){
		this.base_mm = base_mm;
	}

	public void setPrvmm_cmpr(String prvmm_cmpr){
		this.prvmm_cmpr = prvmm_cmpr;
	}

	public void setIcdc_rate(String icdc_rate){
		this.icdc_rate = icdc_rate;
	}

	public String getRow_num(){
		return this.row_num;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getPrv_mm(){
		return this.prv_mm;
	}

	public String getBase_mm(){
		return this.base_mm;
	}

	public String getPrvmm_cmpr(){
		return this.prvmm_cmpr;
	}

	public String getIcdc_rate(){
		return this.icdc_rate;
	}
}

/* 작성시간 : Wed Nov 07 15:04:52 KST 2018 */