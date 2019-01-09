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


package chosun.ciis.is.bus.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.ds.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1620_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rept_dt;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String vip_busn_acty_rept;
	public String vip_busn_plan;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_BUS_1620_ADM(){}
	public IS_BUS_1620_ADM(String cmpy_cd, String rept_dt, String dept_cd, String sub_dept_cd, String chrg_pers, String vip_busn_acty_rept, String vip_busn_plan, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.rept_dt = rept_dt;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.vip_busn_acty_rept = vip_busn_acty_rept;
		this.vip_busn_plan = vip_busn_plan;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRept_dt(String rept_dt){
		this.rept_dt = rept_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setVip_busn_acty_rept(String vip_busn_acty_rept){
		this.vip_busn_acty_rept = vip_busn_acty_rept;
	}

	public void setVip_busn_plan(String vip_busn_plan){
		this.vip_busn_plan = vip_busn_plan;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRept_dt(){
		return this.rept_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getVip_busn_acty_rept(){
		return this.vip_busn_acty_rept;
	}

	public String getVip_busn_plan(){
		return this.vip_busn_plan;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BUS_1620_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BUS_1620_ADM dm = (IS_BUS_1620_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rept_dt);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.sub_dept_cd);
		cstmt.setString(7, dm.chrg_pers);
		cstmt.setString(8, dm.vip_busn_acty_rept);
		cstmt.setString(9, dm.vip_busn_plan);
		cstmt.setString(10, dm.incmg_pers_ip);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bus.ds.IS_BUS_1620_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rept_dt = [" + getRept_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("vip_busn_acty_rept = [" + getVip_busn_acty_rept() + "]");
		System.out.println("vip_busn_plan = [" + getVip_busn_plan() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String rept_dt = req.getParameter("rept_dt");
if( rept_dt == null){
	System.out.println(this.toString+" : rept_dt is null" );
}else{
	System.out.println(this.toString+" : rept_dt is "+rept_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String vip_busn_acty_rept = req.getParameter("vip_busn_acty_rept");
if( vip_busn_acty_rept == null){
	System.out.println(this.toString+" : vip_busn_acty_rept is null" );
}else{
	System.out.println(this.toString+" : vip_busn_acty_rept is "+vip_busn_acty_rept );
}
String vip_busn_plan = req.getParameter("vip_busn_plan");
if( vip_busn_plan == null){
	System.out.println(this.toString+" : vip_busn_plan is null" );
}else{
	System.out.println(this.toString+" : vip_busn_plan is "+vip_busn_plan );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String rept_dt = Util.checkString(req.getParameter("rept_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String vip_busn_acty_rept = Util.checkString(req.getParameter("vip_busn_acty_rept"));
String vip_busn_plan = Util.checkString(req.getParameter("vip_busn_plan"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String vip_busn_acty_rept = Util.Uni2Ksc(Util.checkString(req.getParameter("vip_busn_acty_rept")));
String vip_busn_plan = Util.Uni2Ksc(Util.checkString(req.getParameter("vip_busn_plan")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRept_dt(rept_dt);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setVip_busn_acty_rept(vip_busn_acty_rept);
dm.setVip_busn_plan(vip_busn_plan);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 19 15:34:20 KST 2012 */