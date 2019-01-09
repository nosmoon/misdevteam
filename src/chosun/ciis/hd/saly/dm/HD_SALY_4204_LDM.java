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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4204_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String adv_clsf;
	public String adv_dt;
	public String st_dduc_dt;
	public String et_dduc_dt;

	public HD_SALY_4204_LDM(){}
	public HD_SALY_4204_LDM(String cmpy_cd, String emp_no, String adv_clsf, String adv_dt, String st_dduc_dt, String et_dduc_dt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.adv_clsf = adv_clsf;
		this.adv_dt = adv_dt;
		this.st_dduc_dt = st_dduc_dt;
		this.et_dduc_dt = et_dduc_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAdv_clsf(String adv_clsf){
		this.adv_clsf = adv_clsf;
	}

	public void setAdv_dt(String adv_dt){
		this.adv_dt = adv_dt;
	}

	public void setSt_dduc_dt(String st_dduc_dt){
		this.st_dduc_dt = st_dduc_dt;
	}

	public void setEt_dduc_dt(String et_dduc_dt){
		this.et_dduc_dt = et_dduc_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAdv_clsf(){
		return this.adv_clsf;
	}

	public String getAdv_dt(){
		return this.adv_dt;
	}

	public String getSt_dduc_dt(){
		return this.st_dduc_dt;
	}

	public String getEt_dduc_dt(){
		return this.et_dduc_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4204_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4204_LDM dm = (HD_SALY_4204_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.adv_clsf);
		cstmt.setString(6, dm.adv_dt);
		cstmt.setString(7, dm.st_dduc_dt);
		cstmt.setString(8, dm.et_dduc_dt);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4204_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("adv_clsf = [" + getAdv_clsf() + "]");
		System.out.println("adv_dt = [" + getAdv_dt() + "]");
		System.out.println("st_dduc_dt = [" + getSt_dduc_dt() + "]");
		System.out.println("et_dduc_dt = [" + getEt_dduc_dt() + "]");
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
String adv_clsf = req.getParameter("adv_clsf");
if( adv_clsf == null){
	System.out.println(this.toString+" : adv_clsf is null" );
}else{
	System.out.println(this.toString+" : adv_clsf is "+adv_clsf );
}
String adv_dt = req.getParameter("adv_dt");
if( adv_dt == null){
	System.out.println(this.toString+" : adv_dt is null" );
}else{
	System.out.println(this.toString+" : adv_dt is "+adv_dt );
}
String st_dduc_dt = req.getParameter("st_dduc_dt");
if( st_dduc_dt == null){
	System.out.println(this.toString+" : st_dduc_dt is null" );
}else{
	System.out.println(this.toString+" : st_dduc_dt is "+st_dduc_dt );
}
String et_dduc_dt = req.getParameter("et_dduc_dt");
if( et_dduc_dt == null){
	System.out.println(this.toString+" : et_dduc_dt is null" );
}else{
	System.out.println(this.toString+" : et_dduc_dt is "+et_dduc_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String adv_clsf = Util.checkString(req.getParameter("adv_clsf"));
String adv_dt = Util.checkString(req.getParameter("adv_dt"));
String st_dduc_dt = Util.checkString(req.getParameter("st_dduc_dt"));
String et_dduc_dt = Util.checkString(req.getParameter("et_dduc_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String adv_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_clsf")));
String adv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_dt")));
String st_dduc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_dduc_dt")));
String et_dduc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("et_dduc_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setAdv_clsf(adv_clsf);
dm.setAdv_dt(adv_dt);
dm.setSt_dduc_dt(st_dduc_dt);
dm.setEt_dduc_dt(et_dduc_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 10:44:46 KST 2009 */