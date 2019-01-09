/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.ds.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1910_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String yymm1;
	public String yymm2;
	public String incmg_pers;

	public SE_TRG_1910_LDM(){}
	public SE_TRG_1910_LDM(String cmpy_cd, String team_cd, String part_cd, String area_cd, String yymm1, String yymm2, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.yymm1 = yymm1;
		this.yymm2 = yymm2;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setYymm1(String yymm1){
		this.yymm1 = yymm1;
	}

	public void setYymm2(String yymm2){
		this.yymm2 = yymm2;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getYymm1(){
		return this.yymm1;
	}

	public String getYymm2(){
		return this.yymm2;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TRG_1910_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1910_LDM dm = (SE_TRG_1910_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.team_cd);
		cstmt.setString(5, dm.part_cd);
		cstmt.setString(6, dm.area_cd);
		cstmt.setString(7, dm.yymm1);
		cstmt.setString(8, dm.yymm2);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1910_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("team_cd = " + getTeam_cd());
        System.out.println("part_cd = " + getPart_cd());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("yymm1 = " + getYymm1());
        System.out.println("yymm2 = " + getYymm2());
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
String yymm1 = req.getParameter("yymm1");
if( yymm1 == null){
	System.out.println(this.toString+" : yymm1 is null" );
}else{
	System.out.println(this.toString+" : yymm1 is "+yymm1 );
}
String yymm2 = req.getParameter("yymm2");
if( yymm2 == null){
	System.out.println(this.toString+" : yymm2 is null" );
}else{
	System.out.println(this.toString+" : yymm2 is "+yymm2 );
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
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String yymm1 = Util.checkString(req.getParameter("yymm1"));
String yymm2 = Util.checkString(req.getParameter("yymm2"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String yymm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm1")));
String yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm2")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setYymm1(yymm1);
dm.setYymm2(yymm2);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 10 15:29:04 KST 2009 */