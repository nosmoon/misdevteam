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


public class SE_SND_3620_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String route_clsf;
	public String rptv_route_cd;
	public String route_cd;
	public String medi_cd;
	public String prt_plac_cd_ch;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_SND_3620_ADM(){}
	public SE_SND_3620_ADM(String cmpy_cd, String route_clsf, String rptv_route_cd, String route_cd, String medi_cd, String prt_plac_cd_ch, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.route_clsf = route_clsf;
		this.rptv_route_cd = rptv_route_cd;
		this.route_cd = route_cd;
		this.medi_cd = medi_cd;
		this.prt_plac_cd_ch = prt_plac_cd_ch;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setRptv_route_cd(String rptv_route_cd){
		this.rptv_route_cd = rptv_route_cd;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPrt_plac_cd_ch(String prt_plac_cd_ch){
		this.prt_plac_cd_ch = prt_plac_cd_ch;
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

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRptv_route_cd(){
		return this.rptv_route_cd;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPrt_plac_cd_ch(){
		return this.prt_plac_cd_ch;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_3620_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_3620_ADM dm = (SE_SND_3620_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.route_clsf);
		cstmt.setString(5, dm.rptv_route_cd);
		cstmt.setString(6, dm.route_cd);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.prt_plac_cd_ch);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_3620_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("route_clsf = [" + getRoute_clsf() + "]");
		System.out.println("rptv_route_cd = [" + getRptv_route_cd() + "]");
		System.out.println("route_cd = [" + getRoute_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("prt_plac_cd_ch = [" + getPrt_plac_cd_ch() + "]");
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
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
String rptv_route_cd = req.getParameter("rptv_route_cd");
if( rptv_route_cd == null){
	System.out.println(this.toString+" : rptv_route_cd is null" );
}else{
	System.out.println(this.toString+" : rptv_route_cd is "+rptv_route_cd );
}
String route_cd = req.getParameter("route_cd");
if( route_cd == null){
	System.out.println(this.toString+" : route_cd is null" );
}else{
	System.out.println(this.toString+" : route_cd is "+route_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String prt_plac_cd_ch = req.getParameter("prt_plac_cd_ch");
if( prt_plac_cd_ch == null){
	System.out.println(this.toString+" : prt_plac_cd_ch is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd_ch is "+prt_plac_cd_ch );
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
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String rptv_route_cd = Util.checkString(req.getParameter("rptv_route_cd"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String prt_plac_cd_ch = Util.checkString(req.getParameter("prt_plac_cd_ch"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String rptv_route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_cd")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String prt_plac_cd_ch = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd_ch")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRoute_clsf(route_clsf);
dm.setRptv_route_cd(rptv_route_cd);
dm.setRoute_cd(route_cd);
dm.setMedi_cd(medi_cd);
dm.setPrt_plac_cd_ch(prt_plac_cd_ch);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 24 16:33:27 KST 2009 */