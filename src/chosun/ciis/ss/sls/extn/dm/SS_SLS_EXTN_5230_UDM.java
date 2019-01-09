/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5230_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_yn;
	public String proc_dt;
	public String draft_doc_no;
	public String draft_dept_cd;
	public String draft_expn_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SS_SLS_EXTN_5230_UDM(){}
	public SS_SLS_EXTN_5230_UDM(String cmpy_cd, String clos_yn, String proc_dt, String draft_doc_no, String draft_dept_cd, String draft_expn_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.clos_yn = clos_yn;
		this.proc_dt = proc_dt;
		this.draft_doc_no = draft_doc_no;
		this.draft_dept_cd = draft_dept_cd;
		this.draft_expn_amt = draft_expn_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setDraft_dept_cd(String draft_dept_cd){
		this.draft_dept_cd = draft_dept_cd;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getDraft_dept_cd(){
		return this.draft_dept_cd;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5230_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5230_UDM dm = (SS_SLS_EXTN_5230_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_yn);
		cstmt.setString(5, dm.proc_dt);
		cstmt.setString(6, dm.draft_doc_no);
		cstmt.setString(7, dm.draft_dept_cd);
		cstmt.setString(8, dm.draft_expn_amt);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5230_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("proc_dt = [" + getProc_dt() + "]");
		System.out.println("draft_doc_no = [" + getDraft_doc_no() + "]");
		System.out.println("draft_dept_cd = [" + getDraft_dept_cd() + "]");
		System.out.println("draft_expn_amt = [" + getDraft_expn_amt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String proc_dt = req.getParameter("proc_dt");
if( proc_dt == null){
	System.out.println(this.toString+" : proc_dt is null" );
}else{
	System.out.println(this.toString+" : proc_dt is "+proc_dt );
}
String draft_doc_no = req.getParameter("draft_doc_no");
if( draft_doc_no == null){
	System.out.println(this.toString+" : draft_doc_no is null" );
}else{
	System.out.println(this.toString+" : draft_doc_no is "+draft_doc_no );
}
String draft_dept_cd = req.getParameter("draft_dept_cd");
if( draft_dept_cd == null){
	System.out.println(this.toString+" : draft_dept_cd is null" );
}else{
	System.out.println(this.toString+" : draft_dept_cd is "+draft_dept_cd );
}
String draft_expn_amt = req.getParameter("draft_expn_amt");
if( draft_expn_amt == null){
	System.out.println(this.toString+" : draft_expn_amt is null" );
}else{
	System.out.println(this.toString+" : draft_expn_amt is "+draft_expn_amt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String proc_dt = Util.checkString(req.getParameter("proc_dt"));
String draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
String draft_dept_cd = Util.checkString(req.getParameter("draft_dept_cd"));
String draft_expn_amt = Util.checkString(req.getParameter("draft_expn_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
String draft_doc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_no")));
String draft_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_dept_cd")));
String draft_expn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_expn_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_yn(clos_yn);
dm.setProc_dt(proc_dt);
dm.setDraft_doc_no(draft_doc_no);
dm.setDraft_dept_cd(draft_dept_cd);
dm.setDraft_expn_amt(draft_expn_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 13 17:24:13 KST 2016 */