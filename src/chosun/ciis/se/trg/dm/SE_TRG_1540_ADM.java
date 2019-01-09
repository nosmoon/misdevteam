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


public class SE_TRG_1540_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String team_cd;
	public String yymm;
	public String evlu_seq;
	public String mode_ar;
	public String bo_cdseq_ar;
	public String ufth_dedu_ar;
	public String re_free_dedu_ar;
	public String camp_dedu_ar;
	public String exst_rdr_dedu_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_TRG_1540_ADM(){}
	public SE_TRG_1540_ADM(String cmpy_cd, String team_cd, String yymm, String evlu_seq, String mode_ar, String bo_cdseq_ar, String ufth_dedu_ar, String re_free_dedu_ar, String camp_dedu_ar, String exst_rdr_dedu_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.team_cd = team_cd;
		this.yymm = yymm;
		this.evlu_seq = evlu_seq;
		this.mode_ar = mode_ar;
		this.bo_cdseq_ar = bo_cdseq_ar;
		this.ufth_dedu_ar = ufth_dedu_ar;
		this.re_free_dedu_ar = re_free_dedu_ar;
		this.camp_dedu_ar = camp_dedu_ar;
		this.exst_rdr_dedu_ar = exst_rdr_dedu_ar;
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

	public void setEvlu_seq(String evlu_seq){
		this.evlu_seq = evlu_seq;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setBo_cdseq_ar(String bo_cdseq_ar){
		this.bo_cdseq_ar = bo_cdseq_ar;
	}

	public void setUfth_dedu_ar(String ufth_dedu_ar){
		this.ufth_dedu_ar = ufth_dedu_ar;
	}

	public void setRe_free_dedu_ar(String re_free_dedu_ar){
		this.re_free_dedu_ar = re_free_dedu_ar;
	}

	public void setCamp_dedu_ar(String camp_dedu_ar){
		this.camp_dedu_ar = camp_dedu_ar;
	}

	public void setExst_rdr_dedu_ar(String exst_rdr_dedu_ar){
		this.exst_rdr_dedu_ar = exst_rdr_dedu_ar;
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

	public String getEvlu_seq(){
		return this.evlu_seq;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getBo_cdseq_ar(){
		return this.bo_cdseq_ar;
	}

	public String getUfth_dedu_ar(){
		return this.ufth_dedu_ar;
	}

	public String getRe_free_dedu_ar(){
		return this.re_free_dedu_ar;
	}

	public String getCamp_dedu_ar(){
		return this.camp_dedu_ar;
	}

	public String getExst_rdr_dedu_ar(){
		return this.exst_rdr_dedu_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TRG_1540_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1540_ADM dm = (SE_TRG_1540_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.team_cd);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.evlu_seq);
		cstmt.setString(7, dm.mode_ar);
		cstmt.setString(8, dm.bo_cdseq_ar);
		cstmt.setString(9, dm.ufth_dedu_ar);
		cstmt.setString(10, dm.re_free_dedu_ar);
		cstmt.setString(11, dm.camp_dedu_ar);
		cstmt.setString(12, dm.exst_rdr_dedu_ar);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1540_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("team_cd = " + getTeam_cd());
        System.out.println("yymm = " + getYymm());
        System.out.println("evlu_seq = " + getEvlu_seq());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("bo_cdseq_ar = " + getBo_cdseq_ar());
        System.out.println("ufth_dedu_ar = " + getUfth_dedu_ar());
        System.out.println("re_free_dedu_ar = " + getRe_free_dedu_ar());
        System.out.println("camp_dedu_ar = " + getCamp_dedu_ar());
        System.out.println("exst_rdr_dedu_ar = " + getExst_rdr_dedu_ar());
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
String bo_cdseq_ar = req.getParameter("bo_cdseq_ar");
if( bo_cdseq_ar == null){
	System.out.println(this.toString+" : bo_cdseq_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq_ar is "+bo_cdseq_ar );
}
String ufth_dedu_ar = req.getParameter("ufth_dedu_ar");
if( ufth_dedu_ar == null){
	System.out.println(this.toString+" : ufth_dedu_ar is null" );
}else{
	System.out.println(this.toString+" : ufth_dedu_ar is "+ufth_dedu_ar );
}
String re_free_dedu_ar = req.getParameter("re_free_dedu_ar");
if( re_free_dedu_ar == null){
	System.out.println(this.toString+" : re_free_dedu_ar is null" );
}else{
	System.out.println(this.toString+" : re_free_dedu_ar is "+re_free_dedu_ar );
}
String camp_dedu_ar = req.getParameter("camp_dedu_ar");
if( camp_dedu_ar == null){
	System.out.println(this.toString+" : camp_dedu_ar is null" );
}else{
	System.out.println(this.toString+" : camp_dedu_ar is "+camp_dedu_ar );
}
String exst_rdr_dedu_ar = req.getParameter("exst_rdr_dedu_ar");
if( exst_rdr_dedu_ar == null){
	System.out.println(this.toString+" : exst_rdr_dedu_ar is null" );
}else{
	System.out.println(this.toString+" : exst_rdr_dedu_ar is "+exst_rdr_dedu_ar );
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
String evlu_seq = Util.checkString(req.getParameter("evlu_seq"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String bo_cdseq_ar = Util.checkString(req.getParameter("bo_cdseq_ar"));
String ufth_dedu_ar = Util.checkString(req.getParameter("ufth_dedu_ar"));
String re_free_dedu_ar = Util.checkString(req.getParameter("re_free_dedu_ar"));
String camp_dedu_ar = Util.checkString(req.getParameter("camp_dedu_ar"));
String exst_rdr_dedu_ar = Util.checkString(req.getParameter("exst_rdr_dedu_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String evlu_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_seq")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String bo_cdseq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq_ar")));
String ufth_dedu_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("ufth_dedu_ar")));
String re_free_dedu_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("re_free_dedu_ar")));
String camp_dedu_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("camp_dedu_ar")));
String exst_rdr_dedu_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("exst_rdr_dedu_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam_cd(team_cd);
dm.setYymm(yymm);
dm.setEvlu_seq(evlu_seq);
dm.setMode_ar(mode_ar);
dm.setBo_cdseq_ar(bo_cdseq_ar);
dm.setUfth_dedu_ar(ufth_dedu_ar);
dm.setRe_free_dedu_ar(re_free_dedu_ar);
dm.setCamp_dedu_ar(camp_dedu_ar);
dm.setExst_rdr_dedu_ar(exst_rdr_dedu_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 16:55:37 KST 2009 */