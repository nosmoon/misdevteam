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


package chosun.ciis.is.rpt.rec;

import java.sql.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.ds.*;

/**
 * 
 */


public class IS_RPT_1910_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String sido;
	public String gu;
	public String sido_nm;
	public String gu_nm;
	public String p_amt_010;
	public String p_amt_020;
	public String p_amt_030;
	public String p_amt_tot;
	public String b_amt_010;
	public String b_amt_020;
	public String b_amt_030;
	public String b_amt_tot;
	public String c_amt_010;
	public String c_amt_020;
	public String c_amt_030;
	public String c_amt_tot;

	public IS_RPT_1910_LCURLIST1Record(){}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGu(String gu){
		this.gu = gu;
	}

	public void setSido_nm(String sido_nm){
		this.sido_nm = sido_nm;
	}

	public void setGu_nm(String gu_nm){
		this.gu_nm = gu_nm;
	}

	public void setP_amt_010(String p_amt_010){
		this.p_amt_010 = p_amt_010;
	}

	public void setP_amt_020(String p_amt_020){
		this.p_amt_020 = p_amt_020;
	}

	public void setP_amt_030(String p_amt_030){
		this.p_amt_030 = p_amt_030;
	}

	public void setP_amt_tot(String p_amt_tot){
		this.p_amt_tot = p_amt_tot;
	}

	public void setB_amt_010(String b_amt_010){
		this.b_amt_010 = b_amt_010;
	}

	public void setB_amt_020(String b_amt_020){
		this.b_amt_020 = b_amt_020;
	}

	public void setB_amt_030(String b_amt_030){
		this.b_amt_030 = b_amt_030;
	}

	public void setB_amt_tot(String b_amt_tot){
		this.b_amt_tot = b_amt_tot;
	}

	public void setC_amt_010(String c_amt_010){
		this.c_amt_010 = c_amt_010;
	}

	public void setC_amt_020(String c_amt_020){
		this.c_amt_020 = c_amt_020;
	}

	public void setC_amt_030(String c_amt_030){
		this.c_amt_030 = c_amt_030;
	}

	public void setC_amt_tot(String c_amt_tot){
		this.c_amt_tot = c_amt_tot;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGu(){
		return this.gu;
	}

	public String getSido_nm(){
		return this.sido_nm;
	}

	public String getGu_nm(){
		return this.gu_nm;
	}

	public String getP_amt_010(){
		return this.p_amt_010;
	}

	public String getP_amt_020(){
		return this.p_amt_020;
	}

	public String getP_amt_030(){
		return this.p_amt_030;
	}

	public String getP_amt_tot(){
		return this.p_amt_tot;
	}

	public String getB_amt_010(){
		return this.b_amt_010;
	}

	public String getB_amt_020(){
		return this.b_amt_020;
	}

	public String getB_amt_030(){
		return this.b_amt_030;
	}

	public String getB_amt_tot(){
		return this.b_amt_tot;
	}

	public String getC_amt_010(){
		return this.c_amt_010;
	}

	public String getC_amt_020(){
		return this.c_amt_020;
	}

	public String getC_amt_030(){
		return this.c_amt_030;
	}

	public String getC_amt_tot(){
		return this.c_amt_tot;
	}
}

/* 작성시간 : Fri Jun 01 09:40:30 KST 2012 */