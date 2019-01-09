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


package chosun.ciis.fc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.ds.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_1101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String abrv_nm;
	public String select_ch;
	public String use_end_dt;

	public FC_CO_1101_LDM(){}
	public FC_CO_1101_LDM(String cmpy_cd, String dept_cd, String abrv_nm, String select_ch, String use_end_dt){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.abrv_nm = abrv_nm;
		this.select_ch = select_ch;
		this.use_end_dt = use_end_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setSelect_ch(String select_ch){
		this.select_ch = select_ch;
	}

	public void setUse_end_dt(String use_end_dt){
		this.use_end_dt = use_end_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getSelect_ch(){
		return this.select_ch;
	}

	public String getUse_end_dt(){
		return this.use_end_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_CO_1101_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_CO_1101_LDM dm = (FC_CO_1101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.abrv_nm);
		cstmt.setString(6, dm.select_ch);
		cstmt.setString(7, dm.use_end_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.co.ds.FC_CO_1101_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("abrv_nm = [" + getAbrv_nm() + "]");
		System.out.println("select_ch = [" + getSelect_ch() + "]");
		System.out.println("use_end_dt = [" + getUse_end_dt() + "]");
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
String abrv_nm = req.getParameter("abrv_nm");
if( abrv_nm == null){
	System.out.println(this.toString+" : abrv_nm is null" );
}else{
	System.out.println(this.toString+" : abrv_nm is "+abrv_nm );
}
String select_ch = req.getParameter("select_ch");
if( select_ch == null){
	System.out.println(this.toString+" : select_ch is null" );
}else{
	System.out.println(this.toString+" : select_ch is "+select_ch );
}
String use_end_dt = req.getParameter("use_end_dt");
if( use_end_dt == null){
	System.out.println(this.toString+" : use_end_dt is null" );
}else{
	System.out.println(this.toString+" : use_end_dt is "+use_end_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String abrv_nm = Util.checkString(req.getParameter("abrv_nm"));
String select_ch = Util.checkString(req.getParameter("select_ch"));
String use_end_dt = Util.checkString(req.getParameter("use_end_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("abrv_nm")));
String select_ch = Util.Uni2Ksc(Util.checkString(req.getParameter("select_ch")));
String use_end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_end_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setAbrv_nm(abrv_nm);
dm.setSelect_ch(select_ch);
dm.setUse_end_dt(use_end_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 21 15:53:50 KST 2009 */