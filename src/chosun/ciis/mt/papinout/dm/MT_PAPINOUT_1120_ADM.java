/***************************************************************************************************
* 파일명 : MT_PAPINOT_1120_ADM.java
* 기능 : 원재료관리 - 용지재고현황 및 소요량
* 작성일자 : 2011-03-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_1120_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String issu_remk;
	public String mode;
	public String ewh_dt;
	public String fac_clsf;
	public String matr_cd;
	public String ewh_roll_cnt;
	public String ewh_wgt;
	public String roll_wgt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public MT_PAPINOUT_1120_ADM(){}
	public MT_PAPINOUT_1120_ADM(String cmpy_cd, String issu_dt, String issu_remk, String mode, String ewh_dt, String fac_clsf, String matr_cd, String ewh_roll_cnt, String ewh_wgt, String roll_wgt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.issu_remk = issu_remk;
		this.mode = mode;
		this.ewh_dt = ewh_dt;
		this.fac_clsf = fac_clsf;
		this.matr_cd = matr_cd;
		this.ewh_roll_cnt = ewh_roll_cnt;
		this.ewh_wgt = ewh_wgt;
		this.roll_wgt = roll_wgt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}
	
	public void setIssu_remk(String issu_remk){
		this.issu_remk = issu_remk;
	}
	
	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setEwh_roll_cnt(String ewh_roll_cnt){
		this.ewh_roll_cnt = ewh_roll_cnt;
	}

	public void setEwh_wgt(String ewh_wgt){
		this.ewh_wgt = ewh_wgt;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}
	
	public String getIssu_remk(){
		return this.issu_remk;
	}
	
	public String getMode(){
		return this.mode;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getEwh_roll_cnt(){
		return this.ewh_roll_cnt;
	}

	public String getEwh_wgt(){
		return this.ewh_wgt;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_MT_PAPINOUT_1120_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_1120_ADM dm = (MT_PAPINOUT_1120_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt);
		cstmt.setString(5, dm.issu_remk);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.ewh_dt);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.matr_cd);
		cstmt.setString(10, dm.ewh_roll_cnt);
		cstmt.setString(11, dm.ewh_wgt);
		cstmt.setString(12, dm.roll_wgt);
		cstmt.setString(13, dm.incmg_pers_ip);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_1120_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("ewh_dt = " + getEwh_dt());
        System.out.println("fac_clsf = " + getFac_clsf());
        System.out.println("matr_cd = " + getMatr_cd());
        System.out.println("ewh_roll_cnt = " + getEwh_roll_cnt());
        System.out.println("ewg_wgt = " + getEwh_wgt());
        System.out.println("roll_wgt = " + getRoll_wgt());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String aply_yymm = req.getParameter("aply_yymm");
if( aply_yymm == null){
	System.out.println(this.toString+" : aply_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_yymm is "+aply_yymm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sell_net_clsf = req.getParameter("sell_net_clsf");
if( sell_net_clsf == null){
	System.out.println(this.toString+" : sell_net_clsf is null" );
}else{
	System.out.println(this.toString+" : sell_net_clsf is "+sell_net_clsf );
}
String uprc_amt = req.getParameter("uprc_amt");
if( uprc_amt == null){
	System.out.println(this.toString+" : uprc_amt is null" );
}else{
	System.out.println(this.toString+" : uprc_amt is "+uprc_amt );
}
String uprc_aply_clsf = req.getParameter("uprc_aply_clsf");
if( uprc_aply_clsf == null){
	System.out.println(this.toString+" : uprc_aply_clsf is null" );
}else{
	System.out.println(this.toString+" : uprc_aply_clsf is "+uprc_aply_clsf );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String mode = Util.checkString(req.getParameter("mode"));
String aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sell_net_clsf = Util.checkString(req.getParameter("sell_net_clsf"));
String uprc_amt = Util.checkString(req.getParameter("uprc_amt"));
String uprc_aply_clsf = Util.checkString(req.getParameter("uprc_aply_clsf"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String aply_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sell_net_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_net_clsf")));
String uprc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_amt")));
String uprc_aply_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_aply_clsf")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setAply_yymm(aply_yymm);
dm.setMedi_cd(medi_cd);
dm.setSell_net_clsf(sell_net_clsf);
dm.setUprc_amt(uprc_amt);
dm.setUprc_aply_clsf(uprc_aply_clsf);
dm.setRemk(remk);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 15:29:10 KST 2009 */