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


public class MT_ETCPC_2200_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String mchn_mang_no;
	public String seq;
	public String addm_clsf;
	public String cmps_item_clsf;
	public String cmps_item_brand;
	public String cmps_item_spec;
	public String estb_dt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public MT_ETCPC_2200_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAddm_clsf(String addm_clsf){
		this.addm_clsf = addm_clsf;
	}

	public void setCmps_item_clsf(String cmps_item_clsf){
		this.cmps_item_clsf = cmps_item_clsf;
	}

	public void setCmps_item_brand(String cmps_item_brand){
		this.cmps_item_brand = cmps_item_brand;
	}

	public void setCmps_item_spec(String cmps_item_spec){
		this.cmps_item_spec = cmps_item_spec;
	}

	public void setEstb_dt(String estb_dt){
		this.estb_dt = estb_dt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAddm_clsf(){
		return this.addm_clsf;
	}

	public String getCmps_item_clsf(){
		return this.cmps_item_clsf;
	}

	public String getCmps_item_brand(){
		return this.cmps_item_brand;
	}

	public String getCmps_item_spec(){
		return this.cmps_item_spec;
	}

	public String getEstb_dt(){
		return this.estb_dt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Tue Mar 24 15:55:55 KST 2009 */