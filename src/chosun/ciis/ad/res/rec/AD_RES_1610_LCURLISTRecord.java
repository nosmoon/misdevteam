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


package chosun.ciis.ad.res.rec;

import java.sql.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.ds.*;

/**
 * 
 */


public class AD_RES_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String preng_occr_dt;
	public String preng_occr_seq;
	public String pubc_side;
	public String cm;
	public String dn;
	public String chro_clsf_nm;
	public String dlco_nm;
	public String advt_cont;
	public String uprc;
	public String advt_fee;
	public String pubc_clsf_nm;
	public String hndl_clsf_nm;
	public String slcrg_nm;
	public String hndl_plac_nm;
	public String indt_clsf_nm;
	public String grp_cmpy_nm;
	public String cmpy_cd;
	public String medi_cd;
	public String chrg_aprv;
	public String team_chf_aprv;

	public AD_RES_1610_LCURLISTRecord(){}

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setPreng_occr_seq(String preng_occr_seq){
		this.preng_occr_seq = preng_occr_seq;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setChro_clsf_nm(String chro_clsf_nm){
		this.chro_clsf_nm = chro_clsf_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setPubc_clsf_nm(String pubc_clsf_nm){
		this.pubc_clsf_nm = pubc_clsf_nm;
	}

	public void setHndl_clsf_nm(String hndl_clsf_nm){
		this.hndl_clsf_nm = hndl_clsf_nm;
	}

	public void setSlcrg_nm(String slcrg_nm){
		this.slcrg_nm = slcrg_nm;
	}

	public void setHndl_plac_nm(String hndl_plac_nm){
		this.hndl_plac_nm = hndl_plac_nm;
	}

	public void setIndt_clsf_nm(String indt_clsf_nm){
		this.indt_clsf_nm = indt_clsf_nm;
	}

	public void setGrp_cmpy_nm(String grp_cmpy_nm){
		this.grp_cmpy_nm = grp_cmpy_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setChrg_aprv(String chrg_aprv){
		this.chrg_aprv = chrg_aprv;
	}

	public void setTeam_chf_aprv(String team_chf_aprv){
		this.team_chf_aprv = team_chf_aprv;
	}

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getPreng_occr_seq(){
		return this.preng_occr_seq;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getCm(){
		return this.cm;
	}

	public String getDn(){
		return this.dn;
	}

	public String getChro_clsf_nm(){
		return this.chro_clsf_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getPubc_clsf_nm(){
		return this.pubc_clsf_nm;
	}

	public String getHndl_clsf_nm(){
		return this.hndl_clsf_nm;
	}

	public String getSlcrg_nm(){
		return this.slcrg_nm;
	}

	public String getHndl_plac_nm(){
		return this.hndl_plac_nm;
	}

	public String getIndt_clsf_nm(){
		return this.indt_clsf_nm;
	}

	public String getGrp_cmpy_nm(){
		return this.grp_cmpy_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getChrg_aprv(){
		return this.chrg_aprv;
	}

	public String getTeam_chf_aprv(){
		return this.team_chf_aprv;
	}
}

/* 작성시간 : Fri Jul 14 14:28:11 KST 2017 */