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


public class SE_TRG_1450_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String team_cd;
	public String yymm;
	public String evlu_seq;
	public String ratio1;
	public String ratio2;
	public String evlu_grp_ar;
	public String mode_ar;
	public String amt_ar;
	public String mode2_ar;
	public String amt2_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_TRG_1450_ADM(){}
	public SE_TRG_1450_ADM(String cmpy_cd, String team_cd, String yymm, String evlu_seq, String ratio1, String ratio2, String evlu_grp_ar, String mode_ar, String amt_ar, String mode2_ar, String amt2_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.team_cd = team_cd;
		this.yymm = yymm;
		this.evlu_seq = evlu_seq;
		this.ratio1 = ratio1;
		this.ratio2 = ratio2;
		this.evlu_grp_ar = evlu_grp_ar;
		this.mode_ar = mode_ar;
		this.amt_ar = amt_ar;
		this.mode2_ar = mode2_ar;
		this.amt2_ar = amt2_ar;
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

	public void setRatio1(String ratio1){
		this.ratio1 = ratio1;
	}

	public void setRatio2(String ratio2){
		this.ratio2 = ratio2;
	}

	public void setEvlu_grp_ar(String evlu_grp_ar){
		this.evlu_grp_ar = evlu_grp_ar;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setAmt_ar(String amt_ar){
		this.amt_ar = amt_ar;
	}

	public void setMode2_ar(String mode2_ar){
		this.mode2_ar = mode2_ar;
	}

	public void setAmt2_ar(String amt2_ar){
		this.amt2_ar = amt2_ar;
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

	public String getRatio1(){
		return this.ratio1;
	}

	public String getRatio2(){
		return this.ratio2;
	}

	public String getEvlu_grp_ar(){
		return this.evlu_grp_ar;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getAmt_ar(){
		return this.amt_ar;
	}

	public String getMode2_ar(){
		return this.mode2_ar;
	}

	public String getAmt2_ar(){
		return this.amt2_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TRG_1450_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1450_ADM dm = (SE_TRG_1450_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.team_cd);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.evlu_seq);
		cstmt.setString(7, dm.ratio1);
		cstmt.setString(8, dm.ratio2);
		cstmt.setString(9, dm.evlu_grp_ar);
		cstmt.setString(10, dm.mode_ar);
		cstmt.setString(11, dm.amt_ar);
		cstmt.setString(12, dm.mode2_ar);
		cstmt.setString(13, dm.amt2_ar);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1450_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("team_cd = " + getTeam_cd());
        System.out.println("yymm = " + getYymm());
        System.out.println("evlu_seq = " + getEvlu_seq());
        System.out.println("ratio1 = " + getRatio1());
        System.out.println("ratio2 = " + getRatio2());
        System.out.println("evlu_grp_ar = " + getEvlu_grp_ar());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("amt_ar = " + getAmt_ar());
        System.out.println("mode2_ar = " + getMode2_ar());
        System.out.println("amt2_ar = " + getAmt2_ar());
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
String ratio1 = req.getParameter("ratio1");
if( ratio1 == null){
	System.out.println(this.toString+" : ratio1 is null" );
}else{
	System.out.println(this.toString+" : ratio1 is "+ratio1 );
}
String ratio2 = req.getParameter("ratio2");
if( ratio2 == null){
	System.out.println(this.toString+" : ratio2 is null" );
}else{
	System.out.println(this.toString+" : ratio2 is "+ratio2 );
}
String evlu_grp_ar = req.getParameter("evlu_grp_ar");
if( evlu_grp_ar == null){
	System.out.println(this.toString+" : evlu_grp_ar is null" );
}else{
	System.out.println(this.toString+" : evlu_grp_ar is "+evlu_grp_ar );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String amt_ar = req.getParameter("amt_ar");
if( amt_ar == null){
	System.out.println(this.toString+" : amt_ar is null" );
}else{
	System.out.println(this.toString+" : amt_ar is "+amt_ar );
}
String mode2_ar = req.getParameter("mode2_ar");
if( mode2_ar == null){
	System.out.println(this.toString+" : mode2_ar is null" );
}else{
	System.out.println(this.toString+" : mode2_ar is "+mode2_ar );
}
String amt2_ar = req.getParameter("amt2_ar");
if( amt2_ar == null){
	System.out.println(this.toString+" : amt2_ar is null" );
}else{
	System.out.println(this.toString+" : amt2_ar is "+amt2_ar );
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
String ratio1 = Util.checkString(req.getParameter("ratio1"));
String ratio2 = Util.checkString(req.getParameter("ratio2"));
String evlu_grp_ar = Util.checkString(req.getParameter("evlu_grp_ar"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String amt_ar = Util.checkString(req.getParameter("amt_ar"));
String mode2_ar = Util.checkString(req.getParameter("mode2_ar"));
String amt2_ar = Util.checkString(req.getParameter("amt2_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String evlu_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_seq")));
String ratio1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio1")));
String ratio2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio2")));
String evlu_grp_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_grp_ar")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String amt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt_ar")));
String mode2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode2_ar")));
String amt2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt2_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam_cd(team_cd);
dm.setYymm(yymm);
dm.setEvlu_seq(evlu_seq);
dm.setRatio1(ratio1);
dm.setRatio2(ratio2);
dm.setEvlu_grp_ar(evlu_grp_ar);
dm.setMode_ar(mode_ar);
dm.setAmt_ar(amt_ar);
dm.setMode2_ar(mode2_ar);
dm.setAmt2_ar(amt2_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 13:36:46 KST 2009 */