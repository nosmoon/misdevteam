

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


public class HD_APPMT_1300_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_proc_yn;
	public String appmt_dt_fr;
	public String appmt_dt_to;
	public String emp_no;
	public String nm_korn;
	
	public HD_APPMT_1300_LDM(){}
	public HD_APPMT_1300_LDM(String cmpy_cd, String clos_proc_yn, String appmt_dt_fr, String appmt_dt_to, String emp_no, String nm_korn){
		this.cmpy_cd = cmpy_cd;
		this.clos_proc_yn = clos_proc_yn;
		this.appmt_dt_fr = appmt_dt_fr;
		this.appmt_dt_to = appmt_dt_to;
		this.emp_no = emp_no;
		this.nm_korn = nm_korn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_proc_yn(String clos_proc_yn){
		this.clos_proc_yn = clos_proc_yn;
	}

	public void setAppmt_dt_fr(String appmt_dt_fr){
		this.appmt_dt_fr = appmt_dt_fr;
	}

	public void setAppmt_dt_to(String appmt_dt_to){
		this.appmt_dt_to = appmt_dt_to;
	}
	
	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_proc_yn(){
		return this.clos_proc_yn;
	}

	public String getAppmt_dt_fr(){
		return this.appmt_dt_fr;
	}

	public String getAppmt_dt_to(){
		return this.appmt_dt_to;
	}
	
	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_APPMT_1300_L(? ,? ,? ,? ,? ,? ,?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_APPMT_1300_LDM dm = (HD_APPMT_1300_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_proc_yn);
		cstmt.setString(5, dm.appmt_dt_fr);
		cstmt.setString(6, dm.appmt_dt_to);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.nm_korn);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_APPMT_1300_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_proc_yn = [" + getClos_proc_yn() + "]");
		System.out.println("appmt_dt_fr = [" + getAppmt_dt_fr() + "]");
		System.out.println("appmt_dt_to = [" + getAppmt_dt_to() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("nm_korn = [" + getNm_korn() + "]");
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
String clos_proc_yn = req.getParameter("clos_proc_yn");
if( clos_proc_yn == null){
	System.out.println(this.toString+" : clos_proc_yn is null" );
}else{
	System.out.println(this.toString+" : clos_proc_yn is "+clos_proc_yn );
}
String appmt_dt_fr = req.getParameter("appmt_dt_fr");
if( appmt_dt_fr == null){
	System.out.println(this.toString+" : appmt_dt_fr is null" );
}else{
	System.out.println(this.toString+" : appmt_dt_fr is "+appmt_dt_fr );
}
String appmt_dt_to = req.getParameter("appmt_dt_to");
if( appmt_dt_to == null){
	System.out.println(this.toString+" : appmt_dt_to is null" );
}else{
	System.out.println(this.toString+" : appmt_dt_to is "+appmt_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_proc_yn = Util.checkString(req.getParameter("clos_proc_yn"));
String appmt_dt_fr = Util.checkString(req.getParameter("appmt_dt_fr"));
String appmt_dt_to = Util.checkString(req.getParameter("appmt_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_proc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_proc_yn")));
String appmt_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_dt_fr")));
String appmt_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_proc_yn(clos_proc_yn);
dm.setAppmt_dt_fr(appmt_dt_fr);
dm.setAppmt_dt_to(appmt_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 28 14:27:19 KST 2010 */