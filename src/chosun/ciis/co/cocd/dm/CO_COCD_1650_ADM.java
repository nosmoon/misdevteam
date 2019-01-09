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


package chosun.ciis.co.cocd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.ds.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1650_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
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
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public CO_COCD_1650_ADM(){}
	public CO_COCD_1650_ADM(String cmpy_cd, String pgm_id, String pgm_nm, String pgm_onm, String pgm_typ, String brd_run, String tot_cnt, String pgm_clf1, String pgm_clf2, String jenr_clf, String target, String delib_grd, String info_grd, String frgn_clf, String game_clf, String main_role, String supp_role, String director, String mc_nm, String award_info, String prd_cntry1, String prd_cntry2, String prd_co_cd, String prd_co_nm, String prd_ym, String flash_yn, String emerg_yn, String news_yn, String pilot_yn, String pgm_info, String pgm_icon, String regr, String reg_dt, String modr, String mod_dt, String del_yn, String delr, String del_dt, String dvs_yn, String news_group, String online_service_yn, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.pgm_id = pgm_id;
		this.pgm_nm = pgm_nm;
		this.pgm_onm = pgm_onm;
		this.pgm_typ = pgm_typ;
		this.brd_run = brd_run;
		this.tot_cnt = tot_cnt;
		this.pgm_clf1 = pgm_clf1;
		this.pgm_clf2 = pgm_clf2;
		this.jenr_clf = jenr_clf;
		this.target = target;
		this.delib_grd = delib_grd;
		this.info_grd = info_grd;
		this.frgn_clf = frgn_clf;
		this.game_clf = game_clf;
		this.main_role = main_role;
		this.supp_role = supp_role;
		this.director = director;
		this.mc_nm = mc_nm;
		this.award_info = award_info;
		this.prd_cntry1 = prd_cntry1;
		this.prd_cntry2 = prd_cntry2;
		this.prd_co_cd = prd_co_cd;
		this.prd_co_nm = prd_co_nm;
		this.prd_ym = prd_ym;
		this.flash_yn = flash_yn;
		this.emerg_yn = emerg_yn;
		this.news_yn = news_yn;
		this.pilot_yn = pilot_yn;
		this.pgm_info = pgm_info;
		this.pgm_icon = pgm_icon;
		this.regr = regr;
		this.reg_dt = reg_dt;
		this.modr = modr;
		this.mod_dt = mod_dt;
		this.del_yn = del_yn;
		this.delr = delr;
		this.del_dt = del_dt;
		this.dvs_yn = dvs_yn;
		this.news_group = news_group;
		this.online_service_yn = online_service_yn;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

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

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_COCD_1650_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_COCD_1650_ADM dm = (CO_COCD_1650_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pgm_id);
		cstmt.setString(5, dm.pgm_nm);
		cstmt.setString(6, dm.pgm_onm);
		cstmt.setString(7, dm.pgm_typ);
		cstmt.setString(8, dm.brd_run);
		cstmt.setString(9, dm.tot_cnt);
		cstmt.setString(10, dm.pgm_clf1);
		cstmt.setString(11, dm.pgm_clf2);
		cstmt.setString(12, dm.jenr_clf);
		cstmt.setString(13, dm.target);
		cstmt.setString(14, dm.delib_grd);
		cstmt.setString(15, dm.info_grd);
		cstmt.setString(16, dm.frgn_clf);
		cstmt.setString(17, dm.game_clf);
		cstmt.setString(18, dm.main_role);
		cstmt.setString(19, dm.supp_role);
		cstmt.setString(20, dm.director);
		cstmt.setString(21, dm.mc_nm);
		cstmt.setString(22, dm.award_info);
		cstmt.setString(23, dm.prd_cntry1);
		cstmt.setString(24, dm.prd_cntry2);
		cstmt.setString(25, dm.prd_co_cd);
		cstmt.setString(26, dm.prd_co_nm);
		cstmt.setString(27, dm.prd_ym);
		cstmt.setString(28, dm.flash_yn);
		cstmt.setString(29, dm.emerg_yn);
		cstmt.setString(30, dm.news_yn);
		cstmt.setString(31, dm.pilot_yn);
		cstmt.setString(32, dm.pgm_info);
		cstmt.setString(33, dm.pgm_icon);
		cstmt.setString(34, dm.regr);
		cstmt.setString(35, dm.reg_dt);
		cstmt.setString(36, dm.modr);
		cstmt.setString(37, dm.mod_dt);
		cstmt.setString(38, dm.del_yn);
		cstmt.setString(39, dm.delr);
		cstmt.setString(40, dm.del_dt);
		cstmt.setString(41, dm.dvs_yn);
		cstmt.setString(42, dm.news_group);
		cstmt.setString(43, dm.online_service_yn);
		cstmt.setString(44, dm.incmg_pers_ipaddr);
		cstmt.setString(45, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.cocd.ds.CO_COCD_1650_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pgm_id = [" + getPgm_id() + "]");
		System.out.println("pgm_nm = [" + getPgm_nm() + "]");
		System.out.println("pgm_onm = [" + getPgm_onm() + "]");
		System.out.println("pgm_typ = [" + getPgm_typ() + "]");
		System.out.println("brd_run = [" + getBrd_run() + "]");
		System.out.println("tot_cnt = [" + getTot_cnt() + "]");
		System.out.println("pgm_clf1 = [" + getPgm_clf1() + "]");
		System.out.println("pgm_clf2 = [" + getPgm_clf2() + "]");
		System.out.println("jenr_clf = [" + getJenr_clf() + "]");
		System.out.println("target = [" + getTarget() + "]");
		System.out.println("delib_grd = [" + getDelib_grd() + "]");
		System.out.println("info_grd = [" + getInfo_grd() + "]");
		System.out.println("frgn_clf = [" + getFrgn_clf() + "]");
		System.out.println("game_clf = [" + getGame_clf() + "]");
		System.out.println("main_role = [" + getMain_role() + "]");
		System.out.println("supp_role = [" + getSupp_role() + "]");
		System.out.println("director = [" + getDirector() + "]");
		System.out.println("mc_nm = [" + getMc_nm() + "]");
		System.out.println("award_info = [" + getAward_info() + "]");
		System.out.println("prd_cntry1 = [" + getPrd_cntry1() + "]");
		System.out.println("prd_cntry2 = [" + getPrd_cntry2() + "]");
		System.out.println("prd_co_cd = [" + getPrd_co_cd() + "]");
		System.out.println("prd_co_nm = [" + getPrd_co_nm() + "]");
		System.out.println("prd_ym = [" + getPrd_ym() + "]");
		System.out.println("flash_yn = [" + getFlash_yn() + "]");
		System.out.println("emerg_yn = [" + getEmerg_yn() + "]");
		System.out.println("news_yn = [" + getNews_yn() + "]");
		System.out.println("pilot_yn = [" + getPilot_yn() + "]");
		System.out.println("pgm_info = [" + getPgm_info() + "]");
		System.out.println("pgm_icon = [" + getPgm_icon() + "]");
		System.out.println("regr = [" + getRegr() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("modr = [" + getModr() + "]");
		System.out.println("mod_dt = [" + getMod_dt() + "]");
		System.out.println("del_yn = [" + getDel_yn() + "]");
		System.out.println("delr = [" + getDelr() + "]");
		System.out.println("del_dt = [" + getDel_dt() + "]");
		System.out.println("dvs_yn = [" + getDvs_yn() + "]");
		System.out.println("news_group = [" + getNews_group() + "]");
		System.out.println("online_service_yn = [" + getOnline_service_yn() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String pgm_id = req.getParameter("pgm_id");
if( pgm_id == null){
	System.out.println(this.toString+" : pgm_id is null" );
}else{
	System.out.println(this.toString+" : pgm_id is "+pgm_id );
}
String pgm_nm = req.getParameter("pgm_nm");
if( pgm_nm == null){
	System.out.println(this.toString+" : pgm_nm is null" );
}else{
	System.out.println(this.toString+" : pgm_nm is "+pgm_nm );
}
String pgm_onm = req.getParameter("pgm_onm");
if( pgm_onm == null){
	System.out.println(this.toString+" : pgm_onm is null" );
}else{
	System.out.println(this.toString+" : pgm_onm is "+pgm_onm );
}
String pgm_typ = req.getParameter("pgm_typ");
if( pgm_typ == null){
	System.out.println(this.toString+" : pgm_typ is null" );
}else{
	System.out.println(this.toString+" : pgm_typ is "+pgm_typ );
}
String brd_run = req.getParameter("brd_run");
if( brd_run == null){
	System.out.println(this.toString+" : brd_run is null" );
}else{
	System.out.println(this.toString+" : brd_run is "+brd_run );
}
String tot_cnt = req.getParameter("tot_cnt");
if( tot_cnt == null){
	System.out.println(this.toString+" : tot_cnt is null" );
}else{
	System.out.println(this.toString+" : tot_cnt is "+tot_cnt );
}
String pgm_clf1 = req.getParameter("pgm_clf1");
if( pgm_clf1 == null){
	System.out.println(this.toString+" : pgm_clf1 is null" );
}else{
	System.out.println(this.toString+" : pgm_clf1 is "+pgm_clf1 );
}
String pgm_clf2 = req.getParameter("pgm_clf2");
if( pgm_clf2 == null){
	System.out.println(this.toString+" : pgm_clf2 is null" );
}else{
	System.out.println(this.toString+" : pgm_clf2 is "+pgm_clf2 );
}
String jenr_clf = req.getParameter("jenr_clf");
if( jenr_clf == null){
	System.out.println(this.toString+" : jenr_clf is null" );
}else{
	System.out.println(this.toString+" : jenr_clf is "+jenr_clf );
}
String target = req.getParameter("target");
if( target == null){
	System.out.println(this.toString+" : target is null" );
}else{
	System.out.println(this.toString+" : target is "+target );
}
String delib_grd = req.getParameter("delib_grd");
if( delib_grd == null){
	System.out.println(this.toString+" : delib_grd is null" );
}else{
	System.out.println(this.toString+" : delib_grd is "+delib_grd );
}
String info_grd = req.getParameter("info_grd");
if( info_grd == null){
	System.out.println(this.toString+" : info_grd is null" );
}else{
	System.out.println(this.toString+" : info_grd is "+info_grd );
}
String frgn_clf = req.getParameter("frgn_clf");
if( frgn_clf == null){
	System.out.println(this.toString+" : frgn_clf is null" );
}else{
	System.out.println(this.toString+" : frgn_clf is "+frgn_clf );
}
String game_clf = req.getParameter("game_clf");
if( game_clf == null){
	System.out.println(this.toString+" : game_clf is null" );
}else{
	System.out.println(this.toString+" : game_clf is "+game_clf );
}
String main_role = req.getParameter("main_role");
if( main_role == null){
	System.out.println(this.toString+" : main_role is null" );
}else{
	System.out.println(this.toString+" : main_role is "+main_role );
}
String supp_role = req.getParameter("supp_role");
if( supp_role == null){
	System.out.println(this.toString+" : supp_role is null" );
}else{
	System.out.println(this.toString+" : supp_role is "+supp_role );
}
String director = req.getParameter("director");
if( director == null){
	System.out.println(this.toString+" : director is null" );
}else{
	System.out.println(this.toString+" : director is "+director );
}
String mc_nm = req.getParameter("mc_nm");
if( mc_nm == null){
	System.out.println(this.toString+" : mc_nm is null" );
}else{
	System.out.println(this.toString+" : mc_nm is "+mc_nm );
}
String award_info = req.getParameter("award_info");
if( award_info == null){
	System.out.println(this.toString+" : award_info is null" );
}else{
	System.out.println(this.toString+" : award_info is "+award_info );
}
String prd_cntry1 = req.getParameter("prd_cntry1");
if( prd_cntry1 == null){
	System.out.println(this.toString+" : prd_cntry1 is null" );
}else{
	System.out.println(this.toString+" : prd_cntry1 is "+prd_cntry1 );
}
String prd_cntry2 = req.getParameter("prd_cntry2");
if( prd_cntry2 == null){
	System.out.println(this.toString+" : prd_cntry2 is null" );
}else{
	System.out.println(this.toString+" : prd_cntry2 is "+prd_cntry2 );
}
String prd_co_cd = req.getParameter("prd_co_cd");
if( prd_co_cd == null){
	System.out.println(this.toString+" : prd_co_cd is null" );
}else{
	System.out.println(this.toString+" : prd_co_cd is "+prd_co_cd );
}
String prd_co_nm = req.getParameter("prd_co_nm");
if( prd_co_nm == null){
	System.out.println(this.toString+" : prd_co_nm is null" );
}else{
	System.out.println(this.toString+" : prd_co_nm is "+prd_co_nm );
}
String prd_ym = req.getParameter("prd_ym");
if( prd_ym == null){
	System.out.println(this.toString+" : prd_ym is null" );
}else{
	System.out.println(this.toString+" : prd_ym is "+prd_ym );
}
String flash_yn = req.getParameter("flash_yn");
if( flash_yn == null){
	System.out.println(this.toString+" : flash_yn is null" );
}else{
	System.out.println(this.toString+" : flash_yn is "+flash_yn );
}
String emerg_yn = req.getParameter("emerg_yn");
if( emerg_yn == null){
	System.out.println(this.toString+" : emerg_yn is null" );
}else{
	System.out.println(this.toString+" : emerg_yn is "+emerg_yn );
}
String news_yn = req.getParameter("news_yn");
if( news_yn == null){
	System.out.println(this.toString+" : news_yn is null" );
}else{
	System.out.println(this.toString+" : news_yn is "+news_yn );
}
String pilot_yn = req.getParameter("pilot_yn");
if( pilot_yn == null){
	System.out.println(this.toString+" : pilot_yn is null" );
}else{
	System.out.println(this.toString+" : pilot_yn is "+pilot_yn );
}
String pgm_info = req.getParameter("pgm_info");
if( pgm_info == null){
	System.out.println(this.toString+" : pgm_info is null" );
}else{
	System.out.println(this.toString+" : pgm_info is "+pgm_info );
}
String pgm_icon = req.getParameter("pgm_icon");
if( pgm_icon == null){
	System.out.println(this.toString+" : pgm_icon is null" );
}else{
	System.out.println(this.toString+" : pgm_icon is "+pgm_icon );
}
String regr = req.getParameter("regr");
if( regr == null){
	System.out.println(this.toString+" : regr is null" );
}else{
	System.out.println(this.toString+" : regr is "+regr );
}
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String modr = req.getParameter("modr");
if( modr == null){
	System.out.println(this.toString+" : modr is null" );
}else{
	System.out.println(this.toString+" : modr is "+modr );
}
String mod_dt = req.getParameter("mod_dt");
if( mod_dt == null){
	System.out.println(this.toString+" : mod_dt is null" );
}else{
	System.out.println(this.toString+" : mod_dt is "+mod_dt );
}
String del_yn = req.getParameter("del_yn");
if( del_yn == null){
	System.out.println(this.toString+" : del_yn is null" );
}else{
	System.out.println(this.toString+" : del_yn is "+del_yn );
}
String delr = req.getParameter("delr");
if( delr == null){
	System.out.println(this.toString+" : delr is null" );
}else{
	System.out.println(this.toString+" : delr is "+delr );
}
String del_dt = req.getParameter("del_dt");
if( del_dt == null){
	System.out.println(this.toString+" : del_dt is null" );
}else{
	System.out.println(this.toString+" : del_dt is "+del_dt );
}
String dvs_yn = req.getParameter("dvs_yn");
if( dvs_yn == null){
	System.out.println(this.toString+" : dvs_yn is null" );
}else{
	System.out.println(this.toString+" : dvs_yn is "+dvs_yn );
}
String news_group = req.getParameter("news_group");
if( news_group == null){
	System.out.println(this.toString+" : news_group is null" );
}else{
	System.out.println(this.toString+" : news_group is "+news_group );
}
String online_service_yn = req.getParameter("online_service_yn");
if( online_service_yn == null){
	System.out.println(this.toString+" : online_service_yn is null" );
}else{
	System.out.println(this.toString+" : online_service_yn is "+online_service_yn );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pgm_id = Util.checkString(req.getParameter("pgm_id"));
String pgm_nm = Util.checkString(req.getParameter("pgm_nm"));
String pgm_onm = Util.checkString(req.getParameter("pgm_onm"));
String pgm_typ = Util.checkString(req.getParameter("pgm_typ"));
String brd_run = Util.checkString(req.getParameter("brd_run"));
String tot_cnt = Util.checkString(req.getParameter("tot_cnt"));
String pgm_clf1 = Util.checkString(req.getParameter("pgm_clf1"));
String pgm_clf2 = Util.checkString(req.getParameter("pgm_clf2"));
String jenr_clf = Util.checkString(req.getParameter("jenr_clf"));
String target = Util.checkString(req.getParameter("target"));
String delib_grd = Util.checkString(req.getParameter("delib_grd"));
String info_grd = Util.checkString(req.getParameter("info_grd"));
String frgn_clf = Util.checkString(req.getParameter("frgn_clf"));
String game_clf = Util.checkString(req.getParameter("game_clf"));
String main_role = Util.checkString(req.getParameter("main_role"));
String supp_role = Util.checkString(req.getParameter("supp_role"));
String director = Util.checkString(req.getParameter("director"));
String mc_nm = Util.checkString(req.getParameter("mc_nm"));
String award_info = Util.checkString(req.getParameter("award_info"));
String prd_cntry1 = Util.checkString(req.getParameter("prd_cntry1"));
String prd_cntry2 = Util.checkString(req.getParameter("prd_cntry2"));
String prd_co_cd = Util.checkString(req.getParameter("prd_co_cd"));
String prd_co_nm = Util.checkString(req.getParameter("prd_co_nm"));
String prd_ym = Util.checkString(req.getParameter("prd_ym"));
String flash_yn = Util.checkString(req.getParameter("flash_yn"));
String emerg_yn = Util.checkString(req.getParameter("emerg_yn"));
String news_yn = Util.checkString(req.getParameter("news_yn"));
String pilot_yn = Util.checkString(req.getParameter("pilot_yn"));
String pgm_info = Util.checkString(req.getParameter("pgm_info"));
String pgm_icon = Util.checkString(req.getParameter("pgm_icon"));
String regr = Util.checkString(req.getParameter("regr"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String modr = Util.checkString(req.getParameter("modr"));
String mod_dt = Util.checkString(req.getParameter("mod_dt"));
String del_yn = Util.checkString(req.getParameter("del_yn"));
String delr = Util.checkString(req.getParameter("delr"));
String del_dt = Util.checkString(req.getParameter("del_dt"));
String dvs_yn = Util.checkString(req.getParameter("dvs_yn"));
String news_group = Util.checkString(req.getParameter("news_group"));
String online_service_yn = Util.checkString(req.getParameter("online_service_yn"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pgm_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_id")));
String pgm_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_nm")));
String pgm_onm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_onm")));
String pgm_typ = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_typ")));
String brd_run = Util.Uni2Ksc(Util.checkString(req.getParameter("brd_run")));
String tot_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_cnt")));
String pgm_clf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_clf1")));
String pgm_clf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_clf2")));
String jenr_clf = Util.Uni2Ksc(Util.checkString(req.getParameter("jenr_clf")));
String target = Util.Uni2Ksc(Util.checkString(req.getParameter("target")));
String delib_grd = Util.Uni2Ksc(Util.checkString(req.getParameter("delib_grd")));
String info_grd = Util.Uni2Ksc(Util.checkString(req.getParameter("info_grd")));
String frgn_clf = Util.Uni2Ksc(Util.checkString(req.getParameter("frgn_clf")));
String game_clf = Util.Uni2Ksc(Util.checkString(req.getParameter("game_clf")));
String main_role = Util.Uni2Ksc(Util.checkString(req.getParameter("main_role")));
String supp_role = Util.Uni2Ksc(Util.checkString(req.getParameter("supp_role")));
String director = Util.Uni2Ksc(Util.checkString(req.getParameter("director")));
String mc_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mc_nm")));
String award_info = Util.Uni2Ksc(Util.checkString(req.getParameter("award_info")));
String prd_cntry1 = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_cntry1")));
String prd_cntry2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_cntry2")));
String prd_co_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_co_cd")));
String prd_co_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_co_nm")));
String prd_ym = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_ym")));
String flash_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("flash_yn")));
String emerg_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("emerg_yn")));
String news_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("news_yn")));
String pilot_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pilot_yn")));
String pgm_info = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_info")));
String pgm_icon = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_icon")));
String regr = Util.Uni2Ksc(Util.checkString(req.getParameter("regr")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String modr = Util.Uni2Ksc(Util.checkString(req.getParameter("modr")));
String mod_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mod_dt")));
String del_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("del_yn")));
String delr = Util.Uni2Ksc(Util.checkString(req.getParameter("delr")));
String del_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("del_dt")));
String dvs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dvs_yn")));
String news_group = Util.Uni2Ksc(Util.checkString(req.getParameter("news_group")));
String online_service_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("online_service_yn")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPgm_id(pgm_id);
dm.setPgm_nm(pgm_nm);
dm.setPgm_onm(pgm_onm);
dm.setPgm_typ(pgm_typ);
dm.setBrd_run(brd_run);
dm.setTot_cnt(tot_cnt);
dm.setPgm_clf1(pgm_clf1);
dm.setPgm_clf2(pgm_clf2);
dm.setJenr_clf(jenr_clf);
dm.setTarget(target);
dm.setDelib_grd(delib_grd);
dm.setInfo_grd(info_grd);
dm.setFrgn_clf(frgn_clf);
dm.setGame_clf(game_clf);
dm.setMain_role(main_role);
dm.setSupp_role(supp_role);
dm.setDirector(director);
dm.setMc_nm(mc_nm);
dm.setAward_info(award_info);
dm.setPrd_cntry1(prd_cntry1);
dm.setPrd_cntry2(prd_cntry2);
dm.setPrd_co_cd(prd_co_cd);
dm.setPrd_co_nm(prd_co_nm);
dm.setPrd_ym(prd_ym);
dm.setFlash_yn(flash_yn);
dm.setEmerg_yn(emerg_yn);
dm.setNews_yn(news_yn);
dm.setPilot_yn(pilot_yn);
dm.setPgm_info(pgm_info);
dm.setPgm_icon(pgm_icon);
dm.setRegr(regr);
dm.setReg_dt(reg_dt);
dm.setModr(modr);
dm.setMod_dt(mod_dt);
dm.setDel_yn(del_yn);
dm.setDelr(delr);
dm.setDel_dt(del_dt);
dm.setDvs_yn(dvs_yn);
dm.setNews_group(news_group);
dm.setOnline_service_yn(online_service_yn);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 17 14:02:15 KST 2012 */