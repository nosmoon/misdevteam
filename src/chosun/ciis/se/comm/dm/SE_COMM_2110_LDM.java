/***************************************************************************************************
* 파일명 : SE_COMM_2110_LDM.java
* 기능 :  수송단가 팝업
* 작성일자 : 2009.02.18
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.ds.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_2110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String tran_uprc_cd;
	public String bgn_aply_dt;
	public String end_aply_dt;
	public String tran_uprc_nm;
	public String tran_uprc_clas;
	public String route_clsf;
	public String prt_plac_cd;
	public String incmg_pers;

	public SE_COMM_2110_LDM(){}
	public SE_COMM_2110_LDM(String cmpy_cd, String tran_uprc_cd, String bgn_aply_dt, String end_aply_dt, String tran_uprc_nm, String tran_uprc_clas, String route_clsf, String prt_plac_cd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.tran_uprc_cd = tran_uprc_cd;
		this.bgn_aply_dt = bgn_aply_dt;
		this.end_aply_dt = end_aply_dt;
		this.tran_uprc_nm = tran_uprc_nm;
		this.tran_uprc_clas = tran_uprc_clas;
		this.route_clsf = route_clsf;
		this.prt_plac_cd = prt_plac_cd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setBgn_aply_dt(String bgn_aply_dt){
		this.bgn_aply_dt = bgn_aply_dt;
	}

	public void setEnd_aply_dt(String end_aply_dt){
		this.end_aply_dt = end_aply_dt;
	}

	public void setTran_uprc_nm(String tran_uprc_nm){
		this.tran_uprc_nm = tran_uprc_nm;
	}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getBgn_aply_dt(){
		return this.bgn_aply_dt;
	}

	public String getEnd_aply_dt(){
		return this.end_aply_dt;
	}

	public String getTran_uprc_nm(){
		return this.tran_uprc_nm;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_COMM_2110_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_COMM_2110_LDM dm = (SE_COMM_2110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.tran_uprc_cd);
		cstmt.setString(5, dm.bgn_aply_dt);
		cstmt.setString(6, dm.end_aply_dt);
		cstmt.setString(7, dm.tran_uprc_nm);
		cstmt.setString(8, dm.tran_uprc_clas);
		cstmt.setString(9, dm.route_clsf);
		cstmt.setString(10, dm.prt_plac_cd);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.comm.ds.SE_COMM_2110_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("tran_uprc_cd = " + getTran_uprc_cd());
        System.out.println("bgn_aply_dt = " + getBgn_aply_dt());
        System.out.println("end_aply_dt = " + getEnd_aply_dt());
        System.out.println("tran_uprc_nm = " + getTran_uprc_nm());
        System.out.println("tran_uprc_clas = " + getTran_uprc_clas());
        System.out.println("route_clsf = " + getRoute_clsf());
        System.out.println("prt_plac_cd = " + getPrt_plac_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String tran_uprc_cd = req.getParameter("tran_uprc_cd");
if( tran_uprc_cd == null){
	System.out.println(this.toString+" : tran_uprc_cd is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_cd is "+tran_uprc_cd );
}
String bgn_aply_dt = req.getParameter("bgn_aply_dt");
if( bgn_aply_dt == null){
	System.out.println(this.toString+" : bgn_aply_dt is null" );
}else{
	System.out.println(this.toString+" : bgn_aply_dt is "+bgn_aply_dt );
}
String end_aply_dt = req.getParameter("end_aply_dt");
if( end_aply_dt == null){
	System.out.println(this.toString+" : end_aply_dt is null" );
}else{
	System.out.println(this.toString+" : end_aply_dt is "+end_aply_dt );
}
String tran_uprc_nm = req.getParameter("tran_uprc_nm");
if( tran_uprc_nm == null){
	System.out.println(this.toString+" : tran_uprc_nm is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_nm is "+tran_uprc_nm );
}
String tran_uprc_clas = req.getParameter("tran_uprc_clas");
if( tran_uprc_clas == null){
	System.out.println(this.toString+" : tran_uprc_clas is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_clas is "+tran_uprc_clas );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
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
String tran_uprc_cd = Util.checkString(req.getParameter("tran_uprc_cd"));
String bgn_aply_dt = Util.checkString(req.getParameter("bgn_aply_dt"));
String end_aply_dt = Util.checkString(req.getParameter("end_aply_dt"));
String tran_uprc_nm = Util.checkString(req.getParameter("tran_uprc_nm"));
String tran_uprc_clas = Util.checkString(req.getParameter("tran_uprc_clas"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tran_uprc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_cd")));
String bgn_aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_aply_dt")));
String end_aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_aply_dt")));
String tran_uprc_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_nm")));
String tran_uprc_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_clas")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTran_uprc_cd(tran_uprc_cd);
dm.setBgn_aply_dt(bgn_aply_dt);
dm.setEnd_aply_dt(end_aply_dt);
dm.setTran_uprc_nm(tran_uprc_nm);
dm.setTran_uprc_clas(tran_uprc_clas);
dm.setRoute_clsf(route_clsf);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 10:26:50 KST 2009 */