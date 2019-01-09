/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_2410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String send_clos_grp_clsf;
	public String clos_tms;
	public String clos_dt;
	public String clos_pers;
	public String clos_yn;
	public String setl_stat_nm;
	public String remk;

	public SE_QTY_2410_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSend_clos_grp_clsf(String send_clos_grp_clsf){
		this.send_clos_grp_clsf = send_clos_grp_clsf;
	}

	public void setClos_tms(String clos_tms){
		this.clos_tms = clos_tms;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setClos_pers(String clos_pers){
		this.clos_pers = clos_pers;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setSetl_stat_nm(String setl_stat_nm){
		this.setl_stat_nm = setl_stat_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSend_clos_grp_clsf(){
		return this.send_clos_grp_clsf;
	}

	public String getClos_tms(){
		return this.clos_tms;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getClos_pers(){
		return this.clos_pers;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getSetl_stat_nm(){
		return this.setl_stat_nm;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Mar 17 19:51:44 KST 2009 */