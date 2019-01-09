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


public class CO_COCD_1320_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pgm_id;
	public String var_nm;
	public String var_val;
	public String descri;
	public String menu_id;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public CO_COCD_1320_IDM(){}
	public CO_COCD_1320_IDM(String cmpy_cd, String pgm_id, String var_nm, String var_val, String descri, String menu_id, String incmg_pers_ipaddr, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm){
		this.cmpy_cd = cmpy_cd;
		this.pgm_id = pgm_id;
		this.var_nm = var_nm;
		this.var_val = var_val;
		this.descri = descri;
		this.menu_id = menu_id;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setVar_nm(String var_nm){
		this.var_nm = var_nm;
	}

	public void setVar_val(String var_val){
		this.var_val = var_val;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public void setMenu_id(String menu_id){
		this.menu_id = menu_id;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getVar_nm(){
		return this.var_nm;
	}

	public String getVar_val(){
		return this.var_val;
	}

	public String getDescri(){
		return this.descri;
	}

	public String getMenu_id(){
		return this.menu_id;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_COCD_1320_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_COCD_1320_IDM dm = (CO_COCD_1320_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pgm_id);
		cstmt.setString(5, dm.var_nm);
		cstmt.setString(6, dm.var_val);
		cstmt.setString(7, dm.descri);
		cstmt.setString(8, dm.menu_id);
		cstmt.setString(9, dm.incmg_pers_ipaddr);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.incmg_dt_tm);
		cstmt.setString(12, dm.chg_pers);
		cstmt.setString(13, dm.chg_dt_tm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.cocd.ds.CO_COCD_1320_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pgm_id = [" + getPgm_id() + "]");
		System.out.println("var_nm = [" + getVar_nm() + "]");
		System.out.println("var_val = [" + getVar_val() + "]");
		System.out.println("descri = [" + getDescri() + "]");
		System.out.println("menu_id = [" + getMenu_id() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("chg_dt_tm = [" + getChg_dt_tm() + "]");
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
String descri = req.getParameter("descri");
if( descri == null){
	System.out.println(this.toString+" : descri is null" );
}else{
	System.out.println(this.toString+" : descri is "+descri );
}
String menu_id = req.getParameter("menu_id");
if( menu_id == null){
	System.out.println(this.toString+" : menu_id is null" );
}else{
	System.out.println(this.toString+" : menu_id is "+menu_id );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_dt_tm = req.getParameter("incmg_dt_tm");
if( incmg_dt_tm == null){
	System.out.println(this.toString+" : incmg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_tm is "+incmg_dt_tm );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String chg_dt_tm = req.getParameter("chg_dt_tm");
if( chg_dt_tm == null){
	System.out.println(this.toString+" : chg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : chg_dt_tm is "+chg_dt_tm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pgm_id = Util.checkString(req.getParameter("pgm_id"));
String var_nm = Util.checkString(req.getParameter("var_nm"));
String var_val = Util.checkString(req.getParameter("var_val"));
String descri = Util.checkString(req.getParameter("descri"));
String menu_id = Util.checkString(req.getParameter("menu_id"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pgm_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_id")));
String var_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("var_nm")));
String var_val = Util.Uni2Ksc(Util.checkString(req.getParameter("var_val")));
String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));
String menu_id = Util.Uni2Ksc(Util.checkString(req.getParameter("menu_id")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String chg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_tm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPgm_id(pgm_id);
dm.setVar_nm(var_nm);
dm.setVar_val(var_val);
dm.setDescri(descri);
dm.setMenu_id(menu_id);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 26 15:43:19 KST 2011 */