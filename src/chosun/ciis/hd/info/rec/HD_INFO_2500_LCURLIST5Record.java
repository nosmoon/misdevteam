

package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2500_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String group_month;
	public String imsi_emp_cnt;
	public String imsi_duty_dt;
	public String imsi_duty_tm;
	public String imsi_pay_amt;

	public HD_INFO_2500_LCURLIST5Record(){}

	public void setGroup_month(String group_month){
		this.group_month = group_month;
	}

	public void setImsi_emp_cnt(String imsi_emp_cnt){
		this.imsi_emp_cnt = imsi_emp_cnt;
	}

	public void setImsi_duty_dt(String imsi_duty_dt){
		this.imsi_duty_dt = imsi_duty_dt;
	}

	public void setImsi_duty_tm(String imsi_duty_tm){
		this.imsi_duty_tm = imsi_duty_tm;
	}

	public void setImsi_pay_amt(String imsi_pay_amt){
		this.imsi_pay_amt = imsi_pay_amt;
	}

	public String getGroup_month(){
		return this.group_month;
	}

	public String getImsi_emp_cnt(){
		return this.imsi_emp_cnt;
	}

	public String getImsi_duty_dt(){
		return this.imsi_duty_dt;
	}

	public String getImsi_duty_tm(){
		return this.imsi_duty_tm;
	}

	public String getImsi_pay_amt(){
		return this.imsi_pay_amt;
	}
}

/* 작성시간 : Wed Jan 05 16:17:17 KST 2011 */