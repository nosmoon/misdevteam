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


public class AD_RES_1202_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String preng_occr_dt;
	public String preng_occr_seq;
	public String chrg_aprv;
	public String part_chf_aprv;
	public String team_chf_aprv;
	public String sect_cd;
	public String sect_seq;
	public String cm;
	public String dn;
	public String chro_clsf_nm;
	public String hndl_clsf_nm;
	public String dlco_nm;
	public String agn_nm;
	public String hndl_plac_nm;
	public String slcrg_pers_nm;
	public String uprc;
	public String advt_fee;
	public String advt_cont;
	public String pubc_slip_no;
	public String medi_cd;
	public String apr_advt_fee;
	public String mang_mortg_surp_amt;
	public String bonddebt_dlco_clsf;
	public String bonddebt_dlco_no;
	public String bonddebt_dlco_nm;
	public String bonddebt_basi_dt;

	public AD_RES_1202_LCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setPreng_occr_seq(String preng_occr_seq){
		this.preng_occr_seq = preng_occr_seq;
	}

	public void setChrg_aprv(String chrg_aprv){
		this.chrg_aprv = chrg_aprv;
	}

	public void setPart_chf_aprv(String part_chf_aprv){
		this.part_chf_aprv = part_chf_aprv;
	}

	public void setTeam_chf_aprv(String team_chf_aprv){
		this.team_chf_aprv = team_chf_aprv;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
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

	public void setHndl_clsf_nm(String hndl_clsf_nm){
		this.hndl_clsf_nm = hndl_clsf_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setHndl_plac_nm(String hndl_plac_nm){
		this.hndl_plac_nm = hndl_plac_nm;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setApr_advt_fee(String apr_advt_fee){
		this.apr_advt_fee = apr_advt_fee;
	}

	public void setMang_mortg_surp_amt(String mang_mortg_surp_amt){
		this.mang_mortg_surp_amt = mang_mortg_surp_amt;
	}

	public void setBonddebt_dlco_clsf(String bonddebt_dlco_clsf){
		this.bonddebt_dlco_clsf = bonddebt_dlco_clsf;
	}

	public void setBonddebt_dlco_no(String bonddebt_dlco_no){
		this.bonddebt_dlco_no = bonddebt_dlco_no;
	}

	public void setBonddebt_dlco_nm(String bonddebt_dlco_nm){
		this.bonddebt_dlco_nm = bonddebt_dlco_nm;
	}

	public void setBonddebt_basi_dt(String bonddebt_basi_dt){
		this.bonddebt_basi_dt = bonddebt_basi_dt;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getPreng_occr_seq(){
		return this.preng_occr_seq;
	}

	public String getChrg_aprv(){
		return this.chrg_aprv;
	}

	public String getPart_chf_aprv(){
		return this.part_chf_aprv;
	}

	public String getTeam_chf_aprv(){
		return this.team_chf_aprv;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
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

	public String getHndl_clsf_nm(){
		return this.hndl_clsf_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getHndl_plac_nm(){
		return this.hndl_plac_nm;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getApr_advt_fee(){
		return this.apr_advt_fee;
	}

	public String getMang_mortg_surp_amt(){
		return this.mang_mortg_surp_amt;
	}

	public String getBonddebt_dlco_clsf(){
		return this.bonddebt_dlco_clsf;
	}

	public String getBonddebt_dlco_no(){
		return this.bonddebt_dlco_no;
	}

	public String getBonddebt_dlco_nm(){
		return this.bonddebt_dlco_nm;
	}

	public String getBonddebt_basi_dt(){
		return this.bonddebt_basi_dt;
	}
}

/* 작성시간 : Fri May 26 20:11:44 KST 2017 */