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


public class SE_TRG_1430_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String team_cd;
	public String yymm;
	public String colcnt;
	public String evlu_grp_ar;
	public String bo_cnt_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_TRG_1430_ADM(){}
	public SE_TRG_1430_ADM(String cmpy_cd, String team_cd, String yymm, String colcnt, String evlu_grp_ar, String bo_cnt_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.team_cd = team_cd;
		this.yymm = yymm;
		this.colcnt = colcnt;
		this.evlu_grp_ar = evlu_grp_ar;
		this.bo_cnt_ar = bo_cnt_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setColcnt(String colcnt){
		this.colcnt = colcnt;
	}

	public void setEvlu_grp_ar(String evlu_grp_ar){
		this.evlu_grp_ar = evlu_grp_ar;
	}

	public void setBo_cnt_ar(String bo_cnt_ar){
		this.bo_cnt_ar = bo_cnt_ar;
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

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getColcnt(){
		return this.colcnt;
	}

	public String getEvlu_grp_ar(){
		return this.evlu_grp_ar;
	}

	public String getBo_cnt_ar(){
		return this.bo_cnt_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TRG_1430_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1430_ADM dm = (SE_TRG_1430_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.team_cd);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.colcnt);
		cstmt.setString(7, dm.evlu_grp_ar);
		cstmt.setString(8, dm.bo_cnt_ar);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1430_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("team_cd = " + getTeam_cd());
        System.out.println("yymm = " + getYymm());
        System.out.println("colcnt = " + getColcnt());
        System.out.println("evlu_grp_ar = " + getEvlu_grp_ar());
        System.out.println("bo_cnt_ar = " + getBo_cnt_ar());
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
String team_cd = req.getParameter("team_cd");
if( team_cd == null){
	System.out.println(this.toString+" : team_cd is null" );
}else{
	System.out.println(this.toString+" : team_cd is "+team_cd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String colcnt = req.getParameter("colcnt");
if( colcnt == null){
	System.out.println(this.toString+" : colcnt is null" );
}else{
	System.out.println(this.toString+" : colcnt is "+colcnt );
}
String evlu_grp_ar = req.getParameter("evlu_grp_ar");
if( evlu_grp_ar == null){
	System.out.println(this.toString+" : evlu_grp_ar is null" );
}else{
	System.out.println(this.toString+" : evlu_grp_ar is "+evlu_grp_ar );
}
String bo_cnt_ar = req.getParameter("bo_cnt_ar");
if( bo_cnt_ar == null){
	System.out.println(this.toString+" : bo_cnt_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cnt_ar is "+bo_cnt_ar );
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
String team_cd = Util.checkString(req.getParameter("team_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String colcnt = Util.checkString(req.getParameter("colcnt"));
String evlu_grp_ar = Util.checkString(req.getParameter("evlu_grp_ar"));
String bo_cnt_ar = Util.checkString(req.getParameter("bo_cnt_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String colcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("colcnt")));
String evlu_grp_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_grp_ar")));
String bo_cnt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cnt_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam_cd(team_cd);
dm.setYymm(yymm);
dm.setColcnt(colcnt);
dm.setEvlu_grp_ar(evlu_grp_ar);
dm.setBo_cnt_ar(bo_cnt_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 17:56:23 KST 2009 */