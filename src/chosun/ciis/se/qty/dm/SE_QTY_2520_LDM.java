/***************************************************************************************************
* 파일명 : SE_QTY_2520_LDM.java
* 기능 : 부수관리 - 발송부수 - 노선별발송부수현황
* 작성일자 : 2009-03-06
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2520_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String route_clsf	;
	public String route_cd		;
	public String bo_cd			;
	public String send_plac_seq	;
	public String area_cd		;
	public String incmg_pers	;

	public SE_QTY_2520_LDM(){}
	public SE_QTY_2520_LDM(String cmpy_cd, String route_clsf, String route_cd, String bo_cd, String send_plac_seq, String area_cd, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.route_clsf 	= route_clsf	;
		this.route_cd 		= route_cd		;
		this.bo_cd 			= bo_cd			;
		this.send_plac_seq 	= send_plac_seq	;
		this.area_cd 		= area_cd		;
		this.incmg_pers 	= incmg_pers	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_QTY_2520_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_2520_LDM dm = (SE_QTY_2520_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd		);
		cstmt.setString(4, dm.route_clsf	);
		cstmt.setString(5, dm.route_cd		);
		cstmt.setString(6, dm.bo_cd			);
		cstmt.setString(7, dm.send_plac_seq	);
		cstmt.setString(8, dm.area_cd		);
		cstmt.setString(9, dm.incmg_pers	);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_2520_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("route_clsf 		= " + getRoute_clsf		());
        System.out.println("route_cd 		= " + getRoute_cd		());
        System.out.println("bo_cd 			= " + getBo_cd			());
        System.out.println("send_plac_seq 	= " + getSend_plac_seq	());
        System.out.println("area_cd 		= " + getArea_cd		());
        System.out.println("incmg_pers 		= " + getIncmg_pers		());
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
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String send_plac_seq = req.getParameter("send_plac_seq");
if( send_plac_seq == null){
	System.out.println(this.toString+" : send_plac_seq is null" );
}else{
	System.out.println(this.toString+" : send_plac_seq is "+send_plac_seq );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
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
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String send_plac_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRoute_clsf(route_clsf);
dm.setRoute_cd(route_cd);
dm.setBo_cd(bo_cd);
dm.setSend_plac_seq(send_plac_seq);
dm.setArea_cd(area_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 16:23:27 KST 2009 */