/***************************************************************************************************
* 파일명 : SE_MO_RCP_2510_LDM.java
* 기능 : 입금관리-지대입금관리-지대입금률현황 / 모바일) 지대마감-지대입금률현황
* 작성일자 : 2017-05-24
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 *
 */


public class SE_MO_RCP_2510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String yymm;
	public String rcpm_dt;

	public SE_MO_RCP_2510_LDM(){}
	public SE_MO_RCP_2510_LDM(String cmpy_cd, String incmg_pers, String team_cd, String part_cd, String area_cd, String yymm, String rcpm_dt){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.yymm = yymm;
		this.rcpm_dt = rcpm_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_MO_RCP_2510_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_MO_RCP_2510_LDM dm = (SE_MO_RCP_2510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.team_cd);
		cstmt.setString(6, dm.part_cd);
		cstmt.setString(7, dm.area_cd);
		cstmt.setString(8, dm.yymm);
		cstmt.setString(9, dm.rcpm_dt);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_MO_RCP_2510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("rcpm_dt = [" + getRcpm_dt() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String team_cd = req.getParameter("team_cd");
if( team_cd == null){
	System.out.println(this.toString+" : team_cd is null" );
}else{
	System.out.println(this.toString+" : team_cd is "+team_cd );
}
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String rcpm_dt = req.getParameter("rcpm_dt");
if( rcpm_dt == null){
	System.out.println(this.toString+" : rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt is "+rcpm_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setYymm(yymm);
dm.setRcpm_dt(rcpm_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 24 16:10:23 KST 2017 */