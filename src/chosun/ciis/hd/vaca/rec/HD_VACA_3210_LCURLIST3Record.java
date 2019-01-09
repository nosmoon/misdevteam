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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_3210_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String emp_cnt;
	public String tot_week_rate;
	public String tot_sunday_rate;

	public HD_VACA_3210_LCURLIST3Record(){}

	public void setEmp_cnt(String emp_cnt){
		this.emp_cnt = emp_cnt;
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

	public String getTot_week_rate(){
		return this.tot_week_rate;
	}

	public String getTot_sunday_rate(){
		return this.tot_sunday_rate;
	}
}

/* 작성시간 : Wed Sep 02 09:51:56 KST 2015 */