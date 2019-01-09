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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_3320_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String emp_cnt;
	public String tot_acc_cnt;
	public String tot_alvc_use_rate;
	public String tot_week_rate;
	public String tot_sunday_rate;

	public HD_VACA_3320_LCURLIST2Record(){}

	public void setEmp_cnt(String emp_cnt){
		this.emp_cnt = emp_cnt;
	}

	public void setTot_acc_cnt(String tot_acc_cnt){
		this.tot_acc_cnt = tot_acc_cnt;
	}

	public void setTot_alvc_use_rate(String tot_alvc_use_rate){
		this.tot_alvc_use_rate = tot_alvc_use_rate;
	}

	public void setTot_week_rate(String tot_week_rate){
		this.tot_week_rate = tot_week_rate;
	}

	public void setTot_sunday_rate(String tot_sunday_rate){
		this.tot_sunday_rate = tot_sunday_rate;
	}

	public String getEmp_cnt(){
		return this.emp_cnt;
	}

	public String getTot_acc_cnt(){
		return this.tot_acc_cnt;
	}

	public String getTot_alvc_use_rate(){
		return this.tot_alvc_use_rate;
	}

	public String getTot_week_rate(){
		return this.tot_week_rate;
	}

	public String getTot_sunday_rate(){
		return this.tot_sunday_rate;
	}
}

/* 작성시간 : Thu Aug 20 15:21:30 KST 2015 */