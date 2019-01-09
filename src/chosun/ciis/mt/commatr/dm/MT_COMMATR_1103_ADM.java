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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_1103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String matr_cd;
	public String matr_nm;
	public String purc_uprc;
	public String std_modl;
	public String unit;
	public String dlco_cd;
	public String abc_clas;
	public String matr_clas;
	public String dstb_rat_cd;
	public String ewh_budg_cd;
	public String owh_budg_cd;
	public String eps_no;
	public String prt_seq;
	public String usag;
	public String impt_yn;
	public String daily_rept_yn;
	public String stok_mang_yn;
	public String remk_use_yn;
	public String wste_yn;
	public String wste_dt;
	public String vip_matr_yn;
	public String brws_obj_yn;
	public String item_req_mt_yn;
	public String item_req_usag_yn;
	public String via_dept_yn;
	public String item_req_mand_yn;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String mode;
	public String medi_cd;
	public String rela_yn;

	public MT_COMMATR_1103_ADM(){}
	public MT_COMMATR_1103_ADM(String gubun, String cmpy_cd, String matr_cd, String matr_nm, String purc_uprc, String std_modl, String unit, String dlco_cd, String abc_clas, String matr_clas, String dstb_rat_cd, String ewh_budg_cd, String owh_budg_cd, String eps_no, String prt_seq, String usag, String impt_yn, String daily_rept_yn, String stok_mang_yn, String remk_use_yn, String wste_yn, String wste_dt, String vip_matr_yn, String brws_obj_yn, String item_req_mt_yn, String item_req_usag_yn, String via_dept_yn, String item_req_mand_yn, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String mode, String medi_cd, String rela_yn){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.matr_cd = matr_cd;
		this.matr_nm = matr_nm;
		this.purc_uprc = purc_uprc;
		this.std_modl = std_modl;
		this.unit = unit;
		this.dlco_cd = dlco_cd;
		this.abc_clas = abc_clas;
		this.matr_clas = matr_clas;
		this.dstb_rat_cd = dstb_rat_cd;
		this.ewh_budg_cd = ewh_budg_cd;
		this.owh_budg_cd = owh_budg_cd;
		this.eps_no = eps_no;
		this.prt_seq = prt_seq;
		this.usag = usag;
		this.impt_yn = impt_yn;
		this.daily_rept_yn = daily_rept_yn;
		this.stok_mang_yn = stok_mang_yn;
		this.remk_use_yn = remk_use_yn;
		this.wste_yn = wste_yn;
		this.wste_dt = wste_dt;
		this.vip_matr_yn = vip_matr_yn;
		this.brws_obj_yn = brws_obj_yn;
		this.item_req_mt_yn = item_req_mt_yn;
		this.item_req_usag_yn = item_req_usag_yn;
		this.via_dept_yn = via_dept_yn;
		this.item_req_mand_yn = item_req_mand_yn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.mode = mode;
		this.medi_cd = medi_cd;
		this.rela_yn = rela_yn;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setAbc_clas(String abc_clas){
		this.abc_clas = abc_clas;
	}

	public void setMatr_clas(String matr_clas){
		this.matr_clas = matr_clas;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setPrt_seq(String prt_seq){
		this.prt_seq = prt_seq;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setImpt_yn(String impt_yn){
		this.impt_yn = impt_yn;
	}

	public void setDaily_rept_yn(String daily_rept_yn){
		this.daily_rept_yn = daily_rept_yn;
	}

	public void setStok_mang_yn(String stok_mang_yn){
		this.stok_mang_yn = stok_mang_yn;
	}

	public void setRemk_use_yn(String remk_use_yn){
		this.remk_use_yn = remk_use_yn;
	}

	public void setWste_yn(String wste_yn){
		this.wste_yn = wste_yn;
	}

	public void setWste_dt(String wste_dt){
		this.wste_dt = wste_dt;
	}

	public void setVip_matr_yn(String vip_matr_yn){
		this.vip_matr_yn = vip_matr_yn;
	}

	public void setBrws_obj_yn(String brws_obj_yn){
		this.brws_obj_yn = brws_obj_yn;
	}

	public void setItem_req_mt_yn(String item_req_mt_yn){
		this.item_req_mt_yn = item_req_mt_yn;
	}

	public void setItem_req_usag_yn(String item_req_usag_yn){
		this.item_req_usag_yn = item_req_usag_yn;
	}

	public void setVia_dept_yn(String via_dept_yn){
		this.via_dept_yn = via_dept_yn;
	}

	public void setItem_req_mand_yn(String item_req_mand_yn){
		this.item_req_mand_yn = item_req_mand_yn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRela_yn(String rela_yn){
		this.rela_yn = rela_yn;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getAbc_clas(){
		return this.abc_clas;
	}

	public String getMatr_clas(){
		return this.matr_clas;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getPrt_seq(){
		return this.prt_seq;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getImpt_yn(){
		return this.impt_yn;
	}

	public String getDaily_rept_yn(){
		return this.daily_rept_yn;
	}

	public String getStok_mang_yn(){
		return this.stok_mang_yn;
	}

	public String getRemk_use_yn(){
		return this.remk_use_yn;
	}

	public String getWste_yn(){
		return this.wste_yn;
	}

	public String getWste_dt(){
		return this.wste_dt;
	}

	public String getVip_matr_yn(){
		return this.vip_matr_yn;
	}

	public String getBrws_obj_yn(){
		return this.brws_obj_yn;
	}

	public String getItem_req_mt_yn(){
		return this.item_req_mt_yn;
	}

	public String getItem_req_usag_yn(){
		return this.item_req_usag_yn;
	}

	public String getVia_dept_yn(){
		return this.via_dept_yn;
	}

	public String getItem_req_mand_yn(){
		return this.item_req_mand_yn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRela_yn(){
		return this.rela_yn;
	}

	public String getSQL(){
		 return "{ call SP_MT_COMMATR_1103_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_1103_ADM dm = (MT_COMMATR_1103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.matr_cd);
		cstmt.setString(6, dm.matr_nm);
		cstmt.setString(7, dm.purc_uprc);
		cstmt.setString(8, dm.std_modl);
		cstmt.setString(9, dm.unit);
		cstmt.setString(10, dm.dlco_cd);
		cstmt.setString(11, dm.abc_clas);
		cstmt.setString(12, dm.matr_clas);
		cstmt.setString(13, dm.dstb_rat_cd);
		cstmt.setString(14, dm.ewh_budg_cd);
		cstmt.setString(15, dm.owh_budg_cd);
		cstmt.setString(16, dm.eps_no);
		cstmt.setString(17, dm.prt_seq);
		cstmt.setString(18, dm.usag);
		cstmt.setString(19, dm.impt_yn);
		cstmt.setString(20, dm.daily_rept_yn);
		cstmt.setString(21, dm.stok_mang_yn);
		cstmt.setString(22, dm.remk_use_yn);
		cstmt.setString(23, dm.wste_yn);
		cstmt.setString(24, dm.wste_dt);
		cstmt.setString(25, dm.vip_matr_yn);
		cstmt.setString(26, dm.brws_obj_yn);
		cstmt.setString(27, dm.item_req_mt_yn);
		cstmt.setString(28, dm.item_req_usag_yn);
		cstmt.setString(29, dm.via_dept_yn);
		cstmt.setString(30, dm.item_req_mand_yn);
		cstmt.setString(31, dm.incmg_pers_ipadd);
		cstmt.setString(32, dm.incmg_pers);
		cstmt.setString(33, dm.chg_pers);
		cstmt.setString(34, dm.mode);
		cstmt.setString(35, dm.medi_cd);
		cstmt.setString(36, dm.rela_yn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_1103_ADataSet();
	}



    public void print(){
        System.out.println("gubun = " + getGubun());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("matr_cd = " + getMatr_cd());
        System.out.println("matr_nm = " + getMatr_nm());
        System.out.println("purc_uprc = " + getPurc_uprc());
        System.out.println("std_modl = " + getStd_modl());
        System.out.println("unit = " + getUnit());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("abc_clas = " + getAbc_clas());
        System.out.println("matr_clas = " + getMatr_clas());
        System.out.println("dstb_rat_cd = " + getDstb_rat_cd());
        System.out.println("ewh_budg_cd = " + getEwh_budg_cd());
        System.out.println("owh_budg_cd = " + getOwh_budg_cd());
        System.out.println("eps_no = " + getEps_no());
        System.out.println("prt_seq = " + getPrt_seq());
        System.out.println("usag = " + getUsag());
        System.out.println("impt_yn = " + getImpt_yn());
        System.out.println("daily_rept_yn = " + getDaily_rept_yn());
        System.out.println("stok_mang_yn = " + getStok_mang_yn());
        System.out.println("remk_use_yn = " + getRemk_use_yn());
        System.out.println("wste_yn = " + getWste_yn());
        System.out.println("wste_dt = " + getWste_dt());
        System.out.println("vip_matr_yn = " + getVip_matr_yn());
        System.out.println("brws_obj_yn = " + getBrws_obj_yn());
        System.out.println("item_req_mt_yn = " + getItem_req_mt_yn());
        System.out.println("item_req_usag_yn = " + getItem_req_usag_yn());
        System.out.println("via_dept_yn = " + getVia_dept_yn());
        System.out.println("item_req_mand_yn = " + getItem_req_mand_yn());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("mode = " + getMode());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("rela_yn = " + getRela_yn());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String matr_nm = req.getParameter("matr_nm");
if( matr_nm == null){
	System.out.println(this.toString+" : matr_nm is null" );
}else{
	System.out.println(this.toString+" : matr_nm is "+matr_nm );
}
String purc_uprc = req.getParameter("purc_uprc");
if( purc_uprc == null){
	System.out.println(this.toString+" : purc_uprc is null" );
}else{
	System.out.println(this.toString+" : purc_uprc is "+purc_uprc );
}
String std_modl = req.getParameter("std_modl");
if( std_modl == null){
	System.out.println(this.toString+" : std_modl is null" );
}else{
	System.out.println(this.toString+" : std_modl is "+std_modl );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String abc_clas = req.getParameter("abc_clas");
if( abc_clas == null){
	System.out.println(this.toString+" : abc_clas is null" );
}else{
	System.out.println(this.toString+" : abc_clas is "+abc_clas );
}
String matr_clas = req.getParameter("matr_clas");
if( matr_clas == null){
	System.out.println(this.toString+" : matr_clas is null" );
}else{
	System.out.println(this.toString+" : matr_clas is "+matr_clas );
}
String dstb_rat_cd = req.getParameter("dstb_rat_cd");
if( dstb_rat_cd == null){
	System.out.println(this.toString+" : dstb_rat_cd is null" );
}else{
	System.out.println(this.toString+" : dstb_rat_cd is "+dstb_rat_cd );
}
String ewh_budg_cd = req.getParameter("ewh_budg_cd");
if( ewh_budg_cd == null){
	System.out.println(this.toString+" : ewh_budg_cd is null" );
}else{
	System.out.println(this.toString+" : ewh_budg_cd is "+ewh_budg_cd );
}
String owh_budg_cd = req.getParameter("owh_budg_cd");
if( owh_budg_cd == null){
	System.out.println(this.toString+" : owh_budg_cd is null" );
}else{
	System.out.println(this.toString+" : owh_budg_cd is "+owh_budg_cd );
}
String eps_no = req.getParameter("eps_no");
if( eps_no == null){
	System.out.println(this.toString+" : eps_no is null" );
}else{
	System.out.println(this.toString+" : eps_no is "+eps_no );
}
String prt_seq = req.getParameter("prt_seq");
if( prt_seq == null){
	System.out.println(this.toString+" : prt_seq is null" );
}else{
	System.out.println(this.toString+" : prt_seq is "+prt_seq );
}
String usag = req.getParameter("usag");
if( usag == null){
	System.out.println(this.toString+" : usag is null" );
}else{
	System.out.println(this.toString+" : usag is "+usag );
}
String impt_yn = req.getParameter("impt_yn");
if( impt_yn == null){
	System.out.println(this.toString+" : impt_yn is null" );
}else{
	System.out.println(this.toString+" : impt_yn is "+impt_yn );
}
String daily_rept_yn = req.getParameter("daily_rept_yn");
if( daily_rept_yn == null){
	System.out.println(this.toString+" : daily_rept_yn is null" );
}else{
	System.out.println(this.toString+" : daily_rept_yn is "+daily_rept_yn );
}
String stok_mang_yn = req.getParameter("stok_mang_yn");
if( stok_mang_yn == null){
	System.out.println(this.toString+" : stok_mang_yn is null" );
}else{
	System.out.println(this.toString+" : stok_mang_yn is "+stok_mang_yn );
}
String remk_use_yn = req.getParameter("remk_use_yn");
if( remk_use_yn == null){
	System.out.println(this.toString+" : remk_use_yn is null" );
}else{
	System.out.println(this.toString+" : remk_use_yn is "+remk_use_yn );
}
String wste_yn = req.getParameter("wste_yn");
if( wste_yn == null){
	System.out.println(this.toString+" : wste_yn is null" );
}else{
	System.out.println(this.toString+" : wste_yn is "+wste_yn );
}
String wste_dt = req.getParameter("wste_dt");
if( wste_dt == null){
	System.out.println(this.toString+" : wste_dt is null" );
}else{
	System.out.println(this.toString+" : wste_dt is "+wste_dt );
}
String vip_matr_yn = req.getParameter("vip_matr_yn");
if( vip_matr_yn == null){
	System.out.println(this.toString+" : vip_matr_yn is null" );
}else{
	System.out.println(this.toString+" : vip_matr_yn is "+vip_matr_yn );
}
String brws_obj_yn = req.getParameter("brws_obj_yn");
if( brws_obj_yn == null){
	System.out.println(this.toString+" : brws_obj_yn is null" );
}else{
	System.out.println(this.toString+" : brws_obj_yn is "+brws_obj_yn );
}
String item_req_mt_yn = req.getParameter("item_req_mt_yn");
if( item_req_mt_yn == null){
	System.out.println(this.toString+" : item_req_mt_yn is null" );
}else{
	System.out.println(this.toString+" : item_req_mt_yn is "+item_req_mt_yn );
}
String item_req_usag_yn = req.getParameter("item_req_usag_yn");
if( item_req_usag_yn == null){
	System.out.println(this.toString+" : item_req_usag_yn is null" );
}else{
	System.out.println(this.toString+" : item_req_usag_yn is "+item_req_usag_yn );
}
String via_dept_yn = req.getParameter("via_dept_yn");
if( via_dept_yn == null){
	System.out.println(this.toString+" : via_dept_yn is null" );
}else{
	System.out.println(this.toString+" : via_dept_yn is "+via_dept_yn );
}
String item_req_mand_yn = req.getParameter("item_req_mand_yn");
if( item_req_mand_yn == null){
	System.out.println(this.toString+" : item_req_mand_yn is null" );
}else{
	System.out.println(this.toString+" : item_req_mand_yn is "+item_req_mand_yn );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String rela_yn = req.getParameter("rela_yn");
if( rela_yn == null){
	System.out.println(this.toString+" : rela_yn is null" );
}else{
	System.out.println(this.toString+" : rela_yn is "+rela_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String matr_nm = Util.checkString(req.getParameter("matr_nm"));
String purc_uprc = Util.checkString(req.getParameter("purc_uprc"));
String std_modl = Util.checkString(req.getParameter("std_modl"));
String unit = Util.checkString(req.getParameter("unit"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String abc_clas = Util.checkString(req.getParameter("abc_clas"));
String matr_clas = Util.checkString(req.getParameter("matr_clas"));
String dstb_rat_cd = Util.checkString(req.getParameter("dstb_rat_cd"));
String ewh_budg_cd = Util.checkString(req.getParameter("ewh_budg_cd"));
String owh_budg_cd = Util.checkString(req.getParameter("owh_budg_cd"));
String eps_no = Util.checkString(req.getParameter("eps_no"));
String prt_seq = Util.checkString(req.getParameter("prt_seq"));
String usag = Util.checkString(req.getParameter("usag"));
String impt_yn = Util.checkString(req.getParameter("impt_yn"));
String daily_rept_yn = Util.checkString(req.getParameter("daily_rept_yn"));
String stok_mang_yn = Util.checkString(req.getParameter("stok_mang_yn"));
String remk_use_yn = Util.checkString(req.getParameter("remk_use_yn"));
String wste_yn = Util.checkString(req.getParameter("wste_yn"));
String wste_dt = Util.checkString(req.getParameter("wste_dt"));
String vip_matr_yn = Util.checkString(req.getParameter("vip_matr_yn"));
String brws_obj_yn = Util.checkString(req.getParameter("brws_obj_yn"));
String item_req_mt_yn = Util.checkString(req.getParameter("item_req_mt_yn"));
String item_req_usag_yn = Util.checkString(req.getParameter("item_req_usag_yn"));
String via_dept_yn = Util.checkString(req.getParameter("via_dept_yn"));
String item_req_mand_yn = Util.checkString(req.getParameter("item_req_mand_yn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String rela_yn = Util.checkString(req.getParameter("rela_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String matr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_nm")));
String purc_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_uprc")));
String std_modl = Util.Uni2Ksc(Util.checkString(req.getParameter("std_modl")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String abc_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("abc_clas")));
String matr_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_clas")));
String dstb_rat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_rat_cd")));
String ewh_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_budg_cd")));
String owh_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_budg_cd")));
String eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_no")));
String prt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_seq")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
String impt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_yn")));
String daily_rept_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("daily_rept_yn")));
String stok_mang_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("stok_mang_yn")));
String remk_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_use_yn")));
String wste_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("wste_yn")));
String wste_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("wste_dt")));
String vip_matr_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("vip_matr_yn")));
String brws_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("brws_obj_yn")));
String item_req_mt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("item_req_mt_yn")));
String item_req_usag_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("item_req_usag_yn")));
String via_dept_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("via_dept_yn")));
String item_req_mand_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("item_req_mand_yn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String rela_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setMatr_cd(matr_cd);
dm.setMatr_nm(matr_nm);
dm.setPurc_uprc(purc_uprc);
dm.setStd_modl(std_modl);
dm.setUnit(unit);
dm.setDlco_cd(dlco_cd);
dm.setAbc_clas(abc_clas);
dm.setMatr_clas(matr_clas);
dm.setDstb_rat_cd(dstb_rat_cd);
dm.setEwh_budg_cd(ewh_budg_cd);
dm.setOwh_budg_cd(owh_budg_cd);
dm.setEps_no(eps_no);
dm.setPrt_seq(prt_seq);
dm.setUsag(usag);
dm.setImpt_yn(impt_yn);
dm.setDaily_rept_yn(daily_rept_yn);
dm.setStok_mang_yn(stok_mang_yn);
dm.setRemk_use_yn(remk_use_yn);
dm.setWste_yn(wste_yn);
dm.setWste_dt(wste_dt);
dm.setVip_matr_yn(vip_matr_yn);
dm.setBrws_obj_yn(brws_obj_yn);
dm.setItem_req_mt_yn(item_req_mt_yn);
dm.setItem_req_usag_yn(item_req_usag_yn);
dm.setVia_dept_yn(via_dept_yn);
dm.setItem_req_mand_yn(item_req_mand_yn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setMode(mode);
dm.setMedi_cd(medi_cd);
dm.setRela_yn(rela_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 22 21:01:00 KST 2009 */