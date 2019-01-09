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


package chosun.ciis.mt.submatrcla.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.ds.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_3201_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String occr_dt_fr;
	public String occr_dt_to;
	public String clam_actu_cd;
	public String res_yn;

	public MT_SUBMATRCLA_3201_LDM(){}
	public MT_SUBMATRCLA_3201_LDM(String cmpy_cd, String dept_cd, String occr_dt_fr, String occr_dt_to, String clam_actu_cd, String res_yn){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.occr_dt_fr = occr_dt_fr;
		this.occr_dt_to = occr_dt_to;
		this.clam_actu_cd = clam_actu_cd;
		this.res_yn = res_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setOccr_dt_fr(String occr_dt_fr){
		this.occr_dt_fr = occr_dt_fr;
	}

	public void setOccr_dt_to(String occr_dt_to){
		this.occr_dt_to = occr_dt_to;
	}

	public void setClam_actu_cd(String clam_actu_cd){
		this.clam_actu_cd = clam_actu_cd;
	}

	public void setRes_yn(String res_yn){
		this.res_yn = res_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getOccr_dt_fr(){
		return this.occr_dt_fr;
	}

	public String getOccr_dt_to(){
		return this.occr_dt_to;
	}

	public String getClam_actu_cd(){
		return this.clam_actu_cd;
	}

	public String getRes_yn(){
		return this.res_yn;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_3201_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_3201_LDM dm = (MT_SUBMATRCLA_3201_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.occr_dt_fr);
		cstmt.setString(6, dm.occr_dt_to);
		cstmt.setString(7, dm.clam_actu_cd);
		cstmt.setString(8, dm.res_yn);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_3201_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("occr_dt_fr = [" + getOccr_dt_fr() + "]");
		System.out.println("occr_dt_to = [" + getOccr_dt_to() + "]");
		System.out.println("clam_actu_cd = [" + getClam_actu_cd() + "]");
		System.out.println("res_yn = [" + getRes_yn() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String occr_dt_fr = req.getParameter("occr_dt_fr");
if( occr_dt_fr == null){
	System.out.println(this.toString+" : occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : occr_dt_fr is "+occr_dt_fr );
}
String occr_dt_to = req.getParameter("occr_dt_to");
if( occr_dt_to == null){
	System.out.println(this.toString+" : occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : occr_dt_to is "+occr_dt_to );
}
String clam_actu_cd = req.getParameter("clam_actu_cd");
if( clam_actu_cd == null){
	System.out.println(this.toString+" : clam_actu_cd is null" );
}else{
	System.out.println(this.toString+" : clam_actu_cd is "+clam_actu_cd );
}
String res_yn = req.getParameter("res_yn");
if( res_yn == null){
	System.out.println(this.toString+" : res_yn is null" );
}else{
	System.out.println(this.toString+" : res_yn is "+res_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
String clam_actu_cd = Util.checkString(req.getParameter("clam_actu_cd"));
String res_yn = Util.checkString(req.getParameter("res_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_fr")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
String clam_actu_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_actu_cd")));
String res_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("res_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setOccr_dt_fr(occr_dt_fr);
dm.setOccr_dt_to(occr_dt_to);
dm.setClam_actu_cd(clam_actu_cd);
dm.setRes_yn(res_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 15:29:40 KST 2015 */