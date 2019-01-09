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


public class SE_QTY_2420_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String callgb;
	public String issu_dt;
	public String send_clos_grp_clsf;
	public String clos_tms;
	public String incmg_pers;

	public SE_QTY_2420_LDM(){}
	public SE_QTY_2420_LDM(String cmpy_cd, String callgb, String issu_dt, String send_clos_grp_clsf, String clos_tms, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.callgb = callgb;
		this.issu_dt = issu_dt;
		this.send_clos_grp_clsf = send_clos_grp_clsf;
		this.clos_tms = clos_tms;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCallgb(String callgb){
		this.callgb = callgb;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSend_clos_grp_clsf(String send_clos_grp_clsf){
		this.send_clos_grp_clsf = send_clos_grp_clsf;
	}

	public void setClos_tms(String clos_tms){
		this.clos_tms = clos_tms;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCallgb(){
		return this.callgb;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSend_clos_grp_clsf(){
		return this.send_clos_grp_clsf;
	}

	public String getClos_tms(){
		return this.clos_tms;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_2420_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_2420_LDM dm = (SE_QTY_2420_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.callgb);
		cstmt.setString(5, dm.issu_dt);
		cstmt.setString(6, dm.send_clos_grp_clsf);
		cstmt.setString(7, dm.clos_tms);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_2420_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("callgb = " + getCallgb());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("send_clos_grp_clsf = " + getSend_clos_grp_clsf());
        System.out.println("clos_tms = " + getClos_tms());
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
String callgb = req.getParameter("callgb");
if( callgb == null){
	System.out.println(this.toString+" : callgb is null" );
}else{
	System.out.println(this.toString+" : callgb is "+callgb );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String send_clos_grp_clsf = req.getParameter("send_clos_grp_clsf");
if( send_clos_grp_clsf == null){
	System.out.println(this.toString+" : send_clos_grp_clsf is null" );
}else{
	System.out.println(this.toString+" : send_clos_grp_clsf is "+send_clos_grp_clsf );
}
String clos_tms = req.getParameter("clos_tms");
if( clos_tms == null){
	System.out.println(this.toString+" : clos_tms is null" );
}else{
	System.out.println(this.toString+" : clos_tms is "+clos_tms );
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
String callgb = Util.checkString(req.getParameter("callgb"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
String clos_tms = Util.checkString(req.getParameter("clos_tms"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String callgb = Util.Uni2Ksc(Util.checkString(req.getParameter("callgb")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String send_clos_grp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("send_clos_grp_clsf")));
String clos_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_tms")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCallgb(callgb);
dm.setIssu_dt(issu_dt);
dm.setSend_clos_grp_clsf(send_clos_grp_clsf);
dm.setClos_tms(clos_tms);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 09 21:03:55 KST 2009 */