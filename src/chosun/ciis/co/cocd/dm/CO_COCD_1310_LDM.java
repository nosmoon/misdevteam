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


package chosun.ciis.co.cocd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.ds.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pgm_id;
	public String menu_id;
	public String menu_nm;
	public String var_nm;
	public String var_val;
	public String chg_pers;

	public CO_COCD_1310_LDM(){}
	public CO_COCD_1310_LDM(String cmpy_cd, String pgm_id, String menu_id, String menu_nm, String var_nm, String var_val, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.pgm_id = pgm_id;
		this.menu_id = menu_id;
		this.menu_nm = menu_nm;
		this.var_nm = var_nm;
		this.var_val = var_val;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setMenu_id(String menu_id){
		this.menu_id = menu_id;
	}

	public void setMenu_nm(String menu_nm){
		this.menu_nm = menu_nm;
	}

	public void setVar_nm(String var_nm){
		this.var_nm = var_nm;
	}

	public void setVar_val(String var_val){
		this.var_val = var_val;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getMenu_id(){
		return this.menu_id;
	}

	public String getMenu_nm(){
		return this.menu_nm;
	}

	public String getVar_nm(){
		return this.var_nm;
	}

	public String getVar_val(){
		return this.var_val;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_COCD_1310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_COCD_1310_LDM dm = (CO_COCD_1310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pgm_id);
		cstmt.setString(5, dm.menu_id);
		cstmt.setString(6, dm.menu_nm);
		cstmt.setString(7, dm.var_nm);
		cstmt.setString(8, dm.var_val);
		cstmt.setString(9, dm.chg_pers);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.cocd.ds.CO_COCD_1310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pgm_id = [" + getPgm_id() + "]");
		System.out.println("menu_id = [" + getMenu_id() + "]");
		System.out.println("menu_nm = [" + getMenu_nm() + "]");
		System.out.println("var_nm = [" + getVar_nm() + "]");
		System.out.println("var_val = [" + getVar_val() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String pgm_id = req.getParameter("pgm_id");
if( pgm_id == null){
	System.out.println(this.toString+" : pgm_id is null" );
}else{
	System.out.println(this.toString+" : pgm_id is "+pgm_id );
}
String menu_id = req.getParameter("menu_id");
if( menu_id == null){
	System.out.println(this.toString+" : menu_id is null" );
}else{
	System.out.println(this.toString+" : menu_id is "+menu_id );
}
String menu_nm = req.getParameter("menu_nm");
if( menu_nm == null){
	System.out.println(this.toString+" : menu_nm is null" );
}else{
	System.out.println(this.toString+" : menu_nm is "+menu_nm );
}
String var_nm = req.getParameter("var_nm");
if( var_nm == null){
	System.out.println(this.toString+" : var_nm is null" );
}else{
	System.out.println(this.toString+" : var_nm is "+var_nm );
}
String var_val = req.getParameter("var_val");
if( var_val == null){
	System.out.println(this.toString+" : var_val is null" );
}else{
	System.out.println(this.toString+" : var_val is "+var_val );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pgm_id = Util.checkString(req.getParameter("pgm_id"));
String menu_id = Util.checkString(req.getParameter("menu_id"));
String menu_nm = Util.checkString(req.getParameter("menu_nm"));
String var_nm = Util.checkString(req.getParameter("var_nm"));
String var_val = Util.checkString(req.getParameter("var_val"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pgm_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_id")));
String menu_id = Util.Uni2Ksc(Util.checkString(req.getParameter("menu_id")));
String menu_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("menu_nm")));
String var_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("var_nm")));
String var_val = Util.Uni2Ksc(Util.checkString(req.getParameter("var_val")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPgm_id(pgm_id);
dm.setMenu_id(menu_id);
dm.setMenu_nm(menu_nm);
dm.setVar_nm(var_nm);
dm.setVar_val(var_val);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 26 19:40:40 KST 2011 */