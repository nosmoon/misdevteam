/***************************************************************************************************
* 파일명 : SE_QTY_3110_LDM.java
* 기능 : 부수관리 - 발송부수 - 발송부수증감현황
* 작성일자 : 2009-03-11
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


public class SE_QTY_3110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String team			;
	public String part			;
	public String area			;
	public String bgn_issu_dt	;
	public String end_issu_dt	;
	public String bo_cd			;
	public String send_plac_seq	;
	public String medi_cd		;
	public String spsl_gubun	;
	public String incmg_pers	;

	public SE_QTY_3110_LDM(){}
	public SE_QTY_3110_LDM(String cmpy_cd, String team, String part, String area, String bgn_issu_dt, String end_issu_dt, String bo_cd, String send_plac_seq, String medi_cd, String spsl_gubun, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.team 			= team			;
		this.part 			= part			;
		this.area 			= area			;
		this.bgn_issu_dt 	= bgn_issu_dt	;
		this.end_issu_dt 	= end_issu_dt	;
		this.bo_cd 			= bo_cd			;
		this.send_plac_seq 	= send_plac_seq	;
		this.medi_cd 		= medi_cd		;
		this.spsl_gubun 	= spsl_gubun	;
		this.incmg_pers 	= incmg_pers	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public void setPart(String part){
		this.part = part;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setBgn_issu_dt(String bgn_issu_dt){
		this.bgn_issu_dt = bgn_issu_dt;
	}

	public void setEnd_issu_dt(String end_issu_dt){
		this.end_issu_dt = end_issu_dt;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSpsl_gubun(String spsl_gubun){
		this.spsl_gubun = spsl_gubun;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTeam(){
		return this.team;
	}

	public String getPart(){
		return this.part;
	}

	public String getArea(){
		return this.area;
	}

	public String getBgn_issu_dt(){
		return this.bgn_issu_dt;
	}

	public String getEnd_issu_dt(){
		return this.end_issu_dt;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSpsl_gubun(){
		return this.spsl_gubun;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_QTY_3110_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_3110_LDM dm = (SE_QTY_3110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd		);
		cstmt.setString( 4, dm.team			);
		cstmt.setString( 5, dm.part			);
		cstmt.setString( 6, dm.area			);
		cstmt.setString( 7, dm.bgn_issu_dt	);
		cstmt.setString( 8, dm.end_issu_dt	);
		cstmt.setString( 9, dm.bo_cd		);
		cstmt.setString(10, dm.send_plac_seq);
		cstmt.setString(11, dm.medi_cd		);
		cstmt.setString(12, dm.spsl_gubun	);
		cstmt.setString(13, dm.incmg_pers	);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_3110_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("team 			= " + getTeam			());
        System.out.println("part 			= " + getPart			());
        System.out.println("area 			= " + getArea			());
        System.out.println("bgn_issu_dt 	= " + getBgn_issu_dt	());
        System.out.println("end_issu_dt 	= " + getEnd_issu_dt	());
        System.out.println("bo_cd 			= " + getBo_cd			());
        System.out.println("send_plac_seq 	= " + getSend_plac_seq	());
        System.out.println("medi_cd 		= " + getMedi_cd		());
        System.out.println("spsl_gubun 		= " + getSpsl_gubun		());
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
String team = req.getParameter("team");
if( team == null){
	System.out.println(this.toString+" : team is null" );
}else{
	System.out.println(this.toString+" : team is "+team );
}
String part = req.getParameter("part");
if( part == null){
	System.out.println(this.toString+" : part is null" );
}else{
	System.out.println(this.toString+" : part is "+part );
}
String area = req.getParameter("area");
if( area == null){
	System.out.println(this.toString+" : area is null" );
}else{
	System.out.println(this.toString+" : area is "+area );
}
String bgn_issu_dt = req.getParameter("bgn_issu_dt");
if( bgn_issu_dt == null){
	System.out.println(this.toString+" : bgn_issu_dt is null" );
}else{
	System.out.println(this.toString+" : bgn_issu_dt is "+bgn_issu_dt );
}
String end_issu_dt = req.getParameter("end_issu_dt");
if( end_issu_dt == null){
	System.out.println(this.toString+" : end_issu_dt is null" );
}else{
	System.out.println(this.toString+" : end_issu_dt is "+end_issu_dt );
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String spsl_gubun = req.getParameter("spsl_gubun");
if( spsl_gubun == null){
	System.out.println(this.toString+" : spsl_gubun is null" );
}else{
	System.out.println(this.toString+" : spsl_gubun is "+spsl_gubun );
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
String team = Util.checkString(req.getParameter("team"));
String part = Util.checkString(req.getParameter("part"));
String area = Util.checkString(req.getParameter("area"));
String bgn_issu_dt = Util.checkString(req.getParameter("bgn_issu_dt"));
String end_issu_dt = Util.checkString(req.getParameter("end_issu_dt"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String spsl_gubun = Util.checkString(req.getParameter("spsl_gubun"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String part = Util.Uni2Ksc(Util.checkString(req.getParameter("part")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String bgn_issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_issu_dt")));
String end_issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_issu_dt")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String send_plac_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String spsl_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("spsl_gubun")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam(team);
dm.setPart(part);
dm.setArea(area);
dm.setBgn_issu_dt(bgn_issu_dt);
dm.setEnd_issu_dt(end_issu_dt);
dm.setBo_cd(bo_cd);
dm.setSend_plac_seq(send_plac_seq);
dm.setMedi_cd(medi_cd);
dm.setSpsl_gubun(spsl_gubun);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 21:14:10 KST 2009 */