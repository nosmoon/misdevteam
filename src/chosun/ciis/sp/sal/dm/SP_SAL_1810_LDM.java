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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1810_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rdr_extn_yymm;
	public String staf_nm;
	public String acty_area;
	public String pay_plan_dt;
	public String incmg_pers;

	public SP_SAL_1810_LDM(){}
	public SP_SAL_1810_LDM(String cmpy_cd, String rdr_extn_yymm, String staf_nm, String acty_area, String pay_plan_dt, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.rdr_extn_yymm = rdr_extn_yymm;
		this.staf_nm = staf_nm;
		this.acty_area = acty_area;
		this.pay_plan_dt = pay_plan_dt;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRdr_extn_yymm(String rdr_extn_yymm){
		this.rdr_extn_yymm = rdr_extn_yymm;
	}

	public void setStaf_nm(String staf_nm){
		this.staf_nm = staf_nm;
	}

	public void setActy_area(String acty_area){
		this.acty_area = acty_area;
	}

	public void setPay_plan_dt(String pay_plan_dt){
		this.pay_plan_dt = pay_plan_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRdr_extn_yymm(){
		return this.rdr_extn_yymm;
	}

	public String getStaf_nm(){
		return this.staf_nm;
	}

	public String getActy_area(){
		return this.acty_area;
	}

	public String getPay_plan_dt(){
		return this.pay_plan_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_1810_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_1810_LDM dm = (SP_SAL_1810_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rdr_extn_yymm);
		cstmt.setString(5, dm.staf_nm);
		cstmt.setString(6, dm.acty_area);
		cstmt.setString(7, dm.pay_plan_dt);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_1810_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rdr_extn_yymm = [" + getRdr_extn_yymm() + "]");
		System.out.println("staf_nm = [" + getStaf_nm() + "]");
		System.out.println("acty_area = [" + getActy_area() + "]");
		System.out.println("pay_plan_dt = [" + getPay_plan_dt() + "]");
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
String rdr_extn_yymm = req.getParameter("rdr_extn_yymm");
if( rdr_extn_yymm == null){
	System.out.println(this.toString+" : rdr_extn_yymm is null" );
}else{
	System.out.println(this.toString+" : rdr_extn_yymm is "+rdr_extn_yymm );
}
String staf_nm = req.getParameter("staf_nm");
if( staf_nm == null){
	System.out.println(this.toString+" : staf_nm is null" );
}else{
	System.out.println(this.toString+" : staf_nm is "+staf_nm );
}
String acty_area = req.getParameter("acty_area");
if( acty_area == null){
	System.out.println(this.toString+" : acty_area is null" );
}else{
	System.out.println(this.toString+" : acty_area is "+acty_area );
}
String pay_plan_dt = req.getParameter("pay_plan_dt");
if( pay_plan_dt == null){
	System.out.println(this.toString+" : pay_plan_dt is null" );
}else{
	System.out.println(this.toString+" : pay_plan_dt is "+pay_plan_dt );
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
String rdr_extn_yymm = Util.checkString(req.getParameter("rdr_extn_yymm"));
String staf_nm = Util.checkString(req.getParameter("staf_nm"));
String acty_area = Util.checkString(req.getParameter("acty_area"));
String pay_plan_dt = Util.checkString(req.getParameter("pay_plan_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rdr_extn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extn_yymm")));
String staf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("staf_nm")));
String acty_area = Util.Uni2Ksc(Util.checkString(req.getParameter("acty_area")));
String pay_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plan_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRdr_extn_yymm(rdr_extn_yymm);
dm.setStaf_nm(staf_nm);
dm.setActy_area(acty_area);
dm.setPay_plan_dt(pay_plan_dt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 30 17:07:31 KST 2012 */