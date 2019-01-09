/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_4630_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String net_sale_amt;
	public String amt1;
	public String amt2;
	public String sub_tot_amt;
	public String amt3;
	public String tot_amt;
	public String amt_rate;
	public String amt4;

	public SE_RCP_4630_LCURLISTRecord(){}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setSub_tot_amt(String sub_tot_amt){
		this.sub_tot_amt = sub_tot_amt;
	}

	public void setAmt3(String amt3){
		this.amt3 = amt3;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setAmt_rate(String amt_rate){
		this.amt_rate = amt_rate;
	}

	public void setAmt4(String amt4){
		this.amt4 = amt4;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getSub_tot_amt(){
		return this.sub_tot_amt;
	}

	public String getAmt3(){
		return this.amt3;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getAmt_rate(){
		return this.amt_rate;
	}

	public String getAmt4(){
		return this.amt4;
	}
}

/* 작성시간 : Thu Jul 06 15:29:49 KST 2017 */