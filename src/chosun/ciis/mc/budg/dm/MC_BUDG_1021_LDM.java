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


public class MC_BUDG_1021_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_frcd;
	public String budg_tocd;
	public String budg_nm;
	public String budg_clas_cd;

	public MC_BUDG_1021_LDM(){}
	public MC_BUDG_1021_LDM(String cmpy_cd, String budg_frcd, String budg_tocd, String budg_nm, String budg_clas_cd){
		this.cmpy_cd = cmpy_cd;
		this.budg_frcd = budg_frcd;
		this.budg_tocd = budg_tocd;
		this.budg_nm = budg_nm;
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_frcd(String budg_frcd){
		this.budg_frcd = budg_frcd;
	}

	public void setBudg_tocd(String budg_tocd){
		this.budg_tocd = budg_tocd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_frcd(){
		return this.budg_frcd;
	}

	public String getBudg_tocd(){
		return this.budg_tocd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_1021_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_1021_LDM dm = (MC_BUDG_1021_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_frcd);
		cstmt.setString(5, dm.budg_tocd);
		cstmt.setString(6, dm.budg_nm);
		cstmt.setString(7, dm.budg_clas_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_1021_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_frcd = [" + getBudg_frcd() + "]");
		System.out.println("budg_tocd = [" + getBudg_tocd() + "]");
		System.out.println("budg_nm = [" + getBudg_nm() + "]");
		System.out.println("budg_clas_cd = [" + getBudg_clas_cd() + "]");
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
String budg_frcd = req.getParameter("budg_frcd");
if( budg_frcd == null){
	System.out.println(this.toString+" : budg_frcd is null" );
}else{
	System.out.println(this.toString+" : budg_frcd is "+budg_frcd );
}
String budg_tocd = req.getParameter("budg_tocd");
if( budg_tocd == null){
	System.out.println(this.toString+" : budg_tocd is null" );
}else{
	System.out.println(this.toString+" : budg_tocd is "+budg_tocd );
}
String budg_nm = req.getParameter("budg_nm");
if( budg_nm == null){
	System.out.println(this.toString+" : budg_nm is null" );
}else{
	System.out.println(this.toString+" : budg_nm is "+budg_nm );
}
String budg_clas_cd = req.getParameter("budg_clas_cd");
if( budg_clas_cd == null){
	System.out.println(this.toString+" : budg_clas_cd is null" );
}else{
	System.out.println(this.toString+" : budg_clas_cd is "+budg_clas_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_frcd = Util.checkString(req.getParameter("budg_frcd"));
String budg_tocd = Util.checkString(req.getParameter("budg_tocd"));
String budg_nm = Util.checkString(req.getParameter("budg_nm"));
String budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_frcd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_frcd")));
String budg_tocd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_tocd")));
String budg_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_nm")));
String budg_clas_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clas_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_frcd(budg_frcd);
dm.setBudg_tocd(budg_tocd);
dm.setBudg_nm(budg_nm);
dm.setBudg_clas_cd(budg_clas_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 21:09:56 KST 2009 */