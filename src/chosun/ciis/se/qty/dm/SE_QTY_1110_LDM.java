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


public class SE_QTY_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String medi_cd;
	public String tms;
	public String yymm;
	public String incmg_pers;
	public String sell_net_clsf;

	public SE_QTY_1110_LDM(){}
	public SE_QTY_1110_LDM(String cmpy_cd, String team_cd, String part_cd, String area_cd, String medi_cd, String tms, String yymm, String incmg_pers, String sell_net_clsf){
		this.cmpy_cd = cmpy_cd;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.medi_cd = medi_cd;
		this.tms = tms;
		this.yymm = yymm;
		this.incmg_pers = incmg_pers;
		this.sell_net_clsf = sell_net_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}
	
	public void setSell_net_clsf(String sell_net_clsf){
		this.sell_net_clsf = sell_net_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}
	
	public String getSell_net_clsf(){
		return this.sell_net_clsf;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_1110_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_1110_LDM dm = (SE_QTY_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.team_cd);
		cstmt.setString(5, dm.part_cd);
		cstmt.setString(6, dm.area_cd);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.tms);
		cstmt.setString(9, dm.yymm);
		cstmt.setString(10, dm.incmg_pers);		
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
		cstmt.setString(16, dm.sell_net_clsf);		
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_1110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("sell_net_clsf = [" + getSell_net_clsf() + "]");
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
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
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
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String tms = Util.checkString(req.getParameter("tms"));
String yymm = Util.checkString(req.getParameter("yymm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setMedi_cd(medi_cd);
dm.setTms(tms);
dm.setYymm(yymm);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 27 17:12:58 KST 2014 */