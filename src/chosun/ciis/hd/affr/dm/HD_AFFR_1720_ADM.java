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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1720_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String scl_exps_clsf;
	public String scl_yy_pre;
	public String scl_qq_pre;
	public String scl_yy_now;
	public String scl_qq_now;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public HD_AFFR_1720_ADM(){}
	public HD_AFFR_1720_ADM(String cmpy_cd, String scl_exps_clsf, String scl_yy_pre, String scl_qq_pre, String scl_yy_now, String scl_qq_now, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.scl_exps_clsf = scl_exps_clsf;
		this.scl_yy_pre = scl_yy_pre;
		this.scl_qq_pre = scl_qq_pre;
		this.scl_yy_now = scl_yy_now;
		this.scl_qq_now = scl_qq_now;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setScl_exps_clsf(String scl_exps_clsf){
		this.scl_exps_clsf = scl_exps_clsf;
	}

	public void setScl_yy_pre(String scl_yy_pre){
		this.scl_yy_pre = scl_yy_pre;
	}

	public void setScl_qq_pre(String scl_qq_pre){
		this.scl_qq_pre = scl_qq_pre;
	}

	public void setScl_yy_now(String scl_yy_now){
		this.scl_yy_now = scl_yy_now;
	}

	public void setScl_qq_now(String scl_qq_now){
		this.scl_qq_now = scl_qq_now;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getScl_exps_clsf(){
		return this.scl_exps_clsf;
	}

	public String getScl_yy_pre(){
		return this.scl_yy_pre;
	}

	public String getScl_qq_pre(){
		return this.scl_qq_pre;
	}

	public String getScl_yy_now(){
		return this.scl_yy_now;
	}

	public String getScl_qq_now(){
		return this.scl_qq_now;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1720_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1720_ADM dm = (HD_AFFR_1720_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.scl_exps_clsf);
		cstmt.setString(5, dm.scl_yy_pre);
		cstmt.setString(6, dm.scl_qq_pre);
		cstmt.setString(7, dm.scl_yy_now);
		cstmt.setString(8, dm.scl_qq_now);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1720_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("scl_exps_clsf = [" + getScl_exps_clsf() + "]");
		System.out.println("scl_yy_pre = [" + getScl_yy_pre() + "]");
		System.out.println("scl_qq_pre = [" + getScl_qq_pre() + "]");
		System.out.println("scl_yy_now = [" + getScl_yy_now() + "]");
		System.out.println("scl_qq_now = [" + getScl_qq_now() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String scl_exps_clsf = req.getParameter("scl_exps_clsf");
if( scl_exps_clsf == null){
	System.out.println(this.toString+" : scl_exps_clsf is null" );
}else{
	System.out.println(this.toString+" : scl_exps_clsf is "+scl_exps_clsf );
}
String scl_yy_pre = req.getParameter("scl_yy_pre");
if( scl_yy_pre == null){
	System.out.println(this.toString+" : scl_yy_pre is null" );
}else{
	System.out.println(this.toString+" : scl_yy_pre is "+scl_yy_pre );
}
String scl_qq_pre = req.getParameter("scl_qq_pre");
if( scl_qq_pre == null){
	System.out.println(this.toString+" : scl_qq_pre is null" );
}else{
	System.out.println(this.toString+" : scl_qq_pre is "+scl_qq_pre );
}
String scl_yy_now = req.getParameter("scl_yy_now");
if( scl_yy_now == null){
	System.out.println(this.toString+" : scl_yy_now is null" );
}else{
	System.out.println(this.toString+" : scl_yy_now is "+scl_yy_now );
}
String scl_qq_now = req.getParameter("scl_qq_now");
if( scl_qq_now == null){
	System.out.println(this.toString+" : scl_qq_now is null" );
}else{
	System.out.println(this.toString+" : scl_qq_now is "+scl_qq_now );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String scl_exps_clsf = Util.checkString(req.getParameter("scl_exps_clsf"));
String scl_yy_pre = Util.checkString(req.getParameter("scl_yy_pre"));
String scl_qq_pre = Util.checkString(req.getParameter("scl_qq_pre"));
String scl_yy_now = Util.checkString(req.getParameter("scl_yy_now"));
String scl_qq_now = Util.checkString(req.getParameter("scl_qq_now"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String scl_exps_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_exps_clsf")));
String scl_yy_pre = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_yy_pre")));
String scl_qq_pre = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_qq_pre")));
String scl_yy_now = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_yy_now")));
String scl_qq_now = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_qq_now")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setScl_exps_clsf(scl_exps_clsf);
dm.setScl_yy_pre(scl_yy_pre);
dm.setScl_qq_pre(scl_qq_pre);
dm.setScl_yy_now(scl_yy_now);
dm.setScl_qq_now(scl_qq_now);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 21 17:44:45 KST 2009 */