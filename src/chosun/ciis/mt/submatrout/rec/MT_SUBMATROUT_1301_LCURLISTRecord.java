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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 *
 */


public class MT_SUBMATROUT_1301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String matr_cd;
	public String owh_dept;
	public String sum_qunt;
	public String avg_cgdan;
	public String sum_amt;
	public String matr_nm;
	public String owh_dept_nm;

	public MT_SUBMATROUT_1301_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setOwh_dept(String owh_dept){
		this.owh_dept = owh_dept;
	}

	public void setSum_qunt(String sum_qunt){
		this.sum_qunt = sum_qunt;
	}

	public void setAvg_cgdan(String avg_cgdan){
		this.avg_cgdan = avg_cgdan;
	}

	public void setSum_amt(String sum_amt){
		this.sum_amt = sum_amt;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setOwh_dept_nm(String owh_dept_nm){
		this.owh_dept_nm = owh_dept_nm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getOwh_dept(){
		return this.owh_dept;
	}

	public String getSum_qunt(){
		return this.sum_qunt;
	}

	public String getAvg_cgdan(){
		return this.avg_cgdan;
	}

	public String getSum_amt(){
		return this.sum_amt;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getOwh_dept_nm(){
		return this.owh_dept_nm;
	}
}

/* 작성시간 : Mon Mar 23 20:59:44 KST 2009 */