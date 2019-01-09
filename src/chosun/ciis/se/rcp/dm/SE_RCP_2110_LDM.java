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


public class SE_RCP_2110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String rcpm_dt1;
	public String rcpm_dt2;
	public String slip_clsf;

	public SE_RCP_2110_LDM(){}
	public SE_RCP_2110_LDM(String cmpy_cd, String incmg_pers, String team_cd, String part_cd, String area_cd, String rcpm_dt1, String rcpm_dt2, String slip_clsf){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.rcpm_dt1 = rcpm_dt1;
		this.rcpm_dt2 = rcpm_dt2;
		this.slip_clsf = slip_clsf;
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

	public void setRcpm_dt1(String rcpm_dt1){
		this.rcpm_dt1 = rcpm_dt1;
	}

	public void setRcpm_dt2(String rcpm_dt2){
		this.rcpm_dt2 = rcpm_dt2;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
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

	public String getRcpm_dt1(){
		return this.rcpm_dt1;
	}

	public String getRcpm_dt2(){
		return this.rcpm_dt2;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_RCP_2110_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_2110_LDM dm = (SE_RCP_2110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.team_cd);
		cstmt.setString(6, dm.part_cd);
		cstmt.setString(7, dm.area_cd);
		cstmt.setString(8, dm.rcpm_dt1);
		cstmt.setString(9, dm.rcpm_dt2);
		cstmt.setString(10, dm.slip_clsf);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_2110_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("team_cd = " + getTeam_cd());
        System.out.println("part_cd = " + getPart_cd());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("rcpm_dt1 = " + getRcpm_dt1());
        System.out.println("rcpm_dt2 = " + getRcpm_dt2());
        System.out.println("slip_clsf = " + getSlip_clsf());
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
String rcpm_dt1 = req.getParameter("rcpm_dt1");
if( rcpm_dt1 == null){
	System.out.println(this.toString+" : rcpm_dt1 is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt1 is "+rcpm_dt1 );
}
String rcpm_dt2 = req.getParameter("rcpm_dt2");
if( rcpm_dt2 == null){
	System.out.println(this.toString+" : rcpm_dt2 is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt2 is "+rcpm_dt2 );
}
String slip_clsf = req.getParameter("slip_clsf");
if( slip_clsf == null){
	System.out.println(this.toString+" : slip_clsf is null" );
}else{
	System.out.println(this.toString+" : slip_clsf is "+slip_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
String rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));
String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String rcpm_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt1")));
String rcpm_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt2")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setRcpm_dt1(rcpm_dt1);
dm.setRcpm_dt2(rcpm_dt2);
dm.setSlip_clsf(slip_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 17:38:48 KST 2009 */