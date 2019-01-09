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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_3000_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String car_no;
	public String repa_dt;
	public String repa_gag;
	public String repa_clsf;
	public String repa_cont;
	public String oil_qunt;
	public String repa_dtls_ptcr;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;
	public String occr_dt;
	public String seq;
	public String drvr_nm;
	public String cmpy_mang_nm;
	public String car_modl;

	public MT_ETCCAR_3000_LCURLIST1Record(){}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setRepa_dt(String repa_dt){
		this.repa_dt = repa_dt;
	}

	public void setRepa_gag(String repa_gag){
		this.repa_gag = repa_gag;
	}

	public void setRepa_clsf(String repa_clsf){
		this.repa_clsf = repa_clsf;
	}

	public void setRepa_cont(String repa_cont){
		this.repa_cont = repa_cont;
	}

	public void setOil_qunt(String oil_qunt){
		this.oil_qunt = oil_qunt;
	}

	public void setRepa_dtls_ptcr(String repa_dtls_ptcr){
		this.repa_dtls_ptcr = repa_dtls_ptcr;
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

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setCmpy_mang_nm(String cmpy_mang_nm){
		this.cmpy_mang_nm = cmpy_mang_nm;
	}

	public void setCar_modl(String car_modl){
		this.car_modl = car_modl;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getRepa_dt(){
		return this.repa_dt;
	}

	public String getRepa_gag(){
		return this.repa_gag;
	}

	public String getRepa_clsf(){
		return this.repa_clsf;
	}

	public String getRepa_cont(){
		return this.repa_cont;
	}

	public String getOil_qunt(){
		return this.oil_qunt;
	}

	public String getRepa_dtls_ptcr(){
		return this.repa_dtls_ptcr;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getCmpy_mang_nm(){
		return this.cmpy_mang_nm;
	}

	public String getCar_modl(){
		return this.car_modl;
	}
}

/* 작성시간 : Thu Aug 13 21:33:28 KST 2009 */