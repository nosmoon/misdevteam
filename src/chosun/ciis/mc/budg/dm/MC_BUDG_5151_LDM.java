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


public class MC_BUDG_5151_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_fr_yymm;
	public String budg_to_yymm;
	public String plan_bfr_yymm;
	public String plan_bto_yymm;
	public String dept_cd;
	public String cls_cd;

	public MC_BUDG_5151_LDM(){}
	public MC_BUDG_5151_LDM(String cmpy_cd, String budg_fr_yymm, String budg_to_yymm, String plan_bfr_yymm, String plan_bto_yymm, String dept_cd, String cls_cd){
		this.cmpy_cd = cmpy_cd;
		this.budg_fr_yymm = budg_fr_yymm;
		this.budg_to_yymm = budg_to_yymm;
		this.plan_bfr_yymm = plan_bfr_yymm;
		this.plan_bto_yymm = plan_bto_yymm;
		this.dept_cd = dept_cd;
		this.cls_cd = cls_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_fr_yymm(String budg_fr_yymm){
		this.budg_fr_yymm = budg_fr_yymm;
	}

	public void setBudg_to_yymm(String budg_to_yymm){
		this.budg_to_yymm = budg_to_yymm;
	}

	public void setPlan_bfr_yymm(String plan_bfr_yymm){
		this.plan_bfr_yymm = plan_bfr_yymm;
	}

	public void setPlan_bto_yymm(String plan_bto_yymm){
		this.plan_bto_yymm = plan_bto_yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setCls_cd(String cls_cd){
		this.cls_cd = cls_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_fr_yymm(){
		return this.budg_fr_yymm;
	}

	public String getBudg_to_yymm(){
		return this.budg_to_yymm;
	}

	public String getPlan_bfr_yymm(){
		return this.plan_bfr_yymm;
	}

	public String getPlan_bto_yymm(){
		return this.plan_bto_yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getCls_cd(){
		return this.cls_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_5151_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_5151_LDM dm = (MC_BUDG_5151_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_fr_yymm);
		cstmt.setString(5, dm.budg_to_yymm);
		cstmt.setString(6, dm.plan_bfr_yymm);
		cstmt.setString(7, dm.plan_bto_yymm);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.cls_cd);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_5151_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_fr_yymm = [" + getBudg_fr_yymm() + "]");
		System.out.println("budg_to_yymm = [" + getBudg_to_yymm() + "]");
		System.out.println("plan_bfr_yymm = [" + getPlan_bfr_yymm() + "]");
		System.out.println("plan_bto_yymm = [" + getPlan_bto_yymm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("cls_cd = [" + getCls_cd() + "]");
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
String budg_fr_yymm = req.getParameter("budg_fr_yymm");
if( budg_fr_yymm == null){
	System.out.println(this.toString+" : budg_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_fr_yymm is "+budg_fr_yymm );
}
String budg_to_yymm = req.getParameter("budg_to_yymm");
if( budg_to_yymm == null){
	System.out.println(this.toString+" : budg_to_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_to_yymm is "+budg_to_yymm );
}
String plan_bfr_yymm = req.getParameter("plan_bfr_yymm");
if( plan_bfr_yymm == null){
	System.out.println(this.toString+" : plan_bfr_yymm is null" );
}else{
	System.out.println(this.toString+" : plan_bfr_yymm is "+plan_bfr_yymm );
}
String plan_bto_yymm = req.getParameter("plan_bto_yymm");
if( plan_bto_yymm == null){
	System.out.println(this.toString+" : plan_bto_yymm is null" );
}else{
	System.out.println(this.toString+" : plan_bto_yymm is "+plan_bto_yymm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String cls_cd = req.getParameter("cls_cd");
if( cls_cd == null){
	System.out.println(this.toString+" : cls_cd is null" );
}else{
	System.out.println(this.toString+" : cls_cd is "+cls_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_fr_yymm = Util.checkString(req.getParameter("budg_fr_yymm"));
String budg_to_yymm = Util.checkString(req.getParameter("budg_to_yymm"));
String plan_bfr_yymm = Util.checkString(req.getParameter("plan_bfr_yymm"));
String plan_bto_yymm = Util.checkString(req.getParameter("plan_bto_yymm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String cls_cd = Util.checkString(req.getParameter("cls_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_fr_yymm")));
String budg_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_to_yymm")));
String plan_bfr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_bfr_yymm")));
String plan_bto_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_bto_yymm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String cls_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cls_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_fr_yymm(budg_fr_yymm);
dm.setBudg_to_yymm(budg_to_yymm);
dm.setPlan_bfr_yymm(plan_bfr_yymm);
dm.setPlan_bto_yymm(plan_bto_yymm);
dm.setDept_cd(dept_cd);
dm.setCls_cd(cls_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 18 18:32:49 KST 2018 */