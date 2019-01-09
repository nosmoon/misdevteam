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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_1012_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_nm1;
	public String evnt_nm2;
	public String dept_cd;
	public String bng_dt;
	public String end_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public MC_BUDG_1012_ADM(){}
	public MC_BUDG_1012_ADM(String cmpy_cd, String mode, String evnt_yy, String evnt_cd, String evnt_nm1, String evnt_nm2, String dept_cd, String bng_dt, String end_dt, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.evnt_yy = evnt_yy;
		this.evnt_cd = evnt_cd;
		this.evnt_nm1 = evnt_nm1;
		this.evnt_nm2 = evnt_nm2;
		this.dept_cd = dept_cd;
		this.bng_dt = bng_dt;
		this.end_dt = end_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm1(String evnt_nm1){
		this.evnt_nm1 = evnt_nm1;
	}

	public void setEvnt_nm2(String evnt_nm2){
		this.evnt_nm2 = evnt_nm2;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setBng_dt(String bng_dt){
		this.bng_dt = bng_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
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

	public String getMode(){
		return this.mode;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm1(){
		return this.evnt_nm1;
	}

	public String getEvnt_nm2(){
		return this.evnt_nm2;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getBng_dt(){
		return this.bng_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_1012_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_1012_ADM dm = (MC_BUDG_1012_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.evnt_yy);
		cstmt.setString(6, dm.evnt_cd);
		cstmt.setString(7, dm.evnt_nm1);
		cstmt.setString(8, dm.evnt_nm2);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.bng_dt);
		cstmt.setString(11, dm.end_dt);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_1012_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("evnt_yy = [" + getEvnt_yy() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("evnt_nm1 = [" + getEvnt_nm1() + "]");
		System.out.println("evnt_nm2 = [" + getEvnt_nm2() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("bng_dt = [" + getBng_dt() + "]");
		System.out.println("end_dt = [" + getEnd_dt() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String evnt_yy = req.getParameter("evnt_yy");
if( evnt_yy == null){
	System.out.println(this.toString+" : evnt_yy is null" );
}else{
	System.out.println(this.toString+" : evnt_yy is "+evnt_yy );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_nm1 = req.getParameter("evnt_nm1");
if( evnt_nm1 == null){
	System.out.println(this.toString+" : evnt_nm1 is null" );
}else{
	System.out.println(this.toString+" : evnt_nm1 is "+evnt_nm1 );
}
String evnt_nm2 = req.getParameter("evnt_nm2");
if( evnt_nm2 == null){
	System.out.println(this.toString+" : evnt_nm2 is null" );
}else{
	System.out.println(this.toString+" : evnt_nm2 is "+evnt_nm2 );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String bng_dt = req.getParameter("bng_dt");
if( bng_dt == null){
	System.out.println(this.toString+" : bng_dt is null" );
}else{
	System.out.println(this.toString+" : bng_dt is "+bng_dt );
}
String end_dt = req.getParameter("end_dt");
if( end_dt == null){
	System.out.println(this.toString+" : end_dt is null" );
}else{
	System.out.println(this.toString+" : end_dt is "+end_dt );
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
String mode = Util.checkString(req.getParameter("mode"));
String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_nm1 = Util.checkString(req.getParameter("evnt_nm1"));
String evnt_nm2 = Util.checkString(req.getParameter("evnt_nm2"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String bng_dt = Util.checkString(req.getParameter("bng_dt"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String evnt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_nm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm1")));
String evnt_nm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm2")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String bng_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bng_dt")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEvnt_yy(evnt_yy);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_nm1(evnt_nm1);
dm.setEvnt_nm2(evnt_nm2);
dm.setDept_cd(dept_cd);
dm.setBng_dt(bng_dt);
dm.setEnd_dt(end_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 20:16:12 KST 2009 */