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


public class MC_COST_3011_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String clos_pers;
	public String incmg_pers_ipadd;
	public String dept_cd;
	public String incmg_pers;
	public String incmg_dt;
	public String fist_dt;

	public MC_COST_3011_IDM(){}
	public MC_COST_3011_IDM(String cmpy_cd, String yymm, String clos_pers, String incmg_pers_ipadd, String dept_cd, String incmg_pers, String incmg_dt, String fist_dt){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.clos_pers = clos_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.dept_cd = dept_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_dt = incmg_dt;
		this.fist_dt = fist_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setClos_pers(String clos_pers){
		this.clos_pers = clos_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setFist_dt(String fist_dt){
		this.fist_dt = fist_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getClos_pers(){
		return this.clos_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getFist_dt(){
		return this.fist_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_3011_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_3011_IDM dm = (MC_COST_3011_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.clos_pers);
		cstmt.setString(6, dm.incmg_pers_ipadd);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_dt);
		cstmt.setString(10, dm.fist_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_3011_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("clos_pers = [" + getClos_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt = [" + getIncmg_dt() + "]");
		System.out.println("fist_dt = [" + getFist_dt() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String clos_pers = req.getParameter("clos_pers");
if( clos_pers == null){
	System.out.println(this.toString+" : clos_pers is null" );
}else{
	System.out.println(this.toString+" : clos_pers is "+clos_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
String fist_dt = req.getParameter("fist_dt");
if( fist_dt == null){
	System.out.println(this.toString+" : fist_dt is null" );
}else{
	System.out.println(this.toString+" : fist_dt is "+fist_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String clos_pers = Util.checkString(req.getParameter("clos_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String fist_dt = Util.checkString(req.getParameter("fist_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String clos_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String fist_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fist_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setClos_pers(clos_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setDept_cd(dept_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt(incmg_dt);
dm.setFist_dt(fist_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 14:20:32 KST 2009 */