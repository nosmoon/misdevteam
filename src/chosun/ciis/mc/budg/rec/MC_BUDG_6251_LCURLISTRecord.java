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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6251_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String week;
	public String pubc_dt_day;
	public String tot_pubc1;
	public String loss_pubc1;
	public String tot_pubc2;
	public String loss_pubc2;
	public String tot_pubc3;
	public String loss_pubc3;
	public String tot_pubc4;
	public String loss_pubc4;
	public String tot_pubc5;

	public MC_BUDG_6251_LCURLISTRecord(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setWeek(String week){
		this.week = week;
	}

	public void setPubc_dt_day(String pubc_dt_day){
		this.pubc_dt_day = pubc_dt_day;
	}

	public void setTot_pubc1(String tot_pubc1){
		this.tot_pubc1 = tot_pubc1;
	}

	public void setLoss_pubc1(String loss_pubc1){
		this.loss_pubc1 = loss_pubc1;
	}

	public void setTot_pubc2(String tot_pubc2){
		this.tot_pubc2 = tot_pubc2;
	}

	public void setLoss_pubc2(String loss_pubc2){
		this.loss_pubc2 = loss_pubc2;
	}

	public void setTot_pubc3(String tot_pubc3){
		this.tot_pubc3 = tot_pubc3;
	}

	public void setLoss_pubc3(String loss_pubc3){
		this.loss_pubc3 = loss_pubc3;
	}

	public void setTot_pubc4(String tot_pubc4){
		this.tot_pubc4 = tot_pubc4;
	}

	public void setLoss_pubc4(String loss_pubc4){
		this.loss_pubc4 = loss_pubc4;
	}

	public void setTot_pubc5(String tot_pubc5){
		this.tot_pubc5 = tot_pubc5;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getWeek(){
		return this.week;
	}

	public String getPubc_dt_day(){
		return this.pubc_dt_day;
	}

	public String getTot_pubc1(){
		return this.tot_pubc1;
	}

	public String getLoss_pubc1(){
		return this.loss_pubc1;
	}

	public String getTot_pubc2(){
		return this.tot_pubc2;
	}

	public String getLoss_pubc2(){
		return this.loss_pubc2;
	}

	public String getTot_pubc3(){
		return this.tot_pubc3;
	}

	public String getLoss_pubc3(){
		return this.loss_pubc3;
	}

	public String getTot_pubc4(){
		return this.tot_pubc4;
	}

	public String getLoss_pubc4(){
		return this.loss_pubc4;
	}

	public String getTot_pubc5(){
		return this.tot_pubc5;
	}
}

/* 작성시간 : Fri Jul 10 13:27:35 KST 2009 */