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


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_1020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String yymm;
	public String medi_cd;
	public String tms;
	public String cyov_dt;
	public String send_basi_dt;
	public String val_meda_yn;
	public String qty_sell_net_clsf;
	public String val_aply_basi_clsf;
	public String val_rate;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_QTY_1020_ADM(){}
	public SE_QTY_1020_ADM(String mode, String cmpy_cd, String yymm, String medi_cd, String tms, String cyov_dt, String send_basi_dt, String val_meda_yn, String qty_sell_net_clsf, String val_aply_basi_clsf, String val_rate, String incmg_pers_ip, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.medi_cd = medi_cd;
		this.tms = tms;
		this.cyov_dt = cyov_dt;
		this.send_basi_dt = send_basi_dt;
		this.val_meda_yn = val_meda_yn;
		this.qty_sell_net_clsf = qty_sell_net_clsf;
		this.val_aply_basi_clsf = val_aply_basi_clsf;
		this.val_rate = val_rate;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setCyov_dt(String cyov_dt){
		this.cyov_dt = cyov_dt;
	}

	public void setSend_basi_dt(String send_basi_dt){
		this.send_basi_dt = send_basi_dt;
	}

	public void setVal_meda_yn(String val_meda_yn){
		this.val_meda_yn = val_meda_yn;
	}

	public void setQty_sell_net_clsf(String qty_sell_net_clsf){
		this.qty_sell_net_clsf = qty_sell_net_clsf;
	}

	public void setVal_aply_basi_clsf(String val_aply_basi_clsf){
		this.val_aply_basi_clsf = val_aply_basi_clsf;
	}

	public void setVal_rate(String val_rate){
		this.val_rate = val_rate;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getCyov_dt(){
		return this.cyov_dt;
	}

	public String getSend_basi_dt(){
		return this.send_basi_dt;
	}

	public String getVal_meda_yn(){
		return this.val_meda_yn;
	}

	public String getQty_sell_net_clsf(){
		return this.qty_sell_net_clsf;
	}

	public String getVal_aply_basi_clsf(){
		return this.val_aply_basi_clsf;
	}

	public String getVal_rate(){
		return this.val_rate;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_QTY_1020_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_1020_ADM dm = (SE_QTY_1020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.tms);
		cstmt.setString(8, dm.cyov_dt);
		cstmt.setString(9, dm.send_basi_dt);
		cstmt.setString(10, dm.val_meda_yn);
		cstmt.setString(11, dm.qty_sell_net_clsf);
		cstmt.setString(12, dm.val_aply_basi_clsf);
		cstmt.setString(13, dm.val_rate);
		cstmt.setString(14, dm.incmg_pers_ip);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_1020_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yymm = " + getYymm());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("tms = " + getTms());
        System.out.println("cyov_dt = " + getCyov_dt());
        System.out.println("send_basi_dt = " + getSend_basi_dt());
        System.out.println("val_meda_yn = " + getVal_meda_yn());
        System.out.println("qty_sell_net_clsf = " + getQty_sell_net_clsf());
        System.out.println("val_aply_basi_clsf = " + getVal_aply_basi_clsf());
        System.out.println("val_rate = " + getVal_rate());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String cyov_dt = req.getParameter("cyov_dt");
if( cyov_dt == null){
	System.out.println(this.toString+" : cyov_dt is null" );
}else{
	System.out.println(this.toString+" : cyov_dt is "+cyov_dt );
}
String send_basi_dt = req.getParameter("send_basi_dt");
if( send_basi_dt == null){
	System.out.println(this.toString+" : send_basi_dt is null" );
}else{
	System.out.println(this.toString+" : send_basi_dt is "+send_basi_dt );
}
String val_meda_yn = req.getParameter("val_meda_yn");
if( val_meda_yn == null){
	System.out.println(this.toString+" : val_meda_yn is null" );
}else{
	System.out.println(this.toString+" : val_meda_yn is "+val_meda_yn );
}
String qty_sell_net_clsf = req.getParameter("qty_sell_net_clsf");
if( qty_sell_net_clsf == null){
	System.out.println(this.toString+" : qty_sell_net_clsf is null" );
}else{
	System.out.println(this.toString+" : qty_sell_net_clsf is "+qty_sell_net_clsf );
}
String val_aply_basi_clsf = req.getParameter("val_aply_basi_clsf");
if( val_aply_basi_clsf == null){
	System.out.println(this.toString+" : val_aply_basi_clsf is null" );
}else{
	System.out.println(this.toString+" : val_aply_basi_clsf is "+val_aply_basi_clsf );
}
String val_rate = req.getParameter("val_rate");
if( val_rate == null){
	System.out.println(this.toString+" : val_rate is null" );
}else{
	System.out.println(this.toString+" : val_rate is "+val_rate );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String tms = Util.checkString(req.getParameter("tms"));
String cyov_dt = Util.checkString(req.getParameter("cyov_dt"));
String send_basi_dt = Util.checkString(req.getParameter("send_basi_dt"));
String val_meda_yn = Util.checkString(req.getParameter("val_meda_yn"));
String qty_sell_net_clsf = Util.checkString(req.getParameter("qty_sell_net_clsf"));
String val_aply_basi_clsf = Util.checkString(req.getParameter("val_aply_basi_clsf"));
String val_rate = Util.checkString(req.getParameter("val_rate"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String cyov_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cyov_dt")));
String send_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("send_basi_dt")));
String val_meda_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("val_meda_yn")));
String qty_sell_net_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("qty_sell_net_clsf")));
String val_aply_basi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("val_aply_basi_clsf")));
String val_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("val_rate")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setMedi_cd(medi_cd);
dm.setTms(tms);
dm.setCyov_dt(cyov_dt);
dm.setSend_basi_dt(send_basi_dt);
dm.setVal_meda_yn(val_meda_yn);
dm.setQty_sell_net_clsf(qty_sell_net_clsf);
dm.setVal_aply_basi_clsf(val_aply_basi_clsf);
dm.setVal_rate(val_rate);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 14:23:26 KST 2009 */