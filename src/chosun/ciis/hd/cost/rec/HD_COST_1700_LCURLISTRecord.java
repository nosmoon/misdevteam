/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.cost.rec;

import java.sql.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.ds.*;

/**
 * 
 */


public class HD_COST_1700_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	
	public String emp_no;
	public String flnm;
	public String dept_nm;
	public String decid_yymm;
	public String deal_dt;
	public String card_type;
	public String vaca_frdt;
	public String vaca_todt;
	public String vaca_dds;
	public String vaca_clsf;

	public HD_COST_1700_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}
	
	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDecid_yymm(String decid_yymm){
		this.decid_yymm = decid_yymm;
	}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setCard_type(String card_type){
		this.card_type = card_type;
	}

	public void setVaca_frdt(String vaca_frdt){
		this.vaca_frdt = vaca_frdt;
	}
	
	public void setVaca_todt(String vaca_todt){
		this.vaca_todt = vaca_todt;
	}
	
	public void setVaca_dds(String vaca_dds){
		this.vaca_dds = vaca_dds;
	}
	
	public void setVaca_clsf(String vaca_clsf){
		this.vaca_clsf = vaca_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}
	
	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDecid_yymm(){
		return this.decid_yymm;
	}

	public String getDeal_dt(){
		return this.deal_dt;
	}

	public String getCard_type(){
		return this.card_type;
	}
	
	public String getVaca_frdt(){
		return this.vaca_frdt;
	}
	
	public String getVaca_todt(){
		return this.vaca_todt;
	}
	
	public String getVaca_dds(){
		return this.vaca_dds;
	}
	
	public String getVaca_clsf(){
		return this.vaca_clsf;
	}

}

/* 작성시간 : Fri Oct 14 16:32:57 KST 2016 */