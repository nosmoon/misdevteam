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


public class SE_SAL_1320_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String team;
	public String part;
	public String area;
	public String searchgubun;
	public String cntr_uprc_fr;
	public String cntr_uprc_to;
	public String jd_sell_net_clsf;
	public String incmg_pers;
	public String sell_net_clsf;

	public SE_SAL_1320_LDM(){}
	public SE_SAL_1320_LDM(String cmpy_cd, String yymm, String team, String part, String area, String searchgubun, String cntr_uprc_fr, String cntr_uprc_to, String jd_sell_net_clsf, String incmg_pers, String sell_net_clsf){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.team = team;
		this.part = part;
		this.area = area;
		this.searchgubun = searchgubun;
		this.cntr_uprc_fr = cntr_uprc_fr;
		this.cntr_uprc_to = cntr_uprc_to;
		this.jd_sell_net_clsf = jd_sell_net_clsf;
		this.incmg_pers = incmg_pers;
		this.sell_net_clsf = sell_net_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
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

	public void setSearchgubun(String searchgubun){
		this.searchgubun = searchgubun;
	}

	public void setCntr_uprc_fr(String cntr_uprc_fr){
		this.cntr_uprc_fr = cntr_uprc_fr;
	}

	public void setCntr_uprc_to(String cntr_uprc_to){
		this.cntr_uprc_to = cntr_uprc_to;
	}

	public void setJd_sell_net_clsf(String jd_sell_net_clsf){
		this.jd_sell_net_clsf = jd_sell_net_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}
	
	public void setSell_net_clsf(String sell_net_clsf){
		this.sell_net_clsf = sell_net_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
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

	public String getSearchgubun(){
		return this.searchgubun;
	}

	public String getCntr_uprc_fr(){
		return this.cntr_uprc_fr;
	}

	public String getCntr_uprc_to(){
		return this.cntr_uprc_to;
	}

	public String getJd_sell_net_clsf(){
		return this.jd_sell_net_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}
	
	public String getSell_net_clsf(){
		return this.sell_net_clsf;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SAL_1320_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_1320_LDM dm = (SE_SAL_1320_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.team);
		cstmt.setString(6, dm.part);
		cstmt.setString(7, dm.area);
		cstmt.setString(8, dm.searchgubun);
		cstmt.setString(9, dm.cntr_uprc_fr);
		cstmt.setString(10, dm.cntr_uprc_to);
		cstmt.setString(11, dm.jd_sell_net_clsf);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.sell_net_clsf);
		
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_1320_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("team = [" + getTeam() + "]");
		System.out.println("part = [" + getPart() + "]");
		System.out.println("area = [" + getArea() + "]");
		System.out.println("searchgubun = [" + getSearchgubun() + "]");
		System.out.println("cntr_uprc_fr = [" + getCntr_uprc_fr() + "]");
		System.out.println("cntr_uprc_to = [" + getCntr_uprc_to() + "]");
		System.out.println("jd_sell_net_clsf = [" + getJd_sell_net_clsf() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("sell_net_clsf = [" + getSell_net_clsf() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
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
String searchgubun = req.getParameter("searchgubun");
if( searchgubun == null){
	System.out.println(this.toString+" : searchgubun is null" );
}else{
	System.out.println(this.toString+" : searchgubun is "+searchgubun );
}
String cntr_uprc_fr = req.getParameter("cntr_uprc_fr");
if( cntr_uprc_fr == null){
	System.out.println(this.toString+" : cntr_uprc_fr is null" );
}else{
	System.out.println(this.toString+" : cntr_uprc_fr is "+cntr_uprc_fr );
}
String cntr_uprc_to = req.getParameter("cntr_uprc_to");
if( cntr_uprc_to == null){
	System.out.println(this.toString+" : cntr_uprc_to is null" );
}else{
	System.out.println(this.toString+" : cntr_uprc_to is "+cntr_uprc_to );
}
String jd_sell_net_clsf = req.getParameter("jd_sell_net_clsf");
if( jd_sell_net_clsf == null){
	System.out.println(this.toString+" : jd_sell_net_clsf is null" );
}else{
	System.out.println(this.toString+" : jd_sell_net_clsf is "+jd_sell_net_clsf );
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
String yymm = Util.checkString(req.getParameter("yymm"));
String team = Util.checkString(req.getParameter("team"));
String part = Util.checkString(req.getParameter("part"));
String area = Util.checkString(req.getParameter("area"));
String searchgubun = Util.checkString(req.getParameter("searchgubun"));
String cntr_uprc_fr = Util.checkString(req.getParameter("cntr_uprc_fr"));
String cntr_uprc_to = Util.checkString(req.getParameter("cntr_uprc_to"));
String jd_sell_net_clsf = Util.checkString(req.getParameter("jd_sell_net_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String part = Util.Uni2Ksc(Util.checkString(req.getParameter("part")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String searchgubun = Util.Uni2Ksc(Util.checkString(req.getParameter("searchgubun")));
String cntr_uprc_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_uprc_fr")));
String cntr_uprc_to = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_uprc_to")));
String jd_sell_net_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("jd_sell_net_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setTeam(team);
dm.setPart(part);
dm.setArea(area);
dm.setSearchgubun(searchgubun);
dm.setCntr_uprc_fr(cntr_uprc_fr);
dm.setCntr_uprc_to(cntr_uprc_to);
dm.setJd_sell_net_clsf(jd_sell_net_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 06 20:23:46 KST 2009 */