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


package chosun.ciis.is.rpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.rpt.ds.*;
import chosun.ciis.is.rpt.rec.*;

/**
 * 
 */


public class IS_RPT_1910_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cmpy_clsf;
	public String yymm_fr;
	public String yymm_to;
	public String sido;
	public String gu;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_RPT_1910_LDM(){}
	public IS_RPT_1910_LDM(String cmpy_cd, String cmpy_clsf, String yymm_fr, String yymm_to, String sido, String gu, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.cmpy_clsf = cmpy_clsf;
		this.yymm_fr = yymm_fr;
		this.yymm_to = yymm_to;
		this.sido = sido;
		this.gu = gu;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmpy_clsf(String cmpy_clsf){
		this.cmpy_clsf = cmpy_clsf;
	}

	public void setYymm_fr(String yymm_fr){
		this.yymm_fr = yymm_fr;
	}

	public void setYymm_to(String yymm_to){
		this.yymm_to = yymm_to;
	}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGu(String gu){
		this.gu = gu;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCmpy_clsf(){
		return this.cmpy_clsf;
	}

	public String getYymm_fr(){
		return this.yymm_fr;
	}

	public String getYymm_to(){
		return this.yymm_to;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGu(){
		return this.gu;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_RPT_1910_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_RPT_1910_LDM dm = (IS_RPT_1910_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cmpy_clsf);
		cstmt.setString(5, dm.yymm_fr);
		cstmt.setString(6, dm.yymm_to);
		cstmt.setString(7, dm.sido);
		cstmt.setString(8, dm.gu);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ip);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.rpt.ds.IS_RPT_1910_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cmpy_clsf = [" + getCmpy_clsf() + "]");
		System.out.println("yymm_fr = [" + getYymm_fr() + "]");
		System.out.println("yymm_to = [" + getYymm_to() + "]");
		System.out.println("sido = [" + getSido() + "]");
		System.out.println("gu = [" + getGu() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String cmpy_clsf = req.getParameter("cmpy_clsf");
if( cmpy_clsf == null){
	System.out.println(this.toString+" : cmpy_clsf is null" );
}else{
	System.out.println(this.toString+" : cmpy_clsf is "+cmpy_clsf );
}
String yymm_fr = req.getParameter("yymm_fr");
if( yymm_fr == null){
	System.out.println(this.toString+" : yymm_fr is null" );
}else{
	System.out.println(this.toString+" : yymm_fr is "+yymm_fr );
}
String yymm_to = req.getParameter("yymm_to");
if( yymm_to == null){
	System.out.println(this.toString+" : yymm_to is null" );
}else{
	System.out.println(this.toString+" : yymm_to is "+yymm_to );
}
String sido = req.getParameter("sido");
if( sido == null){
	System.out.println(this.toString+" : sido is null" );
}else{
	System.out.println(this.toString+" : sido is "+sido );
}
String gu = req.getParameter("gu");
if( gu == null){
	System.out.println(this.toString+" : gu is null" );
}else{
	System.out.println(this.toString+" : gu is "+gu );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cmpy_clsf = Util.checkString(req.getParameter("cmpy_clsf"));
String yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
String yymm_to = Util.checkString(req.getParameter("yymm_to"));
String sido = Util.checkString(req.getParameter("sido"));
String gu = Util.checkString(req.getParameter("gu"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cmpy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_clsf")));
String yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_fr")));
String yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_to")));
String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido")));
String gu = Util.Uni2Ksc(Util.checkString(req.getParameter("gu")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCmpy_clsf(cmpy_clsf);
dm.setYymm_fr(yymm_fr);
dm.setYymm_to(yymm_to);
dm.setSido(sido);
dm.setGu(gu);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 01 09:40:30 KST 2012 */