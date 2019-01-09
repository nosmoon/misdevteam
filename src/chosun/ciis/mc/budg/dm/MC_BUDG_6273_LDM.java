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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6273_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bulen;
	public String buzero;
	public String tms1;
	public String cls_cd;
	public String budg_yy;
	public String budg_cd;
	public String dept_cd;
	public String tms2;

	public MC_BUDG_6273_LDM(){}
	public MC_BUDG_6273_LDM(String cmpy_cd, String bulen, String buzero, String tms1, String cls_cd, String budg_yy, String budg_cd, String dept_cd, String tms2){
		this.cmpy_cd = cmpy_cd;
		this.bulen = bulen;
		this.buzero = buzero;
		this.tms1 = tms1;
		this.cls_cd = cls_cd;
		this.budg_yy = budg_yy;
		this.budg_cd = budg_cd;
		this.dept_cd = dept_cd;
		this.tms2 = tms2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBulen(String bulen){
		this.bulen = bulen;
	}

	public void setBuzero(String buzero){
		this.buzero = buzero;
	}

	public void setTms1(String tms1){
		this.tms1 = tms1;
	}

	public void setCls_cd(String cls_cd){
		this.cls_cd = cls_cd;
	}

	public void setBudg_yy(String budg_yy){
		this.budg_yy = budg_yy;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setTms2(String tms2){
		this.tms2 = tms2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBulen(){
		return this.bulen;
	}

	public String getBuzero(){
		return this.buzero;
	}

	public String getTms1(){
		return this.tms1;
	}

	public String getCls_cd(){
		return this.cls_cd;
	}

	public String getBudg_yy(){
		return this.budg_yy;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getTms2(){
		return this.tms2;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6273_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6273_LDM dm = (MC_BUDG_6273_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bulen);
		cstmt.setString(5, dm.buzero);
		cstmt.setString(6, dm.tms1);
		cstmt.setString(7, dm.cls_cd);
		cstmt.setString(8, dm.budg_yy);
		cstmt.setString(9, dm.budg_cd);
		cstmt.setString(10, dm.dept_cd);
		cstmt.setString(11, dm.tms2);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6273_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bulen = [" + getBulen() + "]");
		System.out.println("buzero = [" + getBuzero() + "]");
		System.out.println("tms1 = [" + getTms1() + "]");
		System.out.println("cls_cd = [" + getCls_cd() + "]");
		System.out.println("budg_yy = [" + getBudg_yy() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("tms2 = [" + getTms2() + "]");
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
String bulen = req.getParameter("bulen");
if( bulen == null){
	System.out.println(this.toString+" : bulen is null" );
}else{
	System.out.println(this.toString+" : bulen is "+bulen );
}
String buzero = req.getParameter("buzero");
if( buzero == null){
	System.out.println(this.toString+" : buzero is null" );
}else{
	System.out.println(this.toString+" : buzero is "+buzero );
}
String tms1 = req.getParameter("tms1");
if( tms1 == null){
	System.out.println(this.toString+" : tms1 is null" );
}else{
	System.out.println(this.toString+" : tms1 is "+tms1 );
}
String cls_cd = req.getParameter("cls_cd");
if( cls_cd == null){
	System.out.println(this.toString+" : cls_cd is null" );
}else{
	System.out.println(this.toString+" : cls_cd is "+cls_cd );
}
String budg_yy = req.getParameter("budg_yy");
if( budg_yy == null){
	System.out.println(this.toString+" : budg_yy is null" );
}else{
	System.out.println(this.toString+" : budg_yy is "+budg_yy );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String tms2 = req.getParameter("tms2");
if( tms2 == null){
	System.out.println(this.toString+" : tms2 is null" );
}else{
	System.out.println(this.toString+" : tms2 is "+tms2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bulen = Util.checkString(req.getParameter("bulen"));
String buzero = Util.checkString(req.getParameter("buzero"));
String tms1 = Util.checkString(req.getParameter("tms1"));
String cls_cd = Util.checkString(req.getParameter("cls_cd"));
String budg_yy = Util.checkString(req.getParameter("budg_yy"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String tms2 = Util.checkString(req.getParameter("tms2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bulen = Util.Uni2Ksc(Util.checkString(req.getParameter("bulen")));
String buzero = Util.Uni2Ksc(Util.checkString(req.getParameter("buzero")));
String tms1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tms1")));
String cls_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cls_cd")));
String budg_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yy")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String tms2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tms2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBulen(bulen);
dm.setBuzero(buzero);
dm.setTms1(tms1);
dm.setCls_cd(cls_cd);
dm.setBudg_yy(budg_yy);
dm.setBudg_cd(budg_cd);
dm.setDept_cd(dept_cd);
dm.setTms2(tms2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 13 12:09:14 KST 2009 */