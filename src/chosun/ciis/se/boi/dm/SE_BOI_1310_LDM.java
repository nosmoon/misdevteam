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


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String chrg_flnm;
	public String cntr_dt1;
	public String cntr_dt2;
	public String bo_feat_clsf;
	public String cntr_stat_clsf;
	public String sido_cd;
	public String adms_dstc_cd;
	public String order_gb;
	public String incmg_pers;

	public SE_BOI_1310_LDM(){}
	public SE_BOI_1310_LDM(String cmpy_cd, String team_cd, String part_cd, String area_cd, String chrg_flnm, String cntr_dt1, String cntr_dt2, String bo_feat_clsf, String cntr_stat_clsf, String sido_cd, String adms_dstc_cd, String order_gb, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.chrg_flnm = chrg_flnm;
		this.cntr_dt1 = cntr_dt1;
		this.cntr_dt2 = cntr_dt2;
		this.bo_feat_clsf = bo_feat_clsf;
		this.cntr_stat_clsf = cntr_stat_clsf;
		this.sido_cd = sido_cd;
		this.adms_dstc_cd = adms_dstc_cd;
		this.order_gb = order_gb;
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

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setCntr_dt1(String cntr_dt1){
		this.cntr_dt1 = cntr_dt1;
	}

	public void setCntr_dt2(String cntr_dt2){
		this.cntr_dt2 = cntr_dt2;
	}

	public void setBo_feat_clsf(String bo_feat_clsf){
		this.bo_feat_clsf = bo_feat_clsf;
	}

	public void setCntr_stat_clsf(String cntr_stat_clsf){
		this.cntr_stat_clsf = cntr_stat_clsf;
	}

	public void setSido_cd(String sido_cd){
		this.sido_cd = sido_cd;
	}

	public void setAdms_dstc_cd(String adms_dstc_cd){
		this.adms_dstc_cd = adms_dstc_cd;
	}

	public void setOrder_gb(String order_gb){
		this.order_gb = order_gb;
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

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getCntr_dt1(){
		return this.cntr_dt1;
	}

	public String getCntr_dt2(){
		return this.cntr_dt2;
	}

	public String getBo_feat_clsf(){
		return this.bo_feat_clsf;
	}

	public String getCntr_stat_clsf(){
		return this.cntr_stat_clsf;
	}

	public String getSido_cd(){
		return this.sido_cd;
	}

	public String getAdms_dstc_cd(){
		return this.adms_dstc_cd;
	}

	public String getOrder_gb(){
		return this.order_gb;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_1310_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1310_LDM dm = (SE_BOI_1310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.team_cd);
		cstmt.setString(5, dm.part_cd);
		cstmt.setString(6, dm.area_cd);
		cstmt.setString(7, dm.chrg_flnm);
		cstmt.setString(8, dm.cntr_dt1);
		cstmt.setString(9, dm.cntr_dt2);
		cstmt.setString(10, dm.bo_feat_clsf);
		cstmt.setString(11, dm.cntr_stat_clsf);
		cstmt.setString(12, dm.sido_cd);
		cstmt.setString(13, dm.adms_dstc_cd);
		cstmt.setString(14, dm.order_gb);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1310_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("team_cd = " + getTeam_cd());
        System.out.println("part_cd = " + getPart_cd());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("chrg_flnm = " + getChrg_flnm());
        System.out.println("cntr_dt1 = " + getCntr_dt1());
        System.out.println("cntr_dt2 = " + getCntr_dt2());
        System.out.println("bo_feat_clsf = " + getBo_feat_clsf());
        System.out.println("cntr_stat_clsf = " + getCntr_stat_clsf());
        System.out.println("sido_cd = " + getSido_cd());
        System.out.println("adms_dstc_cd = " + getAdms_dstc_cd());
        System.out.println("order_gb = " + getOrder_gb());
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
String chrg_flnm = req.getParameter("chrg_flnm");
if( chrg_flnm == null){
	System.out.println(this.toString+" : chrg_flnm is null" );
}else{
	System.out.println(this.toString+" : chrg_flnm is "+chrg_flnm );
}
String cntr_dt1 = req.getParameter("cntr_dt1");
if( cntr_dt1 == null){
	System.out.println(this.toString+" : cntr_dt1 is null" );
}else{
	System.out.println(this.toString+" : cntr_dt1 is "+cntr_dt1 );
}
String cntr_dt2 = req.getParameter("cntr_dt2");
if( cntr_dt2 == null){
	System.out.println(this.toString+" : cntr_dt2 is null" );
}else{
	System.out.println(this.toString+" : cntr_dt2 is "+cntr_dt2 );
}
String bo_feat_clsf = req.getParameter("bo_feat_clsf");
if( bo_feat_clsf == null){
	System.out.println(this.toString+" : bo_feat_clsf is null" );
}else{
	System.out.println(this.toString+" : bo_feat_clsf is "+bo_feat_clsf );
}
String cntr_stat_clsf = req.getParameter("cntr_stat_clsf");
if( cntr_stat_clsf == null){
	System.out.println(this.toString+" : cntr_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : cntr_stat_clsf is "+cntr_stat_clsf );
}
String sido_cd = req.getParameter("sido_cd");
if( sido_cd == null){
	System.out.println(this.toString+" : sido_cd is null" );
}else{
	System.out.println(this.toString+" : sido_cd is "+sido_cd );
}
String adms_dstc_cd = req.getParameter("adms_dstc_cd");
if( adms_dstc_cd == null){
	System.out.println(this.toString+" : adms_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : adms_dstc_cd is "+adms_dstc_cd );
}
String order_gb = req.getParameter("order_gb");
if( order_gb == null){
	System.out.println(this.toString+" : order_gb is null" );
}else{
	System.out.println(this.toString+" : order_gb is "+order_gb );
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
String chrg_flnm = Util.checkString(req.getParameter("chrg_flnm"));
String cntr_dt1 = Util.checkString(req.getParameter("cntr_dt1"));
String cntr_dt2 = Util.checkString(req.getParameter("cntr_dt2"));
String bo_feat_clsf = Util.checkString(req.getParameter("bo_feat_clsf"));
String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
String sido_cd = Util.checkString(req.getParameter("sido_cd"));
String adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
String order_gb = Util.checkString(req.getParameter("order_gb"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String chrg_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_flnm")));
String cntr_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_dt1")));
String cntr_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_dt2")));
String bo_feat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_feat_clsf")));
String cntr_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_stat_clsf")));
String sido_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sido_cd")));
String adms_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("adms_dstc_cd")));
String order_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("order_gb")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setChrg_flnm(chrg_flnm);
dm.setCntr_dt1(cntr_dt1);
dm.setCntr_dt2(cntr_dt2);
dm.setBo_feat_clsf(bo_feat_clsf);
dm.setCntr_stat_clsf(cntr_stat_clsf);
dm.setSido_cd(sido_cd);
dm.setAdms_dstc_cd(adms_dstc_cd);
dm.setOrder_gb(order_gb);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 03 10:01:21 KST 2009 */