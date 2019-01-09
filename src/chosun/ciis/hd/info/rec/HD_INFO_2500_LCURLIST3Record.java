

package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2500_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String group_month;
	public String faml_emp_cnt;
	public String fmal_duty_dds;
	public String fmal_duty_tm;
	public String fmal_pay_amt;

	public HD_INFO_2500_LCURLIST3Record(){}

	public void setGroup_month(String group_month){
		this.group_month = group_month;
	}

	public void setFaml_emp_cnt(String faml_emp_cnt){
		this.faml_emp_cnt = faml_emp_cnt;
	}

	public void setFmal_duty_dds(String fmal_duty_dds){
		this.fmal_duty_dds = fmal_duty_dds;
	}

	public void setFmal_duty_tm(String fmal_duty_tm){
		this.fmal_duty_tm = fmal_duty_tm;
	}

	public void setFmal_pay_amt(String fmal_pay_amt){
		this.fmal_pay_amt = fmal_pay_amt;
	}

	public String getGroup_month(){
		return this.group_month;
	}

	public String getFaml_emp_cnt(){
		return this.faml_emp_cnt;
	}

	public String getFmal_duty_dds(){
		return this.fmal_duty_dds;
	}

	public String getFmal_duty_tm(){
		return this.fmal_duty_tm;
	}

	public String getFmal_pay_amt(){
		return this.fmal_pay_amt;
	}
}

/* 작성시간 : Wed Jan 05 16:17:17 KST 2011 */