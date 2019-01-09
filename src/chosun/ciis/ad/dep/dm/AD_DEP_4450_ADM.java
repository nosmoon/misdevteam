/***************************************************************************************************
* 파일명 : .java
* 기능 : 전자어음 업로드
* 작성일자 : 2011.07.05
* 작성자 : KBS
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


public class AD_DEP_4450_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_dt;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;

	public AD_DEP_4450_ADM(){}
	
	
	public AD_DEP_4450_ADM(String cmpy_cd, String rcpm_dt, String incmg_pers_ip, String incmg_pers, String mode) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.rcpm_dt = rcpm_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
	}


	public String getCmpy_cd() {
		return cmpy_cd;
	}


	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}


	public String getIncmg_pers() {
		return incmg_pers;
	}


	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}


	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}


	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}


	public String getRcpm_dt() {
		return rcpm_dt;
	}


	public void setRcpm_dt(String rcpm_dt) {
		this.rcpm_dt = rcpm_dt;
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_4450_A(?, ? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_4450_ADM dm = (AD_DEP_4450_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_dt);
		cstmt.setString(5, dm.incmg_pers_ip);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_4450_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
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
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
String notaxrate_clsf = req.getParameter("notaxrate_clsf");
if( notaxrate_clsf == null){
	System.out.println(this.toString+" : notaxrate_clsf is null" );
}else{
	System.out.println(this.toString+" : notaxrate_clsf is "+notaxrate_clsf );
}
String notaxrate_dt = req.getParameter("notaxrate_dt");
if( notaxrate_dt == null){
	System.out.println(this.toString+" : notaxrate_dt is null" );
}else{
	System.out.println(this.toString+" : notaxrate_dt is "+notaxrate_dt );
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
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
String notaxrate_clsf = Util.checkString(req.getParameter("notaxrate_clsf"));
String notaxrate_dt = Util.checkString(req.getParameter("notaxrate_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
String notaxrate_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("notaxrate_clsf")));
String notaxrate_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("notaxrate_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setPubc_slip_no(pubc_slip_no);
dm.setNotaxrate_clsf(notaxrate_clsf);
dm.setNotaxrate_dt(notaxrate_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 14:53:38 KST 2009 */