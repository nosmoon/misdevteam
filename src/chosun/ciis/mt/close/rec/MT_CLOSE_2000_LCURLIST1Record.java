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


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_2000_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String matr_cd;
	public String matr_nm;
	public String fac_clsf_nm;
	public String o_bi;
	public String o_qunt;
	public String o_amt;
	public String s_bi;
	public String s_qunt;
	public String s_amt;
	public String b_bi;
	public String b_qunt;
	public String b_amt;

	public MT_CLOSE_2000_LCURLIST1Record(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setO_bi(String o_bi){
		this.o_bi = o_bi;
	}

	public void setO_qunt(String o_qunt){
		this.o_qunt = o_qunt;
	}

	public void setO_amt(String o_amt){
		this.o_amt = o_amt;
	}

	public void setS_bi(String s_bi){
		this.s_bi = s_bi;
	}

	public void setS_qunt(String s_qunt){
		this.s_qunt = s_qunt;
	}

	public void setS_amt(String s_amt){
		this.s_amt = s_amt;
	}

	public void setB_bi(String b_bi){
		this.b_bi = b_bi;
	}

	public void setB_qunt(String b_qunt){
		this.b_qunt = b_qunt;
	}

	public void setB_amt(String b_amt){
		this.b_amt = b_amt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getO_bi(){
		return this.o_bi;
	}

	public String getO_qunt(){
		return this.o_qunt;
	}

	public String getO_amt(){
		return this.o_amt;
	}

	public String getS_bi(){
		return this.s_bi;
	}

	public String getS_qunt(){
		return this.s_qunt;
	}

	public String getS_amt(){
		return this.s_amt;
	}

	public String getB_bi(){
		return this.b_bi;
	}

	public String getB_qunt(){
		return this.b_qunt;
	}

	public String getB_amt(){
		return this.b_amt;
	}
}

/* 작성시간 : Mon Aug 03 21:09:16 KST 2009 */