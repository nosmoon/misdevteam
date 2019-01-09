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


public class SE_TRG_1410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String callgb;
	public String schgb;
	public String team_cd;
	public String yymm;

	public SE_TRG_1410_LDM(){}
	public SE_TRG_1410_LDM(String cmpy_cd, String incmg_pers, String callgb, String schgb, String team_cd, String yymm){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.callgb = callgb;
		this.schgb = schgb;
		this.team_cd = team_cd;
		this.yymm = yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setCallgb(String callgb){
		this.callgb = callgb;
	}

	public void setSchgb(String schgb){
		this.schgb = schgb;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getCallgb(){
		return this.callgb;
	}

	public String getSchgb(){
		return this.schgb;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TRG_1410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1410_LDM dm = (SE_TRG_1410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.callgb);
		cstmt.setString(6, dm.schgb);
		cstmt.setString(7, dm.team_cd);
		cstmt.setString(8, dm.yymm);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1410_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("callgb = " + getCallgb());
        System.out.println("schgb = " + getSchgb());
        System.out.println("team_cd = " + getTeam_cd());
        System.out.println("yymm = " + getYymm());
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
String callgb = req.getParameter("callgb");
if( callgb == null){
	System.out.println(this.toString+" : callgb is null" );
}else{
	System.out.println(this.toString+" : callgb is "+callgb );
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String callgb = Util.checkString(req.getParameter("callgb"));
String schgb = Util.checkString(req.getParameter("schgb"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String callgb = Util.Uni2Ksc(Util.checkString(req.getParameter("callgb")));
String schgb = Util.Uni2Ksc(Util.checkString(req.getParameter("schgb")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setCallgb(callgb);
dm.setSchgb(schgb);
dm.setTeam_cd(team_cd);
dm.setYymm(yymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 10:17:32 KST 2009 */