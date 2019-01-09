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


public class SE_RCP_1020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String rcpm_dt1;
	public String rcpm_dt2;
	public String bo_nm;
	public String acct_no;
	public String rcpm_pers;
	public String cnfm_yn;
	public String incmg_pers;

	public SE_RCP_1020_LDM(){}
	public SE_RCP_1020_LDM(String cmpy_cd, String team_cd, String part_cd, String area_cd, String rcpm_dt1, String rcpm_dt2, String bo_nm, String acct_no, String rcpm_pers, String cnfm_yn, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.rcpm_dt1 = rcpm_dt1;
		this.rcpm_dt2 = rcpm_dt2;
		this.bo_nm = bo_nm;
		this.acct_no = acct_no;
		this.rcpm_pers = rcpm_pers;
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

	public void setRcpm_dt1(String rcpm_dt1){
		this.rcpm_dt1 = rcpm_dt1;
	}

	public void setRcpm_dt2(String rcpm_dt2){
		this.rcpm_dt2 = rcpm_dt2;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRcpm_pers(String rcpm_pers){
		this.rcpm_pers = rcpm_pers;
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

	public String getRcpm_dt1(){
		return this.rcpm_dt1;
	}

	public String getRcpm_dt2(){
		return this.rcpm_dt2;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRcpm_pers(){
		return this.rcpm_pers;
	}

	public String getCnfm_yn(){
		return this.cnfm_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_RCP_1020_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_1020_LDM dm = (SE_RCP_1020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.team_cd);
		cstmt.setString(5, dm.part_cd);
		cstmt.setString(6, dm.area_cd);
		cstmt.setString(7, dm.rcpm_dt1);
		cstmt.setString(8, dm.rcpm_dt2);
		cstmt.setString(9, dm.bo_nm);
		cstmt.setString(10, dm.acct_no);
		cstmt.setString(11, dm.rcpm_pers);
		cstmt.setString(12, dm.cnfm_yn);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_1020_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("team_cd = " + getTeam_cd());
        System.out.println("part_cd = " + getPart_cd());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("rcpm_dt1 = " + getRcpm_dt1());
        System.out.println("rcpm_dt2 = " + getRcpm_dt2());
        System.out.println("bo_nm = " + getBo_nm());
        System.out.println("acct_no = " + getAcct_no());
        System.out.println("rcpm_pers = " + getRcpm_pers());
        System.out.println("cnfm_yn = " + getCnfm_yn());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String rcpm_dt1 = req.getParameter("rcpm_dt1");
if( rcpm_dt1 == null){
	System.out.println(this.toString+" : rcpm_dt1 is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt1 is "+rcpm_dt1 );
}
String rcpm_dt2 = req.getParameter("rcpm_dt2");
if( rcpm_dt2 == null){
	System.out.println(this.toString+" : rcpm_dt2 is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt2 is "+rcpm_dt2 );
}
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String rcpm_pers = req.getParameter("rcpm_pers");
if( rcpm_pers == null){
	System.out.println(this.toString+" : rcpm_pers is null" );
}else{
	System.out.println(this.toString+" : rcpm_pers is "+rcpm_pers );
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
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
String rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String rcpm_pers = Util.checkString(req.getParameter("rcpm_pers"));
String cnfm_yn = Util.checkString(req.getParameter("cnfm_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String rcpm_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt1")));
String rcpm_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt2")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String rcpm_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_pers")));
String cnfm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setRcpm_dt1(rcpm_dt1);
dm.setRcpm_dt2(rcpm_dt2);
dm.setBo_nm(bo_nm);
dm.setAcct_no(acct_no);
dm.setRcpm_pers(rcpm_pers);
dm.setCnfm_yn(cnfm_yn);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 15 20:17:04 KST 2009 */