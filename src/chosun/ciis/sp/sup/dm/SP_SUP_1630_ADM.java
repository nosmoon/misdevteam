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


package chosun.ciis.sp.sup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.ds.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1630_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String seq;
	public String proc_pers;
	public String proc_dt;
	public String proc_stat;
	public String proc_cont;
	public String incmg_pers;

	public SP_SUP_1630_ADM(){}
	public SP_SUP_1630_ADM(String cmpy_cd, String seq, String proc_pers, String proc_dt, String proc_stat, String proc_cont, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.proc_pers = proc_pers;
		this.proc_dt = proc_dt;
		this.proc_stat = proc_stat;
		this.proc_cont = proc_cont;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setProc_pers(String proc_pers){
		this.proc_pers = proc_pers;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_cont(String proc_cont){
		this.proc_cont = proc_cont;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getProc_pers(){
		return this.proc_pers;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_cont(){
		return this.proc_cont;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SUP_1630_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SUP_1630_ADM dm = (SP_SUP_1630_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.seq);
		cstmt.setString(5, dm.proc_pers);
		cstmt.setString(6, dm.proc_dt);
		cstmt.setString(7, dm.proc_stat);
		cstmt.setString(8, dm.proc_cont);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sup.ds.SP_SUP_1630_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("proc_pers = [" + getProc_pers() + "]");
		System.out.println("proc_dt = [" + getProc_dt() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("proc_cont = [" + getProc_cont() + "]");
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String proc_pers = req.getParameter("proc_pers");
if( proc_pers == null){
	System.out.println(this.toString+" : proc_pers is null" );
}else{
	System.out.println(this.toString+" : proc_pers is "+proc_pers );
}
String proc_dt = req.getParameter("proc_dt");
if( proc_dt == null){
	System.out.println(this.toString+" : proc_dt is null" );
}else{
	System.out.println(this.toString+" : proc_dt is "+proc_dt );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String proc_cont = req.getParameter("proc_cont");
if( proc_cont == null){
	System.out.println(this.toString+" : proc_cont is null" );
}else{
	System.out.println(this.toString+" : proc_cont is "+proc_cont );
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
String seq = Util.checkString(req.getParameter("seq"));
String proc_pers = Util.checkString(req.getParameter("proc_pers"));
String proc_dt = Util.checkString(req.getParameter("proc_dt"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String proc_cont = Util.checkString(req.getParameter("proc_cont"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String proc_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_pers")));
String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String proc_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_cont")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setProc_pers(proc_pers);
dm.setProc_dt(proc_dt);
dm.setProc_stat(proc_stat);
dm.setProc_cont(proc_cont);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 05 19:11:23 KST 2012 */