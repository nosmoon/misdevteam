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


public class MT_ETCPC_2000_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String mchn_mang_no;
	public String modl_mang_no;
	public String modl_nm;
	public String serl_no;
	public String buy_dt;
	public String aset_no;
	public String use_pers;
	public String use_pers_flnm;
	public String use_deptcd;
	public String use_dept_nm;
	public String use_usag;
	public String pay_kind;
	public String pay_kind_nm;
	public String pay_dt;
	public String mchn_stat;
	public String mchn_stat_nm;
	public String kep_plac;
	public String kep_plac_nm;
	public String rsrt_dt;
	public String wste_dd_pers;
	public String remk;
	public String acpt_dt;
	public String monitor_mang_no;
	public String repa_item_yn;
	public String wste_obj_item_yn;
	public String lend_item_rsrt_plan_dt;
	public String lend_item_yn;
	public String ipaddr;

	public MT_ETCPC_2000_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setModl_nm(String modl_nm){
		this.modl_nm = modl_nm;
	}

	public void setSerl_no(String serl_no){
		this.serl_no = serl_no;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setUse_pers_flnm(String use_pers_flnm){
		this.use_pers_flnm = use_pers_flnm;
	}

	public void setUse_deptcd(String use_deptcd){
		this.use_deptcd = use_deptcd;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setPay_kind(String pay_kind){
		this.pay_kind = pay_kind;
	}

	public void setPay_kind_nm(String pay_kind_nm){
		this.pay_kind_nm = pay_kind_nm;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setMchn_stat(String mchn_stat){
		this.mchn_stat = mchn_stat;
	}

	public void setMchn_stat_nm(String mchn_stat_nm){
		this.mchn_stat_nm = mchn_stat_nm;
	}

	public void setKep_plac(String kep_plac){
		this.kep_plac = kep_plac;
	}

	public void setKep_plac_nm(String kep_plac_nm){
		this.kep_plac_nm = kep_plac_nm;
	}

	public void setRsrt_dt(String rsrt_dt){
		this.rsrt_dt = rsrt_dt;
	}

	public void setWste_dd_pers(String wste_dd_pers){
		this.wste_dd_pers = wste_dd_pers;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAcpt_dt(String acpt_dt){
		this.acpt_dt = acpt_dt;
	}

	public void setMonitor_mang_no(String monitor_mang_no){
		this.monitor_mang_no = monitor_mang_no;
	}

	public void setRepa_item_yn(String repa_item_yn){
		this.repa_item_yn = repa_item_yn;
	}

	public void setWste_obj_item_yn(String wste_obj_item_yn){
		this.wste_obj_item_yn = wste_obj_item_yn;
	}

	public void setLend_item_rsrt_plan_dt(String lend_item_rsrt_plan_dt){
		this.lend_item_rsrt_plan_dt = lend_item_rsrt_plan_dt;
	}

	public void setLend_item_yn(String lend_item_yn){
		this.lend_item_yn = lend_item_yn;
	}

	public void setIpaddr(String ipaddr){
		this.ipaddr = ipaddr;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getModl_nm(){
		return this.modl_nm;
	}

	public String getSerl_no(){
		return this.serl_no;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getUse_pers_flnm(){
		return this.use_pers_flnm;
	}

	public String getUse_deptcd(){
		return this.use_deptcd;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getPay_kind(){
		return this.pay_kind;
	}

	public String getPay_kind_nm(){
		return this.pay_kind_nm;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getMchn_stat(){
		return this.mchn_stat;
	}

	public String getMchn_stat_nm(){
		return this.mchn_stat_nm;
	}

	public String getKep_plac(){
		return this.kep_plac;
	}

	public String getKep_plac_nm(){
		return this.kep_plac_nm;
	}

	public String getRsrt_dt(){
		return this.rsrt_dt;
	}

	public String getWste_dd_pers(){
		return this.wste_dd_pers;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAcpt_dt(){
		return this.acpt_dt;
	}

	public String getMonitor_mang_no(){
		return this.monitor_mang_no;
	}

	public String getRepa_item_yn(){
		return this.repa_item_yn;
	}

	public String getWste_obj_item_yn(){
		return this.wste_obj_item_yn;
	}

	public String getLend_item_rsrt_plan_dt(){
		return this.lend_item_rsrt_plan_dt;
	}

	public String getLend_item_yn(){
		return this.lend_item_yn;
	}

	public String getIpaddr(){
		return this.ipaddr;
	}
}

/* 작성시간 : Wed Jul 01 20:19:46 KST 2009 */