/***************************************************************************************************
* 파일명 : .java
* 기능 : 자재 - 마감관리 - 원가
* 작성일자 : 2010-07-07
* 작성자 : 이민효
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


public class MT_CLOSE_6110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String w_wgt;
	public String w_amt;
	public String b_isink_amt;
	public String b_isgt_amt;
	public String b_hsjr_amt;
	public String b_pjjr_amt;
	public String b_smjj_amt;
	public String b_tot_amt;
	public String ndduc_rate;
	public String tot_amt;

	public MT_CLOSE_6110_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setW_wgt(String w_wgt){
		this.w_wgt = w_wgt;
	}

	public void setW_amt(String w_amt){
		this.w_amt = w_amt;
	}

	public void setB_isink_amt(String b_isink_amt){
		this.b_isink_amt = b_isink_amt;
	}

	public void setB_isgt_amt(String b_isgt_amt){
		this.b_isgt_amt = b_isgt_amt;
	}

	public void setB_hsjr_amt(String b_hsjr_amt){
		this.b_hsjr_amt = b_hsjr_amt;
	}

	public void setB_pjjr_amt(String b_pjjr_amt){
		this.b_pjjr_amt = b_pjjr_amt;
	}

	public void setB_smjj_amt(String b_smjj_amt){
		this.b_smjj_amt = b_smjj_amt;
	}

	public void setB_tot_amt(String b_tot_amt){
		this.b_tot_amt = b_tot_amt;
	}

	public void setNdduc_rate(String ndduc_rate){
		this.ndduc_rate = ndduc_rate;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getW_wgt(){
		return this.w_wgt;
	}

	public String getW_amt(){
		return this.w_amt;
	}

	public String getB_isink_amt(){
		return this.b_isink_amt;
	}

	public String getB_isgt_amt(){
		return this.b_isgt_amt;
	}

	public String getB_hsjr_amt(){
		return this.b_hsjr_amt;
	}

	public String getB_pjjr_amt(){
		return this.b_pjjr_amt;
	}

	public String getB_smjj_amt(){
		return this.b_smjj_amt;
	}

	public String getB_tot_amt(){
		return this.b_tot_amt;
	}

	public String getNdduc_rate(){
		return this.ndduc_rate;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}
}

/* 작성시간 : Wed Jul 07 18:11:19 KST 2010 */