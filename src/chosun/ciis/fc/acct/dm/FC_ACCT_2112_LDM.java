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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2112_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String supr_dept_cd;
	public String dept_cd;
	public String sply_basi_cd;
	public String incmg_pers;

	public FC_ACCT_2112_LDM(){}
	public FC_ACCT_2112_LDM(String cmpy_cd, String yymm, String supr_dept_cd, String dept_cd, String sply_basi_cd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.supr_dept_cd = supr_dept_cd;
		this.dept_cd = dept_cd;
		this.sply_basi_cd = sply_basi_cd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSply_basi_cd(String sply_basi_cd){
		this.sply_basi_cd = sply_basi_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSply_basi_cd(){
		return this.sply_basi_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2112_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2112_LDM dm = (FC_ACCT_2112_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.supr_dept_cd);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.sply_basi_cd);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2112_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("supr_dept_cd = [" + getSupr_dept_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sply_basi_cd = [" + getSply_basi_cd() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String supr_dept_cd = req.getParameter("supr_dept_cd");
if( supr_dept_cd == null){
	System.out.println(this.toString+" : supr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : supr_dept_cd is "+supr_dept_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sply_basi_cd = req.getParameter("sply_basi_cd");
if( sply_basi_cd == null){
	System.out.println(this.toString+" : sply_basi_cd is null" );
}else{
	System.out.println(this.toString+" : sply_basi_cd is "+sply_basi_cd );
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
String yymm = Util.checkString(req.getParameter("yymm"));
String supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sply_basi_cd = Util.checkString(req.getParameter("sply_basi_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String supr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("supr_dept_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sply_basi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_basi_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setSupr_dept_cd(supr_dept_cd);
dm.setDept_cd(dept_cd);
dm.setSply_basi_cd(sply_basi_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 22 18:09:19 KST 2013 */