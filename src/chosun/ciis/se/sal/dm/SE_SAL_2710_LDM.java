/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public String cmpy_cd;
	public String yymm;
	public String team;
	public String part;
	public String area;
	public String bo_cd;
	public String bo_seq;
	public String bgn_mm;
	public String end_mm;
	public String widr_bgn_mm;
	public String incmg_pers;

	public SE_SAL_2710_LDM(){}
	public SE_SAL_2710_LDM(String clsf, String cmpy_cd, String yymm, String team, String part, String area, String bo_cd, String bo_seq, String bgn_mm, String end_mm, String widr_bgn_mm, String incmg_pers){
		this.clsf = clsf;
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.team = team;
		this.part = part;
		this.area = area;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.bgn_mm = bgn_mm;
		this.end_mm = end_mm;
		this.widr_bgn_mm = widr_bgn_mm;
		this.incmg_pers = incmg_pers;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
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

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBgn_mm(String bgn_mm){
		this.bgn_mm = bgn_mm;
	}

	public void setEnd_mm(String end_mm){
		this.end_mm = end_mm;
	}

	public void setWidr_bgn_mm(String widr_bgn_mm){
		this.widr_bgn_mm = widr_bgn_mm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
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

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBgn_mm(){
		return this.bgn_mm;
	}

	public String getEnd_mm(){
		return this.end_mm;
	}

	public String getWidr_bgn_mm(){
		return this.widr_bgn_mm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SAL_2710_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_2710_LDM dm = (SE_SAL_2710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.team);
		cstmt.setString(7, dm.part);
		cstmt.setString(8, dm.area);
		cstmt.setString(9, dm.bo_cd);
		cstmt.setString(10, dm.bo_seq);
		cstmt.setString(11, dm.bgn_mm);
		cstmt.setString(12, dm.end_mm);
		cstmt.setString(13, dm.widr_bgn_mm);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_2710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("clsf = [" + getClsf() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("team = [" + getTeam() + "]");
		System.out.println("part = [" + getPart() + "]");
		System.out.println("area = [" + getArea() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_seq = [" + getBo_seq() + "]");
		System.out.println("bgn_mm = [" + getBgn_mm() + "]");
		System.out.println("end_mm = [" + getEnd_mm() + "]");
		System.out.println("widr_bgn_mm = [" + getWidr_bgn_mm() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
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
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String bgn_mm = req.getParameter("bgn_mm");
if( bgn_mm == null){
	System.out.println(this.toString+" : bgn_mm is null" );
}else{
	System.out.println(this.toString+" : bgn_mm is "+bgn_mm );
}
String end_mm = req.getParameter("end_mm");
if( end_mm == null){
	System.out.println(this.toString+" : end_mm is null" );
}else{
	System.out.println(this.toString+" : end_mm is "+end_mm );
}
String widr_bgn_mm = req.getParameter("widr_bgn_mm");
if( widr_bgn_mm == null){
	System.out.println(this.toString+" : widr_bgn_mm is null" );
}else{
	System.out.println(this.toString+" : widr_bgn_mm is "+widr_bgn_mm );
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

String clsf = Util.checkString(req.getParameter("clsf"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String team = Util.checkString(req.getParameter("team"));
String part = Util.checkString(req.getParameter("part"));
String area = Util.checkString(req.getParameter("area"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String bgn_mm = Util.checkString(req.getParameter("bgn_mm"));
String end_mm = Util.checkString(req.getParameter("end_mm"));
String widr_bgn_mm = Util.checkString(req.getParameter("widr_bgn_mm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String part = Util.Uni2Ksc(Util.checkString(req.getParameter("part")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String bgn_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_mm")));
String end_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("end_mm")));
String widr_bgn_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("widr_bgn_mm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsf(clsf);
dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setTeam(team);
dm.setPart(part);
dm.setArea(area);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setBgn_mm(bgn_mm);
dm.setEnd_mm(end_mm);
dm.setWidr_bgn_mm(widr_bgn_mm);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 26 17:35:50 KST 2013 */