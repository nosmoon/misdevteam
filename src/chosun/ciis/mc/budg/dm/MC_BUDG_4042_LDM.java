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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4042_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String amt_clsf;
	public String budg_yymm_fr;
	public String budg_yymm_to;
	public String budg_cd;
	public String dept_cd;
	public String evnt_cd;
	public String sql;

	public MC_BUDG_4042_LDM(){}
	public MC_BUDG_4042_LDM(String cmpy_cd, String amt_clsf, String budg_yymm_fr, String budg_yymm_to, String budg_cd, String dept_cd, String evnt_cd, String sql){
		this.cmpy_cd = cmpy_cd;
		this.amt_clsf = amt_clsf;
		this.budg_yymm_fr = budg_yymm_fr;
		this.budg_yymm_to = budg_yymm_to;
		this.budg_cd = budg_cd;
		this.dept_cd = dept_cd;
		this.evnt_cd = evnt_cd;
		this.sql = sql;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAmt_clsf(String amt_clsf){
		this.amt_clsf = amt_clsf;
	}

	public void setBudg_yymm_fr(String budg_yymm_fr){
		this.budg_yymm_fr = budg_yymm_fr;
	}

	public void setBudg_yymm_to(String budg_yymm_to){
		this.budg_yymm_to = budg_yymm_to;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setSql(String sql){
		this.sql = sql;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAmt_clsf(){
		return this.amt_clsf;
	}

	public String getBudg_yymm_fr(){
		return this.budg_yymm_fr;
	}

	public String getBudg_yymm_to(){
		return this.budg_yymm_to;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getSql(){
		return this.sql;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4042_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4042_LDM dm = (MC_BUDG_4042_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.amt_clsf);
		cstmt.setString(5, dm.budg_yymm_fr);
		cstmt.setString(6, dm.budg_yymm_to);
		cstmt.setString(7, dm.budg_cd);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.evnt_cd);
		cstmt.setString(10, dm.sql);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4042_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("amt_clsf = [" + getAmt_clsf() + "]");
		System.out.println("budg_yymm_fr = [" + getBudg_yymm_fr() + "]");
		System.out.println("budg_yymm_to = [" + getBudg_yymm_to() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("sql = [" + getSql() + "]");
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
String amt_clsf = req.getParameter("amt_clsf");
if( amt_clsf == null){
	System.out.println(this.toString+" : amt_clsf is null" );
}else{
	System.out.println(this.toString+" : amt_clsf is "+amt_clsf );
}
String budg_yymm_fr = req.getParameter("budg_yymm_fr");
if( budg_yymm_fr == null){
	System.out.println(this.toString+" : budg_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : budg_yymm_fr is "+budg_yymm_fr );
}
String budg_yymm_to = req.getParameter("budg_yymm_to");
if( budg_yymm_to == null){
	System.out.println(this.toString+" : budg_yymm_to is null" );
}else{
	System.out.println(this.toString+" : budg_yymm_to is "+budg_yymm_to );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String sql = req.getParameter("sql");
if( sql == null){
	System.out.println(this.toString+" : sql is null" );
}else{
	System.out.println(this.toString+" : sql is "+sql );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String amt_clsf = Util.checkString(req.getParameter("amt_clsf"));
String budg_yymm_fr = Util.checkString(req.getParameter("budg_yymm_fr"));
String budg_yymm_to = Util.checkString(req.getParameter("budg_yymm_to"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String sql = Util.checkString(req.getParameter("sql"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String amt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("amt_clsf")));
String budg_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm_fr")));
String budg_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm_to")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String sql = Util.Uni2Ksc(Util.checkString(req.getParameter("sql")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAmt_clsf(amt_clsf);
dm.setBudg_yymm_fr(budg_yymm_fr);
dm.setBudg_yymm_to(budg_yymm_to);
dm.setBudg_cd(budg_cd);
dm.setDept_cd(dept_cd);
dm.setEvnt_cd(evnt_cd);
dm.setSql(sql);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 14:51:07 KST 2009 */