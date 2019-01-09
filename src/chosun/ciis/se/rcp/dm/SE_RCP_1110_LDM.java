/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.ds.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String swit_dt1;
	public String swit_dt2;
	public String bo_nm;
	public String cnfm_yn;
	public String incmg_pers;

	public SE_RCP_1110_LDM(){}
	public SE_RCP_1110_LDM(String cmpy_cd, String team_cd, String part_cd, String area_cd, String swit_dt1, String swit_dt2, String bo_nm, String cnfm_yn, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.swit_dt1 = swit_dt1;
		this.swit_dt2 = swit_dt2;
		this.bo_nm = bo_nm;
		this.cnfm_yn = cnfm_yn;
		this.incmg_pers = incmg_pers;
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

	public void setSwit_dt1(String swit_dt1){
		this.swit_dt1 = swit_dt1;
	}

	public void setSwit_dt2(String swit_dt2){
		this.swit_dt2 = swit_dt2;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setCnfm_yn(String cnfm_yn){
		this.cnfm_yn = cnfm_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getSwit_dt1(){
		return this.swit_dt1;
	}

	public String getSwit_dt2(){
		return this.swit_dt2;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getCnfm_yn(){
		return this.cnfm_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_RCP_1110_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_1110_LDM dm = (SE_RCP_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.team_cd);
		cstmt.setString(5, dm.part_cd);
		cstmt.setString(6, dm.area_cd);
		cstmt.setString(7, dm.swit_dt1);
		cstmt.setString(8, dm.swit_dt2);
		cstmt.setString(9, dm.bo_nm);
		cstmt.setString(10, dm.cnfm_yn);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_1110_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("team_cd = " + getTeam_cd());
        System.out.println("part_cd = " + getPart_cd());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("swit_dt1 = " + getSwit_dt1());
        System.out.println("swit_dt2 = " + getSwit_dt2());
        System.out.println("bo_nm = " + getBo_nm());
        System.out.println("cnfm_yn = " + getCnfm_yn());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String swit_dt1 = req.getParameter("swit_dt1");
if( swit_dt1 == null){
	System.out.println(this.toString+" : swit_dt1 is null" );
}else{
	System.out.println(this.toString+" : swit_dt1 is "+swit_dt1 );
}
String swit_dt2 = req.getParameter("swit_dt2");
if( swit_dt2 == null){
	System.out.println(this.toString+" : swit_dt2 is null" );
}else{
	System.out.println(this.toString+" : swit_dt2 is "+swit_dt2 );
}
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String cnfm_yn = req.getParameter("cnfm_yn");
if( cnfm_yn == null){
	System.out.println(this.toString+" : cnfm_yn is null" );
}else{
	System.out.println(this.toString+" : cnfm_yn is "+cnfm_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String swit_dt1 = Util.checkString(req.getParameter("swit_dt1"));
String swit_dt2 = Util.checkString(req.getParameter("swit_dt2"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String cnfm_yn = Util.checkString(req.getParameter("cnfm_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String swit_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("swit_dt1")));
String swit_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("swit_dt2")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String cnfm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setSwit_dt1(swit_dt1);
dm.setSwit_dt2(swit_dt2);
dm.setBo_nm(bo_nm);
dm.setCnfm_yn(cnfm_yn);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 19 20:09:01 KST 2009 */