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


public class SE_QTY_2430_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode_ar;
	public String issu_dt_ar;
	public String send_clos_grp_clsf_ar;
	public String clos_tms_ar;
	public String remk_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_QTY_2430_ADM(){}
	public SE_QTY_2430_ADM(String cmpy_cd, String mode_ar, String issu_dt_ar, String send_clos_grp_clsf_ar, String clos_tms_ar, String remk_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode_ar = mode_ar;
		this.issu_dt_ar = issu_dt_ar;
		this.send_clos_grp_clsf_ar = send_clos_grp_clsf_ar;
		this.clos_tms_ar = clos_tms_ar;
		this.remk_ar = remk_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setIssu_dt_ar(String issu_dt_ar){
		this.issu_dt_ar = issu_dt_ar;
	}

	public void setSend_clos_grp_clsf_ar(String send_clos_grp_clsf_ar){
		this.send_clos_grp_clsf_ar = send_clos_grp_clsf_ar;
	}

	public void setClos_tms_ar(String clos_tms_ar){
		this.clos_tms_ar = clos_tms_ar;
	}

	public void setRemk_ar(String remk_ar){
		this.remk_ar = remk_ar;
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

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getIssu_dt_ar(){
		return this.issu_dt_ar;
	}

	public String getSend_clos_grp_clsf_ar(){
		return this.send_clos_grp_clsf_ar;
	}

	public String getClos_tms_ar(){
		return this.clos_tms_ar;
	}

	public String getRemk_ar(){
		return this.remk_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_2430_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_2430_ADM dm = (SE_QTY_2430_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode_ar);
		cstmt.setString(5, dm.issu_dt_ar);
		cstmt.setString(6, dm.send_clos_grp_clsf_ar);
		cstmt.setString(7, dm.clos_tms_ar);
		cstmt.setString(8, dm.remk_ar);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_2430_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("issu_dt_ar = " + getIssu_dt_ar());
        System.out.println("send_clos_grp_clsf_ar = " + getSend_clos_grp_clsf_ar());
        System.out.println("clos_tms_ar = " + getClos_tms_ar());
        System.out.println("remk_ar = " + getRemk_ar());
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
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String issu_dt_ar = req.getParameter("issu_dt_ar");
if( issu_dt_ar == null){
	System.out.println(this.toString+" : issu_dt_ar is null" );
}else{
	System.out.println(this.toString+" : issu_dt_ar is "+issu_dt_ar );
}
String send_clos_grp_clsf_ar = req.getParameter("send_clos_grp_clsf_ar");
if( send_clos_grp_clsf_ar == null){
	System.out.println(this.toString+" : send_clos_grp_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : send_clos_grp_clsf_ar is "+send_clos_grp_clsf_ar );
}
String clos_tms_ar = req.getParameter("clos_tms_ar");
if( clos_tms_ar == null){
	System.out.println(this.toString+" : clos_tms_ar is null" );
}else{
	System.out.println(this.toString+" : clos_tms_ar is "+clos_tms_ar );
}
String remk_ar = req.getParameter("remk_ar");
if( remk_ar == null){
	System.out.println(this.toString+" : remk_ar is null" );
}else{
	System.out.println(this.toString+" : remk_ar is "+remk_ar );
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
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String issu_dt_ar = Util.checkString(req.getParameter("issu_dt_ar"));
String send_clos_grp_clsf_ar = Util.checkString(req.getParameter("send_clos_grp_clsf_ar"));
String clos_tms_ar = Util.checkString(req.getParameter("clos_tms_ar"));
String remk_ar = Util.checkString(req.getParameter("remk_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String issu_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_ar")));
String send_clos_grp_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("send_clos_grp_clsf_ar")));
String clos_tms_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_tms_ar")));
String remk_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode_ar(mode_ar);
dm.setIssu_dt_ar(issu_dt_ar);
dm.setSend_clos_grp_clsf_ar(send_clos_grp_clsf_ar);
dm.setClos_tms_ar(clos_tms_ar);
dm.setRemk_ar(remk_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 19:52:34 KST 2009 */