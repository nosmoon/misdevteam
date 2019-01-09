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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1020_SCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String a_decid_pre_seq;
	public String a_decid_pers;
	public String a_decid_pers_nm;
	public String a_decid_pers_dty_cd;
	public String a_decid_pers_dty_cd_nm;
	public String a_decid_yn;
	public String a_proc_dt;
	public String a_ordr_matt;

	public IS_BUS_1020_SCURLIST_ARecord(){}

	public void setA_decid_pre_seq(String a_decid_pre_seq){
		this.a_decid_pre_seq = a_decid_pre_seq;
	}

	public void setA_decid_pers(String a_decid_pers){
		this.a_decid_pers = a_decid_pers;
	}

	public void setA_decid_pers_nm(String a_decid_pers_nm){
		this.a_decid_pers_nm = a_decid_pers_nm;
	}

	public void setA_decid_pers_dty_cd(String a_decid_pers_dty_cd){
		this.a_decid_pers_dty_cd = a_decid_pers_dty_cd;
	}

	public void setA_decid_pers_dty_cd_nm(String a_decid_pers_dty_cd_nm){
		this.a_decid_pers_dty_cd_nm = a_decid_pers_dty_cd_nm;
	}

	public void setA_decid_yn(String a_decid_yn){
		this.a_decid_yn = a_decid_yn;
	}

	public void setA_proc_dt(String a_proc_dt){
		this.a_proc_dt = a_proc_dt;
	}

	public void setA_ordr_matt(String a_ordr_matt){
		this.a_ordr_matt = a_ordr_matt;
	}

	public String getA_decid_pre_seq(){
		return this.a_decid_pre_seq;
	}

	public String getA_decid_pers(){
		return this.a_decid_pers;
	}

	public String getA_decid_pers_nm(){
		return this.a_decid_pers_nm;
	}

	public String getA_decid_pers_dty_cd(){
		return this.a_decid_pers_dty_cd;
	}

	public String getA_decid_pers_dty_cd_nm(){
		return this.a_decid_pers_dty_cd_nm;
	}

	public String getA_decid_yn(){
		return this.a_decid_yn;
	}

	public String getA_proc_dt(){
		return this.a_proc_dt;
	}

	public String getA_ordr_matt(){
		return this.a_ordr_matt;
	}
}

/* 작성시간 : Thu Jun 07 19:41:22 KST 2012 */