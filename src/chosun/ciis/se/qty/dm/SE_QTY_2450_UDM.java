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


public class SE_QTY_2450_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String send_clos_grp_clsf;
	public String clos_tms;
	public String decid_id;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_QTY_2450_UDM(){}
	public SE_QTY_2450_UDM(String cmpy_cd, String issu_dt, String send_clos_grp_clsf, String clos_tms, String decid_id, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.send_clos_grp_clsf = send_clos_grp_clsf;
		this.clos_tms = clos_tms;
		this.decid_id = decid_id;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setDecid_id(String decid_id){
		this.decid_id = decid_id;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getDecid_id(){
		return this.decid_id;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_2450_U(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_2450_UDM dm = (SE_QTY_2450_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt);
		cstmt.setString(5, dm.send_clos_grp_clsf);
		cstmt.setString(6, dm.clos_tms);
		cstmt.setString(7, dm.decid_id);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_2450_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("send_clos_grp_clsf = " + getSend_clos_grp_clsf());
        System.out.println("clos_tms = " + getClos_tms());
        System.out.println("decid_id = " + getDecid_id());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String decid_id = req.getParameter("decid_id");
if( decid_id == null){
	System.out.println(this.toString+" : decid_id is null" );
}else{
	System.out.println(this.toString+" : decid_id is "+decid_id );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
String clos_tms = Util.checkString(req.getParameter("clos_tms"));
String decid_id = Util.checkString(req.getParameter("decid_id"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String send_clos_grp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("send_clos_grp_clsf")));
String clos_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_tms")));
String decid_id = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_id")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setSend_clos_grp_clsf(send_clos_grp_clsf);
dm.setClos_tms(clos_tms);
dm.setDecid_id(decid_id);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 15 19:47:32 KST 2009 */