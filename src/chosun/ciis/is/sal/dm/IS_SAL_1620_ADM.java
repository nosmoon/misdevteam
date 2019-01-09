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


package chosun.ciis.is.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.ds.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1620_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String adjm_dt;
	public String purc_frdt;
	public String purc_todt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_SAL_1620_ADM(){}
	public IS_SAL_1620_ADM(String flag, String cmpy_cd, String adjm_dt, String purc_frdt, String purc_todt, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.adjm_dt = adjm_dt;
		this.purc_frdt = purc_frdt;
		this.purc_todt = purc_todt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_dt(String adjm_dt){
		this.adjm_dt = adjm_dt;
	}

	public void setPurc_frdt(String purc_frdt){
		this.purc_frdt = purc_frdt;
	}

	public void setPurc_todt(String purc_todt){
		this.purc_todt = purc_todt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_dt(){
		return this.adjm_dt;
	}

	public String getPurc_frdt(){
		return this.purc_frdt;
	}

	public String getPurc_todt(){
		return this.purc_todt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SAL_1620_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SAL_1620_ADM dm = (IS_SAL_1620_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.adjm_dt);
		cstmt.setString(6, dm.purc_frdt);
		cstmt.setString(7, dm.purc_todt);
		cstmt.setString(8, dm.incmg_pers_ip);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.sal.ds.IS_SAL_1620_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_dt = [" + getAdjm_dt() + "]");
		System.out.println("purc_frdt = [" + getPurc_frdt() + "]");
		System.out.println("purc_todt = [" + getPurc_todt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String adjm_dt = req.getParameter("adjm_dt");
if( adjm_dt == null){
	System.out.println(this.toString+" : adjm_dt is null" );
}else{
	System.out.println(this.toString+" : adjm_dt is "+adjm_dt );
}
String purc_frdt = req.getParameter("purc_frdt");
if( purc_frdt == null){
	System.out.println(this.toString+" : purc_frdt is null" );
}else{
	System.out.println(this.toString+" : purc_frdt is "+purc_frdt );
}
String purc_todt = req.getParameter("purc_todt");
if( purc_todt == null){
	System.out.println(this.toString+" : purc_todt is null" );
}else{
	System.out.println(this.toString+" : purc_todt is "+purc_todt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_dt = Util.checkString(req.getParameter("adjm_dt"));
String purc_frdt = Util.checkString(req.getParameter("purc_frdt"));
String purc_todt = Util.checkString(req.getParameter("purc_todt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_dt")));
String purc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_frdt")));
String purc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_todt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_dt(adjm_dt);
dm.setPurc_frdt(purc_frdt);
dm.setPurc_todt(purc_todt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 14:09:47 KST 2012 */