

package chosun.ciis.hd.ddemp.rec;

import java.sql.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.ds.*;

/**
 * 
 */


public class HD_DDEMP_5000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_amt;
	public String emp_insr_fee;
	public String np_fee;
	public String hlth_insr_fee;
	public String hlth_insr_med_care_insr_fee;
	public String flnm;
	public String duty_yymm;

	public HD_DDEMP_5000_LCURLISTRecord(){}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setNp_fee(String np_fee){
		this.np_fee = np_fee;
	}

	public void setHlth_insr_fee(String hlth_insr_fee){
		this.hlth_insr_fee = hlth_insr_fee;
	}

	public void setHlth_insr_med_care_insr_fee(String hlth_insr_med_care_insr_fee){
		this.hlth_insr_med_care_insr_fee = hlth_insr_med_care_insr_fee;
	}
	
	public void setFlnm(String flnm){
		this.flnm = flnm;
	}
	
	public void setDuty_yymm(String duty_yymm){
		this.duty_yymm = duty_yymm;
	}
	

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getNp_fee(){
		return this.np_fee;
	}

	public String getHlth_insr_fee(){
		return this.hlth_insr_fee;
	}

	public String getHlth_insr_med_care_insr_fee(){
		return this.hlth_insr_med_care_insr_fee;
	}
	
	public String getFlnm(){
		return this.flnm;
	}
	
	public String getDuty_yymm(){
		return this.duty_yymm;
	}
	
}

/* 작성시간 : Tue Feb 08 19:38:00 KST 2011 */