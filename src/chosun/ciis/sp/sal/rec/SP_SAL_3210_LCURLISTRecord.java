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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_3210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String suply_pers_nm;
	public String ordr_dt;
	public String doco_no;
	public String dlco_nm;
	public String bo_addr;
	public String gds_nm;
	public String stot_amt;
	public String sale_cost;
	public String profit_rate;
	public String profit_amt;
	public String clamt_mthd;
	public String div_cnt;
	public String sale_yymm;
	public String div_01;
	public String div_02;
	public String div_03;
	public String div_04;
	public String div_05;
	public String div_06;
	public String div_07;
	public String div_08;
	public String div_09;
	public String div_10;
	public String div_11;
	public String div_12;

	public SP_SAL_3210_LCURLISTRecord(){}

	public void setSuply_pers_nm(String suply_pers_nm){
		this.suply_pers_nm = suply_pers_nm;
	}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setDoco_no(String doco_no){
		this.doco_no = doco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBo_addr(String bo_addr){
		this.bo_addr = bo_addr;
	}

	public void setGds_nm(String gds_nm){
		this.gds_nm = gds_nm;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public void setSale_cost(String sale_cost){
		this.sale_cost = sale_cost;
	}

	public void setProfit_rate(String profit_rate){
		this.profit_rate = profit_rate;
	}

	public void setProfit_amt(String profit_amt){
		this.profit_amt = profit_amt;
	}

	public void setClamt_mthd(String clamt_mthd){
		this.clamt_mthd = clamt_mthd;
	}

	public void setDiv_cnt(String div_cnt){
		this.div_cnt = div_cnt;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setDiv_01(String div_01){
		this.div_01 = div_01;
	}

	public void setDiv_02(String div_02){
		this.div_02 = div_02;
	}

	public void setDiv_03(String div_03){
		this.div_03 = div_03;
	}

	public void setDiv_04(String div_04){
		this.div_04 = div_04;
	}

	public void setDiv_05(String div_05){
		this.div_05 = div_05;
	}

	public void setDiv_06(String div_06){
		this.div_06 = div_06;
	}

	public void setDiv_07(String div_07){
		this.div_07 = div_07;
	}

	public void setDiv_08(String div_08){
		this.div_08 = div_08;
	}

	public void setDiv_09(String div_09){
		this.div_09 = div_09;
	}

	public void setDiv_10(String div_10){
		this.div_10 = div_10;
	}

	public void setDiv_11(String div_11){
		this.div_11 = div_11;
	}

	public void setDiv_12(String div_12){
		this.div_12 = div_12;
	}

	public String getSuply_pers_nm(){
		return this.suply_pers_nm;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getDoco_no(){
		return this.doco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBo_addr(){
		return this.bo_addr;
	}

	public String getGds_nm(){
		return this.gds_nm;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}

	public String getSale_cost(){
		return this.sale_cost;
	}

	public String getProfit_rate(){
		return this.profit_rate;
	}

	public String getProfit_amt(){
		return this.profit_amt;
	}

	public String getClamt_mthd(){
		return this.clamt_mthd;
	}

	public String getDiv_cnt(){
		return this.div_cnt;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getDiv_01(){
		return this.div_01;
	}

	public String getDiv_02(){
		return this.div_02;
	}

	public String getDiv_03(){
		return this.div_03;
	}

	public String getDiv_04(){
		return this.div_04;
	}

	public String getDiv_05(){
		return this.div_05;
	}

	public String getDiv_06(){
		return this.div_06;
	}

	public String getDiv_07(){
		return this.div_07;
	}

	public String getDiv_08(){
		return this.div_08;
	}

	public String getDiv_09(){
		return this.div_09;
	}

	public String getDiv_10(){
		return this.div_10;
	}

	public String getDiv_11(){
		return this.div_11;
	}

	public String getDiv_12(){
		return this.div_12;
	}
}

/* 작성시간 : Sun Jul 22 15:23:55 KST 2012 */