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


package chosun.ciis.se.trg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.ds.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1820_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yy;
	public String evlu_seq;
	public String mode_ar;
	public String team_cd_ar;
	public String part_cd_ar;
	public String area_cd_ar;
	public String chrg_pers_ar;
	public String evlu_yn_ar;
	public String evlu_grp_ar;
	public String remk_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_TRG_1820_ADM(){}
	public SE_TRG_1820_ADM(String cmpy_cd, String yy, String evlu_seq, String mode_ar, String team_cd_ar, String part_cd_ar, String area_cd_ar, String chrg_pers_ar, String evlu_yn_ar, String evlu_grp_ar, String remk_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.yy = yy;
		this.evlu_seq = evlu_seq;
		this.mode_ar = mode_ar;
		this.team_cd_ar = team_cd_ar;
		this.part_cd_ar = part_cd_ar;
		this.area_cd_ar = area_cd_ar;
		this.chrg_pers_ar = chrg_pers_ar;
		this.evlu_yn_ar = evlu_yn_ar;
		this.evlu_grp_ar = evlu_grp_ar;
		this.remk_ar = remk_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setEvlu_seq(String evlu_seq){
		this.evlu_seq = evlu_seq;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setTeam_cd_ar(String team_cd_ar){
		this.team_cd_ar = team_cd_ar;
	}

	public void setPart_cd_ar(String part_cd_ar){
		this.part_cd_ar = part_cd_ar;
	}

	public void setArea_cd_ar(String area_cd_ar){
		this.area_cd_ar = area_cd_ar;
	}

	public void setChrg_pers_ar(String chrg_pers_ar){
		this.chrg_pers_ar = chrg_pers_ar;
	}

	public void setEvlu_yn_ar(String evlu_yn_ar){
		this.evlu_yn_ar = evlu_yn_ar;
	}

	public void setEvlu_grp_ar(String evlu_grp_ar){
		this.evlu_grp_ar = evlu_grp_ar;
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

	public String getYy(){
		return this.yy;
	}

	public String getEvlu_seq(){
		return this.evlu_seq;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getTeam_cd_ar(){
		return this.team_cd_ar;
	}

	public String getPart_cd_ar(){
		return this.part_cd_ar;
	}

	public String getArea_cd_ar(){
		return this.area_cd_ar;
	}

	public String getChrg_pers_ar(){
		return this.chrg_pers_ar;
	}

	public String getEvlu_yn_ar(){
		return this.evlu_yn_ar;
	}

	public String getEvlu_grp_ar(){
		return this.evlu_grp_ar;
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
		 return "{ call CRMSAL_COM.SP_SE_TRG_1820_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1820_ADM dm = (SE_TRG_1820_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yy);
		cstmt.setString(5, dm.evlu_seq);
		cstmt.setString(6, dm.mode_ar);
		cstmt.setString(7, dm.team_cd_ar);
		cstmt.setString(8, dm.part_cd_ar);
		cstmt.setString(9, dm.area_cd_ar);
		cstmt.setString(10, dm.chrg_pers_ar);
		cstmt.setString(11, dm.evlu_yn_ar);
		cstmt.setString(12, dm.evlu_grp_ar);
		cstmt.setString(13, dm.remk_ar);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1820_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yy = " + getYy());
        System.out.println("evlu_seq = " + getEvlu_seq());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("team_cd_ar = " + getTeam_cd_ar());
        System.out.println("part_cd_ar = " + getPart_cd_ar());
        System.out.println("area_cd_ar = " + getArea_cd_ar());
        System.out.println("chrg_pers_ar = " + getChrg_pers_ar());
        System.out.println("evlu_yn_ar = " + getEvlu_yn_ar());
        System.out.println("evlu_grp_ar = " + getEvlu_grp_ar());
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
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String evlu_seq = req.getParameter("evlu_seq");
if( evlu_seq == null){
	System.out.println(this.toString+" : evlu_seq is null" );
}else{
	System.out.println(this.toString+" : evlu_seq is "+evlu_seq );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String team_cd_ar = req.getParameter("team_cd_ar");
if( team_cd_ar == null){
	System.out.println(this.toString+" : team_cd_ar is null" );
}else{
	System.out.println(this.toString+" : team_cd_ar is "+team_cd_ar );
}
String part_cd_ar = req.getParameter("part_cd_ar");
if( part_cd_ar == null){
	System.out.println(this.toString+" : part_cd_ar is null" );
}else{
	System.out.println(this.toString+" : part_cd_ar is "+part_cd_ar );
}
String area_cd_ar = req.getParameter("area_cd_ar");
if( area_cd_ar == null){
	System.out.println(this.toString+" : area_cd_ar is null" );
}else{
	System.out.println(this.toString+" : area_cd_ar is "+area_cd_ar );
}
String chrg_pers_ar = req.getParameter("chrg_pers_ar");
if( chrg_pers_ar == null){
	System.out.println(this.toString+" : chrg_pers_ar is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_ar is "+chrg_pers_ar );
}
String evlu_yn_ar = req.getParameter("evlu_yn_ar");
if( evlu_yn_ar == null){
	System.out.println(this.toString+" : evlu_yn_ar is null" );
}else{
	System.out.println(this.toString+" : evlu_yn_ar is "+evlu_yn_ar );
}
String evlu_grp_ar = req.getParameter("evlu_grp_ar");
if( evlu_grp_ar == null){
	System.out.println(this.toString+" : evlu_grp_ar is null" );
}else{
	System.out.println(this.toString+" : evlu_grp_ar is "+evlu_grp_ar );
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
String yy = Util.checkString(req.getParameter("yy"));
String evlu_seq = Util.checkString(req.getParameter("evlu_seq"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String team_cd_ar = Util.checkString(req.getParameter("team_cd_ar"));
String part_cd_ar = Util.checkString(req.getParameter("part_cd_ar"));
String area_cd_ar = Util.checkString(req.getParameter("area_cd_ar"));
String chrg_pers_ar = Util.checkString(req.getParameter("chrg_pers_ar"));
String evlu_yn_ar = Util.checkString(req.getParameter("evlu_yn_ar"));
String evlu_grp_ar = Util.checkString(req.getParameter("evlu_grp_ar"));
String remk_ar = Util.checkString(req.getParameter("remk_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String evlu_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_seq")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String team_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd_ar")));
String part_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd_ar")));
String area_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd_ar")));
String chrg_pers_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_ar")));
String evlu_yn_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yn_ar")));
String evlu_grp_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_grp_ar")));
String remk_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYy(yy);
dm.setEvlu_seq(evlu_seq);
dm.setMode_ar(mode_ar);
dm.setTeam_cd_ar(team_cd_ar);
dm.setPart_cd_ar(part_cd_ar);
dm.setArea_cd_ar(area_cd_ar);
dm.setChrg_pers_ar(chrg_pers_ar);
dm.setEvlu_yn_ar(evlu_yn_ar);
dm.setEvlu_grp_ar(evlu_grp_ar);
dm.setRemk_ar(remk_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 20:08:01 KST 2009 */