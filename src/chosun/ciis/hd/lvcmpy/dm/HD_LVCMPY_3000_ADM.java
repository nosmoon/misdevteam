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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_3000_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String estm_clsf;
	public String estm_work_dt;
	public String emp_dtls_clsf_ratio;
	public String emp_clsf_ratio;
	public String u_ipadd;
	public String u_id;

	public HD_LVCMPY_3000_ADM(){}
	public HD_LVCMPY_3000_ADM(String cmpy_cd, String estm_clsf, String estm_work_dt, String emp_dtls_clsf_ratio, String emp_clsf_ratio, String u_ipadd, String u_id){
		this.cmpy_cd = cmpy_cd;
		this.estm_clsf = estm_clsf;
		this.estm_work_dt = estm_work_dt;
		this.emp_dtls_clsf_ratio = emp_dtls_clsf_ratio;
		this.emp_clsf_ratio = emp_clsf_ratio;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEstm_clsf(String estm_clsf){
		this.estm_clsf = estm_clsf;
	}

	public void setEstm_work_dt(String estm_work_dt){
		this.estm_work_dt = estm_work_dt;
	}

	public void setEmp_dtls_clsf_ratio(String emp_dtls_clsf_ratio){
		this.emp_dtls_clsf_ratio = emp_dtls_clsf_ratio;
	}

	public void setEmp_clsf_ratio(String emp_clsf_ratio){
		this.emp_clsf_ratio = emp_clsf_ratio;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEstm_clsf(){
		return this.estm_clsf;
	}

	public String getEstm_work_dt(){
		return this.estm_work_dt;
	}

	public String getEmp_dtls_clsf_ratio(){
		return this.emp_dtls_clsf_ratio;
	}

	public String getEmp_clsf_ratio(){
		return this.emp_clsf_ratio;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_3000_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_3000_ADM dm = (HD_LVCMPY_3000_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.estm_clsf);
		cstmt.setString(5, dm.estm_work_dt);
		cstmt.setString(6, dm.emp_dtls_clsf_ratio);
		cstmt.setString(7, dm.emp_clsf_ratio);
		cstmt.setString(8, dm.u_ipadd);
		cstmt.setString(9, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_3000_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("estm_clsf = [" + getEstm_clsf() + "]");
		System.out.println("estm_work_dt = [" + getEstm_work_dt() + "]");
		System.out.println("emp_dtls_clsf_ratio = [" + getEmp_dtls_clsf_ratio() + "]");
		System.out.println("emp_clsf_ratio = [" + getEmp_clsf_ratio() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
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
String estm_clsf = req.getParameter("estm_clsf");
if( estm_clsf == null){
	System.out.println(this.toString+" : estm_clsf is null" );
}else{
	System.out.println(this.toString+" : estm_clsf is "+estm_clsf );
}
String estm_work_dt = req.getParameter("estm_work_dt");
if( estm_work_dt == null){
	System.out.println(this.toString+" : estm_work_dt is null" );
}else{
	System.out.println(this.toString+" : estm_work_dt is "+estm_work_dt );
}
String emp_dtls_clsf_ratio = req.getParameter("emp_dtls_clsf_ratio");
if( emp_dtls_clsf_ratio == null){
	System.out.println(this.toString+" : emp_dtls_clsf_ratio is null" );
}else{
	System.out.println(this.toString+" : emp_dtls_clsf_ratio is "+emp_dtls_clsf_ratio );
}
String emp_clsf_ratio = req.getParameter("emp_clsf_ratio");
if( emp_clsf_ratio == null){
	System.out.println(this.toString+" : emp_clsf_ratio is null" );
}else{
	System.out.println(this.toString+" : emp_clsf_ratio is "+emp_clsf_ratio );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String estm_clsf = Util.checkString(req.getParameter("estm_clsf"));
String estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
String emp_dtls_clsf_ratio = Util.checkString(req.getParameter("emp_dtls_clsf_ratio"));
String emp_clsf_ratio = Util.checkString(req.getParameter("emp_clsf_ratio"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String estm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("estm_clsf")));
String estm_work_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("estm_work_dt")));
String emp_dtls_clsf_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_dtls_clsf_ratio")));
String emp_clsf_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf_ratio")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEstm_clsf(estm_clsf);
dm.setEstm_work_dt(estm_work_dt);
dm.setEmp_dtls_clsf_ratio(emp_dtls_clsf_ratio);
dm.setEmp_clsf_ratio(emp_clsf_ratio);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 02 15:34:23 KST 2009 */