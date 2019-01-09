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


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String schgb;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String chgdt1;
	public String chgdt2;
	public String incmg_pers;

	public SE_BOI_1110_LDM(){}
	public SE_BOI_1110_LDM(String cmpy_cd, String schgb, String team_cd, String part_cd, String area_cd, String chgdt1, String chgdt2, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.schgb = schgb;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.chgdt1 = chgdt1;
		this.chgdt2 = chgdt2;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSchgb(String schgb){
		this.schgb = schgb;
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

	public void setChgdt1(String chgdt1){
		this.chgdt1 = chgdt1;
	}

	public void setChgdt2(String chgdt2){
		this.chgdt2 = chgdt2;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSchgb(){
		return this.schgb;
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

	public String getChgdt1(){
		return this.chgdt1;
	}

	public String getChgdt2(){
		return this.chgdt2;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_1110_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1110_LDM dm = (SE_BOI_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.schgb);
		cstmt.setString(5, dm.team_cd);
		cstmt.setString(6, dm.part_cd);
		cstmt.setString(7, dm.area_cd);
		cstmt.setString(8, dm.chgdt1);
		cstmt.setString(9, dm.chgdt2);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("schgb = [" + getSchgb() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("chgdt1 = [" + getChgdt1() + "]");
		System.out.println("chgdt2 = [" + getChgdt2() + "]");
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
String schgb = req.getParameter("schgb");
if( schgb == null){
	System.out.println(this.toString+" : schgb is null" );
}else{
	System.out.println(this.toString+" : schgb is "+schgb );
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
String chgdt1 = req.getParameter("chgdt1");
if( chgdt1 == null){
	System.out.println(this.toString+" : chgdt1 is null" );
}else{
	System.out.println(this.toString+" : chgdt1 is "+chgdt1 );
}
String chgdt2 = req.getParameter("chgdt2");
if( chgdt2 == null){
	System.out.println(this.toString+" : chgdt2 is null" );
}else{
	System.out.println(this.toString+" : chgdt2 is "+chgdt2 );
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
String schgb = Util.checkString(req.getParameter("schgb"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String chgdt1 = Util.checkString(req.getParameter("chgdt1"));
String chgdt2 = Util.checkString(req.getParameter("chgdt2"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String schgb = Util.Uni2Ksc(Util.checkString(req.getParameter("schgb")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String chgdt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("chgdt1")));
String chgdt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("chgdt2")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSchgb(schgb);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setChgdt1(chgdt1);
dm.setChgdt2(chgdt2);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 31 17:04:12 KST 2009 */