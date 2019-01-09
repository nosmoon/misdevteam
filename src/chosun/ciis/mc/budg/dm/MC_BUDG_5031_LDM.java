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


public class MC_BUDG_5031_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_yymm;
	public String dept_cd;
	public String evnt_cd_fr;
	public String evnt_cd_to;

	public MC_BUDG_5031_LDM(){}
	public MC_BUDG_5031_LDM(String cmpy_cd, String budg_yymm, String dept_cd, String evnt_cd_fr, String evnt_cd_to){
		this.cmpy_cd = cmpy_cd;
		this.budg_yymm = budg_yymm;
		this.dept_cd = dept_cd;
		this.evnt_cd_fr = evnt_cd_fr;
		this.evnt_cd_to = evnt_cd_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEvnt_cd_fr(String evnt_cd_fr){
		this.evnt_cd_fr = evnt_cd_fr;
	}

	public void setEvnt_cd_to(String evnt_cd_to){
		this.evnt_cd_to = evnt_cd_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEvnt_cd_fr(){
		return this.evnt_cd_fr;
	}

	public String getEvnt_cd_to(){
		return this.evnt_cd_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_5031_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_5031_LDM dm = (MC_BUDG_5031_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_yymm);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.evnt_cd_fr);
		cstmt.setString(7, dm.evnt_cd_to);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_5031_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("evnt_cd_fr = [" + getEvnt_cd_fr() + "]");
		System.out.println("evnt_cd_to = [" + getEvnt_cd_to() + "]");
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
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String evnt_cd_fr = req.getParameter("evnt_cd_fr");
if( evnt_cd_fr == null){
	System.out.println(this.toString+" : evnt_cd_fr is null" );
}else{
	System.out.println(this.toString+" : evnt_cd_fr is "+evnt_cd_fr );
}
String evnt_cd_to = req.getParameter("evnt_cd_to");
if( evnt_cd_to == null){
	System.out.println(this.toString+" : evnt_cd_to is null" );
}else{
	System.out.println(this.toString+" : evnt_cd_to is "+evnt_cd_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String evnt_cd_fr = Util.checkString(req.getParameter("evnt_cd_fr"));
String evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String evnt_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd_fr")));
String evnt_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_yymm(budg_yymm);
dm.setDept_cd(dept_cd);
dm.setEvnt_cd_fr(evnt_cd_fr);
dm.setEvnt_cd_to(evnt_cd_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 13 15:28:19 KST 2009 */