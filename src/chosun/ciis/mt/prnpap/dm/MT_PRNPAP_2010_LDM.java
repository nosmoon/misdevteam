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


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_2010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String prt_plan_dd_pers_fr;
	public String prt_plan_dd_pers_to;
	public String prt_nm;

	public MT_PRNPAP_2010_LDM(){}
	public MT_PRNPAP_2010_LDM(String cmpy_cd, String prt_plan_dd_pers_fr, String prt_plan_dd_pers_to, String prt_nm){
		this.cmpy_cd = cmpy_cd;
		this.prt_plan_dd_pers_fr = prt_plan_dd_pers_fr;
		this.prt_plan_dd_pers_to = prt_plan_dd_pers_to;
		this.prt_nm = prt_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPrt_plan_dd_pers_fr(String prt_plan_dd_pers_fr){
		this.prt_plan_dd_pers_fr = prt_plan_dd_pers_fr;
	}

	public void setPrt_plan_dd_pers_to(String prt_plan_dd_pers_to){
		this.prt_plan_dd_pers_to = prt_plan_dd_pers_to;
	}

	public void setPrt_nm(String prt_nm){
		this.prt_nm = prt_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPrt_plan_dd_pers_fr(){
		return this.prt_plan_dd_pers_fr;
	}

	public String getPrt_plan_dd_pers_to(){
		return this.prt_plan_dd_pers_to;
	}

	public String getPrt_nm(){
		return this.prt_nm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_2010_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_2010_LDM dm = (MT_PRNPAP_2010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.prt_plan_dd_pers_fr);
		cstmt.setString(5, dm.prt_plan_dd_pers_to);
		cstmt.setString(6, dm.prt_nm);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_2010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("prt_plan_dd_pers_fr = [" + getPrt_plan_dd_pers_fr() + "]");
		System.out.println("prt_plan_dd_pers_to = [" + getPrt_plan_dd_pers_to() + "]");
		System.out.println("prt_nm = [" + getPrt_nm() + "]");
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
String prt_plan_dd_pers_fr = req.getParameter("prt_plan_dd_pers_fr");
if( prt_plan_dd_pers_fr == null){
	System.out.println(this.toString+" : prt_plan_dd_pers_fr is null" );
}else{
	System.out.println(this.toString+" : prt_plan_dd_pers_fr is "+prt_plan_dd_pers_fr );
}
String prt_plan_dd_pers_to = req.getParameter("prt_plan_dd_pers_to");
if( prt_plan_dd_pers_to == null){
	System.out.println(this.toString+" : prt_plan_dd_pers_to is null" );
}else{
	System.out.println(this.toString+" : prt_plan_dd_pers_to is "+prt_plan_dd_pers_to );
}
String prt_nm = req.getParameter("prt_nm");
if( prt_nm == null){
	System.out.println(this.toString+" : prt_nm is null" );
}else{
	System.out.println(this.toString+" : prt_nm is "+prt_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String prt_plan_dd_pers_fr = Util.checkString(req.getParameter("prt_plan_dd_pers_fr"));
String prt_plan_dd_pers_to = Util.checkString(req.getParameter("prt_plan_dd_pers_to"));
String prt_nm = Util.checkString(req.getParameter("prt_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prt_plan_dd_pers_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plan_dd_pers_fr")));
String prt_plan_dd_pers_to = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plan_dd_pers_to")));
String prt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPrt_plan_dd_pers_fr(prt_plan_dd_pers_fr);
dm.setPrt_plan_dd_pers_to(prt_plan_dd_pers_to);
dm.setPrt_nm(prt_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 23 18:00:58 KST 2009 */