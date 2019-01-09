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


public class MC_BUDG_4100_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_emp_no;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String proc_yymm;
	public String chg_prv_dept_cd;
	public String chg_aft_dept_cd;
	public String chg_ratio;
	public String kind;

	public MC_BUDG_4100_IDM(){}
	public MC_BUDG_4100_IDM(String cmpy_cd, String incmg_emp_no, String incmg_pers, String incmg_pers_ipadd, String proc_yymm, String chg_prv_dept_cd, String chg_aft_dept_cd, String chg_ratio, String kind){
		this.cmpy_cd = cmpy_cd;
		this.incmg_emp_no = incmg_emp_no;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.proc_yymm = proc_yymm;
		this.chg_prv_dept_cd = chg_prv_dept_cd;
		this.chg_aft_dept_cd = chg_aft_dept_cd;
		this.chg_ratio = chg_ratio;
		this.kind = kind;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
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

	public void setChg_ratio(String chg_ratio){
		this.chg_ratio = chg_ratio;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
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

	public String getChg_ratio(){
		return this.chg_ratio;
	}

	public String getKind(){
		return this.kind;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4100_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4100_IDM dm = (MC_BUDG_4100_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_emp_no);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ipadd);
		cstmt.setString(7, dm.proc_yymm);
		cstmt.setString(8, dm.chg_prv_dept_cd);
		cstmt.setString(9, dm.chg_aft_dept_cd);
		cstmt.setString(10, dm.chg_ratio);
		cstmt.setString(11, dm.kind);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4100_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_emp_no = [" + getIncmg_emp_no() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("proc_yymm = [" + getProc_yymm() + "]");
		System.out.println("chg_prv_dept_cd = [" + getChg_prv_dept_cd() + "]");
		System.out.println("chg_aft_dept_cd = [" + getChg_aft_dept_cd() + "]");
		System.out.println("chg_ratio = [" + getChg_ratio() + "]");
		System.out.println("kind = [" + getKind() + "]");
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
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
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
String chg_ratio = req.getParameter("chg_ratio");
if( chg_ratio == null){
	System.out.println(this.toString+" : chg_ratio is null" );
}else{
	System.out.println(this.toString+" : chg_ratio is "+chg_ratio );
}
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
String chg_prv_dept_cd = Util.checkString(req.getParameter("chg_prv_dept_cd"));
String chg_aft_dept_cd = Util.checkString(req.getParameter("chg_aft_dept_cd"));
String chg_ratio = Util.checkString(req.getParameter("chg_ratio"));
String kind = Util.checkString(req.getParameter("kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String proc_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yymm")));
String chg_prv_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_prv_dept_cd")));
String chg_aft_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_aft_dept_cd")));
String chg_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_ratio")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setProc_yymm(proc_yymm);
dm.setChg_prv_dept_cd(chg_prv_dept_cd);
dm.setChg_aft_dept_cd(chg_aft_dept_cd);
dm.setChg_ratio(chg_ratio);
dm.setKind(kind);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 12:09:22 KST 2009 */