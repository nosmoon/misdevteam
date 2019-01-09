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


package chosun.ciis.co.job.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.job.ds.*;
import chosun.ciis.co.job.rec.*;

/**
 * 
 */


public class CO_JOB_2010_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_cd;
	public String menu_id;
	public String my_menu_nm;
	public String my_supr_menu_id;
	public String incmg_pers;

	public CO_JOB_2010_ADM(){}
	public CO_JOB_2010_ADM(String cmpy_cd, String acct_cd, String menu_id, String my_menu_nm, String my_supr_menu_id, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.acct_cd = acct_cd;
		this.menu_id = menu_id;
		this.my_menu_nm = my_menu_nm;
		this.my_supr_menu_id = my_supr_menu_id;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setMenu_id(String menu_id){
		this.menu_id = menu_id;
	}

	public void setMy_menu_nm(String my_menu_nm){
		this.my_menu_nm = my_menu_nm;
	}

	public void setMy_supr_menu_id(String my_supr_menu_id){
		this.my_supr_menu_id = my_supr_menu_id;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getMenu_id(){
		return this.menu_id;
	}

	public String getMy_menu_nm(){
		return this.my_menu_nm;
	}

	public String getMy_supr_menu_id(){
		return this.my_supr_menu_id;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_JOB_2010_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_JOB_2010_ADM dm = (CO_JOB_2010_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_cd);
		cstmt.setString(5, dm.menu_id);
		cstmt.setString(6, dm.my_menu_nm);
		cstmt.setString(7, dm.my_supr_menu_id);
		cstmt.setString(8, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.job.ds.CO_JOB_2010_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("menu_id = [" + getMenu_id() + "]");
		System.out.println("my_menu_nm = [" + getMy_menu_nm() + "]");
		System.out.println("my_supr_menu_id = [" + getMy_supr_menu_id() + "]");
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
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String menu_id = req.getParameter("menu_id");
if( menu_id == null){
	System.out.println(this.toString+" : menu_id is null" );
}else{
	System.out.println(this.toString+" : menu_id is "+menu_id );
}
String my_menu_nm = req.getParameter("my_menu_nm");
if( my_menu_nm == null){
	System.out.println(this.toString+" : my_menu_nm is null" );
}else{
	System.out.println(this.toString+" : my_menu_nm is "+my_menu_nm );
}
String my_supr_menu_id = req.getParameter("my_supr_menu_id");
if( my_supr_menu_id == null){
	System.out.println(this.toString+" : my_supr_menu_id is null" );
}else{
	System.out.println(this.toString+" : my_supr_menu_id is "+my_supr_menu_id );
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
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String menu_id = Util.checkString(req.getParameter("menu_id"));
String my_menu_nm = Util.checkString(req.getParameter("my_menu_nm"));
String my_supr_menu_id = Util.checkString(req.getParameter("my_supr_menu_id"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String menu_id = Util.Uni2Ksc(Util.checkString(req.getParameter("menu_id")));
String my_menu_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("my_menu_nm")));
String my_supr_menu_id = Util.Uni2Ksc(Util.checkString(req.getParameter("my_supr_menu_id")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_cd(acct_cd);
dm.setMenu_id(menu_id);
dm.setMy_menu_nm(my_menu_nm);
dm.setMy_supr_menu_id(my_supr_menu_id);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 11 17:31:10 KST 2009 */