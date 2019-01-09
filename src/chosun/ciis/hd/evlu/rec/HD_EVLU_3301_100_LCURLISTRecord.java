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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_3301_100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sel_chk;
	public String evlu_grp_nm;
	public String evlu_proc_stat_2tms;
	public String evlu_proc_stat_1tms;
	public String evlu_grp_cd;
	public String tot_cnt;
	public String not_chg_cnt;
	public String chg_cnt;

	public HD_EVLU_3301_100_LCURLISTRecord(){}

	public void setSel_chk(String sel_chk){
		this.sel_chk = sel_chk;
	}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setEvlu_proc_stat_2tms(String evlu_proc_stat_2tms){
		this.evlu_proc_stat_2tms = evlu_proc_stat_2tms;
	}

	public void setEvlu_proc_stat_1tms(String evlu_proc_stat_1tms){
		this.evlu_proc_stat_1tms = evlu_proc_stat_1tms;
	}

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setNot_chg_cnt(String not_chg_cnt){
		this.not_chg_cnt = not_chg_cnt;
	}

	public void setChg_cnt(String chg_cnt){
		this.chg_cnt = chg_cnt;
	}

	public String getSel_chk(){
		return this.sel_chk;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getEvlu_proc_stat_2tms(){
		return this.evlu_proc_stat_2tms;
	}

	public String getEvlu_proc_stat_1tms(){
		return this.evlu_proc_stat_1tms;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getNot_chg_cnt(){
		return this.not_chg_cnt;
	}

	public String getChg_cnt(){
		return this.chg_cnt;
	}
}

/* 작성시간 : Tue Sep 06 17:50:00 KST 2016 */