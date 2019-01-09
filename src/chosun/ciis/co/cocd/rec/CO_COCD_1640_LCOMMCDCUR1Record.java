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


package chosun.ciis.co.cocd.rec;

import java.sql.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;

/**
 * 
 */


public class CO_COCD_1640_LCOMMCDCUR1Record extends java.lang.Object implements java.io.Serializable{

	public String pgm_id;
	public String pgm_nm;
	public String pgm_onm;
	public String pgm_typ;
	public String brd_run;
	public String tot_cnt;
	public String pgm_clf1;
	public String pgm_clf2;
	public String jenr_clf;
	public String target;
	public String delib_grd;
	public String info_grd;
	public String frgn_clf;
	public String game_clf;
	public String main_role;
	public String supp_role;
	public String director;
	public String mc_nm;
	public String award_info;
	public String prd_cntry1;
	public String prd_cntry2;
	public String prd_co_cd;
	public String prd_co_nm;
	public String prd_ym;
	public String flash_yn;
	public String emerg_yn;
	public String news_yn;
	public String pilot_yn;
	public String pgm_info;
	public String pgm_icon;
	public String regr;
	public String reg_dt;
	public String modr;
	public String mod_dt;
	public String del_yn;
	public String delr;
	public String del_dt;
	public String dvs_yn;
	public String news_group;
	public String online_service_yn;

	public CO_COCD_1640_LCOMMCDCUR1Record(){}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setPgm_nm(String pgm_nm){
		this.pgm_nm = pgm_nm;
	}

	public void setPgm_onm(String pgm_onm){
		this.pgm_onm = pgm_onm;
	}

	public void setPgm_typ(String pgm_typ){
		this.pgm_typ = pgm_typ;
	}

	public void setBrd_run(String brd_run){
		this.brd_run = brd_run;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setPgm_clf1(String pgm_clf1){
		this.pgm_clf1 = pgm_clf1;
	}

	public void setPgm_clf2(String pgm_clf2){
		this.pgm_clf2 = pgm_clf2;
	}

	public void setJenr_clf(String jenr_clf){
		this.jenr_clf = jenr_clf;
	}

	public void setTarget(String target){
		this.target = target;
	}

	public void setDelib_grd(String delib_grd){
		this.delib_grd = delib_grd;
	}

	public void setInfo_grd(String info_grd){
		this.info_grd = info_grd;
	}

	public void setFrgn_clf(String frgn_clf){
		this.frgn_clf = frgn_clf;
	}

	public void setGame_clf(String game_clf){
		this.game_clf = game_clf;
	}

	public void setMain_role(String main_role){
		this.main_role = main_role;
	}

	public void setSupp_role(String supp_role){
		this.supp_role = supp_role;
	}

	public void setDirector(String director){
		this.director = director;
	}

	public void setMc_nm(String mc_nm){
		this.mc_nm = mc_nm;
	}

	public void setAward_info(String award_info){
		this.award_info = award_info;
	}

	public void setPrd_cntry1(String prd_cntry1){
		this.prd_cntry1 = prd_cntry1;
	}

	public void setPrd_cntry2(String prd_cntry2){
		this.prd_cntry2 = prd_cntry2;
	}

	public void setPrd_co_cd(String prd_co_cd){
		this.prd_co_cd = prd_co_cd;
	}

	public void setPrd_co_nm(String prd_co_nm){
		this.prd_co_nm = prd_co_nm;
	}

	public void setPrd_ym(String prd_ym){
		this.prd_ym = prd_ym;
	}

	public void setFlash_yn(String flash_yn){
		this.flash_yn = flash_yn;
	}

	public void setEmerg_yn(String emerg_yn){
		this.emerg_yn = emerg_yn;
	}

	public void setNews_yn(String news_yn){
		this.news_yn = news_yn;
	}

	public void setPilot_yn(String pilot_yn){
		this.pilot_yn = pilot_yn;
	}

	public void setPgm_info(String pgm_info){
		this.pgm_info = pgm_info;
	}

	public void setPgm_icon(String pgm_icon){
		this.pgm_icon = pgm_icon;
	}

	public void setRegr(String regr){
		this.regr = regr;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setModr(String modr){
		this.modr = modr;
	}

	public void setMod_dt(String mod_dt){
		this.mod_dt = mod_dt;
	}

	public void setDel_yn(String del_yn){
		this.del_yn = del_yn;
	}

	public void setDelr(String delr){
		this.delr = delr;
	}

	public void setDel_dt(String del_dt){
		this.del_dt = del_dt;
	}

	public void setDvs_yn(String dvs_yn){
		this.dvs_yn = dvs_yn;
	}

	public void setNews_group(String news_group){
		this.news_group = news_group;
	}

	public void setOnline_service_yn(String online_service_yn){
		this.online_service_yn = online_service_yn;
	}

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getPgm_nm(){
		return this.pgm_nm;
	}

	public String getPgm_onm(){
		return this.pgm_onm;
	}

	public String getPgm_typ(){
		return this.pgm_typ;
	}

	public String getBrd_run(){
		return this.brd_run;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getPgm_clf1(){
		return this.pgm_clf1;
	}

	public String getPgm_clf2(){
		return this.pgm_clf2;
	}

	public String getJenr_clf(){
		return this.jenr_clf;
	}

	public String getTarget(){
		return this.target;
	}

	public String getDelib_grd(){
		return this.delib_grd;
	}

	public String getInfo_grd(){
		return this.info_grd;
	}

	public String getFrgn_clf(){
		return this.frgn_clf;
	}

	public String getGame_clf(){
		return this.game_clf;
	}

	public String getMain_role(){
		return this.main_role;
	}

	public String getSupp_role(){
		return this.supp_role;
	}

	public String getDirector(){
		return this.director;
	}

	public String getMc_nm(){
		return this.mc_nm;
	}

	public String getAward_info(){
		return this.award_info;
	}

	public String getPrd_cntry1(){
		return this.prd_cntry1;
	}

	public String getPrd_cntry2(){
		return this.prd_cntry2;
	}

	public String getPrd_co_cd(){
		return this.prd_co_cd;
	}

	public String getPrd_co_nm(){
		return this.prd_co_nm;
	}

	public String getPrd_ym(){
		return this.prd_ym;
	}

	public String getFlash_yn(){
		return this.flash_yn;
	}

	public String getEmerg_yn(){
		return this.emerg_yn;
	}

	public String getNews_yn(){
		return this.news_yn;
	}

	public String getPilot_yn(){
		return this.pilot_yn;
	}

	public String getPgm_info(){
		return this.pgm_info;
	}

	public String getPgm_icon(){
		return this.pgm_icon;
	}

	public String getRegr(){
		return this.regr;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getModr(){
		return this.modr;
	}

	public String getMod_dt(){
		return this.mod_dt;
	}

	public String getDel_yn(){
		return this.del_yn;
	}

	public String getDelr(){
		return this.delr;
	}

	public String getDel_dt(){
		return this.del_dt;
	}

	public String getDvs_yn(){
		return this.dvs_yn;
	}

	public String getNews_group(){
		return this.news_group;
	}

	public String getOnline_service_yn(){
		return this.online_service_yn;
	}
}

/* 작성시간 : Tue Jan 17 11:16:06 KST 2012 */