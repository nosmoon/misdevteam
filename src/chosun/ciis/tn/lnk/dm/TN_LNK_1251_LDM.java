/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1251_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_clsf;
	public String cret_frdt;
	public String cret_todt;
	public String cret_stnd;
	public String mngr_nm;
	public String mngr_phon1;
	public String mngr_phon2;
	public String mngr_phon3;
	public String rpt_dt;
	public String cret_yn;
	public String incmg_pers;

	public TN_LNK_1251_LDM(){}
	public TN_LNK_1251_LDM(String cmpy_cd, String dept_clsf, String cret_frdt, String cret_todt, String cret_stnd, String mngr_nm, String mngr_phon1, String mngr_phon2, String mngr_phon3, String rpt_dt, String cret_yn, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dept_clsf = dept_clsf;
		this.cret_frdt = cret_frdt;
		this.cret_todt = cret_todt;
		this.cret_stnd = cret_stnd;
		this.mngr_nm = mngr_nm;
		this.mngr_phon1 = mngr_phon1;
		this.mngr_phon2 = mngr_phon2;
		this.mngr_phon3 = mngr_phon3;
		this.rpt_dt = rpt_dt;
		this.cret_yn = cret_yn;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_clsf(String dept_clsf){
		this.dept_clsf = dept_clsf;
	}

	public void setCret_frdt(String cret_frdt){
		this.cret_frdt = cret_frdt;
	}

	public void setCret_todt(String cret_todt){
		this.cret_todt = cret_todt;
	}

	public void setCret_stnd(String cret_stnd){
		this.cret_stnd = cret_stnd;
	}

	public void setMngr_nm(String mngr_nm){
		this.mngr_nm = mngr_nm;
	}

	public void setMngr_phon1(String mngr_phon1){
		this.mngr_phon1 = mngr_phon1;
	}

	public void setMngr_phon2(String mngr_phon2){
		this.mngr_phon2 = mngr_phon2;
	}

	public void setMngr_phon3(String mngr_phon3){
		this.mngr_phon3 = mngr_phon3;
	}

	public void setRpt_dt(String rpt_dt){
		this.rpt_dt = rpt_dt;
	}

	public void setCret_yn(String cret_yn){
		this.cret_yn = cret_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_clsf(){
		return this.dept_clsf;
	}

	public String getCret_frdt(){
		return this.cret_frdt;
	}

	public String getCret_todt(){
		return this.cret_todt;
	}

	public String getCret_stnd(){
		return this.cret_stnd;
	}

	public String getMngr_nm(){
		return this.mngr_nm;
	}

	public String getMngr_phon1(){
		return this.mngr_phon1;
	}

	public String getMngr_phon2(){
		return this.mngr_phon2;
	}

	public String getMngr_phon3(){
		return this.mngr_phon3;
	}

	public String getRpt_dt(){
		return this.rpt_dt;
	}

	public String getCret_yn(){
		return this.cret_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_1251_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1251_LDM dm = (TN_LNK_1251_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_clsf);
		cstmt.setString(5, dm.cret_frdt);
		cstmt.setString(6, dm.cret_todt);
		cstmt.setString(7, dm.cret_stnd);
		cstmt.setString(8, dm.mngr_nm);
		cstmt.setString(9, dm.mngr_phon1);
		cstmt.setString(10, dm.mngr_phon2);
		cstmt.setString(11, dm.mngr_phon3);
		cstmt.setString(12, dm.rpt_dt);
		cstmt.setString(13, dm.cret_yn);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1251_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_clsf = [" + getDept_clsf() + "]");
		System.out.println("cret_frdt = [" + getCret_frdt() + "]");
		System.out.println("cret_todt = [" + getCret_todt() + "]");
		System.out.println("cret_stnd = [" + getCret_stnd() + "]");
		System.out.println("mngr_nm = [" + getMngr_nm() + "]");
		System.out.println("mngr_phon1 = [" + getMngr_phon1() + "]");
		System.out.println("mngr_phon2 = [" + getMngr_phon2() + "]");
		System.out.println("mngr_phon3 = [" + getMngr_phon3() + "]");
		System.out.println("rpt_dt = [" + getRpt_dt() + "]");
		System.out.println("cret_yn = [" + getCret_yn() + "]");
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
String dept_clsf = req.getParameter("dept_clsf");
if( dept_clsf == null){
	System.out.println(this.toString+" : dept_clsf is null" );
}else{
	System.out.println(this.toString+" : dept_clsf is "+dept_clsf );
}
String cret_frdt = req.getParameter("cret_frdt");
if( cret_frdt == null){
	System.out.println(this.toString+" : cret_frdt is null" );
}else{
	System.out.println(this.toString+" : cret_frdt is "+cret_frdt );
}
String cret_todt = req.getParameter("cret_todt");
if( cret_todt == null){
	System.out.println(this.toString+" : cret_todt is null" );
}else{
	System.out.println(this.toString+" : cret_todt is "+cret_todt );
}
String cret_stnd = req.getParameter("cret_stnd");
if( cret_stnd == null){
	System.out.println(this.toString+" : cret_stnd is null" );
}else{
	System.out.println(this.toString+" : cret_stnd is "+cret_stnd );
}
String mngr_nm = req.getParameter("mngr_nm");
if( mngr_nm == null){
	System.out.println(this.toString+" : mngr_nm is null" );
}else{
	System.out.println(this.toString+" : mngr_nm is "+mngr_nm );
}
String mngr_phon1 = req.getParameter("mngr_phon1");
if( mngr_phon1 == null){
	System.out.println(this.toString+" : mngr_phon1 is null" );
}else{
	System.out.println(this.toString+" : mngr_phon1 is "+mngr_phon1 );
}
String mngr_phon2 = req.getParameter("mngr_phon2");
if( mngr_phon2 == null){
	System.out.println(this.toString+" : mngr_phon2 is null" );
}else{
	System.out.println(this.toString+" : mngr_phon2 is "+mngr_phon2 );
}
String mngr_phon3 = req.getParameter("mngr_phon3");
if( mngr_phon3 == null){
	System.out.println(this.toString+" : mngr_phon3 is null" );
}else{
	System.out.println(this.toString+" : mngr_phon3 is "+mngr_phon3 );
}
String rpt_dt = req.getParameter("rpt_dt");
if( rpt_dt == null){
	System.out.println(this.toString+" : rpt_dt is null" );
}else{
	System.out.println(this.toString+" : rpt_dt is "+rpt_dt );
}
String cret_yn = req.getParameter("cret_yn");
if( cret_yn == null){
	System.out.println(this.toString+" : cret_yn is null" );
}else{
	System.out.println(this.toString+" : cret_yn is "+cret_yn );
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
String dept_clsf = Util.checkString(req.getParameter("dept_clsf"));
String cret_frdt = Util.checkString(req.getParameter("cret_frdt"));
String cret_todt = Util.checkString(req.getParameter("cret_todt"));
String cret_stnd = Util.checkString(req.getParameter("cret_stnd"));
String mngr_nm = Util.checkString(req.getParameter("mngr_nm"));
String mngr_phon1 = Util.checkString(req.getParameter("mngr_phon1"));
String mngr_phon2 = Util.checkString(req.getParameter("mngr_phon2"));
String mngr_phon3 = Util.checkString(req.getParameter("mngr_phon3"));
String rpt_dt = Util.checkString(req.getParameter("rpt_dt"));
String cret_yn = Util.checkString(req.getParameter("cret_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_clsf")));
String cret_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("cret_frdt")));
String cret_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("cret_todt")));
String cret_stnd = Util.Uni2Ksc(Util.checkString(req.getParameter("cret_stnd")));
String mngr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mngr_nm")));
String mngr_phon1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mngr_phon1")));
String mngr_phon2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mngr_phon2")));
String mngr_phon3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mngr_phon3")));
String rpt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rpt_dt")));
String cret_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("cret_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_clsf(dept_clsf);
dm.setCret_frdt(cret_frdt);
dm.setCret_todt(cret_todt);
dm.setCret_stnd(cret_stnd);
dm.setMngr_nm(mngr_nm);
dm.setMngr_phon1(mngr_phon1);
dm.setMngr_phon2(mngr_phon2);
dm.setMngr_phon3(mngr_phon3);
dm.setRpt_dt(rpt_dt);
dm.setCret_yn(cret_yn);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 18:36:01 KST 2017 */