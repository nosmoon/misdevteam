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


package chosun.ciis.hd.appmt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.appmt.ds.*;
import chosun.ciis.hd.appmt.rec.*;

/**
 * 
 */


public class HD_APPMT_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String appmt_cd;
	public String dept_cd;
	public String appmt_dt_fm;
	public String appmt_dt_to;
	public String appmt_stat_clsf;
	public String lvcmpy_dt;

	public HD_APPMT_1001_LDM(){}
	public HD_APPMT_1001_LDM(String cmpy_cd, String emp_no, String flnm, String appmt_cd, String dept_cd, String appmt_dt_fm, String appmt_dt_to, String appmt_stat_clsf, String lvcmpy_dt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.appmt_cd = appmt_cd;
		this.dept_cd = dept_cd;
		this.appmt_dt_fm = appmt_dt_fm;
		this.appmt_dt_to = appmt_dt_to;
		this.appmt_stat_clsf = appmt_stat_clsf;
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setAppmt_cd(String appmt_cd){
		this.appmt_cd = appmt_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAppmt_dt_fm(String appmt_dt_fm){
		this.appmt_dt_fm = appmt_dt_fm;
	}

	public void setAppmt_dt_to(String appmt_dt_to){
		this.appmt_dt_to = appmt_dt_to;
	}

	public void setAppmt_stat_clsf(String appmt_stat_clsf){
		this.appmt_stat_clsf = appmt_stat_clsf;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getAppmt_cd(){
		return this.appmt_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAppmt_dt_fm(){
		return this.appmt_dt_fm;
	}

	public String getAppmt_dt_to(){
		return this.appmt_dt_to;
	}

	public String getAppmt_stat_clsf(){
		return this.appmt_stat_clsf;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_APPMT_1001_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_APPMT_1001_LDM dm = (HD_APPMT_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.flnm);
		cstmt.setString(6, dm.appmt_cd);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.appmt_dt_fm);
		cstmt.setString(9, dm.appmt_dt_to);
		cstmt.setString(10, dm.appmt_stat_clsf);
		cstmt.setString(11, dm.lvcmpy_dt);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.appmt.ds.HD_APPMT_1001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("appmt_cd = [" + getAppmt_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("appmt_dt_fm = [" + getAppmt_dt_fm() + "]");
		System.out.println("appmt_dt_to = [" + getAppmt_dt_to() + "]");
		System.out.println("appmt_stat_clsf = [" + getAppmt_stat_clsf() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String appmt_cd = req.getParameter("appmt_cd");
if( appmt_cd == null){
	System.out.println(this.toString+" : appmt_cd is null" );
}else{
	System.out.println(this.toString+" : appmt_cd is "+appmt_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String appmt_dt_fm = req.getParameter("appmt_dt_fm");
if( appmt_dt_fm == null){
	System.out.println(this.toString+" : appmt_dt_fm is null" );
}else{
	System.out.println(this.toString+" : appmt_dt_fm is "+appmt_dt_fm );
}
String appmt_dt_to = req.getParameter("appmt_dt_to");
if( appmt_dt_to == null){
	System.out.println(this.toString+" : appmt_dt_to is null" );
}else{
	System.out.println(this.toString+" : appmt_dt_to is "+appmt_dt_to );
}
String appmt_stat_clsf = req.getParameter("appmt_stat_clsf");
if( appmt_stat_clsf == null){
	System.out.println(this.toString+" : appmt_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : appmt_stat_clsf is "+appmt_stat_clsf );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String appmt_cd = Util.checkString(req.getParameter("appmt_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String appmt_dt_fm = Util.checkString(req.getParameter("appmt_dt_fm"));
String appmt_dt_to = Util.checkString(req.getParameter("appmt_dt_to"));
String appmt_stat_clsf = Util.checkString(req.getParameter("appmt_stat_clsf"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String appmt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String appmt_dt_fm = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_dt_fm")));
String appmt_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_dt_to")));
String appmt_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_stat_clsf")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setAppmt_cd(appmt_cd);
dm.setDept_cd(dept_cd);
dm.setAppmt_dt_fm(appmt_dt_fm);
dm.setAppmt_dt_to(appmt_dt_to);
dm.setAppmt_stat_clsf(appmt_stat_clsf);
dm.setLvcmpy_dt(lvcmpy_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 29 14:27:36 KST 2018 */