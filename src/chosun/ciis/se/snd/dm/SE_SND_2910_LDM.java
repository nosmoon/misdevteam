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


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2910_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String area_cd;
	public String issu_dt1;
	public String issu_dt2;
	public String cnfm_stat_clsf;
	public String incmg_pers;

	public SE_SND_2910_LDM(){}
	public SE_SND_2910_LDM(String cmpy_cd, String dept_cd, String area_cd, String issu_dt1, String issu_dt2, String cnfm_stat_clsf, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.area_cd = area_cd;
		this.issu_dt1 = issu_dt1;
		this.issu_dt2 = issu_dt2;
		this.cnfm_stat_clsf = cnfm_stat_clsf;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setIssu_dt1(String issu_dt1){
		this.issu_dt1 = issu_dt1;
	}

	public void setIssu_dt2(String issu_dt2){
		this.issu_dt2 = issu_dt2;
	}

	public void setCnfm_stat_clsf(String cnfm_stat_clsf){
		this.cnfm_stat_clsf = cnfm_stat_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getIssu_dt1(){
		return this.issu_dt1;
	}

	public String getIssu_dt2(){
		return this.issu_dt2;
	}

	public String getCnfm_stat_clsf(){
		return this.cnfm_stat_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_2910_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2910_LDM dm = (SE_SND_2910_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.area_cd);
		cstmt.setString(6, dm.issu_dt1);
		cstmt.setString(7, dm.issu_dt2);
		cstmt.setString(8, dm.cnfm_stat_clsf);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2910_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("issu_dt1 = " + getIssu_dt1());
        System.out.println("issu_dt2 = " + getIssu_dt2());
        System.out.println("cnfm_stat_clsf = " + getCnfm_stat_clsf());
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String issu_dt1 = req.getParameter("issu_dt1");
if( issu_dt1 == null){
	System.out.println(this.toString+" : issu_dt1 is null" );
}else{
	System.out.println(this.toString+" : issu_dt1 is "+issu_dt1 );
}
String issu_dt2 = req.getParameter("issu_dt2");
if( issu_dt2 == null){
	System.out.println(this.toString+" : issu_dt2 is null" );
}else{
	System.out.println(this.toString+" : issu_dt2 is "+issu_dt2 );
}
String cnfm_stat_clsf = req.getParameter("cnfm_stat_clsf");
if( cnfm_stat_clsf == null){
	System.out.println(this.toString+" : cnfm_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : cnfm_stat_clsf is "+cnfm_stat_clsf );
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
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String issu_dt1 = Util.checkString(req.getParameter("issu_dt1"));
String issu_dt2 = Util.checkString(req.getParameter("issu_dt2"));
String cnfm_stat_clsf = Util.checkString(req.getParameter("cnfm_stat_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String issu_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt1")));
String issu_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt2")));
String cnfm_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_stat_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setArea_cd(area_cd);
dm.setIssu_dt1(issu_dt1);
dm.setIssu_dt2(issu_dt2);
dm.setCnfm_stat_clsf(cnfm_stat_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 30 10:29:04 KST 2009 */