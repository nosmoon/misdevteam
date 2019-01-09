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


public class SE_SND_2410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String route_cd;
	public String prt_plac_cd;
	public String route_clsf;
	public String tran_uprc_clas;
	public String use_yn;
	public String incmg_pers;
	public String medi_cd;
	public String sect_cd;

	public SE_SND_2410_LDM(){}
	public SE_SND_2410_LDM(String cmpy_cd, String route_cd, String prt_plac_cd, String route_clsf, String tran_uprc_clas, String use_yn, String incmg_pers, String medi_cd, String sect_cd){
		this.cmpy_cd = cmpy_cd;
		this.route_cd = route_cd;
		this.prt_plac_cd = prt_plac_cd;
		this.route_clsf = route_clsf;
		this.tran_uprc_clas = tran_uprc_clas;
		this.use_yn = use_yn;
		this.incmg_pers = incmg_pers;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_2410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2410_LDM dm = (SE_SND_2410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.route_cd);
		cstmt.setString(5, dm.prt_plac_cd);
		cstmt.setString(6, dm.route_clsf);
		cstmt.setString(7, dm.tran_uprc_clas);
		cstmt.setString(8, dm.use_yn);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.sect_cd);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("route_cd = [" + getRoute_cd() + "]");
		System.out.println("prt_plac_cd = [" + getPrt_plac_cd() + "]");
		System.out.println("route_clsf = [" + getRoute_clsf() + "]");
		System.out.println("tran_uprc_clas = [" + getTran_uprc_clas() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
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
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
String tran_uprc_clas = req.getParameter("tran_uprc_clas");
if( tran_uprc_clas == null){
	System.out.println(this.toString+" : tran_uprc_clas is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_clas is "+tran_uprc_clas );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String tran_uprc_clas = Util.checkString(req.getParameter("tran_uprc_clas"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String tran_uprc_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_clas")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRoute_cd(route_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setRoute_clsf(route_clsf);
dm.setTran_uprc_clas(tran_uprc_clas);
dm.setUse_yn(use_yn);
dm.setIncmg_pers(incmg_pers);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 02 13:40:12 KST 2009 */