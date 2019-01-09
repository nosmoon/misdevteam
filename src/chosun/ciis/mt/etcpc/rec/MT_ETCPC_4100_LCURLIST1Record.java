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


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_4100_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String use_dept_nm;
	public String mchn_mang_no;
	public String use_pers_flnm;
	public String use_usag;
	public String mdnm;
	public String mchn_stat;
	public String kep_plac;
	public String buy_dt;
	public String pay_dt;
	public String sygg;
	public String wste_dd_pers;

	public MT_ETCPC_4100_LCURLIST1Record(){}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setUse_pers_flnm(String use_pers_flnm){
		this.use_pers_flnm = use_pers_flnm;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setMdnm(String mdnm){
		this.mdnm = mdnm;
	}

	public void setMchn_stat(String mchn_stat){
		this.mchn_stat = mchn_stat;
	}

	public void setKep_plac(String kep_plac){
		this.kep_plac = kep_plac;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setSygg(String sygg){
		this.sygg = sygg;
	}

	public void setWste_dd_pers(String wste_dd_pers){
		this.wste_dd_pers = wste_dd_pers;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getUse_pers_flnm(){
		return this.use_pers_flnm;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getMdnm(){
		return this.mdnm;
	}

	public String getMchn_stat(){
		return this.mchn_stat;
	}

	public String getKep_plac(){
		return this.kep_plac;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getSygg(){
		return this.sygg;
	}

	public String getWste_dd_pers(){
		return this.wste_dd_pers;
	}
}

/* 작성시간 : Mon Mar 30 17:11:24 KST 2009 */