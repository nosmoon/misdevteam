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


public class MC_BUDG_4120_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String proc_yymm;
	public String chg_prv_dept_cd;
	public String chg_aft_dept_cd;

	public MC_BUDG_4120_IDM(){}
	public MC_BUDG_4120_IDM(String cmpy_cd, String incmg_pers, String incmg_pers_ipadd, String proc_yymm, String chg_prv_dept_cd, String chg_aft_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.proc_yymm = proc_yymm;
		this.chg_prv_dept_cd = chg_prv_dept_cd;
		this.chg_aft_dept_cd = chg_aft_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setProc_yymm(String proc_yymm){
		this.proc_yymm = proc_yymm;
	}

	public void setChg_prv_dept_cd(String chg_prv_dept_cd){
		this.chg_prv_dept_cd = chg_prv_dept_cd;
	}

	public void setChg_aft_dept_cd(String chg_aft_dept_cd){
		this.chg_aft_dept_cd = chg_aft_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getProc_yymm(){
		return this.proc_yymm;
	}

	public String getChg_prv_dept_cd(){
		return this.chg_prv_dept_cd;
	}

	public String getChg_aft_dept_cd(){
		return this.chg_aft_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4120_I(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4120_IDM dm = (MC_BUDG_4120_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ipadd);
		cstmt.setString(6, dm.proc_yymm);
		cstmt.setString(7, dm.chg_prv_dept_cd);
		cstmt.setString(8, dm.chg_aft_dept_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4120_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("proc_yymm = [" + getProc_yymm() + "]");
		System.out.println("chg_prv_dept_cd = [" + getChg_prv_dept_cd() + "]");
		System.out.println("chg_aft_dept_cd = [" + getChg_aft_dept_cd() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String proc_yymm = req.getParameter("proc_yymm");
if( proc_yymm == null){
	System.out.println(this.toString+" : proc_yymm is null" );
}else{
	System.out.println(this.toString+" : proc_yymm is "+proc_yymm );
}
String chg_prv_dept_cd = req.getParameter("chg_prv_dept_cd");
if( chg_prv_dept_cd == null){
	System.out.println(this.toString+" : chg_prv_dept_cd is null" );
}else{
	System.out.println(this.toString+" : chg_prv_dept_cd is "+chg_prv_dept_cd );
}
String chg_aft_dept_cd = req.getParameter("chg_aft_dept_cd");
if( chg_aft_dept_cd == null){
	System.out.println(this.toString+" : chg_aft_dept_cd is null" );
}else{
	System.out.println(this.toString+" : chg_aft_dept_cd is "+chg_aft_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
String chg_prv_dept_cd = Util.checkString(req.getParameter("chg_prv_dept_cd"));
String chg_aft_dept_cd = Util.checkString(req.getParameter("chg_aft_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String proc_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yymm")));
String chg_prv_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_prv_dept_cd")));
String chg_aft_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_aft_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setProc_yymm(proc_yymm);
dm.setChg_prv_dept_cd(chg_prv_dept_cd);
dm.setChg_aft_dept_cd(chg_aft_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 21:53:22 KST 2009 */