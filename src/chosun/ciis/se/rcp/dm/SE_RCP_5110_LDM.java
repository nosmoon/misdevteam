/***************************************************************************************************
* 파일명 : SE_RCP_5110_LDM.java
* 기능 : 판매- 입금관리 - 마감관리 - 입금전표생성
* 작성일자 : 2009-05-19
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.ds.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_5110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd	;
	public String team		;
	public String bgn_dt	;
	public String end_dt	;
	public String incmg_pers;
	
	public SE_RCP_5110_LDM(){}
	public SE_RCP_5110_LDM(String cmpy_cd, String team, String bgn_dt, String end_dt, String incmg_pers){
		this.cmpy_cd 	= cmpy_cd	;
		this.team 		= team		;
		this.bgn_dt 	= bgn_dt	;
		this.end_dt 	= end_dt	;
		this.incmg_pers	= incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTeam(){
		return this.team;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	
	public String getSQL(){
		 return "{ call SP_SE_RCP_5110_L( ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_5110_LDM dm = (SE_RCP_5110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd	);
		cstmt.setString(4, dm.team		);
		cstmt.setString(5, dm.bgn_dt	);
		cstmt.setString(6, dm.end_dt	);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_5110_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd	());
        System.out.println("team 		= " + getTeam		());
        System.out.println("bgn_dt 		= " + getBgn_dt		());
        System.out.println("end_dt 		= " + getEnd_dt		());
        System.out.println("incmg_pers 	= " + getIncmg_pers	());
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
String team = req.getParameter("team");
if( team == null){
	System.out.println(this.toString+" : team is null" );
}else{
	System.out.println(this.toString+" : team is "+team );
}
String bgn_dt = req.getParameter("bgn_dt");
if( bgn_dt == null){
	System.out.println(this.toString+" : bgn_dt is null" );
}else{
	System.out.println(this.toString+" : bgn_dt is "+bgn_dt );
}
String end_dt = req.getParameter("end_dt");
if( end_dt == null){
	System.out.println(this.toString+" : end_dt is null" );
}else{
	System.out.println(this.toString+" : end_dt is "+end_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String team = Util.checkString(req.getParameter("team"));
String bgn_dt = Util.checkString(req.getParameter("bgn_dt"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String bgn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_dt")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam(team);
dm.setBgn_dt(bgn_dt);
dm.setEnd_dt(end_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 13:52:01 KST 2009 */