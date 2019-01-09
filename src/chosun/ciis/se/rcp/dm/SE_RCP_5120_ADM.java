/***************************************************************************************************
* 파일명 : SE_RCP_5120_ADataSet.java
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


public class SE_RCP_5120_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String clos_yn		;
	public String mode			;
	public String dt			;
	public String team			;
	public String incmg_pers_ip	;
	public String incmg_pers	;

	public SE_RCP_5120_ADM(){}
	public SE_RCP_5120_ADM(String cmpy_cd, String clos_yn, String mode, String dt, String team, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.clos_yn 		= clos_yn		;
		this.mode 			= mode			;
		this.dt 			= dt			;
		this.team 			= team			;
		this.incmg_pers_ip 	= incmg_pers_ip	;
		this.incmg_pers 	= incmg_pers	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setTeam(String team){
		this.team = team;
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

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getMode(){
		return this.mode;
	}

	public String getDt(){
		return this.dt;
	}

	public String getTeam(){
		return this.team;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_RCP_5120_A( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_5120_ADM dm = (SE_RCP_5120_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd		);
		cstmt.setString(4, dm.clos_yn		);
		cstmt.setString(5, dm.mode			);
		cstmt.setString(6, dm.dt			);
		cstmt.setString(7, dm.team			);
		cstmt.setString(8, dm.incmg_pers_ip	);
		cstmt.setString(9, dm.incmg_pers	);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_5120_ADataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("clos_yn 		= " + getClos_yn		());
        System.out.println("mode 			= " + getMode			());
        System.out.println("dt	 			= " + getDt				());
        System.out.println("team 			= " + getTeam			());
        System.out.println("incmg_pers_ip 	= " + getIncmg_pers_ip	());
        System.out.println("incmg_pers 		= " + getIncmg_pers		());
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
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
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
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String mode = Util.checkString(req.getParameter("mode"));
String dt = Util.checkString(req.getParameter("dt"));
String team = Util.checkString(req.getParameter("team"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_yn(clos_yn);
dm.setMode(mode);
dm.setDt(dt);
dm.setTeam(team);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 19:48:14 KST 2009 */