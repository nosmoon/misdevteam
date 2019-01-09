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


public class MC_BUDG_6055_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bulen;
	public String buzero;
	public String beyymm;
	public String wayymm;
	public String budg_yymm;
	public String dept_cd;
	public String tms;

	public MC_BUDG_6055_LDM(){}
	public MC_BUDG_6055_LDM(String cmpy_cd, String bulen, String buzero, String beyymm, String wayymm, String budg_yymm, String dept_cd, String tms){
		this.cmpy_cd = cmpy_cd;
		this.bulen = bulen;
		this.buzero = buzero;
		this.beyymm = beyymm;
		this.wayymm = wayymm;
		this.budg_yymm = budg_yymm;
		this.dept_cd = dept_cd;
		this.tms = tms;
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

	public void setBeyymm(String beyymm){
		this.beyymm = beyymm;
	}

	public void setWayymm(String wayymm){
		this.wayymm = wayymm;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setTms(String tms){
		this.tms = tms;
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

	public String getBeyymm(){
		return this.beyymm;
	}

	public String getWayymm(){
		return this.wayymm;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6055_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6055_LDM dm = (MC_BUDG_6055_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bulen);
		cstmt.setString(5, dm.buzero);
		cstmt.setString(6, dm.beyymm);
		cstmt.setString(7, dm.wayymm);
		cstmt.setString(8, dm.budg_yymm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.tms);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6055_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bulen = [" + getBulen() + "]");
		System.out.println("buzero = [" + getBuzero() + "]");
		System.out.println("beyymm = [" + getBeyymm() + "]");
		System.out.println("wayymm = [" + getWayymm() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("tms = [" + getTms() + "]");
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
String beyymm = req.getParameter("beyymm");
if( beyymm == null){
	System.out.println(this.toString+" : beyymm is null" );
}else{
	System.out.println(this.toString+" : beyymm is "+beyymm );
}
String wayymm = req.getParameter("wayymm");
if( wayymm == null){
	System.out.println(this.toString+" : wayymm is null" );
}else{
	System.out.println(this.toString+" : wayymm is "+wayymm );
}
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bulen = Util.checkString(req.getParameter("bulen"));
String buzero = Util.checkString(req.getParameter("buzero"));
String beyymm = Util.checkString(req.getParameter("beyymm"));
String wayymm = Util.checkString(req.getParameter("wayymm"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String tms = Util.checkString(req.getParameter("tms"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bulen = Util.Uni2Ksc(Util.checkString(req.getParameter("bulen")));
String buzero = Util.Uni2Ksc(Util.checkString(req.getParameter("buzero")));
String beyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("beyymm")));
String wayymm = Util.Uni2Ksc(Util.checkString(req.getParameter("wayymm")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBulen(bulen);
dm.setBuzero(buzero);
dm.setBeyymm(beyymm);
dm.setWayymm(wayymm);
dm.setBudg_yymm(budg_yymm);
dm.setDept_cd(dept_cd);
dm.setTms(tms);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 12 16:18:06 KST 2009 */