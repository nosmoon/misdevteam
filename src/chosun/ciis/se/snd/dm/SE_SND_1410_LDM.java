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


public class SE_SND_1410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String prt_plac_cd;
	public String route_clsf;
	public String bgn_route_cd;
	public String end_route_cd;
	public String incmg_pers;

	public SE_SND_1410_LDM(){}
	public SE_SND_1410_LDM(String cmpy_cd, String prt_plac_cd, String route_clsf, String bgn_route_cd, String end_route_cd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.prt_plac_cd = prt_plac_cd;
		this.route_clsf = route_clsf;
		this.bgn_route_cd = bgn_route_cd;
		this.end_route_cd = end_route_cd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setBgn_route_cd(String bgn_route_cd){
		this.bgn_route_cd = bgn_route_cd;
	}

	public void setEnd_route_cd(String end_route_cd){
		this.end_route_cd = end_route_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getBgn_route_cd(){
		return this.bgn_route_cd;
	}

	public String getEnd_route_cd(){
		return this.end_route_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_1410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1410_LDM dm = (SE_SND_1410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.prt_plac_cd);
		cstmt.setString(5, dm.route_clsf);
		cstmt.setString(6, dm.bgn_route_cd);
		cstmt.setString(7, dm.end_route_cd);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("prt_plac_cd = [" + getPrt_plac_cd() + "]");
		System.out.println("route_clsf = [" + getRoute_clsf() + "]");
		System.out.println("bgn_route_cd = [" + getBgn_route_cd() + "]");
		System.out.println("end_route_cd = [" + getEnd_route_cd() + "]");
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
String bgn_route_cd = req.getParameter("bgn_route_cd");
if( bgn_route_cd == null){
	System.out.println(this.toString+" : bgn_route_cd is null" );
}else{
	System.out.println(this.toString+" : bgn_route_cd is "+bgn_route_cd );
}
String end_route_cd = req.getParameter("end_route_cd");
if( end_route_cd == null){
	System.out.println(this.toString+" : end_route_cd is null" );
}else{
	System.out.println(this.toString+" : end_route_cd is "+end_route_cd );
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
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String bgn_route_cd = Util.checkString(req.getParameter("bgn_route_cd"));
String end_route_cd = Util.checkString(req.getParameter("end_route_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String bgn_route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_route_cd")));
String end_route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("end_route_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setRoute_clsf(route_clsf);
dm.setBgn_route_cd(bgn_route_cd);
dm.setEnd_route_cd(end_route_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 10:35:02 KST 2009 */