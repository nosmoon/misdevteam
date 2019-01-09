/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
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


public class SE_BOI_1010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String cntr_stat_clsf;
	public String bo_cd;
	public String bo_nm;
	public String bo_head_nm;
	public String bo_reg_clsf;
	public String bo_cntr_dt_fr;
	public String bo_cntr_dt_to;
	public String incmg_pers;

	public SE_BOI_1010_LDM(){}
	public SE_BOI_1010_LDM(String cmpy_cd, String team_cd, String part_cd, String area_cd, String cntr_stat_clsf, String bo_cd, String bo_nm, String bo_head_nm, String bo_reg_clsf, String bo_cntr_dt_fr, String bo_cntr_dt_to, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.cntr_stat_clsf = cntr_stat_clsf;
		this.bo_cd = bo_cd;
		this.bo_nm = bo_nm;
		this.bo_head_nm = bo_head_nm;
		this.bo_reg_clsf = bo_reg_clsf;
		this.bo_cntr_dt_fr = bo_cntr_dt_fr;
		this.bo_cntr_dt_to = bo_cntr_dt_to;
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

	public void setCntr_stat_clsf(String cntr_stat_clsf){
		this.cntr_stat_clsf = cntr_stat_clsf;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBo_reg_clsf(String bo_reg_clsf){
		this.bo_reg_clsf = bo_reg_clsf;
	}

	public void setBo_cntr_dt_fr(String bo_cntr_dt_fr){
		this.bo_cntr_dt_fr = bo_cntr_dt_fr;
	}

	public void setBo_cntr_dt_to(String bo_cntr_dt_to){
		this.bo_cntr_dt_to = bo_cntr_dt_to;
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

	public String getCntr_stat_clsf(){
		return this.cntr_stat_clsf;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBo_reg_clsf(){
		return this.bo_reg_clsf;
	}

	public String getBo_cntr_dt_fr(){
		return this.bo_cntr_dt_fr;
	}

	public String getBo_cntr_dt_to(){
		return this.bo_cntr_dt_to;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_1010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1010_LDM dm = (SE_BOI_1010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.team_cd);
		cstmt.setString(5, dm.part_cd);
		cstmt.setString(6, dm.area_cd);
		cstmt.setString(7, dm.cntr_stat_clsf);
		cstmt.setString(8, dm.bo_cd);
		cstmt.setString(9, dm.bo_nm);
		cstmt.setString(10, dm.bo_head_nm);
		cstmt.setString(11, dm.bo_reg_clsf);
		cstmt.setString(12, dm.bo_cntr_dt_fr);
		cstmt.setString(13, dm.bo_cntr_dt_to);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("cntr_stat_clsf = [" + getCntr_stat_clsf() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_nm = [" + getBo_nm() + "]");
		System.out.println("bo_head_nm = [" + getBo_head_nm() + "]");
		System.out.println("bo_reg_clsf = [" + getBo_reg_clsf() + "]");
		System.out.println("bo_cntr_dt_fr = [" + getBo_cntr_dt_fr() + "]");
		System.out.println("bo_cntr_dt_to = [" + getBo_cntr_dt_to() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String cntr_stat_clsf = req.getParameter("cntr_stat_clsf");
if( cntr_stat_clsf == null){
	System.out.println(this.toString+" : cntr_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : cntr_stat_clsf is "+cntr_stat_clsf );
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
String bo_head_nm = req.getParameter("bo_head_nm");
if( bo_head_nm == null){
	System.out.println(this.toString+" : bo_head_nm is null" );
}else{
	System.out.println(this.toString+" : bo_head_nm is "+bo_head_nm );
}
String bo_reg_clsf = req.getParameter("bo_reg_clsf");
if( bo_reg_clsf == null){
	System.out.println(this.toString+" : bo_reg_clsf is null" );
}else{
	System.out.println(this.toString+" : bo_reg_clsf is "+bo_reg_clsf );
}
String bo_cntr_dt_fr = req.getParameter("bo_cntr_dt_fr");
if( bo_cntr_dt_fr == null){
	System.out.println(this.toString+" : bo_cntr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : bo_cntr_dt_fr is "+bo_cntr_dt_fr );
}
String bo_cntr_dt_to = req.getParameter("bo_cntr_dt_to");
if( bo_cntr_dt_to == null){
	System.out.println(this.toString+" : bo_cntr_dt_to is null" );
}else{
	System.out.println(this.toString+" : bo_cntr_dt_to is "+bo_cntr_dt_to );
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
String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
String bo_reg_clsf = Util.checkString(req.getParameter("bo_reg_clsf"));
String bo_cntr_dt_fr = Util.checkString(req.getParameter("bo_cntr_dt_fr"));
String bo_cntr_dt_to = Util.checkString(req.getParameter("bo_cntr_dt_to"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String cntr_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_stat_clsf")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String bo_head_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_nm")));
String bo_reg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_reg_clsf")));
String bo_cntr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cntr_dt_fr")));
String bo_cntr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cntr_dt_to")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setCntr_stat_clsf(cntr_stat_clsf);
dm.setBo_cd(bo_cd);
dm.setBo_nm(bo_nm);
dm.setBo_head_nm(bo_head_nm);
dm.setBo_reg_clsf(bo_reg_clsf);
dm.setBo_cntr_dt_fr(bo_cntr_dt_fr);
dm.setBo_cntr_dt_to(bo_cntr_dt_to);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 23 16:40:27 KST 2014 */