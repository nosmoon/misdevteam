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


public class MC_COST_3072_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clas_len;
	public String clas_zero;
	public String dept_len;
	public String dept_zero;
	public String yymm_fr;
	public String yymm_to;
	public String dept_cd2;
	public String fix_yn;

	public MC_COST_3072_LDM(){}
	public MC_COST_3072_LDM(String cmpy_cd, String clas_len, String clas_zero, String dept_len, String dept_zero, String yymm_fr, String yymm_to, String dept_cd2, String fix_yn){
		this.cmpy_cd = cmpy_cd;
		this.clas_len = clas_len;
		this.clas_zero = clas_zero;
		this.dept_len = dept_len;
		this.dept_zero = dept_zero;
		this.yymm_fr = yymm_fr;
		this.yymm_to = yymm_to;
		this.dept_cd2 = dept_cd2;
		this.fix_yn = fix_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClas_len(String clas_len){
		this.clas_len = clas_len;
	}

	public void setClas_zero(String clas_zero){
		this.clas_zero = clas_zero;
	}

	public void setDept_len(String dept_len){
		this.dept_len = dept_len;
	}

	public void setDept_zero(String dept_zero){
		this.dept_zero = dept_zero;
	}

	public void setYymm_fr(String yymm_fr){
		this.yymm_fr = yymm_fr;
	}

	public void setYymm_to(String yymm_to){
		this.yymm_to = yymm_to;
	}

	public void setDept_cd2(String dept_cd2){
		this.dept_cd2 = dept_cd2;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClas_len(){
		return this.clas_len;
	}

	public String getClas_zero(){
		return this.clas_zero;
	}

	public String getDept_len(){
		return this.dept_len;
	}

	public String getDept_zero(){
		return this.dept_zero;
	}

	public String getYymm_fr(){
		return this.yymm_fr;
	}

	public String getYymm_to(){
		return this.yymm_to;
	}

	public String getDept_cd2(){
		return this.dept_cd2;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_3072_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_3072_LDM dm = (MC_COST_3072_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clas_len);
		cstmt.setString(5, dm.clas_zero);
		cstmt.setString(6, dm.dept_len);
		cstmt.setString(7, dm.dept_zero);
		cstmt.setString(8, dm.yymm_fr);
		cstmt.setString(9, dm.yymm_to);
		cstmt.setString(10, dm.dept_cd2);
		cstmt.setString(11, dm.fix_yn);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_3072_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clas_len = [" + getClas_len() + "]");
		System.out.println("clas_zero = [" + getClas_zero() + "]");
		System.out.println("dept_len = [" + getDept_len() + "]");
		System.out.println("dept_zero = [" + getDept_zero() + "]");
		System.out.println("yymm_fr = [" + getYymm_fr() + "]");
		System.out.println("yymm_to = [" + getYymm_to() + "]");
		System.out.println("dept_cd2 = [" + getDept_cd2() + "]");
		System.out.println("fix_yn = [" + getFix_yn() + "]");
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
String clas_len = req.getParameter("clas_len");
if( clas_len == null){
	System.out.println(this.toString+" : clas_len is null" );
}else{
	System.out.println(this.toString+" : clas_len is "+clas_len );
}
String clas_zero = req.getParameter("clas_zero");
if( clas_zero == null){
	System.out.println(this.toString+" : clas_zero is null" );
}else{
	System.out.println(this.toString+" : clas_zero is "+clas_zero );
}
String dept_len = req.getParameter("dept_len");
if( dept_len == null){
	System.out.println(this.toString+" : dept_len is null" );
}else{
	System.out.println(this.toString+" : dept_len is "+dept_len );
}
String dept_zero = req.getParameter("dept_zero");
if( dept_zero == null){
	System.out.println(this.toString+" : dept_zero is null" );
}else{
	System.out.println(this.toString+" : dept_zero is "+dept_zero );
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
String dept_cd2 = req.getParameter("dept_cd2");
if( dept_cd2 == null){
	System.out.println(this.toString+" : dept_cd2 is null" );
}else{
	System.out.println(this.toString+" : dept_cd2 is "+dept_cd2 );
}
String fix_yn = req.getParameter("fix_yn");
if( fix_yn == null){
	System.out.println(this.toString+" : fix_yn is null" );
}else{
	System.out.println(this.toString+" : fix_yn is "+fix_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clas_len = Util.checkString(req.getParameter("clas_len"));
String clas_zero = Util.checkString(req.getParameter("clas_zero"));
String dept_len = Util.checkString(req.getParameter("dept_len"));
String dept_zero = Util.checkString(req.getParameter("dept_zero"));
String yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
String yymm_to = Util.checkString(req.getParameter("yymm_to"));
String dept_cd2 = Util.checkString(req.getParameter("dept_cd2"));
String fix_yn = Util.checkString(req.getParameter("fix_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clas_len = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_len")));
String clas_zero = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_zero")));
String dept_len = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_len")));
String dept_zero = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_zero")));
String yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_fr")));
String yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_to")));
String dept_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd2")));
String fix_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClas_len(clas_len);
dm.setClas_zero(clas_zero);
dm.setDept_len(dept_len);
dm.setDept_zero(dept_zero);
dm.setYymm_fr(yymm_fr);
dm.setYymm_to(yymm_to);
dm.setDept_cd2(dept_cd2);
dm.setFix_yn(fix_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 16:08:35 KST 2009 */