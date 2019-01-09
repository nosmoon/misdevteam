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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_7310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String issu_day;
	public String issu_pcnt;
	public String ewh_qunt;
	public String ewh_amt;
	public String sub_ewh_amt;
	public String gita_ewh_amt;
	public String tot_amt;
	public String pcnt_amt;
	public String pubc_amt;
	public String pubc_pcnt_amt;
	public String pubc_uprc;
	public String diff_ewh_amt;
	public String diff_pcnt_amt;
	public String matl_rate;
	public String slip_qty;
	public String uprc;

	public MT_COMMATR_7310_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_day(String issu_day){
		this.issu_day = issu_day;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setEwh_qunt(String ewh_qunt){
		this.ewh_qunt = ewh_qunt;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setSub_ewh_amt(String sub_ewh_amt){
		this.sub_ewh_amt = sub_ewh_amt;
	}

	public void setGita_ewh_amt(String gita_ewh_amt){
		this.gita_ewh_amt = gita_ewh_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setPcnt_amt(String pcnt_amt){
		this.pcnt_amt = pcnt_amt;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setPubc_pcnt_amt(String pubc_pcnt_amt){
		this.pubc_pcnt_amt = pubc_pcnt_amt;
	}

	public void setPubc_uprc(String pubc_uprc){
		this.pubc_uprc = pubc_uprc;
	}

	public void setDiff_ewh_amt(String diff_ewh_amt){
		this.diff_ewh_amt = diff_ewh_amt;
	}

	public void setDiff_pcnt_amt(String diff_pcnt_amt){
		this.diff_pcnt_amt = diff_pcnt_amt;
	}

	public void setMatl_rate(String matl_rate){
		this.matl_rate = matl_rate;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_day(){
		return this.issu_day;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getEwh_qunt(){
		return this.ewh_qunt;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getSub_ewh_amt(){
		return this.sub_ewh_amt;
	}

	public String getGita_ewh_amt(){
		return this.gita_ewh_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getPcnt_amt(){
		return this.pcnt_amt;
	}
	
	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getPubc_pcnt_amt(){
		return this.pubc_pcnt_amt;
	}

	public String getPubc_uprc(){
		return this.pubc_uprc;
	}

	public String getDiff_ewh_amt(){
		return this.diff_ewh_amt;
	}

	public String getDiff_pcnt_amt(){
		return this.diff_pcnt_amt;
	}

	public String getMatl_rate(){
		return this.matl_rate;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}
	
	public String getUprf(){
		return this.uprc;
	}
}

/* 작성시간 : Fri Jan 23 11:40:45 KST 2015 */