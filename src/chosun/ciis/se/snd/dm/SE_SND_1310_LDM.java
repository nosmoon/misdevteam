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


public class SE_SND_1310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String route_clsf;
	public String bgn_reg_dt;
	public String end_reg_dt;
	public String incmg_pers;
	
	public SE_SND_1310_LDM(){}
	public SE_SND_1310_LDM(String cmpy_cd, String route_clsf, String bgn_reg_dt, String end_reg_dt, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd;
		this.route_clsf		= route_clsf;
		this.bgn_reg_dt		= bgn_reg_dt;
		this.end_reg_dt		= end_reg_dt;
		this.incmg_pers		= incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBgn_reg_dt() {
		return bgn_reg_dt;
	}
	public void setBgn_reg_dt(String bgn_reg_dt) {
		this.bgn_reg_dt = bgn_reg_dt;
	}
	public String getEnd_reg_dt() {
		return end_reg_dt;
	}
	public void setEnd_reg_dt(String end_reg_dt) {
		this.end_reg_dt = end_reg_dt;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getRoute_clsf() {
		return route_clsf;
	}
	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}
	
	public String getSQL(){
		 return "{ call SP_SE_SND_1310_L( ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1310_LDM dm = (SE_SND_1310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.route_clsf);
		cstmt.setString(5, dm.bgn_reg_dt);
		cstmt.setString(6, dm.end_reg_dt);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1310_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd()		);
        System.out.println("route_clsf 	= " + getRoute_clsf()	);
        System.out.println("bgn_reg_dt 	= " + getBgn_reg_dt()	);
        System.out.println("end_reg_dt 	= " + getEnd_reg_dt()	);
        System.out.println("incmg_pers 	= " + getIncmg_pers()	);
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
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
String route_cd = req.getParameter("route_cd");
if( route_cd == null){
	System.out.println(this.toString+" : route_cd is null" );
}else{
	System.out.println(this.toString+" : route_cd is "+route_cd );
}
String inwsp_send_yn = req.getParameter("inwsp_send_yn");
if( inwsp_send_yn == null){
	System.out.println(this.toString+" : inwsp_send_yn is null" );
}else{
	System.out.println(this.toString+" : inwsp_send_yn is "+inwsp_send_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String inwsp_send_yn = Util.checkString(req.getParameter("inwsp_send_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String inwsp_send_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("inwsp_send_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRoute_clsf(route_clsf);
dm.setRoute_cd(route_cd);
dm.setInwsp_send_yn(inwsp_send_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 20 19:27:48 KST 2009 */