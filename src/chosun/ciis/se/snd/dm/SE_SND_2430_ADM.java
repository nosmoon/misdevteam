/***************************************************************************************************
* 파일명 : 
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


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2430_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String aply_dt_key;
	public String aply_dt;
	public String tran_uprc_clas;
	public String tran_uprc_cd;
	public String tran_uprc_route_nm;
	public String route_clsf;
	public String route_cd;
	public String prt_plac_cd;
	public String load_wgt;
	public String route_lgth;
	public String rmks;
	public String cnsg_seqo;
	public String tran_cost;
	public String use_yn;
	public String tran_uprc_qty_clsf;
	public String medi_cd;
	public String sect_cd;
	public String qty;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_SND_2430_ADM(){}
	public SE_SND_2430_ADM(String cmpy_cd, String mode, String aply_dt_key, String aply_dt, String tran_uprc_clas, String tran_uprc_cd, String tran_uprc_route_nm, String route_clsf, String route_cd, String prt_plac_cd, String load_wgt, String route_lgth, String rmks, String cnsg_seqo, String tran_cost, String use_yn, String tran_uprc_qty_clsf, String medi_cd, String sect_cd, String qty, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.aply_dt_key = aply_dt_key;
		this.aply_dt = aply_dt;
		this.tran_uprc_clas = tran_uprc_clas;
		this.tran_uprc_cd = tran_uprc_cd;
		this.tran_uprc_route_nm = tran_uprc_route_nm;
		this.route_clsf = route_clsf;
		this.route_cd = route_cd;
		this.prt_plac_cd = prt_plac_cd;
		this.load_wgt = load_wgt;
		this.route_lgth = route_lgth;
		this.rmks = rmks;
		this.cnsg_seqo = cnsg_seqo;
		this.tran_cost = tran_cost;
		this.use_yn = use_yn;
		this.tran_uprc_qty_clsf = tran_uprc_qty_clsf;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.qty = qty;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setAply_dt_key(String aply_dt_key){
		this.aply_dt_key = aply_dt_key;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setTran_uprc_route_nm(String tran_uprc_route_nm){
		this.tran_uprc_route_nm = tran_uprc_route_nm;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setLoad_wgt(String load_wgt){
		this.load_wgt = load_wgt;
	}

	public void setRoute_lgth(String route_lgth){
		this.route_lgth = route_lgth;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setCnsg_seqo(String cnsg_seqo){
		this.cnsg_seqo = cnsg_seqo;
	}

	public void setTran_cost(String tran_cost){
		this.tran_cost = tran_cost;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setTran_uprc_qty_clsf(String tran_uprc_qty_clsf){
		this.tran_uprc_qty_clsf = tran_uprc_qty_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setQty(String qty){
		this.qty = qty;
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

	public String getMode(){
		return this.mode;
	}

	public String getAply_dt_key(){
		return this.aply_dt_key;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getTran_uprc_route_nm(){
		return this.tran_uprc_route_nm;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getLoad_wgt(){
		return this.load_wgt;
	}

	public String getRoute_lgth(){
		return this.route_lgth;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getCnsg_seqo(){
		return this.cnsg_seqo;
	}

	public String getTran_cost(){
		return this.tran_cost;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getTran_uprc_qty_clsf(){
		return this.tran_uprc_qty_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getQty(){
		return this.qty;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_2430_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2430_ADM dm = (SE_SND_2430_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.aply_dt_key);
		cstmt.setString(6, dm.aply_dt);
		cstmt.setString(7, dm.tran_uprc_clas);
		cstmt.setString(8, dm.tran_uprc_cd);
		cstmt.setString(9, dm.tran_uprc_route_nm);
		cstmt.setString(10, dm.route_clsf);
		cstmt.setString(11, dm.route_cd);
		cstmt.setString(12, dm.prt_plac_cd);
		cstmt.setString(13, dm.load_wgt);
		cstmt.setString(14, dm.route_lgth);
		cstmt.setString(15, dm.rmks);
		cstmt.setString(16, dm.cnsg_seqo);
		cstmt.setString(17, dm.tran_cost);
		cstmt.setString(18, dm.use_yn);
		cstmt.setString(19, dm.tran_uprc_qty_clsf);
		cstmt.setString(20, dm.medi_cd);
		cstmt.setString(21, dm.sect_cd);
		cstmt.setString(22, dm.qty);
		cstmt.setString(23, dm.incmg_pers_ip);
		cstmt.setString(24, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2430_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("aply_dt_key = [" + getAply_dt_key() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("tran_uprc_clas = [" + getTran_uprc_clas() + "]");
		System.out.println("tran_uprc_cd = [" + getTran_uprc_cd() + "]");
		System.out.println("tran_uprc_route_nm = [" + getTran_uprc_route_nm() + "]");
		System.out.println("route_clsf = [" + getRoute_clsf() + "]");
		System.out.println("route_cd = [" + getRoute_cd() + "]");
		System.out.println("prt_plac_cd = [" + getPrt_plac_cd() + "]");
		System.out.println("load_wgt = [" + getLoad_wgt() + "]");
		System.out.println("route_lgth = [" + getRoute_lgth() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("cnsg_seqo = [" + getCnsg_seqo() + "]");
		System.out.println("tran_cost = [" + getTran_cost() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("tran_uprc_qty_clsf = [" + getTran_uprc_qty_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String aply_dt_key = req.getParameter("aply_dt_key");
if( aply_dt_key == null){
	System.out.println(this.toString+" : aply_dt_key is null" );
}else{
	System.out.println(this.toString+" : aply_dt_key is "+aply_dt_key );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String tran_uprc_clas = req.getParameter("tran_uprc_clas");
if( tran_uprc_clas == null){
	System.out.println(this.toString+" : tran_uprc_clas is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_clas is "+tran_uprc_clas );
}
String tran_uprc_cd = req.getParameter("tran_uprc_cd");
if( tran_uprc_cd == null){
	System.out.println(this.toString+" : tran_uprc_cd is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_cd is "+tran_uprc_cd );
}
String tran_uprc_route_nm = req.getParameter("tran_uprc_route_nm");
if( tran_uprc_route_nm == null){
	System.out.println(this.toString+" : tran_uprc_route_nm is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_route_nm is "+tran_uprc_route_nm );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
String route_cd = req.getParameter("route_cd");
if( route_cd == null){
	System.out.println(this.toString+" : route_cd is null" );
}else{
	System.out.println(this.toString+" : route_cd is "+route_cd );
}
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String load_wgt = req.getParameter("load_wgt");
if( load_wgt == null){
	System.out.println(this.toString+" : load_wgt is null" );
}else{
	System.out.println(this.toString+" : load_wgt is "+load_wgt );
}
String route_lgth = req.getParameter("route_lgth");
if( route_lgth == null){
	System.out.println(this.toString+" : route_lgth is null" );
}else{
	System.out.println(this.toString+" : route_lgth is "+route_lgth );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String cnsg_seqo = req.getParameter("cnsg_seqo");
if( cnsg_seqo == null){
	System.out.println(this.toString+" : cnsg_seqo is null" );
}else{
	System.out.println(this.toString+" : cnsg_seqo is "+cnsg_seqo );
}
String tran_cost = req.getParameter("tran_cost");
if( tran_cost == null){
	System.out.println(this.toString+" : tran_cost is null" );
}else{
	System.out.println(this.toString+" : tran_cost is "+tran_cost );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String tran_uprc_qty_clsf = req.getParameter("tran_uprc_qty_clsf");
if( tran_uprc_qty_clsf == null){
	System.out.println(this.toString+" : tran_uprc_qty_clsf is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_qty_clsf is "+tran_uprc_qty_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
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
String aply_dt_key = Util.checkString(req.getParameter("aply_dt_key"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String tran_uprc_clas = Util.checkString(req.getParameter("tran_uprc_clas"));
String tran_uprc_cd = Util.checkString(req.getParameter("tran_uprc_cd"));
String tran_uprc_route_nm = Util.checkString(req.getParameter("tran_uprc_route_nm"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String load_wgt = Util.checkString(req.getParameter("load_wgt"));
String route_lgth = Util.checkString(req.getParameter("route_lgth"));
String rmks = Util.checkString(req.getParameter("rmks"));
String cnsg_seqo = Util.checkString(req.getParameter("cnsg_seqo"));
String tran_cost = Util.checkString(req.getParameter("tran_cost"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String tran_uprc_qty_clsf = Util.checkString(req.getParameter("tran_uprc_qty_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String qty = Util.checkString(req.getParameter("qty"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String aply_dt_key = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt_key")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String tran_uprc_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_clas")));
String tran_uprc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_cd")));
String tran_uprc_route_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_route_nm")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String load_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("load_wgt")));
String route_lgth = Util.Uni2Ksc(Util.checkString(req.getParameter("route_lgth")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String cnsg_seqo = Util.Uni2Ksc(Util.checkString(req.getParameter("cnsg_seqo")));
String tran_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_cost")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String tran_uprc_qty_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_qty_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setAply_dt_key(aply_dt_key);
dm.setAply_dt(aply_dt);
dm.setTran_uprc_clas(tran_uprc_clas);
dm.setTran_uprc_cd(tran_uprc_cd);
dm.setTran_uprc_route_nm(tran_uprc_route_nm);
dm.setRoute_clsf(route_clsf);
dm.setRoute_cd(route_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setLoad_wgt(load_wgt);
dm.setRoute_lgth(route_lgth);
dm.setRmks(rmks);
dm.setCnsg_seqo(cnsg_seqo);
dm.setTran_cost(tran_cost);
dm.setUse_yn(use_yn);
dm.setTran_uprc_qty_clsf(tran_uprc_qty_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setQty(qty);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 02 20:21:53 KST 2009 */