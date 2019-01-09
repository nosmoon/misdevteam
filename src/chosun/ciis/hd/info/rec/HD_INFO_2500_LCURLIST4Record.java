

package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2500_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String group_month;
	public String emp_cnt;
	public String fix_labr_dds;
	public String no_duty_dds;
	public String paid_duty_dds;
	public String fix_labr_tm;
	public String paid_duty_tm;
	public String tot_pay_saly_sum;
	public String rgla_saly_sum;
	public String add_saly_sum;
	public String etc_saly_amt_sum;

	public HD_INFO_2500_LCURLIST4Record(){}

	public void setGroup_month(String group_month){
		this.group_month = group_month;
	}

	public void setEmp_cnt(String emp_cnt){
		this.emp_cnt = emp_cnt;
	}

	public void setFix_labr_dds(String fix_labr_dds){
		this.fix_labr_dds = fix_labr_dds;
	}

	public void setNo_duty_dds(String no_duty_dds){
		this.no_duty_dds = no_duty_dds;
	}

	public void setPaid_duty_dds(String paid_duty_dds){
		this.paid_duty_dds = paid_duty_dds;
	}

	public void setFix_labr_tm(String fix_labr_tm){
		this.fix_labr_tm = fix_labr_tm;
	}

	public void setPaid_duty_tm(String paid_duty_tm){
		this.paid_duty_tm = paid_duty_tm;
	}

	public void setTot_pay_saly_sum(String tot_pay_saly_sum){
		this.tot_pay_saly_sum = tot_pay_saly_sum;
	}

	public void setRgla_saly_sum(String rgla_saly_sum){
		this.rgla_saly_sum = rgla_saly_sum;
	}

	public void setAdd_saly_sum(String add_saly_sum){
		this.add_saly_sum = add_saly_sum;
	}

	public void setEtc_saly_amt_sum(String etc_saly_amt_sum){
		this.etc_saly_amt_sum = etc_saly_amt_sum;
	}

	public String getGroup_month(){
		return this.group_month;
	}

	public String getEmp_cnt(){
		return this.emp_cnt;
	}

	public String getFix_labr_dds(){
		return this.fix_labr_dds;
	}

	public String getNo_duty_dds(){
		return this.no_duty_dds;
	}

	public String getPaid_duty_dds(){
		return this.paid_duty_dds;
	}

	public String getFix_labr_tm(){
		return this.fix_labr_tm;
	}

	public String getPaid_duty_tm(){
		return this.paid_duty_tm;
	}

	public String getTot_pay_saly_sum(){
		return this.tot_pay_saly_sum;
	}

	public String getRgla_saly_sum(){
		return this.rgla_saly_sum;
	}

	public String getAdd_saly_sum(){
		return this.add_saly_sum;
	}

	public String getEtc_saly_amt_sum(){
		return this.etc_saly_amt_sum;
	}
}

/* 작성시간 : Wed Jan 05 16:17:17 KST 2011 */