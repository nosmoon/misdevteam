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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String driv_dt;
	public String drvr_cd;
	public String driv_yn;
	public String nondriv_clsf;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_ETCCAR_9002_ADM(){}
	public MT_ETCCAR_9002_ADM(String cmpy_cd, String driv_dt, String drvr_cd, String driv_yn, String nondriv_clsf, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.driv_dt = driv_dt;
		this.drvr_cd = drvr_cd;
		this.driv_yn = driv_yn;
		this.nondriv_clsf = nondriv_clsf;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDriv_dt(String driv_dt){
		this.driv_dt = driv_dt;
	}

	public void setDrvr_cd(String drvr_cd){
		this.drvr_cd = drvr_cd;
	}

	public void setDriv_yn(String driv_yn){
		this.driv_yn = driv_yn;
	}

	public void setNondriv_clsf(String nondriv_clsf){
		this.nondriv_clsf = nondriv_clsf;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDriv_dt(){
		return this.driv_dt;
	}

	public String getDrvr_cd(){
		return this.drvr_cd;
	}

	public String getDriv_yn(){
		return this.driv_yn;
	}

	public String getNondriv_clsf(){
		return this.nondriv_clsf;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_9002_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_9002_ADM dm = (MT_ETCCAR_9002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.driv_dt);
		cstmt.setString(5, dm.drvr_cd);
		cstmt.setString(6, dm.driv_yn);
		cstmt.setString(7, dm.nondriv_clsf);
		cstmt.setString(8, dm.incmg_pers_ipaddr);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_9002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("driv_dt = [" + getDriv_dt() + "]");
		System.out.println("drvr_cd = [" + getDrvr_cd() + "]");
		System.out.println("driv_yn = [" + getDriv_yn() + "]");
		System.out.println("nondriv_clsf = [" + getNondriv_clsf() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
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
String driv_dt = req.getParameter("driv_dt");
if( driv_dt == null){
	System.out.println(this.toString+" : driv_dt is null" );
}else{
	System.out.println(this.toString+" : driv_dt is "+driv_dt );
}
String drvr_cd = req.getParameter("drvr_cd");
if( drvr_cd == null){
	System.out.println(this.toString+" : drvr_cd is null" );
}else{
	System.out.println(this.toString+" : drvr_cd is "+drvr_cd );
}
String driv_yn = req.getParameter("driv_yn");
if( driv_yn == null){
	System.out.println(this.toString+" : driv_yn is null" );
}else{
	System.out.println(this.toString+" : driv_yn is "+driv_yn );
}
String nondriv_clsf = req.getParameter("nondriv_clsf");
if( nondriv_clsf == null){
	System.out.println(this.toString+" : nondriv_clsf is null" );
}else{
	System.out.println(this.toString+" : nondriv_clsf is "+nondriv_clsf );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String driv_dt = Util.checkString(req.getParameter("driv_dt"));
String drvr_cd = Util.checkString(req.getParameter("drvr_cd"));
String driv_yn = Util.checkString(req.getParameter("driv_yn"));
String nondriv_clsf = Util.checkString(req.getParameter("nondriv_clsf"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String driv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_dt")));
String drvr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("drvr_cd")));
String driv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_yn")));
String nondriv_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("nondriv_clsf")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDriv_dt(driv_dt);
dm.setDrvr_cd(drvr_cd);
dm.setDriv_yn(driv_yn);
dm.setNondriv_clsf(nondriv_clsf);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 24 17:28:04 KST 2012 */