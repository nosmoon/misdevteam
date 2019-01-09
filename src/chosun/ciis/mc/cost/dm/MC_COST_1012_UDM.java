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


package chosun.ciis.mc.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.ds.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_1012_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cost_dstb_cd;
	public String cost_dstb_cd_1;
	public String cost_dstb_cd_2;
	public String cost_dept_clsf;
	public String prt_plac_yn;
	public String incmg_pers;
	public String dept_cd;

	public MC_COST_1012_UDM(){}
	public MC_COST_1012_UDM(String cmpy_cd, String cost_dstb_cd, String cost_dstb_cd_1, String cost_dstb_cd_2, String cost_dept_clsf, String prt_plac_yn, String incmg_pers, String dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.cost_dstb_cd = cost_dstb_cd;
		this.cost_dstb_cd_1 = cost_dstb_cd_1;
		this.cost_dstb_cd_2 = cost_dstb_cd_2;
		this.cost_dept_clsf = cost_dept_clsf;
		this.prt_plac_yn = prt_plac_yn;
		this.incmg_pers = incmg_pers;
		this.dept_cd = dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setCost_dstb_cd_1(String cost_dstb_cd_1){
		this.cost_dstb_cd_1 = cost_dstb_cd_1;
	}

	public void setCost_dstb_cd_2(String cost_dstb_cd_2){
		this.cost_dstb_cd_2 = cost_dstb_cd_2;
	}

	public void setCost_dept_clsf(String cost_dept_clsf){
		this.cost_dept_clsf = cost_dept_clsf;
	}

	public void setPrt_plac_yn(String prt_plac_yn){
		this.prt_plac_yn = prt_plac_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getCost_dstb_cd_1(){
		return this.cost_dstb_cd_1;
	}

	public String getCost_dstb_cd_2(){
		return this.cost_dstb_cd_2;
	}

	public String getCost_dept_clsf(){
		return this.cost_dept_clsf;
	}

	public String getPrt_plac_yn(){
		return this.prt_plac_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_1012_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_1012_UDM dm = (MC_COST_1012_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cost_dstb_cd);
		cstmt.setString(5, dm.cost_dstb_cd_1);
		cstmt.setString(6, dm.cost_dstb_cd_2);
		cstmt.setString(7, dm.cost_dept_clsf);
		cstmt.setString(8, dm.prt_plac_yn);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.dept_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_1012_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cost_dstb_cd = [" + getCost_dstb_cd() + "]");
		System.out.println("cost_dstb_cd_1 = [" + getCost_dstb_cd_1() + "]");
		System.out.println("cost_dstb_cd_2 = [" + getCost_dstb_cd_2() + "]");
		System.out.println("cost_dept_clsf = [" + getCost_dept_clsf() + "]");
		System.out.println("prt_plac_yn = [" + getPrt_plac_yn() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
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
String cost_dstb_cd = req.getParameter("cost_dstb_cd");
if( cost_dstb_cd == null){
	System.out.println(this.toString+" : cost_dstb_cd is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_cd is "+cost_dstb_cd );
}
String cost_dstb_cd_1 = req.getParameter("cost_dstb_cd_1");
if( cost_dstb_cd_1 == null){
	System.out.println(this.toString+" : cost_dstb_cd_1 is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_cd_1 is "+cost_dstb_cd_1 );
}
String cost_dstb_cd_2 = req.getParameter("cost_dstb_cd_2");
if( cost_dstb_cd_2 == null){
	System.out.println(this.toString+" : cost_dstb_cd_2 is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_cd_2 is "+cost_dstb_cd_2 );
}
String cost_dept_clsf = req.getParameter("cost_dept_clsf");
if( cost_dept_clsf == null){
	System.out.println(this.toString+" : cost_dept_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_dept_clsf is "+cost_dept_clsf );
}
String prt_plac_yn = req.getParameter("prt_plac_yn");
if( prt_plac_yn == null){
	System.out.println(this.toString+" : prt_plac_yn is null" );
}else{
	System.out.println(this.toString+" : prt_plac_yn is "+prt_plac_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
String cost_dstb_cd_1 = Util.checkString(req.getParameter("cost_dstb_cd_1"));
String cost_dstb_cd_2 = Util.checkString(req.getParameter("cost_dstb_cd_2"));
String cost_dept_clsf = Util.checkString(req.getParameter("cost_dept_clsf"));
String prt_plac_yn = Util.checkString(req.getParameter("prt_plac_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cost_dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_cd")));
String cost_dstb_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_cd_1")));
String cost_dstb_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_cd_2")));
String cost_dept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dept_clsf")));
String prt_plac_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCost_dstb_cd(cost_dstb_cd);
dm.setCost_dstb_cd_1(cost_dstb_cd_1);
dm.setCost_dstb_cd_2(cost_dstb_cd_2);
dm.setCost_dept_clsf(cost_dept_clsf);
dm.setPrt_plac_yn(prt_plac_yn);
dm.setIncmg_pers(incmg_pers);
dm.setDept_cd(dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 15:43:12 KST 2009 */