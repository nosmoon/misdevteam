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


public class AD_DEP_4110_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String na_frdt;
	public String na_todt;
	public String ma_frdt;
	public String ma_todt;
	public String basi_dt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_DEP_4110_ADM(){}
	public AD_DEP_4110_ADM(String cmpy_cd, String na_frdt, String na_todt, String ma_frdt, String ma_todt, String basi_dt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.na_frdt = na_frdt;
		this.na_todt = na_todt;
		this.ma_frdt = ma_frdt;
		this.ma_todt = ma_todt;
		this.basi_dt = basi_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNa_frdt(String na_frdt){
		this.na_frdt = na_frdt;
	}

	public void setNa_todt(String na_todt){
		this.na_todt = na_todt;
	}

	public void setMa_frdt(String ma_frdt){
		this.ma_frdt = ma_frdt;
	}

	public void setMa_todt(String ma_todt){
		this.ma_todt = ma_todt;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
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

	public String getNa_frdt(){
		return this.na_frdt;
	}

	public String getNa_todt(){
		return this.na_todt;
	}

	public String getMa_frdt(){
		return this.ma_frdt;
	}

	public String getMa_todt(){
		return this.ma_todt;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_4110_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_4110_ADM dm = (AD_DEP_4110_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.na_frdt);
		cstmt.setString(5, dm.na_todt);
		cstmt.setString(6, dm.ma_frdt);
		cstmt.setString(7, dm.ma_todt);
		cstmt.setString(8, dm.basi_dt);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_4110_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("na_frdt = [" + getNa_frdt() + "]");
		System.out.println("na_todt = [" + getNa_todt() + "]");
		System.out.println("ma_frdt = [" + getMa_frdt() + "]");
		System.out.println("ma_todt = [" + getMa_todt() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
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
String na_frdt = req.getParameter("na_frdt");
if( na_frdt == null){
	System.out.println(this.toString+" : na_frdt is null" );
}else{
	System.out.println(this.toString+" : na_frdt is "+na_frdt );
}
String na_todt = req.getParameter("na_todt");
if( na_todt == null){
	System.out.println(this.toString+" : na_todt is null" );
}else{
	System.out.println(this.toString+" : na_todt is "+na_todt );
}
String ma_frdt = req.getParameter("ma_frdt");
if( ma_frdt == null){
	System.out.println(this.toString+" : ma_frdt is null" );
}else{
	System.out.println(this.toString+" : ma_frdt is "+ma_frdt );
}
String ma_todt = req.getParameter("ma_todt");
if( ma_todt == null){
	System.out.println(this.toString+" : ma_todt is null" );
}else{
	System.out.println(this.toString+" : ma_todt is "+ma_todt );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
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
String na_frdt = Util.checkString(req.getParameter("na_frdt"));
String na_todt = Util.checkString(req.getParameter("na_todt"));
String ma_frdt = Util.checkString(req.getParameter("ma_frdt"));
String ma_todt = Util.checkString(req.getParameter("ma_todt"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String na_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("na_frdt")));
String na_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("na_todt")));
String ma_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_frdt")));
String ma_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("ma_todt")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setNa_frdt(na_frdt);
dm.setNa_todt(na_todt);
dm.setMa_frdt(ma_frdt);
dm.setMa_todt(ma_todt);
dm.setBasi_dt(basi_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 29 12:08:41 KST 2009 */