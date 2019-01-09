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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_2224_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String title;
	public String roll;
	public String wgt;
	public String purc_uprc;
	public String amt;
	public String tot_jgroll;
	public String tot_jgwgt;
	public String tot_jgamt;
	public String inout_dt;
	public String iw_roll;
	public String s_wiibgoroll;
	public String s_wccgroll;
	public String iw_wt;
	public String s_wiibgowt;
	public String s_wccgwt;
	public String cut_err_tms;
	public String matr_cd;
	public String roll_wgt;
	public String grp;

	public MT_PAPINOUT_2224_LCURLISTRecord(){}

	public void setTitle(String title){
		this.title = title;
	}

	public void setRoll(String roll){
		this.roll = roll;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setTot_jgroll(String tot_jgroll){
		this.tot_jgroll = tot_jgroll;
	}

	public void setTot_jgwgt(String tot_jgwgt){
		this.tot_jgwgt = tot_jgwgt;
	}

	public void setTot_jgamt(String tot_jgamt){
		this.tot_jgamt = tot_jgamt;
	}

	public void setInout_dt(String inout_dt){
		this.inout_dt = inout_dt;
	}

	public void setIw_roll(String iw_roll){
		this.iw_roll = iw_roll;
	}

	public void setS_wiibgoroll(String s_wiibgoroll){
		this.s_wiibgoroll = s_wiibgoroll;
	}

	public void setS_wccgroll(String s_wccgroll){
		this.s_wccgroll = s_wccgroll;
	}

	public void setIw_wt(String iw_wt){
		this.iw_wt = iw_wt;
	}

	public void setS_wiibgowt(String s_wiibgowt){
		this.s_wiibgowt = s_wiibgowt;
	}

	public void setS_wccgwt(String s_wccgwt){
		this.s_wccgwt = s_wccgwt;
	}

	public void setCut_err_tms(String cut_err_tms){
		this.cut_err_tms = cut_err_tms;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public void setGrp(String grp){
		this.grp = grp;
	}

	public String getTitle(){
		return this.title;
	}

	public String getRoll(){
		return this.roll;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getTot_jgroll(){
		return this.tot_jgroll;
	}

	public String getTot_jgwgt(){
		return this.tot_jgwgt;
	}

	public String getTot_jgamt(){
		return this.tot_jgamt;
	}

	public String getInout_dt(){
		return this.inout_dt;
	}

	public String getIw_roll(){
		return this.iw_roll;
	}

	public String getS_wiibgoroll(){
		return this.s_wiibgoroll;
	}

	public String getS_wccgroll(){
		return this.s_wccgroll;
	}

	public String getIw_wt(){
		return this.iw_wt;
	}

	public String getS_wiibgowt(){
		return this.s_wiibgowt;
	}

	public String getS_wccgwt(){
		return this.s_wccgwt;
	}

	public String getCut_err_tms(){
		return this.cut_err_tms;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}

	public String getGrp(){
		return this.grp;
	}
}

/* 작성시간 : Sat Dec 05 16:35:09 KST 2009 */