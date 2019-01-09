/***************************************************************************************************
* 파일명 : SE_BAS_1110_LDM.java
* 기능 :  판매 - 기준정보 - 지역관리 
 * 작성일자 : 2009.01.15
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.ds.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd	;
	public String team_cd	;
	public String bo_cd		;
	public String area_cd	;
	public String incmg_pers;

	public SE_BAS_1110_LDM(){}
	public SE_BAS_1110_LDM(String cmpy_cd, String team_cd, String bo_cd, String area_cd, String incmg_pers){
		this.cmpy_cd 	= cmpy_cd	;
		this.team_cd 	= team_cd	;
		this.bo_cd 		= bo_cd		;
		this.area_cd 	= area_cd	;
		this.incmg_pers	= incmg_pers;
	}
	
	public String getSQL(){
		 return "{ call SP_SE_BAS_1110_L( ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BAS_1110_LDM dm = (SE_BAS_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd	);
		cstmt.setString(4, dm.team_cd	);
		cstmt.setString(5, dm.bo_cd		);
		cstmt.setString(6, dm.area_cd	);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public void print(){
		System.out.println("cmpy_cd		= " + getCmpy_cd		());
		System.out.println("team_cd		= " + getTeam_cd		());
		System.out.println("bo_cd		= " + getBo_cd			());
		System.out.println("area_cd		= " + getArea_cd		());
		System.out.println("incmg_pers	= " + getIncmg_pers		());
	}
	
	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bas.ds.SE_BAS_1110_LDataSet();
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}
	
	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getArea_cd() {
		return area_cd;
	}
	public void setArea_cd(String area_cd) {
		this.area_cd = area_cd;
	}
	public String getBo_cd(){
		return this.bo_cd;
	}
	
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String team_cd = req.getParameter("team_cd");
if( team_cd == null){
	System.out.println(this.toString+" : team_cd is null" );
}else{
	System.out.println(this.toString+" : team_cd is "+team_cd );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String team_cd = Util.checkString(req.getParameter("team_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setTeam_cd(team_cd);
dm.setBo_cd(bo_cd);
dm.setArea_cd(area_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 13 18:16:18 KST 2009 */