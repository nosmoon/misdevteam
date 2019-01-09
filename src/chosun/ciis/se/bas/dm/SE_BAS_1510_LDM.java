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


public class SE_BAS_1510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String team;
	public String part;
	public String area;
	public String bas_yymm;
	public String incmg_pers;
	public String srchgb;

	public SE_BAS_1510_LDM(){}
	public SE_BAS_1510_LDM(String cmpy_cd, String team, String part, String area, String bas_yymm, String incmg_pers, String srchgb){
		this.cmpy_cd = cmpy_cd;
		this.team = team;
		this.part = part;
		this.area = area;
		this.bas_yymm = bas_yymm;
		this.incmg_pers = incmg_pers;
		this.srchgb = srchgb;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public void setPart(String part){
		this.part = part;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setBas_yymm(String bas_yymm){
		this.bas_yymm = bas_yymm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}
	
	public void setSrchgb(String srchgb){
		this.srchgb = srchgb;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTeam(){
		return this.team;
	}

	public String getPart(){
		return this.part;
	}

	public String getArea(){
		return this.area;
	}

	public String getBas_yymm(){
		return this.bas_yymm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}
	
	public String getSrchgb(){
		return this.srchgb;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BAS_1510_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BAS_1510_LDM dm = (SE_BAS_1510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.team);
		cstmt.setString(5, dm.part);
		cstmt.setString(6, dm.area);
		cstmt.setString(7, dm.bas_yymm);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.setString(10, dm.srchgb);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bas.ds.SE_BAS_1510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("team = [" + getTeam() + "]");
		System.out.println("part = [" + getPart() + "]");
		System.out.println("area = [" + getArea() + "]");
		System.out.println("bas_yymm = [" + getBas_yymm() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("srchgb = [" + getSrchgb() + "]");
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
String part = req.getParameter("part");
if( part == null){
	System.out.println(this.toString+" : part is null" );
}else{
	System.out.println(this.toString+" : part is "+part );
}
String area = req.getParameter("area");
if( area == null){
	System.out.println(this.toString+" : area is null" );
}else{
	System.out.println(this.toString+" : area is "+area );
}
String bas_yymm = req.getParameter("bas_yymm");
if( bas_yymm == null){
	System.out.println(this.toString+" : bas_yymm is null" );
}else{
	System.out.println(this.toString+" : bas_yymm is "+bas_yymm );
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
String team = Util.checkString(req.getParameter("team"));
String part = Util.checkString(req.getParameter("part"));
String area = Util.checkString(req.getParameter("area"));
String bas_yymm = Util.checkString(req.getParameter("bas_yymm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String part = Util.Uni2Ksc(Util.checkString(req.getParameter("part")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String bas_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("bas_yymm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam(team);
dm.setPart(part);
dm.setArea(area);
dm.setBas_yymm(bas_yymm);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 21 12:00:08 KST 2009 */