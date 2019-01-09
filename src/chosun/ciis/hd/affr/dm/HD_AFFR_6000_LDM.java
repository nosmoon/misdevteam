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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_6000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String emp_no;
	public String cmpy_cd;
	public String st_aplc_dt;
	public String en_aplc_dt;
	public String certi_clsf;
	public String issu_clsf;

	public HD_AFFR_6000_LDM(){}
	public HD_AFFR_6000_LDM(String emp_no, String cmpy_cd, String st_aplc_dt, String en_aplc_dt, String certi_clsf, String issu_clsf){
		this.emp_no = emp_no;
		this.cmpy_cd = cmpy_cd;
		this.st_aplc_dt = st_aplc_dt;
		this.en_aplc_dt = en_aplc_dt;
		this.certi_clsf = certi_clsf;
		this.issu_clsf = issu_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSt_aplc_dt(String st_aplc_dt){
		this.st_aplc_dt = st_aplc_dt;
	}

	public void setEn_aplc_dt(String en_aplc_dt){
		this.en_aplc_dt = en_aplc_dt;
	}

	public void setCerti_clsf(String certi_clsf){
		this.certi_clsf = certi_clsf;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSt_aplc_dt(){
		return this.st_aplc_dt;
	}

	public String getEn_aplc_dt(){
		return this.en_aplc_dt;
	}

	public String getCerti_clsf(){
		return this.certi_clsf;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_6000_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_6000_LDM dm = (HD_AFFR_6000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.emp_no);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.st_aplc_dt);
		cstmt.setString(6, dm.en_aplc_dt);
		cstmt.setString(7, dm.certi_clsf);
		cstmt.setString(8, dm.issu_clsf);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_AFFR_6000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("st_aplc_dt = [" + getSt_aplc_dt() + "]");
		System.out.println("en_aplc_dt = [" + getEn_aplc_dt() + "]");
		System.out.println("certi_clsf = [" + getCerti_clsf() + "]");
		System.out.println("issu_clsf = [" + getIssu_clsf() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String st_aplc_dt = req.getParameter("st_aplc_dt");
if( st_aplc_dt == null){
	System.out.println(this.toString+" : st_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : st_aplc_dt is "+st_aplc_dt );
}
String en_aplc_dt = req.getParameter("en_aplc_dt");
if( en_aplc_dt == null){
	System.out.println(this.toString+" : en_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : en_aplc_dt is "+en_aplc_dt );
}
String certi_clsf = req.getParameter("certi_clsf");
if( certi_clsf == null){
	System.out.println(this.toString+" : certi_clsf is null" );
}else{
	System.out.println(this.toString+" : certi_clsf is "+certi_clsf );
}
String issu_clsf = req.getParameter("issu_clsf");
if( issu_clsf == null){
	System.out.println(this.toString+" : issu_clsf is null" );
}else{
	System.out.println(this.toString+" : issu_clsf is "+issu_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.checkString(req.getParameter("emp_no"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String st_aplc_dt = Util.checkString(req.getParameter("st_aplc_dt"));
String en_aplc_dt = Util.checkString(req.getParameter("en_aplc_dt"));
String certi_clsf = Util.checkString(req.getParameter("certi_clsf"));
String issu_clsf = Util.checkString(req.getParameter("issu_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String st_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_aplc_dt")));
String en_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("en_aplc_dt")));
String certi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("certi_clsf")));
String issu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setEmp_no(emp_no);
dm.setCmpy_cd(cmpy_cd);
dm.setSt_aplc_dt(st_aplc_dt);
dm.setEn_aplc_dt(en_aplc_dt);
dm.setCerti_clsf(certi_clsf);
dm.setIssu_clsf(issu_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 07 13:35:28 KST 2009 */