/***************************************************************************************************
* 파일명 : SE_RCP_5010_SDM.java
* 기능 : 판매- 입금관리 - 마감관리 - 일입금마감
* 작성일자 : 2009-05-20
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


public class SE_RCP_5010_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd	;
	public String dt		;
	public String team		;
	public String part		;
	public String area		;
	public String gubun		;
	public String incmg_pers;

	public SE_RCP_5010_SDM(){}
	public SE_RCP_5010_SDM(String cmpy_cd, String dt, String team, String part, String area, String gubun, String incmg_pers){
		this.cmpy_cd 	= cmpy_cd	;
		this.dt 		= dt		;
		this.team 		= team		;
		this.part		= part		;
		this.area		= area		;
		this.gubun 		= gubun		;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDt(){
		return this.dt;
	}

	public String getTeam(){
		return this.team;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_RCP_5010_S( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_5010_SDM dm = (SE_RCP_5010_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd	);
		cstmt.setString(4, dm.dt		);
		cstmt.setString(5, dm.team		);
		cstmt.setString(6, dm.part		);
		cstmt.setString(7, dm.area		);
		cstmt.setString(8, dm.gubun		);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_5010_SDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd	());
        System.out.println("dt 			= " + getDt			());
        System.out.println("team 		= " + getTeam		());
        System.out.println("part 		= " + getPart		());
        System.out.println("area 		= " + getArea		());
        System.out.println("gubun 		= " + getGubun		());
        System.out.println("incmg_pers 	= " + getIncmg_pers	());
    }
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
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
String dt = req.getParameter("dt");
if( dt == null){
	System.out.println(this.toString+" : dt is null" );
}else{
	System.out.println(this.toString+" : dt is "+dt );
}
String team = req.getParameter("team");
if( team == null){
	System.out.println(this.toString+" : team is null" );
}else{
	System.out.println(this.toString+" : team is "+team );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
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
String dt = Util.checkString(req.getParameter("dt"));
String team = Util.checkString(req.getParameter("team"));
String gubun = Util.checkString(req.getParameter("gubun"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDt(dt);
dm.setTeam(team);
dm.setGubun(gubun);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 10:59:35 KST 2009 */