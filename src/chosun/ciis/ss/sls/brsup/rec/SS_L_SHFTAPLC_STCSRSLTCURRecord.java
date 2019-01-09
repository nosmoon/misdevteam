/***************************************************************************************************
* 파일명 : SS_L_SHFTAPLC_STCSRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-신청통계
* 작성일자 : 2004-06-07
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-신청통계
 *
 */


public class SS_L_SHFTAPLC_STCSRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String clsf1;
	public String clsf2;
	public int a_cnt;
	public int b_cnt;
	public int c_cnt;
	public int d_cnt;
	public int e_cnt;
	public int f_cnt;
	public int g_cnt;
	public int tot_cnt;

	public SS_L_SHFTAPLC_STCSRSLTCURRecord(){}

	public void setClsf1(String clsf1){
		this.clsf1 = clsf1;
	}

	public void setClsf2(String clsf2){
		this.clsf2 = clsf2;
	}

	public void setA_cnt(int a_cnt){
		this.a_cnt = a_cnt;
	}

	public void setB_cnt(int b_cnt){
		this.b_cnt = b_cnt;
	}

	public void setC_cnt(int c_cnt){
		this.c_cnt = c_cnt;
	}

	public void setD_cnt(int d_cnt){
		this.d_cnt = d_cnt;
	}

	public void setE_cnt(int e_cnt){
		this.e_cnt = e_cnt;
	}

	public void setF_cnt(int f_cnt){
		this.f_cnt = f_cnt;
	}

	public void setG_cnt(int g_cnt){
		this.g_cnt = g_cnt;
	}

	public void setTot_cnt(int tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public String getClsf1(){
		return this.clsf1;
	}

	public String getClsf2(){
		return this.clsf2;
	}

	public int getA_cnt(){
		return this.a_cnt;
	}

	public int getB_cnt(){
		return this.b_cnt;
	}

	public int getC_cnt(){
		return this.c_cnt;
	}

	public int getD_cnt(){
		return this.d_cnt;
	}

	public int getE_cnt(){
		return this.e_cnt;
	}

	public int getF_cnt(){
		return this.f_cnt;
	}

	public int getG_cnt(){
		return this.g_cnt;
	}

	public int getTot_cnt(){
		return this.tot_cnt;
	}
}

/* 작성시간 : Wed Jun 09 01:26:58 KST 2004 */