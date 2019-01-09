/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.ds.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1160_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String cmpy_cd;
	public String bns_item_cd;
	public String bns_item_nm;
	public String bns_item_clas;
	public String medi_cd;
	public String yy_plan_stok_qunt;
	public String stok_qunt;
	public String unit;
	public String stok_mang_yn;
	public String rchps_clsf;
	public String clgps_clsf;
	public String stmt_issu_clsf;
	public String send_clsf;
	public String aplc_frdt;
	public String aplc_todt;
	public String aplc_clos_tm;
	public String remk;
	public String stmt_item_clsf;
	public String use_yn;
	public String incmgpers;
	public String incmg_pers_ip;

	public SE_BNS_1160_ADM(){}
	public SE_BNS_1160_ADM(String accflag, String cmpy_cd, String bns_item_cd, String bns_item_nm, String bns_item_clas, String medi_cd, String yy_plan_stok_qunt, String stok_qunt, String unit, String stok_mang_yn, String rchps_clsf, String clgps_clsf, String stmt_issu_clsf, String send_clsf, String aplc_frdt, String aplc_todt, String aplc_clos_tm, String remk, String stmt_item_clsf, String use_yn, String incmgpers, String incmg_pers_ip){
		this.accflag = accflag;
		this.cmpy_cd = cmpy_cd;
		this.bns_item_cd = bns_item_cd;
		this.bns_item_nm = bns_item_nm;
		this.bns_item_clas = bns_item_clas;
		this.medi_cd = medi_cd;
		this.yy_plan_stok_qunt = yy_plan_stok_qunt;
		this.stok_qunt = stok_qunt;
		this.unit = unit;
		this.stok_mang_yn = stok_mang_yn;
		this.rchps_clsf = rchps_clsf;
		this.clgps_clsf = clgps_clsf;
		this.stmt_issu_clsf = stmt_issu_clsf;
		this.send_clsf = send_clsf;
		this.aplc_frdt = aplc_frdt;
		this.aplc_todt = aplc_todt;
		this.aplc_clos_tm = aplc_clos_tm;
		this.remk = remk;
		this.stmt_item_clsf = stmt_item_clsf;
		this.use_yn = use_yn;
		this.incmgpers = incmgpers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setBns_item_nm(String bns_item_nm){
		this.bns_item_nm = bns_item_nm;
	}

	public void setBns_item_clas(String bns_item_clas){
		this.bns_item_clas = bns_item_clas;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setYy_plan_stok_qunt(String yy_plan_stok_qunt){
		this.yy_plan_stok_qunt = yy_plan_stok_qunt;
	}

	public void setStok_qunt(String stok_qunt){
		this.stok_qunt = stok_qunt;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setStok_mang_yn(String stok_mang_yn){
		this.stok_mang_yn = stok_mang_yn;
	}

	public void setRchps_clsf(String rchps_clsf){
		this.rchps_clsf = rchps_clsf;
	}

	public void setClgps_clsf(String clgps_clsf){
		this.clgps_clsf = clgps_clsf;
	}

	public void setStmt_issu_clsf(String stmt_issu_clsf){
		this.stmt_issu_clsf = stmt_issu_clsf;
	}

	public void setSend_clsf(String send_clsf){
		this.send_clsf = send_clsf;
	}

	public void setAplc_frdt(String aplc_frdt){
		this.aplc_frdt = aplc_frdt;
	}

	public void setAplc_todt(String aplc_todt){
		this.aplc_todt = aplc_todt;
	}

	public void setAplc_clos_tm(String aplc_clos_tm){
		this.aplc_clos_tm = aplc_clos_tm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setStmt_item_clsf(String stmt_item_clsf){
		this.stmt_item_clsf = stmt_item_clsf;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getBns_item_nm(){
		return this.bns_item_nm;
	}

	public String getBns_item_clas(){
		return this.bns_item_clas;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getYy_plan_stok_qunt(){
		return this.yy_plan_stok_qunt;
	}

	public String getStok_qunt(){
		return this.stok_qunt;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getStok_mang_yn(){
		return this.stok_mang_yn;
	}

	public String getRchps_clsf(){
		return this.rchps_clsf;
	}

	public String getClgps_clsf(){
		return this.clgps_clsf;
	}

	public String getStmt_issu_clsf(){
		return this.stmt_issu_clsf;
	}

	public String getSend_clsf(){
		return this.send_clsf;
	}

	public String getAplc_frdt(){
		return this.aplc_frdt;
	}

	public String getAplc_todt(){
		return this.aplc_todt;
	}

	public String getAplc_clos_tm(){
		return this.aplc_clos_tm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getStmt_item_clsf(){
		return this.stmt_item_clsf;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BNS_1160_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1160_ADM dm = (SE_BNS_1160_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.bns_item_cd);
		cstmt.setString(6, dm.bns_item_nm);
		cstmt.setString(7, dm.bns_item_clas);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.yy_plan_stok_qunt);
		cstmt.setString(10, dm.stok_qunt);
		cstmt.setString(11, dm.unit);
		cstmt.setString(12, dm.stok_mang_yn);
		cstmt.setString(13, dm.rchps_clsf);
		cstmt.setString(14, dm.clgps_clsf);
		cstmt.setString(15, dm.stmt_issu_clsf);
		cstmt.setString(16, dm.send_clsf);
		cstmt.setString(17, dm.aplc_frdt);
		cstmt.setString(18, dm.aplc_todt);
		cstmt.setString(19, dm.aplc_clos_tm);
		cstmt.setString(20, dm.remk);
		cstmt.setString(21, dm.stmt_item_clsf);
		cstmt.setString(22, dm.use_yn);
		cstmt.setString(23, dm.incmgpers);
		cstmt.setString(24, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1160_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bns_item_cd = [" + getBns_item_cd() + "]");
		System.out.println("bns_item_nm = [" + getBns_item_nm() + "]");
		System.out.println("bns_item_clas = [" + getBns_item_clas() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("yy_plan_stok_qunt = [" + getYy_plan_stok_qunt() + "]");
		System.out.println("stok_qunt = [" + getStok_qunt() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("stok_mang_yn = [" + getStok_mang_yn() + "]");
		System.out.println("rchps_clsf = [" + getRchps_clsf() + "]");
		System.out.println("clgps_clsf = [" + getClgps_clsf() + "]");
		System.out.println("stmt_issu_clsf = [" + getStmt_issu_clsf() + "]");
		System.out.println("send_clsf = [" + getSend_clsf() + "]");
		System.out.println("aplc_frdt = [" + getAplc_frdt() + "]");
		System.out.println("aplc_todt = [" + getAplc_todt() + "]");
		System.out.println("aplc_clos_tm = [" + getAplc_clos_tm() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("stmt_item_clsf = [" + getStmt_item_clsf() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String bns_item_cd = req.getParameter("bns_item_cd");
if( bns_item_cd == null){
	System.out.println(this.toString+" : bns_item_cd is null" );
}else{
	System.out.println(this.toString+" : bns_item_cd is "+bns_item_cd );
}
String bns_item_nm = req.getParameter("bns_item_nm");
if( bns_item_nm == null){
	System.out.println(this.toString+" : bns_item_nm is null" );
}else{
	System.out.println(this.toString+" : bns_item_nm is "+bns_item_nm );
}
String bns_item_clas = req.getParameter("bns_item_clas");
if( bns_item_clas == null){
	System.out.println(this.toString+" : bns_item_clas is null" );
}else{
	System.out.println(this.toString+" : bns_item_clas is "+bns_item_clas );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String yy_plan_stok_qunt = req.getParameter("yy_plan_stok_qunt");
if( yy_plan_stok_qunt == null){
	System.out.println(this.toString+" : yy_plan_stok_qunt is null" );
}else{
	System.out.println(this.toString+" : yy_plan_stok_qunt is "+yy_plan_stok_qunt );
}
String stok_qunt = req.getParameter("stok_qunt");
if( stok_qunt == null){
	System.out.println(this.toString+" : stok_qunt is null" );
}else{
	System.out.println(this.toString+" : stok_qunt is "+stok_qunt );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String stok_mang_yn = req.getParameter("stok_mang_yn");
if( stok_mang_yn == null){
	System.out.println(this.toString+" : stok_mang_yn is null" );
}else{
	System.out.println(this.toString+" : stok_mang_yn is "+stok_mang_yn );
}
String rchps_clsf = req.getParameter("rchps_clsf");
if( rchps_clsf == null){
	System.out.println(this.toString+" : rchps_clsf is null" );
}else{
	System.out.println(this.toString+" : rchps_clsf is "+rchps_clsf );
}
String clgps_clsf = req.getParameter("clgps_clsf");
if( clgps_clsf == null){
	System.out.println(this.toString+" : clgps_clsf is null" );
}else{
	System.out.println(this.toString+" : clgps_clsf is "+clgps_clsf );
}
String stmt_issu_clsf = req.getParameter("stmt_issu_clsf");
if( stmt_issu_clsf == null){
	System.out.println(this.toString+" : stmt_issu_clsf is null" );
}else{
	System.out.println(this.toString+" : stmt_issu_clsf is "+stmt_issu_clsf );
}
String send_clsf = req.getParameter("send_clsf");
if( send_clsf == null){
	System.out.println(this.toString+" : send_clsf is null" );
}else{
	System.out.println(this.toString+" : send_clsf is "+send_clsf );
}
String aplc_frdt = req.getParameter("aplc_frdt");
if( aplc_frdt == null){
	System.out.println(this.toString+" : aplc_frdt is null" );
}else{
	System.out.println(this.toString+" : aplc_frdt is "+aplc_frdt );
}
String aplc_todt = req.getParameter("aplc_todt");
if( aplc_todt == null){
	System.out.println(this.toString+" : aplc_todt is null" );
}else{
	System.out.println(this.toString+" : aplc_todt is "+aplc_todt );
}
String aplc_clos_tm = req.getParameter("aplc_clos_tm");
if( aplc_clos_tm == null){
	System.out.println(this.toString+" : aplc_clos_tm is null" );
}else{
	System.out.println(this.toString+" : aplc_clos_tm is "+aplc_clos_tm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String stmt_item_clsf = req.getParameter("stmt_item_clsf");
if( stmt_item_clsf == null){
	System.out.println(this.toString+" : stmt_item_clsf is null" );
}else{
	System.out.println(this.toString+" : stmt_item_clsf is "+stmt_item_clsf );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
String bns_item_nm = Util.checkString(req.getParameter("bns_item_nm"));
String bns_item_clas = Util.checkString(req.getParameter("bns_item_clas"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String yy_plan_stok_qunt = Util.checkString(req.getParameter("yy_plan_stok_qunt"));
String stok_qunt = Util.checkString(req.getParameter("stok_qunt"));
String unit = Util.checkString(req.getParameter("unit"));
String stok_mang_yn = Util.checkString(req.getParameter("stok_mang_yn"));
String rchps_clsf = Util.checkString(req.getParameter("rchps_clsf"));
String clgps_clsf = Util.checkString(req.getParameter("clgps_clsf"));
String stmt_issu_clsf = Util.checkString(req.getParameter("stmt_issu_clsf"));
String send_clsf = Util.checkString(req.getParameter("send_clsf"));
String aplc_frdt = Util.checkString(req.getParameter("aplc_frdt"));
String aplc_todt = Util.checkString(req.getParameter("aplc_todt"));
String aplc_clos_tm = Util.checkString(req.getParameter("aplc_clos_tm"));
String remk = Util.checkString(req.getParameter("remk"));
String stmt_item_clsf = Util.checkString(req.getParameter("stmt_item_clsf"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bns_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_cd")));
String bns_item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_nm")));
String bns_item_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_clas")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String yy_plan_stok_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("yy_plan_stok_qunt")));
String stok_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("stok_qunt")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String stok_mang_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("stok_mang_yn")));
String rchps_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rchps_clsf")));
String clgps_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clgps_clsf")));
String stmt_issu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_issu_clsf")));
String send_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("send_clsf")));
String aplc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_frdt")));
String aplc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_todt")));
String aplc_clos_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_clos_tm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String stmt_item_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_item_clsf")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCmpy_cd(cmpy_cd);
dm.setBns_item_cd(bns_item_cd);
dm.setBns_item_nm(bns_item_nm);
dm.setBns_item_clas(bns_item_clas);
dm.setMedi_cd(medi_cd);
dm.setYy_plan_stok_qunt(yy_plan_stok_qunt);
dm.setStok_qunt(stok_qunt);
dm.setUnit(unit);
dm.setStok_mang_yn(stok_mang_yn);
dm.setRchps_clsf(rchps_clsf);
dm.setClgps_clsf(clgps_clsf);
dm.setStmt_issu_clsf(stmt_issu_clsf);
dm.setSend_clsf(send_clsf);
dm.setAplc_frdt(aplc_frdt);
dm.setAplc_todt(aplc_todt);
dm.setAplc_clos_tm(aplc_clos_tm);
dm.setRemk(remk);
dm.setStmt_item_clsf(stmt_item_clsf);
dm.setUse_yn(use_yn);
dm.setIncmgpers(incmgpers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 11 14:58:07 KST 2017 */