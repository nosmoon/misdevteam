/***************************************************************************************************
* 파일명 : .java
* 기능 :  예산관리 - 행사코드등록수정
* 작성일자 : 2011-07-12
* 작성자 : 노상현
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
 * 예산관리 - 행사코드등록수정
 */

public class MC_BUDG_1013_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_cd;
	public String evnt_nm;
	public String clsf;
	public String dept_frcd;
	public String dept_tocd;
	public String bng_dt;
	public String end_dt;

	public MC_BUDG_1013_LDM(){}
	public MC_BUDG_1013_LDM(String cmpy_cd, String evnt_cd, String evnt_nm, String clsf, String dept_frcd, String dept_tocd, String bng_dt, String end_dt){
		this.cmpy_cd = cmpy_cd;
		this.evnt_cd = evnt_cd;
		this.evnt_nm = evnt_nm;
		this.clsf = clsf;
		this.dept_frcd = dept_frcd;
		this.dept_tocd = dept_tocd;
		this.bng_dt = bng_dt;
		this.end_dt = end_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setDept_frcd(String dept_frcd){
		this.dept_frcd = dept_frcd;
	}

	public void setDept_tocd(String dept_tocd){
		this.dept_tocd = dept_tocd;
	}

	public void setBng_dt(String bng_dt){
		this.bng_dt = bng_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getDept_frcd(){
		return this.dept_frcd;
	}

	public String getDept_tocd(){
		return this.dept_tocd;
	}

	public String getBng_dt(){
		return this.bng_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_1013_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_1013_LDM dm = (MC_BUDG_1013_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_cd);
		cstmt.setString(5, dm.evnt_nm);
		cstmt.setString(6, dm.clsf);
		cstmt.setString(7, dm.dept_frcd);
		cstmt.setString(8, dm.dept_tocd);
		cstmt.setString(9, dm.bng_dt);
		cstmt.setString(10, dm.end_dt);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_1013_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("evnt_nm = [" + getEvnt_nm() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
		System.out.println("dept_frcd = [" + getDept_frcd() + "]");
		System.out.println("dept_tocd = [" + getDept_tocd() + "]");
		System.out.println("bng_dt = [" + getBng_dt() + "]");
		System.out.println("end_dt = [" + getEnd_dt() + "]");
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
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_nm = req.getParameter("evnt_nm");
if( evnt_nm == null){
	System.out.println(this.toString+" : evnt_nm is null" );
}else{
	System.out.println(this.toString+" : evnt_nm is "+evnt_nm );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String dept_frcd = req.getParameter("dept_frcd");
if( dept_frcd == null){
	System.out.println(this.toString+" : dept_frcd is null" );
}else{
	System.out.println(this.toString+" : dept_frcd is "+dept_frcd );
}
String dept_tocd = req.getParameter("dept_tocd");
if( dept_tocd == null){
	System.out.println(this.toString+" : dept_tocd is null" );
}else{
	System.out.println(this.toString+" : dept_tocd is "+dept_tocd );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
String clsf = Util.checkString(req.getParameter("clsf"));
String dept_frcd = Util.checkString(req.getParameter("dept_frcd"));
String dept_tocd = Util.checkString(req.getParameter("dept_tocd"));
String bng_dt = Util.checkString(req.getParameter("bng_dt"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String dept_frcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_frcd")));
String dept_tocd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_tocd")));
String bng_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bng_dt")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_nm(evnt_nm);
dm.setClsf(clsf);
dm.setDept_frcd(dept_frcd);
dm.setDept_tocd(dept_tocd);
dm.setBng_dt(bng_dt);
dm.setEnd_dt(end_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 25 14:38:52 KST 2011 */