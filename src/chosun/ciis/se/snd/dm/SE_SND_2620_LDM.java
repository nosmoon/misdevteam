/***************************************************************************************************
* 파일명 : SE_SND_2620_LDM.java
* 기능 : 판매-발송관리-수송단가조회
* 작성일자 : 2009-02-24
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2620_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String route_cd;
	public String prt_plac_cd;
	public String route_clsf;
	public String aply_dt;
	public String incmg_pers;

	public SE_SND_2620_LDM(){}
	public SE_SND_2620_LDM(String cmpy_cd, String route_cd, String prt_plac_cd, String route_clsf, String aply_dt, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.route_cd = route_cd;
		this.prt_plac_cd = prt_plac_cd;
		this.route_clsf = route_clsf;
		this.aply_dt = aply_dt;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_2620_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2620_LDM dm = (SE_SND_2620_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd		);
		cstmt.setString(4, dm.route_cd		);
		cstmt.setString(5, dm.prt_plac_cd	);
		cstmt.setString(6, dm.route_clsf	);
		cstmt.setString(7, dm.aply_dt		);
		cstmt.setString(8, dm.incmg_pers	);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2620_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd		());
        System.out.println("route_cd 	= " + getRoute_cd		());
        System.out.println("prt_plac_cd = " + getPrt_plac_cd	());
        System.out.println("route_clsf 	= " + getRoute_clsf		());
        System.out.println("aply_dt 	= " + getAply_dt		());
        System.out.println("incmg_pers	= " + getIncmg_pers		());
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
String route_cd = req.getParameter("route_cd");
if( route_cd == null){
	System.out.println(this.toString+" : route_cd is null" );
}else{
	System.out.println(this.toString+" : route_cd is "+route_cd );
}
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
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
String route_cd = Util.checkString(req.getParameter("route_cd"));
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRoute_cd(route_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setRoute_clsf(route_clsf);
dm.setAply_dt(aply_dt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 24 13:25:25 KST 2009 */