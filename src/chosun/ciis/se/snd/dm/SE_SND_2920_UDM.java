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


public class SE_SND_2920_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode_ar;
	public String reg_dt_ar;
	public String reg_seq_ar;
	public String sect_cd_ar;
	public String route_clsf_ar;
	public String bo_cd_ar;
	public String send_plac_seq_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_SND_2920_UDM(){}
	public SE_SND_2920_UDM(String cmpy_cd, String mode_ar, String reg_dt_ar, String reg_seq_ar, String sect_cd_ar, String route_clsf_ar, String bo_cd_ar, String send_plac_seq_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode_ar = mode_ar;
		this.reg_dt_ar = reg_dt_ar;
		this.reg_seq_ar = reg_seq_ar;
		this.sect_cd_ar = sect_cd_ar;
		this.route_clsf_ar = route_clsf_ar;
		this.bo_cd_ar = bo_cd_ar;
		this.send_plac_seq_ar = send_plac_seq_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setReg_dt_ar(String reg_dt_ar){
		this.reg_dt_ar = reg_dt_ar;
	}

	public void setReg_seq_ar(String reg_seq_ar){
		this.reg_seq_ar = reg_seq_ar;
	}

	public void setSect_cd_ar(String sect_cd_ar){
		this.sect_cd_ar = sect_cd_ar;
	}

	public void setRoute_clsf_ar(String route_clsf_ar){
		this.route_clsf_ar = route_clsf_ar;
	}

	public void setBo_cd_ar(String bo_cd_ar){
		this.bo_cd_ar = bo_cd_ar;
	}

	public void setSend_plac_seq_ar(String send_plac_seq_ar){
		this.send_plac_seq_ar = send_plac_seq_ar;
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

	public String getReg_dt_ar(){
		return this.reg_dt_ar;
	}

	public String getReg_seq_ar(){
		return this.reg_seq_ar;
	}

	public String getSect_cd_ar(){
		return this.sect_cd_ar;
	}

	public String getRoute_clsf_ar(){
		return this.route_clsf_ar;
	}

	public String getBo_cd_ar(){
		return this.bo_cd_ar;
	}

	public String getSend_plac_seq_ar(){
		return this.send_plac_seq_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_2920_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2920_UDM dm = (SE_SND_2920_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode_ar);
		cstmt.setString(5, dm.reg_dt_ar);
		cstmt.setString(6, dm.reg_seq_ar);
		cstmt.setString(7, dm.sect_cd_ar);
		cstmt.setString(8, dm.route_clsf_ar);
		cstmt.setString(9, dm.bo_cd_ar);
		cstmt.setString(10, dm.send_plac_seq_ar);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2920_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("reg_dt_ar = " + getReg_dt_ar());
        System.out.println("reg_seq_ar = " + getReg_seq_ar());
        System.out.println("sect_cd_ar = " + getSect_cd_ar());
        System.out.println("route_clsf_ar = " + getRoute_clsf_ar());
        System.out.println("bo_cd_ar = " + getBo_cd_ar());
        System.out.println("send_plac_seq_ar = " + getSend_plac_seq_ar());
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
String reg_dt_ar = req.getParameter("reg_dt_ar");
if( reg_dt_ar == null){
	System.out.println(this.toString+" : reg_dt_ar is null" );
}else{
	System.out.println(this.toString+" : reg_dt_ar is "+reg_dt_ar );
}
String reg_seq_ar = req.getParameter("reg_seq_ar");
if( reg_seq_ar == null){
	System.out.println(this.toString+" : reg_seq_ar is null" );
}else{
	System.out.println(this.toString+" : reg_seq_ar is "+reg_seq_ar );
}
String sect_cd_ar = req.getParameter("sect_cd_ar");
if( sect_cd_ar == null){
	System.out.println(this.toString+" : sect_cd_ar is null" );
}else{
	System.out.println(this.toString+" : sect_cd_ar is "+sect_cd_ar );
}
String route_clsf_ar = req.getParameter("route_clsf_ar");
if( route_clsf_ar == null){
	System.out.println(this.toString+" : route_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : route_clsf_ar is "+route_clsf_ar );
}
String bo_cd_ar = req.getParameter("bo_cd_ar");
if( bo_cd_ar == null){
	System.out.println(this.toString+" : bo_cd_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cd_ar is "+bo_cd_ar );
}
String send_plac_seq_ar = req.getParameter("send_plac_seq_ar");
if( send_plac_seq_ar == null){
	System.out.println(this.toString+" : send_plac_seq_ar is null" );
}else{
	System.out.println(this.toString+" : send_plac_seq_ar is "+send_plac_seq_ar );
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
String reg_dt_ar = Util.checkString(req.getParameter("reg_dt_ar"));
String reg_seq_ar = Util.checkString(req.getParameter("reg_seq_ar"));
String sect_cd_ar = Util.checkString(req.getParameter("sect_cd_ar"));
String route_clsf_ar = Util.checkString(req.getParameter("route_clsf_ar"));
String bo_cd_ar = Util.checkString(req.getParameter("bo_cd_ar"));
String send_plac_seq_ar = Util.checkString(req.getParameter("send_plac_seq_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String reg_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt_ar")));
String reg_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_seq_ar")));
String sect_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd_ar")));
String route_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf_ar")));
String bo_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd_ar")));
String send_plac_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode_ar(mode_ar);
dm.setReg_dt_ar(reg_dt_ar);
dm.setReg_seq_ar(reg_seq_ar);
dm.setSect_cd_ar(sect_cd_ar);
dm.setRoute_clsf_ar(route_clsf_ar);
dm.setBo_cd_ar(bo_cd_ar);
dm.setSend_plac_seq_ar(send_plac_seq_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 13 15:18:39 KST 2009 */