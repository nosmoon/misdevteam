/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
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


public class SE_BOI_2710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String bo_cd;
	public String fr_yymm;
	public String to_yymm;
	public String medicd;
	public String schlevel;
	public String search_mn;

	public SE_BOI_2710_LDM(){}
	public SE_BOI_2710_LDM(String cmpy_cd, String incmg_pers, String team_cd, String part_cd, String area_cd, String bo_cd, String fr_yymm, String to_yymm, String medicd, String schlevel, String search_mn){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.bo_cd = bo_cd;
		this.fr_yymm = fr_yymm;
		this.to_yymm = to_yymm;
		this.medicd = medicd;
		this.schlevel = schlevel;
		this.search_mn = search_mn;
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

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setFr_yymm(String fr_yymm){
		this.fr_yymm = fr_yymm;
	}

	public void setTo_yymm(String to_yymm){
		this.to_yymm = to_yymm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSchlevel(String schlevel){
		this.schlevel = schlevel;
	}

	public void setSearch_mn(String search_mn){
		this.search_mn = search_mn;
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

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getFr_yymm(){
		return this.fr_yymm;
	}

	public String getTo_yymm(){
		return this.to_yymm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSchlevel(){
		return this.schlevel;
	}

	public String getSearch_mn(){
		return this.search_mn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_2710_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2710_LDM dm = (SE_BOI_2710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.team_cd);
		cstmt.setString(6, dm.part_cd);
		cstmt.setString(7, dm.area_cd);
		cstmt.setString(8, dm.bo_cd);
		cstmt.setString(9, dm.fr_yymm);
		cstmt.setString(10, dm.to_yymm);
		cstmt.setString(11, dm.medicd);
		cstmt.setString(12, dm.schlevel);
		cstmt.setString(13, dm.search_mn);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("fr_yymm = [" + getFr_yymm() + "]");
		System.out.println("to_yymm = [" + getTo_yymm() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("schlevel = [" + getSchlevel() + "]");
		System.out.println("search_mn = [" + getSearch_mn() + "]");
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
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String fr_yymm = req.getParameter("fr_yymm");
if( fr_yymm == null){
	System.out.println(this.toString+" : fr_yymm is null" );
}else{
	System.out.println(this.toString+" : fr_yymm is "+fr_yymm );
}
String to_yymm = req.getParameter("to_yymm");
if( to_yymm == null){
	System.out.println(this.toString+" : to_yymm is null" );
}else{
	System.out.println(this.toString+" : to_yymm is "+to_yymm );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String schlevel = req.getParameter("schlevel");
if( schlevel == null){
	System.out.println(this.toString+" : schlevel is null" );
}else{
	System.out.println(this.toString+" : schlevel is "+schlevel );
}
String search_mn = req.getParameter("search_mn");
if( search_mn == null){
	System.out.println(this.toString+" : search_mn is null" );
}else{
	System.out.println(this.toString+" : search_mn is "+search_mn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
String to_yymm = Util.checkString(req.getParameter("to_yymm"));
String medicd = Util.checkString(req.getParameter("medicd"));
String schlevel = Util.checkString(req.getParameter("schlevel"));
String search_mn = Util.checkString(req.getParameter("search_mn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String schlevel = Util.Uni2Ksc(Util.checkString(req.getParameter("schlevel")));
String search_mn = Util.Uni2Ksc(Util.checkString(req.getParameter("search_mn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setBo_cd(bo_cd);
dm.setFr_yymm(fr_yymm);
dm.setTo_yymm(to_yymm);
dm.setMedicd(medicd);
dm.setSchlevel(schlevel);
dm.setSearch_mn(search_mn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 19 10:12:22 KST 2015 */