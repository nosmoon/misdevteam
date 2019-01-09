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


public class HD_EVLU_3101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sel_chk;
	public String evlu_grp_nm;
	public String evlu_proc_stat_1tms;
	public String evlu_proc_stat_1tms_cd;
	public String evlu_grp_cd;
	public String grp_count;
	public String grp_1tms_y;
	public String grp_1tms_n;

	public HD_EVLU_3101_LCURLISTRecord(){}

	public void setSel_chk(String sel_chk){
		this.sel_chk = sel_chk;
	}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setEvlu_proc_stat_1tms(String evlu_proc_stat_1tms){
		this.evlu_proc_stat_1tms = evlu_proc_stat_1tms;
	}

	public void setEvlu_proc_stat_1tms_cd(String evlu_proc_stat_1tms_cd){
		this.evlu_proc_stat_1tms_cd = evlu_proc_stat_1tms_cd;
	}

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setGrp_count(String grp_count){
		this.grp_count = grp_count;
	}

	public void setGrp_1tms_y(String grp_1tms_y){
		this.grp_1tms_y = grp_1tms_y;
	}

	public void setGrp_1tms_n(String grp_1tms_n){
		this.grp_1tms_n = grp_1tms_n;
	}

	public String getSel_chk(){
		return this.sel_chk;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getEvlu_proc_stat_1tms(){
		return this.evlu_proc_stat_1tms;
	}

	public String getEvlu_proc_stat_1tms_cd(){
		return this.evlu_proc_stat_1tms_cd;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getGrp_count(){
		return this.grp_count;
	}

	public String getGrp_1tms_y(){
		return this.grp_1tms_y;
	}

	public String getGrp_1tms_n(){
		return this.grp_1tms_n;
	}
}

/* 작성시간 : Thu Sep 08 19:09:19 KST 2016 */