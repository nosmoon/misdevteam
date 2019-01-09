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


package chosun.ciis.hd.duty.rec;

import java.sql.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;

/**
 * 
 */


public class HD_DUTY_1104_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String duty_dt;
	public String prsnt_tm;
	public String finish_dd_clsf;
	public String finish_tm;
	public String proc_stat;
	public String clndr_wkdy;

	public HD_DUTY_1104_LCURLISTRecord(){}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setClndr_wkdy(String clndr_wkdy){
		this.clndr_wkdy = clndr_wkdy;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getClndr_wkdy(){
		return this.clndr_wkdy;
	}
}

/* 작성시간 : Mon Mar 23 19:32:46 KST 2009 */