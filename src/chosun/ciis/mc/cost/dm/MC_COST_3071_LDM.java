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


package chosun.ciis.mc.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.ds.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_3071_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm_fr;
	public String yymm_to;
	public String fix_yn;
	public String dept_cd;
	public long dept_len;

	public MC_COST_3071_LDM(){}
	public MC_COST_3071_LDM(String cmpy_cd, String yymm_fr, String yymm_to, String fix_yn, String dept_cd, long dept_len){
		this.cmpy_cd = cmpy_cd;
		this.yymm_fr = yymm_fr;
		this.yymm_to = yymm_to;
		this.fix_yn = fix_yn;
		this.dept_cd = dept_cd;
		this.dept_len = dept_len;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm_fr(String yymm_fr){
		this.yymm_fr = yymm_fr;
	}

	public void setYymm_to(String yymm_to){
		this.yymm_to = yymm_to;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_len(long dept_len){
		this.dept_len = dept_len;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm_fr(){
		return this.yymm_fr;
	}

	public String getYymm_to(){
		return this.yymm_to;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public long getDept_len(){
		return this.dept_len;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_3071_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_3071_LDM dm = (MC_COST_3071_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm_fr);
		cstmt.setString(5, dm.yymm_to);
		cstmt.setString(6, dm.fix_yn);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setLong(8, dm.dept_len);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_3071_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm_fr = [" + getYymm_fr() + "]");
		System.out.println("yymm_to = [" + getYymm_to() + "]");
		System.out.println("fix_yn = [" + getFix_yn() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dept_len = [" + getDept_len() + "]");
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
String yymm_fr = req.getParameter("yymm_fr");
if( yymm_fr == null){
	System.out.println(this.toString+" : yymm_fr is null" );
}else{
	System.out.println(this.toString+" : yymm_fr is "+yymm_fr );
}
String yymm_to = req.getParameter("yymm_to");
if( yymm_to == null){
	System.out.println(this.toString+" : yymm_to is null" );
}else{
	System.out.println(this.toString+" : yymm_to is "+yymm_to );
}
String fix_yn = req.getParameter("fix_yn");
if( fix_yn == null){
	System.out.println(this.toString+" : fix_yn is null" );
}else{
	System.out.println(this.toString+" : fix_yn is "+fix_yn );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dept_len = req.getParameter("dept_len");
if( dept_len == null){
	System.out.println(this.toString+" : dept_len is null" );
}else{
	System.out.println(this.toString+" : dept_len is "+dept_len );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
String yymm_to = Util.checkString(req.getParameter("yymm_to"));
String fix_yn = Util.checkString(req.getParameter("fix_yn"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dept_len = Util.checkString(req.getParameter("dept_len"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_fr")));
String yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_to")));
String fix_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_yn")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dept_len = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_len")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm_fr(yymm_fr);
dm.setYymm_to(yymm_to);
dm.setFix_yn(fix_yn);
dm.setDept_cd(dept_cd);
dm.setDept_len(dept_len);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 21 14:58:55 KST 2009 */