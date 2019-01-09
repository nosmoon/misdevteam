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


package chosun.ciis.hd.dalon.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.ds.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1403_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String session_emp_no;
	public String cost_obj_clsf;
	public String session_dept_cd;
	public String frdt;
	public String todt;
	public String out_in_plac;
	public String cost;
	public String proc_stat;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_DALON_1403_ADM(){}
	public HD_DALON_1403_ADM(String mode, String cmpy_cd, String session_emp_no, String cost_obj_clsf, String session_dept_cd, String frdt, String todt, String out_in_plac, String cost, String proc_stat, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.session_emp_no = session_emp_no;
		this.cost_obj_clsf = cost_obj_clsf;
		this.session_dept_cd = session_dept_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.out_in_plac = out_in_plac;
		this.cost = cost;
		this.proc_stat = proc_stat;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSession_emp_no(String session_emp_no){
		this.session_emp_no = session_emp_no;
	}

	public void setCost_obj_clsf(String cost_obj_clsf){
		this.cost_obj_clsf = cost_obj_clsf;
	}

	public void setSession_dept_cd(String session_dept_cd){
		this.session_dept_cd = session_dept_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setOut_in_plac(String out_in_plac){
		this.out_in_plac = out_in_plac;
	}

	public void setCost(String cost){
		this.cost = cost;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSession_emp_no(){
		return this.session_emp_no;
	}

	public String getCost_obj_clsf(){
		return this.cost_obj_clsf;
	}

	public String getSession_dept_cd(){
		return this.session_dept_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getOut_in_plac(){
		return this.out_in_plac;
	}

	public String getCost(){
		return this.cost;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DALON_1403_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_1403_ADM dm = (HD_DALON_1403_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.session_emp_no);
		cstmt.setString(6, dm.cost_obj_clsf);
		cstmt.setString(7, dm.session_dept_cd);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.out_in_plac);
		cstmt.setString(11, dm.cost);
		cstmt.setString(12, dm.proc_stat);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dalon.ds.HD_DALON_1403_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("session_emp_no = [" + getSession_emp_no() + "]");
		System.out.println("cost_obj_clsf = [" + getCost_obj_clsf() + "]");
		System.out.println("session_dept_cd = [" + getSession_dept_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("out_in_plac = [" + getOut_in_plac() + "]");
		System.out.println("cost = [" + getCost() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String session_emp_no = req.getParameter("session_emp_no");
if( session_emp_no == null){
	System.out.println(this.toString+" : session_emp_no is null" );
}else{
	System.out.println(this.toString+" : session_emp_no is "+session_emp_no );
}
String cost_obj_clsf = req.getParameter("cost_obj_clsf");
if( cost_obj_clsf == null){
	System.out.println(this.toString+" : cost_obj_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_obj_clsf is "+cost_obj_clsf );
}
String session_dept_cd = req.getParameter("session_dept_cd");
if( session_dept_cd == null){
	System.out.println(this.toString+" : session_dept_cd is null" );
}else{
	System.out.println(this.toString+" : session_dept_cd is "+session_dept_cd );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String out_in_plac = req.getParameter("out_in_plac");
if( out_in_plac == null){
	System.out.println(this.toString+" : out_in_plac is null" );
}else{
	System.out.println(this.toString+" : out_in_plac is "+out_in_plac );
}
String cost = req.getParameter("cost");
if( cost == null){
	System.out.println(this.toString+" : cost is null" );
}else{
	System.out.println(this.toString+" : cost is "+cost );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String session_emp_no = Util.checkString(req.getParameter("session_emp_no"));
String cost_obj_clsf = Util.checkString(req.getParameter("cost_obj_clsf"));
String session_dept_cd = Util.checkString(req.getParameter("session_dept_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String out_in_plac = Util.checkString(req.getParameter("out_in_plac"));
String cost = Util.checkString(req.getParameter("cost"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String session_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("session_emp_no")));
String cost_obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_obj_clsf")));
String session_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("session_dept_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String out_in_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("out_in_plac")));
String cost = Util.Uni2Ksc(Util.checkString(req.getParameter("cost")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setSession_emp_no(session_emp_no);
dm.setCost_obj_clsf(cost_obj_clsf);
dm.setSession_dept_cd(session_dept_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setOut_in_plac(out_in_plac);
dm.setCost(cost);
dm.setProc_stat(proc_stat);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 20 13:55:16 KST 2009 */