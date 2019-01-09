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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_3301_500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sel_chk;
	public String evlu_grp_nm;
	public String evlu_proc_stat_2tms;
	public String evlu_proc_stat_1tms;
	public String evlu_grp_cd;

	public HD_EVLU_3301_500_LCURLISTRecord(){}

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
}

/* 작성시간 : Wed Jun 20 16:55:56 KST 2018 */