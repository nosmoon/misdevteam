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


public class SE_BOI_2810_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String sch_gb;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String bo_cd;
	public String bo_nm;
	public String cntr_stat_clsf;
	public String bo_head_nm;
	public String cntr_fr_dt;
	public String cntr_to_dt;

	public SE_BOI_2810_LDM(){}
	public SE_BOI_2810_LDM(String cmpy_cd, String incmg_pers, String sch_gb, String team_cd, String part_cd, String area_cd, String bo_cd, String bo_nm, String cntr_stat_clsf, String bo_head_nm, String cntr_fr_dt, String cntr_to_dt){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.sch_gb = sch_gb;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.bo_cd = bo_cd;
		this.bo_nm = bo_nm;
		this.cntr_stat_clsf = cntr_stat_clsf;
		this.bo_head_nm = bo_head_nm;
		this.cntr_fr_dt = cntr_fr_dt;
		this.cntr_to_dt = cntr_to_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setSch_gb(String sch_gb){
		this.sch_gb = sch_gb;
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

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setCntr_stat_clsf(String cntr_stat_clsf){
		this.cntr_stat_clsf = cntr_stat_clsf;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setCntr_fr_dt(String cntr_fr_dt){
		this.cntr_fr_dt = cntr_fr_dt;
	}

	public void setCntr_to_dt(String cntr_to_dt){
		this.cntr_to_dt = cntr_to_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSch_gb(){
		return this.sch_gb;
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

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getCntr_stat_clsf(){
		return this.cntr_stat_clsf;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getCntr_fr_dt(){
		return this.cntr_fr_dt;
	}

	public String getCntr_to_dt(){
		return this.cntr_to_dt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_2810_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2810_LDM dm = (SE_BOI_2810_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.sch_gb);
		cstmt.setString(6, dm.team_cd);
		cstmt.setString(7, dm.part_cd);
		cstmt.setString(8, dm.area_cd);
		cstmt.setString(9, dm.bo_cd);
		cstmt.setString(10, dm.bo_nm);
		cstmt.setString(11, dm.cntr_stat_clsf);
		cstmt.setString(12, dm.bo_head_nm);
		cstmt.setString(13, dm.cntr_fr_dt);
		cstmt.setString(14, dm.cntr_to_dt);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2810_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("sch_gb = [" + getSch_gb() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_nm = [" + getBo_nm() + "]");
		System.out.println("cntr_stat_clsf = [" + getCntr_stat_clsf() + "]");
		System.out.println("bo_head_nm = [" + getBo_head_nm() + "]");
		System.out.println("cntr_fr_dt = [" + getCntr_fr_dt() + "]");
		System.out.println("cntr_to_dt = [" + getCntr_to_dt() + "]");
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
String sch_gb = req.getParameter("sch_gb");
if( sch_gb == null){
	System.out.println(this.toString+" : sch_gb is null" );
}else{
	System.out.println(this.toString+" : sch_gb is "+sch_gb );
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
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String cntr_stat_clsf = req.getParameter("cntr_stat_clsf");
if( cntr_stat_clsf == null){
	System.out.println(this.toString+" : cntr_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : cntr_stat_clsf is "+cntr_stat_clsf );
}
String bo_head_nm = req.getParameter("bo_head_nm");
if( bo_head_nm == null){
	System.out.println(this.toString+" : bo_head_nm is null" );
}else{
	System.out.println(this.toString+" : bo_head_nm is "+bo_head_nm );
}
String cntr_fr_dt = req.getParameter("cntr_fr_dt");
if( cntr_fr_dt == null){
	System.out.println(this.toString+" : cntr_fr_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_fr_dt is "+cntr_fr_dt );
}
String cntr_to_dt = req.getParameter("cntr_to_dt");
if( cntr_to_dt == null){
	System.out.println(this.toString+" : cntr_to_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_to_dt is "+cntr_to_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String sch_gb = Util.checkString(req.getParameter("sch_gb"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
String cntr_fr_dt = Util.checkString(req.getParameter("cntr_fr_dt"));
String cntr_to_dt = Util.checkString(req.getParameter("cntr_to_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String sch_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("sch_gb")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String cntr_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_stat_clsf")));
String bo_head_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_nm")));
String cntr_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_fr_dt")));
String cntr_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_to_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setSch_gb(sch_gb);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setBo_cd(bo_cd);
dm.setBo_nm(bo_nm);
dm.setCntr_stat_clsf(cntr_stat_clsf);
dm.setBo_head_nm(bo_head_nm);
dm.setCntr_fr_dt(cntr_fr_dt);
dm.setCntr_to_dt(cntr_to_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 11 17:09:06 KST 2016 */