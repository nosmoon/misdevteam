/***************************************************************************************************
* 파일명 : SE_COMM_2400_MDM.java
* 기능 :  수송업자 팝업
* 작성일자 : 2009.06.09
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


public class SE_COMM_2410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd           ;
	public String prt_plac_cd       ;
	public String route_clsf        ;
	public String tran_uprc_cd      ;
	public String tran_uprc_route_nm;
	public String tran_uprc_clas    ;
	public String bgn_dt 	        ;
	public String end_dt 	        ;
	public String incmg_pers        ;

	public SE_COMM_2410_LDM(){}
	public SE_COMM_2410_LDM(String cmpy_cd, String prt_plac_cd, String route_clsf, String tran_uprc_cd, String tran_uprc_route_nm, String tran_uprc_clas, String bgn_dt, String end_dt, String incmg_pers){
		this.cmpy_cd           	= cmpy_cd           ;
		this.prt_plac_cd       	= prt_plac_cd       ;
		this.route_clsf        	= route_clsf        ;
		this.tran_uprc_cd      	= tran_uprc_cd      ;
		this.tran_uprc_route_nm	= tran_uprc_route_nm;
		this.tran_uprc_clas    	= tran_uprc_clas    ;
		this.bgn_dt           	= bgn_dt            ;
		this.end_dt           	= end_dt            ;
		this.incmg_pers        	= incmg_pers        ;
	}

	
	public String getSQL(){
		 return "{ call SP_SE_COMM_2410_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_COMM_2410_LDM dm = (SE_COMM_2410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd				);
		cstmt.setString( 4, dm.prt_plac_cd			);
		cstmt.setString( 5, dm.route_clsf			);
		cstmt.setString( 6, dm.tran_uprc_cd			);
		cstmt.setString( 7, dm.tran_uprc_route_nm	);
		cstmt.setString( 8, dm.tran_uprc_clas		);
		cstmt.setString( 9, dm.bgn_dt				);
		cstmt.setString(10, dm.end_dt				);
		cstmt.setString(11, dm.incmg_pers			);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.comm.ds.SE_COMM_2410_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 			= " + getCmpy_cd			());
        System.out.println("prt_plac_cd 		= " + getPrt_plac_cd		());
        System.out.println("route_clsf 			= " + getRoute_clsf			());
        System.out.println("tran_uprc_cd 		= " + getTran_uprc_cd		());
        System.out.println("tran_uprc_route_nm 	= " + getTran_uprc_route_nm	());
        System.out.println("tran_uprc_clas 		= " + getTran_uprc_clas		());
        System.out.println("bgn_dt 				= " + getBgn_dt				());
        System.out.println("end_dt 				= " + getEnd_dt				());
        System.out.println("incmg_pers 			= " + getIncmg_pers			());
    }
	
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getPrt_plac_cd() {
		return prt_plac_cd;
	}
	public void setPrt_plac_cd(String prt_plac_cd) {
		this.prt_plac_cd = prt_plac_cd;
	}
	public String getRoute_clsf() {
		return route_clsf;
	}
	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}
	public String getTran_uprc_cd() {
		return tran_uprc_cd;
	}
	public void setTran_uprc_cd(String tran_uprc_cd) {
		this.tran_uprc_cd = tran_uprc_cd;
	}
	public String getTran_uprc_clas() {
		return tran_uprc_clas;
	}
	public void setTran_uprc_clas(String tran_uprc_clas) {
		this.tran_uprc_clas = tran_uprc_clas;
	}
	public String getTran_uprc_route_nm() {
		return tran_uprc_route_nm;
	}
	public void setTran_uprc_route_nm(String tran_uprc_route_nm) {
		this.tran_uprc_route_nm = tran_uprc_route_nm;
	}
	public String getBgn_dt() {
		return bgn_dt;
	}
	public void setBgn_dt(String bgn_dt) {
		this.bgn_dt = bgn_dt;
	}
	public String getEnd_dt() {
		return end_dt;
	}
	public void setEnd_dt(String end_dt) {
		this.end_dt = end_dt;
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 09:12:20 KST 2009 */