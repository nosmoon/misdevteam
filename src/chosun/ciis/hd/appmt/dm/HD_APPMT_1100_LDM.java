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


public class HD_APPMT_1100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String appmt_dt_fr;
	public String appmt_dt_to;
	public String cmpy_cd;
	public String appmt_stat_clsf;
	public String emp_no;

	public HD_APPMT_1100_LDM(){}
	public HD_APPMT_1100_LDM(String appmt_dt_fr, String appmt_dt_to, String cmpy_cd, String appmt_stat_clsf, String emp_no){
		this.appmt_dt_fr = appmt_dt_fr;
		this.appmt_dt_to = appmt_dt_to;
		this.cmpy_cd = cmpy_cd;
		this.appmt_stat_clsf = appmt_stat_clsf;
		this.emp_no = emp_no;
	}

	public void setAppmt_dt_fr(String appmt_dt_fr){
		this.appmt_dt_fr = appmt_dt_fr;
	}

	public void setAppmt_dt_to(String appmt_dt_to){
		this.appmt_dt_to = appmt_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAppmt_stat_clsf(String appmt_stat_clsf){
		this.appmt_stat_clsf = appmt_stat_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getAppmt_dt_fr(){
		return this.appmt_dt_fr;
	}

	public String getAppmt_dt_to(){
		return this.appmt_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAppmt_stat_clsf(){
		return this.appmt_stat_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_APPMT_1100_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_APPMT_1100_LDM dm = (HD_APPMT_1100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.appmt_dt_fr);
		cstmt.setString(4, dm.appmt_dt_to);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.appmt_stat_clsf);
		cstmt.setString(7, dm.emp_no);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.appmt.ds.HD_APPMT_1100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("appmt_dt_fr = [" + getAppmt_dt_fr() + "]");
		System.out.println("appmt_dt_to = [" + getAppmt_dt_to() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("appmt_stat_clsf = [" + getAppmt_stat_clsf() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String appmt_stat_clsf = req.getParameter("appmt_stat_clsf");
if( appmt_stat_clsf == null){
	System.out.println(this.toString+" : appmt_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : appmt_stat_clsf is "+appmt_stat_clsf );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String appmt_dt_fr = Util.checkString(req.getParameter("appmt_dt_fr"));
String appmt_dt_to = Util.checkString(req.getParameter("appmt_dt_to"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String appmt_stat_clsf = Util.checkString(req.getParameter("appmt_stat_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String appmt_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_dt_fr")));
String appmt_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_dt_to")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String appmt_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_stat_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAppmt_dt_fr(appmt_dt_fr);
dm.setAppmt_dt_to(appmt_dt_to);
dm.setCmpy_cd(cmpy_cd);
dm.setAppmt_stat_clsf(appmt_stat_clsf);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 20 16:31:05 KST 2012 */