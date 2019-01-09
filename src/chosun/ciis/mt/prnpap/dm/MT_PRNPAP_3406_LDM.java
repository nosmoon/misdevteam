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


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3406_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String issu_dt;
	public String pap_cmpy;
	public String a_sum_wgt;
	public String b_sum_wgt;
	public String c_sum_wgt;

	public MT_PRNPAP_3406_LDM(){}
	public MT_PRNPAP_3406_LDM(String cmpy_cd, String fac_clsf, String issu_dt, String pap_cmpy, String a_sum_wgt, String b_sum_wgt, String c_sum_wgt){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.issu_dt = issu_dt;
		this.pap_cmpy = pap_cmpy;
		this.a_sum_wgt = a_sum_wgt;
		this.b_sum_wgt = b_sum_wgt;
		this.c_sum_wgt = c_sum_wgt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setPap_cmpy(String pap_cmpy){
		this.pap_cmpy = pap_cmpy;
	}

	public void setA_sum_wgt(String a_sum_wgt){
		this.a_sum_wgt = a_sum_wgt;
	}

	public void setB_sum_wgt(String b_sum_wgt){
		this.b_sum_wgt = b_sum_wgt;
	}

	public void setC_sum_wgt(String c_sum_wgt){
		this.c_sum_wgt = c_sum_wgt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getPap_cmpy(){
		return this.pap_cmpy;
	}

	public String getA_sum_wgt(){
		return this.a_sum_wgt;
	}

	public String getB_sum_wgt(){
		return this.b_sum_wgt;
	}

	public String getC_sum_wgt(){
		return this.c_sum_wgt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_3406_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3406_LDM dm = (MT_PRNPAP_3406_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.issu_dt);
		cstmt.setString(6, dm.pap_cmpy);
		cstmt.setString(7, dm.a_sum_wgt);
		cstmt.setString(8, dm.b_sum_wgt);
		cstmt.setString(9, dm.c_sum_wgt);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3406_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("pap_cmpy = [" + getPap_cmpy() + "]");
		System.out.println("a_sum_wgt = [" + getA_sum_wgt() + "]");
		System.out.println("b_sum_wgt = [" + getB_sum_wgt() + "]");
		System.out.println("c_sum_wgt = [" + getC_sum_wgt() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String pap_cmpy = req.getParameter("pap_cmpy");
if( pap_cmpy == null){
	System.out.println(this.toString+" : pap_cmpy is null" );
}else{
	System.out.println(this.toString+" : pap_cmpy is "+pap_cmpy );
}
String a_sum_wgt = req.getParameter("a_sum_wgt");
if( a_sum_wgt == null){
	System.out.println(this.toString+" : a_sum_wgt is null" );
}else{
	System.out.println(this.toString+" : a_sum_wgt is "+a_sum_wgt );
}
String b_sum_wgt = req.getParameter("b_sum_wgt");
if( b_sum_wgt == null){
	System.out.println(this.toString+" : b_sum_wgt is null" );
}else{
	System.out.println(this.toString+" : b_sum_wgt is "+b_sum_wgt );
}
String c_sum_wgt = req.getParameter("c_sum_wgt");
if( c_sum_wgt == null){
	System.out.println(this.toString+" : c_sum_wgt is null" );
}else{
	System.out.println(this.toString+" : c_sum_wgt is "+c_sum_wgt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String pap_cmpy = Util.checkString(req.getParameter("pap_cmpy"));
String a_sum_wgt = Util.checkString(req.getParameter("a_sum_wgt"));
String b_sum_wgt = Util.checkString(req.getParameter("b_sum_wgt"));
String c_sum_wgt = Util.checkString(req.getParameter("c_sum_wgt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String pap_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("pap_cmpy")));
String a_sum_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_sum_wgt")));
String b_sum_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("b_sum_wgt")));
String c_sum_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_sum_wgt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setIssu_dt(issu_dt);
dm.setPap_cmpy(pap_cmpy);
dm.setA_sum_wgt(a_sum_wgt);
dm.setB_sum_wgt(b_sum_wgt);
dm.setC_sum_wgt(c_sum_wgt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 29 19:39:00 KST 2009 */