/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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


public class SE_QTY_1310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String medi_cd;
	public String yymm;
	public String tms;
	public String issu_dt;
	public String schlevel;

	public SE_QTY_1310_LDM(){}
	public SE_QTY_1310_LDM(String cmpy_cd, String incmg_pers, String team_cd, String part_cd, String area_cd, String medi_cd, String yymm, String tms, String issu_dt, String schlevel){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.medi_cd = medi_cd;
		this.yymm = yymm;
		this.tms = tms;
		this.issu_dt = issu_dt;
		this.schlevel = schlevel;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSchlevel(String schlevel){
		this.schlevel = schlevel;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
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

	public String getYymm(){
		return this.yymm;
	}

	public String getTms(){
		return this.tms;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSchlevel(){
		return this.schlevel;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_1310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_1310_LDM dm = (SE_QTY_1310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.team_cd);
		cstmt.setString(6, dm.part_cd);
		cstmt.setString(7, dm.area_cd);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.yymm);
		cstmt.setString(10, dm.tms);
		cstmt.setString(11, dm.issu_dt);
		cstmt.setString(12, dm.schlevel);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_1310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("schlevel = [" + getSchlevel() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String schlevel = req.getParameter("schlevel");
if( schlevel == null){
	System.out.println(this.toString+" : schlevel is null" );
}else{
	System.out.println(this.toString+" : schlevel is "+schlevel );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String tms = Util.checkString(req.getParameter("tms"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String schlevel = Util.checkString(req.getParameter("schlevel"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String schlevel = Util.Uni2Ksc(Util.checkString(req.getParameter("schlevel")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setMedi_cd(medi_cd);
dm.setYymm(yymm);
dm.setTms(tms);
dm.setIssu_dt(issu_dt);
dm.setSchlevel(schlevel);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Oct 01 14:38:14 KST 2013 */