/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2007-05-22
* 작성자 : 배창희
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


public class CO_COCD_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String g_mode;
	public String g_cmpy_cd;
	public String g_job_clsf;
	public String g_cd_clsf;
	public String g_cd;
	public String g_use_yn;
	public String g_cdnm;
	public String g_cd_abrv_nm;
	public String g_mang_cd_1;
	public String g_mang_cd_2;
	public String g_mang_cd_3;
	public String g_mang_cd_4;
	public String g_mang_cd_5;
	public String g_mang_cd_6;
	public String g_mang_cd_7;
	public String g_mang_cd_8;
	public String g_mang_cd_9;
	public String g_mang_cd_10;
	public String g_mang_cd_11;
	public String g_mang_cd_12;
	public String g_tbl_nm;
	public String g_remk;
	public String g_upd_yn;
	public String g_incmg_pers_ip;
	public String g_incmg_pers;
	public String mode;
	public String cd;
	public String use_yn;
	public String cdnm;
	public String cd_abrv_nm;
	public String mang_cd_1;
	public String mang_cd_2;
	public String mang_cd_3;
	public String mang_cd_4;
	public String mang_cd_5;
	public String mang_cd_6;
	public String mang_cd_7;
	public String mang_cd_8;
	public String mang_cd_9;
	public String mang_cd_10;
	public String mang_cd_11;
	public String mang_cd_12;
	public String tbl_nm;
	public String remk;
	public String upd_yn;

	public CO_COCD_1030_ADM(){}
	public CO_COCD_1030_ADM(String g_mode, String g_cmpy_cd, String g_job_clsf, String g_cd_clsf, String g_cd, String g_use_yn, String g_cdnm, String g_cd_abrv_nm, String g_mang_cd_1, String g_mang_cd_2, String g_mang_cd_3, String g_mang_cd_4, String g_mang_cd_5, String g_mang_cd_6, String g_mang_cd_7, String g_mang_cd_8, String g_mang_cd_9, String g_mang_cd_10, String g_mang_cd_11, String g_mang_cd_12, String g_tbl_nm, String g_remk, String g_upd_yn, String g_incmg_pers_ip, String g_incmg_pers, String mode, String cd, String use_yn, String cdnm, String cd_abrv_nm, String mang_cd_1, String mang_cd_2, String mang_cd_3, String mang_cd_4, String mang_cd_5, String mang_cd_6, String mang_cd_7, String mang_cd_8, String mang_cd_9, String mang_cd_10, String mang_cd_11, String mang_cd_12, String tbl_nm, String remk, String upd_yn){
		this.g_mode = g_mode;
		this.g_cmpy_cd = g_cmpy_cd;
		this.g_job_clsf = g_job_clsf;
		this.g_cd_clsf = g_cd_clsf;
		this.g_cd = g_cd;
		this.g_use_yn = g_use_yn;
		this.g_cdnm = g_cdnm;
		this.g_cd_abrv_nm = g_cd_abrv_nm;
		this.g_mang_cd_1 = g_mang_cd_1;
		this.g_mang_cd_2 = g_mang_cd_2;
		this.g_mang_cd_3 = g_mang_cd_3;
		this.g_mang_cd_4 = g_mang_cd_4;
		this.g_mang_cd_5 = g_mang_cd_5;
		this.g_mang_cd_6 = g_mang_cd_6;
		this.g_mang_cd_7 = g_mang_cd_7;
		this.g_mang_cd_8 = g_mang_cd_8;
		this.g_mang_cd_9 = g_mang_cd_9;
		this.g_mang_cd_10 = g_mang_cd_10;
		this.g_mang_cd_11 = g_mang_cd_11;
		this.g_mang_cd_12 = g_mang_cd_12;
		this.g_tbl_nm = g_tbl_nm;
		this.g_remk = g_remk;
		this.g_upd_yn = g_upd_yn;
		this.g_incmg_pers_ip = g_incmg_pers_ip;
		this.g_incmg_pers = g_incmg_pers;
		this.mode = mode;
		this.cd = cd;
		this.use_yn = use_yn;
		this.cdnm = cdnm;
		this.cd_abrv_nm = cd_abrv_nm;
		this.mang_cd_1 = mang_cd_1;
		this.mang_cd_2 = mang_cd_2;
		this.mang_cd_3 = mang_cd_3;
		this.mang_cd_4 = mang_cd_4;
		this.mang_cd_5 = mang_cd_5;
		this.mang_cd_6 = mang_cd_6;
		this.mang_cd_7 = mang_cd_7;
		this.mang_cd_8 = mang_cd_8;
		this.mang_cd_9 = mang_cd_9;
		this.mang_cd_10 = mang_cd_10;
		this.mang_cd_11 = mang_cd_11;
		this.mang_cd_12 = mang_cd_12;
		this.tbl_nm = tbl_nm;
		this.remk = remk;
		this.upd_yn = upd_yn;
	}

	public void setG_mode(String g_mode){
		this.g_mode = g_mode;
	}

	public void setG_cmpy_cd(String g_cmpy_cd){
		this.g_cmpy_cd = g_cmpy_cd;
	}

	public void setG_job_clsf(String g_job_clsf){
		this.g_job_clsf = g_job_clsf;
	}

	public void setG_cd_clsf(String g_cd_clsf){
		this.g_cd_clsf = g_cd_clsf;
	}

	public void setG_cd(String g_cd){
		this.g_cd = g_cd;
	}

	public void setG_use_yn(String g_use_yn){
		this.g_use_yn = g_use_yn;
	}

	public void setG_cdnm(String g_cdnm){
		this.g_cdnm = g_cdnm;
	}

	public void setG_cd_abrv_nm(String g_cd_abrv_nm){
		this.g_cd_abrv_nm = g_cd_abrv_nm;
	}

	public void setG_mang_cd_1(String g_mang_cd_1){
		this.g_mang_cd_1 = g_mang_cd_1;
	}

	public void setG_mang_cd_2(String g_mang_cd_2){
		this.g_mang_cd_2 = g_mang_cd_2;
	}

	public void setG_mang_cd_3(String g_mang_cd_3){
		this.g_mang_cd_3 = g_mang_cd_3;
	}

	public void setG_mang_cd_4(String g_mang_cd_4){
		this.g_mang_cd_4 = g_mang_cd_4;
	}

	public void setG_mang_cd_5(String g_mang_cd_5){
		this.g_mang_cd_5 = g_mang_cd_5;
	}

	public void setG_mang_cd_6(String g_mang_cd_6){
		this.g_mang_cd_6 = g_mang_cd_6;
	}

	public void setG_mang_cd_7(String g_mang_cd_7){
		this.g_mang_cd_7 = g_mang_cd_7;
	}

	public void setG_mang_cd_8(String g_mang_cd_8){
		this.g_mang_cd_8 = g_mang_cd_8;
	}

	public void setG_mang_cd_9(String g_mang_cd_9){
		this.g_mang_cd_9 = g_mang_cd_9;
	}

	public void setG_mang_cd_10(String g_mang_cd_10){
		this.g_mang_cd_10 = g_mang_cd_10;
	}

	public void setG_mang_cd_11(String g_mang_cd_11){
		this.g_mang_cd_11 = g_mang_cd_11;
	}

	public void setG_mang_cd_12(String g_mang_cd_12){
		this.g_mang_cd_12 = g_mang_cd_12;
	}

	public void setG_tbl_nm(String g_tbl_nm){
		this.g_tbl_nm = g_tbl_nm;
	}

	public void setG_remk(String g_remk){
		this.g_remk = g_remk;
	}

	public void setG_upd_yn(String g_upd_yn){
		this.g_upd_yn = g_upd_yn;
	}

	public void setG_incmg_pers_ip(String g_incmg_pers_ip){
		this.g_incmg_pers_ip = g_incmg_pers_ip;
	}

	public void setG_incmg_pers(String g_incmg_pers){
		this.g_incmg_pers = g_incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public void setMang_cd_2(String mang_cd_2){
		this.mang_cd_2 = mang_cd_2;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public void setMang_cd_4(String mang_cd_4){
		this.mang_cd_4 = mang_cd_4;
	}

	public void setMang_cd_5(String mang_cd_5){
		this.mang_cd_5 = mang_cd_5;
	}

	public void setMang_cd_6(String mang_cd_6){
		this.mang_cd_6 = mang_cd_6;
	}

	public void setMang_cd_7(String mang_cd_7){
		this.mang_cd_7 = mang_cd_7;
	}

	public void setMang_cd_8(String mang_cd_8){
		this.mang_cd_8 = mang_cd_8;
	}

	public void setMang_cd_9(String mang_cd_9){
		this.mang_cd_9 = mang_cd_9;
	}

	public void setMang_cd_10(String mang_cd_10){
		this.mang_cd_10 = mang_cd_10;
	}

	public void setMang_cd_11(String mang_cd_11){
		this.mang_cd_11 = mang_cd_11;
	}

	public void setMang_cd_12(String mang_cd_12){
		this.mang_cd_12 = mang_cd_12;
	}

	public void setTbl_nm(String tbl_nm){
		this.tbl_nm = tbl_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setUpd_yn(String upd_yn){
		this.upd_yn = upd_yn;
	}

	public String getG_mode(){
		return this.g_mode;
	}

	public String getG_cmpy_cd(){
		return this.g_cmpy_cd;
	}

	public String getG_job_clsf(){
		return this.g_job_clsf;
	}

	public String getG_cd_clsf(){
		return this.g_cd_clsf;
	}

	public String getG_cd(){
		return this.g_cd;
	}

	public String getG_use_yn(){
		return this.g_use_yn;
	}

	public String getG_cdnm(){
		return this.g_cdnm;
	}

	public String getG_cd_abrv_nm(){
		return this.g_cd_abrv_nm;
	}

	public String getG_mang_cd_1(){
		return this.g_mang_cd_1;
	}

	public String getG_mang_cd_2(){
		return this.g_mang_cd_2;
	}

	public String getG_mang_cd_3(){
		return this.g_mang_cd_3;
	}

	public String getG_mang_cd_4(){
		return this.g_mang_cd_4;
	}

	public String getG_mang_cd_5(){
		return this.g_mang_cd_5;
	}

	public String getG_mang_cd_6(){
		return this.g_mang_cd_6;
	}

	public String getG_mang_cd_7(){
		return this.g_mang_cd_7;
	}

	public String getG_mang_cd_8(){
		return this.g_mang_cd_8;
	}

	public String getG_mang_cd_9(){
		return this.g_mang_cd_9;
	}

	public String getG_mang_cd_10(){
		return this.g_mang_cd_10;
	}

	public String getG_mang_cd_11(){
		return this.g_mang_cd_11;
	}

	public String getG_mang_cd_12(){
		return this.g_mang_cd_12;
	}

	public String getG_tbl_nm(){
		return this.g_tbl_nm;
	}

	public String getG_remk(){
		return this.g_remk;
	}

	public String getG_upd_yn(){
		return this.g_upd_yn;
	}

	public String getG_incmg_pers_ip(){
		return this.g_incmg_pers_ip;
	}

	public String getG_incmg_pers(){
		return this.g_incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCd(){
		return this.cd;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getMang_cd_2(){
		return this.mang_cd_2;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}

	public String getMang_cd_4(){
		return this.mang_cd_4;
	}

	public String getMang_cd_5(){
		return this.mang_cd_5;
	}

	public String getMang_cd_6(){
		return this.mang_cd_6;
	}

	public String getMang_cd_7(){
		return this.mang_cd_7;
	}

	public String getMang_cd_8(){
		return this.mang_cd_8;
	}

	public String getMang_cd_9(){
		return this.mang_cd_9;
	}

	public String getMang_cd_10(){
		return this.mang_cd_10;
	}

	public String getMang_cd_11(){
		return this.mang_cd_11;
	}

	public String getMang_cd_12(){
		return this.mang_cd_12;
	}

	public String getTbl_nm(){
		return this.tbl_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getUpd_yn(){
		return this.upd_yn;
	}

	public String getSQL(){
		 return "{ call SP_CO_COCD_1030_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_COCD_1030_ADM dm = (CO_COCD_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.g_mode);
		cstmt.setString(4, dm.g_cmpy_cd);
		cstmt.setString(5, dm.g_job_clsf);
		cstmt.setString(6, dm.g_cd_clsf);
		cstmt.setString(7, dm.g_cd);
		cstmt.setString(8, dm.g_use_yn);
		cstmt.setString(9, dm.g_cdnm);
		cstmt.setString(10, dm.g_cd_abrv_nm);
		cstmt.setString(11, dm.g_mang_cd_1);
		cstmt.setString(12, dm.g_mang_cd_2);
		cstmt.setString(13, dm.g_mang_cd_3);
		cstmt.setString(14, dm.g_mang_cd_4);
		cstmt.setString(15, dm.g_mang_cd_5);
		cstmt.setString(16, dm.g_mang_cd_6);
		cstmt.setString(17, dm.g_mang_cd_7);
		cstmt.setString(18, dm.g_mang_cd_8);
		cstmt.setString(19, dm.g_mang_cd_9);
		cstmt.setString(20, dm.g_mang_cd_10);
		cstmt.setString(21, dm.g_mang_cd_11);
		cstmt.setString(22, dm.g_mang_cd_12);
		cstmt.setString(23, dm.g_tbl_nm);
		cstmt.setString(24, dm.g_remk);
		cstmt.setString(25, dm.g_upd_yn);
		cstmt.setString(26, dm.g_incmg_pers_ip);
		cstmt.setString(27, dm.g_incmg_pers);
		cstmt.setString(28, dm.mode);
		cstmt.setString(29, dm.cd);
		cstmt.setString(30, dm.use_yn);
		cstmt.setString(31, dm.cdnm);
		cstmt.setString(32, dm.cd_abrv_nm);
		cstmt.setString(33, dm.mang_cd_1);
		cstmt.setString(34, dm.mang_cd_2);
		cstmt.setString(35, dm.mang_cd_3);
		cstmt.setString(36, dm.mang_cd_4);
		cstmt.setString(37, dm.mang_cd_5);
		cstmt.setString(38, dm.mang_cd_6);
		cstmt.setString(39, dm.mang_cd_7);
		cstmt.setString(40, dm.mang_cd_8);
		cstmt.setString(41, dm.mang_cd_9);
		cstmt.setString(42, dm.mang_cd_10);
		cstmt.setString(43, dm.mang_cd_11);
		cstmt.setString(44, dm.mang_cd_12);
		cstmt.setString(45, dm.tbl_nm);
		cstmt.setString(46, dm.remk);
		cstmt.setString(47, dm.upd_yn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.cocd.ds.CO_COCD_1030_ADataSet();
	}



    public void print(){
        System.out.println("g_mode = " + getG_mode());
        System.out.println("g_cmpy_cd = " + getG_cmpy_cd());
        System.out.println("g_job_clsf = " + getG_job_clsf());
        System.out.println("g_cd_clsf = " + getG_cd_clsf());
        System.out.println("g_cd = " + getG_cd());
        System.out.println("g_use_yn = " + getG_use_yn());
        System.out.println("g_cdnm = " + getG_cdnm());
        System.out.println("g_cd_abrv_nm = " + getG_cd_abrv_nm());
        System.out.println("g_mang_cd_1 = " + getG_mang_cd_1());
        System.out.println("g_mang_cd_2 = " + getG_mang_cd_2());
        System.out.println("g_mang_cd_3 = " + getG_mang_cd_3());
        System.out.println("g_mang_cd_4 = " + getG_mang_cd_4());
        System.out.println("g_mang_cd_5 = " + getG_mang_cd_5());
        System.out.println("g_mang_cd_6 = " + getG_mang_cd_6());
        System.out.println("g_mang_cd_7 = " + getG_mang_cd_7());
        System.out.println("g_mang_cd_8 = " + getG_mang_cd_8());
        System.out.println("g_mang_cd_9 = " + getG_mang_cd_9());
        System.out.println("g_mang_cd_10 = " + getG_mang_cd_10());
        System.out.println("g_mang_cd_11 = " + getG_mang_cd_11());
        System.out.println("g_mang_cd_12 = " + getG_mang_cd_12());
        System.out.println("g_tbl_nm = " + getG_tbl_nm());
        System.out.println("g_remk = " + getG_remk());
        System.out.println("g_upd_yn = " + getG_upd_yn());
        System.out.println("g_incmg_pers_ip = " + getG_incmg_pers_ip());
        System.out.println("g_incmg_pers = " + getG_incmg_pers());
        System.out.println("mode = " + getMode());
        System.out.println("cd = " + getCd());
        System.out.println("use_yn = " + getUse_yn());
        System.out.println("cdnm = " + getCdnm());
        System.out.println("cd_abrv_nm = " + getCd_abrv_nm());
        System.out.println("mang_cd_1 = " + getMang_cd_1());
        System.out.println("mang_cd_2 = " + getMang_cd_2());
        System.out.println("mang_cd_3 = " + getMang_cd_3());
        System.out.println("mang_cd_4 = " + getMang_cd_4());
        System.out.println("mang_cd_5 = " + getMang_cd_5());
        System.out.println("mang_cd_6 = " + getMang_cd_6());
        System.out.println("mang_cd_7 = " + getMang_cd_7());
        System.out.println("mang_cd_8 = " + getMang_cd_8());
        System.out.println("mang_cd_9 = " + getMang_cd_9());
        System.out.println("mang_cd_10 = " + getMang_cd_10());
        System.out.println("mang_cd_11 = " + getMang_cd_11());
        System.out.println("mang_cd_12 = " + getMang_cd_12());
        System.out.println("tbl_nm = " + getTbl_nm());
        System.out.println("remk = " + getRemk());
        System.out.println("upd_yn = " + getUpd_yn());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String g_mode = req.getParameter("g_mode");
if( g_mode == null){
	System.out.println(this.toString+" : g_mode is null" );
}else{
	System.out.println(this.toString+" : g_mode is "+g_mode );
}
String g_cmpy_cd = req.getParameter("g_cmpy_cd");
if( g_cmpy_cd == null){
	System.out.println(this.toString+" : g_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : g_cmpy_cd is "+g_cmpy_cd );
}
String g_job_clsf = req.getParameter("g_job_clsf");
if( g_job_clsf == null){
	System.out.println(this.toString+" : g_job_clsf is null" );
}else{
	System.out.println(this.toString+" : g_job_clsf is "+g_job_clsf );
}
String g_cd_clsf = req.getParameter("g_cd_clsf");
if( g_cd_clsf == null){
	System.out.println(this.toString+" : g_cd_clsf is null" );
}else{
	System.out.println(this.toString+" : g_cd_clsf is "+g_cd_clsf );
}
String g_cd = req.getParameter("g_cd");
if( g_cd == null){
	System.out.println(this.toString+" : g_cd is null" );
}else{
	System.out.println(this.toString+" : g_cd is "+g_cd );
}
String g_use_yn = req.getParameter("g_use_yn");
if( g_use_yn == null){
	System.out.println(this.toString+" : g_use_yn is null" );
}else{
	System.out.println(this.toString+" : g_use_yn is "+g_use_yn );
}
String g_cdnm = req.getParameter("g_cdnm");
if( g_cdnm == null){
	System.out.println(this.toString+" : g_cdnm is null" );
}else{
	System.out.println(this.toString+" : g_cdnm is "+g_cdnm );
}
String g_cd_abrv_nm = req.getParameter("g_cd_abrv_nm");
if( g_cd_abrv_nm == null){
	System.out.println(this.toString+" : g_cd_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : g_cd_abrv_nm is "+g_cd_abrv_nm );
}
String g_mang_cd_1 = req.getParameter("g_mang_cd_1");
if( g_mang_cd_1 == null){
	System.out.println(this.toString+" : g_mang_cd_1 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_1 is "+g_mang_cd_1 );
}
String g_mang_cd_2 = req.getParameter("g_mang_cd_2");
if( g_mang_cd_2 == null){
	System.out.println(this.toString+" : g_mang_cd_2 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_2 is "+g_mang_cd_2 );
}
String g_mang_cd_3 = req.getParameter("g_mang_cd_3");
if( g_mang_cd_3 == null){
	System.out.println(this.toString+" : g_mang_cd_3 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_3 is "+g_mang_cd_3 );
}
String g_mang_cd_4 = req.getParameter("g_mang_cd_4");
if( g_mang_cd_4 == null){
	System.out.println(this.toString+" : g_mang_cd_4 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_4 is "+g_mang_cd_4 );
}
String g_mang_cd_5 = req.getParameter("g_mang_cd_5");
if( g_mang_cd_5 == null){
	System.out.println(this.toString+" : g_mang_cd_5 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_5 is "+g_mang_cd_5 );
}
String g_mang_cd_6 = req.getParameter("g_mang_cd_6");
if( g_mang_cd_6 == null){
	System.out.println(this.toString+" : g_mang_cd_6 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_6 is "+g_mang_cd_6 );
}
String g_mang_cd_7 = req.getParameter("g_mang_cd_7");
if( g_mang_cd_7 == null){
	System.out.println(this.toString+" : g_mang_cd_7 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_7 is "+g_mang_cd_7 );
}
String g_mang_cd_8 = req.getParameter("g_mang_cd_8");
if( g_mang_cd_8 == null){
	System.out.println(this.toString+" : g_mang_cd_8 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_8 is "+g_mang_cd_8 );
}
String g_mang_cd_9 = req.getParameter("g_mang_cd_9");
if( g_mang_cd_9 == null){
	System.out.println(this.toString+" : g_mang_cd_9 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_9 is "+g_mang_cd_9 );
}
String g_mang_cd_10 = req.getParameter("g_mang_cd_10");
if( g_mang_cd_10 == null){
	System.out.println(this.toString+" : g_mang_cd_10 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_10 is "+g_mang_cd_10 );
}
String g_mang_cd_11 = req.getParameter("g_mang_cd_11");
if( g_mang_cd_11 == null){
	System.out.println(this.toString+" : g_mang_cd_11 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_11 is "+g_mang_cd_11 );
}
String g_mang_cd_12 = req.getParameter("g_mang_cd_12");
if( g_mang_cd_12 == null){
	System.out.println(this.toString+" : g_mang_cd_12 is null" );
}else{
	System.out.println(this.toString+" : g_mang_cd_12 is "+g_mang_cd_12 );
}
String g_tbl_nm = req.getParameter("g_tbl_nm");
if( g_tbl_nm == null){
	System.out.println(this.toString+" : g_tbl_nm is null" );
}else{
	System.out.println(this.toString+" : g_tbl_nm is "+g_tbl_nm );
}
String g_remk = req.getParameter("g_remk");
if( g_remk == null){
	System.out.println(this.toString+" : g_remk is null" );
}else{
	System.out.println(this.toString+" : g_remk is "+g_remk );
}
String g_upd_yn = req.getParameter("g_upd_yn");
if( g_upd_yn == null){
	System.out.println(this.toString+" : g_upd_yn is null" );
}else{
	System.out.println(this.toString+" : g_upd_yn is "+g_upd_yn );
}
String g_incmg_pers_ip = req.getParameter("g_incmg_pers_ip");
if( g_incmg_pers_ip == null){
	System.out.println(this.toString+" : g_incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : g_incmg_pers_ip is "+g_incmg_pers_ip );
}
String g_incmg_pers = req.getParameter("g_incmg_pers");
if( g_incmg_pers == null){
	System.out.println(this.toString+" : g_incmg_pers is null" );
}else{
	System.out.println(this.toString+" : g_incmg_pers is "+g_incmg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String cdnm = req.getParameter("cdnm");
if( cdnm == null){
	System.out.println(this.toString+" : cdnm is null" );
}else{
	System.out.println(this.toString+" : cdnm is "+cdnm );
}
String cd_abrv_nm = req.getParameter("cd_abrv_nm");
if( cd_abrv_nm == null){
	System.out.println(this.toString+" : cd_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : cd_abrv_nm is "+cd_abrv_nm );
}
String mang_cd_1 = req.getParameter("mang_cd_1");
if( mang_cd_1 == null){
	System.out.println(this.toString+" : mang_cd_1 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_1 is "+mang_cd_1 );
}
String mang_cd_2 = req.getParameter("mang_cd_2");
if( mang_cd_2 == null){
	System.out.println(this.toString+" : mang_cd_2 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_2 is "+mang_cd_2 );
}
String mang_cd_3 = req.getParameter("mang_cd_3");
if( mang_cd_3 == null){
	System.out.println(this.toString+" : mang_cd_3 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_3 is "+mang_cd_3 );
}
String mang_cd_4 = req.getParameter("mang_cd_4");
if( mang_cd_4 == null){
	System.out.println(this.toString+" : mang_cd_4 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_4 is "+mang_cd_4 );
}
String mang_cd_5 = req.getParameter("mang_cd_5");
if( mang_cd_5 == null){
	System.out.println(this.toString+" : mang_cd_5 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_5 is "+mang_cd_5 );
}
String mang_cd_6 = req.getParameter("mang_cd_6");
if( mang_cd_6 == null){
	System.out.println(this.toString+" : mang_cd_6 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_6 is "+mang_cd_6 );
}
String mang_cd_7 = req.getParameter("mang_cd_7");
if( mang_cd_7 == null){
	System.out.println(this.toString+" : mang_cd_7 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_7 is "+mang_cd_7 );
}
String mang_cd_8 = req.getParameter("mang_cd_8");
if( mang_cd_8 == null){
	System.out.println(this.toString+" : mang_cd_8 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_8 is "+mang_cd_8 );
}
String mang_cd_9 = req.getParameter("mang_cd_9");
if( mang_cd_9 == null){
	System.out.println(this.toString+" : mang_cd_9 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_9 is "+mang_cd_9 );
}
String mang_cd_10 = req.getParameter("mang_cd_10");
if( mang_cd_10 == null){
	System.out.println(this.toString+" : mang_cd_10 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_10 is "+mang_cd_10 );
}
String mang_cd_11 = req.getParameter("mang_cd_11");
if( mang_cd_11 == null){
	System.out.println(this.toString+" : mang_cd_11 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_11 is "+mang_cd_11 );
}
String mang_cd_12 = req.getParameter("mang_cd_12");
if( mang_cd_12 == null){
	System.out.println(this.toString+" : mang_cd_12 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_12 is "+mang_cd_12 );
}
String tbl_nm = req.getParameter("tbl_nm");
if( tbl_nm == null){
	System.out.println(this.toString+" : tbl_nm is null" );
}else{
	System.out.println(this.toString+" : tbl_nm is "+tbl_nm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String upd_yn = req.getParameter("upd_yn");
if( upd_yn == null){
	System.out.println(this.toString+" : upd_yn is null" );
}else{
	System.out.println(this.toString+" : upd_yn is "+upd_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String g_mode = Util.checkString(req.getParameter("g_mode"));
String g_cmpy_cd = Util.checkString(req.getParameter("g_cmpy_cd"));
String g_job_clsf = Util.checkString(req.getParameter("g_job_clsf"));
String g_cd_clsf = Util.checkString(req.getParameter("g_cd_clsf"));
String g_cd = Util.checkString(req.getParameter("g_cd"));
String g_use_yn = Util.checkString(req.getParameter("g_use_yn"));
String g_cdnm = Util.checkString(req.getParameter("g_cdnm"));
String g_cd_abrv_nm = Util.checkString(req.getParameter("g_cd_abrv_nm"));
String g_mang_cd_1 = Util.checkString(req.getParameter("g_mang_cd_1"));
String g_mang_cd_2 = Util.checkString(req.getParameter("g_mang_cd_2"));
String g_mang_cd_3 = Util.checkString(req.getParameter("g_mang_cd_3"));
String g_mang_cd_4 = Util.checkString(req.getParameter("g_mang_cd_4"));
String g_mang_cd_5 = Util.checkString(req.getParameter("g_mang_cd_5"));
String g_mang_cd_6 = Util.checkString(req.getParameter("g_mang_cd_6"));
String g_mang_cd_7 = Util.checkString(req.getParameter("g_mang_cd_7"));
String g_mang_cd_8 = Util.checkString(req.getParameter("g_mang_cd_8"));
String g_mang_cd_9 = Util.checkString(req.getParameter("g_mang_cd_9"));
String g_mang_cd_10 = Util.checkString(req.getParameter("g_mang_cd_10"));
String g_mang_cd_11 = Util.checkString(req.getParameter("g_mang_cd_11"));
String g_mang_cd_12 = Util.checkString(req.getParameter("g_mang_cd_12"));
String g_tbl_nm = Util.checkString(req.getParameter("g_tbl_nm"));
String g_remk = Util.checkString(req.getParameter("g_remk"));
String g_upd_yn = Util.checkString(req.getParameter("g_upd_yn"));
String g_incmg_pers_ip = Util.checkString(req.getParameter("g_incmg_pers_ip"));
String g_incmg_pers = Util.checkString(req.getParameter("g_incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String cd = Util.checkString(req.getParameter("cd"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String cdnm = Util.checkString(req.getParameter("cdnm"));
String cd_abrv_nm = Util.checkString(req.getParameter("cd_abrv_nm"));
String mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));
String mang_cd_2 = Util.checkString(req.getParameter("mang_cd_2"));
String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
String mang_cd_4 = Util.checkString(req.getParameter("mang_cd_4"));
String mang_cd_5 = Util.checkString(req.getParameter("mang_cd_5"));
String mang_cd_6 = Util.checkString(req.getParameter("mang_cd_6"));
String mang_cd_7 = Util.checkString(req.getParameter("mang_cd_7"));
String mang_cd_8 = Util.checkString(req.getParameter("mang_cd_8"));
String mang_cd_9 = Util.checkString(req.getParameter("mang_cd_9"));
String mang_cd_10 = Util.checkString(req.getParameter("mang_cd_10"));
String mang_cd_11 = Util.checkString(req.getParameter("mang_cd_11"));
String mang_cd_12 = Util.checkString(req.getParameter("mang_cd_12"));
String tbl_nm = Util.checkString(req.getParameter("tbl_nm"));
String remk = Util.checkString(req.getParameter("remk"));
String upd_yn = Util.checkString(req.getParameter("upd_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String g_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mode")));
String g_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("g_cmpy_cd")));
String g_job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("g_job_clsf")));
String g_cd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("g_cd_clsf")));
String g_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("g_cd")));
String g_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("g_use_yn")));
String g_cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("g_cdnm")));
String g_cd_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("g_cd_abrv_nm")));
String g_mang_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_1")));
String g_mang_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_2")));
String g_mang_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_3")));
String g_mang_cd_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_4")));
String g_mang_cd_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_5")));
String g_mang_cd_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_6")));
String g_mang_cd_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_7")));
String g_mang_cd_8 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_8")));
String g_mang_cd_9 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_9")));
String g_mang_cd_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_10")));
String g_mang_cd_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_11")));
String g_mang_cd_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mang_cd_12")));
String g_tbl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("g_tbl_nm")));
String g_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("g_remk")));
String g_upd_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("g_upd_yn")));
String g_incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("g_incmg_pers_ip")));
String g_incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("g_incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));
String cd_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_abrv_nm")));
String mang_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_1")));
String mang_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_2")));
String mang_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_3")));
String mang_cd_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_4")));
String mang_cd_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_5")));
String mang_cd_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_6")));
String mang_cd_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_7")));
String mang_cd_8 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_8")));
String mang_cd_9 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_9")));
String mang_cd_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_10")));
String mang_cd_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_11")));
String mang_cd_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_12")));
String tbl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("tbl_nm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String upd_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setG_mode(g_mode);
dm.setG_cmpy_cd(g_cmpy_cd);
dm.setG_job_clsf(g_job_clsf);
dm.setG_cd_clsf(g_cd_clsf);
dm.setG_cd(g_cd);
dm.setG_use_yn(g_use_yn);
dm.setG_cdnm(g_cdnm);
dm.setG_cd_abrv_nm(g_cd_abrv_nm);
dm.setG_mang_cd_1(g_mang_cd_1);
dm.setG_mang_cd_2(g_mang_cd_2);
dm.setG_mang_cd_3(g_mang_cd_3);
dm.setG_mang_cd_4(g_mang_cd_4);
dm.setG_mang_cd_5(g_mang_cd_5);
dm.setG_mang_cd_6(g_mang_cd_6);
dm.setG_mang_cd_7(g_mang_cd_7);
dm.setG_mang_cd_8(g_mang_cd_8);
dm.setG_mang_cd_9(g_mang_cd_9);
dm.setG_mang_cd_10(g_mang_cd_10);
dm.setG_mang_cd_11(g_mang_cd_11);
dm.setG_mang_cd_12(g_mang_cd_12);
dm.setG_tbl_nm(g_tbl_nm);
dm.setG_remk(g_remk);
dm.setG_upd_yn(g_upd_yn);
dm.setG_incmg_pers_ip(g_incmg_pers_ip);
dm.setG_incmg_pers(g_incmg_pers);
dm.setMode(mode);
dm.setCd(cd);
dm.setUse_yn(use_yn);
dm.setCdnm(cdnm);
dm.setCd_abrv_nm(cd_abrv_nm);
dm.setMang_cd_1(mang_cd_1);
dm.setMang_cd_2(mang_cd_2);
dm.setMang_cd_3(mang_cd_3);
dm.setMang_cd_4(mang_cd_4);
dm.setMang_cd_5(mang_cd_5);
dm.setMang_cd_6(mang_cd_6);
dm.setMang_cd_7(mang_cd_7);
dm.setMang_cd_8(mang_cd_8);
dm.setMang_cd_9(mang_cd_9);
dm.setMang_cd_10(mang_cd_10);
dm.setMang_cd_11(mang_cd_11);
dm.setMang_cd_12(mang_cd_12);
dm.setTbl_nm(tbl_nm);
dm.setRemk(remk);
dm.setUpd_yn(upd_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 17:07:32 KST 2009 */