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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_4221_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String pk;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_DEP_4221_UDM(){}
	public AD_DEP_4221_UDM(String cmpy_cd, String basi_dt, String pk, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.pk = pk;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setPK(String pk){
		this.pk = pk;
	}	

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getPK(){
		return this.pk;
	}
	
	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_4221_U(? ,? ,? ,? ,? ,? ,? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_4221_UDM dm = (AD_DEP_4221_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.basi_dt);
		cstmt.setString(5, dm.pk);		
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_4221_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("pk = [" + getPK() + "]");		
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String rept_no = req.getParameter("rept_no");
if( rept_no == null){
	System.out.println(this.toString+" : rept_no is null" );
}else{
	System.out.println(this.toString+" : rept_no is "+rept_no );
}
String sue_chrg_pers = req.getParameter("sue_chrg_pers");
if( sue_chrg_pers == null){
	System.out.println(this.toString+" : sue_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : sue_chrg_pers is "+sue_chrg_pers );
}
String dlay_rcpm_plan_dt = req.getParameter("dlay_rcpm_plan_dt");
if( dlay_rcpm_plan_dt == null){
	System.out.println(this.toString+" : dlay_rcpm_plan_dt is null" );
}else{
	System.out.println(this.toString+" : dlay_rcpm_plan_dt is "+dlay_rcpm_plan_dt );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rept_no = Util.checkString(req.getParameter("rept_no"));
String sue_chrg_pers = Util.checkString(req.getParameter("sue_chrg_pers"));
String dlay_rcpm_plan_dt = Util.checkString(req.getParameter("dlay_rcpm_plan_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_no")));
String sue_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("sue_chrg_pers")));
String dlay_rcpm_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlay_rcpm_plan_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRept_no(rept_no);
dm.setSue_chrg_pers(sue_chrg_pers);
dm.setDlay_rcpm_plan_dt(dlay_rcpm_plan_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 10:30:36 KST 2009 */