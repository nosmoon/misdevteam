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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2220_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_yymm;
	public String purc_adjm_clsf;
	public String reg_clsf;
	public String c_dlco_no;
	public String b_dlco_no;
	public String incmg_pers;

	public SP_SAL_2220_LDM(){}
	public SP_SAL_2220_LDM(String cmpy_cd, String work_yymm, String purc_adjm_clsf, String reg_clsf, String c_dlco_no, String b_dlco_no, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.work_yymm = work_yymm;
		this.purc_adjm_clsf = purc_adjm_clsf;
		this.reg_clsf = reg_clsf;
		this.c_dlco_no = c_dlco_no;
		this.b_dlco_no = b_dlco_no;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_yymm(String work_yymm){
		this.work_yymm = work_yymm;
	}

	public void setPurc_adjm_clsf(String purc_adjm_clsf){
		this.purc_adjm_clsf = purc_adjm_clsf;
	}

	public void setReg_clsf(String reg_clsf){
		this.reg_clsf = reg_clsf;
	}

	public void setC_dlco_no(String c_dlco_no){
		this.c_dlco_no = c_dlco_no;
	}

	public void setB_dlco_no(String b_dlco_no){
		this.b_dlco_no = b_dlco_no;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_yymm(){
		return this.work_yymm;
	}

	public String getPurc_adjm_clsf(){
		return this.purc_adjm_clsf;
	}

	public String getReg_clsf(){
		return this.reg_clsf;
	}

	public String getC_dlco_no(){
		return this.c_dlco_no;
	}

	public String getB_dlco_no(){
		return this.b_dlco_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_2220_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_2220_LDM dm = (SP_SAL_2220_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_yymm);
		cstmt.setString(5, dm.purc_adjm_clsf);
		cstmt.setString(6, dm.reg_clsf);
		cstmt.setString(7, dm.c_dlco_no);
		cstmt.setString(8, dm.b_dlco_no);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_2220_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_yymm = [" + getWork_yymm() + "]");
		System.out.println("purc_adjm_clsf = [" + getPurc_adjm_clsf() + "]");
		System.out.println("reg_clsf = [" + getReg_clsf() + "]");
		System.out.println("c_dlco_no = [" + getC_dlco_no() + "]");
		System.out.println("b_dlco_no = [" + getB_dlco_no() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String work_yymm = req.getParameter("work_yymm");
if( work_yymm == null){
	System.out.println(this.toString+" : work_yymm is null" );
}else{
	System.out.println(this.toString+" : work_yymm is "+work_yymm );
}
String purc_adjm_clsf = req.getParameter("purc_adjm_clsf");
if( purc_adjm_clsf == null){
	System.out.println(this.toString+" : purc_adjm_clsf is null" );
}else{
	System.out.println(this.toString+" : purc_adjm_clsf is "+purc_adjm_clsf );
}
String reg_clsf = req.getParameter("reg_clsf");
if( reg_clsf == null){
	System.out.println(this.toString+" : reg_clsf is null" );
}else{
	System.out.println(this.toString+" : reg_clsf is "+reg_clsf );
}
String c_dlco_no = req.getParameter("c_dlco_no");
if( c_dlco_no == null){
	System.out.println(this.toString+" : c_dlco_no is null" );
}else{
	System.out.println(this.toString+" : c_dlco_no is "+c_dlco_no );
}
String b_dlco_no = req.getParameter("b_dlco_no");
if( b_dlco_no == null){
	System.out.println(this.toString+" : b_dlco_no is null" );
}else{
	System.out.println(this.toString+" : b_dlco_no is "+b_dlco_no );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_yymm = Util.checkString(req.getParameter("work_yymm"));
String purc_adjm_clsf = Util.checkString(req.getParameter("purc_adjm_clsf"));
String reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
String c_dlco_no = Util.checkString(req.getParameter("c_dlco_no"));
String b_dlco_no = Util.checkString(req.getParameter("b_dlco_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("work_yymm")));
String purc_adjm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_adjm_clsf")));
String reg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_clsf")));
String c_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("c_dlco_no")));
String b_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("b_dlco_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_yymm(work_yymm);
dm.setPurc_adjm_clsf(purc_adjm_clsf);
dm.setReg_clsf(reg_clsf);
dm.setC_dlco_no(c_dlco_no);
dm.setB_dlco_no(b_dlco_no);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 09 14:20:25 KST 2012 */