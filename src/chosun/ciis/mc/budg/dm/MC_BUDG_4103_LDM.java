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


public class MC_BUDG_4103_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chg_prv_dept_cd;
	public String budg_cd;
	public String proc_yymm;

	public MC_BUDG_4103_LDM(){}
	public MC_BUDG_4103_LDM(String cmpy_cd, String chg_prv_dept_cd, String budg_cd, String proc_yymm){
		this.cmpy_cd = cmpy_cd;
		this.chg_prv_dept_cd = chg_prv_dept_cd;
		this.budg_cd = budg_cd;
		this.proc_yymm = proc_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChg_prv_dept_cd(String chg_prv_dept_cd){
		this.chg_prv_dept_cd = chg_prv_dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setProc_yymm(String proc_yymm){
		this.proc_yymm = proc_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChg_prv_dept_cd(){
		return this.chg_prv_dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getProc_yymm(){
		return this.proc_yymm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4103_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4103_LDM dm = (MC_BUDG_4103_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chg_prv_dept_cd);
		cstmt.setString(5, dm.budg_cd);
		cstmt.setString(6, dm.proc_yymm);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4103_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("chg_prv_dept_cd = [" + getChg_prv_dept_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("proc_yymm = [" + getProc_yymm() + "]");
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
String chg_prv_dept_cd = req.getParameter("chg_prv_dept_cd");
if( chg_prv_dept_cd == null){
	System.out.println(this.toString+" : chg_prv_dept_cd is null" );
}else{
	System.out.println(this.toString+" : chg_prv_dept_cd is "+chg_prv_dept_cd );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String proc_yymm = req.getParameter("proc_yymm");
if( proc_yymm == null){
	System.out.println(this.toString+" : proc_yymm is null" );
}else{
	System.out.println(this.toString+" : proc_yymm is "+proc_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String chg_prv_dept_cd = Util.checkString(req.getParameter("chg_prv_dept_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chg_prv_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_prv_dept_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String proc_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChg_prv_dept_cd(chg_prv_dept_cd);
dm.setBudg_cd(budg_cd);
dm.setProc_yymm(proc_yymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 12:09:22 KST 2009 */